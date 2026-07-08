package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.portrait.model.GenerateStatus;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitMobService;
import kotlin.jvm.internal.AwS94S0201000_8;

/* JADX INFO: renamed from: X.0Lhr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550130Lhr implements IAIPortraitMobService {
    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitMobService
    public final void reportCreateButtonResult(CreativeModel creativeModel) {
        AIPortraitModel aIPortraitModel;
        AIPortraitContextModel aIPortraitContextModel;
        int i;
        if (creativeModel != null && (aIPortraitModel = creativeModel.aigcBusinessModel.aiPortraitModel) != null && (aIPortraitContextModel = aIPortraitModel.contextModel) != null) {
            if (aIPortraitContextModel.generatingModel.status == GenerateStatus.SUCCESS) {
                i = 1;
            } else {
                i = 0;
            }
            C548880Lfq c548880Lfq = C548880Lfq.LIZ;
            C2274991E2v c2274991E2v = C2274991E2v.LJIIIIZZ;
            AwS94S0201000_8 awS94S0201000_8 = new AwS94S0201000_8(creativeModel, i, aIPortraitContextModel, 6);
            c548880Lfq.getClass();
            C548880Lfq.LIZLLL(c2274991E2v, aIPortraitContextModel, awS94S0201000_8);
        }
    }
}
