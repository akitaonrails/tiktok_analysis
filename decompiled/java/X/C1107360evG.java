package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0evG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107360evG extends C09AY implements Function1<C1107290ev9, Unit> {
    public final /* synthetic */ C1107300evA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1107360evG(C1107300evA c1107300evA) {
        super(1);
        this.LL = c1107300evA;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1107290ev9 c1107290ev9) {
        C1107290ev9 c1107290ev92 = c1107290ev9;
        if (this.LL.LLJJ && c1107290ev92 != null) {
            this.LL.LJIILIIL(c1107290ev92);
        }
        return Unit.LIZ;
    }
}
