package Y;

import X.AbstractC1056160dag;
import X.AbstractC1585810rMx;
import X.AnonymousClass0317;
import X.C034S;
import X.C0PXJ;
import X.C1120604Zw;
import X.C18Z6;
import X.C18Z8;
import X.C18Z9;
import X.C196S;
import X.C1AQS;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C212360188o;
import X.C212362188q;
import X.C212363188r;
import X.C212364188s;
import X.C21271918Mj;
import X.C21272018Mk;
import X.C21330618dk;
import X.C2344009Gk;
import X.InterfaceC1547330qMt;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.EcCommentAnchorPanelActivity;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS467S0200000_32;

/* JADX INFO: loaded from: classes33.dex */
public class AsS57S0100000_32 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    public static final void LJJIIZI$8(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i, int i2) {
    }

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
            case 3:
            case 8:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 4:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 5:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 6:
                LJJIIJ$4(this, recyclerView, i);
                break;
            case 7:
                LJJIIJ$5(this, recyclerView, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIJ$6(this, recyclerView, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJIIJ$7(this, recyclerView, i);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJJIIJ$8(this, recyclerView, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJJIIJ$9(this, recyclerView, i);
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
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            case 4:
            case 5:
            case 6:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 7:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            case 8:
                LJJIIZI$5(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIZI$6(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJJIIZI$7(this, recyclerView, i, i2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJJIIZI$8(this, recyclerView, i, i2);
                break;
        }
    }

    public final void LJJIJIIJIL$0() {
        LinearLayoutManager linearLayoutManager;
        C212360188o c212360188o = (C212360188o) this.l0;
        if (c212360188o.LJI) {
            RecyclerView recyclerView = c212360188o.LIZIZ;
            RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
                return;
            }
            C212360188o c212360188o2 = (C212360188o) this.l0;
            if (!c212360188o2.LJFF.invoke(Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition())).booleanValue() || c212360188o2.LJIIIZ) {
                return;
            }
            c212360188o2.LJIIIZ = true;
            C0PXJ c0pxj = C0PXJ.LIZ;
            Map<String, String> mapInvoke = c212360188o2.LIZJ.invoke();
            Long l = c212360188o2.LJIJ;
            long jCurrentTimeMillis = l != null ? System.currentTimeMillis() - l.longValue() : 0L;
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("is_manual_finish", (!c212360188o2.LJIILJJIL || c212360188o2.LJIILIIL) ? "1" : CardStruct.IStatusCode.DEFAULT));
            c0pxj.getClass();
            C0PXJ.LJIIIZ(jCurrentTimeMillis, mapInvoke, mapLIZJ);
        }
    }

    public AsS57S0100000_32(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i) {
        ((C18Z9) asS57S0100000_32.l0).LJJIFFI(i, false);
    }

    public static final void LJJIIJ$1(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((C212363188r) asS57S0100000_32.l0).getClass();
        }
        ((C212363188r) asS57S0100000_32.l0).getClass();
    }

    public static final void LJJIIJ$2(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i) {
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        String name;
        if (i == 0) {
            AwemeRawAd awemeRawAd = null;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = false;
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    z = true;
                }
                String name2 = IAdDependencyService.class.getName();
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
            }
            IAdDependencyService iAdDependencyService = (IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
            AwemePruningModel awemePruningModel = ((EcCommentAnchorPanelActivity) asS57S0100000_32.l0).LLJJIII;
            if (awemePruningModel != null) {
                awemeRawAd = awemePruningModel.awemeRawAd;
            }
            AbstractC1056160dag abstractC1056160dagOnAdEvent = iAdDependencyService.onAdEvent("landing_ad", "landing_page_scroll", awemeRawAd);
            abstractC1056160dagOnAdEvent.LIZ.put("refer", "landing_page");
            abstractC1056160dagOnAdEvent.LIZIZ();
        }
    }

    public static final void LJJIIJ$3(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i) {
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        if (i == 0) {
            ArrayList arrayList = null;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IAdDependencyService.class.getName();
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
            }
            AbstractC1056160dag abstractC1056160dagOnAdEvent = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).onAdEvent("landing_ad", "landing_page_scroll", ((ECommerceAnchorPanelFragment) asS57S0100000_32.l0).LLJJI.awemeRawAd);
            abstractC1056160dagOnAdEvent.LIZ.put("refer", "landing_page");
            abstractC1056160dagOnAdEvent.LIZIZ.put("scroll_top", Float.valueOf(((ECommerceAnchorPanelFragment) asS57S0100000_32.l0).LLLFFI));
            abstractC1056160dagOnAdEvent.LIZIZ();
            C21271918Mj c21271918Mj = C21271918Mj.LIZ;
            ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = (ECommerceAnchorPanelFragment) asS57S0100000_32.l0;
            int i2 = eCommerceAnchorPanelFragment.LLLFFI;
            ProductListModel productListModel = eCommerceAnchorPanelFragment.LLJJI;
            C21272018Mk c21272018Mk = C21272018Mk.LIZ;
            List<AnchorProductInfoModel> list = productListModel.products;
            if (list != null) {
                arrayList = new ArrayList(list);
            }
            c21272018Mk.getClass();
            int iLJIILLIIL = C21272018Mk.LJIILLIIL(arrayList);
            String str = ((ECommerceAnchorPanelFragment) asS57S0100000_32.l0).LLJJ;
            c21271918Mj.getClass();
            C21271918Mj.LJIJJLI(i2, productListModel, iLJIILLIIL, str);
            ((ECommerceAnchorPanelFragment) asS57S0100000_32.l0).HS();
            ((ECommerceAnchorPanelFragment) asS57S0100000_32.l0).LLLFFI = 0;
        }
    }

    public static final void LJJIIJ$4(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i) {
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        if (i == 0) {
            ArrayList arrayList = null;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IAdDependencyService.class.getName();
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
            }
            AbstractC1056160dag abstractC1056160dagOnAdEvent = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).onAdEvent("landing_ad", "landing_page_scroll", ((ECommerceAnchorPanelFragment) asS57S0100000_32.l0).LLJJI.awemeRawAd);
            abstractC1056160dagOnAdEvent.LIZ.put("refer", "landing_page");
            abstractC1056160dagOnAdEvent.LIZIZ.put("scroll_top", Float.valueOf(((ECommerceAnchorPanelFragment) asS57S0100000_32.l0).LLLFFI));
            abstractC1056160dagOnAdEvent.LIZIZ();
            C21271918Mj c21271918Mj = C21271918Mj.LIZ;
            ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = (ECommerceAnchorPanelFragment) asS57S0100000_32.l0;
            int i2 = eCommerceAnchorPanelFragment.LLLFFI;
            ProductListModel productListModel = eCommerceAnchorPanelFragment.LLJJI;
            C21272018Mk c21272018Mk = C21272018Mk.LIZ;
            List<AnchorProductInfoModel> list = productListModel.products;
            if (list != null) {
                arrayList = new ArrayList(list);
            }
            c21272018Mk.getClass();
            int iLJIILLIIL = C21272018Mk.LJIILLIIL(arrayList);
            String str = ((ECommerceAnchorPanelFragment) asS57S0100000_32.l0).LLJJ;
            c21271918Mj.getClass();
            C21271918Mj.LJIJJLI(i2, productListModel, iLJIILLIIL, str);
            ((ECommerceAnchorPanelFragment) asS57S0100000_32.l0).HS();
            ((ECommerceAnchorPanelFragment) asS57S0100000_32.l0).LLLFFI = 0;
        }
    }

    public static final void LJJIIJ$5(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i) {
        String str;
        String str2;
        C212360188o c212360188o = (C212360188o) asS57S0100000_32.l0;
        if (!c212360188o.LJI) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2 && c212360188o.LJIILJJIL) {
                    c212360188o.LJIILIIL = false;
                    return;
                }
                return;
            }
            c212360188o.LJIILIIL = true;
            c212360188o.LJIILJJIL = false;
            return;
        }
        Integer num = c212360188o.LJIIJJI;
        int iLIZLLL = c212360188o.LIZLLL();
        if (num != null) {
            int i2 = ((C212360188o) asS57S0100000_32.l0).LJIIL;
            if (i2 <= 0 && (i2 < 0 || (iLIZLLL <= num.intValue() && iLIZLLL < num.intValue()))) {
                str = "up";
            } else {
                str = "down";
            }
            C0PXJ c0pxj = C0PXJ.LIZ;
            Map<String, String> mapInvoke = ((C212360188o) asS57S0100000_32.l0).LIZJ.invoke();
            Pair[] pairArr = new Pair[4];
            if (((C212360188o) asS57S0100000_32.l0).LJIILIIL) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[0] = new Pair("is_manual_slide", str2);
            pairArr[1] = new Pair("start_pct", num.toString());
            pairArr[2] = new Pair("end_pct", String.valueOf(iLIZLLL));
            pairArr[3] = new Pair("slide_direction", str);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            c0pxj.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJII(mapInvoke);
            c2344009Gk.LJII(mapLJIIIIZZ);
            c2344009Gk.LJIIIIZZ("is_page", "1");
            C20684815ws.LJIILLIIL("search_landing_page_slide", c2344009Gk.LIZ);
        }
        C212360188o c212360188o2 = (C212360188o) asS57S0100000_32.l0;
        c212360188o2.LJIIJJI = null;
        c212360188o2.LJIIL = 0;
        c212360188o2.LJIILIIL = true;
        c212360188o2.LJIILJJIL = false;
    }

    public static final void LJJIIJ$6(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i) {
        C18Z8 c18z8 = (C18Z8) asS57S0100000_32.l0;
        if (c18z8.LLIZ == null) {
            c18z8.setScrollState(i);
        }
    }

    public static final void LJJIIJ$7(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i) {
        C18Z6 c18z6 = (C18Z6) asS57S0100000_32.l0;
        if (c18z6.LLIZ == null) {
            c18z6.setScrollState(i);
        }
    }

    public static final void LJJIIJ$8(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i) {
        C21330618dk c21330618dk = (C21330618dk) asS57S0100000_32.l0;
        InterfaceC1547330qMt interfaceC1547330qMt = c21330618dk.i;
        if (interfaceC1547330qMt == null) {
            return;
        }
        c21330618dk.LL.LJ(interfaceC1547330qMt, c21330618dk.getView(), c21330618dk.LIZJ(), C2097908Jt.LIZJ(new Pair("scroll_state", Integer.valueOf(i))));
    }

    public static final void LJJIIJ$9(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((C21330618dk) asS57S0100000_32.l0).getView().invalidateItemDecorations();
        }
    }

    public static final void LJJIIZI$0(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i, int i2) {
        ((C18Z9) asS57S0100000_32.l0).setScrollDy(i2);
    }

    public static final void LJJIIZI$1(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i, int i2) {
        int iIntValue;
        ((C212363188r) asS57S0100000_32.l0).getClass();
        Math.abs(i);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            C212363188r c212363188r = (C212363188r) asS57S0100000_32.l0;
            if ((layoutManager instanceof GridLayoutManager) || (layoutManager instanceof LinearLayoutManager)) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                c212363188r.LLIZ = iFindFirstVisibleItemPosition;
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition != null) {
                    iIntValue = Integer.valueOf(viewFindViewByPosition.getLeft() - recyclerView.getPaddingStart()).intValue();
                } else {
                    iIntValue = 0;
                }
                c212363188r.LLIZLLLIL = iIntValue;
                c212363188r.e0(recyclerView);
            }
        }
    }

    public static final void LJJIIZI$2(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i, int i2) {
        ((C196S) asS57S0100000_32.l0).LLILZIL += i;
    }

    public static final void LJJIIZI$3(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i, int i2) {
        ((C212362188q) asS57S0100000_32.l0).canScrollHorizontally(-1);
        ((C212362188q) asS57S0100000_32.l0).canScrollHorizontally(1);
    }

    public static final void LJJIIZI$4(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i, int i2) {
        C212360188o c212360188o = (C212360188o) asS57S0100000_32.l0;
        if (!c212360188o.LJI) {
            return;
        }
        if (c212360188o.LJIIJJI == null) {
            c212360188o.LJIIJJI = Integer.valueOf(c212360188o.LIZLLL());
        }
        ((C212360188o) asS57S0100000_32.l0).LJIIL = i2;
        asS57S0100000_32.LJJIJIIJIL$0();
    }

    public static final void LJJIIZI$5(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i, int i2) {
        ((C212364188s) asS57S0100000_32.l0).LLLLLJIL();
    }

    public static final void LJJIIZI$6(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i, int i2) {
        ((C18Z8) asS57S0100000_32.l0).setScrollDy(i2);
    }

    public static final void LJJIIZI$7(AsS57S0100000_32 asS57S0100000_32, RecyclerView recyclerView, int i, int i2) {
        InterfaceC1547330qMt interfaceC1547330qMt = ((C21330618dk) asS57S0100000_32.l0).h;
        if (interfaceC1547330qMt == null) {
            return;
        }
        if ((i == 0 && i2 == 0) || recyclerView.getScrollState() == 0) {
            return;
        }
        ((C21330618dk) asS57S0100000_32.l0).LJLLJ().LIZIZ(recyclerView, new AwS467S0200000_32((C21330618dk) asS57S0100000_32.l0, interfaceC1547330qMt, 1));
    }
}
