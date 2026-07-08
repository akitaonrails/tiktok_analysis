package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;

/* JADX INFO: renamed from: X.12Uc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19763212Uc {
    public long LIZ;
    public long LIZIZ;
    public int LIZJ;
    public float LIZLLL;

    public final void LIZIZ() {
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LIZJ = 0;
        this.LIZLLL = 1.0f;
    }

    public C19763212Uc(VideoSegment videoSegment) {
        this.LIZLLL = 1.0f;
        this.LIZ = videoSegment.LJII();
        this.LIZIZ = videoSegment.LIZLLL();
        this.LIZJ = videoSegment.rotate;
        this.LIZLLL = videoSegment.LJI();
        if (videoSegment.LJIIIIZZ()) {
            this.LIZ = videoSegment.stickPointVideoSegment.getVideoStart();
            this.LIZIZ = videoSegment.stickPointVideoSegment.getVideoEnd();
        }
    }

    public final void LIZ(VideoSegment videoSegment) {
        this.LIZ = videoSegment.LJII();
        this.LIZIZ = videoSegment.LIZLLL();
        this.LIZJ = videoSegment.rotate;
        this.LIZLLL = videoSegment.LJI();
        if (videoSegment.LJIIIIZZ()) {
            this.LIZ = videoSegment.stickPointVideoSegment.getVideoStart();
            this.LIZIZ = videoSegment.stickPointVideoSegment.getVideoEnd();
        }
    }
}
