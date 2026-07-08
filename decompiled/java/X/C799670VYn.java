package X;

import Y.ARunnableS22S0400000_13;
import android.os.Handler;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lego.common.LegoHandler;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0VYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799670VYn extends AbstractC799790VYz implements Handler.Callback {
    public boolean LLILLJJLI;
    public boolean LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public final LegoHandler LL = new LegoHandler(this);
    public int LLILLL = 1;
    public final int LLIZ = 4;

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LJI() {
        this.LLILLJJLI = false;
        C798400VTq.LJ.set(false);
    }

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LJFF() {
        long jLJIJJ;
        C799900VZk.LIZ.getClass();
        if (C2104108Md.LIZLLL(C799900VZk.LJFF().context()) && !this.LLILZ) {
            System.currentTimeMillis();
            if (C799900VZk.LJFF().LJIIZILJ() > 0.0f) {
                C798400VTq.LIZ = C799900VZk.LJFF().LJFF();
                AtomicBoolean atomicBoolean = C798400VTq.LJ;
                if (atomicBoolean.compareAndSet(false, true) && atomicBoolean.get()) {
                    C786410Ut5.LJLIIL(C798400VTq.LIZ, C799570VYd.LIZIZ(), RunnableC798390VTp.LL);
                }
            }
            this.LLILZ = true;
        }
        this.LLILLJJLI = true;
        if (!C799900VZk.LJFF().LJJI()) {
            if (C799900VZk.LJFF().LJIILJJIL() && this.LL.hasMessages(1201)) {
                return;
            }
            this.LL.LJFF(1201, C799900VZk.LJFF().LJIJJ());
            return;
        }
        if (this.LL.hasMessages(1201)) {
            return;
        }
        if (C799900VZk.LJFF().LJJI() && C799900VZk.LIZIZ.LJFF(EnumC799870VZh.BOOT_FINISH)) {
            this.LLILLL = 2;
            jLJIJJ = 1000;
        } else {
            this.LLILLL = 1;
            jLJIJJ = C799900VZk.LJFF().LJIJJ();
        }
        this.LL.LJFF(1201, jLJIJJ);
    }

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        super.LIZ(interfaceC800080Va2);
        if (C0CP9.LIZ != C0CP8.COLD_BOOT_BEGIN) {
            C799900VZk.LIZ.getClass();
            if (C799900VZk.LJFF().LJJI()) {
                C799900VZk.LIZIZ.LJFF(EnumC799870VZh.BOOT_FINISH);
            }
            if (!this.LL.hasMessages(1201)) {
                this.LL.LJFF(1201, 0L);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C0CCZ c0ccz;
        ExecutorService executorService;
        ExecutorService executorServiceLIZLLL;
        int i;
        int i2;
        if (this.LLILLJJLI) {
            AtomicBoolean atomicBoolean = C798400VTq.LJ;
            if (atomicBoolean.get()) {
                float f = C798400VTq.LIZLLL;
                C799900VZk.LIZ.getClass();
                if (f > C799900VZk.LJFF().LJIIZILJ() && (i = this.LLILZLL) < (i2 = this.LLIZ)) {
                    int i3 = i + 1;
                    this.LLILZLL = i3;
                    if (i3 == i2) {
                        this.LLILZLL = 0;
                    } else {
                        this.LL.LJFF(1201, C799900VZk.LJFF().LJFF());
                        return true;
                    }
                }
            }
            this.LLILZLL = 0;
            C799900VZk.LIZ.getClass();
            C799880VZi c799880VZi = C799900VZk.LIZIZ;
            EnumC799870VZh enumC799870VZh = EnumC799870VZh.BOOT_FINISH;
            final C0CCZ c0cczLIZJ = c799880VZi.LIZJ(enumC799870VZh);
            synchronized (c799880VZi.LIZIZ) {
                try {
                    if (!((Collection) ((ConcurrentHashMap) c799880VZi.LIZIZ).get(enumC799870VZh)).isEmpty()) {
                        c0ccz = (C0CCZ) ((InterfaceC800080Va2) ((List) ((ConcurrentHashMap) c799880VZi.LIZIZ).get(enumC799870VZh)).get(0));
                    } else {
                        c0ccz = null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            final C013C c013c = new C013C();
            if (C799900VZk.LJFF().LJJI() && this.LLILLL == 2 && (!(c0ccz instanceof InterfaceC799590VYf) || ((InterfaceC799590VYf) c0ccz).priority() <= 1)) {
                c013c.element = true;
                this.LLILLL = 1;
            }
            if (c0cczLIZJ != null) {
                final C238400w2 c238400w2 = new C238400w2();
                if (c0cczLIZJ instanceof InterfaceC799590VYf) {
                    C0VU1 c0vu1ThreadType = ((InterfaceC799590VYf) c0cczLIZJ).threadType();
                    if (c0vu1ThreadType != null) {
                        int i4 = C0VU5.LIZ[c0vu1ThreadType.ordinal()];
                        if (i4 != 1) {
                            if (i4 == 2) {
                                if (!c0cczLIZJ.serialExecute()) {
                                    executorServiceLIZLLL = (ExecutorService) C799570VYd.LJII.getValue();
                                } else {
                                    executorServiceLIZLLL = (ExecutorService) C799570VYd.LJIIIIZZ.getValue();
                                }
                            }
                        } else {
                            executorServiceLIZLLL = C823050WQl.LIZLLL();
                        }
                        executorServiceLIZLLL.execute(new Runnable() { // from class: X.0VYo
                            public final void LIZ() {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                int priority = C786410Ut5.u3().getPriority();
                                C799900VZk.LIZ.getClass();
                                if (C799900VZk.LJFF().LJJI()) {
                                    if (((InterfaceC799590VYf) c0cczLIZJ).priority() <= 1) {
                                        if (C799900VZk.LJFF().LJIJ()) {
                                            ThreadMethodProxy.setPriority(C786410Ut5.u3(), ((InterfaceC799590VYf) c0cczLIZJ).priority());
                                        } else if (C799900VZk.LJFF().LJIIL()) {
                                            ThreadMethodProxy.setPriority(C786410Ut5.u3(), ((InterfaceC799590VYf) c0cczLIZJ).priority() + 1);
                                        } else if (C799900VZk.LJFF().LIZJ()) {
                                            ThreadMethodProxy.setPriority(C786410Ut5.u3(), ((InterfaceC799590VYf) c0cczLIZJ).priority() + 2);
                                        }
                                    }
                                } else if (((InterfaceC799590VYf) c0cczLIZJ).priority() > 1) {
                                    ThreadMethodProxy.setPriority(C786410Ut5.u3(), ((InterfaceC799590VYf) c0cczLIZJ).priority() + 4);
                                }
                                C799900VZk.LIZIZ.LJ(c0cczLIZJ);
                                ThreadMethodProxy.setPriority(C786410Ut5.u3(), priority);
                                c238400w2.element = System.currentTimeMillis() - jCurrentTimeMillis;
                                this.LIZLLL(c238400w2.element, c013c.element);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    LIZ();
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    if (!C2179971ATj.LIZ(th2)) {
                                        throw th2;
                                    }
                                }
                            }
                        });
                    }
                    throw new C1954807lC();
                }
                if (!c0cczLIZJ.serialExecute()) {
                    executorService = (ExecutorService) C799570VYd.LJII.getValue();
                } else {
                    executorService = (ExecutorService) C799570VYd.LJIIIIZZ.getValue();
                }
                executorService.execute(new ARunnableS22S0400000_13(c013c, c0cczLIZJ, c238400w2, this, 0));
                c0cczLIZJ.key();
            } else {
                LIZLLL(C799900VZk.LJFF().LIZLLL() / ((long) 2), c013c.element);
            }
            boolean z = c013c.element;
            if (C799900VZk.LJFF().LIZLLL() <= 0 && c799880VZi.LIZ(enumC799870VZh)) {
                long jLIZIZ = C799900VZk.LJFF().LIZIZ();
                if (z) {
                    jLIZIZ += C799900VZk.LJFF().LJIJJ();
                }
                this.LL.LJFF(1201, jLIZIZ);
            } else if (!this.LLILZIL && !c799880VZi.LIZ(enumC799870VZh) && C2104108Md.LIZLLL(C799900VZk.LJFF().context())) {
                this.LLILZIL = true;
                atomicBoolean.set(false);
                return true;
            }
        }
        return true;
    }

    public final void LIZLLL(long j, boolean z) {
        C799900VZk.LIZ.getClass();
        if (C799900VZk.LJFF().LIZLLL() > 0 && C799900VZk.LIZIZ.LIZ(EnumC799870VZh.BOOT_FINISH)) {
            long j2 = 2;
            long jLJIJJ = j * j2;
            long jLIZLLL = C799900VZk.LJFF().LIZLLL();
            long jLIZIZ = C799900VZk.LJFF().LIZIZ() * j2;
            if (jLJIJJ > jLIZLLL) {
                if (jLJIJJ >= jLIZIZ) {
                    jLJIJJ = jLIZIZ;
                }
            } else {
                jLJIJJ = jLIZLLL;
            }
            if (z) {
                jLJIJJ += C799900VZk.LJFF().LJIJJ();
            }
            this.LL.LJFF(1201, jLJIJJ);
        }
    }
}
