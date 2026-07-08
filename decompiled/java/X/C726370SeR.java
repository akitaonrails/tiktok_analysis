package X;

import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeFeedVodTagServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.ILandscapeFeedVodTagService;

/* JADX INFO: renamed from: X.0SeR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726370SeR implements ILandscapeFeedVodTagService {
    public static final C726370SeR LIZIZ = new C726370SeR();
    public final /* synthetic */ ILandscapeFeedVodTagService LIZ;

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedVodTagService
    public final String LIZ(Aweme aweme) {
        return this.LIZ.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedVodTagService
    public final String LIZIZ(Aweme aweme) {
        return this.LIZ.LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedVodTagService
    public final String LIZJ(Aweme aweme) {
        return this.LIZ.LIZJ(aweme);
    }

    public C726370SeR() {
        ILandscapeFeedVodTagService iLandscapeFeedVodTagService;
        Object objLIZ = C04TD.LIZ(ILandscapeFeedVodTagService.class, false);
        if (objLIZ != null) {
            iLandscapeFeedVodTagService = (ILandscapeFeedVodTagService) objLIZ;
        } else {
            if (C04TD.x0 == null) {
                synchronized (ILandscapeFeedVodTagService.class) {
                    if (C04TD.x0 == null) {
                        C04TD.x0 = new LandscapeFeedVodTagServiceImpl();
                    }
                }
            }
            iLandscapeFeedVodTagService = C04TD.x0;
        }
        this.LIZ = iLandscapeFeedVodTagService;
    }
}
