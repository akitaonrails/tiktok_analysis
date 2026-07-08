package X;

import com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger;
import com.bytedance.touchpoint.core.shortdrama.ShortDramaTimerPendantManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zQd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895610zQd extends C09AY implements Function0<Unit> {
    public C1895610zQd() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C01GW<FeedTimerPendantManger> c01gw = FeedTimerPendantManger.LLJL;
        FeedTimerPendantManger feedTimerPendantMangerLIZ = C1893440zN8.LIZ();
        feedTimerPendantMangerLIZ.LJJJLZIJ(feedTimerPendantMangerLIZ.LJJJJZ(), false);
        C01GW<ShortDramaTimerPendantManager> c01gw2 = ShortDramaTimerPendantManager.LLJJJJ;
        ShortDramaTimerPendantManager shortDramaTimerPendantManagerLIZ = C1893450zN9.LIZ();
        shortDramaTimerPendantManagerLIZ.LJJJLZIJ(shortDramaTimerPendantManagerLIZ.LJJJJZ(), false);
        return Unit.LIZ;
    }
}
