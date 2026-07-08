package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.mention.service.IMentionViewService;
import com.ss.android.ugc.aweme.mention.service.MentionViewServiceImpl;

/* JADX INFO: renamed from: X.04cQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1136004cQ implements IMentionViewService {
    public static final C1136004cQ LIZIZ = new C1136004cQ();
    public final /* synthetic */ IMentionViewService LIZ;

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionViewService
    public final void LIZ(Fragment fragment) {
        this.LIZ.LIZ(fragment);
    }

    public C1136004cQ() {
        IMentionViewService iMentionViewService;
        Object objLIZ = C04TD.LIZ(IMentionViewService.class, false);
        if (objLIZ != null) {
            iMentionViewService = (IMentionViewService) objLIZ;
        } else {
            if (C04TD.i2 == null) {
                synchronized (IMentionViewService.class) {
                    if (C04TD.i2 == null) {
                        C04TD.i2 = new MentionViewServiceImpl();
                    }
                }
            }
            iMentionViewService = C04TD.i2;
        }
        this.LIZ = iMentionViewService;
    }
}
