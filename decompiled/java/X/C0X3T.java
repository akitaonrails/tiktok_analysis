package X;

import Y.ARunnableS1S0010000_13;
import android.os.Looper;
import android.view.Choreographer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0X3T, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X3T {
    public static int LIZ;
    public static Choreographer LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static C0X3Y LJ;
    public static final ConcurrentHashMap<Long, ConcurrentHashMap<C0X3Q, ArrayList<C0X3R>>> LJFF;
    public static final LinkedBlockingQueue<C0X3R> LJI;
    public static final AtomicLong LJII;
    public static final AtomicLong LJIIIIZZ;
    public static Method LJIIIZ;
    public static final C0X3W LJIIJ;
    public static final C0X3X LJIIJJI;
    public static final C0X3V LJIIL;
    public static long LJIILIIL;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0X3W] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0X3X] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0X3V] */
    static {
        final C0X3T c0x3t = new C0X3T();
        LIZ = 4;
        LJ = new C0X3Y(new C0X3Z());
        LJFF = new ConcurrentHashMap<>();
        LJI = new LinkedBlockingQueue<>();
        LJII = new AtomicLong(1L);
        LJIIIIZZ = new AtomicLong(0L);
        LJIIJ = new Choreographer.FrameCallback() { // from class: X.0X3W
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) throws Throwable {
                C0X3T.LIZ(j, false);
            }
        };
        LJIIJJI = new Choreographer.FrameCallback(c0x3t) { // from class: X.0X3X
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                C0X3T.LJIILIIL = j;
            }
        };
        LJIIL = new Runnable() { // from class: X.0X3V
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("RealVsyncWorker$CommitCallback@45e0.run");
                try {
                    C0X3T.LIZ(C0X3T.LJIILIIL, true);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("RealVsyncWorker$CommitCallback@45e0.run");
            }
        };
    }

    public static void LIZIZ(boolean z) throws Throwable {
        if (z) {
            Choreographer choreographer = LIZIZ;
            if (choreographer != null) {
                choreographer.postFrameCallback(LJIIJJI);
            }
            Method method = LJIIIZ;
            if (method == null) {
                Intrinsics.LJIIL();
            }
            C2204961BRm.a0(method, LIZIZ, new Object[]{Integer.valueOf(LIZ), LJIIL, null, 0}, new C0WZX("dzBzEgAjS8/YVFkiQFyFceopgexDhm7+KsQVygj5uIL9Ogz2ccDGSg==", null));
            return;
        }
        C786410Ut5.v2().postFrameCallback(LJIIJ);
    }

    public static void LIZJ(boolean z) throws Throwable {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            LIZIZ(z);
        } else {
            C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new ARunnableS1S0010000_13(z, 3));
        }
    }

    public static long LIZLLL(C0X3R c0x3r) {
        long jNanoTime = System.nanoTime();
        c0x3r.LIZ();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        ConcurrentHashMap<String, Pair<Long, Long>> concurrentHashMap = C0X3R.LIZIZ;
        if (concurrentHashMap.get(c0x3r.LIZ) == null) {
            concurrentHashMap.put(c0x3r.LIZ, new Pair<>(1L, Long.valueOf(jNanoTime2)));
            return jNanoTime2;
        }
        Pair<Long, Long> pair = concurrentHashMap.get(c0x3r.LIZ);
        if (pair == null) {
            Intrinsics.LJIIL();
        }
        Pair<Long, Long> pair2 = pair;
        concurrentHashMap.put(c0x3r.LIZ, new Pair<>(Long.valueOf(pair2.getFirst().longValue() + 1), Long.valueOf(((pair2.getSecond().longValue() * pair2.getFirst().longValue()) + jNanoTime2) / (pair2.getFirst().longValue() + 1))));
        return jNanoTime2;
    }

    public static void LIZ(long j, boolean z) throws Throwable {
        String str;
        long jLongValue;
        Long second;
        Long second2;
        Long second3;
        int i = 0;
        LIZLLL = false;
        long jNanoTime = (16000000 - (System.nanoTime() - j)) - 1000000;
        if (!z) {
            jNanoTime -= 5000000;
        }
        long j2 = 0;
        if (jNanoTime > 16000000 || jNanoTime < 0) {
            jNanoTime = -1;
        }
        if (LJFF.size() > LJ.LIZ) {
            jNanoTime = Long.MAX_VALUE;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new frame remain=");
        sbLIZ.append(jNanoTime);
        sbLIZ.append(" in ");
        if (z) {
            str = "commit";
        } else {
            str = "animation";
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        LinkedBlockingQueue<C0X3R> linkedBlockingQueue = LJI;
        while (!linkedBlockingQueue.isEmpty()) {
            C0X3R c0x3rPeek = linkedBlockingQueue.peek();
            C0X3R c0x3rPoll = linkedBlockingQueue.poll();
            if (c0x3rPoll == null) {
                Intrinsics.LJIIL();
            }
            long jLIZLLL = LIZLLL(c0x3rPoll);
            jNanoTime -= jLIZLLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("first cost = ");
            sbLIZ2.append(jLIZLLL);
            sbLIZ2.append(" avg= ");
            Pair<Long, Long> pair = C0X3R.LIZIZ.get(c0x3rPeek.LIZ);
            if (pair != null) {
                second3 = pair.getSecond();
            } else {
                second3 = null;
            }
            sbLIZ2.append(second3);
            sbLIZ2.append(" remain = ");
            sbLIZ2.append(jNanoTime);
            sbLIZ2.append(" task = ");
            sbLIZ2.append(c0x3rPeek.LIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (jNanoTime < 0) {
            jNanoTime = -1;
        } else if (jNanoTime == -2) {
            LIZJ(z);
            return;
        }
        LJII.get();
        while (true) {
            AtomicLong atomicLong = LJII;
            if (atomicLong.get() > LJIIIIZZ.get()) {
                break;
            }
            ConcurrentHashMap<Long, ConcurrentHashMap<C0X3Q, ArrayList<C0X3R>>> concurrentHashMap = LJFF;
            ConcurrentHashMap<C0X3Q, ArrayList<C0X3R>> concurrentHashMap2 = concurrentHashMap.get(Long.valueOf(atomicLong.get()));
            if (concurrentHashMap2 == null) {
                concurrentHashMap.remove(Long.valueOf(atomicLong.getAndAdd(1L)));
            } else {
                C0X3Q c0x3q = C0X3Q.NORMAL;
                long j3 = jNanoTime;
                while (true) {
                    if (j3 <= j2 && j3 != -1) {
                        break;
                    }
                    ArrayList<C0X3R> arrayList = concurrentHashMap2.get(c0x3q);
                    if (arrayList == null) {
                        Intrinsics.LJIIL();
                    }
                    synchronized (arrayList) {
                        try {
                            if (concurrentHashMap2.get(c0x3q) == null) {
                                Intrinsics.LJIIL();
                            }
                            if (!r0.isEmpty()) {
                                ArrayList<C0X3R> arrayList2 = concurrentHashMap2.get(c0x3q);
                                if (arrayList2 == null) {
                                    Intrinsics.LJIIL();
                                }
                                C0X3R c0x3r = arrayList2.get(i);
                                ConcurrentHashMap<String, Pair<Long, Long>> concurrentHashMap3 = C0X3R.LIZIZ;
                                Pair<Long, Long> pair2 = concurrentHashMap3.get(c0x3r.LIZ);
                                if (pair2 != null && (second2 = pair2.getSecond()) != null) {
                                    jLongValue = second2.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                if (j3 - jLongValue >= j2 || j3 == -1 || !LIZLLL) {
                                    ArrayList<C0X3R> arrayList3 = concurrentHashMap2.get(c0x3q);
                                    if (arrayList3 == null) {
                                        Intrinsics.LJIIL();
                                    }
                                    long jLIZLLL2 = LIZLLL((C0X3R) ListProtector.remove(arrayList3, i));
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("auto cost = ");
                                    sbLIZ3.append(jLIZLLL2);
                                    sbLIZ3.append(" avg= ");
                                    Pair<Long, Long> pair3 = concurrentHashMap3.get(c0x3r.LIZ);
                                    if (pair3 != null) {
                                        second = pair3.getSecond();
                                    } else {
                                        second = null;
                                    }
                                    sbLIZ3.append(second);
                                    sbLIZ3.append(" remain = ");
                                    j3 -= jLIZLLL2;
                                    sbLIZ3.append(j3);
                                    sbLIZ3.append(" task = ");
                                    sbLIZ3.append(c0x3r.LIZ);
                                    C2188811AlT.LIZIZ(sbLIZ3);
                                    LIZLLL = true;
                                    if (jNanoTime != -1) {
                                        i = 1;
                                    } else {
                                        j3 = -2;
                                    }
                                } else {
                                    j3 = -2;
                                }
                            }
                            i = 0;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    if (i == 0) {
                        break;
                    }
                    i = 0;
                    j2 = 0;
                }
                ArrayList<C0X3R> arrayList4 = concurrentHashMap2.get(C0X3Q.NORMAL);
                if (arrayList4 == null) {
                    Intrinsics.LJIIL();
                }
                if (arrayList4.size() == 0) {
                    LJFF.remove(Long.valueOf(LJII.getAndAdd(1L)));
                }
                j2 = 0;
                if (j3 <= 0) {
                    break;
                } else {
                    jNanoTime = j3;
                }
            }
            i = 0;
        }
        ConcurrentHashMap<Long, ConcurrentHashMap<C0X3Q, ArrayList<C0X3R>>> concurrentHashMap4 = LJFF;
        if (concurrentHashMap4.size() > 0 || LJI.size() > 0) {
            LIZJ(z);
            if (concurrentHashMap4.size() == 1) {
                Iterator<Map.Entry<Long, ConcurrentHashMap<C0X3Q, ArrayList<C0X3R>>>> it2 = concurrentHashMap4.entrySet().iterator();
                boolean z2 = false;
                while (it2.hasNext()) {
                    if (it2.next().getKey().longValue() < LJII.get()) {
                        z2 = true;
                    }
                }
                if (z2) {
                    LJFF.clear();
                }
            }
        }
    }
}
