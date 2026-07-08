package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0PtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659080PtC {
    public static boolean LIZ;
    public static int LIZIZ;

    static {
        int i = C07P0.LIZ() == 2 ? 1 : 0;
        LIZ = true;
        LIZIZ = i;
        LIZIZ = C0PPO.LIZIZ.LIZ.getInt("key_search_auto_play_sound", i);
    }

    public static void LJFF() {
        C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
        if (c2174741A9g.LJIILLIIL()) {
            if (c2174741A9g.LJIILJJIL()) {
                if (LIZIZ != 1) {
                    LIZJ(1);
                }
            } else if (LIZ) {
                LIZ = false;
                if (LIZIZ != 0) {
                    LIZJ(0);
                }
            }
        }
    }

    public static boolean LIZIZ() {
        LJFF();
        return LIZIZ == 1;
    }

    public static void LJ() {
        if (C663180Pzo.LJI() && C301290BrT.LIZ()) {
            LIZJ(1);
        }
    }

    public static void LIZJ(int i) {
        LIZIZ = i;
        C0PPO.LIZIZ.LIZ.storeInt("key_search_auto_play_sound", i);
    }

    public static boolean LIZLLL(Context context) {
        C0XF2 c0xf2LIZ;
        if ((C663180Pzo.LJI() && C301290BrT.LIZ() && C663180Pzo.LIZJ) || !C2367809Po.LIZ()) {
            return false;
        }
        if (((Number) C284150BBt.LIZ.getValue()).intValue() == 1) {
            return true;
        }
        C0XF2 c0xf2 = C0XJA.LIZ;
        if (c0xf2 != null && c0xf2 != C0XF2.NONE) {
            c0xf2LIZ = C0XJA.LIZ;
        } else {
            c0xf2LIZ = C0XF1.LIZ(context);
        }
        if (C0XF2.MOBILE_2G == c0xf2LIZ || C0XF2.MOBILE_3G == c0xf2LIZ || C0XF2.MOBILE_4G == c0xf2LIZ || C0XF2.MOBILE == c0xf2LIZ) {
            return false;
        }
        return true;
    }

    public static boolean LIZ(int i, int i2, Aweme aweme) {
        boolean zLJIIIIZZ = C10IT.LJIIIIZZ(aweme);
        if (!zLJIIIIZZ || (aweme != null && C1010120cOQ.LJJIFFI(aweme))) {
            if (i == 0) {
                if (i2 != 1) {
                    return false;
                }
                return true;
            }
            return LIZIZ();
        }
        return zLJIIIIZZ;
    }
}
