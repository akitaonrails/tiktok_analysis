package X;

import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.controller.base.IChildController;
import com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0xCw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810240xCw implements InterfaceC469360Ias {
    public List<? extends SubRankTabInfo> LL;
    public final /* synthetic */ RankPageFragment LLILLJJLI;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C1810240xCw(RankPageFragment rankPageFragment) {
        this.LLILLJJLI = rankPageFragment;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        C1810410xDD c1810410xDD;
        RankListViewModel rankListViewModelLJIIIZ;
        C1810410xDD c1810410xDD2;
        RankListViewModel rankListViewModelLJIIIZ2;
        RankPageController rankPageController = this.LLILLJJLI.LLIZLLLIL;
        Boolean boolValueOf = null;
        if (rankPageController == null) {
            rankPageController = null;
        }
        int i2 = rankPageController.LJIIL().LLJJI;
        RankPageController rankPageController2 = this.LLILLJJLI.LLIZLLLIL;
        if (rankPageController2 == null) {
            rankPageController2 = null;
        }
        rankPageController2.LJIIL().AQ2(i);
        List<? extends SubRankTabInfo> list = this.LL;
        if (list != null) {
            RankPageFragment rankPageFragment = this.LLILLJJLI;
            if (list.size() > i) {
                RankPageController rankPageController3 = rankPageFragment.LLIZLLLIL;
                if (rankPageController3 == null) {
                    rankPageController3 = null;
                }
                IChildController iChildController = (IChildController) ((HashMap) rankPageController3.LL).get(new Pair(Integer.valueOf(((SubRankTabInfo) ListProtector.get(list, i)).rankType), Integer.valueOf(((SubRankTabInfo) ListProtector.get(list, i)).LIZ)));
                RankPageController rankPageController4 = rankPageFragment.LLIZLLLIL;
                if (rankPageController4 == null) {
                    rankPageController4 = null;
                }
                IChildController iChildController2 = (IChildController) ((HashMap) rankPageController4.LL).get(new Pair(Integer.valueOf(((SubRankTabInfo) ListProtector.get(list, i2)).rankType), Integer.valueOf(((SubRankTabInfo) ListProtector.get(list, i2)).LIZ)));
                if (iChildController instanceof RankListController) {
                    c1810410xDD = ((RankListController) iChildController).LJIIIZ().LL;
                } else if ((iChildController instanceof RankPageController) && (rankListViewModelLJIIIZ = ((RankPageController) iChildController).LJIIIZ()) != null) {
                    c1810410xDD = rankListViewModelLJIIIZ.LL;
                } else {
                    c1810410xDD = null;
                }
                if (iChildController2 instanceof RankListController) {
                    c1810410xDD2 = ((RankListController) iChildController2).LJIIIZ().LL;
                } else if ((iChildController2 instanceof RankPageController) && (rankListViewModelLJIIIZ2 = ((RankPageController) iChildController2).LJIIIZ()) != null) {
                    c1810410xDD2 = rankListViewModelLJIIIZ2.LL;
                } else {
                    c1810410xDD2 = null;
                }
                if (c1810410xDD != null && c1810410xDD2 != null) {
                    C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                    DataChannel dataChannelLJ = C475510Ikn.LJ(rankPageFragment);
                    c1810690xDf.getClass();
                    C1810690xDf.LJIIIIZZ.put(new Pair<>(Integer.valueOf(c1810410xDD.LIZIZ.type), Integer.valueOf(c1810410xDD.LIZIZ.rankPhase)), "subtag_switch");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C1810690xDf.LIZJ(linkedHashMap, c1810410xDD, dataChannelLJ);
                    C474500IjA c474500IjALJII = C1810690xDf.LJII("livesdk_switch_tab", linkedHashMap);
                    C1810690xDf.LIZ(c474500IjALJII, dataChannelLJ);
                    if (dataChannelLJ != null) {
                        boolValueOf = Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannelLJ));
                    }
                    c474500IjALJII.LJJII(C1810690xDf.LJJJJIZL(boolValueOf), "user_type");
                    c474500IjALJII.LJJII(c1810410xDD2.LIZIZ.rankName, "from_rank_type");
                    c474500IjALJII.LJJII(c1810410xDD.LIZIZ.rankName, "to_rank_type");
                    c474500IjALJII.LJJII(C1810690xDf.LJJJI(Boolean.valueOf(c1810410xDD.LJ)), "rank_period");
                    c474500IjALJII.LJJII("subtag_switch", "enter_from");
                    c474500IjALJII.LIZ();
                    RankTypeV2 rankTypeV2 = c1810410xDD.LIZJ;
                    C1810210xCt.LJFF(rankTypeV2.type, rankTypeV2.rankPhase, false);
                    C1810210xCt.LJIIIZ = "tag_switch";
                }
            }
        }
    }
}
