package X;

import com.ss.android.ugc.aweme.experiment.SocialQuickCommentStrategyAdjustConfig;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351270lGf {
    public static final SocialQuickCommentStrategyAdjustConfig LIZ = new SocialQuickCommentStrategyAdjustConfig(false, 5, 10, 5, 10, 5.0d, 4, 50);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(251));

    public static SocialQuickCommentStrategyAdjustConfig LIZJ() {
        return (SocialQuickCommentStrategyAdjustConfig) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        SocialQuickCommentStrategyAdjustConfig socialQuickCommentStrategyAdjustConfigLIZJ;
        if (!LIZLLL()) {
            return false;
        }
        SocialQuickCommentStrategyAdjustConfig socialQuickCommentStrategyAdjustConfigLIZJ2 = LIZJ();
        return (socialQuickCommentStrategyAdjustConfigLIZJ2 != null && socialQuickCommentStrategyAdjustConfigLIZJ2.socialCommentShowStrategy == 3) || ((socialQuickCommentStrategyAdjustConfigLIZJ = LIZJ()) != null && socialQuickCommentStrategyAdjustConfigLIZJ.socialCommentShowStrategy == 4);
    }

    public static boolean LIZIZ() {
        SocialQuickCommentStrategyAdjustConfig socialQuickCommentStrategyAdjustConfigLIZJ;
        if (!LIZLLL()) {
            return false;
        }
        SocialQuickCommentStrategyAdjustConfig socialQuickCommentStrategyAdjustConfigLIZJ2 = LIZJ();
        return (socialQuickCommentStrategyAdjustConfigLIZJ2 != null && socialQuickCommentStrategyAdjustConfigLIZJ2.socialCommentShowStrategy == 2) || ((socialQuickCommentStrategyAdjustConfigLIZJ = LIZJ()) != null && socialQuickCommentStrategyAdjustConfigLIZJ.socialCommentShowStrategy == 4);
    }

    public static boolean LIZLLL() {
        SocialQuickCommentStrategyAdjustConfig socialQuickCommentStrategyAdjustConfigLIZJ;
        return C295380Bhw.LIZ() && C1351290lGh.LJ() && (socialQuickCommentStrategyAdjustConfigLIZJ = LIZJ()) != null && socialQuickCommentStrategyAdjustConfigLIZJ.socialCommentEnable;
    }
}
