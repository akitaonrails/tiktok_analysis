package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11P2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11P2<R> extends AtomicReference<InterfaceC420801kM> implements InterfaceC19474811He<R> {
    public static final long serialVersionUID = -3051469169682093892L;
    public final C11P3<?, R> LL;

    public C11P2(C11P3<?, R> c11p3) {
        this.LL = c11p3;
    }

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        C11P3<?, R> c11p3 = this.LL;
        if (c11p3.LLILLL.addThrowable(th)) {
            if (c11p3.LLILZLL != EnumC19492211Nw.END) {
                c11p3.LLIZ.dispose();
            }
            c11p3.LLJIJIL = 0;
            c11p3.LIZ();
            return;
        }
        C19489211Ms.LIZIZ(th);
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.replace(this, interfaceC420801kM);
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(R r) {
        C11P3<?, R> c11p3 = this.LL;
        c11p3.LLJI = r;
        c11p3.LLJIJIL = 2;
        c11p3.LIZ();
    }
}
