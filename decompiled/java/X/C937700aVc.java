package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0aVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937700aVc extends C09AY implements Function2<C941240abK, Integer, Unit> {
    public final /* synthetic */ C948340amm LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C937700aVc(C948340amm c948340amm) {
        super(2);
        this.LL = c948340amm;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C941240abK c941240abK, Integer num) {
        this.LL.LLJ.LIZIZ(new C937710aVd(c941240abK, num.intValue()));
        return Unit.LIZ;
    }
}
