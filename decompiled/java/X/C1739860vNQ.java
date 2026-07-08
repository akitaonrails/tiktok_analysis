package X;

import com.google.gson.n;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0vNQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739860vNQ {
    public final String LIZ;
    public boolean LIZJ;
    public AnonymousClass0956 LIZLLL;
    public final ConcurrentHashMap<String, C1739880vNS> LIZIZ = new ConcurrentHashMap<>();
    public final Map<String, String> LJ = new LinkedHashMap();
    public final Map<String, n> LJFF = new LinkedHashMap();
    public final ConcurrentHashMap<String, Object> LJI = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r4 = this;
            X.0956 r0 = r4.LIZLLL
            r3 = 0
            if (r0 == 0) goto L36
            boolean r1 = r0.isActive()
            r0 = 1
            if (r1 != r0) goto L36
        Lc:
            r2 = 0
            if (r0 == 0) goto L16
            X.0956 r0 = r4.LIZLLL
            if (r0 == 0) goto L16
            r0.LIZIZ(r2)
        L16:
            r4.LIZJ = r3
            X.0vNk r0 = X.C1740060vNk.LIZ
            java.lang.String r1 = r4.LIZ
            r0.getClass()
            java.lang.String r0 = "native_prefetch"
            X.C1740060vNk.LIZLLL(r1, r2, r0, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.LJ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r0.clear()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r4.LJI
            r0.clear()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0vNS> r0 = r4.LIZIZ
            r0.clear()
            return
        L36:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1739860vNQ.LIZ():void");
    }

    public C1739860vNQ(String str) {
        this.LIZ = str;
    }

    public final C1739920vNW LIZIZ(String str) {
        if (this.LIZJ) {
            return new C1739920vNW(EnumC1739900vNU.EXECUTE_ERROR.getValue());
        }
        C1739880vNS c1739880vNS = this.LIZIZ.get(str);
        if (c1739880vNS != null) {
            return c1739880vNS.LIZ;
        }
        return null;
    }

    public final void LIZJ(String str, boolean z, boolean z2) {
        EnumC1739900vNU enumC1739900vNU;
        String str2 = str;
        this.LIZJ = true;
        if (z) {
            enumC1739900vNU = EnumC1739900vNU.REQUEST_TIMEOUT;
        } else {
            enumC1739900vNU = EnumC1739900vNU.EXECUTE_ERROR;
        }
        C1739920vNW c1739920vNW = new C1739920vNW(enumC1739900vNU.getValue());
        for (Map.Entry<String, C1739880vNS> entry : this.LIZIZ.entrySet()) {
            entry.getValue().LIZ = c1739920vNW;
            InterfaceC1739890vNT interfaceC1739890vNT = entry.getValue().LIZIZ;
            if (interfaceC1739890vNT != null) {
                interfaceC1739890vNT.LIZ(c1739920vNW);
            }
        }
        C1740060vNk c1740060vNk = C1740060vNk.LIZ;
        String str3 = this.LIZ;
        c1740060vNk.getClass();
        C1740060vNk.LJFF(str3, c1739920vNW);
        if (z2) {
            C1739950vNZ c1739950vNZ = C1739950vNZ.LIZ;
            String str4 = this.LIZ;
            if (str2 == null) {
                str2 = "unknown";
            }
            C1739950vNZ.LIZIZ(c1739950vNZ, null, "fail", str4, null, null, str2, null, null, null, null, this.LJI, 985);
        }
    }
}
