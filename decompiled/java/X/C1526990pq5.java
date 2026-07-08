package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0pq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526990pq5 implements InterfaceC1527530pqx {
    public final AtomicBoolean LL = new AtomicBoolean(false);
    public final LinkedBlockingQueue<C1527500pqu> LLILLJJLI = new LinkedBlockingQueue<>();
    public final C1526970pq3 LLILLL;
    public final C1526960pq2 LLILZ;
    public final Context LLILZIL;

    @Override // X.InterfaceC1527530pqx
    public final boolean LJIIIIZZ() {
        synchronized (C1526990pq5.class) {
            try {
                Iterator it2 = new ArrayList(this.LLILLJJLI).iterator();
                while (it2.hasNext()) {
                    C1527060pqC c1527060pqC = ((C1527500pqu) it2.next()).LIZ;
                    if (c1527060pqC != null) {
                        Iterator<C1527020pq8> it3 = c1527060pqC.topics.iterator();
                        while (it3.hasNext()) {
                            if (it3.next().flag == EnumC1527170pqN.Data) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String LJI(C1527060pqC c1527060pqC) {
        if (c1527060pqC == null) {
            return null;
        }
        try {
            return c1527060pqC.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return " there is an oom exception";
        }
    }

    @Override // X.InterfaceC1527530pqx
    public final void LJJLIIIJL(C1527500pqu c1527500pqu) {
        this.LLILLJJLI.offer(c1527500pqu);
        synchronized (this) {
            try {
                if (this.LL.compareAndSet(false, true)) {
                    try {
                        C1527540pqy.LIZ.LIZIZ(new Object[0]).submit(new RunnableC1527050pqB(this));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0pqv] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0pqw] */
    public C1526990pq5(Context context, C1526100poe c1526100poe) {
        this.LLILZIL = context;
        this.LLILZ = new C1526960pq2(context, new InterfaceC1527530pqx() { // from class: X.0pqv
            @Override // X.InterfaceC1527530pqx
            public final boolean LJIIIIZZ() {
                return false;
            }

            @Override // X.InterfaceC1527530pqx
            public final void LJJLIIIJL(C1527500pqu c1527500pqu) {
                C1526970pq3 c1526970pq3 = this.LL.LLILLL;
                if (c1526970pq3 != null) {
                    c1526970pq3.LJJLIIIJL(c1527500pqu);
                }
            }
        });
        this.LLILLL = new C1526970pq3(context, c1526100poe, new InterfaceC1527530pqx() { // from class: X.0pqw
            @Override // X.InterfaceC1527530pqx
            public final boolean LJIIIIZZ() {
                this.LL.LLILZ.getClass();
                return false;
            }

            @Override // X.InterfaceC1527530pqx
            public final void LJJLIIIJL(C1527500pqu c1527500pqu) {
                this.LL.LLILZ.LJJLIIIJL(c1527500pqu);
            }
        });
    }
}
