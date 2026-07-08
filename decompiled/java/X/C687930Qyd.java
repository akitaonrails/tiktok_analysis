package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Qyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687930Qyd {
    public static final C687930Qyd LIZ = new C687930Qyd();

    public static InterfaceC1870830ymf LIZJ() {
        C844470XAv.LIZ.getClass();
        return C1323690kYB.LIZ(C844470XAv.LIZ());
    }

    public static boolean LIZ(String str) {
        Object c098200Yq;
        String str2;
        Long lLJIILIIL;
        try {
            InterfaceC1870830ymf interfaceC1870830ymfLIZJ = LIZJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_TIME");
            c098200Yq = interfaceC1870830ymfLIZJ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        if (c098200Yq == null || !(c098200Yq instanceof String) || (str2 = (String) c098200Yq) == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) == null) {
            return false;
        }
        if (System.currentTimeMillis() < lLJIILIIL.longValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ(java.lang.String r3) {
        /*
            r2 = 0
            boolean r0 = LIZ(r3)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L19
            X.0ymf r0 = LIZJ()     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r1 = r0.LIZ(r3)     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r1 instanceof java.util.Map     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L19
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L1b
        L15:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L1b
            goto L27
        L19:
            r1 = r2
            goto L15
        L1b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L27:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L2e
            r2 = r1
        L2e:
            java.util.Map r2 = (java.util.Map) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C687930Qyd.LIZIZ(java.lang.String):java.util.Map");
    }

    public static void LIZLLL(long j, Long l, String str, Map map) {
        try {
            LIZJ().LJIIIIZZ(map, str);
            if (l != null) {
                InterfaceC1870830ymf interfaceC1870830ymfLIZJ = LIZJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("_TIME");
                interfaceC1870830ymfLIZJ.LJIIIIZZ(String.valueOf(j + l.longValue()), C2188811AlT.LIZIZ(sbLIZ));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
