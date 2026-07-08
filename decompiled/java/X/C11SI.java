package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.11SI, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11SI<T, U extends Collection<? super T>> extends C11SK<T, U, U> implements Runnable, InterfaceC420801kM {
    public final Callable<U> LLILZLL;
    public final long LLIZ;
    public final long LLIZLLLIL;
    public final TimeUnit LLJ;
    public final C11RN LLJI;
    public final List<U> LLJIJIL;
    public InterfaceC420801kM LLJILJIL;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        ArrayList arrayList;
        synchronized (this) {
            try {
                arrayList = new ArrayList(this.LLJIJIL);
                ((LinkedList) this.LLJIJIL).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.LLILLL.offer((U) it2.next());
        }
        this.LLILZIL = true;
        if (LIZIZ()) {
            C11SN.LIZIZ(this.LLILLL, this.LLILLJJLI, this.LLJI, this);
        }
    }

    public final void LIZLLL() throws Throwable {
        if (this.LLILZ) {
            return;
        }
        try {
            U uCall = this.LLILZLL.call();
            C1701890uOB.LIZ(uCall, "The bufferSupplier returned a null buffer");
            final U u = uCall;
            synchronized (this) {
                try {
                    if (this.LLILZ) {
                        return;
                    }
                    ((LinkedList) this.LLJIJIL).add(u);
                    this.LLJI.LIZJ(new Runnable(u) { // from class: X.11SL

                        /* JADX INFO: Incorrect field signature: TU; */
                        public final Collection LL;

                        public final void LIZ() {
                            synchronized (this.LLILLJJLI) {
                                try {
                                    ((LinkedList) this.LLILLJJLI.LLJIJIL).remove(this.LL);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            C11SI c11si = this.LLILLJJLI;
                            c11si.LIZJ(this.LL, c11si.LLJI);
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

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.LL = u;
                        }
                    }, this.LLIZ, this.LLJ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C11SP.LIZ(th2);
            this.LLILLJJLI.onError(th2);
            dispose();
        }
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        synchronized (this) {
            try {
                ((LinkedList) this.LLJIJIL).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLJILJIL.dispose();
        this.LLJI.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZLLL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        this.LLILZIL = true;
        synchronized (this) {
            try {
                ((LinkedList) this.LLJIJIL).clear();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        this.LLILLJJLI.onError(th);
        this.LLJI.dispose();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) {
        synchronized (this) {
            try {
                Iterator<U> it2 = this.LLJIJIL.iterator();
                while (it2.hasNext()) {
                    it2.next().add(t);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) throws Throwable {
        if (C11JE.validate(this.LLJILJIL, interfaceC420801kM)) {
            this.LLJILJIL = interfaceC420801kM;
            try {
                U uCall = this.LLILZLL.call();
                C1701890uOB.LIZ(uCall, "The buffer supplied is null");
                final U u = uCall;
                ((LinkedList) this.LLJIJIL).add(u);
                this.LLILLJJLI.onSubscribe(this);
                C11RN c11rn = this.LLJI;
                long j = this.LLIZLLLIL;
                c11rn.LIZLLL(this, j, j, this.LLJ);
                this.LLJI.LIZJ(new Runnable(u) { // from class: X.11SM

                    /* JADX INFO: Incorrect field signature: TU; */
                    public final Collection LL;

                    public final void LIZ() {
                        synchronized (this.LLILLJJLI) {
                            try {
                                ((LinkedList) this.LLILLJJLI.LLJIJIL).remove(this.LL);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        C11SI c11si = this.LLILLJJLI;
                        c11si.LIZJ(this.LL, c11si.LLJI);
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

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LL = u;
                    }
                }, this.LLIZ, this.LLJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C11SP.LIZ(th);
                interfaceC420801kM.dispose();
                C11JT.error(th, this.LLILLJJLI);
                this.LLJI.dispose();
            }
        }
    }

    @Override // X.C11SK, X.C11SO
    public final void LIZ(InterfaceC626120Oh8 interfaceC626120Oh8, Object obj) {
        interfaceC626120Oh8.onNext(obj);
    }

    public C11SI(C11PI c11pi, Callable callable, long j, long j2, TimeUnit timeUnit, C11RN c11rn) {
        super(c11pi, new C19501711Rn());
        this.LLILZLL = callable;
        this.LLIZ = j;
        this.LLIZLLLIL = j2;
        this.LLJ = timeUnit;
        this.LLJI = c11rn;
        this.LLJIJIL = new LinkedList();
    }
}
