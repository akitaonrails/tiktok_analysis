package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS6S0400100_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC724890Sc3 implements LifecycleOwner {
    public final LifecycleOwner LL;
    public final String LLILLJJLI;
    public final C01GW LLILLL;
    public final C724780Sbs LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final ThreadLocal<Assembler> LLIZ;
    public final ReentrantLock LLIZLLLIL;

    public AbstractC724890Sc3() {
        this(null, null, 3);
    }

    public abstract void LJIIIIZZ(boolean z);

    public final void LJIIJ() {
        synchronized (this) {
            try {
                LinkedBlockingQueue<Runnable> linkedBlockingQueue = LJII().LJ;
                while (this.LLILZ.LIZ.get() == 2 && (!linkedBlockingQueue.isEmpty())) {
                    linkedBlockingQueue.take().run();
                }
                if (linkedBlockingQueue.isEmpty()) {
                    this.LLILZ.LIZ.compareAndSet(2, 3);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C723820SaK LJI() {
        return (C723820SaK) this.LLILZLL.getValue();
    }

    public final C723820SaK LJII() {
        return (C723820SaK) this.LLILZIL.getValue();
    }

    public final void LJIIIZ() {
        boolean z;
        ReentrantLock reentrantLock = this.LLIZLLLIL;
        if (reentrantLock.isLocked()) {
            reentrantLock.lock();
            z = true;
        } else {
            z = false;
        }
        if (!this.LLILZ.LIZ.compareAndSet(0, 1)) {
            if (z) {
                reentrantLock.unlock();
                return;
            }
            return;
        }
        boolean z2 = C725080ScM.LJJIIJ;
        try {
            this.LLIZ.set(LJII().LIZ());
            LJIIIIZZ(true);
            if (this.LLILZ.LIZ.compareAndSet(1, 2)) {
                LJIIJ();
            }
            if (z2) {
                this.LLIZ.remove();
            } else {
                this.LLIZ.remove();
            }
            if (z) {
                reentrantLock.unlock();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (z2) {
                this.LLIZ.remove();
            }
            if (z) {
                reentrantLock.unlock();
            }
            throw th;
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (Lifecycle) this.LLILLL.getValue();
    }

    public final void LIZIZ(Fragment fragment) {
        Assembler assemblerLIZ = C0RPA.LIZ(fragment.requireActivity());
        AssemSupervisor assemSupervisorCQ2 = assemblerLIZ.CQ2(fragment);
        if (assemSupervisorCQ2 == null) {
            C723850SaN.LIZ(fragment, false, null, AFwS243S0000000_11.get$arr$(760), 3);
            assemSupervisorCQ2 = assemblerLIZ.CQ2(fragment);
            if (assemSupervisorCQ2 == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        LIZLLL(fragment, assemblerLIZ, assemSupervisorCQ2, null);
    }

    public final void LJIIL(float f) {
        if (this.LLILLJJLI == null) {
            return;
        }
        C725430Scv.LIZIZ(C725470Scz.LIZ, new C724930Sc7(this, f));
    }

    public static void LIZ(AbstractC724890Sc3 abstractC724890Sc3, Function1 function1) {
        Assembler assemblerLIZ;
        Assembler assembler = abstractC724890Sc3.LLIZ.get();
        if (abstractC724890Sc3.LLILZ.LIZ.get() == 4) {
            assemblerLIZ = abstractC724890Sc3.LJI().LIZ();
        } else {
            assemblerLIZ = abstractC724890Sc3.LJII().LIZ();
        }
        if (assembler != null && !Intrinsics.LJFF(assembler, assemblerLIZ)) {
            return;
        }
        function1.invoke(assemblerLIZ);
    }

    public AbstractC724890Sc3(LifecycleOwner lifecycleOwner, String str, int i) {
        lifecycleOwner = (i & 1) != 0 ? null : lifecycleOwner;
        str = (i & 2) != 0 ? null : str;
        this.LL = lifecycleOwner;
        this.LLILLJJLI = str;
        this.LLILLL = C452501pT.LIZIZ(new C724950Sc9(this));
        this.LLILZ = new C724780Sbs();
        this.LLILZIL = C452501pT.LIZIZ(new C724910Sc5(this));
        this.LLILZLL = C452501pT.LIZIZ(new C724900Sc4(this));
        this.LLIZ = new ThreadLocal<>();
        this.LLIZLLLIL = new ReentrantLock();
    }

    public final void LIZJ(LifecycleOwner lifecycleOwner, Assembler assembler, AssemSupervisor assemSupervisor, Function1<? super AbstractC738140SxQ, Unit> function1) {
        LJIIJJI(lifecycleOwner, assembler, assemSupervisor, LJII().LIZ(), LJII().LIZLLL, function1);
        LJII().LIZIZ();
    }

    public final boolean LIZLLL(LifecycleOwner lifecycleOwner, Assembler assembler, AssemSupervisor assemSupervisor, Function1<? super AbstractC738140SxQ, Unit> function1) {
        this.LLIZLLLIL.lock();
        boolean z = C725080ScM.LJJIIJ;
        try {
            C724780Sbs c724780Sbs = this.LLILZ;
            c724780Sbs.getClass();
            C724780Sbs c724780Sbs2 = new C724780Sbs();
            c724780Sbs2.LIZ.set(c724780Sbs.LIZ.get());
            if (this.LLILZ.LIZ.getAndSet(4) == 3) {
                LJIIJJI(lifecycleOwner, assembler, assemSupervisor, LJII().LIZ(), LJII().LIZLLL, function1);
                if (!z) {
                    LJII().LIZIZ();
                }
                LJIIL(1.0f);
                if (z) {
                    LJI().LIZIZ();
                    LJII().LIZIZ();
                }
                this.LLIZLLLIL.unlock();
                return true;
            }
            LJ(lifecycleOwner, assembler, assemSupervisor, c724780Sbs2);
            if (!z) {
                LJI().LIZIZ();
            } else {
                LJI().LIZIZ();
                LJII().LIZIZ();
            }
            this.LLIZLLLIL.unlock();
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (z) {
                LJI().LIZIZ();
                LJII().LIZIZ();
            }
            this.LLIZLLLIL.unlock();
            throw th;
        }
    }

    public final void LJ(LifecycleOwner lifecycleOwner, Assembler assembler, AssemSupervisor assemSupervisor, C724780Sbs c724780Sbs) {
        if (c724780Sbs.LIZ.get() != 0 && c724780Sbs.LIZ.get() != 1 && c724780Sbs.LIZ.get() != 5) {
            if (c724780Sbs.LIZ.get() == 2) {
                synchronized (this) {
                    try {
                        LinkedBlockingQueue<Runnable> linkedBlockingQueue = LJII().LJ;
                        AwS412S0200000_11 awS412S0200000_11 = new AwS412S0200000_11(this, (AbstractC724890Sc3) linkedBlockingQueue, (LinkedBlockingQueue<Runnable>) 84);
                        int size = linkedBlockingQueue.size();
                        awS412S0200000_11.invoke();
                        int size2 = linkedBlockingQueue.size();
                        if (size2 > 0) {
                            LJIIL(size / size2);
                        }
                        LJIIJJI(lifecycleOwner, assembler, assemSupervisor, LJII().LIZ(), LJII().LIZLLL, null);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        if (c724780Sbs.LIZ.get() == 1) {
            LJIIL(0.0f);
        }
        LJIIIIZZ(false);
        LinkedBlockingQueue<Runnable> linkedBlockingQueue2 = LJI().LJ;
        while (!linkedBlockingQueue2.isEmpty()) {
            linkedBlockingQueue2.take().run();
        }
        LJIIJJI(lifecycleOwner, assembler, assemSupervisor, LJI().LIZ(), LJI().LIZLLL, null);
    }

    public final void LJIIJJI(LifecycleOwner lifecycleOwner, Assembler assembler, AssemSupervisor assemSupervisor, Assembler assembler2, List<? extends AbstractC738140SxQ> list, Function1<? super AbstractC738140SxQ, Unit> function1) {
        C724710Sbl c724710SblBQ2 = Assembler.BQ2(assembler, lifecycleOwner);
        C0RTY c0rtyZQ2 = assembler.zQ2(lifecycleOwner);
        C724710Sbl c724710SblBQ22 = Assembler.BQ2(assembler2, this);
        C0RTY c0rtyZQ22 = assembler2.zQ2(this);
        if (c724710SblBQ2 != null && c724710SblBQ22 != null) {
            c724710SblBQ2.LIZIZ.putAll(c724710SblBQ22.LIZIZ);
            c724710SblBQ2.LIZJ.putAll(c724710SblBQ22.LIZJ);
        }
        if (c0rtyZQ2 != null && c0rtyZQ22 != null) {
            c0rtyZQ2.LIZIZ.putAll(c0rtyZQ22.LIZIZ);
        }
        for (AbstractC738140SxQ abstractC738140SxQ : (ArrayList) list) {
            if (function1 != null) {
                function1.invoke(abstractC738140SxQ);
            }
            if ((lifecycleOwner instanceof ReusedAssem) && (abstractC738140SxQ instanceof ReusedAssem)) {
                C724240Sb0.LJII(new AwS6S0400100_11(0L, assemSupervisor, (C0RTL) null, ((ReusedAssem) lifecycleOwner).LLJI, (ReusedAssem) abstractC738140SxQ, 0));
            } else {
                AbstractC724210Sax abstractC724210SaxAQ2 = assembler.AQ2(lifecycleOwner);
                assemSupervisor.LJII(abstractC738140SxQ, null);
                if (abstractC724210SaxAQ2 != null) {
                    abstractC724210SaxAQ2.LIZ(abstractC738140SxQ);
                } else {
                    assemSupervisor.LIZIZ(abstractC738140SxQ);
                }
            }
        }
        this.LLILZ.LIZ.set(5);
    }
}
