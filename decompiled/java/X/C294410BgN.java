package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0BgN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C294410BgN {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5819));
    public static boolean LIZIZ = true;

    public static boolean LIZIZ() {
        return !C294290BgB.LIZJ() && ((Number) LIZ.getValue()).intValue() >= 1;
    }

    public static boolean LIZ(boolean z) {
        boolean z2 = LIZIZ;
        if (z2) {
            long j = Keva.getRepo("COMMENT_PHOTO_GUIDE").getLong("COMMENT_PHOTO_GUIDE_SHOW", 0L);
            if (j == 0) {
                if (z) {
                    LIZJ(false);
                }
                return true;
            }
            if (j == -1) {
                LIZIZ = false;
                return false;
            }
            if ((System.currentTimeMillis() - j) / 8.64E7d < 7.0d) {
                LIZIZ = false;
                return false;
            }
            if (z) {
                LIZJ(true);
            }
            return true;
        }
        return z2;
    }

    public static void LIZJ(boolean z) {
        LIZIZ = false;
        if (z) {
            Keva.getRepo("COMMENT_PHOTO_GUIDE").storeLong("COMMENT_PHOTO_GUIDE_SHOW", -1L);
        } else {
            Keva.getRepo("COMMENT_PHOTO_GUIDE").storeLong("COMMENT_PHOTO_GUIDE_SHOW", System.currentTimeMillis());
        }
    }
}
