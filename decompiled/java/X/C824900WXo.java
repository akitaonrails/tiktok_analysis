package X;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0WXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824900WXo implements CoroutineContext.Element {
    public static final C824910WXp LLILZ = new InterfaceC23272099y<C824900WXo>() { // from class: X.0WXp
    };
    public final C09AE LL;
    public final InterfaceC23139094v LLILLJJLI;
    public final AtomicInteger LLILLL = new AtomicInteger(0);

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final InterfaceC23272099y<C824900WXo> getKey() {
        return LLILZ;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
        return (E) C09A1.LIZIZ(this, interfaceC23272099y);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
        return C09A1.LIZJ(this, interfaceC23272099y);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return C09A1.LIZLLL(this, coroutineContext);
    }

    public C824900WXo(InterfaceC1841670y1d interfaceC1841670y1d, InterfaceC23139094v interfaceC23139094v) {
        this.LL = interfaceC1841670y1d;
        this.LLILLJJLI = interfaceC23139094v;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) C09A1.LIZ(this, r, function2);
    }
}
