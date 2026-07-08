package X;

import Y.AgS284S0100000_3;

/* JADX INFO: renamed from: X.093g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", l = {279}, m = "emit")
public final class C23098093g extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AgS284S0100000_3<T> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C23098093g(AgS284S0100000_3<? super T> agS284S0100000_3, InterfaceC1364105Vn<? super C23098093g> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = agS284S0100000_3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILLJJLI.emit(null, this);
    }
}
