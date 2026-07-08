package X;

import Y.ARunnableS93S0000000_16;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0uON, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1702010uON implements C0NBQ {
    public static InterfaceC1702050uOR LIZIZ;
    public static InterfaceC1702040uOQ LIZJ;
    public static final Thread[] LJII;
    public static final LinkedList<Thread> LJIIIIZZ;
    public static final LinkedList<Thread> LJIIIZ;
    public static final ConcurrentHashMap<Long, C1700640uMA> LJIIJ;
    public static final ConcurrentHashMap<String, Long> LJIIJJI;
    public static volatile boolean LJIIL;
    public static final BlockingQueue<Runnable> LJIILIIL;
    public static int LJIILJJIL;
    public static C1512840pTG LJIILL;
    public static C1512820pTE LJIILLIIL;
    public static volatile EnumC1006810cJ5 LJIIZILJ;
    public static final AtomicLong LJIJ;
    public static volatile boolean LJIJI;
    public static final C1702010uON LIZ = new C1702010uON();
    public static final int LIZLLL = 128;
    public static final int LJ = 64;
    public static final long LJFF = 60;
    public static final long LJI = 180;

    static {
        C2200821BBo.LIZ.getClass();
        LJII = new Thread[C2200821BBo.LJIJJLI];
        LJIIIIZZ = new LinkedList<>();
        LJIIIZ = new LinkedList<>();
        LJIIJ = new ConcurrentHashMap<>();
        LJIIJJI = new ConcurrentHashMap<>();
        LJIIL = true;
        LJIILIIL = new LinkedBlockingQueue();
        LJIIZILJ = EnumC1006810cJ5.Unknown;
        LJIJ = new AtomicLong(0L);
    }

    public static void LIZJ() {
        if (LJIJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("core thread is Inited： ");
            sbLIZ.append(LJII.length);
            sbLIZ.append(" count");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        LJIJI = true;
        int length = LJII.length;
        int i = 0;
        while (i < length) {
            Thread[] threadArr = LJII;
            int i2 = i + 1;
            Runnable runnable = new Runnable() { // from class: X.0uLw
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MiloCoreThreadPool$CoreWorker@a96b.run");
                    while (true) {
                        try {
                            C1702010uON.LIZ.getClass();
                            if (!C1702010uON.LJIIL || C786410Ut5.u3().isInterrupted()) {
                                break;
                            }
                            try {
                                ((Runnable) ((LinkedBlockingQueue) C1702010uON.LJIILIIL).take()).run();
                            } catch (InterruptedException e) {
                                TryCatchGuardChecker.doCheck(e);
                                C786410Ut5.u3().interrupt();
                                C1C7U.LIZIZ("MiloCoreThreadPool$CoreWorker@a96b.run");
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                    }
                    C1C7U.LIZIZ("MiloCoreThreadPool$CoreWorker@a96b.run");
                }
            };
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Milo-Core-Thread-");
            sbLIZ2.append(i2);
            BPEAThread bPEAThread = new BPEAThread(runnable, C2188811AlT.LIZIZ(sbLIZ2));
            threadArr[i] = bPEAThread;
            bPEAThread.start();
            i = i2;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("core thread： ");
        sbLIZ3.append(LJII.length);
        sbLIZ3.append(" count");
        C2188811AlT.LIZIZ(sbLIZ3);
        C2200821BBo.LIZ.getClass();
        if (C2200821BBo.LJJI) {
            if (true ^ C2200821BBo.LIZJ) {
                C0NBO.LIZJ(3000L, new ARunnableS93S0000000_16(12));
                return;
            }
            C1BC9 c1bc9 = C1BC9.Cpu;
            LJIILL = (C1512840pTG) C2201101BCq.LJI(c1bc9, null);
            C1BC9 c1bc92 = C1BC9.Memory;
            LJIILLIIL = (C1512820pTE) C2201101BCq.LJI(c1bc92, null);
            LIZLLL();
            C2201101BCq.LJII(c1bc9, new InterfaceC1702110uOX() { // from class: X.0uOO
                @Override // X.InterfaceC1006670cIr
                public final void LJIIJ(C1512840pTG c1512840pTG, C1512840pTG c1512840pTG2) {
                    C1702010uON.LJIILL = c1512840pTG2;
                    C1702010uON.LIZ.getClass();
                    C1702010uON.LIZLLL();
                }
            }, false, 0L, null);
            C2201101BCq.LJII(c1bc92, new InterfaceC1702120uOY() { // from class: X.0uOP
                @Override // X.InterfaceC1006670cIr
                public final void LJIIJ(C1512820pTE c1512820pTE, C1512820pTE c1512820pTE2) {
                    C1702010uON.LJIILLIIL = c1512820pTE2;
                    C1702010uON.LIZ.getClass();
                    C1702010uON.LIZLLL();
                }
            }, false, 0L, null);
        }
    }

    public static void LIZLLL() {
        C1512840pTG c1512840pTG = LJIILL;
        if (c1512840pTG == null || LJIILLIIL == null) {
            return;
        }
        LJIIZILJ = (c1512840pTG.LIZIZ() && LJIILLIIL.LIZIZ()) ? EnumC1006810cJ5.Critical : ((!LJIILL.LIZIZ() || LJIILLIIL.LIZIZ()) && (LJIILL.LIZIZ() || !LJIILLIIL.LIZIZ())) ? EnumC1006810cJ5.Low : EnumC1006810cJ5.Medium;
    }

    public static void LJ(int i) {
        InterfaceC1702040uOQ interfaceC1702040uOQ;
        if (i > LJIILJJIL) {
            C2200821BBo.LIZ.getClass();
            if (C2200821BBo.LJJ) {
                int length = LJII.length;
                LinkedList<Thread> linkedList = LJIIIIZZ;
                if (i > (length + linkedList.size()) * 2 && linkedList.size() < LJ && (((interfaceC1702040uOQ = LIZJ) == null || interfaceC1702040uOQ.LIZ()) && (!C2200821BBo.LJJI || LJIIZILJ != EnumC1006810cJ5.Critical))) {
                    long jIncrementAndGet = LJIJ.incrementAndGet();
                    Runnable runnable = new Runnable() { // from class: X.0uLx
                        public static void LIZ() {
                            while (true) {
                                C1702010uON.LIZ.getClass();
                                if (!C1702010uON.LJIIL || C786410Ut5.u3().isInterrupted()) {
                                    return;
                                }
                                try {
                                    if (C1702010uON.LJIIZILJ == EnumC1006810cJ5.Critical) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("cycle work thread when res is critical, ");
                                        sbLIZ.append(C786410Ut5.u3().getName());
                                        C2188811AlT.LIZIZ(sbLIZ);
                                        LIZIZ();
                                        return;
                                    }
                                    Runnable runnable2 = (Runnable) ((LinkedBlockingQueue) C1702010uON.LJIILIIL).poll(C1702010uON.LJFF, TimeUnit.SECONDS);
                                    if (runnable2 != null) {
                                        runnable2.run();
                                    } else {
                                        LIZIZ();
                                    }
                                } catch (InterruptedException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C786410Ut5.u3().interrupt();
                                    return;
                                }
                            }
                        }

                        public static void LIZIZ() {
                            LinkedList<Thread> linkedList2 = C1702010uON.LJIIIIZZ;
                            synchronized (linkedList2) {
                                try {
                                    C786410Ut5.u3().interrupt();
                                    linkedList2.remove(C786410Ut5.u3());
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("after recycle， size：");
                                    sbLIZ.append(linkedList2.size());
                                    C2188811AlT.LIZIZ(sbLIZ);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("MiloCoreThreadPool$WorkWorker@c980.run");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("MiloCoreThreadPool$WorkWorker@c980.run");
                        }
                    };
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Milo-Work-Thread-");
                    sbLIZ.append(jIncrementAndGet);
                    BPEAThread bPEAThread = new BPEAThread(runnable, C2188811AlT.LIZIZ(sbLIZ));
                    bPEAThread.start();
                    linkedList.add(bPEAThread);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("after expanded，size is: ");
                    sbLIZ2.append(linkedList.size());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    InterfaceC1702050uOR interfaceC1702050uOR = LIZIZ;
                    if (interfaceC1702050uOR != null) {
                        interfaceC1702050uOR.LIZJ();
                    }
                }
            }
        }
        LJIILJJIL = i;
    }

    @Override // X.C0NBQ
    public final void LIZIZ(RunnableC584540MwG runnableC584540MwG) throws InterruptedException {
        LIZJ();
        ((LinkedBlockingQueue) LJIILIIL).put(runnableC584540MwG);
    }

    @Override // X.C0NBQ
    public final void LIZ(Runnable runnable, String str) throws InterruptedException {
        Object next;
        LIZJ();
        if (str.length() > 0) {
            Long l = LJIIJJI.get(str);
            if (l == null) {
                Iterator<T> it2 = LJIIJ.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((LinkedBlockingQueue) ((C1700640uMA) next).LIZ).size() < LIZLLL) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C1700640uMA c1700640uMA = (C1700640uMA) next;
                if (c1700640uMA == null) {
                    final long jIncrementAndGet = LJIJ.incrementAndGet();
                    LinkedList<Thread> linkedList = LJIIIZ;
                    Runnable runnable2 = new Runnable(jIncrementAndGet) { // from class: X.0uLy
                        public final long LL;

                        public final void LIZ() {
                            while (true) {
                                C1702010uON.LIZ.getClass();
                                if (!C1702010uON.LJIIL || C786410Ut5.u3().isInterrupted()) {
                                    return;
                                }
                                try {
                                    C1700640uMA c1700640uMA2 = C1702010uON.LJIIJ.get(Long.valueOf(this.LL));
                                    if (c1700640uMA2 == null) {
                                        LIZIZ(this.LL);
                                        return;
                                    }
                                    Runnable runnable3 = (Runnable) ((LinkedBlockingQueue) c1700640uMA2.LIZ).poll(C1702010uON.LJI, TimeUnit.SECONDS);
                                    if (runnable3 != null) {
                                        runnable3.run();
                                    } else {
                                        LIZIZ(this.LL);
                                    }
                                } catch (InterruptedException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C786410Ut5.u3().interrupt();
                                    return;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("MiloCoreThreadPool$GroupWorkWorker@f8c9.run");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("MiloCoreThreadPool$GroupWorkWorker@f8c9.run");
                        }

                        {
                            this.LL = jIncrementAndGet;
                        }

                        public static void LIZIZ(long j) {
                            CopyOnWriteArraySet<String> copyOnWriteArraySet;
                            LinkedList<Thread> linkedList2 = C1702010uON.LJIIIZ;
                            synchronized (linkedList2) {
                                try {
                                    C786410Ut5.u3().interrupt();
                                    linkedList2.remove(C786410Ut5.u3());
                                    C1700640uMA c1700640uMARemove = C1702010uON.LJIIJ.remove(Long.valueOf(j));
                                    if (c1700640uMARemove != null && (copyOnWriteArraySet = c1700640uMARemove.LIZIZ) != null) {
                                        Iterator<String> it3 = copyOnWriteArraySet.iterator();
                                        while (it3.hasNext()) {
                                            C1702010uON.LJIIJJI.remove(it3.next());
                                        }
                                    }
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("after recycle， size：");
                                    sbLIZ.append(C1702010uON.LJIIIIZZ.size());
                                    C2188811AlT.LIZIZ(sbLIZ);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    };
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Milo-Group-Thread-");
                    sbLIZ.append(jIncrementAndGet);
                    BPEAThread bPEAThread = new BPEAThread(runnable2, C2188811AlT.LIZIZ(sbLIZ));
                    bPEAThread.start();
                    linkedList.add(bPEAThread);
                    LJIIJJI.put(str, Long.valueOf(jIncrementAndGet));
                    c1700640uMA = new C1700640uMA();
                    c1700640uMA.LIZIZ.add(str);
                    LJIIJ.put(Long.valueOf(jIncrementAndGet), c1700640uMA);
                }
                ((LinkedBlockingQueue) c1700640uMA.LIZ).put(runnable);
                return;
            }
            ConcurrentHashMap<Long, C1700640uMA> concurrentHashMap = LJIIJ;
            C1700640uMA c1700640uMA2 = concurrentHashMap.get(l);
            if (c1700640uMA2 == null) {
                C1700640uMA c1700640uMA3 = new C1700640uMA();
                l.longValue();
                c1700640uMA3.LIZIZ.add(str);
                concurrentHashMap.put(l, c1700640uMA3);
                return;
            }
            BlockingQueue<Runnable> blockingQueue = c1700640uMA2.LIZ;
            if (blockingQueue == null) {
                return;
            }
            ((LinkedBlockingQueue) blockingQueue).put(runnable);
            return;
        }
        ((LinkedBlockingQueue) LJIILIIL).put(runnable);
    }
}
