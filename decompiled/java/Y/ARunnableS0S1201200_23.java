package Y;

import X.C1C7U;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerAsync;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS0S1201200_23 implements Runnable {
    public final int $t;
    public int i3;
    public long j4;
    public long j5;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S1201200_23 aRunnableS0S1201200_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S1201200_23.l1;
        String str = aRunnableS0S1201200_23.s0;
        long j = aRunnableS0S1201200_23.j4;
        long j2 = aRunnableS0S1201200_23.j5;
        int i = aRunnableS0S1201200_23.i3;
        byte[] bArr = (byte[]) aRunnableS0S1201200_23.l2;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.writeDataToFile$2L$1L");
        videoPreloadManagerAsync.LJJZZI().LJIIL(str, j, j2, i, bArr);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.writeDataToFile$2L$1L");
    }

    public static final void run$1(ARunnableS0S1201200_23 aRunnableS0S1201200_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S1201200_23.l1;
        String str = aRunnableS0S1201200_23.s0;
        long j = aRunnableS0S1201200_23.j4;
        long j2 = aRunnableS0S1201200_23.j5;
        int i = aRunnableS0S1201200_23.i3;
        byte[] bArr = (byte[]) aRunnableS0S1201200_23.l2;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.writeDataToFile$1L");
        videoPreloadManagerAsync.LJJZZI().LJIIL(str, j, j2, i, bArr);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.writeDataToFile$1L");
    }

    public static final void run$2(ARunnableS0S1201200_23 aRunnableS0S1201200_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S1201200_23.l1;
        String str = aRunnableS0S1201200_23.s0;
        long j = aRunnableS0S1201200_23.j4;
        long j2 = aRunnableS0S1201200_23.j5;
        int i = aRunnableS0S1201200_23.i3;
        byte[] bArr = (byte[]) aRunnableS0S1201200_23.l2;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.writeDataToFile$2L");
        videoPreloadManagerAsync.LJJLL(new ARunnableS0S1201200_23(videoPreloadManagerAsync, str, j, j2, i, bArr, 0));
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.writeDataToFile$2L");
    }

    public ARunnableS0S1201200_23(VideoPreloadManagerAsync videoPreloadManagerAsync, String str, long j, long j2, int i, byte[] bArr, int i2) {
        this.$t = i2;
        this.l1 = videoPreloadManagerAsync;
        this.s0 = str;
        this.j4 = j;
        this.j5 = j2;
        this.i3 = i;
        this.l2 = bArr;
    }
}
