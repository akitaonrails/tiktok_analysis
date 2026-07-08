package X;

import Y.ARunnableS113S0100000_13;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0W3E, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0W3E implements Runnable {
    public static final C822650WOx LLILZLL = new C822650WOx(3, 3, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(128), new ThreadPoolExecutor.DiscardOldestPolicy());
    public final int LL;
    public final Runnable LLILLJJLI;
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());
    public boolean LLILZ;
    public boolean LLILZIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("IntervalHandler@542.run");
        try {
            if (this.LLILZIL) {
                LLILZLL.execute(this.LLILLJJLI);
                this.LLILZIL = false;
            }
            C786410Ut5.LJLIIL(this.LL, this.LLILLL, this);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IntervalHandler@542.run");
    }

    public C0W3E(ARunnableS113S0100000_13 aRunnableS113S0100000_13, int i) {
        this.LLILLJJLI = aRunnableS113S0100000_13;
        this.LL = i;
    }
}
