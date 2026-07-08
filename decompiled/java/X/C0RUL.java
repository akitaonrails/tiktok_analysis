package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RUL, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RUL extends C09AY implements Function1<C0RUS, Unit> {
    public final /* synthetic */ AbstractC738140SxQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RUL(AbstractC738140SxQ abstractC738140SxQ) {
        super(1);
        this.LL = abstractC738140SxQ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RUS c0rus) {
        c0rus.LLILZIL = this.LL;
        return Unit.LIZ;
    }
}
