package Y;

import X.C08JS;
import X.C09JN;
import X.C0SZ8;
import X.C1012040cRW;
import X.C1022030chd;
import X.C1022080chi;
import X.C1022090chj;
import X.C1022100chk;
import X.C1022620cia;
import X.C1023500ck0;
import X.C1026350cob;
import X.C1027230cq1;
import X.C1041360dCo;
import X.C1050610dRj;
import X.C1050860dS8;
import X.C1054430dXt;
import X.C1065740dq8;
import X.C1075580e60;
import X.C123100dR;
import X.C1371430lnB;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1657950tFJ;
import X.C1658060tFU;
import X.C1C7U;
import X.C2188811AlT;
import X.C259800zU;
import X.C606810Nr5;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.InterfaceC1014040cUk;
import X.InterfaceC1023650ckF;
import X.InterfaceC1065730dq7;
import X.InterfaceC420801kM;
import android.R;
import android.app.Activity;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.api.BACouponApi;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.model.CouponRedeemedStateVM;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class AfS152S0200000_16 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS152S0200000_16 afS152S0200000_16, Object obj) {
        C1C7U.LIZ("ExternalShareGroupUtils@7fa9.processExternalGroupShare$4");
        ((SharePackage) afS152S0200000_16.l0).extras.putInt("external_share_group_invitation_fail", 0);
        ((Function1) afS152S0200000_16.l1).invoke(obj);
        C1C7U.LIZIZ("ExternalShareGroupUtils@7fa9.processExternalGroupShare$4");
    }

    public static final void accept$1(AfS152S0200000_16 afS152S0200000_16, Object obj) {
        C1C7U.LIZ("ExternalShareGroupUtils@7fa9.processExternalGroupShare$5");
        ((SharePackage) afS152S0200000_16.l0).extras.putInt("external_share_group_invitation_fail", 1);
        ((Function1) afS152S0200000_16.l1).invoke(new C1371430lnB("", (String) null, 6));
        C1C7U.LIZIZ("ExternalShareGroupUtils@7fa9.processExternalGroupShare$5");
    }

    public static final void accept$10(AfS152S0200000_16 afS152S0200000_16, Object obj) {
        String str;
        LiveData liveData;
        C1C7U.LIZ("BACouponSheetView@c4ec.requestRedeemCoupon$1");
        BACouponApi.BaseResponse baseResponse = (BACouponApi.BaseResponse) obj;
        C786410Ut5.LJIIJ((DialogC1389620mGW) afS152S0200000_16.l0);
        int i = 1;
        if (baseResponse.statusCode == 0 && ((str = baseResponse.statusMsg) == null || str.length() == 0)) {
            CouponRedeemedStateVM couponVM = ((C1050860dS8) afS152S0200000_16.l1).getCouponVM();
            if (couponVM != null && (liveData = (LiveData) couponVM.LL.getValue()) != null) {
                liveData.setValue(Boolean.TRUE);
            }
            ((C1050860dS8) afS152S0200000_16.l1).LL.setRedeemed(true);
        } else {
            Activity activityLIZ = C1388190mED.LIZ(((C1050860dS8) afS152S0200000_16.l1).getContext());
            if (activityLIZ != null) {
                String str2 = baseResponse.statusMsg;
                if (str2 != null && C123100dR.LIZ(str2)) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIJ(str2);
                    c1389890mGx.LIZ(true);
                    c1389890mGx.LJIIJJI();
                } else {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ);
                    c1389890mGx2.LJIIIZ(2131822154);
                    c1389890mGx2.LIZ(true);
                    c1389890mGx2.LJIIJJI();
                }
            }
            i = 0;
        }
        C1050610dRj c1050610dRj = new C1050610dRj();
        C1050860dS8 c1050860dS8 = (C1050860dS8) afS152S0200000_16.l1;
        c1050610dRj.LJIL(c1050860dS8.LLILLL, c1050860dS8.LLILLJJLI, c1050860dS8.LL, i);
        C1C7U.LIZIZ("BACouponSheetView@c4ec.requestRedeemCoupon$1");
    }

    public static final void accept$11(AfS152S0200000_16 afS152S0200000_16, Object obj) {
        C1C7U.LIZ("BACouponSheetView@c4ec.requestRedeemCoupon$2");
        C786410Ut5.LJIIJ((DialogC1389620mGW) afS152S0200000_16.l0);
        Activity activityLIZ = C1388190mED.LIZ(((C1050860dS8) afS152S0200000_16.l1).getContext());
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131824748);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
        C1050610dRj c1050610dRj = new C1050610dRj();
        C1050860dS8 c1050860dS8 = (C1050860dS8) afS152S0200000_16.l1;
        c1050610dRj.LJIL(c1050860dS8.LLILLL, c1050860dS8.LLILLJJLI, c1050860dS8.LL, 0);
        C1C7U.LIZIZ("BACouponSheetView@c4ec.requestRedeemCoupon$2");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void accept$2(AfS152S0200000_16 afS152S0200000_16, Object obj) throws JSONException {
        C1C7U.LIZ("FeedsFEBridgeModel@3052.delegateRequest$2");
        FeedsResponse feedsResponse = (FeedsResponse) obj;
        InterfaceC1065730dq7 interfaceC1065730dq7 = ((C1065740dq8) afS152S0200000_16.l0).LLILLJJLI;
        JSONObject jSONObject = new JSONObject();
        C1065740dq8 c1065740dq8 = (C1065740dq8) afS152S0200000_16.l0;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("react_id", c1065740dq8.LL);
        jSONObject2.put("page", c1065740dq8.LLILZLL);
        jSONObject2.put("has_more", feedsResponse.hasMore);
        jSONObject2.put("exist_list_raw", C08JS.LIZLLL(feedsResponse.list));
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "feeds_status_change");
        jSONObject.put("eventType", 0);
        interfaceC1065730dq7.sendStatus("notification", jSONObject, 3);
        ((C1065740dq8) afS152S0200000_16.l0).handleData(feedsResponse);
        C1065740dq8 c1065740dq82 = (C1065740dq8) afS152S0200000_16.l0;
        Activity activity = (Activity) afS152S0200000_16.l1;
        c1065740dq82.getClass();
        if (activity != null) {
            activity.findViewById(R.id.content).setTag(com.zhiliaoapp.musically.R.id.cjt, c1065740dq82);
        }
        ((C1065740dq8) afS152S0200000_16.l0).mIsLoading = false;
        C1C7U.LIZIZ("FeedsFEBridgeModel@3052.delegateRequest$2");
    }

    public static final void accept$3(AfS152S0200000_16 afS152S0200000_16, Object obj) {
        InterfaceC420801kM interfaceC420801kM;
        C1C7U.LIZ("SamsungPageServiceImpl@8330.tryReportQipOpen$1");
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openAppsByQIP focus: ");
        sbLIZ.append(zBooleanValue);
        C1022620cia.LJ("SamsungPageService", C2188811AlT.LIZIZ(sbLIZ));
        if (!zBooleanValue && (interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) afS152S0200000_16.l0).element) != null && !interfaceC420801kM.isDisposed()) {
            C1022620cia.LJ("SamsungPageService", "openAppsByQIP report qipOpenSuccess");
            C1022080chi c1022080chi = new C1022080chi((AwemeRawAd) afS152S0200000_16.l1);
            C1022100chk c1022100chk = C1022100chk.LIZ;
            String str = C1022030chd.LIZLLL;
            if (str == null) {
                str = "draw_ad";
            }
            c1022100chk.getClass();
            C1022090chj.LIZ.getClass();
            c1022080chi.logAd(C1023500ck0.LIZJ(str, "qip_open_success", "minicard", new InterfaceC1023650ckF[]{c1022100chk.LJI(C1022090chj.LIZIZ, C1022090chj.LIZJ, C1022090chj.LIZLLL, C1022090chj.LJ)}));
            InterfaceC420801kM interfaceC420801kM2 = (InterfaceC420801kM) ((C259800zU) afS152S0200000_16.l0).element;
            if (interfaceC420801kM2 != null) {
                interfaceC420801kM2.dispose();
            }
            ((C259800zU) afS152S0200000_16.l0).element = null;
        }
        C1C7U.LIZIZ("SamsungPageServiceImpl@8330.tryReportQipOpen$1");
    }

    public static final void accept$4(AfS152S0200000_16 afS152S0200000_16, Object obj) {
        InterfaceC1014040cUk interfaceC1014040cUk;
        String creativeIdStr;
        String logExtra;
        C1C7U.LIZ("JumpBOCHandler@280b.doHandle$1");
        if (!((Boolean) obj).booleanValue() && (interfaceC1014040cUk = (InterfaceC1014040cUk) afS152S0200000_16.l0) != null) {
            AwemeRawAd awemeRawAdLJI = ((C1027230cq1) afS152S0200000_16.l1).LJI();
            if (awemeRawAdLJI == null || (creativeIdStr = awemeRawAdLJI.getCreativeIdStr()) == null) {
                creativeIdStr = "";
            }
            AwemeRawAd awemeRawAdLJI2 = ((C1027230cq1) afS152S0200000_16.l1).LJI();
            if (awemeRawAdLJI2 != null) {
                logExtra = awemeRawAdLJI2.getLogExtra();
            } else {
                logExtra = null;
            }
            interfaceC1014040cUk.LIZJ(creativeIdStr, logExtra, C1026350cob.LIZLLL(Integer.valueOf(C1012040cRW.LIZIZ().LJIIIIZZ)), ((C1027230cq1) afS152S0200000_16.l1).LJ().LIZIZ.LIZ);
        }
        C1C7U.LIZIZ("JumpBOCHandler@280b.doHandle$1");
    }

    public static final void accept$5(AfS152S0200000_16 afS152S0200000_16, Object obj) {
        C1C7U.LIZ("StatusReportRetryUtilsKt@5e7.sendStatus$1$1");
        ((Function2) afS152S0200000_16.l0).invoke(obj, Integer.valueOf(((C1075580e60) afS152S0200000_16.l1).LLILZ));
        C1C7U.LIZIZ("StatusReportRetryUtilsKt@5e7.sendStatus$1$1");
    }

    public static final void accept$6(AfS152S0200000_16 afS152S0200000_16, Object obj) {
        C1C7U.LIZ("StatusReportRetryUtilsKt@5e7.sendStatus$1$2");
        ((Function2) afS152S0200000_16.l0).invoke(obj, Integer.valueOf(((C1075580e60) afS152S0200000_16.l1).LLILZ));
        C1C7U.LIZIZ("StatusReportRetryUtilsKt@5e7.sendStatus$1$2");
    }

    public static final void accept$7(AfS152S0200000_16 afS152S0200000_16, Object obj) {
        Map map = (Map) afS152S0200000_16.l0;
        C1C7U.LIZ("FullFeedFragmentPanel@9b2e.onBackupUpdateEvent$1L");
        ((C0SZ8) obj).LLLZLZ(map);
        C1C7U.LIZIZ("FullFeedFragmentPanel@9b2e.onBackupUpdateEvent$1L");
    }

    public static final void accept$8(AfS152S0200000_16 afS152S0200000_16, Object obj) {
        C1C7U.LIZ("PhotoToolbarView@bbec.setAdapter$2");
        ((C1658060tFU) afS152S0200000_16.l0).LIZ((C1657950tFJ) obj);
        Function0 function0 = (Function0) afS152S0200000_16.l1;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("PhotoToolbarView@bbec.setAdapter$2");
    }

    public static final void accept$9(AfS152S0200000_16 afS152S0200000_16, Object obj) {
        C1C7U.LIZ("CommerceShopifyService@7678.popupGuidanceDisclaimer$backGroundDisposable$1");
        if (((C606810Nr5) obj).LIZIZ) {
            C1054430dXt c1054430dXt = (C1054430dXt) afS152S0200000_16.l0;
            AwemeRawAd awemeRawAd = (AwemeRawAd) afS152S0200000_16.l1;
            c1054430dXt.getClass();
            C1041360dCo.LIZ.getClass();
            if (C1041360dCo.LIZLLL && C1054430dXt.LIZ(awemeRawAd, null)) {
                C1054430dXt.LIZIZ(3L, awemeRawAd);
            }
        }
        C1C7U.LIZIZ("CommerceShopifyService@7678.popupGuidanceDisclaimer$backGroundDisposable$1");
    }

    public AfS152S0200000_16(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
