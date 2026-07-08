package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [A] */
/* JADX INFO: renamed from: X.0Sv9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736730Sv9<A> extends C09AY implements Function1<A, Unit> {
    public final /* synthetic */ InterfaceC725050ScJ<RECEIVER> LL;
    public final /* synthetic */ Function2<RECEIVER, A, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C736730Sv9(InterfaceC725050ScJ<? extends RECEIVER> interfaceC725050ScJ, Function2<? super RECEIVER, ? super A, Unit> function2) {
        super(1);
        this.LL = interfaceC725050ScJ;
        this.LLILLJJLI = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        C03H5 actualReceiver = this.LL.getActualReceiver();
        if (actualReceiver != null) {
            C723830SaL.LIZIZ(actualReceiver, new C736760SvC(this.LLILLJJLI, actualReceiver, obj));
        }
        return Unit.LIZ;
    }
}
