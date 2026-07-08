package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.0C5R, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C5R {
    public static final Object LIZLLL = new Object();
    public final InterfaceC307670C4f LIZ;
    public volatile CountDownLatch LIZIZ;
    public final ConcurrentHashMap<String, Object> LIZJ = new ConcurrentHashMap<>();

    public final void LIZ() {
        CountDownLatch countDownLatch = this.LIZIZ;
        if (countDownLatch != null) {
            boolean z = false;
            while (true) {
                try {
                    countDownLatch.await();
                    break;
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    z = true;
                }
            }
            if (z) {
                C786410Ut5.u3().interrupt();
            }
        }
    }

    public C0C5R(InterfaceC307670C4f interfaceC307670C4f) {
        this.LIZ = interfaceC307670C4f;
    }

    public final void LIZIZ(n nVar) {
        CountDownLatch countDownLatch;
        if (!C307990C5l.LJFF && !C307920C5e.LIZ) {
            countDownLatch = new CountDownLatch(1);
            this.LIZIZ = countDownLatch;
        } else {
            countDownLatch = null;
        }
        try {
            if (C307990C5l.LJFF) {
                Set<String> setLJ = this.LIZ.LJ();
                Set<String> setLJJIJIL = nVar.LJJIJIL();
                for (String str : setLJ) {
                    if (!setLJJIJIL.contains(str)) {
                        this.LIZ.LIZ(str);
                    }
                }
            } else {
                this.LIZ.clear();
            }
            for (Map.Entry<String, k> entry : nVar.entrySet()) {
                this.LIZ.LIZIZ(entry.getKey(), entry.getValue().toString());
            }
            this.LIZJ.clear();
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                if (countDownLatch == null) {
                    return;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    this.LIZIZ = null;
                }
                throw th2;
            }
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.LIZIZ = null;
        }
    }
}
