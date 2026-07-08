package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mention.service.IMentionDataService;
import com.ss.android.ugc.aweme.mention.service.MentionDataServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.054C, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C054C implements IMentionDataService {
    public static final C054C LIZIZ = new C054C();
    public final /* synthetic */ IMentionDataService LIZ;

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionDataService
    public final User LIZ(Intent intent) {
        return this.LIZ.LIZ(intent);
    }

    public C054C() {
        IMentionDataService iMentionDataService;
        Object objLIZ = C04TD.LIZ(IMentionDataService.class, false);
        if (objLIZ != null) {
            iMentionDataService = (IMentionDataService) objLIZ;
        } else {
            if (C04TD.g2 == null) {
                synchronized (IMentionDataService.class) {
                    if (C04TD.g2 == null) {
                        C04TD.g2 = new MentionDataServiceImpl();
                    }
                }
            }
            iMentionDataService = C04TD.g2;
        }
        this.LIZ = iMentionDataService;
    }
}
