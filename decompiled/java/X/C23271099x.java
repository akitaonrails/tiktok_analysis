package X;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.099x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23271099x implements CoroutineContext, Serializable {
    public static final C23271099x INSTANCE = new C23271099x();
    public static final long serialVersionUID = 0;

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return r;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return coroutineContext;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    private final Object readResolve() {
        return INSTANCE;
    }
}
