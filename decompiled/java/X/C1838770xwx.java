package X;

import android.graphics.Bitmap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838770xwx implements CoroutineContext.Element {
    public static final C1838780xwy LLILLL = new InterfaceC23272099y<C1838770xwx>() { // from class: X.0xwy
    };
    public C1840320xzS LL;
    public Bitmap LLILLJJLI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefreshWidgetContext(storyWidgetBean=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", storyWidgetBitmap=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final InterfaceC23272099y<?> getKey() {
        return LLILLL;
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

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) C09A1.LIZ(this, r, function2);
    }
}
