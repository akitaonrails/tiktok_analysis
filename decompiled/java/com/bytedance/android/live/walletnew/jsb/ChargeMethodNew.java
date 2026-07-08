package com.bytedance.android.live.walletnew.jsb;

import X.C054G;
import X.C09CT;
import X.C09JN;
import X.C0IJT;
import X.C0IXW;
import X.C0PEM;
import X.C0U53;
import X.C0UO0;
import X.C1161920gLG;
import X.C1388190mED;
import X.C13LE;
import X.C158B;
import X.C1776960wLG;
import X.C1796440wqg;
import X.C1796560wqs;
import X.C1797120wrm;
import X.C1797190wrt;
import X.C1797270ws1;
import X.C1797350ws9;
import X.C1802770x0t;
import X.C1803370x1r;
import X.C1803450x1z;
import X.C1803610x2F;
import X.C1803620x2G;
import X.C1803630x2H;
import X.C1803800x2Y;
import X.C1804180x3A;
import X.C1804840x4E;
import X.C1804850x4F;
import X.C1805120x4g;
import X.C1805760x5i;
import X.C1807660x8m;
import X.C1807890x99;
import X.C19748512Ol;
import X.C1AF0;
import X.C20337914i1;
import X.C2093608Ic;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C467820IWe;
import X.C474500IjA;
import X.C495520Jby;
import X.C497740JfY;
import X.C501470JlZ;
import X.C501520Jle;
import X.EnumC1781470wSX;
import X.InterfaceC1791930wjP;
import X.InterfaceC1797050wrf;
import X.InterfaceC1797340ws8;
import X.InterfaceC1803290x1j;
import X.InterfaceC1804390x3V;
import X.InterfaceC2217461Bqa;
import Y.AfS148S0200000_12;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.walletnew.BaseRechargeViewModel;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.live.walletnew.jsb.ChargeMethodNew;
import com.bytedance.android.livesdk.livesetting.wallet.LiveEmailIncentiveSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeEmailBindRegionSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeEmailBindingSchemaSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeEmailUgConsentRegionSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletGPInsufficientFundGuidanceSetting;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.tracking.TrackingEventV3Data;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;
import tikcast.api.wallet.tiktok.CheckEmailNotificationEligibilityResult;
import tikcast.api.wallet.tiktok.QueryOrderResult;
import webcast.api.profit.IapListResult;

/* JADX INFO: loaded from: classes28.dex */
public final class ChargeMethodNew extends C1803630x2H {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public BaseRechargeViewModel LLILZLL;
    public final C054G LLIZ;
    public final C1803610x2F LLIZLLLIL;
    public volatile C1805120x4g LLJ;

    public static final class EmailResponseArgs {

        @C09CT("registration_ab_test_group")
        public int abGroup;

        @C09CT("cashback_max")
        public int cashbackMax;

        @C09CT("cashback_percent")
        public int cashbackPercent;

        @C09CT("eligibility")
        public int eligibility;

        @C09CT("email_consent_needed")
        public boolean emailConsentNeeded;

        @C09CT("expiry_date")
        public long expiryDate;

        public EmailResponseArgs() {
            this(0, 0, 0L, 0, true, EnumC1781470wSX.CONTROL.getGroup());
        }

        public EmailResponseArgs(int i, int i2, long j, int i3, boolean z, int i4) {
            this.cashbackPercent = i;
            this.cashbackMax = i2;
            this.expiryDate = j;
            this.eligibility = i3;
            this.emailConsentNeeded = z;
            this.abGroup = i4;
        }
    }

    public static final class PayResponseSuccessArgs {

        @C09CT("code")
        public int code;

        @C09CT("email_incentive")
        public EmailResponseArgs emailIncentive;

        @C09CT("kyc_incentive")
        public QueryOrderResult.KYCIncentive kycIncentive;

        @C09CT("quantity")
        public int quantity;

        @C09CT("quick_charge_info")
        public QueryOrderResult.QuickChargeInfo quickChargeInfo;

        @C09CT("total_diamond_count")
        public int totalDiamondCount;

        @C09CT("total_unlocked_vault_gift")
        public Long totalUnlockedVaultGift;

