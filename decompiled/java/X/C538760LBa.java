package X;

import kotlin.text.u;

/* JADX INFO: renamed from: X.0LBa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538760LBa {
    public static final boolean LIZ(String str) {
        if (str != null && u.LJJIIJZLJL(str, "http", false)) {
            return false;
        }
        return C570490MZb.LJ(str);
    }

    public static final C11JN LIZIZ(C11NZ c11nz, final String str, final String str2) {
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = -1L;
        return c11nz.LJJIJIL(new C516201zk(c238400w2, 149)).LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.0LBY
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
                String str3 = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(" done - cost:");
                sbLIZ.append(System.currentTimeMillis() - c238400w2.element);
                sbLIZ.append("ms");
                C201955140j.LIZLLL(c552700Lm0, str3, C2188811AlT.LIZIZ(sbLIZ));
            }
        });
    }

    public static final C11L6 LIZJ(C11JP c11jp, final String str, final String str2) {
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = -1L;
        return c11jp.LJIILJJIL(new C516201zk(c238400w2, 150)).LJIILL(new C09JN() { // from class: X.0LBZ
            @Override // X.C09JN
            public final void accept(T t) {
                C1C7U.LIZ("AlbumAiUtilsKt@ffbf.logPerformance$4");
                C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
                String str3 = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(" done - cost:");
                sbLIZ.append(System.currentTimeMillis() - c238400w2.element);
                sbLIZ.append("ms");
                C201955140j.LIZLLL(c552700Lm0, str3, C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("AlbumAiUtilsKt@ffbf.logPerformance$4");
            }
        });
    }
}
