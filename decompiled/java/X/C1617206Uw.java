package X;

import com.ss.android.ugc.aweme.legacy.select.SocialCardServiceImp;
import com.ss.android.ugc.aweme.social.widget.card.ISocialCardService;

/* JADX INFO: renamed from: X.06Uw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1617206Uw implements ISocialCardService {
    public static final C1617206Uw LIZIZ = new C1617206Uw();
    public final /* synthetic */ ISocialCardService LIZ;

    @Override // com.ss.android.ugc.aweme.social.widget.card.ISocialCardService
    public final C06V1 LIZ(C1617506Uz c1617506Uz) {
        return this.LIZ.LIZ(c1617506Uz);
    }

    public C1617206Uw() {
        ISocialCardService iSocialCardService;
        Object objLIZ = C04TD.LIZ(ISocialCardService.class, false);
        if (objLIZ != null) {
            iSocialCardService = (ISocialCardService) objLIZ;
        } else {
            if (C04TD.I1 == null) {
                synchronized (ISocialCardService.class) {
                    if (C04TD.I1 == null) {
                        C04TD.I1 = new SocialCardServiceImp();
                    }
                }
            }
            iSocialCardService = C04TD.I1;
        }
        this.LIZ = iSocialCardService;
    }
}
