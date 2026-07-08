package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;

/* JADX INFO: renamed from: X.0KqT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529990KqT {
    public static boolean LIZ(TikTokMediaModel tikTokMediaModel, boolean z) {
        if (z && tikTokMediaModel.height / tikTokMediaModel.width < 1.3333334f) {
            return true;
        }
        return false;
    }
}
