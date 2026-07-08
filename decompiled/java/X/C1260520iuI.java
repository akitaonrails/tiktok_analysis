package X;

import com.ss.android.ugc.aweme.model.BannerDisplayInfo;
import com.ss.android.ugc.aweme.model.PhotoTopicBannerReadStatus;
import com.ss.android.ugc.aweme.service.IPhotoModeStrengthenIntentionService;
import com.ss.android.ugc.aweme.service.PhotoModeStrengthenIntentionServiceImpl;

/* JADX INFO: renamed from: X.0iuI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260520iuI implements IPhotoModeStrengthenIntentionService {
    public static final C1260520iuI LIZIZ = new C1260520iuI();
    public final /* synthetic */ IPhotoModeStrengthenIntentionService LIZ;

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeStrengthenIntentionService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeStrengthenIntentionService
    public final Object LIZIZ(InterfaceC1364105Vn<? super BannerDisplayInfo> interfaceC1364105Vn) {
        return this.LIZ.LIZIZ(interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeStrengthenIntentionService
    public final void LIZJ(PhotoTopicBannerReadStatus photoTopicBannerReadStatus, String str, Integer num, String str2, Long l) {
        this.LIZ.LIZJ(photoTopicBannerReadStatus, str, num, str2, l);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeStrengthenIntentionService
    public final String LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeStrengthenIntentionService
    public final void LJ() {
        this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoModeStrengthenIntentionService
    public final boolean LJFF() {
        return this.LIZ.LJFF();
    }

    public C1260520iuI() {
        IPhotoModeStrengthenIntentionService iPhotoModeStrengthenIntentionService;
        Object objLIZ = C04TD.LIZ(IPhotoModeStrengthenIntentionService.class, false);
        if (objLIZ != null) {
            iPhotoModeStrengthenIntentionService = (IPhotoModeStrengthenIntentionService) objLIZ;
        } else {
            if (C04TD.g4 == null) {
                synchronized (IPhotoModeStrengthenIntentionService.class) {
                    if (C04TD.g4 == null) {
                        C04TD.g4 = new PhotoModeStrengthenIntentionServiceImpl();
                    }
                }
            }
            iPhotoModeStrengthenIntentionService = C04TD.g4;
        }
        this.LIZ = iPhotoModeStrengthenIntentionService;
    }
}
