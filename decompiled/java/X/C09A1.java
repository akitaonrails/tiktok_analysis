package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09A1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09A1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static <E extends CoroutineContext.Element> E LIZIZ(CoroutineContext.Element element, InterfaceC23272099y<E> interfaceC23272099y) {
        if (!Intrinsics.LJFF(element.getKey(), interfaceC23272099y)) {
            return null;
        }
        return element;
    }

    public static CoroutineContext LIZJ(CoroutineContext.Element element, InterfaceC23272099y<?> interfaceC23272099y) {
        if (Intrinsics.LJFF(element.getKey(), interfaceC23272099y)) {
            return C23271099x.INSTANCE;
        }
        return element;
    }

    public static CoroutineContext LIZLLL(CoroutineContext.Element element, CoroutineContext coroutineContext) {
        return C09A6.LIZIZ(element, coroutineContext);
    }

    public static <R> R LIZ(CoroutineContext.Element element, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return function2.invoke(r, element);
    }
}
