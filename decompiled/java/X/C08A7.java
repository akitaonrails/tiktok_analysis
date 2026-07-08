package X;

import Y.ARunnableS103S0100000_3;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.08A7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08A7 {
    public static final AtomicInteger LIZ = new AtomicInteger(1);
    public static final Executor LIZIZ = C786410Ut5.g4(1, new ThreadFactory() { // from class: X.08A6
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            ARunnableS103S0100000_3 aRunnableS103S0100000_3 = new ARunnableS103S0100000_3(runnable, 140);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LiveRoomEnterThr-");
            sbLIZ.append(C08A7.LIZ.getAndIncrement());
            return new BPEAThread(aRunnableS103S0100000_3, C2188811AlT.LIZIZ(sbLIZ));
        }
    });
}
