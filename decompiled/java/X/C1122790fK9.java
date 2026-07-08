package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fK9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122790fK9 extends C09AY implements Function1<AbstractC1122920fKM, Unit> {
    public final /* synthetic */ C1122470fJd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122790fK9(C1122470fJd c1122470fJd) {
        super(1);
        this.LL = c1122470fJd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1122920fKM abstractC1122920fKM) {
        AbstractC1122920fKM abstractC1122920fKM2 = abstractC1122920fKM;
        this.LL.LJI = abstractC1122920fKM2;
        C051E.LIZ("comment.model.download.result", new Pair("result", abstractC1122920fKM2.getClass().getSimpleName()));
        return Unit.LIZ;
    }
}
