package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS120S0101000_12;

/* JADX INFO: renamed from: X.0TA5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TA5 extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function1<Integer, Unit> LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TA5(int i, String str, Function1 function1) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = function1;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LIZJ(0, this.LL, new AwS120S0101000_12(this.LLILLL, this.LLILLJJLI, 3));
        c1397620mTQ2.LJFF = true;
        return Unit.LIZ;
    }
}
