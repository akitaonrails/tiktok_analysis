package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xwi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838620xwi {
    public static final InterfaceC1838630xwj LIZ(CoroutineContext coroutineContext) {
        InterfaceC1838630xwj interfaceC1838630xwj = (InterfaceC1838630xwj) coroutineContext.get(InterfaceC1838630xwj.LIZJ);
        if (interfaceC1838630xwj != null) {
            return interfaceC1838630xwj;
        }
        "A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString();
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object LIZIZ(InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        return LIZ(interfaceC1364105Vn.getContext()).LJLZ(interfaceC1364105Vn, function1);
    }
}
