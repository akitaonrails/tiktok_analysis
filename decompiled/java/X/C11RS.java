package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11RS, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11RS<T> extends AnonymousClass0984<T> implements InterfaceC19501111Rh {
    public static final C19500511Rb LLILZIL = new InterfaceC19500611Rc<Object>() { // from class: X.11Rb
        @Override // X.InterfaceC19500611Rc
        public final C11RY<Object> call() {
            return new C11RV();
        }
    };
    public final C098D<T> LL;
    public final AtomicReference<C11RU<T>> LLILLJJLI;
    public final InterfaceC19500611Rc<T> LLILLL;
    public final C098D<T> LLILZ;

    public static C11RS LJLZ(C098D c098d) {
        C19500511Rb c19500511Rb = LLILZIL;
        AtomicReference atomicReference = new AtomicReference();
        return new C11RS(new C11RT(atomicReference, c19500511Rb), c098d, atomicReference, c19500511Rb);
    }

    @Override // X.InterfaceC19501111Rh
    public final void LIZ(InterfaceC420801kM interfaceC420801kM) {
        AtomicReference<C11RU<T>> atomicReference = this.LLILLJJLI;
        while (!atomicReference.compareAndSet(interfaceC420801kM, null) && atomicReference.get() == interfaceC420801kM) {
        }
    }

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        this.LLILZ.LIZIZ(interfaceC626120Oh8);
    }

    @Override // X.AnonymousClass0984
    public final void LJLLLLLL(C09JN<? super InterfaceC420801kM> c09jn) throws Throwable {
        C11RU<T> c11ru;
        boolean z;
        loop0: while (true) {
            c11ru = this.LLILLJJLI.get();
            if (c11ru != null && !c11ru.isDisposed()) {
                break;
            }
            C11RU<T> c11ru2 = new C11RU<>(this.LLILLL.call());
            AtomicReference<C11RU<T>> atomicReference = this.LLILLJJLI;
            while (!atomicReference.compareAndSet(c11ru, c11ru2)) {
                if (atomicReference.get() != c11ru) {
                    break;
                }
            }
            c11ru = c11ru2;
            break loop0;
        }
        if (!c11ru.LLILZ.get() && c11ru.LLILZ.compareAndSet(false, true)) {
            z = true;
        } else {
            z = false;
        }
        try {
            c09jn.accept(c11ru);
            if (z) {
                this.LL.LIZIZ(c11ru);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (z) {
                c11ru.LLILZ.compareAndSet(true, false);
            }
            C11SP.LIZ(th);
            throw C11QG.LIZIZ(th);
        }
    }

    public C11RS(C11RT c11rt, C098D c098d, AtomicReference atomicReference, InterfaceC19500611Rc interfaceC19500611Rc) {
        this.LLILZ = c11rt;
        this.LL = c098d;
        this.LLILLJJLI = atomicReference;
        this.LLILLL = interfaceC19500611Rc;
    }
}
