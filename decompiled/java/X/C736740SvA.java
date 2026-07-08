package X;

import kotlin.Unit;

/* JADX INFO: Add missing generic type declarations: [A, B, C, D] */
/* JADX INFO: renamed from: X.0SvA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736740SvA<A, B, C, D> extends C09AY implements InterfaceC1631630sYr<A, B, C, D, Unit> {
    public final /* synthetic */ InterfaceC725030ScH<RECEIVER> LL;
    public final /* synthetic */ InterfaceC1685420txc<RECEIVER, A, B, C, D, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C736740SvA(InterfaceC725030ScH<RECEIVER> interfaceC725030ScH, InterfaceC1685420txc<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        super(4);
        this.LL = interfaceC725030ScH;
        this.LLILLJJLI = interfaceC1685420txc;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C03H5 receiverForHostVM = this.LL.getReceiverForHostVM();
        if (receiverForHostVM == null) {
            receiverForHostVM = this.LL.getActualReceiverHolder().getActualReceiver();
        }
        if (receiverForHostVM != null) {
            this.LLILLJJLI.invoke((RECEIVER) receiverForHostVM, (A) obj, (B) obj2, (C) obj3, (D) obj4);
        }
        return Unit.LIZ;
    }
}
