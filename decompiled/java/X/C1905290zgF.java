package X;

import com.ss.android.ugc.aweme.litemode.LiteModePushConfig;

/* JADX INFO: renamed from: X.0zgF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905290zgF {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C07CN());

    public static boolean LIZIZ() {
        return (((Number) LIZ.getValue()).intValue() & 1) == 1;
    }

    public static boolean LIZ(int i) {
        if (!LIZIZ() || (((Number) LIZ.getValue()).intValue() & i) != i) {
            return false;
        }
        C1905300zgG.LIZ.getClass();
        if (!C1905300zgG.LIZJ()) {
            return false;
        }
        LiteModePushConfig liteModePushConfigLIZ = C1905280zgE.LIZ();
        if ((liteModePushConfigLIZ == null || liteModePushConfigLIZ.enablePreciseExp != 0) && C1833307Fz.LIZ() != 1) {
            return false;
        }
        return true;
    }
}
