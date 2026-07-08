package X;

import android.content.Context;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.walletnew.BaseRechargeViewModel;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x2E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803600x2E extends C1803630x2H {
    public BaseRechargeViewModel LLILZLL;
    public int LLIZ;

    public C1803600x2E(Context context, IESJsBridge iESJsBridge) {
        super(context, iESJsBridge);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0213  */
    @Override // X.C1803630x2H, X.InterfaceC1803460x20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L6(X.C1804840x4E r22, X.C1807890x99 r23) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1803600x2E.L6(X.0x4E, X.0x99):void");
    }

    @Override // X.C1803630x2H, X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) {
        Boolean boolValueOf;
        boolean zOptBoolean;
        EnumC1803160x1W enumC1803160x1W;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        String billingCountryCode;
        String str;
        JSONObject jSONObjectOptJSONObject3;
        super.call(c1058910df7, jSONObject);
        int iOptInt = 0;
        c1058910df7.LJIIJJI = false;
        HashMap map = new HashMap();
        map.put("methodName", "GetPurchaseItemListMethod");
        C1807660x8m.LIZJ(0, "ttlive_wallet_H5_query", map);
        JSONObject jSONObject2 = LIZ().LIZLLL;
        if (jSONObject2 != null && (jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("args")) != null) {
            boolValueOf = Boolean.valueOf(jSONObjectOptJSONObject3.optBoolean("disable_event_tracking"));
        } else {
            boolValueOf = null;
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            HashMap<String, String> map2 = this.LLILZIL;
            c1803800x2Y.getClass();
            HashMap map3 = new HashMap();
            map3.put("request_page", "my_profile");
            map3.put("timestamp", String.valueOf(C158B.LIZ()));
            InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
            String str2 = "";
            if (interfaceC1791930wjP == null || (billingCountryCode = interfaceC1791930wjP.getBillingCountryCode()) == null) {
                billingCountryCode = "";
            }
            map3.put("app_store_front", billingCountryCode);
            w.LIZ.getClass();
            String str3 = "portal";
            if (!Intrinsics.LJFF(w.LJIIL(), "portal")) {
                str3 = "";
            }
            map3.put("charge_reason", str3);
            if (!C2093608Ic.LJ(w.LJIIJJI())) {
                String strLJIIJJI = w.LJIIJJI();
                if (strLJIIJJI != null) {
                    str2 = strLJIIJJI;
                }
                map3.put("enter_url_source", str2);
            }
            if (w.LJIIJ() != 0) {
                map3.put("enter_gift_id", String.valueOf(w.LJIIJ()));
            }
            map3.put("platform_type", EnumC1063410dmN.JSB.toString());
            C1803800x2Y.LJ(map3);
            C1803800x2Y.LIZLLL(map3);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
            c474500IjALIZ.LJJII(C1803800x2Y.LJIILJJIL(), "is_first_recharge");
            c474500IjALIZ.LJJII(C1803800x2Y.LJIIL(null), "strategy_task_type");
            if (C497740JfY.LJIL()) {
                str = "portrait";
            } else {
                str = "landscape";
            }
            c474500IjALIZ.LJJII(str, "room_orientation");
            c474500IjALIZ.LJJIIZI(map3);
            c474500IjALIZ.LJJIIZI(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
            c474500IjALIZ.LJJIIZI(map2);
            c474500IjALIZ.LIZ();
        }
        JSONObject jSONObject3 = LIZ().LIZLLL;
        if (jSONObject3 != null && (jSONObjectOptJSONObject2 = jSONObject3.optJSONObject("args")) != null) {
            zOptBoolean = jSONObjectOptJSONObject2.optBoolean("use_cache");
        } else {
            zOptBoolean = true;
        }
        JSONObject jSONObject4 = LIZ().LIZLLL;
        if (jSONObject4 != null && (jSONObjectOptJSONObject = jSONObject4.optJSONObject("args")) != null) {
            iOptInt = jSONObjectOptJSONObject.optInt("campaign_type");
        }
        this.LLIZ = iOptInt;
        if (this.LLILZLL == null) {
            this.LLILZLL = new BaseRechargeViewModel(this, 0L, 0L, 1);
        }
        if (zOptBoolean) {
            enumC1803160x1W = EnumC1803160x1W.USE;
        } else {
            enumC1803160x1W = EnumC1803160x1W.NON_USE;
        }
        BaseRechargeViewModel baseRechargeViewModel = this.LLILZLL;
        if (baseRechargeViewModel != null) {
            baseRechargeViewModel.HQ2(null, enumC1803160x1W, BaseRechargeViewModel.LLJJJ, this.LLIZ);
        }
    }

    @Override // X.C1803630x2H, X.InterfaceC1803460x20
    public final void ey(int i, int i2, int i3, String str, String str2, Exception exc, InterfaceC1804390x3V interfaceC1804390x3V, IapListResult.ListResultExtra listResultExtra) {
        String channel;
        String strLIZ;
        Diamond diamond;
        try {
            LIZIZ().put("code", 1);
            LIZIZ().put("is_outside_channel", 0);
            LIZIZ().put("charge_error_code", i);
            LIZIZ().put("detail_error_code", i2);
            LIZIZ().put("mapped_error_code", str);
            LIZIZ().put("mapped_error_message", str2);
            LIZIZ().put("source", 1);
            LIZIZ().put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
            LIZIZ().put("msg", exc.getMessage());
            LIZIZ().put("internal_detail_code", i3);
            JSONObject jSONObjectLIZIZ = LIZIZ();
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext != null) {
                channel = iHostAppContext.getChannel();
            } else {
                channel = null;
            }
            jSONObjectLIZIZ.put("channel", channel);
            if (listResultExtra != null) {
                LIZIZ().put("extra_args", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, listResultExtra));
            }
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            String str3 = this.LLILZIL.get("charge_reason");
            if (str3 == null) {
                str3 = "";
            }
            BaseRechargeViewModel baseRechargeViewModel = this.LLILZLL;
            if (baseRechargeViewModel != null && (diamond = baseRechargeViewModel.LLJILJIL) != null) {
                strLIZ = C1804850x4F.LIZ(diamond);
            } else {
                strLIZ = null;
            }
            String strValueOf = String.valueOf(strLIZ);
            HashMap<String, String> map = this.LLILZIL;
            String message = exc.getMessage();
            c1803800x2Y.getClass();
            C1803800x2Y.LJJIJIL(null, null, str3, "my_profile", "normal", CardStruct.IStatusCode.DEFAULT, strValueOf, map, null, "recharge_panel_load_package", i, i2, message, str, str2, null, null, -1);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLILLJJLI.LIZ(LIZ().LIZIZ, LIZIZ());
        BaseRechargeViewModel baseRechargeViewModel2 = this.LLILZLL;
        if (baseRechargeViewModel2 != null) {
            baseRechargeViewModel2.onDestroy();
        }
        this.LLILZLL = null;
        this.LLIZ = 0;
    }
}
