package X;

import com.ss.android.ugc.aweme.experiment.PhotoModeNewFeedConfigModel;
import com.ss.android.ugc.aweme.experiment.PhotoModePhotoBackgroundGradientConfig;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0SKM, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SKM {
    public static final PhotoModeNewFeedConfigModel LIZ = new PhotoModeNewFeedConfigModel(false, false, true, true, true, 1500, true, true, -1.0f, true, true, true, 28, 23, 30, 0, C1697810uHb.LJIIJJI("homepage_hot", "personal_homepage", "publish_preview"), null, false, false, 0, "#FFD4D4D4", new PhotoModePhotoBackgroundGradientConfig(true, true, 0, 1.0f, 0.0f, 0.0f, 0.0f, 0.01f, 0.87f, 1.0f, 0.0f));
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.PUBLICATION;
        LIZIZ = C452501pT.LIZ(enumC452301pR, AFwS198S0000000_11.get$arr$(65));
        LIZJ = C452501pT.LIZ(enumC452301pR, AFwS198S0000000_11.get$arr$(64));
    }

    public static PhotoModeNewFeedConfigModel LJIIIIZZ() {
        return (PhotoModeNewFeedConfigModel) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        return LJIIIIZZ().enable;
    }

    public static boolean LIZIZ() {
        if (LIZ()) {
            return LJIIIIZZ().enableNewFeedLayoutStyle || LJIIIIZZ().enableScaling;
        }
        return false;
    }

    public static boolean LIZJ() {
        return !LJIIIIZZ().enable && LJIIIIZZ().enablePerf && LJIIIIZZ().backgroundColorStyle == 1;
    }

    public static boolean LIZLLL() {
        return LIZ() && LJIIIIZZ().enableScaling;
    }

    public static boolean LJ() {
        return LJFF() || LJI();
    }

    public static boolean LJFF() {
        return LIZLLL() && LJIIIIZZ().backgroundColorStyle == 1;
    }

    public static boolean LJI() {
        return LIZLLL() && LJIIIIZZ().backgroundColorStyle == 2;
    }

    public static boolean LJII() {
        return LIZLLL() && !C294910BhB.LIZ();
    }

    public static boolean LJIIIZ(String str) {
        List<String> list;
        if (!LIZ() || (list = LJIIIIZZ().clientFilterComponentScene) == null || !list.contains(str)) {
            return false;
        }
        return true;
    }
}
