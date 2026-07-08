package X;

import Y.ARunnableS9S1100000_3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08MH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08MH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL = "FeedBottomButtonContainer";
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08MH(C0RIX c0rix) {
        super(0);
        this.LLILLJJLI = c0rix;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C823050WQl.LIZIZ().execute(new ARunnableS9S1100000_3(this.LLILLJJLI, this.LL, 18));
        return Unit.LIZ;
    }
}
