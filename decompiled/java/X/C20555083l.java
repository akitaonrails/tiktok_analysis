package X;

import android.os.HandlerThread;
import android.os.Looper;
import ci3.a;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.083l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20555083l {
    public static final HashMap<String, HandlerThread> LIZ;
    public static final List<String> LIZIZ;
    public static final List<String> LIZJ;

    static {
        new BPEAHandler(Looper.getMainLooper());
        LIZ = new HashMap<>();
        LIZIZ = Arrays.asList("NpthHandlerThread", "NewVideo-HandlerThread", "trace_time_update_thread");
        LIZJ = Arrays.asList("DBHelper-AsyncOp-New");
        new HashMap();
    }

    public static HandlerThread LIZ() {
        Iterator<Map.Entry<String, HandlerThread>> it2 = LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            if (!it2.next().getValue().isAlive()) {
                it2.remove();
            }
        }
        HashMap<String, HandlerThread> map = LIZ;
        HandlerThread handlerThread = map.get("ParseThread");
        if (handlerThread != null) {
            return handlerThread;
        }
        a aVar = new a() { // from class: X.083m
            public volatile boolean LL;

            @Override // java.lang.Thread
            public final synchronized void start() {
                if (this.LL) {
                    return;
                }
                this.LL = true;
                super.start();
            }
        };
        aVar.start();
        map.put("ParseThread", aVar);
        return aVar;
    }
}
