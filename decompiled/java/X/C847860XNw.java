package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.checkpoint.HackedCheckpointReceiverV2;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0XNw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847860XNw {
    public static final HackedCheckpointReceiverV2 LIZ = new HackedCheckpointReceiverV2();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static void LIZ() {
        AtomicBoolean atomicBoolean = LIZIZ;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (atomicBoolean) {
            try {
                if (!atomicBoolean.get()) {
                    EventBus eventBusLIZLLL = EventBus.LIZLLL();
                    HackedCheckpointReceiverV2 hackedCheckpointReceiverV2 = LIZ;
                    if (!eventBusLIZLLL.LJIIJ(hackedCheckpointReceiverV2)) {
                        atomicBoolean.set(true);
                        C2203431BLp.LIZIZ.LJI(3001, 4, hackedCheckpointReceiverV2);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
