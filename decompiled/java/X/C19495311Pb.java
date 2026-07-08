package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Pb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19495311Pb<T> extends AtomicReference<InterfaceC420801kM> implements InterfaceC626120Oh8<T>, InterfaceC420801kM {
    public static final long serialVersionUID = -5417183359794346637L;
    public final C0V0G<T> LL;
    public final int LLILLJJLI;
    public InterfaceC19494911Ox<T> LLILLL;
    public volatile boolean LLILZ;
    public int LLILZIL;

    public void setDone() {
        this.LLILZ = true;
    }

    @Override // X.InterfaceC626120Oh8
    public void onComplete() {
        C19495211Pa c19495211Pa = (C19495211Pa) this.LL;
        c19495211Pa.getClass();
        setDone();
        c19495211Pa.LIZIZ();
    }

    @Override // X.InterfaceC420801kM
    public boolean isDisposed() {
        return C11JE.isDisposed(get());
    }

    @Override // X.InterfaceC420801kM
    public void dispose() {
        C11JE.dispose(this);
    }

    public int fusionMode() {
        return this.LLILZIL;
    }

    public boolean isDone() {
        return this.LLILZ;
    }

    public InterfaceC19494911Ox<T> queue() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC626120Oh8
    public void onError(Throwable th) {
        C19495211Pa c19495211Pa = (C19495211Pa) this.LL;
        if (c19495211Pa.LLILZLL.addThrowable(th)) {
            if (c19495211Pa.LLILZIL == EnumC19492211Nw.IMMEDIATE) {
                c19495211Pa.LLJ.dispose();
            }
            setDone();
            c19495211Pa.LIZIZ();
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC626120Oh8
    public void onNext(T t) {
        if (this.LLILZIL == 0) {
            C19495211Pa c19495211Pa = (C19495211Pa) this.LL;
            c19495211Pa.getClass();
            queue().offer(t);
            c19495211Pa.LIZIZ();
            return;
        }
        ((C19495211Pa) this.LL).LIZIZ();
    }

    @Override // X.InterfaceC626120Oh8
    public void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        InterfaceC19494911Ox<T> c19500211Qy;
        if (C11JE.setOnce(this, interfaceC420801kM)) {
            if (interfaceC420801kM instanceof InterfaceC19495611Pe) {
                InterfaceC19495111Oz interfaceC19495111Oz = (InterfaceC19495111Oz) interfaceC420801kM;
                int iRequestFusion = interfaceC19495111Oz.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.LLILZIL = iRequestFusion;
                    this.LLILLL = interfaceC19495111Oz;
                    this.LLILZ = true;
                    C19495211Pa c19495211Pa = (C19495211Pa) this.LL;
                    c19495211Pa.getClass();
                    setDone();
                    c19495211Pa.LIZIZ();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.LLILZIL = iRequestFusion;
                    this.LLILLL = interfaceC19495111Oz;
                    return;
                }
            }
            int i = -this.LLILLJJLI;
            if (i < 0) {
                c19500211Qy = new C19500111Qx<>(-i);
            } else {
                c19500211Qy = new C19500211Qy<>(i);
            }
            this.LLILLL = c19500211Qy;
        }
    }

    public C19495311Pb(C0V0G<T> c0v0g, int i) {
        this.LL = c0v0g;
        this.LLILLJJLI = i;
    }
}
