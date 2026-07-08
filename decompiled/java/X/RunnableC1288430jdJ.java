package X;

import com.lynx.animax.AnimaXPlayer;
import com.lynx.animax.util.AnimaXLog;

/* JADX INFO: renamed from: X.0jdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class RunnableC1288430jdJ implements Runnable {
    public long LL;
    public volatile boolean LLILLJJLI;

    public final void LIZ() {
        if (this.LL == 0 || this.LLILLJJLI) {
            return;
        }
        AnimaXLog.LIZIZ("AnimaXPlayer", "Call nativeDestroy.");
        AnimaXPlayer.nativeDestroy(this.LL);
        this.LLILLJJLI = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AnimaXPlayer$CleanupOnUiThread@f334.run");
        try {
            if (this.LL != 0) {
                if (!this.LLILLJJLI) {
                    LIZ();
                }
                AnimaXPlayer.nativeDeletePtr(this.LL);
                this.LL = 0L;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnimaXPlayer$CleanupOnUiThread@f334.run");
    }

    public RunnableC1288430jdJ(long j) {
        this.LL = j;
    }
}
