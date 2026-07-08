package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0VYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799620VYi extends AbstractC799790VYz {
    public final Map<InterfaceC800080Va2, InterfaceC800080Va2> LL = new LinkedHashMap();
    public final Map<InterfaceC800080Va2, Integer> LLILLJJLI = new LinkedHashMap();

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LJFF() {
    }

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LJI() {
    }

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        C0CCZ c0ccz;
        super.LIZ(interfaceC800080Va2);
        C799900VZk.LIZ.getClass();
        C799880VZi c799880VZi = C799900VZk.LIZIZ;
        EnumC799870VZh enumC799870VZh = EnumC799870VZh.BACKGROUND;
        synchronized (c799880VZi.LIZIZ) {
            try {
                ((List) ((ConcurrentHashMap) c799880VZi.LIZIZ).get(enumC799870VZh)).remove(interfaceC800080Va2);
                synchronized (c799880VZi.LIZJ) {
                    try {
                        ((List) ((ConcurrentHashMap) c799880VZi.LIZJ).get(enumC799870VZh)).add(interfaceC800080Va2);
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                c0ccz = (C0CCZ) interfaceC800080Va2;
            } catch (Throwable th) {
                throw th;
            }
        }
        LJ(c0ccz);
    }

    public final void LIZLLL(C0CCZ c0ccz) {
        C799900VZk.LIZ.getClass();
        C799900VZk.LIZIZ.LJ(c0ccz);
        InterfaceC800080Va2 interfaceC800080Va2 = (InterfaceC800080Va2) ((LinkedHashMap) this.LL).get(c0ccz);
        if (interfaceC800080Va2 != null) {
            Integer num = (Integer) ((LinkedHashMap) this.LLILLJJLI).get(interfaceC800080Va2);
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue == 1) {
                    this.LLILLJJLI.remove(interfaceC800080Va2);
                    LJ((C0CCZ) interfaceC800080Va2);
                } else {
                    this.LLILLJJLI.put(interfaceC800080Va2, Integer.valueOf(iIntValue - 1));
                }
            }
            this.LL.remove(c0ccz);
        }
    }

    public final void LJ(final C0CCZ c0ccz) {
        ExecutorService executorServiceLJFF;
        ExecutorService executorServiceLIZLLL;
        if (c0ccz instanceof InterfaceC799590VYf) {
            C799900VZk.LIZ.getClass();
            if (C799900VZk.LJFF().LJIILL()) {
                InterfaceC799590VYf interfaceC799590VYf = (InterfaceC799590VYf) c0ccz;
                C0VU1 c0vu1ThreadType = interfaceC799590VYf.threadType();
                if (c0vu1ThreadType != null) {
                    int i = C0VU4.LIZ[c0vu1ThreadType.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            if (interfaceC799590VYf.level() == 1) {
                                executorServiceLIZLLL = (ExecutorService) C799570VYd.LJ.getValue();
                            } else {
                                executorServiceLIZLLL = (ExecutorService) C799570VYd.LIZ.getValue();
                            }
                        }
                    } else if (interfaceC799590VYf.level() == 1) {
                        executorServiceLIZLLL = (ExecutorService) C799570VYd.LJFF.getValue();
                    } else {
                        executorServiceLIZLLL = (ExecutorService) C799570VYd.LIZJ.getValue();
                    }
                }
                throw new C1954807lC();
            }
            C0VU1 c0vu1ThreadType2 = ((InterfaceC799590VYf) c0ccz).threadType();
            if (c0vu1ThreadType2 != null) {
                int i2 = C0VU4.LIZ[c0vu1ThreadType2.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        executorServiceLIZLLL = C799570VYd.LJFF(c0ccz.serialExecute());
                    }
                } else {
                    executorServiceLIZLLL = C823050WQl.LIZLLL();
                }
            }
            throw new C1954807lC();
            executorServiceLIZLLL.execute(new Runnable() { // from class: X.0VYj
                public final void LIZ() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (C799650VYl.LIZ() && ((InterfaceC799590VYf) c0ccz).priority() <= 1) {
                        C799650VYl.LIZJ(jCurrentTimeMillis, c0ccz);
                    }
                    int priority = C786410Ut5.u3().getPriority();
                    if (((InterfaceC799590VYf) c0ccz).priority() > 1) {
                        ThreadMethodProxy.setPriority(C786410Ut5.u3(), ((InterfaceC799590VYf) c0ccz).priority() + 4);
                    }
                    this.LIZLLL(c0ccz);
                    if (C799650VYl.LIZ() && ((InterfaceC799590VYf) c0ccz).priority() <= 1) {
                        C799650VYl.LIZIZ(jCurrentTimeMillis);
                    }
                    ThreadMethodProxy.setPriority(C786410Ut5.u3(), priority);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        LIZ();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
            return;
        }
        C799900VZk.LIZ.getClass();
        if (C799900VZk.LJFF().LJIILL()) {
            executorServiceLJFF = (ExecutorService) C799570VYd.LIZ.getValue();
        } else {
            executorServiceLJFF = C799570VYd.LJFF(c0ccz.serialExecute());
        }
        executorServiceLJFF.execute(new Runnable() { // from class: X.0VYk
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (C799650VYl.LIZ()) {
                        C799650VYl.LIZJ(jCurrentTimeMillis, c0ccz);
                    }
                    this.LIZLLL(c0ccz);
                    if (C799650VYl.LIZ()) {
                        C799650VYl.LIZIZ(jCurrentTimeMillis);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
            }
        });
    }
}
