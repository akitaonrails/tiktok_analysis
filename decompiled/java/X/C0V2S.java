package X;

import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V2S, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V2S implements Choreographer.FrameCallback {
    public final int LL;
    public boolean LLILLJJLI;
    public long LLILLL;
    public long LLILZ;

    public C0V2S(int i) {
        this.LL = i;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z;
        if (!this.LLILLJJLI) {
            return;
        }
        C786410Ut5.v2().removeFrameCallback(this);
        C786410Ut5.v2().postFrameCallback(this);
        try {
            if (this.LL > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.LLILLL <= 0) {
                    this.LLILLL = jCurrentTimeMillis;
                }
                long j2 = this.LLILZ + 1;
                this.LLILZ = j2;
                long j3 = jCurrentTimeMillis - this.LLILLL;
                if (j3 >= this.LL) {
                    if (((int) ((j2 * 1000.0f) / j3)) > 60) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C0VTH.LIZ(true, z);
                    this.LLILLJJLI = false;
                    C786410Ut5.v2().removeFrameCallback(this);
                    return;
                }
                return;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (this.LLILLL <= 0) {
                this.LLILLL = jCurrentTimeMillis2;
            }
            this.LLILZ++;
            if (jCurrentTimeMillis2 - this.LLILLL >= 1000) {
                this.LLILZ = 0L;
                this.LLILLL = jCurrentTimeMillis2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
