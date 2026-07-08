package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.0sAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616660sAi {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ() {
        C1909520zn4.LIZIZ("commentSplit", "isOptSplitContainer");
        C20594415iI.LIZ.getClass();
        if (!C20594415iI.LIZ(null)) {
            C1909520zn4.LIZIZ("commentSplit", "isOptSplitContainer LandscapeExperiment no");
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("comment_split_ab_override_foldable", false)) {
            C1909520zn4.LIZIZ("commentSplit", "isOptSplitContainer override for samsung zfold 8. true");
            return true;
        }
        boolean zLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isOptSplitContainer CommentSplitExperiment support：");
        sbLIZ.append(zLIZLLL);
        C1909520zn4.LIZIZ("commentSplit", C2188811AlT.LIZIZ(sbLIZ));
        return zLIZLLL;
    }

    public static boolean LIZLLL() {
        return ((Boolean) C0AVL.LIZ.getValue()).booleanValue();
    }

    public static boolean LIZ(Activity activity, Configuration configuration) {
        Resources resources;
        Configuration configuration2;
        int i;
        C1909520zn4.LIZIZ("commentSplit", "isOptCommentSplit");
        C20593115i5.LIZ.getClass();
        boolean z = false;
        if (!C20593115i5.LJIIL(activity)) {
            C1909520zn4.LIZIZ("commentSplit", "isOptCommentSplit TabletUtils.isSupportLandscape no");
            return false;
        }
        if (activity == null || ((Build.VERSION.SDK_INT < 24 || !activity.isInMultiWindowMode()) && (Build.VERSION.SDK_INT < 24 || !activity.isInPictureInPictureMode()))) {
            if (configuration != null) {
                i = configuration.orientation;
            } else if (activity != null && (resources = activity.getResources()) != null && (configuration2 = resources.getConfiguration()) != null) {
                i = configuration2.orientation;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf != null && numValueOf.intValue() == 2) {
                C20594415iI.LIZ.getClass();
                if (!C20594415iI.LIZ(null)) {
                    C1909520zn4.LIZIZ("commentSplit", "isOptCommentSplit LandscapeExperiment no");
                    return false;
                }
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("comment_split_ab_override_foldable", false)) {
                    if (C20593115i5.LIZIZ(activity) == 1) {
                        z = true;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("isOptCommentSplit override for samsung zfold 8. Device in unfolded landscape ");
                    sbLIZ.append(z);
                    C1909520zn4.LIZIZ("commentSplit", C2188811AlT.LIZIZ(sbLIZ));
                    return z;
                }
                if (C1389340mG4.LIZJ(activity, configuration).LIZIZ() >= 800) {
                    boolean zLIZLLL = LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("isOptCommentSplit CommentSplitExperiment canSplit：");
                    sbLIZ2.append(zLIZLLL);
                    C1909520zn4.LIZIZ("commentSplit", C2188811AlT.LIZIZ(sbLIZ2));
                    return zLIZLLL;
                }
                C1909520zn4.LIZIZ("commentSplit", "isOptCommentSplit canCommentSplit no");
                return false;
            }
        }
        C1909520zn4.LIZIZ("commentSplit", "isOptCommentSplit is in split/popout/not landscape no");
        return false;
    }

    public static void LIZIZ(Activity activity, Configuration configuration) {
        C1909520zn4.LIZIZ("commentSplit", "isOptCommentSplitWithOpenDefault");
        if (!LIZ(activity, configuration)) {
            C1909520zn4.LIZIZ("commentSplit", "isOptCommentSplitWithOpenDefault isOptCommentSplit no");
        }
    }
}
