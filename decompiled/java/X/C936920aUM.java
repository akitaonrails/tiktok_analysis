package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aUM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936920aUM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C937020aUW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C936920aUM(C937020aUW c937020aUW) {
        super(0);
        this.LL = c937020aUW;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LLILLL.xh();
        C937020aUW c937020aUW = this.LL;
        c937020aUW.getClass();
        C932160aMg.LJFF(EnumC936960aUQ.COUNTDOWN_FOR_ALL, "click", EnumC937290aUx.MULTI_TOOL, false, 0);
        C937020aUW.N5("count_down_for_all", new C936850aUF(c937020aUW));
        return Unit.LIZ;
    }
}
