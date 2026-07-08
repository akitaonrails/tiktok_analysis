package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DFW, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DFW extends C09AY implements Function1<CoroutineContext.Element, C1DFT> {
    public C1DFW() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.1DFT, kotlin.coroutines.CoroutineContext$Element] */
    @Override // kotlin.jvm.functions.Function1
    public final C1DFT invoke(CoroutineContext.Element element) {
        CoroutineContext.Element element2 = element;
        if (!(element2 instanceof C1DFT)) {
            return null;
        }
        return element2;
    }
}
