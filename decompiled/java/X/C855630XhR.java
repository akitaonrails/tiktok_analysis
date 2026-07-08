package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.PhotoTopicBannerReadStatus;
import com.ss.android.ugc.aweme.service.IPhotoTopicBannerService;

/* JADX INFO: renamed from: X.0XhR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C855630XhR implements IPhotoTopicBannerService {
    public static final C855630XhR LIZIZ = new C855630XhR();
    public final /* synthetic */ IPhotoTopicBannerService LIZ = (IPhotoTopicBannerService) ServiceManager.get().getService(IPhotoTopicBannerService.class);

    @Override // com.ss.android.ugc.aweme.service.IPhotoTopicBannerService
    public final void LIZ(PhotoTopicBannerReadStatus photoTopicBannerReadStatus) {
        this.LIZ.LIZ(photoTopicBannerReadStatus);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoTopicBannerService
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }
}
