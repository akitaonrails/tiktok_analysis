package X;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.0dRK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050360dRK extends AbstractC1066890drz {
    public boolean LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new C1050400dRO(this));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C1050380dRM(this));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C1050390dRN(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C1050370dRL(this));

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return new C1400390mXt(new AwS560S0100000_16(this, 698), new AwS560S0100000_16(this, 699), new AwS560S0100000_16(this, OppoPermissionPopupMaskDelayExp.DEFAULT), null, null, 24);
    }

    public final void LJJIJIIJIL() {
        Iterable iterable;
        Type type;
        p pVar = new p();
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        k kVarLJJIIZ = GsonProtectorUtils.parse(pVar, anchorCommonStruct != null ? anchorCommonStruct.getExtra() : null).LJIILIIL().LJJIIZ("gecko_channel");
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                type = new TypeToken<List<? extends String>>() { // from class: X.0dRP
                }.getType();
            } else {
                C13JX c13jx = KTypeProjection.LIZJ;
                C13JW c13jwLJII = C13LE.LJII(String.class);
                c13jx.getClass();
                type = C2371409Qy.LIZJ(C13LE.LJFF(List.class, C13JX.LIZ(c13jwLJII)));
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, kVarLJJIIZ, type);
            if (!(objFromJson instanceof List)) {
                objFromJson = null;
            }
            iterable = (Iterable) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            iterable = null;
        }
        ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).G0();
        C1024380clQ.LJIILJJIL(null, iterable != null ? C1687430u0r.LIZ(iterable) : null);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1050360dRK();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.TTCM.getTYPE();
    }

    public final void LJJIJIIJI() {
        if (LJIIZILJ().isAd()) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", LJIIZILJ().getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("ttam_download_anchor", "refer");
            c1022820ciuLIZLLL.LIZIZ(this.LLJILJILJ.getValue(), "partner_scence");
            c1022820ciuLIZLLL.LJII();
            return;
        }
        if (AwemeExtKt.isPseudoAd(LJIIZILJ())) {
            C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "othershow", C1017070cZd.LJJIJL(LJIIZILJ()));
            c1022820ciuLIZLLL2.LIZJ("ttam_download_anchor", "refer");
            c1022820ciuLIZLLL2.LIZIZ(this.LLJILJILJ.getValue(), "partner_scence");
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            c1022820ciuLIZLLL2.LIZIZ((interfaceC1392640mLO != null ? interfaceC1392640mLO : null).Cf(), "enter_from");
            c1022820ciuLIZLLL2.LJII();
            return;
        }
        C1050610dRj c1050610dRj = new C1050610dRj();
        Aweme awemeLJIIZILJ = LJIIZILJ();
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        Object value = this.LLJILJIL.getValue();
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
        c1050610dRj.LJJIII("ttelite_ba_product_link_anchor_show", awemeLJIIZILJ, anchorCommonStruct, "video_anchor", value, (interfaceC1392640mLO2 != null ? interfaceC1392640mLO2 : null).Cf());
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        if (!C04UD.LIZ()) {
            c2344009Gk.LJFF("is_ad_signal", ((C1065100dp6) LJJJJJL()).LJIIIIZZ("is_ad_signal"));
            LJJIIJ(c2344009Gk);
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        this.LLJ = true;
        if (!C04UD.LIZ()) {
            c2344009Gk.LJFF("is_ad_signal", ((C1065100dp6) LJJJJJL()).LJIIIIZZ("is_ad_signal"));
            super.p1(c2344009Gk);
        }
        LJJIJIIJIL();
        LJJIJIIJI();
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String schema;
        String str;
        if (!C04UD.LIZ()) {
            c2344009Gk.LJFF("is_ad_signal", ((C1065100dp6) LJJJJJL()).LJIIIIZZ("is_ad_signal"));
            LJJII(c2344009Gk, true, true);
        }
        String extra = null;
        String str2 = "click";
        if (LJIIZILJ().isAd()) {
            AwemeRawAd awemeRawAd = LJIIZILJ().getAwemeRawAd();
            if (awemeRawAd == null || !awemeRawAd.getEnableSoftAdAnchorClick()) {
                str2 = "otherclick";
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", str2, LJIIZILJ().getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("ttam_download_anchor", "refer");
            c1022820ciuLIZLLL.LIZIZ(this.LLJILJILJ.getValue(), "partner_scence");
            c1022820ciuLIZLLL.LJII();
        } else if (AwemeExtKt.isPseudoAd(LJIIZILJ())) {
            C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "click", C1017070cZd.LJJIJL(LJIIZILJ()));
            c1022820ciuLIZLLL2.LIZJ("ttam_download_anchor", "refer");
            c1022820ciuLIZLLL2.LIZIZ(this.LLJILJILJ.getValue(), "partner_scence");
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            c1022820ciuLIZLLL2.LIZIZ(interfaceC1392640mLO.Cf(), "enter_from");
            c1022820ciuLIZLLL2.LJII();
        } else {
            C1050610dRj c1050610dRj = new C1050610dRj();
            Aweme awemeLJIIZILJ = LJIIZILJ();
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            Object value = this.LLJILJIL.getValue();
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
            if (interfaceC1392640mLO2 == null) {
                interfaceC1392640mLO2 = null;
            }
            c1050610dRj.LJJIII("ttelite_ba_product_link_anchor_click", awemeLJIIZILJ, anchorCommonStruct, "video_anchor", value, interfaceC1392640mLO2.Cf());
        }
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 != null && (schema = anchorCommonStruct2.getSchema()) != null) {
            Keva repo = Keva.getRepo("TTCM_KEVA_REPO");
            AnchorCommonStruct anchorCommonStruct3 = this.LLIZ;
            if (anchorCommonStruct3 != null) {
                extra = anchorCommonStruct3.getExtra();
            }
            repo.storeString("anchor_extra", extra);
            repo.storeString("group_id", LJIIZILJ().getGroupId());
            Uri uri = UriProtector.parse(schema);
            Uri.Builder builderBuildUpon = uri.buildUpon();
            n nVar = new n();
            nVar.LJJIIJ("sourcePage", "ttcm_app");
            nVar.LJJIII(Integer.valueOf(C444960Hcc.LIZJ(LJIILJJIL()) ? 1 : 0), "isRTL");
            nVar.LJJIII(Integer.valueOf(C497820Jfg.LIZJ(LJIILJJIL())), "topSafeAreaHeight");
            builderBuildUpon.appendQueryParameter("lynx_landing_page_data", nVar.toString());
            builderBuildUpon.appendQueryParameter("sourcePage", "ttcm_app");
            if (LJIIZILJ().isAd()) {
                str = "ba_paid";
            } else {
                str = "ba_organic";
            }
            builderBuildUpon.appendQueryParameter("traffic_type", str);
            builderBuildUpon.appendQueryParameter("country_id", C2222691Bz1.LIZ());
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(builderBuildUpon.toString());
            sparkContext.LJJL("is_lynx_landing_page", true);
            sparkContext.LJJL("hide_nav_bar", true);
            sparkContext.LJJL("hide_status_bar", false);
            sparkContext.LJJL("bundle_nav_bar_status_padding", true);
            sparkContext.LJJL("need_bottom_out", true);
            if (uri.isHierarchical()) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "fallback_url");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                sparkContext.LJJJZ("bundle_origin_url", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                if (TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "async_layout"), "1")) {
                    sparkContext.LJJL("preset_safe_point", true);
                    sparkContext.LJJJLZIJ(EnumC665490Q8l.PART_ON_LAYOUT.id(), "thread_strategy");
                }
            }
            String strK0 = ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).K0("lynx_feed");
            if (C1000150c8L.LIZIZ()) {
                sparkContext.LJJJZ("use_forest", "1");
                if (strK0 != null) {
                    sparkContext.LJJJZ("access_key", strK0);
                }
            } else {
                AdSparkUtils.LJFF().LIZLLL(sparkContext, strK0);
            }
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            Activity activityLJIILJJIL = LJIILJJIL();
            c1537900q7g.getClass();
            new C1541950qED(activityLJIILJJIL, sparkContext).LIZIZ();
        }
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJIL(C712520RxC c712520RxC, InterfaceC705550Rlx interfaceC705550Rlx, InterfaceC1050330dRH interfaceC1050330dRH) {
        if (!this.LLJ) {
            LJJIJIIJIL();
        }
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        View viewLJJJJIZL = super.LJJJJIZL(viewGroup, dialog, c2344009Gk, i);
        LJJIJIIJI();
        return viewLJJJJIZL;
    }
}
