package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05mK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1452205mK extends C09AY implements Function1<Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>> {
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC703670Riv<Object>, Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, InterfaceC700750ReD, InterfaceC700750ReD> LL;
    public final /* synthetic */ InterfaceC703670Riv<Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1452205mK(InterfaceC1631620sYq<? super InterfaceC703670Riv<Object>, ? super Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, ? super InterfaceC700750ReD, ? extends InterfaceC700750ReD> interfaceC1631620sYq, InterfaceC703670Riv<Object> interfaceC703670Riv) {
        super(1);
        this.LL = interfaceC1631620sYq;
        this.LLILLJJLI = interfaceC703670Riv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD> invoke(Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD> function1) {
        return new C1452105mJ(this.LL, this.LLILLJJLI, function1);
    }
}
