package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Mc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19487611Mc extends AtomicReference<InterfaceC420801kM> implements C11IY {
    public static final long serialVersionUID = -8003404460084760287L;
    public final C19487511Mb<?> LL;

    @Override // X.C11IY
    public final void onComplete() {
        C19487511Mb<?> c19487511Mb = this.LL;
        AtomicReference<C19487611Mc> atomicReference = c19487511Mb.LLILZIL;
        while (!atomicReference.compareAndSet(this, null)) {
            if (atomicReference.get() != this) {
                return;
            }
        }
        if (c19487511Mb.LLILZLL) {
            Throwable thTerminate = c19487511Mb.LLILZ.terminate();
            if (thTerminate == null) {
                c19487511Mb.LL.onComplete();
            } else {
                c19487511Mb.LL.onError(thTerminate);
            }
        }
    }

    public C19487611Mc(C19487511Mb<?> c19487511Mb) {
        this.LL = c19487511Mb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        X.C19489211Ms.LIZIZ(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        return;
     */
    @Override // X.C11IY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            X.11Mb<?> r2 = r3.LL
            java.util.concurrent.atomic.AtomicReference<X.11Mc> r1 = r2.LLILZIL
        L4:
            r0 = 0
            boolean r0 = r1.compareAndSet(r3, r0)
            if (r0 == 0) goto L3a
            X.11Md r0 = r2.LLILZ
            boolean r0 = r0.addThrowable(r4)
            if (r0 == 0) goto L40
            boolean r0 = r2.LLILLL
            if (r0 == 0) goto L27
            boolean r0 = r2.LLILZLL
            if (r0 == 0) goto L26
            X.11Md r0 = r2.LLILZ
            java.lang.Throwable r1 = r0.terminate()
            X.11IY r0 = r2.LL
            r0.onError(r1)
        L26:
            return
        L27:
            r2.dispose()
            X.11Md r0 = r2.LLILZ
            java.lang.Throwable r1 = r0.terminate()
            X.11NG r0 = X.C11QG.LIZ
            if (r1 == r0) goto L26
            X.11IY r0 = r2.LL
            r0.onError(r1)
            return
        L3a:
            java.lang.Object r0 = r1.get()
            if (r0 == r3) goto L4
        L40:
            X.C19489211Ms.LIZIZ(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19487611Mc.onError(java.lang.Throwable):void");
    }

    @Override // X.C11IY
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        C11JE.setOnce(this, interfaceC420801kM);
    }
}
