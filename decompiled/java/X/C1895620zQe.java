package X;

import com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895620zQe extends C09AY implements Function0<Unit> {
    public C1895620zQe() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C01GW<FeedTimerPendantManger> c01gw = FeedTimerPendantManger.LLJL;
        FeedTimerPendantManger feedTimerPendantMangerLIZ = C1893440zN8.LIZ();
        feedTimerPendantMangerLIZ.getClass();
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null) {
            abstractC1896090zRP.LJJJIL(feedTimerPendantMangerLIZ.LLIZ);
        }
        C01GW<SpecActPendantManager> c01gw2 = SpecActPendantManager.LLJJIJIIJIL;
        C1894330zOZ.LIZ().LJIIJJI().tryRegisterViewToFeedCleanAbility();
        C1893440zN8.LIZ().LJJJZ();
        return Unit.LIZ;
    }
}
