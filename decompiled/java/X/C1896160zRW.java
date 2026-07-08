package X;

import android.app.Activity;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.touchpoint.api.model.BottomTabBubble;
import com.bytedance.touchpoint.api.model.CoinBottomTab;
import com.bytedance.touchpoint.core.pendant.feed.FeedTimerPendantManger;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.guide.publish.IProGuidePublishService;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zRW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896160zRW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SpecActServiceImpl LL;
    public final /* synthetic */ boolean LLILLJJLI = false;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1896160zRW(SpecActServiceImpl specActServiceImpl, Aweme aweme) {
        super(0);
        this.LL = specActServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BottomTabBubble bottomTabBubble;
        DialogC1897810zUB dialogC1897810zUB;
        this.LL.LJJJJI();
        C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
        C1894330zOZ.LIZ().LJJIJL(this.LLILLJJLI);
        C1897790zU9.LL.getClass();
        try {
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            Activity activityLJIILL = abstractC1896090zRP != null ? abstractC1896090zRP.LJIILL() : null;
            C1897770zU7 c1897770zU7 = (C1897770zU7) c1619720sFe.LIZ(4);
            if (c1897770zU7 != null && c1897770zU7.LIZJ() && activityLJIILL != null && !activityLJIILL.isFinishing()) {
                String strLJIIJJI = C1897790zU9.LJIIJJI();
                if (!C293540Bey.LIZ() || strLJIIJJI == null || a0.LJJJIL(strLJIIJJI)) {
                    DialogC1897810zUB dialogC1897810zUB2 = C1897790zU9.LLJ;
                    if (dialogC1897810zUB2 != null && dialogC1897810zUB2.isShowing() && (dialogC1897810zUB = C1897790zU9.LLJ) != null) {
                        dialogC1897810zUB.dismiss();
                        C785410UrT.LIZ(dialogC1897810zUB);
                    }
                } else {
                    C1899920zXa.LIZ.getClass();
                    if (C1899920zXa.LJ(strLJIIJJI)) {
                        C1899920zXa.LIZIZ(strLJIIJJI);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1896170zRX.LL.getClass();
        if (C1874850yt9.LIZ(29, CoinBottomTab.class) != null && (bottomTabBubble = C1896170zRX.LLILZ) != null) {
            if (C1896170zRX.LLILZLL) {
                C1896170zRX.LLILZIL++;
            } else {
                C1896170zRX.LLILZLL = true;
            }
            if (C1896170zRX.LLILZIL >= bottomTabBubble.showAfter) {
                if (C710890RuZ.LIZ.LIZLLL("_type_bottom_tab_bubble") + 1 <= bottomTabBubble.showTimes) {
                    ((AssemViewModel) C1896170zRX.LLILLL.getValue()).setState(AFwS264S0000000_24.get$arr$(19));
                }
            }
        }
        IProGuidePublishService iProGuidePublishService = (IProGuidePublishService) PluggableExtentionKt.pluggableSpi$default(IProGuidePublishService.class, false, false, false, 14, null);
        if (iProGuidePublishService != null) {
            iProGuidePublishService.LJII();
        }
        C1618290sDL.LIZ.getClass();
        Object objLIZIZ = C1618290sDL.LIZIZ();
        if ((objLIZIZ instanceof InterfaceC1603190roz) && (((InterfaceC1603190roz) objLIZIZ).getCurFragment() instanceof InterfaceC1593630rZZ)) {
            if (this.LLILLJJLI) {
                C01GW<FeedTimerPendantManger> c01gw2 = FeedTimerPendantManger.LLJL;
                C1893440zN8.LIZ().LJJJZ();
            } else {
                C01GW<FeedTimerPendantManger> c01gw3 = FeedTimerPendantManger.LLJL;
                FeedTimerPendantManger feedTimerPendantMangerLIZ = C1893440zN8.LIZ();
                feedTimerPendantMangerLIZ.LJJJLZIJ(feedTimerPendantMangerLIZ.LJJJJZ(), false);
            }
        }
        this.LL.getClass();
        return Unit.LIZ;
    }
}