        @C09CT("vault_target_cta")
        public String vaultTargetSchema;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChargeMethodNew.class, "cashierPreloadUseCase", "getCashierPreloadUseCase()Lcom/bytedance/android/live/walletclean/domain/usecase/preload/IFECashierPreloadUseCase;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final Diamond LJFF() {
        String strOptString;
        C1804840x4E c1804840x4E;
        JSONObject jSONObjectOptJSONObject = LIZ().LIZLLL.optJSONObject("args");
        if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("iap_id")) == null) {
            strOptString = "";
        }
        BaseRechargeViewModel baseRechargeViewModel = this.LLILZLL;
        if (baseRechargeViewModel == null || (c1804840x4E = baseRechargeViewModel.LLIZ) == null) {
            return null;
        }
        return c1804840x4E.LIZLLL(strOptString);
    }

    public final String LJI() {
        return LJIIIZ() ? "live_detail" : "my_profile";
    }

    public final Map<String, String> LJII() {
        JSONObject jSONObjectOptJSONObject = LIZ().LIZLLL.optJSONObject("args");
        Map<String, String> mapLIZ = null;
        try {
            TrackingEventV3Data trackingEventV3Data = (TrackingEventV3Data) C19748512Ol.LIZIZ.LJII(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("event_data") : null, TrackingEventV3Data.class);
            if (trackingEventV3Data != null) {
                mapLIZ = trackingEventV3Data.LIZ();
                return mapLIZ;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return mapLIZ;
    }

    public final List<String> LJIIIIZZ() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject = LIZ().LIZLLL.optJSONObject("args");
        if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("voucher_token_list")) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArrayOptJSONArray.optString(i));
        }
        return arrayList;
    }

    public final boolean LJIIIZ() {
        JSONObject jSONObjectOptJSONObject = LIZ().LIZLLL.optJSONObject("args");
        return ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).canRedirectRechargeV3() && Intrinsics.LJFF(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("retention_dialog_id") : null, "recharge_v3_retention_dialog");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    @Override // X.C1803630x2H, X.InterfaceC1803460x20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ww(X.C1777440wM2 r15) {
        /*
            r14 = this;
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.006A r2 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.wallet.IWalletService r2 = (com.bytedance.android.live.wallet.IWalletService) r2
            android.content.Context r3 = r14.LL
            com.bytedance.android.livesdk.wallet.Diamond r4 = r15.LIZ
            r5 = 0
            java.lang.String r6 = r15.LIZJ
            java.lang.String r7 = r15.LIZLLL
            int r8 = r15.LIZIZ
            X.0wLG r0 = r15.LJFF
            if (r0 == 0) goto L30
            long r0 = r0.LIZIZ
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
        L1d:
            X.0wLG r0 = r15.LJFF
            if (r0 == 0) goto L2e
            boolean r0 = r0.LIZ
            r10 = 1
            if (r0 != r10) goto L2e
        L26:
            r11 = 1
            boolean r12 = r15.LJ
            r13 = 0
            r2.openCashierV3(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L2e:
            r10 = 0
            goto L26
        L30:
            r9 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.jsb.ChargeMethodNew.ww(X.0wM2):void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0x2F] */
    public ChargeMethodNew(Context context, IESJsBridge iESJsBridge) {
        super(context, iESJsBridge);
        this.LLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        this.LLIZLLLIL = new InterfaceC1797050wrf() { // from class: X.0x2F
            @Override // X.InterfaceC1797050wrf
            public final void LIZ(HashMap map) {
                int i;
                String strLIZ;
                int iZQ2;
                String str;
                String billingCountryCode;
                RechargeViewModel rechargeViewModel;
                Diamond diamond;
                Diamond diamond2;
                HashMap map2 = new HashMap();
                if (map != null) {
                    ChargeMethodNew chargeMethodNew = this.LIZ;
                    map2.putAll(map);
                    map2.putAll(chargeMethodNew.LLILZIL);
                }
                C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                BaseRechargeViewModel baseRechargeViewModel = this.LIZ.LLILZLL;
                if (baseRechargeViewModel != null && (diamond2 = baseRechargeViewModel.LLJILJIL) != null) {
                    i = diamond2.count;
                } else {
                    i = 0;
                }
                if (baseRechargeViewModel != null && (diamond = baseRechargeViewModel.LLJILJIL) != null) {
                    strLIZ = C1804850x4F.LIZ(diamond);
                } else {
                    strLIZ = null;
                }
                String strValueOf = String.valueOf(strLIZ);
                String strLJI = this.LIZ.LJI();
                Map<String, String> mapLJII = this.LIZ.LJII();
                BaseRechargeViewModel baseRechargeViewModel2 = this.LIZ.LLILZLL;
                if ((baseRechargeViewModel2 instanceof RechargeViewModel) && (rechargeViewModel = (RechargeViewModel) baseRechargeViewModel2) != null) {
                    iZQ2 = rechargeViewModel.ZQ2();
                } else {
                    iZQ2 = -1;
                }
                c1803800x2Y.getClass();
                HashMap map3 = new HashMap();
                map3.put("recharge_package", String.valueOf(i));
                map3.put("pay_method", C1796440wqg.LIZ());
                map3.put("request_page", strLJI);
                if (C497740JfY.LJIL()) {
                    str = "portrait";
                } else {
                    str = "landscape";
                }
                map3.put("room_orientation", str);
                w.LIZ.getClass();
                String str2 = "portal";
                String str3 = "";
                if (!Intrinsics.LJFF(w.LJIIL(), "portal")) {
                    str2 = "";
                }
                map3.put("charge_reason", str2);
                map3.put("is_multi", ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).sy0());
                map3.put("sub_match_type", ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).my());
                map3.put("currency", strValueOf);
                InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
                if (interfaceC1791930wjP != null && (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) != null) {
                    str3 = billingCountryCode;
                }
                map3.put("app_store_front", str3);
                map3.put("is_quick_charge_on", String.valueOf(iZQ2));
                C1803800x2Y.LJ(map3);
                if (mapLJII != null) {
                    map3.putAll(mapLJII);
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_pay");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
                c474500IjALIZ.LJJIIZI(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
                c474500IjALIZ.LJJII(C1803800x2Y.LJIILJJIL(), "is_first_recharge");
                c474500IjALIZ.LJJII(C1803800x2Y.LJIIL(null), "strategy_task_type");
                c474500IjALIZ.LJJIIZI(map3);
                c474500IjALIZ.LJJIIZI(map2);
                c474500IjALIZ.LIZ();
            }
        };
    }

    @Override // X.C1803630x2H, X.InterfaceC1803460x20
    public final void L6(C1804840x4E c1804840x4E, C1807890x99 c1807890x99) throws JSONException {
        Diamond diamondLJFF = LJFF();
        if (diamondLJFF == null) {
            LJIIJ(1, 0, 0, "1-10-10-00", "Empty Product Detail from google", new Exception("diamond isn null"), null, -1, null);
        } else {
            LIZLLL(diamondLJFF, LJIIIIZZ());
        }
    }

    public final void LIZJ(int i, Exception exc) throws JSONException {
        if (exc instanceof C501470JlZ) {
            CustomErrorExtra customErrorExtra = CustomErrorExtra.getCustomErrorExtra(exc);
            if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletException().cq0(customErrorExtra, i).booleanValue()) {
                LIZIZ().put("msg", C497740JfY.LJIJI(2131841017));
                return;
            }
            if (customErrorExtra == null) {
                return;
            }
            try {
                LIZIZ().put("custom_error", customErrorExtra.toJSONObject());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
    }

    public final void LIZLLL(Diamond diamond, List<String> list) throws JSONException {
        int iOptInt;
        Integer numValueOf;
        Integer numValueOf2;
        boolean zEQ2;
        int iZQ2;
        String strValueOf;
        Object obj;
        String str;
        String billingCountryCode;
        C1797120wrm c1797120wrm;
        Object obj2;
        RechargeViewModel rechargeViewModel;
        JSONObject jSONObjectOptJSONObject = LIZ().LIZLLL.optJSONObject("args");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        String strOptString = jSONObjectOptJSONObject.optString("panel_channel");
        String strOptString2 = jSONObjectOptJSONObject.optString("event_data");
        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("first_recharge");
        String str2 = "live_detail";
        if (LJIIIZ()) {
            iOptInt = 0;
        } else {
            iOptInt = jSONObjectOptJSONObject.optInt("charge_source", 1);
            if (iOptInt == 1) {
                str2 = "my_profile";
            }
        }
        boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("is_cus_recharge");
        int iOptInt2 = jSONObjectOptJSONObject.optInt("custom_coins_count");
        int iOptInt3 = jSONObjectOptJSONObject.optInt("custom_local_amount");
        int iOptInt4 = jSONObjectOptJSONObject.optInt("recharge_input_option");
        if (jSONObjectOptJSONObject.has("vault_gift_id")) {
            numValueOf = Integer.valueOf(jSONObjectOptJSONObject.optInt("vault_gift_id"));
        } else {
            numValueOf = null;
        }
        String strValueOf2 = String.valueOf(C1804850x4F.LIZ(diamond));
        if (jSONObjectOptJSONObject.isNull("sub_source")) {
            numValueOf2 = null;
        } else {
            numValueOf2 = Integer.valueOf(jSONObjectOptJSONObject.optInt("sub_source"));
        }
        boolean zOptBoolean3 = jSONObjectOptJSONObject.optBoolean("show_recharge_v3_retention_dialog", C1804180x3A.LIZJ());
        int iOptInt5 = jSONObjectOptJSONObject.optInt("campaign_type", -1);
        boolean zIsSupportPreloadReuseCashier = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).isSupportPreloadReuseCashier(iOptInt, jSONObjectOptJSONObject.optBoolean("is_from_revenue"));
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        int i = diamond.count;
        HashMap<String, String> map = this.LLILZIL;
        if (this.LLILZLL != null) {
            zEQ2 = BaseRechargeViewModel.EQ2();
        } else {
            zEQ2 = false;
        }
        String strLJI = LJI();
        Map<String, String> mapLJII = LJII();
        Integer numValueOf3 = Integer.valueOf(iOptInt);
        BaseRechargeViewModel baseRechargeViewModel = this.LLILZLL;
        if ((baseRechargeViewModel instanceof RechargeViewModel) && (rechargeViewModel = (RechargeViewModel) baseRechargeViewModel) != null) {
            iZQ2 = rechargeViewModel.ZQ2();
        } else {
            iZQ2 = -1;
        }
        c1803800x2Y.getClass();
        HashMap map2 = new HashMap();
        if (zOptBoolean2) {
            strValueOf = String.valueOf(iOptInt2);
        } else {
            strValueOf = String.valueOf(i);
        }
        map2.put("recharge_package", strValueOf);
        map2.put("request_page", strLJI);
        map2.put("timestamp", String.valueOf(C158B.LIZ()));
        String str3 = "";
        if (!map.containsKey("charge_reason")) {
            w.LIZ.getClass();
            if (!Intrinsics.LJFF(w.LJIIL(), "portal")) {
                obj2 = "";
            } else {
                obj2 = "portal";
            }
            map2.put("charge_reason", obj2);
        }
        w.LIZ.getClass();
        map2.put("portal_id", String.valueOf(w.LJIJ()));
        String str4 = "1";
        if (Intrinsics.LJFF(w.LJIIL(), "portal")) {
            obj = "1";
        } else {
            obj = "1";
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_portal_user", str4);
        if (!zEQ2) {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("abs_status", obj);
        if (C497740JfY.LJIL()) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        map2.put("room_orientation", str);
        map2.put("is_first_recharge", C1803800x2Y.LJIILJJIL());
        map2.put("strategy_task_type", C1803800x2Y.LJIIL(numValueOf3));
        map2.put("recharge_type", "feature_available");
        map2.put("currency", strValueOf2);
        InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
        if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
            billingCountryCode = "";
        }
        map2.put("app_store_front", billingCountryCode);
        map2.put("is_quick_charge_on", String.valueOf(iZQ2));
        map2.putAll(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
        C1803800x2Y.LJ(map2);
        if (mapLJII != null) {
            map2.putAll(mapLJII);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
        c474500IjALIZ.LJJIIZI(map2);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        JSONObject jSONObjectLJJJJL = C1803800x2Y.LJJJJL(linkedHashMap);
        JSONObject jSONObject = new JSONObject();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
        }
        C1807660x8m.LIZIZ("livesdk_recharge_click", jSONObjectLJJJJL, jSONObject, C1803800x2Y.LJJJJL(linkedHashMap2));
        String str5 = this.LLILZIL.get("charge_reason");
        if (str5 == null) {
            str5 = "";
        }
        C1797190wrt.LIZ = true;
        C1797190wrt.LIZJ = str2;
        C1797190wrt.LIZLLL = C1796440wqg.LIZ();
        C1797190wrt.LJ = str5;
        C1797190wrt.LJFF = C158B.LIZ();
        C1797190wrt.LIZIZ = zOptBoolean;
        if (zIsSupportPreloadReuseCashier) {
            c1797120wrm = null;
            C23250099c.LIZLLL(this.LLIZ, null, null, new C1803620x2G(this, null), 3);
        } else {
            c1797120wrm = null;
        }
        BaseRechargeViewModel baseRechargeViewModel2 = this.LLILZLL;
        if (baseRechargeViewModel2 != null) {
            Activity activityLIZ = C1388190mED.LIZ(this.LL);
            String str6 = this.LLILZIL.get("charge_reason");
            if (str6 != null) {
                str3 = str6;
            }
            C1803450x1z c1803450x1z = new C1803450x1z(activityLIZ, diamond, iOptInt, list, str3, str2, Boolean.valueOf(zOptBoolean), iOptInt5, numValueOf, numValueOf2, zOptBoolean3);
            C1776960wLG c1776960wLG = new C1776960wLG(zIsSupportPreloadReuseCashier, C158B.LIZ());
            if (Intrinsics.LJFF(strOptString, "tiktok") && zOptBoolean2) {
                c1797120wrm = new C1797120wrm(Integer.valueOf(iOptInt2), Integer.valueOf(iOptInt3), Integer.valueOf(iOptInt4));
            }
            baseRechargeViewModel2.xQ2(c1803450x1z, c1776960wLG, c1797120wrm, strOptString2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(com.bytedance.android.livesdk.wallet.Diamond r12, boolean r13) {
        /*
            r11 = this;
            boolean r0 = r11.LJIIIZ()
            if (r0 == 0) goto L79
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            kotlin.jvm.internal.AwS606S0100000_27 r6 = new kotlin.jvm.internal.AwS606S0100000_27
            r0 = 64
            r5 = r12
            r6.<init>(r5, r0)
            com.bytedance.android.live.walletnew.BaseRechargeViewModel r0 = r11.LLILZLL
            if (r0 == 0) goto L29
            X.0x4E r1 = r0.LLIZ
            if (r1 == 0) goto L29
            boolean r0 = r5.LIZIZ()
            if (r0 == 0) goto L39
            java.lang.String r0 = "tiktok"
        L23:
            java.lang.String r7 = r1.LIZ(r5, r0)
            if (r7 != 0) goto L2b
        L29:
            java.lang.String r7 = ""
        L2b:
            java.lang.String r8 = X.C1804850x4F.LIZLLL(r5)
            java.lang.String r9 = X.C1804850x4F.LIZIZ(r5)
            r10 = 0
            org.json.JSONObject r2 = com.bytedance.android.livesdk.wallet.Diamond.LIZJ(r5, r6, r7, r8, r9, r10)
            goto L3c
        L39:
            java.lang.String r0 = "google_play"
            goto L23
        L3c:
            java.lang.String r1 = "charge_response"
            org.json.JSONObject r0 = r11.LIZIZ()     // Catch: java.lang.Exception -> L72
            r4.put(r1, r0)     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = "retention_package"
            r4.put(r0, r2)     // Catch: java.lang.Exception -> L72
            java.lang.String r2 = "ChargeMethodNew"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = "Send cancel_recharge_retention_popup_continue_iap_charge_res, isSuccess "
            r1.append(r0)     // Catch: java.lang.Exception -> L72
            r1.append(r13)     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = ", payload "
            r1.append(r0)     // Catch: java.lang.Exception -> L72
            r1.append(r4)     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L72
            X.C20441214yg.LIZIZ(r2, r0)     // Catch: java.lang.Exception -> L72
            java.lang.String r3 = "cancel_recharge_v3_popup_continue_iap_charge_res"
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L72
            r0 = 0
            X.C389001fE.LIZ(r3, r4, r1, r0)     // Catch: java.lang.Exception -> L72
            return
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LIZIZ()
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.jsb.ChargeMethodNew.LJIILIIL(com.bytedance.android.livesdk.wallet.Diamond, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[PHI: r1
      0x003c: PHI (r1v6 java.lang.String) = (r1v1 java.lang.String), (r1v7 java.lang.String) binds: [B:10:0x003a, B:8:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C1803630x2H, X.InterfaceC1051760dTa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void call(X.C1058910df7 r13, org.json.JSONObject r14) throws org.json.JSONException {
        /*
            r12 = this;
            r5 = r12
            super.call(r13, r14)
            X.0df7 r0 = r5.LIZ()
            r11 = 0
            r0.LJIIJJI = r11
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r0 = com.bytedance.android.live.wallet.IWalletService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.wallet.IWalletService r0 = (com.bytedance.android.live.wallet.IWalletService) r0
            com.bytedance.android.live.wallet.IWalletCenter r1 = r0.walletCenter()
            r0 = 1
            X.0x6Q r0 = r1.ao2(r0)
            if (r0 == 0) goto L21
            r0.LIZ()
        L21:
            X.0df7 r0 = r5.LIZ()
            org.json.JSONObject r0 = r0.LIZLLL
            java.lang.String r2 = "args"
            org.json.JSONObject r3 = r0.optJSONObject(r2)
            java.lang.String r4 = ""
            if (r3 == 0) goto L39
            java.lang.String r0 = "iap_id"
            java.lang.String r1 = r3.optString(r0)
            if (r1 != 0) goto L3c
        L39:
            r1 = r4
            if (r3 == 0) goto L45
        L3c:
            java.lang.String r0 = "diamond_id"
            java.lang.String r0 = r3.optString(r0)
            if (r0 == 0) goto L45
            r4 = r0
        L45:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r0 = "iabId"
            r3.put(r0, r1)
            java.lang.String r0 = "diamondId"
            r3.put(r0, r4)
            java.lang.String r1 = "methodName"
            java.lang.String r0 = "ChargeMethod"
            r3.put(r1, r0)
            java.lang.String r0 = "ttlive_wallet_H5_query"
            X.C1807660x8m.LIZJ(r11, r0, r3)
            com.bytedance.android.live.walletnew.BaseRechargeViewModel r0 = r5.LLILZLL
            if (r0 != 0) goto L76
            com.bytedance.android.live.walletnew.BaseRechargeViewModel r4 = new com.bytedance.android.live.walletnew.BaseRechargeViewModel
            r6 = 0
            r10 = 1
            r8 = r6
            r4.<init>(r5, r6, r8, r10)
            r5.LLILZLL = r4
            X.0x2F r0 = r5.LLIZLLLIL
            r4.LLILZLL = r0
            r4.NQ2()
        L76:
            com.bytedance.android.livesdk.wallet.Diamond r1 = r5.LJFF()
            if (r1 != 0) goto L97
            org.json.JSONObject r0 = r13.LIZLLL
            org.json.JSONObject r1 = r0.optJSONObject(r2)
            if (r1 == 0) goto L8a
            java.lang.String r0 = "campaign_type"
            int r11 = r1.optInt(r0)
        L8a:
            com.bytedance.android.live.walletnew.BaseRechargeViewModel r6 = r5.LLILZLL
            if (r6 == 0) goto L96
            X.0x1W r8 = X.EnumC1803160x1W.USE
            r7 = 0
            long r9 = com.bytedance.android.live.walletnew.BaseRechargeViewModel.LLJJJ
            r6.HQ2(r7, r8, r9, r11)
        L96:
            return
        L97:
            java.util.List r0 = r5.LJIIIIZZ()
            r5.LIZLLL(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.jsb.ChargeMethodNew.call(X.0df7, org.json.JSONObject):void");
    }

    @Override // X.C1803630x2H, X.InterfaceC1803460x20
    public final void TI(Diamond diamond, C1796560wqs c1796560wqs, boolean z) throws JSONException {
        JSONObject jSONObject;
        boolean zEQ2;
        int iZQ2;
        String str;
        Object obj;
        Object obj2;
        String billingCountryCode;
        boolean z2;
        InterfaceC1803290x1j rechargeService;
        RechargeViewModel rechargeViewModel;
        String str2;
        Long lValueOf;
        QueryOrderResult.QuickChargeInfo quickChargeInfo;
        BaseResponse<QueryOrderResult.ChargeOrderData, QueryOrderResult.ChargeOrderExtra> baseResponse;
        QueryOrderResult.ChargeOrderExtra chargeOrderExtra;
        BaseResponse<QueryOrderResult.ChargeOrderData, QueryOrderResult.ChargeOrderExtra> baseResponse2;
        QueryOrderResult.ChargeOrderExtra chargeOrderExtra2;
        QueryOrderResult.VaultGiftInfo vaultGiftInfo;
        BaseResponse<QueryOrderResult.ChargeOrderData, QueryOrderResult.ChargeOrderExtra> baseResponse3;
        QueryOrderResult.ChargeOrderExtra chargeOrderExtra3;
        QueryOrderResult.VaultGiftInfo vaultGiftInfo2;
        QueryOrderResult.KYCIncentive kYCIncentive;
        BaseResponse<QueryOrderResult.ChargeOrderData, QueryOrderResult.ChargeOrderExtra> baseResponse4;
        QueryOrderResult.ChargeOrderExtra chargeOrderExtra4;
        boolean z3;
        InterfaceC1803290x1j rechargeService2;
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (iWalletService != null && (rechargeService2 = iWalletService.getRechargeService()) != null) {
            rechargeService2.LJIIZILJ();
        }
        Context context = this.LL;
        LiveRechargeEmailBindRegionSetting liveRechargeEmailBindRegionSetting = LiveRechargeEmailBindRegionSetting.INSTANCE;
        if (liveRechargeEmailBindRegionSetting.getValue()) {
            String email = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getEmail();
            if ((email == null || email.length() == 0) && liveRechargeEmailBindRegionSetting.getValue() && C0U53.Yd.LIZIZ().intValue() < 1) {
                z3 = true;
            } else {
                String email2 = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getEmail();
                if (email2 != null && email2.length() != 0 && LiveRechargeEmailUgConsentRegionSetting.INSTANCE.getValue() && C0U53.Zd.LIZIZ().intValue() < 1) {
                    z3 = false;
                }
            }
            C495520Jby c495520Jby = new C495520Jby(LiveRechargeEmailBindingSchemaSetting.INSTANCE.getEmailCollectUrl());
            c495520Jby.LIZ(9, "source");
            if (z3) {
                c495520Jby.LIZ(0, "step");
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520Jby.LIZLLL()));
                C20337914i1<Integer> c20337914i1 = C0U53.Yd;
                c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
            } else {
                Retrofit hostRetrofit = ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getHostRetrofit();
                if (hostRetrofit != null) {
                    ((IapApi) hostRetrofit.LIZ(IapApi.class)).getUgEmailConsent().LJIILIIL(new C0UO0()).LJJLL(new AfS148S0200000_12(c495520Jby, context, 52), new C09JN() { // from class: X.00Lf
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj3) {
                            C1C7U.LIZ("LiveRechargeEmailCollectionUtil@9c7.showRechargeEmailCollectionPageProfile$1$2");
                            C1C7U.LIZIZ("LiveRechargeEmailCollectionUtil@9c7.showRechargeEmailCollectionPageProfile$1$2");
                        }
                    });
                }
            }
        }
        InterfaceC1797340ws8 interfaceC1797340ws8LJ = C1797270ws1.LJ();
        String str3 = c1796560wqs.LIZIZ;
        if (str3 == null) {
            str3 = "";
        }
        C1797350ws9 c1797350ws9LIZJ = interfaceC1797340ws8LJ.LIZJ(str3);
        Gson gson = C19748512Ol.LIZIZ;
        PayResponseSuccessArgs payResponseSuccessArgs = new PayResponseSuccessArgs();
        if (!LJIIIZ()) {
            if (c1797350ws9LIZJ != null && (baseResponse4 = c1797350ws9LIZJ.LIZJ) != null && (chargeOrderExtra4 = (QueryOrderResult.ChargeOrderExtra) baseResponse4.extra) != null) {
                kYCIncentive = chargeOrderExtra4.kycIncentive;
            } else {
                kYCIncentive = null;
            }
            payResponseSuccessArgs.kycIncentive = kYCIncentive;
        }
        payResponseSuccessArgs.code = 0;
        payResponseSuccessArgs.quantity = c1796560wqs.LIZJ;
        if (diamond.LIZ()) {
            payResponseSuccessArgs.totalDiamondCount = diamond.LJIIIIZZ;
        } else {
            payResponseSuccessArgs.totalDiamondCount = diamond.count * c1796560wqs.LIZJ;
        }
        if (!LJIIIZ()) {
            CheckEmailNotificationEligibilityResult.Data dataLIZ = C1805760x5i.LIZ();
            if (dataLIZ != null) {
                LiveEmailIncentiveSetting liveEmailIncentiveSetting = LiveEmailIncentiveSetting.INSTANCE;
                payResponseSuccessArgs.emailIncentive = new EmailResponseArgs(liveEmailIncentiveSetting.getValue().cashbackPercent, liveEmailIncentiveSetting.getValue().cashbackMaxUsd, dataLIZ.expiryDate, dataLIZ.eligibility, dataLIZ.emailConsentNeeded, (int) dataLIZ.registrationAbTestGroup);
            }
            if (c1797350ws9LIZJ != null && (baseResponse3 = c1797350ws9LIZJ.LIZJ) != null && (chargeOrderExtra3 = (QueryOrderResult.ChargeOrderExtra) baseResponse3.extra) != null && (vaultGiftInfo2 = chargeOrderExtra3.vaultGiftInfo) != null) {
                str2 = vaultGiftInfo2.vaultGiftSchemaUrl;
            } else {
                str2 = null;
            }
            payResponseSuccessArgs.vaultTargetSchema = str2;
            if (c1797350ws9LIZJ != null && (baseResponse2 = c1797350ws9LIZJ.LIZJ) != null && (chargeOrderExtra2 = (QueryOrderResult.ChargeOrderExtra) baseResponse2.extra) != null && (vaultGiftInfo = chargeOrderExtra2.vaultGiftInfo) != null) {
                lValueOf = Long.valueOf(vaultGiftInfo.numGiftUnlocked);
            } else {
                lValueOf = null;
            }
            payResponseSuccessArgs.totalUnlockedVaultGift = lValueOf;
            if (c1797350ws9LIZJ != null && (baseResponse = c1797350ws9LIZJ.LIZJ) != null && (chargeOrderExtra = (QueryOrderResult.ChargeOrderExtra) baseResponse.extra) != null) {
                quickChargeInfo = chargeOrderExtra.quickChargeInfo;
            } else {
                quickChargeInfo = null;
            }
            payResponseSuccessArgs.quickChargeInfo = quickChargeInfo;
        }
        try {
            jSONObject = new JSONObject(GsonProtectorUtils.toJson(gson, payResponseSuccessArgs));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = null;
        }
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        int i = diamond.count;
        String strValueOf = String.valueOf(C1804850x4F.LIZ(diamond));
        String strValueOf2 = String.valueOf(c1796560wqs.LIZIZ);
        String strValueOf3 = String.valueOf(c1796560wqs.LIZJ);
        HashMap<String, String> map = this.LLILZIL;
        if (this.LLILZLL != null) {
            zEQ2 = BaseRechargeViewModel.EQ2();
        } else {
            zEQ2 = false;
        }
        String strLJI = LJI();
        Map<String, String> mapLJII = LJII();
        BaseRechargeViewModel baseRechargeViewModel = this.LLILZLL;
        if ((baseRechargeViewModel instanceof RechargeViewModel) && (rechargeViewModel = (RechargeViewModel) baseRechargeViewModel) != null) {
            iZQ2 = rechargeViewModel.ZQ2();
        } else {
            iZQ2 = -1;
        }
        c1803800x2Y.getClass();
        HashMap map2 = new HashMap();
        map2.put("request_page", strLJI);
        map2.put("pay_method", C1796440wqg.LIZ());
        map2.put("order_id", strValueOf2);
        map2.put("package_quantity", strValueOf3);
        if (C497740JfY.LJIL()) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        map2.put("room_orientation", str);
        map2.put("recharge_package", String.valueOf(i));
        String str4 = "1";
        if (zEQ2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("abs_status", obj);
        w.LIZ.getClass();
        if (!Intrinsics.LJFF(w.LJIIL(), "portal")) {
            obj2 = "";
        } else {
            obj2 = "portal";
        }
        map2.put("charge_reason", obj2);
        map2.put("portal_id", String.valueOf(w.LJIJ()));
        if (!Intrinsics.LJFF(w.LJIIL(), "portal")) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_portal_user", str4);
        if (!C2093608Ic.LJ(w.LJIIJJI())) {
            String strLJIIJJI = w.LJIIJJI();
            if (strLJIIJJI == null) {
                strLJIIJJI = "";
            }
            map2.put("enter_url_source", strLJIIJJI);
        }
        if (w.LJIIJ() != 0) {
            map2.put("enter_gift_id", String.valueOf(w.LJIIJ()));
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        map2.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        map2.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        map2.put("is_multi", ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).sy0());
        map2.put("sub_match_type", ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).my());
        map2.put("currency", strValueOf);
        InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
        if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
            billingCountryCode = "";
        }
        map2.put("app_store_front", billingCountryCode);
        map2.put("is_quick_charge_on", String.valueOf(iZQ2));
        map2.putAll(C467820IWe.LIZIZ());
        C1803800x2Y.LJ(map2);
        if (mapLJII != null) {
            map2.putAll(mapLJII);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_success");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJJ();
        c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
        c474500IjALIZ.LJJIIZI(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
        c474500IjALIZ.LJJII(C1803800x2Y.LJIILJJIL(), "is_first_recharge");
        c474500IjALIZ.LJJII(C1803800x2Y.LJIIL(null), "strategy_task_type");
        c474500IjALIZ.LJJIIZI(map2);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.LLILZ = jSONObject;
        if (c1796560wqs.LJ) {
            z2 = true;
            LIZIZ().put("is_success_before_retry", true);
        } else {
            z2 = true;
        }
        LJIILIIL(diamond, z2);
        BaseRechargeViewModel baseRechargeViewModel2 = this.LLILZLL;
        if (baseRechargeViewModel2 != null) {
            baseRechargeViewModel2.QQ2(diamond, c1796560wqs.LIZJ);
        }
        if (LJIIIZ()) {
            ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService().LJIILLIIL("google_play");
        }
        IWalletService iWalletService2 = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (iWalletService2 != null && (rechargeService = iWalletService2.getRechargeService()) != null) {
            rechargeService.LJIIZILJ();
        }
        this.LLILLJJLI.LIZ(LIZ().LIZIZ, LIZIZ());
        BaseRechargeViewModel baseRechargeViewModel3 = this.LLILZLL;
        if (baseRechargeViewModel3 != null) {
            baseRechargeViewModel3.onDestroy();
        }
        this.LLILZLL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
    @Override // X.C1803630x2H, X.InterfaceC1803460x20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zz(int r32, int r33, int r34, java.lang.String r35, java.lang.String r36, X.C1797250wrz r37, boolean r38) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.walletnew.jsb.ChargeMethodNew.zz(int, int, int, java.lang.String, java.lang.String, X.0wrz, boolean):void");
    }

    @Override // X.C1803630x2H, X.InterfaceC1803460x20
    public final void ey(int i, int i2, int i3, String str, String str2, Exception exc, InterfaceC1804390x3V interfaceC1804390x3V, IapListResult.ListResultExtra listResultExtra) {
        String strLIZ;
        int iZQ2;
        RechargeViewModel rechargeViewModel;
        Diamond diamond;
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        String str3 = this.LLILZIL.get("charge_reason");
        if (str3 == null) {
            str3 = "";
        }
        String strLJI = LJI();
        BaseRechargeViewModel baseRechargeViewModel = this.LLILZLL;
        if (baseRechargeViewModel != null && (diamond = baseRechargeViewModel.LLJILJIL) != null) {
            strLIZ = C1804850x4F.LIZ(diamond);
        } else {
            strLIZ = null;
        }
        String strValueOf = String.valueOf(strLIZ);
        HashMap<String, String> map = this.LLILZIL;
        String message = exc.getMessage();
        Map<String, String> mapLJII = LJII();
        BaseRechargeViewModel baseRechargeViewModel2 = this.LLILZLL;
        if ((baseRechargeViewModel2 instanceof RechargeViewModel) && (rechargeViewModel = (RechargeViewModel) baseRechargeViewModel2) != null) {
            iZQ2 = rechargeViewModel.ZQ2();
        } else {
            iZQ2 = -1;
        }
        c1803800x2Y.getClass();
        C1803800x2Y.LJJIJIL(null, null, str3, strLJI, "normal", CardStruct.IStatusCode.DEFAULT, strValueOf, map, null, "recharge_panel_load_package", i, i2, message, str, str2, null, mapLJII, iZQ2);
        LJIIJ(1, i, i2, str, str2, exc, null, -1, null);
    }

    public final void LJIIJ(int i, int i2, int i3, String str, String str2, Exception exc, Map<String, ? extends Object> map, int i4, C1803370x1r c1803370x1r) {
        try {
            LIZIZ().put("is_outside_channel", 0);
            LIZIZ().put("code", -1);
            LIZIZ().put("charge_error_code", i2);
            LIZIZ().put("detail_error_code", i3);
            LIZIZ().put("internal_error_code", i4);
            LIZIZ().put("error_message", exc.getMessage());
            LIZIZ().put("mapped_error_code", str);
            LIZIZ().put("mapped_error_message", str2);
            LIZIZ().put("msg", "");
            if (i2 == 31) {
                LIZIZ().put("source", 1);
            } else {
                LIZIZ().put("source", i);
            }
            if ((exc instanceof C501470JlZ) && i2 == 31) {
                LIZIZ().put("msg", ((C501470JlZ) exc).getPrompt());
                LIZIZ().put("charge_error_code", ((C501520Jle) exc).getErrorCode());
            } else if (i == 3 && i2 == 41) {
                LIZIZ().put("charge_error_code", 1);
            }
            if (c1803370x1r != null) {
                LIZIZ().put("should_handle_cancel_retention", C1802770x0t.LIZJ(c1803370x1r.LIZ, c1803370x1r.LJIIJJI));
                LIZIZ().put("cashier_show_timestamp", c1803370x1r.LIZLLL);
            }
            if (LiveWalletGPInsufficientFundGuidanceSetting.INSTANCE.getValue() != 0 && i4 == 11) {
                LIZIZ().put("should_skip_display_error", true);
            }
            LIZJ(i2, exc);
            if (map != null) {
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    LIZIZ().put((String) entry.getKey(), entry.getValue());
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLILLJJLI.LIZ(LIZ().LIZIZ, LIZIZ());
        BaseRechargeViewModel baseRechargeViewModel = this.LLILZLL;
        if (baseRechargeViewModel != null) {
            baseRechargeViewModel.onDestroy();
        }
        this.LLILZLL = null;
    }
}
