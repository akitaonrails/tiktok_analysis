package X;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.EmailCodeVerificationResultEvent;
import com.ss.android.ugc.aweme.app.services.IHybridABInfoService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INewUserJourneyService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Xbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852170Xbr {
    public static final C852170Xbr LIZ = new C852170Xbr();
    public static final HashMap<String, Long> LIZIZ = new HashMap<>();

    public static final void LIZ(C0XGR c0xgr) {
        int iIntValue;
        String str;
        Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
        int iLJI = 0;
        if (numLIZIZ != null) {
            iIntValue = numLIZIZ.intValue();
        } else {
            iIntValue = 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - C1150504el.LIZ().LJJIII;
        boolean zBooleanValue = C1514430pVp.LIZLLL().booleanValue();
        int i = !TextUtils.isEmpty(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) ? 1 : 0;
        C844470XAv.LIZ.getClass();
        if (C824390WVp.LIZJ(C844470XAv.LIZ())) {
            str = "on";
        } else {
            str = "off";
        }
        IPushPermissionApi iPushPermissionApi = (IPushPermissionApi) PluggableExtentionKt.pluggableSpi$default(IPushPermissionApi.class, false, false, false, 14, null);
        if (iPushPermissionApi != null) {
            iLJI = iPushPermissionApi.LJI();
        }
        c0xgr.LIZIZ(jElapsedRealtime, "from_start_to_current_duration");
        c0xgr.LIZ(iIntValue, "is_hybrid_ab_recv");
        c0xgr.LIZ(zBooleanValue ? 1 : 0, "is_cold_start_first_launch");
        c0xgr.LIZ(i, "is_did_ready");
        C0CR3.LIZ.getClass();
        c0xgr.LIZ(C0CR3.LJIIIZ ? 1 : 0, "is_hybrid_ab_api_rev");
        if (PluggableExtentionKt.pluggableSpi$default(INewUserJourneyService.class, false, false, false, 14, null) != null) {
            c0xgr.LIZ(C19254610Um.LIZIZ.LJJIJIIJI(), "is_in_nuj_process");
        }
        c0xgr.LIZJ("push_permission_status", str);
        c0xgr.LIZ(iLJI, "push_permission_popup_times");
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService != null) {
            c0xgr.LIZJ("device_check", iPluginService.getDeviceCheckResult().getEtValue());
        }
    }

    public static Bundle LJ(AbstractC849240XTe abstractC849240XTe) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        boolean z;
        JSONObject jSONObject;
        Bundle bundle = new Bundle();
        if (abstractC849240XTe == null) {
            return null;
        }
        try {
            jSONObject = abstractC849240XTe.LJ;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (jSONObject != null) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
        } else {
            jSONObjectOptJSONObject = null;
        }
        if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("et_params")) == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject2 != null) {
                String strOptString = jSONObjectOptJSONObject2.optString("field_name");
                if (strOptString.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C786410Ut5.LJJJI(strOptString, jSONObjectOptJSONObject2.optString("field_value"), bundle);
                }
            }
        }
        return bundle;
    }

    public static Bundle LJFF(Bundle bundle) {
        if (bundle != null) {
            return bundle.getBundle("et_params");
        }
        return null;
    }

    public static Map LJI(Bundle bundle) {
        Serializable serializable;
        if (bundle != null) {
            serializable = bundle.getSerializable("extra_param");
        } else {
            serializable = null;
        }
        if (!C19719512Dh.LJII(serializable)) {
            return null;
        }
        return (Map) serializable;
    }

    public static void LIZIZ(C0XGR c0xgr, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            String string = bundle.getString(str);
            if (string != null) {
                c0xgr.LIZJ(str, string);
            }
        }
    }

    public static void LIZJ(C0XGR c0xgr, Map map) {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Integer) {
                    c0xgr.LIZ(((Number) value).intValue(), str);
                } else if (value instanceof String) {
                    c0xgr.LIZJ(str, (String) value);
                } else if (value instanceof Long) {
                    c0xgr.LIZIZ(((Number) value).longValue(), str);
                } else {
                    c0xgr.LIZJ(str, "");
                }
            }
        }
    }

    public static void LIZLLL(C0XGR c0xgr, Bundle bundle) {
        Integer numValueOf;
        String string = null;
        if (bundle != null) {
            numValueOf = Integer.valueOf(bundle.getInt("skip_style"));
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 1) {
                c0xgr.LIZJ("skipable_type", "slogan_top");
            }
            c0xgr.LIZ(1, "is_skipable_login");
        }
        if (bundle != null) {
            Integer numValueOf2 = Integer.valueOf(bundle.getInt("show_vv_position"));
            if (numValueOf2 != null) {
                int iIntValue = numValueOf2.intValue();
                if (iIntValue == 1) {
                    c0xgr.LIZJ("skipable_type", "after_swipeup");
                } else if (iIntValue > 1) {
                    c0xgr.LIZJ("skipable_type", "after_vv");
                }
                c0xgr.LIZ(1, "is_skipable_login");
            }
            if (bundle != null) {
                string = bundle.getString("enter_method");
            }
        }
        if (Intrinsics.LJFF(string, "daily_predict")) {
            c0xgr.LIZ(1, "from_daily_predict");
        }
    }

    public static void LJII(boolean z, C0XYD c0xyd) {
        int i;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", c0xyd.getMobParams().LJJLIIIJJI());
        c0xgr.LIZLLL("enter_method", c0xyd.getMobParams().LLIIJI());
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        c0xgr.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C20684815ws.LJIILLIIL("verify_sms_code", c0xgr.LIZ);
    }

    public static void LJIIZILJ(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null && !bundle2.keySet().isEmpty()) {
            if (bundle != null) {
                C786410Ut5.LJJIIZI(bundle, new Bundle(bundle2), "et_params");
            }
        } else if (bundle != null) {
            bundle.remove("et_params");
        }
    }

    public static void LJIILLIIL(C852170Xbr c852170Xbr, boolean z, String str, String str2) {
        c852170Xbr.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("platform", "phone");
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZ(z ? 1 : 0, "is_success");
        c0xgr.LIZ(0, "error_code");
        C20684815ws.LJIILLIIL("verify_password_response", c0xgr.LIZ);
    }

    public static void LJIIIIZZ(boolean z, int i, String str, InterfaceC852200Xbu interfaceC852200Xbu, Map map) {
        boolean z2;
        long jLongValue;
        String string;
        String string2;
        String string3;
        String string4;
        int i2;
        int i3;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        Bundle extras;
        Bundle extras2;
        C0XGR c0xgr = new C0XGR();
        Map mapLJI = LJI(interfaceC852200Xbu.getExtras());
        if (mapLJI != null) {
            LIZJ(c0xgr, mapLJI);
        }
        String strNn = interfaceC852200Xbu.Nn();
        boolean z3 = true;
        int i4 = 0;
        if (strNn != null && strNn.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str2 = "";
        if (z2 && ((extras2 = interfaceC852200Xbu.getExtras()) == null || (strNn = extras2.getString("enter_type")) == null)) {
            strNn = "";
        }
        String strBt = interfaceC852200Xbu.bt();
        if (strBt.length() != 0) {
            z3 = false;
        }
        if (z3 && ((extras = interfaceC852200Xbu.getExtras()) == null || (strBt = extras.getString("login_panel_type")) == null)) {
            strBt = "";
        }
        c0xgr.LIZLLL("enter_method", interfaceC852200Xbu.LLIIJI());
        c0xgr.LIZLLL("enter_from", interfaceC852200Xbu.LJJLIIIJJI());
        c0xgr.LIZLLL("channel", interfaceC852200Xbu.channel());
        c0xgr.LIZLLL("page", interfaceC852200Xbu.dm());
        c0xgr.LIZ(z ? 1 : 0, "is_register");
        c0xgr.LIZ(i, "error_code");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = LIZIZ.get("login_submit");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = jCurrentTimeMillis;
        }
        c0xgr.LIZ((int) ((jCurrentTimeMillis - jLongValue) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "stay_time");
        c0xgr.LIZJ("enter_type", strNn);
        c0xgr.LIZJ("platform", str);
        Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
        if (numLIZIZ != null) {
            c0xgr.LIZ(numLIZIZ.intValue(), "is_ab_backend_resp_received");
        }
        C0CR3.LIZ.getClass();
        c0xgr.LIZ(C0CR3.LJIIIZ ? 1 : 0, "is_hybrid_ab_api_rev");
        Bundle extras3 = interfaceC852200Xbu.getExtras();
        if (extras3 == null || (string = extras3.getString("group_id")) == null) {
            string = "";
        }
        c0xgr.LIZJ("group_id", string);
        Bundle extras4 = interfaceC852200Xbu.getExtras();
        if (extras4 == null || (string2 = extras4.getString("author_id")) == null) {
            string2 = "";
        }
        c0xgr.LIZJ("author_id", string2);
        Bundle extras5 = interfaceC852200Xbu.getExtras();
        if (extras5 == null || (string3 = extras5.getString("previous_login_method")) == null) {
            string3 = "";
        }
        c0xgr.LIZJ("previous_login_method", string3);
        Bundle extras6 = interfaceC852200Xbu.getExtras();
        if (extras6 == null || (string4 = extras6.getString("prev_login_platform")) == null) {
            string4 = "";
        }
        c0xgr.LIZJ("prev_login_platform", string4);
        Bundle extras7 = interfaceC852200Xbu.getExtras();
        if (extras7 != null) {
            i2 = extras7.getInt("encouraged_platform");
        } else {
            i2 = 0;
        }
        c0xgr.LIZ(i2, "encouraged_platform");
        c0xgr.LIZJ("login_panel_type", strBt);
        Bundle extras8 = interfaceC852200Xbu.getExtras();
        if (extras8 != null) {
            i3 = extras8.getInt("login_last_time");
        } else {
            i3 = 0;
        }
        c0xgr.LIZ(i3, "login_last_time");
        c0xgr.LIZ(C19241810Po.LIZ(), "is_in_personalized_nuj");
        Bundle extras9 = interfaceC852200Xbu.getExtras();
        if (extras9 == null || (string5 = extras9.getString("sdk_name", "")) == null) {
            string5 = "";
        }
        c0xgr.LIZJ("sdk_name", string5);
        Bundle extras10 = interfaceC852200Xbu.getExtras();
        if (extras10 == null || (string6 = extras10.getString("sdk_version", "")) == null) {
            string6 = "";
        }
        c0xgr.LIZJ("sdk_version", string6);
        if (PluggableExtentionKt.pluggableSpi$default(INewUserJourneyService.class, false, false, false, 14, null) != null) {
            c0xgr.LIZ(C19254610Um.LIZIZ.LJJIL().LIZJ(interfaceC852200Xbu.LLIIJI()) ? 1 : 0, "is_forced_login_copywrite_show");
        }
        Bundle extras11 = interfaceC852200Xbu.getExtras();
        if (extras11 == null || (string7 = extras11.getString("verify_method")) == null) {
            string7 = "";
        }
        c0xgr.LIZJ("verify_method", string7);
        Bundle extras12 = interfaceC852200Xbu.getExtras();
        if (extras12 == null || (string8 = extras12.getString("send_type")) == null) {
            string8 = "";
        }
        c0xgr.LIZJ("send_type", string8);
        Bundle extras13 = interfaceC852200Xbu.getExtras();
        if (extras13 != null && (string10 = extras13.getString("auto_login_platform")) != null) {
            str2 = string10;
        }
        c0xgr.LIZJ("auto_login_platform", str2);
        Bundle extras14 = interfaceC852200Xbu.getExtras();
        if (extras14 != null) {
            i4 = extras14.getInt("multiple_auto_login_accounts");
        }
        c0xgr.LIZ(i4, "multiple_auto_login_accounts");
        Bundle extras15 = interfaceC852200Xbu.getExtras();
        if (extras15 != null && (string9 = extras15.getString("gsma_fail_reason")) != null) {
            c0xgr.LIZJ("gsma_fail_reason", string9);
        }
        LIZIZ(c0xgr, LJFF(interfaceC852200Xbu.getExtras()));
        if (map != null) {
            LIZJ(c0xgr, map);
        }
        LIZ(c0xgr);
        C20684815ws.LJIILLIIL("login_failure", c0xgr.LIZ);
        C2211631BhB.LJIILL("b1728", null);
        if (C307150C2f.LIZ != 0) {
            C1848530yCh.LIZIZ("nuj_login", AFwS248S0000000_14.get$arr$(525), 62);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("platform", str);
        jSONObject.put("error_code", i);
        C793770VBv.LJII("login_failure", jSONObject, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(java.lang.Boolean r15, java.lang.String r16, X.InterfaceC852200Xbu r17, boolean r18, java.util.Map r19) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C852170Xbr.LJIIJ(java.lang.Boolean, java.lang.String, X.0Xbu, boolean, java.util.Map):void");
    }

    public static void LJIIL(boolean z, String str, InterfaceC852200Xbu interfaceC852200Xbu, C0XO2 c0xo2, Map map) {
        boolean z2;
        long j;
        long jLongValue;
        String string;
        String string2;
        String string3;
        String string4;
        int i;
        int i2;
        String string5;
        String string6;
        int i3;
        long j2;
        String string7;
        String string8;
        String string9;
        String string10;
        Bundle extras;
        Bundle extras2;
        C0XGR c0xgr = new C0XGR();
        Map mapLJI = LJI(interfaceC852200Xbu.getExtras());
        if (mapLJI != null) {
            LIZJ(c0xgr, mapLJI);
        }
        String strNn = interfaceC852200Xbu.Nn();
        boolean z3 = true;
        if (strNn != null && strNn.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str2 = "";
        if (z2 && ((extras2 = interfaceC852200Xbu.getExtras()) == null || (strNn = extras2.getString("enter_type")) == null)) {
            strNn = "";
        }
        String strBt = interfaceC852200Xbu.bt();
        if (strBt.length() != 0) {
            z3 = false;
        }
        if (z3 && ((extras = interfaceC852200Xbu.getExtras()) == null || (strBt = extras.getString("login_panel_type")) == null)) {
            strBt = "";
        }
        Bundle extras3 = interfaceC852200Xbu.getExtras();
        if (extras3 != null && (string10 = extras3.getString("verify_method")) != null) {
            c0xgr.LIZJ("verify_method", string10);
        }
        Bundle extras4 = interfaceC852200Xbu.getExtras();
        if (extras4 != null && (string9 = extras4.getString("send_type")) != null) {
            c0xgr.LIZJ("send_type", string9);
        }
        c0xgr.LIZLLL("enter_method", interfaceC852200Xbu.LLIIJI());
        c0xgr.LIZLLL("enter_from", interfaceC852200Xbu.LJJLIIIJJI());
        c0xgr.LIZLLL("channel", interfaceC852200Xbu.channel());
        c0xgr.LIZLLL("page", interfaceC852200Xbu.dm());
        c0xgr.LIZ(z ? 1 : 0, "is_register");
        c0xgr.LIZ(0, "error_code");
        if (c0xo2 != null) {
            j = c0xo2.LIZ;
        } else {
            j = -1;
        }
        c0xgr.LIZIZ(j, "user_id");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = LIZIZ.get("login_submit");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = jCurrentTimeMillis;
        }
        c0xgr.LIZ((int) ((jCurrentTimeMillis - jLongValue) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "stay_time");
        c0xgr.LIZJ("enter_type", strNn);
        c0xgr.LIZJ("platform", str);
        Bundle extras5 = interfaceC852200Xbu.getExtras();
        if (extras5 == null || (string = extras5.getString("group_id")) == null) {
            string = "";
        }
        c0xgr.LIZJ("group_id", string);
        Bundle extras6 = interfaceC852200Xbu.getExtras();
        if (extras6 == null || (string2 = extras6.getString("author_id")) == null) {
            string2 = "";
        }
        c0xgr.LIZJ("author_id", string2);
        Bundle extras7 = interfaceC852200Xbu.getExtras();
        if (extras7 == null || (string3 = extras7.getString("previous_login_method")) == null) {
            string3 = "";
        }
        c0xgr.LIZJ("previous_login_method", string3);
        Bundle extras8 = interfaceC852200Xbu.getExtras();
        if (extras8 == null || (string4 = extras8.getString("prev_login_platform")) == null) {
            string4 = "";
        }
        c0xgr.LIZJ("prev_login_platform", string4);
        Bundle extras9 = interfaceC852200Xbu.getExtras();
        if (extras9 != null) {
            i = extras9.getInt("encouraged_platform");
        } else {
            i = 0;
        }
        c0xgr.LIZ(i, "encouraged_platform");
        c0xgr.LIZJ("login_panel_type", strBt);
        Bundle extras10 = interfaceC852200Xbu.getExtras();
        if (extras10 != null) {
            i2 = extras10.getInt("login_last_time");
        } else {
            i2 = 0;
        }
        c0xgr.LIZ(i2, "login_last_time");
        Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
        if (numLIZIZ != null) {
            c0xgr.LIZ(numLIZIZ.intValue(), "is_ab_backend_resp_received");
        }
        C0CR3.LIZ.getClass();
        c0xgr.LIZ(C0CR3.LJIIIZ ? 1 : 0, "is_hybrid_ab_api_rev");
        LIZ(c0xgr);
        c0xgr.LIZ(C19241810Po.LIZ(), "is_in_personalized_nuj");
        Bundle extras11 = interfaceC852200Xbu.getExtras();
        if (extras11 == null || (string5 = extras11.getString("sdk_name", "")) == null) {
            string5 = "";
        }
        c0xgr.LIZJ("sdk_name", string5);
        Bundle extras12 = interfaceC852200Xbu.getExtras();
        if (extras12 == null || (string6 = extras12.getString("sdk_version", "")) == null) {
            string6 = "";
        }
        c0xgr.LIZJ("sdk_version", string6);
        if (PluggableExtentionKt.pluggableSpi$default(INewUserJourneyService.class, false, false, false, 14, null) != null) {
            c0xgr.LIZ(C19254610Um.LIZIZ.LJJIL().LIZJ(interfaceC852200Xbu.LLIIJI()) ? 1 : 0, "is_forced_login_copywrite_show");
        }
        Bundle extras13 = interfaceC852200Xbu.getExtras();
        if (extras13 != null && (string8 = extras13.getString("auto_login_platform")) != null) {
            str2 = string8;
        }
        c0xgr.LIZJ("auto_login_platform", str2);
        Bundle extras14 = interfaceC852200Xbu.getExtras();
        if (extras14 != null) {
            i3 = extras14.getInt("multiple_auto_login_accounts");
        } else {
            i3 = 0;
        }
        c0xgr.LIZ(i3, "multiple_auto_login_accounts");
        LIZLLL(c0xgr, interfaceC852200Xbu.getExtras());
        Bundle extras15 = interfaceC852200Xbu.getExtras();
        if (extras15 != null && (string7 = extras15.getString("gsma_fail_reason")) != null) {
            c0xgr.LIZJ("gsma_fail_reason", string7);
        }
        LIZIZ(c0xgr, LJFF(interfaceC852200Xbu.getExtras()));
        if (map != null) {
            LIZJ(c0xgr, map);
        }
        C20684815ws.LJIILLIIL("login_success", c0xgr.LIZ);
        C2211631BhB.LJIILL("b9242", null);
        C852210Xbv.LIZ();
        if (PluggableExtentionKt.pluggableSpi$default(INewUserJourneyService.class, false, false, false, 14, null) != null) {
            C19254610Um c19254610Um = C19254610Um.LIZIZ;
            String strLJJLIIIJJI = interfaceC852200Xbu.LJJLIIIJJI();
            String strLLIIJI = interfaceC852200Xbu.LLIIJI();
            String strNn2 = interfaceC852200Xbu.Nn();
            if (c0xo2 != null) {
                j2 = c0xo2.LIZ;
            } else {
                j2 = -1;
            }
            c19254610Um.LJIL(str, strLJJLIIIJJI, strLLIIJI, j2, strNn2, z);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("platform", str);
        C793770VBv.LJII("login_success", jSONObject, null, null);
    }

    public static void LJIILL(C852170Xbr c852170Xbr, Bundle bundle, int i, String str, String str2, String str3, String str4, Integer num, String str5, String str6, boolean z, int i2) {
        String string;
        Object obj;
        String string2;
        String string3;
        if ((i2 & 64) != 0) {
            num = null;
        }
        if ((i2 & 128) != 0) {
            str5 = null;
        }
        String str7 = "code";
        if ((i2 & 256) != 0) {
            str6 = "code";
        }
        int i3 = 0;
        if ((i2 & 512) != 0) {
            z = false;
        }
        c852170Xbr.getClass();
        EmailCodeVerificationResultEvent emailCodeVerificationResultEvent = new EmailCodeVerificationResultEvent();
        emailCodeVerificationResultEvent.LJI(str, "enter_from");
        emailCodeVerificationResultEvent.LJI(str2, "enter_method");
        emailCodeVerificationResultEvent.LJI(str3, "send_method");
        if (i == 0 || i == 2046) {
            i3 = 1;
        }
        emailCodeVerificationResultEvent.LJI(Integer.valueOf(i3), "is_success");
        String str8 = "";
        if (bundle == null || (string = bundle.getString("3p_platform")) == null) {
            string = "";
        }
        emailCodeVerificationResultEvent.LJI(string, "3p_platform");
        if (bundle != null && (string3 = Integer.valueOf(bundle.getInt("config_key")).toString()) != null) {
            str8 = string3;
        }
        emailCodeVerificationResultEvent.LJI(str8, "config_key");
        emailCodeVerificationResultEvent.LJI(String.valueOf(i), "error_code");
        String str9 = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        emailCodeVerificationResultEvent.LJI(obj, "is_outflow");
        if (str4 != null) {
            emailCodeVerificationResultEvent.LJI(str4, "page");
        }
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue != 13) {
                if (iIntValue == 27) {
                    str9 = "1";
                    emailCodeVerificationResultEvent.LJI(str9, "is_register");
                }
            } else {
                emailCodeVerificationResultEvent.LJI(str9, "is_register");
            }
        }
        if (str5 != null) {
            emailCodeVerificationResultEvent.LJI(str5, "login_panel_type");
        }
        if (bundle == null || (string2 = bundle.getString("send_type")) == null) {
            string2 = "code_and_link";
        }
        if (str6 != null) {
            str7 = str6;
        }
        emailCodeVerificationResultEvent.LJI(str7, "verify_method");
        emailCodeVerificationResultEvent.LJI(string2, "send_type");
        emailCodeVerificationResultEvent.LJIIIIZZ();
        C851430Xaf.LIZIZ("email_bind_status", str, str2, str4, "verified_old_email");
    }

    public static void LJIILJJIL(C852170Xbr c852170Xbr, String str, String str2, String str3, int i, String str4, int i2, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i3, String str12, String str13, Boolean bool, String str14, Bundle bundle, String str15, int i4) {
        String str16;
        String str17 = str11;
        String str18 = str10;
        String str19 = str9;
        String str20 = str8;
        String str21 = str7;
        String str22 = str15;
        String str23 = str14;
        String str24 = str13;
        String str25 = str12;
        Bundle bundle2 = bundle;
        int i5 = i3;
        if ((i4 & 256) != 0) {
            str21 = null;
        }
        if ((i4 & 512) != 0) {
            str20 = null;
        }
        if ((i4 & 1024) != 0) {
            str19 = null;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str18 = null;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str17 = null;
        }
        if ((i4 & 16384) != 0) {
            i5 = -1;
        }
        if ((32768 & i4) != 0) {
            str25 = null;
        }
        if ((65536 & i4) != 0) {
            str24 = null;
        }
        if ((131072 & i4) != 0) {
            bool = null;
        }
        if ((262144 & i4) != 0) {
            str23 = null;
        }
        if ((524288 & i4) != 0) {
            bundle2 = null;
        }
        if ((i4 & 1048576) != 0) {
            str22 = null;
        }
        c852170Xbr.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("send_method", str4);
        c0xgr.LIZ(i2, "send_reason");
        c0xgr.LIZLLL("send_type", str5);
        if (i == 0) {
            str16 = "success";
        } else {
            str16 = "fail";
        }
        c0xgr.LIZLLL(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str16);
        c0xgr.LIZ(i, "error_code");
        c0xgr.LIZLLL("fail_info", str6);
        c0xgr.LIZLLL("params_for_special", "uc_login");
        C844470XAv.LIZ.getClass();
        c0xgr.LIZLLL("carrier", C787440Uuk.LIZ(C844470XAv.LIZ()).LIZJ);
        c0xgr.LIZLLL("enter_type", null);
        c0xgr.LIZ(i5, Scene.SCENE_SERVICE);
        c0xgr.LIZLLL("profile_bind_from", str20);
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("login_panel_type", str3);
        c0xgr.LIZLLL("bind_type", str19);
        c0xgr.LIZLLL("platform", str18);
        c0xgr.LIZLLL("page", str17);
        c0xgr.LIZLLL("3p_platform", str25);
        c0xgr.LIZLLL("config_key", str24);
        c0xgr.LIZLLL("enter_position", str22);
        if (!TextUtils.isEmpty(str21)) {
            try {
                C2218561BsM c2218561BsMLJIIZILJ = C2218571BsN.LIZJ().LJIIZILJ(str21, null);
                c0xgr.LIZ(c2218561BsMLJIIZILJ.getCountryCode(), "phone_country");
                c0xgr.LIZ(String.valueOf(c2218561BsMLJIIZILJ.getNationalNumber()).length(), "phone_number_cnt");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (bool != null) {
            c0xgr.LIZ(!bool.booleanValue() ? 1 : 0, "is_register");
        }
        if (str23 != null) {
            c0xgr.LIZJ("gsma_fail_reason", str23);
        }
        if (bundle2 != null) {
            LIZ.getClass();
            LIZIZ(c0xgr, bundle2);
        }
        C20684815ws.LJIILLIIL("send_sms", c0xgr.LIZ);
        C853660XeG.LIZ.getClass();
        C853660XeG.LIZIZ = -1L;
    }
}
