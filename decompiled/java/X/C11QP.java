package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.11QP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11QP<T, R> extends AtomicInteger implements C11PF<T>, C11QS<R>, C11LR {
    public static final long serialVersionUID = -3511336836796789179L;
    public final InterfaceC1487280oo2<? super T, ? extends C11LE<? extends R>> LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public C11LR LLILZIL;
    public int LLILZLL;
    public InterfaceC19494911Ox<T> LLIZ;
    public volatile boolean LLIZLLLIL;
    public volatile boolean LLJ;
    public volatile boolean LLJIJIL;
    public int LLJILJIL;
    public final C11QQ<R> LL = new C11QQ<>(this);
    public final C19487711Md LLJI = new C19487711Md();

    public abstract void LIZLLL();

    public abstract void LJ();

    @Override // X.C11M9
    public final void onComplete() {
        this.LLIZLLLIL = true;
        LIZLLL();
    }

    @Override // X.C11M9
    public final void onNext(T t) {
        if (this.LLJILJIL != 2 && !this.LLIZ.offer(t)) {
            this.LLILZIL.cancel();
            onError(new IllegalStateException("Queue full?!"));
        } else {
            LIZLLL();
        }
    }

    @Override // X.C11PF, X.C11M9
    public final void onSubscribe(C11LR c11lr) {
        if (C11NC.validate(this.LLILZIL, c11lr)) {
            this.LLILZIL = c11lr;
            if (c11lr instanceof InterfaceC19495511Pd) {
                InterfaceC19495111Oz interfaceC19495111Oz = (InterfaceC19495111Oz) c11lr;
                int iRequestFusion = interfaceC19495111Oz.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.LLJILJIL = iRequestFusion;
                    this.LLIZ = interfaceC19495111Oz;
                    this.LLIZLLLIL = true;
                    LJ();
                    LIZLLL();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.LLJILJIL = iRequestFusion;
                    this.LLIZ = interfaceC19495111Oz;
                    LJ();
                    c11lr.request(this.LLILLL);
                    return;
                }
            }
            this.LLIZ = new C19500211Qy(this.LLILLL);
            LJ();
            c11lr.request(this.LLILLL);
        }
    }

    public C11QP(InterfaceC1487280oo2<? super T, ? extends C11LE<? extends R>> interfaceC1487280oo2, int i) {
        this.LLILLJJLI = interfaceC1487280oo2;
        this.LLILLL = i;
        this.LLILZ = i - (i >> 2);
    }
}
