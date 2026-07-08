package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0Mfr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574370Mfr implements Serializable {
    public int LL;
    public long LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public float LLILZLL = 1.0f;

    public final C574370Mfr clone() {
        return new C574370Mfr(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
    }

    public final float getSpeed() {
        return this.LLILZLL;
    }

    public final long getVideoDuration() {
        return this.LLILZ;
    }

    public final long getVideoEnd() {
        return this.LLILZIL;
    }

    public final int getVideoIndex() {
        return this.LL;
    }

    public final long getVideoRange() {
        return this.LLILLL;
    }

    public final long getVideoStart() {
        return this.LLILLJJLI;
    }

    public final void setSpeed(float f) {
        this.LLILZLL = f;
    }

    public final void setVideoDuration(long j) {
        this.LLILZ = j;
    }

    public final void setVideoEnd(long j) {
        this.LLILZIL = j;
    }

    public final void setVideoIndex(int i) {
        this.LL = i;
    }

    public final void setVideoRange(long j) {
        this.LLILLL = j;
    }

    public final void setVideoStart(long j) {
        this.LLILLJJLI = j;
    }

    public final void updateVideoStartTime(long j) {
        if (j > 0 && this.LLILLL > 0) {
            this.LLILLL = j;
            long j2 = 2;
            long j3 = (this.LLILZIL / j2) - (j / j2);
            if (j3 > 0) {
                this.LLILLJJLI = j3;
            } else {
                this.LLILLJJLI = 0L;
            }
            this.LLILZIL = this.LLILLJJLI + j;
        }
    }

    public final void resetVideoStartTime(long j, long j2) {
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZIL = j + j2;
    }

    public C574370Mfr(int i, long j, long j2, long j3) {
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
        this.LLILZIL = j + j2;
    }
}
