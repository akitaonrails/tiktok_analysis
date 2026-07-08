package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBonusTimeConfig;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBonusTimeSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0eeg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceManager$triggerPopularityRankingBonusTimeGiftGuideBubble$1", f = "RankEntranceManager.kt", l = {244}, m = "invokeSuspend")
public final class C1097080eeg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1097080eeg(InterfaceC1364105Vn<? super C1097080eeg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1097080eeg(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RankEntranceManager@d691.triggerPopularityRankingBonusTimeGiftGuideBubble$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = LivePopularityRankingBonusTimeConfig.INSTANCE.getValue().giftGuideBubbleDisplayDelayTimeMs;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("RankEntranceManager@d691.triggerPopularityRankingBonusTimeGiftGuideBubble$1");
                return objLJFF;
            }
        }
        if (LivePopularityRankingBonusTimeSetting.INSTANCE.getOverallOpt() && ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).c70()) {
            Gift giftFindGiftById = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).findGiftById(LivePopularityRankingBonusTimeConfig.INSTANCE.getValue().giftId);
            if (giftFindGiftById != null && giftFindGiftById.isDisplayedOnPanel) {
                C784440Upu.LIZ().LIZIZ(new C1097090eeh(giftFindGiftById, C497740JfY.LJIJJ(2131855321, giftFindGiftById.name)));
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RankEntranceManager@d691.triggerPopularityRankingBonusTimeGiftGuideBubble$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RankEntranceManager@d691.triggerPopularityRankingBonusTimeGiftGuideBubble$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1097080eeg(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
