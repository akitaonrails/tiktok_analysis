package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.11Qt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19499711Qt<T, K> extends AtomicInteger implements InterfaceC420801kM, C098D<T> {
    public static final long serialVersionUID = -3852313036005250360L;
    public final K LL;
    public final C19500111Qx<T> LLILLJJLI;
    public final C19499811Qu<?, K, T> LLILLL;
    public final boolean LLILZ;
    public volatile boolean LLILZIL;
    public Throwable LLILZLL;
    public final AtomicBoolean LLIZ = new AtomicBoolean();
    public final AtomicBoolean LLIZLLLIL = new AtomicBoolean();
    public final AtomicReference<InterfaceC626120Oh8<? super T>> LLJ = new AtomicReference<>();

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        if (this.LLIZ.compareAndSet(false, true) && getAndIncrement() == 0) {
            this.LLJ.lazySet(null);
            this.LLILLL.cancel(this.LL);
        }
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLIZ.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r9.LLIZ.get() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r9.LLILLJJLI.clear();
        r9.LLILLL.cancel(r9.LL);
        r9.LLJ.lazySet(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r1 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r3 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r1 = r9.LLILZLL;
        r9.LLJ.lazySet(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        r6.onError(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        r1 = r9.LLILZLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        r9.LLILLJJLI.clear();
        r9.LLJ.lazySet(null);
        r6.onError(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r3 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        r9.LLJ.lazySet(null);
        r6.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r3 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        r5 = addAndGet(-r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r5 != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r6 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
    
        r6.onNext(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        r6.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r6 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        r1 = r9.LLILZIL;
        r4 = r8.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r4 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Path cross not found for [B:47:?, B:30:0x006e], limit reached: 48 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0076 -> B:7:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r9 = this;
            int r0 = r9.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            X.11Qx<T> r8 = r9.LLILLJJLI
            boolean r7 = r9.LLILZ
            java.util.concurrent.atomic.AtomicReference<X.0Oh8<? super T>> r0 = r9.LLJ
            java.lang.Object r6 = r0.get()
            X.0Oh8 r6 = (X.InterfaceC626120Oh8) r6
            r5 = 1
        L14:
            if (r6 == 0) goto L6e
        L16:
            boolean r1 = r9.LLILZIL
            java.lang.Object r4 = r8.poll()
            if (r4 != 0) goto L6a
            r3 = 1
        L1f:
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.LLIZ
            boolean r0 = r0.get()
            r2 = 0
            if (r0 == 0) goto L3a
            X.11Qx<T> r0 = r9.LLILLJJLI
            r0.clear()
            X.11Qu<?, K, T> r1 = r9.LLILLL
            K r0 = r9.LL
            r1.cancel(r0)
            java.util.concurrent.atomic.AtomicReference<X.0Oh8<? super T>> r0 = r9.LLJ
            r0.lazySet(r2)
            return
        L3a:
            if (r1 == 0) goto L6c
            if (r7 == 0) goto L4d
            if (r3 == 0) goto L81
            java.lang.Throwable r1 = r9.LLILZLL
            java.util.concurrent.atomic.AtomicReference<X.0Oh8<? super T>> r0 = r9.LLJ
            r0.lazySet(r2)
            if (r1 == 0) goto L85
            r6.onError(r1)
            return
        L4d:
            java.lang.Throwable r1 = r9.LLILZLL
            if (r1 == 0) goto L5f
            X.11Qx<T> r0 = r9.LLILLJJLI
            r0.clear()
            java.util.concurrent.atomic.AtomicReference<X.0Oh8<? super T>> r0 = r9.LLJ
            r0.lazySet(r2)
            r6.onError(r1)
            return
        L5f:
            if (r3 == 0) goto L81
            java.util.concurrent.atomic.AtomicReference<X.0Oh8<? super T>> r0 = r9.LLJ
            r0.lazySet(r2)
            r6.onComplete()
            return
        L6a:
            r3 = 0
            goto L1f
        L6c:
            if (r3 == 0) goto L81
        L6e:
            int r0 = -r5
            int r5 = r9.addAndGet(r0)
            if (r5 != 0) goto L76
            return
        L76:
            if (r6 != 0) goto L16
            java.util.concurrent.atomic.AtomicReference<X.0Oh8<? super T>> r0 = r9.LLJ
            java.lang.Object r6 = r0.get()
            X.0Oh8 r6 = (X.InterfaceC626120Oh8) r6
            goto L14
        L81:
            r6.onNext(r4)
            goto L16
        L85:
            r6.onComplete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19499711Qt.LIZ():void");
    }

    @Override // X.C098D
    public final void LIZIZ(InterfaceC626120Oh8<? super T> interfaceC626120Oh8) {
        if (this.LLIZLLLIL.compareAndSet(false, true)) {
            interfaceC626120Oh8.onSubscribe(this);
            this.LLJ.lazySet(interfaceC626120Oh8);
            if (this.LLIZ.get()) {
                this.LLJ.lazySet(null);
                return;
            } else {
                LIZ();
                return;
            }
        }
        C11JT.error(new IllegalStateException("Only one Observer allowed!"), interfaceC626120Oh8);
    }

    public C19499711Qt(int i, C19499811Qu<?, K, T> c19499811Qu, K k, boolean z) {
        this.LLILLJJLI = new C19500111Qx<>(i);
        this.LLILLL = c19499811Qu;
        this.LL = k;
        this.LLILZ = z;
    }
}
