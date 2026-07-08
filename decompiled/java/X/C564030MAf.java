package X;

import com.ss.android.ugc.aweme.creative.model.PostLandingModel;

/* JADX INFO: renamed from: X.0MAf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564030MAf {
    public static final boolean LIZ(PostLandingModel postLandingModel) {
        if (!postLandingModel.landingBack) {
            return false;
        }
        String str = postLandingModel.backUrl;
        if ((str != null && str.length() != 0) || !postLandingModel.includeDraft) {
            return false;
        }
        return true;
    }
}
