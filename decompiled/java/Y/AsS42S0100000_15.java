package Y;

import X.AbstractC1585810rMx;
import X.AbstractC21673619ry;
import X.AbstractC963000bAQ;
import X.C00UM;
import X.C1117360fBO;
import X.C20441214yg;
import X.C354001Za;
import X.C946850akN;
import X.C950960ar0;
import X.C957700b1s;
import X.C963270bAr;
import X.C964350bCb;
import X.EnumC952890au7;
import X.EnumC959280b4Q;
import X.EnumC971520bOA;
import X.RunnableC781530UlD;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.linkroom.toolbarsheet.MultiGuestToolAndPlayFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.fragment.TextHeaderListFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multihost.biz.link.features.followprompt.MultiCoHostFollowPromptAssem;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostHistoryFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiCoHostSearchFragment;
import com.bytedance.android.live.liveinteract.multihost.biz.link.viewbinder.randomlinkmic.InteractRandomLinkMicLargeViewBinder;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.MatchOnlyGiftSelectFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class AsS42S0100000_15 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 3:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 4:
                LJJIIJ$4(this, recyclerView, i);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_EMAIL /* 11 */:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIJ$5(this, recyclerView, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJIIJ$6(this, recyclerView, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJJIIJ$7(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case BdTuring.TYPE_ECAF /* 9 */:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 5:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 6:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 7:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            case 8:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJIIZI$5(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJJIIZI$6(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS42S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS42S0100000_15 asS42S0100000_15, RecyclerView recyclerView, int i) {
        ((MatchOnlyGiftSelectFragment) asS42S0100000_15.l0).SR();
    }

    public static final void LJJIIJ$1(AsS42S0100000_15 asS42S0100000_15, RecyclerView recyclerView, int i) {
        ((MultiGuestToolAndPlayFragment) asS42S0100000_15.l0).uS(recyclerView);
    }

    public static final void LJJIIJ$2(AsS42S0100000_15 asS42S0100000_15, RecyclerView recyclerView, int i) {
        boolean z;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) asS42S0100000_15.l0;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        multiLiveAsAnchorListDialogV2.D = z;
    }

    public static final void LJJIIJ$3(AsS42S0100000_15 asS42S0100000_15, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((InteractRandomLinkMicLargeViewBinder.InteractRandomLinkMicLargeViewHolder) asS42S0100000_15.l0).r6();
        }
    }

    public static final void LJJIIJ$4(AsS42S0100000_15 asS42S0100000_15, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((C950960ar0) asS42S0100000_15.l0).LIZ();
        }
    }

    public static final void LJJIIJ$5(AsS42S0100000_15 asS42S0100000_15, RecyclerView recyclerView, int i) {
        if (i == 1) {
            ((MultiCoHostSearchFragment) asS42S0100000_15.l0).iS();
        }
    }

    public static final void LJJIIJ$6(AsS42S0100000_15 asS42S0100000_15, RecyclerView recyclerView, int i) {
        C20441214yg.LJIIIZ("MultiCoHostSearchFrag", "history,onScrollStateChanged");
        ((MultiCoHostSearchFragment) asS42S0100000_15.l0).rS();
    }

    public static final void LJJIIJ$7(AsS42S0100000_15 asS42S0100000_15, RecyclerView recyclerView, int i) {
        boolean z;
        MultiGuestAsGuestModeratorManageDialog multiGuestAsGuestModeratorManageDialog = (MultiGuestAsGuestModeratorManageDialog) asS42S0100000_15.l0;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        multiGuestAsGuestModeratorManageDialog.LLJZIJLIL = z;
    }

    public static final void LJJIIZI$0(AsS42S0100000_15 asS42S0100000_15, RecyclerView recyclerView, int i, int i2) {
        ((MatchOnlyGiftSelectFragment) asS42S0100000_15.l0).SR();
    }

    public static final void LJJIIZI$1(AsS42S0100000_15 asS42S0100000_15, RecyclerView recyclerView, int i, int i2) {
        RecyclerView.LayoutManager layoutManager;
        C963270bAr c963270bAr = ((MultiCoHostFollowPromptAssem) asS42S0100000_15.l0).Go().LLILZ;
        RunnableC781530UlD runnableC781530UlD = ((MultiCoHostFollowPromptAssem) asS42S0100000_15.l0).LLJI;
        List<?> list = null;
        if (runnableC781530UlD != null) {
            layoutManager = runnableC781530UlD.getLayoutManager();
        } else {
            layoutManager = null;
        }
        C964350bCb c964350bCb = ((MultiCoHostFollowPromptAssem) asS42S0100000_15.l0).LLJIJIL;
        if (c964350bCb != null) {
            list = c964350bCb.LL;
        }
        c963270bAr.LIZJ(layoutManager, list);
    }

    public static final void LJJIIZI$2(AsS42S0100000_15 asS42S0100000_15, RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.getScrollState() == 1) {
            LayoutSettingContract layoutSettingContract = (LayoutSettingContract) asS42S0100000_15.l0;
            if (!layoutSettingContract.hasReportedManualScroll && i != 0) {
                layoutSettingContract.LJJIFFI("swipe", null);
                ((LayoutSettingContract) asS42S0100000_15.l0).hasReportedManualScroll = true;
            }
        }
    }

    public static final void LJJIIZI$3(AsS42S0100000_15 asS42S0100000_15, RecyclerView recyclerView, int i, int i2) {
        C00UM c00um;
        C354001Za c354001Za;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        List<?> list = ((TextHeaderListFragment) asS42S0100000_15.l0).LLJ.LL;
        if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            int size = list.size();
            if (iFindFirstVisibleItemPosition >= 0 && iFindFirstVisibleItemPosition < size) {
                Object obj = ListProtector.get(list, iFindFirstVisibleItemPosition);
                if ((obj instanceof C354001Za) && (c354001Za = (C354001Za) obj) != null) {
                    TextHeaderListFragment textHeaderListFragment = (TextHeaderListFragment) asS42S0100000_15.l0;
                    if (!((ArrayList) textHeaderListFragment.LLIZLLLIL).contains(Long.valueOf(c354001Za.LIZIZ.LIZLLL))) {
                        ((ArrayList) textHeaderListFragment.LLIZLLLIL).add(Long.valueOf(c354001Za.LIZIZ.LIZLLL));
                        TextHeaderListFragment.OR(textHeaderListFragment, EnumC971520bOA.SHOW, c354001Za.LIZIZ);
                    }
                }
                Object obj2 = ListProtector.get(list, iFindFirstVisibleItemPosition);
                if ((obj2 instanceof C00UM) && (c00um = (C00UM) obj2) != null) {
                    TextHeaderListFragment textHeaderListFragment2 = (TextHeaderListFragment) asS42S0100000_15.l0;
                    if (!((ArrayList) textHeaderListFragment2.LLIZLLLIL).contains(Long.valueOf(c00um.LIZ.LIZLLL))) {
                        ((ArrayList) textHeaderListFragment2.LLIZLLLIL).add(Long.valueOf(c00um.LIZ.LIZLLL));
                        EnumC971520bOA enumC971520bOA = EnumC971520bOA.SHOW;
                        Long lValueOf = Long.valueOf(c00um.LIZ.LIZLLL);
                        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
                        EnumC952890au7 enumC952890au7 = C946850akN.LIZIZ;
                        multiCanvasUtils.getClass();
                        C946850akN.LJIIIZ(enumC971520bOA, lValueOf, "recommend", MultiCanvasUtils.LJIIJJI(enumC952890au7), "header");
                    }
                }
            }
            if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                iFindFirstVisibleItemPosition++;
            } else {
                return;
            }
        }
    }

    public static final void LJJIIZI$4(AsS42S0100000_15 asS42S0100000_15, RecyclerView recyclerView, int i, int i2) {
        C1117360fBO c1117360fBO;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            MultiCoHostSearchFragment multiCoHostSearchFragment = (MultiCoHostSearchFragment) asS42S0100000_15.l0;
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindLastVisibleItemPosition == -1) {
                return;
            }
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            Object obj = null;
            if ((adapter instanceof C1117360fBO) && (c1117360fBO = (C1117360fBO) adapter) != null) {
                obj = ListProtector.get(c1117360fBO.LL, iFindLastVisibleItemPosition);
            }
            if (obj instanceof C957700b1s) {
                C957700b1s c957700b1s = (C957700b1s) obj;
                if (c957700b1s.LJJ == EnumC959280b4Q.FRIENDS_RANKING) {
                    multiCoHostSearchFragment.LLJLIL = Math.max(multiCoHostSearchFragment.LLJLIL, c957700b1s.LJJI);
                }
            }
        }
    }

    public static final void LJJIIZI$5(AsS42S0100000_15 asS42S0100000_15, RecyclerView recyclerView, int i, int i2) {
        C20441214yg.LJIIIZ("MultiCoHostSearchFrag", "history,onScrolled");
        ((MultiCoHostSearchFragment) asS42S0100000_15.l0).rS();
    }

    public static final void LJJIIZI$6(AsS42S0100000_15 asS42S0100000_15, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        int iFindLastVisibleItemPosition;
        AbstractC963000bAQ abstractC963000bAQ;
        MultiCoHostHistoryFragment multiCoHostHistoryFragment = (MultiCoHostHistoryFragment) asS42S0100000_15.l0;
        AbstractC963000bAQ abstractC963000bAQ2 = (AbstractC963000bAQ) multiCoHostHistoryFragment.LLILLL;
        if (abstractC963000bAQ2 != null && abstractC963000bAQ2.LJIILIIL()) {
            return;
        }
        RunnableC781530UlD runnableC781530UlD = multiCoHostHistoryFragment.LLJI;
        RecyclerView.LayoutManager layoutManager = null;
        if (runnableC781530UlD != null) {
            layoutManager = runnableC781530UlD.getLayoutManager();
        }
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || (iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition()) == -1 || multiCoHostHistoryFragment.LLJIJIL.LL.size() - iFindLastVisibleItemPosition > 4 || (abstractC963000bAQ = (AbstractC963000bAQ) multiCoHostHistoryFragment.LLILLL) == null) {
            return;
        }
        abstractC963000bAQ.LJIILJJIL();
    }
}
