package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.099b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23249099b<T> extends C099Z<T> {
    public static final AtomicIntegerFieldUpdater LLILZIL = AtomicIntegerFieldUpdater.newUpdater(C23249099b.class, "_decision");
    public volatile int _decision;

    @Override // X.C099Z, kotlinx.coroutines.JobSupport
    public final void LJJIII(Object obj) {
        LJLIL(obj);
    }

    @Override // X.C099Z, X.C099D
    public final void LJLIL(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LLILZIL;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    C2252641DEw.LIZ(C23248099a.LIZ(obj), null, C099M.LIZLLL(this.LLILZ));
                    return;
                } else {
                    "Already resumed".toString();
                    throw new IllegalStateException("Already resumed");
                }
            }
        } while (!LLILZIL.compareAndSet(this, 0, 2));
    }

    public C23249099b(InterfaceC1364105Vn interfaceC1364105Vn, CoroutineContext coroutineContext) {
        super(interfaceC1364105Vn, coroutineContext);
    }
}
