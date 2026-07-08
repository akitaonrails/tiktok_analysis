package X;

import java.util.Collection;

/* JADX INFO: renamed from: X.09IM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", l = {26}, m = "toCollection")
public final class C09IM<T, C extends Collection<? super T>> extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public int LLILLL;

    public C09IM(InterfaceC1364105Vn<? super C09IM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return C09IC.LJJIJLIJ(null, null, this);
    }
}
