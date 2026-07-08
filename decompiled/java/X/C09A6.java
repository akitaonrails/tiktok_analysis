package X;

import Y.AObjectS160S0000000_3;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.09A6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09A6 {
    public static CoroutineContext LIZIZ(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        if (coroutineContext2 != C23271099x.INSTANCE) {
            return (CoroutineContext) coroutineContext2.fold(coroutineContext, new AObjectS160S0000000_3(2));
        }
        return coroutineContext;
    }

    public static CoroutineContext LIZJ(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(element.getKey());
        C23271099x c23271099x = C23271099x.INSTANCE;
        if (coroutineContextMinusKey != c23271099x) {
            C23138094u c23138094u = InterfaceC23139094v.LJJLIIJ;
            CoroutineContext.Element element2 = coroutineContextMinusKey.get(c23138094u);
            if (element2 == null) {
                return new C09A7(coroutineContextMinusKey, element);
            }
            CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(c23138094u);
            if (coroutineContextMinusKey2 == c23271099x) {
                return new C09A7(element, element2);
            }
            return new C09A7(new C09A7(coroutineContextMinusKey2, element), element2);
        }
        return element;
    }
}
