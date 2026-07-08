package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.099m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23260099m<T> implements InterfaceC1364105Vn<T>, InterfaceC23256099i {
    public static final C23261099n LLILLJJLI = new Object() { // from class: X.099n
    };
    public static final AtomicReferenceFieldUpdater<C23260099m<?>, Object> LLILLL = AtomicReferenceFieldUpdater.newUpdater(C23260099m.class, Object.class, "result");
    public final InterfaceC1364105Vn<T> LL;
    public volatile Object result;

    public final Object LIZ() {
        Object obj = this.result;
        C099S c099s = C099S.UNDECIDED;
        if (obj == c099s) {
            AtomicReferenceFieldUpdater<C23260099m<?>, Object> atomicReferenceFieldUpdater = LLILLL;
            Object objLJFF = C099R.LJFF();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c099s, objLJFF)) {
                if (atomicReferenceFieldUpdater.get(this) != c099s) {
                    obj = this.result;
                }
            }
            return C099R.LJFF();
        }
        if (obj == C099S.RESUMED) {
            return C099R.LJFF();
        }
        if (obj instanceof C098200Yq) {
            throw ((C098200Yq) obj).exception;
        }
        return obj;
    }

    @Override // X.InterfaceC23256099i
    public InterfaceC23256099i getCallerFrame() {
        InterfaceC1364105Vn<T> interfaceC1364105Vn = this.LL;
        if (interfaceC1364105Vn instanceof InterfaceC23256099i) {
            return (InterfaceC23256099i) interfaceC1364105Vn;
        }
        return null;
    }

    @Override // X.InterfaceC1364105Vn
    public CoroutineContext getContext() {
        return this.LL.getContext();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SafeContinuation for ");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C23260099m(InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        this(interfaceC1364105Vn, C099S.UNDECIDED);
    }

    @Override // X.InterfaceC1364105Vn
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            C099S c099s = C099S.UNDECIDED;
            if (obj2 == c099s) {
                AtomicReferenceFieldUpdater<C23260099m<?>, Object> atomicReferenceFieldUpdater = LLILLL;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c099s, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != c099s) {
                        break;
                    }
                }
                return;
            }
            if (obj2 == C099R.LJFF()) {
                AtomicReferenceFieldUpdater<C23260099m<?>, Object> atomicReferenceFieldUpdater2 = LLILLL;
                Object objLJFF = C099R.LJFF();
                C099S c099s2 = C099S.RESUMED;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, objLJFF, c099s2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != objLJFF) {
                        break;
                    }
                }
                this.LL.resumeWith(obj);
                return;
            }
            throw new IllegalStateException("Already resumed");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C23260099m(InterfaceC1364105Vn<? super T> interfaceC1364105Vn, Object obj) {
        this.LL = interfaceC1364105Vn;
        this.result = obj;
    }
}
