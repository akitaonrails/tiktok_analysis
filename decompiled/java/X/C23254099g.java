package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.099g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23254099g extends C09AY implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {
    public final /* synthetic */ C259800zU<CoroutineContext> LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23254099g(C259800zU<CoroutineContext> c259800zU, boolean z) {
        super(2);
        this.LL = c259800zU;
        this.LLILLJJLI = z;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlin.coroutines.CoroutineContext] */
    @Override // kotlin.jvm.functions.Function2
    public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        CoroutineContext coroutineContext2 = coroutineContext;
        CoroutineContext.Element element2 = element;
        if (!(element2 instanceof InterfaceC23255099h)) {
            return coroutineContext2.plus(element2);
        }
        if (this.LL.element.get(element2.getKey()) == null) {
            InterfaceC23255099h interfaceC23255099hLJJLIIJ = (InterfaceC23255099h) element2;
            if (this.LLILLJJLI) {
                interfaceC23255099hLJJLIIJ = interfaceC23255099hLJJLIIJ.LJJLIIJ();
            }
            return coroutineContext2.plus(interfaceC23255099hLJJLIIJ);
        }
        C259800zU<CoroutineContext> c259800zU = this.LL;
        c259800zU.element = c259800zU.element.minusKey(element2.getKey());
        return coroutineContext2.plus(((InterfaceC23255099h) element2).LJJJ());
    }
}
