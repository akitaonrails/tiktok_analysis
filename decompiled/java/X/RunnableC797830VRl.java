package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0VRl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC797830VRl implements Runnable {
    public static final C19719912Dl LLILLL = C13LE.LIZ(RunnableC797830VRl.class);
    public static final Map<String, RunnableC797830VRl> LLILZ = new HashMap();
    public final Queue<Runnable> LL;
    public final String LLILLJJLI;

    public RunnableC797830VRl() {
        throw null;
    }

    public final void LIZ() {
        boolean z;
        while (true) {
            Runnable runnable = (Runnable) ((ConcurrentLinkedQueue) this.LL).poll();
            if (runnable != null) {
                runnable.run();
            } else {
                synchronized (LLILLL) {
                    try {
                        if (((ConcurrentLinkedQueue) this.LL).isEmpty()) {
                            ((HashMap) LLILZ).remove(this.LLILLJJLI);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (z) {
                    return;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("NamedSerialRunnable@ed58.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NamedSerialRunnable@ed58.run");
    }

    public RunnableC797830VRl(String str, List list) {
        this.LLILLJJLI = str;
        this.LL = new ConcurrentLinkedQueue(list);
    }
}
