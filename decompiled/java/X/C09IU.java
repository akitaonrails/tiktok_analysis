package X;

import Y.AgS194S0200000_3;

/* JADX INFO: renamed from: X.09IU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", l = {142}, m = "emit")
public final class C09IU extends AbstractC23140094w {
    public AgS194S0200000_3 LL;
    public /* synthetic */ Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ AgS194S0200000_3 LLILZ;
    public Object LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09IU(AgS194S0200000_3 agS194S0200000_3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = agS194S0200000_3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILZ.emit(null, this);
    }
}
