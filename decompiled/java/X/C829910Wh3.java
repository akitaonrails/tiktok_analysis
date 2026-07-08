package X;

import Y.ARunnableS18S1100000_13;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStream;
import com.tiktok.strategycenterengineimpl.manager.TTMStrategyCenterManagerImpl;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wh3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829910Wh3 implements ITTMEventStream {
    public static final C829910Wh3 LIZ = new C829910Wh3();
    public static final C830790WiT LIZIZ;
    public static ExecutorService LIZJ;
    public static final AtomicInteger LIZLLL;

    static {
        C830790WiT c830790WiT = new C830790WiT("FeatureStream", true);
        LIZIZ = c830790WiT;
        LIZJ = C786410Ut5.h4();
        LIZLLL = new AtomicInteger(0);
        C829880Wh0.LIZ("FeatureStream", c830790WiT);
    }

    @Override // com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStream
    public final int getPendingTasksSize() {
        return LIZLLL.get();
    }

    @Override // com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStream
    public final void emitEventToCaiEventStream(String str, JSONObject jSONObject) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        if (TTMStrategyCenterManagerImpl.LIZLLL) {
            if (jSONObject == null && str == null) {
                return;
            }
            try {
                if (LIZJ.isShutdown()) {
                    LIZJ = C786410Ut5.h4();
                }
                LIZLLL.incrementAndGet();
                LIZJ.execute(new ARunnableS18S1100000_13(str, jSONObject, 8));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
