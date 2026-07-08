package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;

/* JADX INFO: renamed from: X.0KnO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528080KnO {
    public static final boolean LIZ(TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel == null) {
            return true;
        }
        if (!C530690Krb.LIZIZ(tikTokMediaModel) && TextUtils.isEmpty(tikTokMediaModel.LJFF()) && TextUtils.isEmpty(tikTokMediaModel.thumbnail)) {
            return true;
        }
        return false;
    }
}
