package X;

import Y.ARunnableS7S1200000_1;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03kV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C931303kV implements InterfaceC932403kg {
    public final List<String> LIZ = new ArrayList(Arrays.asList("pipo_common_error_card_number_length", "pipo_common_error_card_not_supported", "pipo_common_error_required_field", "pipo_common_error_card_check", "pipo_common_error_card_number", "pipo_common_payin_expiry_date", "pipo_common_error_month_check", "pipo_common_error_card_expired", "pipo_common_error_year_too_far", "pipo_common_payin_security_code", "pipo_common_payin_card_number", "pipo_common_error_is_invalid", "pipo_common_payin_ovo_id", "pipo_common_payin_cardholder_name", "pipo_common_payin_Email", "pipo_common_payin_CPF", "pipo_common_payin_mobile_address1", "pipo_common_payin_address", "pipo_common_payin_postalcode", "pipo_common_payin_ccinstallment_incorrect_card_notice", "invalid_billing_address", "invalid_post_code", "empty_content", "pipo_payin_instruction_OCR_scan_notice", "pipo_payin_instruction_OCR_refused_camera_title", "pipo_payin_instruction_OCR_refused_camera_content", "pipo_payin_instruction_OCR_refused_gotit", "pipo_payin_instruction_OCR_refused_setting", "pipo_payin_instruction_OCR_refused_album_title", "pipo_payin_instruction_OCR_refused_album_content", "pipo_payin_dropin_cashier_networkerror_statement", "pipo_payin_instruction_OCR_toast_no_cardNO", "pipo_common_waiting_while_loading_short", "pipo_payin_ocr_card_placeholder", "pipo_payin_ocr_invalid_card", "pipo_payin_ocr_date_placeholder", "pipo_payin_ocr_month_limitation", "pipo_payin_ocr_invalid_date", "pipo_payin_ocr_year_limitation", "pipo_payin_ocr_name_placeholder", "pipo_payin_ocr_scan", "pipo_payin_ocr_flash1", "pipo_payin_ocr_position", "pipo_payin_ocr_album", "pipo_payin_ocr_tryagain", "pipo_payin_ocr_entermanually", "pipo_payin_ocr_identify", "pipo_payin_ocr_manually", "pipo_payin_ocr_imagesafe", "pipo_payin_ocr_confirm", "pipo_common_next"));
    public Map<String, String> LIZIZ = new ConcurrentHashMap();
    public String LIZJ;

    public final void LIZIZ(String str, final C1724050uxv c1724050uxv, String str2) {
        if (!TextUtils.equals(this.LIZJ, str)) {
            this.LIZJ = str;
            InterfaceC931903kb interfaceC931903kb = new InterfaceC931903kb() { // from class: X.03ka
                @Override // X.InterfaceC931903kb
                public final void LIZ(Map<String, String> map) {
                    this.LIZIZ.LIZIZ = map;
                    InterfaceC931903kb interfaceC931903kb2 = c1724050uxv;
                    if (interfaceC931903kb2 != null) {
                        interfaceC931903kb2.LIZ(map);
                    }
                }
            };
            if (Looper.getMainLooper() == Looper.myLooper()) {
                RunnableC823120WQs.LIZIZ(new ARunnableS7S1200000_1(interfaceC931903kb, this, str2, 5));
                return;
            } else {
                LIZJ(this.LIZJ, interfaceC931903kb, str2);
                return;
            }
        }
        if (c1724050uxv == null) {
            return;
        }
        c1724050uxv.LIZ(this.LIZIZ);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0024 -> B:10:0x0027). Please report as a decompilation issue!!! */
    public final void LIZJ(String str, InterfaceC931903kb interfaceC931903kb, String str2) {
        String strLIZIZ;
        HashMap map = new HashMap();
        try {
            try {
                Map<String, String> mapLIZIZ = C116700cP.LIZIZ(new JSONObject(C08EO.LIZ(C1724150uy5.LJIIL.LIZ.LIZ)));
                if (mapLIZIZ != null) {
                    map.putAll(mapLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        C932103kd c932103kd = (C932103kd) C1724150uy5.LJIIL.LJ();
        Keva keva = c932103kd.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sp_key_starling_data_");
        sbLIZ.append(str);
        String string = keva.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        if (!TextUtils.isEmpty(string)) {
            try {
                map.putAll(C116700cP.LIZIZ(new JSONObject(string)));
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        Keva keva2 = c932103kd.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sp_key_starling_version_");
        sbLIZ2.append(str);
        long j = keva2.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L);
        boolean zLJI = MethodIDManager.LJI(137980);
        if (TextUtils.isEmpty(str2)) {
            strLIZIZ = C916403i6.LIZ("/payment/v1/cashier_starling");
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str2);
            sbLIZ3.append("/payment/v1/cashier_starling");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", j);
            jSONObject.put("language", str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        List<String> list = this.LIZ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Object[] objArr = C932503kh.LIZ;
        Object[] objArr2 = (Object[]) settingsManagerLIZLLL.LJIIIIZZ("pipo_ecommerce_sdk_starling_keys", String[].class, objArr);
        if (objArr2 != null) {
            objArr = objArr2;
        }
        ((ArrayList) list).addAll(Arrays.asList(objArr));
        try {
            HashMap map2 = new HashMap();
            map2.put("Content-Type", "application/json");
            String strLJ = C1724150uy5.LJIIL.LIZ.LJIILIIL.LJ(strLIZIZ, C786410Ut5.J3(jSONObject).getBytes(), map2);
            JSONObject jSONObject2 = new JSONObject(strLJ);
            if (TextUtils.equals(jSONObject2.optString("result_code"), "success")) {
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("text_package");
                if (jSONObjectOptJSONObject != null) {
                    Map mapLIZIZ2 = C116700cP.LIZIZ(jSONObjectOptJSONObject);
                    if (((HashMap) mapLIZIZ2).size() > 0) {
                        map.putAll(mapLIZIZ2);
                        LIZLLL(Long.valueOf(jSONObject2.optLong("version")), str, mapLIZIZ2);
                        if (interfaceC931903kb != null) {
                            interfaceC931903kb.LIZ(map);
                        }
                        if (zLJI) {
                            MethodIDManager.LJ();
                            return;
                        }
                        return;
                    }
                }
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("request starling data error:");
                sbLIZ4.append(strLJ);
                C2188811AlT.LIZIZ(sbLIZ4);
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("request starling data exception:");
            sbLIZ5.append(th4.getLocalizedMessage());
            C2188811AlT.LIZIZ(sbLIZ5);
        }
        Keva keva3 = ((C932103kd) C1724150uy5.LJIIL.LJ()).LIZ;
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("sp_key_starling_version_");
        sbLIZ6.append(str);
        LIZLLL(Long.valueOf(keva3.getLong(C2188811AlT.LIZIZ(sbLIZ6), 0L)), str, map);
        if (interfaceC931903kb != null) {
            interfaceC931903kb.LIZ(this.LIZIZ);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LIZLLL(Long l, String str, Map map) {
        for (Object obj : (ArrayList) this.LIZ) {
            HashMap map2 = (HashMap) map;
            if (map2.containsKey(obj)) {
                this.LIZIZ.put((String) obj, (String) map2.get(obj));
            }
        }
        C932103kd c932103kd = (C932103kd) C1724150uy5.LJIIL.LJ();
        Keva keva = c932103kd.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sp_key_starling_version_");
        sbLIZ.append(str);
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), l.longValue());
        String strJ3 = C786410Ut5.J3(new JSONObject(this.LIZIZ));
        Keva keva2 = c932103kd.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sp_key_starling_data_");
        sbLIZ2.append(str);
        keva2.storeString(C2188811AlT.LIZIZ(sbLIZ2), strJ3);
    }

    public final void LIZ(String str, String str2, String str3, String str4) {
        if (TextUtils.equals("success", str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            jSONObject.put("key_name", str2);
            jSONObject.put("language", this.LIZJ);
            jSONObject.put("error_type", str3);
            jSONObject.put("sub_error_type", str4);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("event starling tracking exception:");
            sbLIZ.append(th.getLocalizedMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        ((C1724080uxy) C1724150uy5.LJIIL.LIZIZ()).onEventV3("pipo_rd_get_starling", jSONObject);
    }
}
