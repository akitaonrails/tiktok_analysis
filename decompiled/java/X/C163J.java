package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.163J, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C163J extends AbstractC1361510lXB<C207134163o, C1869610ykh> {
    public final EnumC207101162h LIZ;
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, C1869610ykh>> LIZIZ = new ConcurrentHashMap<>();
    public final C1760006us LIZJ;

    public C163J(EnumC207101162h enumC207101162h) {
        this.LIZ = enumC207101162h;
        this.LIZJ = C161N.LIZIZ.LLIIIILZ().get(enumC207101162h);
    }

    @Override // X.AbstractC1361510lXB
    public final InterfaceC1361520lXC LIZJ(C207134163o c207134163o) {
        ConcurrentHashMap<String, C1869610ykh> concurrentHashMapPutIfAbsent;
        ConcurrentHashMap<String, ConcurrentHashMap<String, C1869610ykh>> concurrentHashMap = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.name());
        sbLIZ.append(c207134163o.LIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, C1869610ykh> concurrentHashMap2 = concurrentHashMap.get(strLIZIZ);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZIZ, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        return new C1361450lX5(concurrentHashMap2);
    }

    @Override // X.AbstractC1361510lXB
    public final String LJ(C207134163o c207134163o) {
        String str = c207134163o.LIZJ;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.AbstractC1361510lXB
    public final boolean LIZ(C164B c164b, Object obj) {
        return Intrinsics.LJFF(((C1869610ykh) c164b).LIZ, ((C207134163o) obj).LIZLLL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (X.C123100dR.LIZ(r5.LIZJ) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    @Override // X.AbstractC1361510lXB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C164B LIZLLL(X.C207134163o r13, java.lang.String r14) {
        /*
            r12 = this;
            X.163o r13 = (X.C207134163o) r13
            X.06us r0 = r12.LIZJ
            r2 = 1
            if (r0 == 0) goto L90
            boolean r0 = r0.LJI
            if (r0 != r2) goto L90
            r0 = 1
        Lc:
            java.lang.String r3 = ", id="
            java.lang.String r4 = ", groupId="
            r9 = r14
            if (r0 != 0) goto L51
            X.164B r5 = super.LIZLLL(r13, r9)
            X.0ykh r5 = (X.C1869610ykh) r5
            if (r5 == 0) goto L32
            java.lang.String r0 = r13.LJ
            if (r0 == 0) goto L25
            int r0 = r0.length()
            if (r0 != 0) goto L29
        L25:
            java.lang.String r0 = r5.LIZIZ
            r13.LJ = r0
        L29:
            java.lang.String r0 = r5.LIZJ
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L32
        L31:
            return r5
        L32:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getCache: cache internal, not found, targetLang="
            r1.append(r0)
            r1.append(r9)
            r1.append(r4)
            java.lang.String r0 = r13.LIZIZ
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r13.LIZJ
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        L51:
            X.06us r1 = r12.LIZJ
            if (r1 == 0) goto L8e
            boolean r0 = r1.LJFF
            if (r0 != r2) goto L8e
        L59:
            r5 = 0
            if (r2 == 0) goto L31
            if (r1 == 0) goto L8c
            X.0sYq<java.lang.String, java.lang.String, java.lang.String, java.lang.String> r2 = r1.LIZ
            if (r2 == 0) goto L8c
            java.lang.String r1 = r13.LIZJ
            java.lang.String r0 = r13.LIZIZ
            java.lang.Object r8 = r2.invoke(r1, r0, r9)
            java.lang.String r8 = (java.lang.String) r8
        L6c:
            boolean r0 = X.C123100dR.LIZ(r8)
            if (r0 == 0) goto L93
            X.0ykh r5 = new X.0ykh
            java.lang.String r6 = r13.LIZLLL
            java.lang.String r7 = ""
            if (r6 != 0) goto L7b
            r6 = r7
        L7b:
            java.lang.String r0 = r13.LJ
            if (r0 != 0) goto L8a
            java.lang.String r0 = r13.LJII
            if (r0 == 0) goto L84
            r7 = r0
        L84:
            r10 = 0
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L8a:
            r7 = r0
            goto L84
        L8c:
            r8 = r5
            goto L6c
        L8e:
            r2 = 0
            goto L59
        L90:
            r0 = 0
            goto Lc
        L93:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getCache: cache external, not found, targetLang="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", translationType="
            r1.append(r0)
            X.162h r0 = r12.LIZ
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r13.LIZIZ
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r13.LIZJ
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163J.LIZLLL(java.lang.Object, java.lang.String):X.164B");
    }

    public static void LJI(C163J c163j, C207134163o c207134163o, String str, String str2, String str3, String str4, String str5, boolean z) {
        C1760006us c1760006us;
        InterfaceC1685420txc<String, String, String, String, String, Unit> interfaceC1685420txc;
        String str6 = str2;
        C1760006us c1760006us2 = c163j.LIZJ;
        if (c1760006us2 == null || !c1760006us2.LJI) {
            if (str6 == null) {
                if (str3 == null) {
                    str6 = "";
                } else {
                    str6 = str3;
                }
            }
            c163j.LJFF(new C1869610ykh(str, str6, str4, str5, z, null), c207134163o, str5);
        }
        C1760006us c1760006us3 = c163j.LIZJ;
        if (c1760006us3 != null && c1760006us3.LJFF && C123100dR.LIZ(str4) && (c1760006us = c163j.LIZJ) != null && (interfaceC1685420txc = c1760006us.LIZIZ) != null) {
            interfaceC1685420txc.invoke(c207134163o.LIZJ, c207134163o.LIZIZ, str3, str5, str4);
        }
    }
}
