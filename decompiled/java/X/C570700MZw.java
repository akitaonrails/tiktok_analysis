package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0MZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570700MZw {
    public final AwemeDraft LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final Activity LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final String LJFF;

    public final boolean LIZ() {
        AILivePhotoModel aILivePhotoModel;
        if (C1428470nHB.LLIIIILZ(this.LIZIZ)) {
            return !(this.LIZLLL == 3);
        }
        return C1444940nhk.LJI(this.LIZIZ.getCanvasVideoData()) || C1428470nHB.LLIIIJ(this.LIZIZ) || ((aILivePhotoModel = this.LIZIZ.getAILivePhotoModel()) != null && aILivePhotoModel.LJI()) || !(C577970Mlf.LIZ(this.LIZIZ) || C0CHQ.LIZ().getAccountService().LIZ());
    }

    public C570700MZw(AwemeDraft awemeDraft, VideoPublishEditModel videoPublishEditModel, Activity activity, int i, long j, String str) {
        this.LIZ = awemeDraft;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = activity;
        this.LIZLLL = i;
        this.LJ = j;
        this.LJFF = str;
    }
}
