package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09A2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09A2 extends C09AY implements Function2<C09AT<?>, CoroutineContext.Element, C09AT<?>> {
    public C09A2() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.09AT<?>, kotlin.coroutines.CoroutineContext$Element] */
    @Override // kotlin.jvm.functions.Function2
    public final C09AT<?> invoke(C09AT<?> c09at, CoroutineContext.Element element) {
        CoroutineContext.Element element2 = element;
        if (c09at == null) {
            if (element2 instanceof C09AT) {
                return element2;
            }
            return null;
        }
        return c09at;
    }
}
