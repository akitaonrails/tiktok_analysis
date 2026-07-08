package X;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.10qS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19371010qS {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final HashMap<String, Long> LIZIZ = new HashMap<>();
    public static final C01GW LIZJ;

    static {
        new ConcurrentHashMap();
        LIZJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(469));
    }

    public static final synchronized void LIZ(String str) {
        Long lRemove = LIZIZ.remove(str);
        if (lRemove != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - lRemove.longValue();
            if (jElapsedRealtime < 30000) {
                ((InterfaceC19371110qT) LIZJ.getValue()).LIZ(jElapsedRealtime, str);
            }
        }
    }

    public static final void LIZJ(final String str) {
        C786410Ut5.LJJZZIII(LIZ, new Runnable() { // from class: X.10mV
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("Watcher@f5d8.postEnd$1");
                try {
                    C19371010qS.LIZ(str);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("Watcher@f5d8.postEnd$1");
            }
        });
    }

    public static final synchronized void LIZLLL(String str) {
        HashMap<String, Long> map = LIZIZ;
        Long l = map.get(str);
        if (l != null) {
            if (SystemClock.elapsedRealtime() - l.longValue() >= 30000) {
                map.remove(str);
            }
        } else {
            map.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    public static final void LIZIZ(long j, String str) {
        ((InterfaceC19371110qT) LIZJ.getValue()).LIZ(j, str);
    }
}
