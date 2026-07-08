package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.11Bl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19459911Bl implements Runnable {
    public final /* synthetic */ float LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ C19460011Bm LLILLL;

    public RunnableC19459911Bl(float f, VideoPublishEditModel videoPublishEditModel, C19460011Bm c19460011Bm) {
        this.LL = f;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = c19460011Bm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("DraftDownloadListener@fac2.onProgress$runnable$1");
        try {
            if (this.LL <= 100.0f && C19460911Bv.LJ(this.LLILLJJLI.getCreationId())) {
                C19460011Bm c19460011Bm = this.LLILLL;
                VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
                int i = (int) this.LL;
                C19460311Bp.LIZIZ = 2;
                C19460311Bp.LIZJ = i;
                C19460311Bp.LIZLLL = videoPublishEditModel;
                c19460011Bm.getClass();
                C1440005kM.LIZ(new C19460211Bo());
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DraftDownloadListener@fac2.onProgress$runnable$1");
    }
}
