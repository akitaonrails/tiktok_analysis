package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11P5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11P5<T, R> extends AtomicReference<InterfaceC420801kM> implements InterfaceC626120Oh8<R> {
    public static final long serialVersionUID = 3837284832786408377L;
    public final C11P4<T, R> LL;
    public final long LLILLJJLI;
    public final int LLILLL;
    public volatile InterfaceC19494911Ox<R> LLILZ;
    public volatile boolean LLILZIL;

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() throws Throwable {
        if (this.LLILLJJLI == this.LL.LLJI) {
            this.LLILZIL = true;
            this.LL.LIZIZ();
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) throws Throwable {
        C11P4<T, R> c11p4 = this.LL;
        c11p4.getClass();
        if (this.LLILLJJLI == c11p4.LLJI && c11p4.LLILZIL.addThrowable(th)) {
            if (!c11p4.LLILZ) {
                c11p4.LLIZLLLIL.dispose();
            }
            this.LLILZIL = true;
            c11p4.LIZIZ();
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(R r) throws Throwable {
        if (this.LLILLJJLI == this.LL.LLJI) {
            if (r != null) {
                this.LLILZ.offer(r);
            }
            this.LL.LIZIZ();
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) throws Throwable {
        if (C11JE.setOnce(this, interfaceC420801kM)) {
            if (interfaceC420801kM instanceof InterfaceC19495611Pe) {
                InterfaceC19495111Oz interfaceC19495111Oz = (InterfaceC19495111Oz) interfaceC420801kM;
                int iRequestFusion = interfaceC19495111Oz.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.LLILZ = interfaceC19495111Oz;
                    this.LLILZIL = true;
                    this.LL.LIZIZ();
                    return;
                } else if (iRequestFusion == 2) {
                    this.LLILZ = interfaceC19495111Oz;
                    return;
                }
            }
            this.LLILZ = new C19500111Qx(this.LLILLL);
        }
    }

    public C11P5(C11P4<T, R> c11p4, long j, int i) {
        this.LL = c11p4;
        this.LLILLJJLI = j;
        this.LLILLL = i;
    }
}
