package Y;

import X.AbstractC1569120qw2;
import X.AbstractC1585810rMx;
import X.AbstractC21673619ry;
import X.C01VZ;
import X.C13LQ;
import X.C1507790pL7;
import X.C1557400qd8;
import X.C1557410qd9;
import X.C1557630qdV;
import X.C1563650qnD;
import X.C1569160qw6;
import X.C1569180qw8;
import X.C1573020r2K;
import X.C1579330rCV;
import X.C1598650rhf;
import X.C1599780rjU;
import X.C1599840rja;
import X.C1600480rkc;
import X.C1742820vSC;
import X.C19606111nH;
import X.C20684815ws;
import X.C2344009Gk;
import X.C486660J6q;
import X.C491001vg;
import X.EnumC1581430rFt;
import X.EnumC1598770rhr;
import X.EnumC1599860rjc;
import X.EnumC323450Cm7;
import X.InterfaceC1569000qvq;
import X.InterfaceC1572780r1w;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.business.live.assem.LiveSkylightTrackAssem;
import com.ss.android.ugc.aweme.business.story.assem.SwitchToReportStoryNegativeFeedbackAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.follow.view.ECAuctionFollowAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3EmojiAnimAssem;
import com.ss.android.ugc.aweme.inbox.assem.SwitchInboxToReportStoryNegativeFeedbackAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageAutoPlayAssem;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.series.feed.profile.assme.SeriesProfileTabAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.SchoolPostListAssem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.cell.SchoolPostCell;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class AsS50S0100000_24 extends AbstractC1585810rMx {
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
                LJJIIJ$5(this, recyclerView, i);
                break;
            case 6:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 7:
                LJJIIJ$6(this, recyclerView, i);
                break;
            case 8:
                LJJIIJ$7(this, recyclerView, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIJ$8(this, recyclerView, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJIIJ$9(this, recyclerView, i);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJJIIJ$10(this, recyclerView, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJJIIJ$11(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 2:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 3:
            case 4:
            case 8:
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS50S0100000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i) {
        String str;
        String str2;
        if (i == 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AssemVMLazy assemVMLazy = ((ECAuctionFollowAssem) asS50S0100000_24.l0).LLJJLIIIJLLLLLLLZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ECAuctionFollowAssem.LLJLILLLLZIIL;
            C1742820vSC c1742820vSC = ((TrendingListViewModel) assemVMLazy.getValue()).LL;
            if (c1742820vSC == null || (str = c1742820vSC.LJIIIIZZ) == null) {
                str = "";
            }
            linkedHashMap.put("page_name", str);
            linkedHashMap.put("enter_method", "auction_follow");
            IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
            if (iECommerceMallService != null && iECommerceMallService.hitTopTabExpExperiment()) {
                str2 = "homepage_mall";
            } else {
                str2 = "mall";
            }
            linkedHashMap.put("enter_from", str2);
            linkedHashMap.put("entrance_type", "auction_follow");
            C1507790pL7.LIZ.getClass();
            C1507790pL7.LIZJ("tiktokec_module_slide", linkedHashMap);
        }
    }

    public static final void LJJIIJ$1(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i) {
        ((C19606111nH) ((FriendsV3EmojiAnimAssem) asS50S0100000_24.l0).LLJJIJIIJIL.getValue()).LIZ();
    }

    public static final void LJJIIJ$10(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i) {
        if (i != 0 && i != 1) {
            return;
        }
        ((InterfaceC1569000qvq) ((SwitchInboxToReportStoryNegativeFeedbackAssem) asS50S0100000_24.l0).LLILLL.getValue()).LIZ(C1569160qw6.LIZIZ, i);
    }

    public static final void LJJIIJ$11(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i) {
        AbstractC1569120qw2 abstractC1569120qw2LIZIZ;
        if ((i != 0 && i != 1) || (abstractC1569120qw2LIZIZ = C1569180qw8.LIZIZ(((SwitchToReportStoryNegativeFeedbackAssem) asS50S0100000_24.l0).bo())) == null) {
            return;
        }
        ((InterfaceC1569000qvq) ((SwitchToReportStoryNegativeFeedbackAssem) asS50S0100000_24.l0).LLIZ.getValue()).LIZ(abstractC1569120qw2LIZIZ, i);
    }

    public static final void LJJIIJ$2(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i) {
        BulletinPageAutoPlayAssem bulletinPageAutoPlayAssem = (BulletinPageAutoPlayAssem) asS50S0100000_24.l0;
        bulletinPageAutoPlayAssem.LLJILJILJ = i;
        if (i == 0) {
            if (bulletinPageAutoPlayAssem.LLJIJIL >= 0) {
                bulletinPageAutoPlayAssem.Ho(1);
            } else {
                bulletinPageAutoPlayAssem.Ho(-1);
            }
            ((BulletinPageAutoPlayAssem) asS50S0100000_24.l0).LLJIJIL = 0;
        }
    }

    public static final void LJJIIJ$3(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i) {
        if (i != 1) {
            return;
        }
        if (((C1599840rja) asS50S0100000_24.l0).LJIIIZ.getValue() == EnumC1599860rjc.EXPANDED) {
            C1599780rjU c1599780rjU = C1599780rjU.LIZ;
            if (!C1599780rjU.LJ) {
                c1599780rjU.LIZIZ();
            }
        }
        C01VZ.LL.getClass();
        C01VZ.LIZIZ();
    }

    public static final void LJJIIJ$4(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i) {
        Iterator<InterfaceC1572780r1w> it2 = ((SeriesProfileTabAssem) asS50S0100000_24.l0).ip().LLILLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJIIJ$5(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i) {
        boolean z;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int iIntValue;
        int itemCount;
        SchoolPostListAssem schoolPostListAssem = (SchoolPostListAssem) asS50S0100000_24.l0;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        schoolPostListAssem.LLJJIJIIJIL = z;
        if (i == 0) {
            if (Intrinsics.LJFF(schoolPostListAssem.Jo().LLIZLLLIL, EnumC1581430rFt.SLIDE_SHOW_MORE_CONTENT.getValue())) {
                ((SchoolPostListAssem) asS50S0100000_24.l0).Jo().LLIZLLLIL = EnumC1581430rFt.OTHER.getValue();
            }
            if (((C1579330rCV) ((SchoolPostListAssem) asS50S0100000_24.l0).Jo().getState()).LL.LLILLJJLI instanceof C491001vg) {
                RecyclerView.LayoutManager layoutManager = ((SchoolPostListAssem) asS50S0100000_24.l0).Go().getLayoutManager();
                if ((layoutManager instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
                    int[] iArr = new int[staggeredGridLayoutManager.LJJIII()];
                    staggeredGridLayoutManager.LJIJJ(iArr);
                    Integer numLJJJJJL = C13LQ.LJJJJJL(iArr);
                    if (numLJJJJJL != null) {
                        iIntValue = numLJJJJJL.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    AbstractC21673619ry adapter = ((SchoolPostListAssem) asS50S0100000_24.l0).Go().getAdapter();
                    if (adapter != null && (itemCount = adapter.getItemCount()) > 0 && iIntValue >= itemCount - 1) {
                        ((SchoolPostListAssem) asS50S0100000_24.l0).Jo().manualListRetry(EnumC323450Cm7.Next);
                    }
                }
            }
        }
    }

    public static final void LJJIIJ$6(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i) {
        ((C1600480rkc) asS50S0100000_24.l0).LJJIFFI(i, false);
    }

    public static final void LJJIIJ$7(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((LiveSkylightTrackAssem) asS50S0100000_24.l0).getClass();
            if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).B4().LJIILIIL("livesdk_draw_message_window")) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from_merge", "homepage_friends");
                c2344009Gk.LJIIIIZZ("enter_method", "live_cover");
                Map<String, String> map = c2344009Gk.LIZ;
                boolean z = C486660J6q.LIZ;
                C20684815ws.LJIILLIIL("livesdk_draw_message_window", map);
            }
        }
    }

    public static final void LJJIIJ$8(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i) {
        RecyclerView.ViewHolder childViewHolder;
        if (i != 0) {
            if (i != 1 && i != 2) {
                return;
            }
            C1598650rhf c1598650rhf = (C1598650rhf) asS50S0100000_24.l0;
            RecyclerView.LayoutManager layoutManager = c1598650rhf.LLJJJJJIL.getLayoutManager();
            if (layoutManager != null) {
                int childCount = layoutManager.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = layoutManager.getChildAt(i2);
                    if (childAt != null && (childViewHolder = c1598650rhf.LLJJJJJIL.getChildViewHolder(childAt)) != null) {
                        c1598650rhf.U5().realPauseAnimation(childViewHolder);
                    }
                }
            }
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k6().updateInboxListScrollState(i);
            return;
        }
        ((C1598650rhf) asS50S0100000_24.l0).n3(EnumC1598770rhr.SCROLL_IDLE);
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k6().updateInboxListScrollState(i);
    }

    public static final void LJJIIJ$9(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i) {
        if (i != 0) {
            return;
        }
        C1563650qnD c1563650qnD = (C1563650qnD) asS50S0100000_24.l0;
        c1563650qnD.LIZLLL.LIZJ(new C1557630qdV(new C1557400qd8(i, c1563650qnD.LJI, c1563650qnD.LJII)));
    }

    public static final void LJJIIZI$0(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i, int i2) {
        ((BulletinPageAutoPlayAssem) asS50S0100000_24.l0).LLJIJIL += i2;
    }

    public static final void LJJIIZI$1(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i, int i2) {
        SchoolPostCell schoolPostCell;
        if (i2 != 0) {
            if (Intrinsics.LJFF(((SchoolPostListAssem) asS50S0100000_24.l0).Jo().LLIZLLLIL, EnumC1581430rFt.OTHER.getValue())) {
                ((SchoolPostListAssem) asS50S0100000_24.l0).Jo().LLIZLLLIL = EnumC1581430rFt.SLIDE_SHOW_MORE_CONTENT.getValue();
            }
            if (i2 != 0) {
                ((SchoolPostListAssem) asS50S0100000_24.l0).Jo().LLILZLL = true;
            }
        }
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Boolean, Unit> interfaceC1631620sYq = ((SchoolPostListAssem) asS50S0100000_24.l0).LLJILJILJ;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(Integer.valueOf(iComputeVerticalScrollOffset), Integer.valueOf(i2), Boolean.valueOf(((SchoolPostListAssem) asS50S0100000_24.l0).LLJJIJIIJIL));
        }
        ((SchoolPostListAssem) asS50S0100000_24.l0).getClass();
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (childAt != null) {
                RecyclerView.ViewHolder viewHolderFindContainingViewHolder = recyclerView.findContainingViewHolder(childAt);
                if ((viewHolderFindContainingViewHolder instanceof SchoolPostCell) && (schoolPostCell = (SchoolPostCell) viewHolderFindContainingViewHolder) != null) {
                    schoolPostCell.N5();
                    if (schoolPostCell.LLJJIII) {
                        Rect rect = new Rect();
                        if (!schoolPostCell.itemView.getGlobalVisibleRect(rect) || rect.height() <= 0) {
                            schoolPostCell.W5();
                        }
                    }
                }
            }
        }
    }

    public static final void LJJIIZI$2(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i, int i2) {
        C1573020r2K.LIZIZ((View) asS50S0100000_24.l0, recyclerView.canScrollHorizontally(1));
    }

    public static final void LJJIIZI$3(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i, int i2) {
        ((C1600480rkc) asS50S0100000_24.l0).setScrollDy(i2);
    }

    public static final void LJJIIZI$4(AsS50S0100000_24 asS50S0100000_24, RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        C1563650qnD c1563650qnD = (C1563650qnD) asS50S0100000_24.l0;
        c1563650qnD.LJI = i;
        c1563650qnD.LJII = i2;
        long jUptimeMillis = SystemClock.uptimeMillis();
        C1563650qnD c1563650qnD2 = (C1563650qnD) asS50S0100000_24.l0;
        int i3 = c1563650qnD2.LIZIZ;
        if ((i3 <= 0 || jUptimeMillis - c1563650qnD2.LJFF >= i3) && Math.abs(i2) <= ((C1563650qnD) asS50S0100000_24.l0).LIZJ) {
            int iAbs = Math.abs(i);
            C1563650qnD c1563650qnD3 = (C1563650qnD) asS50S0100000_24.l0;
            if (iAbs <= c1563650qnD3.LIZJ) {
                c1563650qnD3.LJFF = jUptimeMillis;
                c1563650qnD3.LIZLLL.LIZJ(new C1557630qdV(new C1557410qd9(i, i2)));
            }
        }
    }
}
