package X;

import com.ss.android.ugc.aweme.experiment.QuickCommentV2Config;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0lGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351290lGh {
    public static final QuickCommentV2Config LIZ = new QuickCommentV2Config(true, 5, 7, 5, LSPassThroughRecordSizeConfig.DEFAULT, true, 3, 5, 7, 5, 5, false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1351300lGi());

    public static QuickCommentV2Config LIZ() {
        return (QuickCommentV2Config) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        return LJ() || LIZLLL();
    }

    public static boolean LIZJ() {
        QuickCommentV2Config quickCommentV2ConfigLIZ = LIZ();
        if (quickCommentV2ConfigLIZ != null) {
            return quickCommentV2ConfigLIZ.enableEstimatedScore;
        }
        return false;
    }

    public static boolean LIZLLL() {
        QuickCommentV2Config quickCommentV2ConfigLIZ;
        return C295380Bhw.LIZ() && (quickCommentV2ConfigLIZ = LIZ()) != null && quickCommentV2ConfigLIZ.feed0CommentEnable;
    }

    public static boolean LJ() {
        QuickCommentV2Config quickCommentV2ConfigLIZ;
        return C295380Bhw.LIZ() && (quickCommentV2ConfigLIZ = LIZ()) != null && quickCommentV2ConfigLIZ.socialCommentEnable;
    }
}
