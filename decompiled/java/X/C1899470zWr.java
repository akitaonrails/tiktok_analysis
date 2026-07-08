package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899470zWr extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ViewOnTouchListenerC1899510zWv LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ Float LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1899470zWr(C1899490zWt c1899490zWt, float f, float f2, Float f3) {
        super(0);
        this.LL = c1899490zWt;
        this.LLILLJJLI = f;
        this.LLILLL = f2;
        this.LLILZ = f3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ViewOnTouchListenerC1899510zWv viewOnTouchListenerC1899510zWv = this.LL;
        viewOnTouchListenerC1899510zWv.LLILZLL = this.LLILLJJLI;
        viewOnTouchListenerC1899510zWv.LLIZ = this.LLILLL;
        Float f = this.LLILZ;
        if (f != null) {
            viewOnTouchListenerC1899510zWv.LLILLJJLI = f.floatValue();
        }
        return Unit.LIZ;
    }
}
