package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [A] */
/* JADX INFO: renamed from: X.0Sv8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736720Sv8<A> extends C09AY implements Function1<A, Unit> {
    public final /* synthetic */ InterfaceC725030ScH<RECEIVER> LL;
    public final /* synthetic */ Function2<RECEIVER, A, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C736720Sv8(InterfaceC725030ScH<RECEIVER> interfaceC725030ScH, Function2<? super RECEIVER, ? super A, Unit> function2) {
        super(1);
        this.LL = interfaceC725030ScH;
        this.LLILLJJLI = function2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        C03H5 receiverForHostVM = this.LL.getReceiverForHostVM();
        if (receiverForHostVM != null || (receiverForHostVM = this.LL.getActualReceiverHolder().getActualReceiver()) != null) {
            this.LLILLJJLI.invoke((RECEIVER) receiverForHostVM, (A) obj);
        }
        return Unit.LIZ;
    }
}
