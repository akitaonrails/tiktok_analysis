package X;

import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0nrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450870nrJ {
    public static int LIZ;
    public static int LIZIZ;
    public static float LIZJ;
    public static int LIZLLL;
    public static int LJ;
    public static int LJFF;
    public static Integer LJI;
    public static Integer LJII;
    public static float LJIIIIZZ;
    public static float LJIIIZ;
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(602));
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(603));
    public static final C01GW LJIIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(601));
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(371));
    public static float LJIILJJIL;

    public static int LIZIZ() {
        return ((Number) LJIIJ.getValue()).intValue();
    }

    public static float LIZJ() {
        return ((Number) LJIILIIL.getValue()).floatValue();
    }

    public static int LJFF() {
        return ((Number) LJIIL.getValue()).intValue();
    }

    public static int LJI() {
        return ((Number) LJIIJJI.getValue()).intValue();
    }

    public static FrameLayout.LayoutParams LJII() {
        C844470XAv.LIZ.getClass();
        int fullScreenHeight = ScreenUtils.getFullScreenHeight(C844470XAv.LIZ());
        int screenWidth = ScreenUtils.getScreenWidth(C844470XAv.LIZ());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        float f = screenWidth;
        if (f / (fullScreenHeight - C11VU.LIZ(58.0f)) <= 0.5625f) {
            layoutParams.height = (fullScreenHeight - C0LEO.LIZIZ()) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(C844470XAv.LIZ());
            layoutParams.width = screenWidth;
            return layoutParams;
        }
        int i = (int) (f / 0.5625f);
        if (i <= fullScreenHeight) {
            fullScreenHeight = i;
        }
        layoutParams.height = fullScreenHeight;
        layoutParams.width = screenWidth;
        return layoutParams;
    }

    public static float LJIIIZ() {
        float f = LIZJ;
        if (f > 0.0f) {
            return f;
        }
        C844470XAv.LIZ.getClass();
        int fullScreenHeight = ScreenUtils.getFullScreenHeight(C844470XAv.LIZ());
        return (ScreenUtils.getScreenWidth(C844470XAv.LIZ()) * 1.0f) / ((fullScreenHeight - C0LEO.LIZIZ()) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(C844470XAv.LIZ()));
    }

    public static int LJ() {
        int[] videoSize;
        int iMin;
        int iLIZIZ = LIZIZ();
        if (!C297700Blg.LIZ()) {
            return iLIZIZ;
        }
        int iVideoSizeIndex = InterfaceC1442520ndq.LJIIIZ.videoSizeIndex();
        List<String> listLIZ = C07MM.LIZ();
        return (listLIZ == null || listLIZ.isEmpty() || iVideoSizeIndex < 0 || iVideoSizeIndex >= listLIZ.size() || (videoSize = AVSettingsWrapper.getVideoSize((String) ListProtector.get(listLIZ, iVideoSizeIndex))) == null || videoSize.length < 2 || (iMin = Math.min(videoSize[0], videoSize[1])) <= 0) ? iLIZIZ : Math.min(iLIZIZ, iMin);
    }

    public static boolean LJIIJ(float f) {
        if (C1441960ncw.LIZ()) {
            return false;
        }
        if (LJIILJJIL <= 0.45f) {
            if (f >= 0.5294118f && f > LIZJ) {
                return false;
            }
            return true;
        }
        if (f > LIZJ() && f > LIZJ) {
            return false;
        }
        return true;
    }

    public static Pair LIZ(int i, int i2) {
        int iLJ = LJ();
        if (iLJ <= 0) {
            return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        }
        int iMin = Math.min(i, i2);
        if (iMin <= iLJ) {
            return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        }
        float f = iLJ / iMin;
        return new Pair(Integer.valueOf((int) (i * f)), Integer.valueOf((int) (i2 * f)));
    }

    public static Pair LJIIIIZZ(int i, int i2) {
        if (i == 0) {
            i = LIZIZ;
            i2 = LIZ;
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void LJIIJJI(int i, int i2) {
        float f;
        LIZ = i2;
        LIZIZ = i;
        LIZJ = i / i2;
        if (LJIIJ(LJIIIIZZ)) {
            f = LIZJ;
        } else {
            f = LJIIIIZZ;
        }
        LJIIIZ = f;
    }
}
