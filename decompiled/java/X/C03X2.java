package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.03X2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03X2 implements Runnable {
    public static final /* synthetic */ int LLILZIL = 0;
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());
    public final ConcurrentLinkedDeque<C857203Wo> LLILLJJLI = new ConcurrentLinkedDeque<>();
    public final ConcurrentHashMap<Long, C857203Wo> LLILLL = new ConcurrentHashMap<>();
    public final AtomicBoolean LLILZ = new AtomicBoolean(false);

    public final void LIZIZ() {
        while (true) {
            C857203Wo c857203WoPollFirst = this.LLILLJJLI.pollFirst();
            if (c857203WoPollFirst != null) {
                Long l = c857203WoPollFirst.LIZIZ;
                if (l != null) {
                    this.LLILLL.remove(Long.valueOf(l.longValue()));
                }
                c857203WoPollFirst.LIZ.run();
            } else if (0 == 0) {
                break;
            }
        }
        this.LLILZ.set(false);
        if (this.LLILLJJLI.isEmpty() || !this.LLILZ.compareAndSet(false, true)) {
            return;
        }
        C786410Ut5.LJL(this.LL, this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("OspMainThreadHighLevelMessageQueue@56e5.run");
        try {
            LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OspMainThreadHighLevelMessageQueue@56e5.run");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C857203Wo r8, boolean r9) {
        /*
            r7 = this;
            java.lang.Long r0 = r8.LIZIZ
            r2 = 1
            if (r0 == 0) goto L7d
            long r5 = r0.longValue()
            java.lang.Integer r1 = r8.LIZJ
            if (r1 == 0) goto L77
            int r0 = r1.intValue()
            if (r0 != 0) goto L56
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, X.03Wo> r1 = r7.LLILLL
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.Object r1 = r1.get(r0)
            X.03Wo r1 = (X.C857203Wo) r1
            if (r1 == 0) goto L37
            java.util.concurrent.ConcurrentLinkedDeque<X.03Wo> r0 = r7.LLILLJJLI
            r0.remove(r1)
            java.lang.Long r0 = r1.LIZIZ
            if (r0 == 0) goto L37
            long r3 = r0.longValue()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, X.03Wo> r1 = r7.LLILLL
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1.remove(r0)
        L37:
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, X.03Wo> r0 = r7.LLILLL
            r0.put(r1, r8)
            java.util.concurrent.ConcurrentLinkedDeque<X.03Wo> r0 = r7.LLILLJJLI
            r0.addLast(r8)
        L45:
            if (r9 == 0) goto L55
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.LLILZ
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 == 0) goto L55
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r7.LL
            X.C786410Ut5.LJL(r0, r7)
        L55:
            return
        L56:
            int r0 = r1.intValue()
            if (r0 != r2) goto L77
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, X.03Wo> r1 = r7.LLILLL
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L45
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, X.03Wo> r0 = r7.LLILLL
            r0.put(r1, r8)
            java.util.concurrent.ConcurrentLinkedDeque<X.03Wo> r0 = r7.LLILLJJLI
            r0.addLast(r8)
            goto L45
        L77:
            java.util.concurrent.ConcurrentLinkedDeque<X.03Wo> r0 = r7.LLILLJJLI
            r0.addLast(r8)
            goto L45
        L7d:
            java.util.concurrent.ConcurrentLinkedDeque<X.03Wo> r0 = r7.LLILLJJLI
            r0.addLast(r8)
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03X2.LIZ(X.03Wo, boolean):void");
    }
}
