package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;

/* JADX INFO: renamed from: X.0Klz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527210Klz {
    public static final boolean LIZ(MediaModel mediaModel) {
        if (mediaModel != null && mediaModel.LJIIJJI()) {
            C578570Mmd.LIZ.getClass();
            if (C578570Mmd.LIZ()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZIZ(TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel.startTime <= 0) {
            int i = tikTokMediaModel.endTime;
            if (i > 0 && i < tikTokMediaModel.duration) {
                return true;
            }
            return false;
        }
        return true;
    }
}
