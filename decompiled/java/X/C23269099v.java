package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.099v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23269099v<T> implements C09AT<T> {
    public final T LL;
    public final ThreadLocal<T> LLILLJJLI;
    public final C1995707rn LLILLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThreadLocal(value=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", threadLocal = ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final InterfaceC23272099y<?> getKey() {
        return this.LLILLL;
    }

    @Override // X.C09AT
    public final void LJIJJ(Object obj) {
        this.LLILLJJLI.set(obj);
    }

    @Override // X.C09AT
    public final T LJJLIIIJ(CoroutineContext coroutineContext) {
        T t = this.LLILLJJLI.get();
        this.LLILLJJLI.set(this.LL);
        return t;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
        if (Intrinsics.LJFF(this.LLILLL, interfaceC23272099y)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
        if (Intrinsics.LJFF(this.LLILLL, interfaceC23272099y)) {
            return C23271099x.INSTANCE;
        }
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return C09A1.LIZLLL(this, coroutineContext);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.07rn] */
    public C23269099v(T t, final ThreadLocal<T> threadLocal) {
        this.LL = t;
        this.LLILLJJLI = threadLocal;
        this.LLILLL = new InterfaceC23272099y<C23269099v<?>>(threadLocal) { // from class: X.07rn
            public final ThreadLocal<?> LL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1995707rn) && Intrinsics.LJFF(this.LL, ((C1995707rn) obj).LL);
            }

            public final int hashCode() {
                return this.LL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ThreadLocalKey(threadLocal=");
                sbLIZ.append(this.LL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LL = threadLocal;
            }
        };
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) C09A1.LIZ(this, r, function2);
    }
}
