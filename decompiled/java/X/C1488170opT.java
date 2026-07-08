package X;

import android.os.HandlerThread;
import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0opT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488170opT {
    public static final C1488170opT LIZ = new C1488170opT();
    public static final AtomicInteger LIZIZ;
    public static final WeakHashMap<C1488180opU, Map<String, Object>> LIZJ;

    static {
        Process.myPid();
        HandlerThread handlerThread = new HandlerThread("keys_keep");
        handlerThread.start();
        new BPEAHandler(C786410Ut5.W2(handlerThread));
        LIZIZ = new AtomicInteger(1);
        LIZJ = new WeakHashMap<>();
        new C20066713fN((Object) null);
    }

    public final synchronized Map<String, Object> LIZ(C1488180opU c1488180opU) {
        Map<String, Object> linkedHashMap;
        WeakHashMap<C1488180opU, Map<String, Object>> weakHashMap = LIZJ;
        linkedHashMap = weakHashMap.get(c1488180opU);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            weakHashMap.put(c1488180opU, linkedHashMap);
        }
        return linkedHashMap;
    }
}
