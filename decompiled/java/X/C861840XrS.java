package X;

import Y.AgS203S0200000_14;

/* JADX INFO: renamed from: X.0XrS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", l = {71}, m = "emit")
public final class C861840XrS extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AgS203S0200000_14<T> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C861840XrS(AgS203S0200000_14<? super T> agS203S0200000_14, InterfaceC1364105Vn<? super C861840XrS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = agS203S0200000_14;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILLJJLI.emit(null, this);
    }
}
