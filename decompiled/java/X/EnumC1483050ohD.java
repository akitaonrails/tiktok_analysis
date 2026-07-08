package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ohD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1483050ohD {
    public static final EnumC1483050ohD INS;
    public static final /* synthetic */ EnumC1483050ohD[] LLILLL;
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());
    public final ScheduledExecutorService LLILLJJLI = C807400Vlq.LJFF(new ThreadFactory() { // from class: X.0ohF
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new BPEAThread(runnable, "TTKStrategyCenter");
        }
    });

    static {
        EnumC1483050ohD enumC1483050ohD = new EnumC1483050ohD();
        INS = enumC1483050ohD;
        LLILLL = new EnumC1483050ohD[]{enumC1483050ohD};
    }

    public static EnumC1483050ohD[] values() {
        return (EnumC1483050ohD[]) LLILLL.clone();
    }

    public void init() {
        post(new Runnable() { // from class: X.0btb
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("MsgDispatcher@dd45.prepareExecutor$1");
                C1C7U.LIZIZ("MsgDispatcher@dd45.prepareExecutor$1");
            }
        });
    }

    public static EnumC1483050ohD valueOf(String str) {
        return (EnumC1483050ohD) C08FF.LIZ(EnumC1483050ohD.class, str);
    }

    public void post(Runnable runnable) {
        this.LLILLJJLI.execute(runnable);
    }

    public void postOnMain(Runnable runnable) {
        C786410Ut5.LJJZZIII(this.LL, runnable);
    }

    public void postOnMainDelay(Runnable runnable, int i) {
        C786410Ut5.LJLIIL(i, this.LL, runnable);
    }

    public void postDelay(Runnable runnable, long j, TimeUnit timeUnit) {
        this.LLILLJJLI.schedule(runnable, j, timeUnit);
    }
}
