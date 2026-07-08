package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14mL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20364714mL extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C20364414mI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20364714mL(C20364414mI c20364414mI) {
        super(1);
        this.LL = c20364414mI;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            this.LL.LLILZLL.clear();
            this.LL.LLIZ = false;
        }
        return Unit.LIZ;
    }
}
