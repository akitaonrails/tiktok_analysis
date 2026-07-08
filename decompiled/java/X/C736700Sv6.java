package X;

import kotlin.Unit;

/* JADX INFO: Add missing generic type declarations: [A, B, C] */
/* JADX INFO: renamed from: X.0Sv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736700Sv6<A, B, C> extends C09AY implements InterfaceC1631620sYq<A, B, C, Unit> {
    public final /* synthetic */ InterfaceC725030ScH<RECEIVER> LL;
    public final /* synthetic */ InterfaceC1631630sYr<RECEIVER, A, B, C, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C736700Sv6(InterfaceC725030ScH<RECEIVER> interfaceC725030ScH, InterfaceC1631630sYr<? super RECEIVER, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        super(3);
        this.LL = interfaceC725030ScH;
        this.LLILLJJLI = interfaceC1631630sYr;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Object obj, Object obj2, Object obj3) {
        C03H5 receiverForHostVM = this.LL.getReceiverForHostVM();
        if (receiverForHostVM != null || (receiverForHostVM = this.LL.getActualReceiverHolder().getActualReceiver()) != null) {
            this.LLILLJJLI.invoke((RECEIVER) receiverForHostVM, (A) obj, (B) obj2, (C) obj3);
        }
        return Unit.LIZ;
    }
}
