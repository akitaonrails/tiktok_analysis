package X;

import Y.ARunnableS128S0100000_28;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13lZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20105113lZ implements InterfaceC20105513ld {
    public static final AtomicLong LJI = new AtomicLong(0);
    public static final C01GW<C20105113lZ> LJII = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(484));
    public final C0UPC LIZ;
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public final Object LIZJ = new Object();
    public final PriorityQueue<C20105013lY> LIZLLL = new PriorityQueue<>();
    public final Map<Long, C20105013lY> LJ = new LinkedHashMap();
    public boolean LJFF;

    public final void LIZIZ() {
        C20105013lY c20105013lYPoll;
        boolean z;
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z2 = false;
        int i = 0;
        while (true) {
            synchronized (this.LIZJ) {
                try {
                    c20105013lYPoll = this.LIZLLL.poll();
                    if (c20105013lYPoll != null) {
                        this.LJ.remove(Long.valueOf(c20105013lYPoll.LL));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (c20105013lYPoll == null) {
                synchronized (this.LIZJ) {
                    try {
                        this.LJFF = z2;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
                if (i > 0) {
                    C0UPC c0upc = this.LIZ;
                    InterfaceC20105613le interfaceC20105613le = c0upc.LIZLLL;
                    String str = c0upc.LJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Drain completed: processed ");
                    sbLIZ.append(i);
                    sbLIZ.append(" tasks");
                    interfaceC20105613le.d(str, C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            if (!c20105013lYPoll.LLILZIL) {
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                String strLIZIZ = c20105013lYPoll.LLILLL;
                if (strLIZIZ == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Task#");
                    sbLIZ2.append(c20105013lYPoll.LL);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                try {
                    c20105013lYPoll.LLILZ.run();
                    long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis2;
                    C0UPC c0upc2 = this.LIZ;
                    InterfaceC20105613le interfaceC20105613le2 = c0upc2.LIZLLL;
                    String str2 = c0upc2.LJ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Executed ");
                    sbLIZ3.append(strLIZIZ);
                    sbLIZ3.append(" [");
                    sbLIZ3.append(c20105013lYPoll.LLILLJJLI);
                    sbLIZ3.append("] in ");
                    sbLIZ3.append(jUptimeMillis3);
                    sbLIZ3.append("ms");
                    interfaceC20105613le2.d(str2, C2188811AlT.LIZIZ(sbLIZ3));
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    long jUptimeMillis4 = SystemClock.uptimeMillis() - jUptimeMillis2;
                    C0UPC c0upc3 = this.LIZ;
                    InterfaceC20105613le interfaceC20105613le3 = c0upc3.LIZLLL;
                    String str3 = c0upc3.LJ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Error executing ");
                    sbLIZ4.append(strLIZIZ);
                    sbLIZ4.append(" [");
                    sbLIZ4.append(c20105013lYPoll.LLILLJJLI);
                    sbLIZ4.append("] in ");
                    sbLIZ4.append(jUptimeMillis4);
                    sbLIZ4.append("ms: ");
                    sbLIZ4.append(th3.getMessage());
                    sbLIZ4.append('\n');
                    sbLIZ4.append(C13SZ.LIZIZ(th3));
                    interfaceC20105613le3.e(str3, C2188811AlT.LIZIZ(sbLIZ4));
                }
                i++;
                if (SystemClock.uptimeMillis() - jUptimeMillis >= this.LIZ.LIZ) {
                    long jUptimeMillis5 = SystemClock.uptimeMillis() - jUptimeMillis;
                    C0UPC c0upc4 = this.LIZ;
                    InterfaceC20105613le interfaceC20105613le4 = c0upc4.LIZLLL;
                    String str4 = c0upc4.LJ;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Time slice exhausted: processed ");
                    sbLIZ5.append(i);
                    sbLIZ5.append(" tasks in ");
                    sbLIZ5.append(jUptimeMillis5);
                    sbLIZ5.append("ms");
                    interfaceC20105613le4.d(str4, C2188811AlT.LIZIZ(sbLIZ5));
                    synchronized (this.LIZJ) {
                        try {
                            if (this.LIZLLL.isEmpty()) {
                                this.LJFF = false;
                                z = false;
                            } else {
                                z = true;
                            }
                        } catch (Throwable th4) {
                            TryCatchGuardChecker.doCheck(th4);
                            throw th4;
                        }
                    }
                    if (z) {
                        C786410Ut5.LJLIIL(this.LIZ.LIZIZ, this.LIZIZ, new ARunnableS128S0100000_28(this, 115));
                        return;
                    }
                    return;
                }
                z2 = false;
            }
        }
    }

    public C20105113lZ(C0UPC c0upc) {
        this.LIZ = c0upc;
    }

    @Override // X.InterfaceC20105513ld
    public final InterfaceC20105713lf LIZ(final C00GI c00gi, final String str, final Runnable runnable) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            return LIZJ(c00gi, str, runnable);
        }
        final C20105313lb c20105313lb = new C20105313lb();
        C786410Ut5.LJJZZIII(this.LIZIZ, new Runnable() { // from class: X.13la
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FramePacedTaskSchedulerImpl@b3be.post$1");
                try {
                    if (!c20105313lb.LIZ.get()) {
                        this.LIZJ(c00gi, str, runnable);
                        c20105313lb.getClass();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FramePacedTaskSchedulerImpl@b3be.post$1");
            }
        });
        return c20105313lb;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.13lc] */
    public final C20105413lc LIZJ(C00GI c00gi, String str, Runnable runnable) {
        long andIncrement = LJI.getAndIncrement();
        C20105013lY c20105013lY = new C20105013lY(andIncrement, c00gi, str, runnable);
        synchronized (this.LIZJ) {
            try {
                this.LIZLLL.offer(c20105013lY);
                this.LJ.put(Long.valueOf(andIncrement), c20105013lY);
                if (!this.LJFF) {
                    this.LJFF = true;
                    C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS128S0100000_28(this, 116));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return new InterfaceC20105713lf() { // from class: X.13lc
            {
                new AtomicBoolean(false);
            }
        };
    }
}
