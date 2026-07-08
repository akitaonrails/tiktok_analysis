package X;

import Y.ACallableS0S1710000_23;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Mxr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585530Mxr {
    public static final C603840NmI<String, Long> LIZ = new C603840NmI<>(20);
    public static final C603840NmI<String, Boolean> LIZIZ = new C603840NmI<>(20);
    public static final C603840NmI<String, Integer> LIZJ = new C603840NmI<>(20);
    public static final long LIZLLL = -1;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069 A[PHI: r15
      0x0069: PHI (r15v1 int) = (r15v0 int), (r15v3 int), (r15v3 int) binds: [B:27:0x0066, B:19:0x0043, B:21:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(final X.InterfaceC585470Mxl r21, final X.InterfaceC1481780ofA r22, final X.InterfaceC1481730of5 r23, final org.json.JSONObject r24, final java.lang.String r25, final java.util.HashMap<java.lang.String, java.lang.Object> r26, final X.C1480430ocz r27) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C585530Mxr.LIZIZ(X.0Mxl, X.0ofA, X.0of5, org.json.JSONObject, java.lang.String, java.util.HashMap, X.0ocz):void");
    }

    public static void LIZ(InterfaceC585470Mxl interfaceC585470Mxl, InterfaceC1481780ofA interfaceC1481780ofA, InterfaceC1481730of5 interfaceC1481730of5, String str, boolean z, C1480430ocz c1480430ocz, boolean z2, HashMap<String, Object> map) {
        Long l = LIZ.get(str);
        EnumC585580Mxw enumC585580MxwLIZJ = C1481310oeP.LIZJ(interfaceC585470Mxl);
        SimVideoUrlModel simVideoUrlModelLJIIL = C1481310oeP.LJIIL(interfaceC1481730of5, str);
        C603840NmI<String, Integer> c603840NmI = LIZJ;
        Integer num = c603840NmI.get(str);
        if (num != null && z2) {
            if (z) {
                if (num.intValue() >= 2 && num.intValue() != 3) {
                    c603840NmI.put(str, 5);
                }
            } else if (num.intValue() == 5) {
                c603840NmI.put(str, 2);
            }
        }
        C1481610oet.LIZ().reportVideoBuffering(str, z2, z, new ACallableS0S1710000_23(interfaceC1481780ofA, simVideoUrlModelLJIIL, interfaceC1481730of5, z2, enumC585580MxwLIZJ, str, l, c1480430ocz, interfaceC585470Mxl, map, 0), new InterfaceC1482510ogL() { // from class: X.0Mxs
            @Override // X.InterfaceC1482510ogL
            public final void LIZ(int i, String str2, boolean z3, long j, long j2) {
            }
        });
    }
}
