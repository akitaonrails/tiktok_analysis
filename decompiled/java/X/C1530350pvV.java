package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530350pvV extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ AbstractC1289780jfU LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1530350pvV(AbstractC1289780jfU abstractC1289780jfU) {
        super(1);
        this.LL = abstractC1289780jfU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) {
        this.LL.LIZ(new C1530340pvU(c1533790q13));
        return Unit.LIZ;
    }
}
