package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dRI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050340dRI extends AbstractC1066890drz {
    public boolean LLJ;
    public final boolean LLJI = true;

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1050340dRI();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.VERTICAL_SOLUTION_GAME.getTYPE();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI() {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1050340dRI.LJJIJIIJI():void");
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) {
        this.LLJ = true;
        LJJIJIIJI();
        super.p1(c2344009Gk);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        String extra;
        String extra2;
        String schema;
        Object groupId;
        String logExtra;
        String creativeIdStr;
        int chargeType;
        int systemOrigin;
        String id;
        Object c098200Yq;
        boolean zBooleanValue;
        boolean z;
        Object c098200Yq2;
        boolean zBooleanValue2;
        String extra3;
        if (!this.LLJ) {
            LJJIJIIJI();
        }
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        Activity activityLIZIZ = interfaceC1392640mLO.LIZIZ();
        LJJII(c2344009Gk, true, true);
        Keva repo = Keva.getRepo("TTCM_KEVA_REPO");
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            extra = anchorCommonStruct.getExtra();
        } else {
            extra = null;
        }
        repo.storeString("anchor_extra", extra);
        repo.storeString("group_id", LJIIZILJ().getGroupId());
        C1050540dRc c1050540dRc = C1050540dRc.LIZ;
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 != null) {
            extra2 = anchorCommonStruct2.getExtra();
        } else {
            extra2 = null;
        }
        c1050540dRc.getClass();
        C1050540dRc.LIZLLL(extra2);
        Bundle bundle = new Bundle();
        AnchorCommonStruct anchorCommonStruct3 = this.LLIZ;
        String str = "";
        if (anchorCommonStruct3 == null || (schema = anchorCommonStruct3.getSchema()) == null) {
            schema = "";
        }
        bundle.putBoolean("is_lynx_landing_page", true);
        bundle.putBoolean("hide_nav_bar", true);
        bundle.putBoolean("hide_status_bar", false);
        bundle.putBoolean("bundle_nav_bar_status_padding", this.LLJI);
        bundle.putBoolean("need_bottom_out", true);
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
        if (interfaceC1392640mLO2 == null) {
            interfaceC1392640mLO2 = null;
        }
        String authorUid = AwemeExtKt.getAuthorUid(interfaceC1392640mLO2.LJJLIIIJJIZ());
        if (authorUid == null) {
            authorUid = "";
        }
        C786410Ut5.LJJJI("author_id", authorUid, bundle);
        InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
        if (interfaceC1392640mLO3 == null) {
            interfaceC1392640mLO3 = null;
        }
        String aid = interfaceC1392640mLO3.LJJLIIIJJIZ().getAid();
        if (aid == null) {
            aid = "";
        }
        C786410Ut5.LJJJI("group_id", aid, bundle);
        AwemeRawAd awemeRawAd = LJIIZILJ().getAwemeRawAd();
        if (awemeRawAd == null || (groupId = awemeRawAd.getGroupId()) == null) {
            groupId = "";
        }
        C786410Ut5.LJJJI("aweme_group_id", groupId.toString(), bundle);
        AwemeRawAd awemeRawAd2 = LJIIZILJ().getAwemeRawAd();
        if (awemeRawAd2 != null) {
            logExtra = awemeRawAd2.getLogExtra();
        } else {
            logExtra = null;
        }
        C786410Ut5.LJJJI("bundle_download_app_log_extra", logExtra, bundle);
        AwemeRawAd awemeRawAd3 = LJIIZILJ().getAwemeRawAd();
        if (awemeRawAd3 != null) {
            creativeIdStr = awemeRawAd3.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        C786410Ut5.LJJJI("aweme_creative_id", creativeIdStr, bundle);
        AwemeRawAd awemeRawAd4 = LJIIZILJ().getAwemeRawAd();
        if (awemeRawAd4 != null) {
            chargeType = awemeRawAd4.getChargeType();
        } else {
            chargeType = 0;
        }
        bundle.putInt("charge_type", chargeType);
        AwemeRawAd awemeRawAd5 = LJIIZILJ().getAwemeRawAd();
        if (awemeRawAd5 != null) {
            systemOrigin = awemeRawAd5.getSystemOrigin();
        } else {
            systemOrigin = 0;
        }
        bundle.putInt("ad_system_origin", systemOrigin);
        AnchorCommonStruct anchorCommonStruct4 = this.LLIZ;
        if (anchorCommonStruct4 == null || (id = anchorCommonStruct4.getId()) == null) {
            id = "";
        }
        C786410Ut5.LJJJI("anchor_id", id, bundle);
        C786410Ut5.LJJIZ(bundle, "anchor_event_map", (HashMap) LJIJ(c2344009Gk));
        C786410Ut5.LJJJI("enter_from", LJIJJLI(), bundle);
        InterfaceC1392640mLO interfaceC1392640mLO4 = this.LL;
        if (interfaceC1392640mLO4 == null) {
            interfaceC1392640mLO4 = null;
        }
        String aid2 = interfaceC1392640mLO4.LJJLIIIJJIZ().getAid();
        if (aid2 == null) {
            aid2 = "";
        }
        C786410Ut5.LJJJI("from_group_id", aid2, bundle);
        C786410Ut5.LJJJI("detail_aweme_from", LJIJJLI(), bundle);
        Uri uri = UriProtector.parse(schema);
        if (uri.isHierarchical()) {
            C786410Ut5.LJJJI("bundle_origin_url", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "fallback_url"), bundle);
            if (TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "async_layout"), "1")) {
                bundle.putBoolean("preset_safe_point", true);
                bundle.putInt("thread_strategy", EnumC665490Q8l.PART_ON_LAYOUT.id());
            }
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        n nVar = new n();
        nVar.LJJIII(Integer.valueOf(C444960Hcc.LIZJ(LJIILJJIL()) ? 1 : 0), "isRTL");
        nVar.LJJIII(Integer.valueOf(C497820Jfg.LIZJ(LJIILJJIL())), "topSafeAreaHeight");
        builderBuildUpon.appendQueryParameter("lynx_landing_page_data", nVar.toString());
        if (!uri.isHierarchical()) {
            zBooleanValue = false;
        } else {
            try {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "use_game_partnership_sheet");
                if (!Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, CardStruct.IStatusCode.DEFAULT) && !Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1")) {
                    z = false;
                } else {
                    z = true;
                }
                c098200Yq = Boolean.valueOf(z);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = bool;
            }
            zBooleanValue = ((Boolean) c098200Yq).booleanValue();
        }
        if (!uri.isHierarchical()) {
            zBooleanValue2 = false;
        } else {
            try {
                c098200Yq2 = Boolean.valueOf(Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "use_game_partnership_sheet"), "1"));
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Boolean bool2 = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = bool2;
            }
            zBooleanValue2 = ((Boolean) c098200Yq2).booleanValue();
        }
        builderBuildUpon.appendQueryParameter("use_spark", "1");
        String strK0 = ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).K0("lynx_feed");
        if (zBooleanValue) {
            if (zBooleanValue2) {
                Pair[] pairArr = new Pair[5];
                AnchorCommonStruct anchorCommonStruct5 = this.LLIZ;
                if (anchorCommonStruct5 != null) {
                    extra3 = anchorCommonStruct5.getExtra();
                } else {
                    extra3 = null;
                }
                pairArr[0] = new Pair("anchor_extra", String.valueOf(extra3));
                String groupId2 = LJIIZILJ().getGroupId();
                if (groupId2 != null) {
                    str = groupId2;
                }
                pairArr[1] = new Pair("group_id", str);
                pairArr[2] = new Pair("anchor_type", String.valueOf(type()));
                pairArr[3] = new Pair("author_id", AwemeExtKt.getAuthorUid(LJIIZILJ()));
                InterfaceC1392640mLO interfaceC1392640mLO5 = this.LL;
                if (interfaceC1392640mLO5 == null) {
                    interfaceC1392640mLO5 = null;
                }
                pairArr[4] = new Pair("enter_from", interfaceC1392640mLO5.Cf());
                Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
                if (interfaceC20673515v3K4 != null) {
                    interfaceC20673515v3K4.LLJJIJI(LJIILJJIL(), builderBuildUpon.toString(), mapLJIIIIZZ, Boolean.FALSE);
                    return;
                }
                return;
            }
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(schema);
            c1537900q7g.getClass();
            new C1541950qED(activityLIZIZ, sparkContext).LIZIZ();
            return;
        }
        IAdSparkUtils iAdSparkUtilsLJFF = AdSparkUtils.LJFF();
        if (iAdSparkUtilsLJFF == null) {
            return;
        }
        iAdSparkUtilsLJFF.LIZ(activityLIZIZ, builderBuildUpon.toString(), bundle, strK0, C1000150c8L.LIZIZ(), false, null, null, null);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJIL(C712520RxC c712520RxC, InterfaceC705550Rlx interfaceC705550Rlx, InterfaceC1050330dRH interfaceC1050330dRH) {
        if (!this.LLJ) {
            LJJIJIIJI();
        }
    }
}
