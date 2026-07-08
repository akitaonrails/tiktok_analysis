package X;

import Y.ARunnableS18S1100000_13;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStream;
import com.tiktok.strategycenterengineimpl.manager.TTMStrategyCenterManagerImpl;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wh2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829900Wh2 implements ITTMEventStream {
    public static final C829900Wh2 LIZ = new C829900Wh2();
    public static final C830790WiT LIZIZ;
    public static ExecutorService LIZJ;
    public static final AtomicInteger LIZLLL;

    static {
        C830790WiT c830790WiT = new C830790WiT("AppLog", true);
        LIZIZ = c830790WiT;
        LIZJ = C786410Ut5.h4();
        LIZLLL = new AtomicInteger(0);
        C829880Wh0.LIZ("AppLog", c830790WiT);
    }

    @Override // com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStream
    public final int getPendingTasksSize() {
        return LIZLLL.get();
    }

    @Override // com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStream
    public final void emitEventToCaiEventStream(String str, JSONObject jSONObject) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        if (TTMStrategyCenterManagerImpl.LIZLLL) {
            if (jSONObject != null || str != null) {
                boolean z = C2213421Bk4.LIZ;
                if (C2213421Bk4.LIZ) {
                    try {
                        if (LIZJ.isShutdown()) {
                            LIZJ = C786410Ut5.h4();
                        }
                        LIZLLL.incrementAndGet();
                        LIZJ.execute(new ARunnableS18S1100000_13(str, jSONObject, 7));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
    }
}
