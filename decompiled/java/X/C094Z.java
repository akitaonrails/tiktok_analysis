package X;

import Y.AgS72S0400000_3;

/* JADX INFO: renamed from: X.094Z, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", l = {66}, m = "emit")
public final class C094Z extends AbstractC23140094w {
    public AgS72S0400000_3 LL;
    public InterfaceC346201Wa LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AgS72S0400000_3<T> LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C094Z(AgS72S0400000_3<? super T> agS72S0400000_3, InterfaceC1364105Vn<? super C094Z> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = agS72S0400000_3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        return this.LLILZ.LIZ$0(null, this);
    }
}
