package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;

/* JADX INFO: renamed from: X.0MOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C567840MOw {
    public static boolean LIZ(SocMediaResource socMediaResource) {
        if (C0BNT.LIZIZ) {
            TikTokMediaModel tikTokMediaModel = socMediaResource.tiktokMediaModel;
            return C567860MOy.LIZIZ(tikTokMediaModel.width, tikTokMediaModel.height);
        }
        TikTokMediaModel tikTokMediaModel2 = socMediaResource.tiktokMediaModel;
        if (tikTokMediaModel2.height / tikTokMediaModel2.width < 1.3333334f) {
            return true;
        }
        return false;
    }
}
