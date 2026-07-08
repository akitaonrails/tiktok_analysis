package Y;

import X.C1C7U;
import X.C781890Uln;
import com.bytedance.android.livesdk.broadcast.interaction.function.BroadcastMessagePresenter;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS0S1100200_12 implements Runnable {
    public final int $t;
    public long j2;
    public long j3;
    public Object l1;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S1100200_12 aRunnableS0S1100200_12) {
        C781890Uln c781890Uln = (C781890Uln) aRunnableS0S1100200_12.l1;
        long j = aRunnableS0S1100200_12.j2;
        String str = aRunnableS0S1100200_12.s0;
        long j2 = aRunnableS0S1100200_12.j3;
        c781890Uln.getClass();
        C1C7U.LIZ("BroadcastMessagePresenter@22f6.popCaptchaDialog$1$onClose$1L");
        BroadcastMessagePresenter broadcastMessagePresenter = c781890Uln.LJ;
        if (!broadcastMessagePresenter.LLJ) {
            broadcastMessagePresenter.LIZLLL(new ARunnableS0S1100200_12(c781890Uln, j, str, j2, 1));
        }
        C1C7U.LIZIZ("BroadcastMessagePresenter@22f6.popCaptchaDialog$1$onClose$1L");
    }

    public static final void run$1(ARunnableS0S1100200_12 aRunnableS0S1100200_12) {
        C781890Uln c781890Uln = (C781890Uln) aRunnableS0S1100200_12.l1;
        long j = aRunnableS0S1100200_12.j2;
        String str = aRunnableS0S1100200_12.s0;
        c781890Uln.LJ.LIZJ(j, aRunnableS0S1100200_12.j3, str);
    }

    public ARunnableS0S1100200_12(C781890Uln c781890Uln, long j, String str, long j2, int i) {
        this.$t = i;
        this.l1 = c781890Uln;
        this.j2 = j;
        this.s0 = str;
        this.j3 = j2;
    }
}
