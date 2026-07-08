package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09AB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C09AB<B extends CoroutineContext.Element, E extends B> implements InterfaceC23272099y<E> {
    public final Function1<CoroutineContext.Element, E> LL;
    public final InterfaceC23272099y<?> LLILLJJLI;

    public final boolean LIZ(InterfaceC23272099y<?> interfaceC23272099y) {
        if (interfaceC23272099y != this && this.LLILLJJLI != interfaceC23272099y) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/CoroutineContext$Element;)TE; */
    public final CoroutineContext.Element LIZIZ(CoroutineContext.Element element) {
        return (CoroutineContext.Element) this.LL.invoke(element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.099y<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext$Element, ? extends E extends B>, kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$Element, E extends B>] */
    public C09AB(InterfaceC23272099y<B> interfaceC23272099y, Function1<? super CoroutineContext.Element, ? extends E> function1) {
        this.LL = function1;
        this.LLILLJJLI = interfaceC23272099y instanceof C09AB ? (InterfaceC23272099y<B>) ((C09AB) interfaceC23272099y).LLILLJJLI : interfaceC23272099y;
    }
}
