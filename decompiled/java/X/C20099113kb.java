package X;

import Y.AgS212S0200000_30;

/* JADX INFO: renamed from: X.13kb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", l = {185}, m = "emit")
public final class C20099113kb extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AgS212S0200000_30<T> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20099113kb(AgS212S0200000_30<? super T> agS212S0200000_30, InterfaceC1364105Vn<? super C20099113kb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = agS212S0200000_30;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILLJJLI.emit(null, this);
    }
}
