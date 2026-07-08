package X;

import Y.AgS72S0400000_3;

/* JADX INFO: renamed from: X.094g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {30}, m = "emit")
public final class C23124094g extends AbstractC23140094w {
    public AgS72S0400000_3 LL;
    public Object LLILLJJLI;
    public C09AE LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AgS72S0400000_3<T> LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C23124094g(AgS72S0400000_3<? super T> agS72S0400000_3, InterfaceC1364105Vn<? super C23124094g> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = agS72S0400000_3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        return this.LLILZIL.emit(null, this);
    }
}
