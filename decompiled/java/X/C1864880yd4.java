package X;

import com.bytedance.android.live.rank.impl.list.OfflineRankListFragment;
import com.bytedance.android.live.rank.impl.list.RankListDialog;
import com.bytedance.android.live.rank.impl.list.controller.OfflineRankRootController;
import com.bytedance.android.live.rank.impl.list.controller.base.IChildController;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yd4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864880yd4 implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(C1864880yd4 c1864880yd4, int i) {
    }

    public static final void onPageScrollStateChanged$1(C1864880yd4 c1864880yd4, int i) {
    }

    public static final void onPageScrolled$0(C1864880yd4 c1864880yd4, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(C1864880yd4 c1864880yd4, int i, float f, int i2) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
                onPageScrollStateChanged$1(this, i);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
        }
    }

    public C1864880yd4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageSelected$0(C1864880yd4 c1864880yd4, int i) {
        RankPageViewModel rankPageViewModelLJ;
        RankTypeV2 rankTypeV2;
        RankPageViewModel rankPageViewModelLJ2;
        RankTypeV2 rankTypeV22;
        OfflineRankRootController offlineRankRootController = ((OfflineRankListFragment) c1864880yd4.l0).LLIZLLLIL;
        OfflineRankRootController offlineRankRootController2 = null;
        if (offlineRankRootController == null) {
            offlineRankRootController = null;
        }
        int i2 = offlineRankRootController.LJFF().LLIZLLLIL;
        RankTypeV2 rankTypeV23 = RankTypeV2.LJJIJIIJI;
        OfflineRankRootController offlineRankRootController3 = ((OfflineRankListFragment) c1864880yd4.l0).LLIZLLLIL;
        if (offlineRankRootController3 == null) {
            offlineRankRootController3 = null;
        }
        offlineRankRootController3.LJFF().zQ2(i);
        OfflineRankRootController offlineRankRootController4 = ((OfflineRankListFragment) c1864880yd4.l0).LLIZLLLIL;
        if (offlineRankRootController4 == null) {
            offlineRankRootController4 = null;
        }
        List<RankTabInfo> list = offlineRankRootController4.LJFF().LL;
        if (list != null) {
            OfflineRankListFragment offlineRankListFragment = (OfflineRankListFragment) c1864880yd4.l0;
            if (list.size() > i) {
                OfflineRankRootController offlineRankRootController5 = offlineRankListFragment.LLIZLLLIL;
                if (offlineRankRootController5 == null) {
                    offlineRankRootController5 = null;
                }
                IChildController iChildController = (IChildController) ((HashMap) offlineRankRootController5.LL).get(new Pair(Integer.valueOf(((RankTabInfo) ListProtector.get(list, i2)).rankType), Integer.valueOf(((RankTabInfo) ListProtector.get(list, i2)).LIZIZ)));
                if (iChildController != null && (rankPageViewModelLJ2 = iChildController.LJ()) != null && (rankTypeV22 = rankPageViewModelLJ2.LLJJIII) != null) {
                    rankTypeV23 = rankTypeV22;
                }
                OfflineRankRootController offlineRankRootController6 = offlineRankListFragment.LLIZLLLIL;
                if (offlineRankRootController6 == null) {
                    offlineRankRootController6 = null;
                }
                IChildController iChildController2 = (IChildController) ((HashMap) offlineRankRootController6.LL).get(new Pair(Integer.valueOf(((RankTabInfo) ListProtector.get(list, i)).rankType), Integer.valueOf(((RankTabInfo) ListProtector.get(list, i)).LIZIZ)));
                if (iChildController2 != null && (rankPageViewModelLJ = iChildController2.LJ()) != null && (rankTypeV2 = rankPageViewModelLJ.LLJJIII) != null) {
                    C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                    OfflineRankRootController offlineRankRootController7 = offlineRankListFragment.LLIZLLLIL;
                    if (offlineRankRootController7 == null) {
                        offlineRankRootController7 = null;
                    }
                    EnumC1811400xEo enumC1811400xEo = offlineRankRootController7.LJFF().LLILZ;
                    DataChannel dataChannel = offlineRankListFragment.LLIZ;
                    OfflineRankRootController offlineRankRootController8 = offlineRankListFragment.LLIZLLLIL;
                    if (offlineRankRootController8 != null) {
                        offlineRankRootController2 = offlineRankRootController8;
                    }
                    boolean z = offlineRankRootController2.LJFF().LLILZLL;
                    c1810690xDf.getClass();
                    C1810690xDf.LJJJ(rankTypeV2, rankTypeV23, enumC1811400xEo, dataChannel, z);
                }
            }
        }
    }

    public static final void onPageSelected$1(C1864880yd4 c1864880yd4, int i) {
        RankPageViewModel rankPageViewModelLJ;
        RankTypeV2 rankTypeV2;
        RankPageViewModel rankPageViewModelLJ2;
        RankTypeV2 rankTypeV22;
        int i2 = ((RankListDialog) c1864880yd4.l0).SR().LIZ().LLIZLLLIL;
        RankTypeV2 rankTypeV23 = RankTypeV2.LJJIJIIJI;
        ((RankListDialog) c1864880yd4.l0).SR().LIZ().zQ2(i);
        List<RankTabInfo> list = ((RankListDialog) c1864880yd4.l0).SR().LIZ().LL;
        if (list != null) {
            RankListDialog rankListDialog = (RankListDialog) c1864880yd4.l0;
            if (list.size() > i) {
                IChildController iChildController = (IChildController) ((HashMap) rankListDialog.SR().LL).get(new Pair(Integer.valueOf(((RankTabInfo) ListProtector.get(list, i2)).rankType), Integer.valueOf(((RankTabInfo) ListProtector.get(list, i2)).LIZIZ)));
                if (iChildController != null && (rankPageViewModelLJ2 = iChildController.LJ()) != null && (rankTypeV22 = rankPageViewModelLJ2.LLJJIII) != null) {
                    rankTypeV23 = rankTypeV22;
                }
                IChildController iChildController2 = (IChildController) ((HashMap) rankListDialog.SR().LL).get(new Pair(Integer.valueOf(((RankTabInfo) ListProtector.get(list, i)).rankType), Integer.valueOf(((RankTabInfo) ListProtector.get(list, i)).LIZIZ)));
                if (iChildController2 != null && (rankPageViewModelLJ = iChildController2.LJ()) != null && (rankTypeV2 = rankPageViewModelLJ.LLJJIII) != null) {
                    C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                    EnumC1811400xEo enumC1811400xEo = rankListDialog.SR().LIZ().LLILZ;
                    DataChannel dataChannel = rankListDialog.dataChannel;
                    boolean z = rankListDialog.LLJJLIIIJLLLLLLLZ;
                    c1810690xDf.getClass();
                    C1810690xDf.LJJJ(rankTypeV2, rankTypeV23, enumC1811400xEo, dataChannel, z);
                    C1810210xCt.LJFF(rankTypeV2.type, rankTypeV2.rankPhase, false);
                    C1810210xCt.LJIIIZ = "tag_switch";
                }
            }
        }
    }
}
