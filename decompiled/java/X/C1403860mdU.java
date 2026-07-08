package X;

import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0mdU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403860mdU {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        if (C1428470nHB.LJLIIL(videoPublishEditModel) && !z) {
            return false;
        }
        if ((videoPublishEditModel.isPhotoMvMode() && !z) || C1428470nHB.LLIIIJ(videoPublishEditModel) || videoPublishEditModel.isDuet() || videoPublishEditModel.isStitchMode()) {
            return false;
        }
        if (videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay() && !C566870MLd.LIZ(videoPublishEditModel.creativeModel.onThisDayData)) {
            return false;
        }
        new Object() { // from class: X.0mdV
        }.getClass();
        if (!C0CHQ.LIZ().getAccountService().isLogin() || C0CHQ.LIZ().getAccountService().LIZ() || ((ICommerceToolsMusicService) ServiceManager.get().getService(ICommerceToolsMusicService.class)).yi2()) {
            return false;
        }
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_meme_sound2", true, false);
    }
}
