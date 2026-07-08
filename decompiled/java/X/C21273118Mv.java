package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.AnchorCommonViewModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.ad.ShopAnchorSellingPointData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18Mv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21273118Mv implements InterfaceC2249881D4g, InterfaceC1392510mLB {
    public final ViewGroup LL;
    public final ECommerceAnchorPanelViewModel LLILLJJLI = new ECommerceAnchorPanelViewModel();
    public AnchorCommonViewModel LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public Double LLILZLL;
    public InterfaceC21275218Nq LLIZ;
    public final C054G LLIZLLLIL;
    public AnonymousClass0956 LLJ;

    @Override // X.InterfaceC2249881D4g
    public final void LJI(int i) {
    }

    @Override // X.InterfaceC2249881D4g
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC2249881D4g
    public final String LJIIJ(C2344009Gk c2344009Gk) {
        return "click_list";
    }

    @Override // X.InterfaceC2249881D4g
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC2249881D4g
    public final void LIZ() {
        Aweme awemeLJJLIIIJJIZ;
        String aid;
        Aweme awemeLJJLIIIJJIZ2;
        Aweme awemeLJJLIIIJJIZ3;
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        String aid2 = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJ = null;
        InterfaceC21275218Nq interfaceC21275218Nq = this.LLIZ;
        if (interfaceC21275218Nq != null) {
            interfaceC21275218Nq.LIZ();
        }
        this.LLILZ = false;
        this.LLILLJJLI.MQ2();
        C21272518Mp c21272518Mp = C21272518Mp.LIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILLJJLI.LL;
        C21272518Mp.LIZLLL(c21272518Mp, (interfaceC1392640mLO == null || (awemeLJJLIIIJJIZ3 = interfaceC1392640mLO.LJJLIIIJJIZ()) == null) ? null : awemeLJJLIIIJJIZ3.getAid());
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LLILLJJLI.LL;
        if (interfaceC1392640mLO2 != null && (awemeLJJLIIIJJIZ2 = interfaceC1392640mLO2.LJJLIIIJJIZ()) != null) {
            aid2 = awemeLJJLIIIJJIZ2.getAid();
        }
        C21272518Mp.LJ(aid2);
        InterfaceC1392640mLO interfaceC1392640mLO3 = this.LLILLJJLI.LL;
        if (interfaceC1392640mLO3 == null || (awemeLJJLIIIJJIZ = interfaceC1392640mLO3.LJJLIIIJJIZ()) == null || (aid = awemeLJJLIIIJJIZ.getAid()) == null || aid.length() == 0) {
            return;
        }
        C21272518Mp.LIZLLL.remove(aid);
    }

    public final void LIZIZ() {
        Aweme awemeLJJLIIIJJIZ;
        AwemeRawAd awemeRawAd;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        if (!(this.LLIZ instanceof C18NQ ? ECommerceAnchorPanelViewModel.wQ2(this.LLILLJJLI) : false)) {
            AnonymousClass0956 anonymousClass0956 = this.LLJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLILLJJLI.getClass();
            return;
        }
        this.LLILZ = true;
        InterfaceC21275218Nq interfaceC21275218Nq = this.LLIZ;
        if (interfaceC21275218Nq != null) {
            interfaceC21275218Nq.LIZLLL();
        }
        this.LLILLJJLI.getClass();
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LLILLJJLI;
        InterfaceC1392640mLO interfaceC1392640mLO = eCommerceAnchorPanelViewModel.LL;
        if (interfaceC1392640mLO == null || (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) == null || (awemeRawAd = awemeLJJLIIIJJIZ.getAwemeRawAd()) == null) {
            return;
        }
        Map<String, Object> map = eCommerceAnchorPanelViewModel.LLJIJIL;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAdDependencyService.class.getName(), anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
        }
        AbstractC1056160dag abstractC1056160dagOnAdEvent = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).onAdEvent("draw_ad", "othershow", awemeRawAd);
        abstractC1056160dagOnAdEvent.LIZ.put("refer", "shop_anchor_second_line");
        abstractC1056160dagOnAdEvent.LIZIZ.put("is_ad", awemeLJJLIIIJJIZ.isAd() ? "1" : CardStruct.IStatusCode.DEFAULT);
        abstractC1056160dagOnAdEvent.LIZIZ.put("is_single_anchor", "yes");
        C21273918Nd.LIZ(abstractC1056160dagOnAdEvent, awemeLJJLIIIJJIZ);
        abstractC1056160dagOnAdEvent.LIZIZ.put("selling_type", map.get("ec_anchor_info_list"));
        abstractC1056160dagOnAdEvent.LIZIZ.put("selling_text", map.get("ec_anchor_info_details"));
        abstractC1056160dagOnAdEvent.LIZIZ();
    }

    @Override // X.InterfaceC2249881D4g
    public final C1400390mXt getAnchorMobConfiguration() {
        return new C1400390mXt(new AwS576S0100000_32(this, 902), null, null, null, null, 30);
    }

    @Override // X.InterfaceC2249881D4g
    public final HashMap<String, String> getShowContentInfo() {
        return new HashMap<>();
    }

    public C21273118Mv(AbstractC2249871D4f abstractC2249871D4f) {
        this.LL = abstractC2249871D4f;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLIZLLLIL = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
    }

    @Override // X.InterfaceC2249881D4g
    public final boolean LIZJ(C2344009Gk c2344009Gk) {
        Aweme awemeLJJLIIIJJIZ;
        C21272618Mq c21272618Mq = C21272618Mq.LIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILLJJLI.LL;
        if (interfaceC1392640mLO != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        } else {
            awemeLJJLIIIJJIZ = null;
        }
        c21272618Mq.getClass();
        if (C21272618Mq.LJIILIIL(awemeLJJLIIIJJIZ)) {
            AnonymousClass0956 anonymousClass0956 = this.LLJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJ = C23250099c.LIZLLL(this.LLIZLLLIL, null, null, new C21164617s4(this, null), 3);
        }
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LLILLJJLI.LL;
        if (interfaceC1392640mLO2 != null) {
            C18LI.LIZ.getClass();
            C18LI.LIZ(interfaceC1392640mLO2);
        }
        c2344009Gk.LJ(C1104190eq9.LIZ(this.LL, "c20736.d0"), "btm_param_map_key");
        InterfaceC21275218Nq interfaceC21275218Nq = this.LLIZ;
        if (interfaceC21275218Nq != null) {
            interfaceC21275218Nq.LIZJ(c2344009Gk);
        }
        this.LLILZ = false;
        return true;
    }

    @Override // X.InterfaceC2249881D4g
    public final void LJIIL(double d) {
        Aweme awemeLJJLIIIJJIZ;
        Aweme awemeLJJLIIIJJIZ2;
        int i;
        boolean z;
        Aweme awemeLJJLIIIJJIZ3;
        Video video;
        Aweme awemeLJJLIIIJJIZ4;
        AwemeRawAd awemeRawAd;
        double dDoubleValue;
        int showTime;
        boolean z2;
        int videoLength;
        boolean z3;
        Aweme awemeLJJLIIIJJIZ5;
        Video video2;
        if (this.LLILZLL == null) {
            this.LLILZLL = Double.valueOf(d);
        }
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILLJJLI.LL;
        int videoLength2 = Integer.MAX_VALUE;
        double dDoubleValue2 = 0.0d;
        boolean z4 = false;
        if (interfaceC1392640mLO != null && (awemeLJJLIIIJJIZ4 = interfaceC1392640mLO.LJJLIIIJJIZ()) != null && (awemeRawAd = awemeLJJLIIIJJIZ4.getAwemeRawAd()) != null && C18NF.LIZ(awemeRawAd)) {
            if (!this.LLILZ) {
                Double d2 = this.LLILZLL;
                if (d2 != null) {
                    dDoubleValue = d2.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                ShopAnchorSellingPointData shopAnchorSellingPoints = awemeRawAd.getShopAnchorSellingPoints();
                if (shopAnchorSellingPoints != null) {
                    showTime = shopAnchorSellingPoints.getShowTime();
                } else {
                    showTime = 0;
                }
                if (d >= dDoubleValue + ((double) showTime)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int iFloor = (int) Math.floor(d);
                InterfaceC1392640mLO interfaceC1392640mLO2 = this.LLILLJJLI.LL;
                if (interfaceC1392640mLO2 != null && (awemeLJJLIIIJJIZ5 = interfaceC1392640mLO2.LJJLIIIJJIZ()) != null && (video2 = awemeLJJLIIIJJIZ5.getVideo()) != null) {
                    videoLength = video2.getVideoLength();
                } else {
                    videoLength = Integer.MAX_VALUE;
                }
                if (iFloor >= (videoLength / LSPassThroughRecordSizeConfig.DEFAULT) - 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 || z3) {
                    LIZIZ();
                    return;
                }
                return;
            }
            return;
        }
        C21272618Mq c21272618Mq = C21272618Mq.LIZ;
        InterfaceC1392640mLO interfaceC1392640mLO3 = this.LLILLJJLI.LL;
        Aweme awemeLJJLIIIJJIZ6 = null;
        if (interfaceC1392640mLO3 != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO3.LJJLIIIJJIZ();
        } else {
            awemeLJJLIIIJJIZ = null;
        }
        c21272618Mq.getClass();
        if (!C21272618Mq.LJIILIIL(awemeLJJLIIIJJIZ)) {
            InterfaceC1392640mLO interfaceC1392640mLO4 = this.LLILLJJLI.LL;
            if (interfaceC1392640mLO4 != null) {
                awemeLJJLIIIJJIZ2 = interfaceC1392640mLO4.LJJLIIIJJIZ();
            } else {
                awemeLJJLIIIJJIZ2 = null;
            }
            if (C21272618Mq.LJ(awemeLJJLIIIJJIZ2) && !this.LLILZ) {
                Double d3 = this.LLILZLL;
                if (d3 != null) {
                    dDoubleValue2 = d3.doubleValue();
                }
                InterfaceC1392640mLO interfaceC1392640mLO5 = this.LLILLJJLI.LL;
                if (interfaceC1392640mLO5 != null) {
                    awemeLJJLIIIJJIZ6 = interfaceC1392640mLO5.LJJLIIIJJIZ();
                }
                AnchorBizUtils.LIZ.getClass();
                if (AnchorBizUtils.LJJJLL(awemeLJJLIIIJJIZ6)) {
                    i = C21276218Oa.LIZ().delayShowSubtitle;
                } else {
                    i = C21276318Ob.LIZ().delayShowSubtitle;
                }
                if (d >= dDoubleValue2 + ((double) i)) {
                    z = true;
                } else {
                    z = false;
                }
                int iFloor2 = (int) Math.floor(d);
                InterfaceC1392640mLO interfaceC1392640mLO6 = this.LLILLJJLI.LL;
                if (interfaceC1392640mLO6 != null && (awemeLJJLIIIJJIZ3 = interfaceC1392640mLO6.LJJLIIIJJIZ()) != null && (video = awemeLJJLIIIJJIZ3.getVideo()) != null) {
                    videoLength2 = video.getVideoLength();
                }
                if (iFloor2 >= (videoLength2 / LSPassThroughRecordSizeConfig.DEFAULT) - 1) {
                    z4 = true;
                }
                if (z || z4) {
                    LIZIZ();
                }
            }
        }
    }

    @Override // X.InterfaceC2249881D4g
    public final void LJ(C2344009Gk c2344009Gk, Function1<? super Boolean, Unit> function1) {
        HashMap<String, String> showContentInfo;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        Aweme awemeLJJLIIIJJIZ;
        String name;
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LLILLJJLI;
        Context context = this.LL.getContext();
        ViewGroup viewGroup = this.LL;
        InterfaceC21275218Nq interfaceC21275218Nq = this.LLIZ;
        if (interfaceC21275218Nq != null) {
            showContentInfo = interfaceC21275218Nq.getShowContentInfo();
        } else {
            showContentInfo = null;
        }
        C21272618Mq c21272618Mq = C21272618Mq.LIZ;
        ProductListModel productListModel = this.LLILLJJLI.LLILLJJLI;
        c21272618Mq.getClass();
        ECommerceAnchorPanelViewModel.NQ2(eCommerceAnchorPanelViewModel, context, viewGroup, "anchor", "pdp", showContentInfo, null, C21272618Mq.LIZJ(productListModel), 284);
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
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILLJJLI.LL;
        if (interfaceC1392640mLO != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        } else {
            awemeLJJLIIIJJIZ = null;
        }
        iAdDependencyService.getShoppingCoupon(awemeLJJLIIIJJIZ, null);
        this.LLILLJJLI.YQ2("a2270.b2878.c20736.d0");
    }

    @Override // X.InterfaceC2249881D4g
    public final void LJIIIIZZ(AnchorCommonStruct anchorCommonStruct, InterfaceC1392640mLO interfaceC1392640mLO, int i, Function0 function0) {
        if (!this.LLILZIL) {
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C21273418My(this, anchorCommonStruct, interfaceC1392640mLO, false, i, null), 2);
            this.LLILZIL = true;
            C1345605Ok.LIZIZ(interfaceC1392640mLO.LJJLIIIJJIZ(), interfaceC1392640mLO.Cf());
        }
    }
}
