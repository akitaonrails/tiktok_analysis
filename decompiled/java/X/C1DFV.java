package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DFV, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DFV extends C09AY implements Function1<CoroutineContext.Element, AbstractC2252651DEx> {
    public C1DFV() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.1DEx, kotlin.coroutines.CoroutineContext$Element] */
    @Override // kotlin.jvm.functions.Function1
    public final AbstractC2252651DEx invoke(CoroutineContext.Element element) {
        CoroutineContext.Element element2 = element;
        if (!(element2 instanceof AbstractC2252651DEx)) {
            return null;
        }
        return element2;
    }
}
