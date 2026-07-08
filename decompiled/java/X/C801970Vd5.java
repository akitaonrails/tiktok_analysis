package X;

import com.bytedance.crash.monitor.f;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0Vd5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801970Vd5 {
    public static final ConcurrentHashMap<f, ConcurrentLinkedQueue<C0VXT>> LIZLLL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<f, ConcurrentLinkedQueue<C0VXT>> LJ = new ConcurrentHashMap<>();
    public static final CopyOnWriteArrayList<C801970Vd5> LJFF = new CopyOnWriteArrayList<>();
    public static final AtomicInteger LJI = new AtomicInteger(0);
    public static final AtomicInteger LJII = new AtomicInteger(0);
    public static volatile boolean LJIIIIZZ = false;
    public C1173804iW LIZ;
    public final ConcurrentLinkedQueue<C0VXT> LIZIZ;
    public final ConcurrentLinkedQueue<C0VXT> LIZJ;

    public C801970Vd5(f fVar) {
        ConcurrentLinkedQueue<C0VXT> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.LIZIZ = concurrentLinkedQueue;
        LIZLLL.put(fVar, concurrentLinkedQueue);
        this.LIZJ = new ConcurrentLinkedQueue<>();
        LJ.put(fVar, concurrentLinkedQueue);
        LJFF.add(this);
        RunnableC801960Vd4 runnableC801960Vd4 = RunnableC801960Vd4.LLILLJJLI;
        if (!runnableC801960Vd4.LL) {
            runnableC801960Vd4.LL = true;
            LJIIIIZZ = true;
            C0VXF.removeCallbacks(runnableC801960Vd4);
            C0VXF.postDelayed(runnableC801960Vd4, 30000L);
        }
    }
}
