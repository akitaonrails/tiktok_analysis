package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05mL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1452305mL extends C09AY implements Function1<InterfaceC703670Riv<Object>, Function1<? super Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, ? extends Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>>> {
    public final /* synthetic */ InterfaceC1631620sYq<InterfaceC703670Riv<Object>, Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, InterfaceC700750ReD, InterfaceC700750ReD> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1452305mL(InterfaceC1631620sYq<? super InterfaceC703670Riv<Object>, ? super Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, ? super InterfaceC700750ReD, ? extends InterfaceC700750ReD> interfaceC1631620sYq) {
        super(1);
        this.LL = interfaceC1631620sYq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Function1<? super Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, ? extends Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>> invoke(InterfaceC703670Riv<Object> interfaceC703670Riv) {
        return new C1452205mK(this.LL, interfaceC703670Riv);
    }
}
