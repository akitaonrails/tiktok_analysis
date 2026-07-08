package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ScK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725060ScK extends C09AY implements Function2<Object, Object, Unit> {
    public final /* synthetic */ InterfaceC725030ScH<C03H5> LL;
    public final /* synthetic */ InterfaceC1631620sYq<C03H5, Object, Object, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C725060ScK(InterfaceC725030ScH<C03H5> interfaceC725030ScH, InterfaceC1631620sYq<C03H5, Object, Object, Unit> interfaceC1631620sYq) {
        super(2);
        this.LL = interfaceC725030ScH;
        this.LLILLJJLI = interfaceC1631620sYq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Object obj, Object obj2) {
        C03H5 receiverForHostVM = this.LL.getReceiverForHostVM();
        if (receiverForHostVM != null || (receiverForHostVM = this.LL.getActualReceiverHolder().getActualReceiver()) != null) {
            this.LLILLJJLI.invoke(receiverForHostVM, obj, obj2);
        }
        return Unit.LIZ;
    }
}
