package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11P4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11P4<T, R> extends AtomicInteger implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final C11P5<Object, Object> LLJIJIL;
    public static final long serialVersionUID = -3491074160481096299L;
    public final InterfaceC626120Oh8<? super R> LL;
    public final InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public volatile boolean LLILZLL;
    public volatile boolean LLIZ;
    public InterfaceC420801kM LLIZLLLIL;
    public volatile long LLJI;
    public final AtomicReference<C11P5<T, R>> LLJ = new AtomicReference<>();
    public final C19487711Md LLILZIL = new C19487711Md();

    static {
        C11P5<Object, Object> c11p5 = new C11P5<>(null, -1L, 1);
        LLJIJIL = c11p5;
        C11JE.dispose(c11p5);
    }

    public final void LIZ() {
        C11P5<T, R> andSet;
        C11P5<T, R> c11p5 = this.LLJ.get();
        C11P5<Object, Object> c11p52 = LLJIJIL;
        if (c11p5 == c11p52 || (andSet = this.LLJ.getAndSet((C11P5<T, R>) c11p52)) == c11p52 || andSet == null) {
            return;
        }
        C11JE.dispose(andSet);
    }

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        this.LLIZLLLIL.dispose();
        LIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() throws Throwable {
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        LIZIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x000f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11P4.LIZIZ():void");
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) throws Throwable {
        if (!this.LLILZLL && this.LLILZIL.addThrowable(th)) {
            if (!this.LLILZ) {
                LIZ();
            }
            this.LLILZLL = true;
            LIZIZ();
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(T t) throws Throwable {
        long j = this.LLJI + 1;
        this.LLJI = j;
        C11P5<T, R> c11p5 = this.LLJ.get();
        if (c11p5 != null) {
            C11JE.dispose(c11p5);
        }
        try {
            C098D<? extends R> c098dApply = this.LLILLJJLI.apply(t);
            C1701890uOB.LIZ(c098dApply, "The ObservableSource returned is null");
            C098D<? extends R> c098d = c098dApply;
            C11P5<T, R> c11p52 = new C11P5<>(this, j, this.LLILLL);
            while (true) {
                C11P5<T, R> c11p53 = this.LLJ.get();
                if (c11p53 != LLJIJIL) {
                    AtomicReference<C11P5<T, R>> atomicReference = this.LLJ;
                    while (!atomicReference.compareAndSet(c11p53, c11p52)) {
                        if (atomicReference.get() != c11p53) {
                            break;
                        }
                    }
                    c098d.LIZIZ(c11p52);
                    return;
                }
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C11SP.LIZ(th);
            this.LLIZLLLIL.dispose();
            onError(th);
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        if (C11JE.validate(this.LLIZLLLIL, interfaceC420801kM)) {
            this.LLIZLLLIL = interfaceC420801kM;
            this.LL.onSubscribe(this);
        }
    }

    public C11P4(InterfaceC626120Oh8<? super R> interfaceC626120Oh8, InterfaceC1487280oo2<? super T, ? extends C098D<? extends R>> interfaceC1487280oo2, int i, boolean z) {
        this.LL = interfaceC626120Oh8;
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILLL = i;
        this.LLILZ = z;
    }
}
