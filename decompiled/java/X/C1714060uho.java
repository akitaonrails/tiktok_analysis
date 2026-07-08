package X;

import android.os.Build;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.pipo.verify.base.model.VerifyInfo;
import com.google.gson.k;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0uho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714060uho {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(k kVar) {
        if (kVar != null && !(kVar instanceof m)) {
            return kVar.LJIL();
        }
        return "";
    }

    public static void LIZJ(C1713570uh1 c1713570uh1, String str, String str2, Map map) {
        String str3;
        String str4;
        Map<String, String> mapLIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C00IO c00io = c1713570uh1.LIZLLL().LIZIZ;
        if (c00io != null && (mapLIZ = c00io.LIZ()) != null) {
            for (Map.Entry<String, String> entry : mapLIZ.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (map != null) {
            for (Map.Entry entry2 : map.entrySet()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        VerifyInfo verifyInfoLJIIIZ = c1713570uh1.LJIIIZ();
        VerifyDetail verifyDetail = verifyInfoLJIIIZ.verifyDetail;
        linkedHashMap.put("page_id", str2);
        linkedHashMap.put("timestamp_report", String.valueOf(System.currentTimeMillis()));
        String str5 = verifyInfoLJIIIZ.verifyId;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("trace_id", str5);
        String str6 = verifyInfoLJIIIZ.verifyId;
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("verify_id", str6);
        if (verifyDetail != null) {
            String str7 = verifyDetail.merchantId;
            if (str7 == null) {
                str7 = "";
            }
            linkedHashMap.put("merchant_id", str7);
            String str8 = verifyDetail.merchantUserId;
            if (str8 == null) {
                str8 = "";
            }
            linkedHashMap.put("merchant_user_id", str8);
            String str9 = verifyDetail.bizType;
            if (str9 == null) {
                str9 = "";
            }
            linkedHashMap.put("biz_type", str9);
            String str10 = verifyDetail.pipoProductCat;
            if (str10 == null) {
                str10 = "";
            }
            linkedHashMap.put("pipo_product_cat", str10);
            String str11 = verifyDetail.bizLine;
            if (str11 == null) {
                str11 = "";
            }
            linkedHashMap.put("biz_line", str11);
            if (verifyDetail.schemaList != null) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_inapp_standardize", str4);
            String str12 = verifyDetail.paymentMethod;
            if (str12 != null) {
                linkedHashMap.put("payment_method", str12);
            }
            String str13 = verifyDetail.verifyMethod;
            if (str13 != null) {
                linkedHashMap.put("verify_method", str13);
            }
            String str14 = verifyDetail.certType;
            if (str14 != null) {
                linkedHashMap.put("cert_type", str14);
            }
            String str15 = verifyDetail.idc;
            if (str15 != null) {
                linkedHashMap.put("idc", str15);
            }
            String str16 = verifyDetail.enterFrom;
            if (str16 != null) {
                linkedHashMap.put("enter_from", str16);
            }
        }
        String str17 = verifyInfoLJIIIZ.actionType;
        if (str17 != null) {
            linkedHashMap.put("action_type", str17);
        }
        String str18 = verifyInfoLJIIIZ.verifyType;
        if (str18 == null) {
            str18 = "";
        }
        linkedHashMap.put("verify_type", str18);
        linkedHashMap.put("device_source", "android");
        C1713710uhF c1713710uhF = C1713600uh4.LIZLLL;
        if (c1713710uhF != null) {
            String strInvoke = c1713710uhF.LIZIZ.invoke();
            if (strInvoke == null) {
                strInvoke = "";
            }
            linkedHashMap.put("country_code", strInvoke);
            String str19 = c1713710uhF.LIZ;
            if (str19 == null) {
                str19 = "";
            }
            linkedHashMap.put("aid", str19);
        }
        linkedHashMap.put("os_version", Build.VERSION.RELEASE);
        linkedHashMap.put("app_version", C1717770unn.LIZJ().getVersionInfo().LIZ);
        String deviceId = C1717770unn.LIZJ().getDeviceId();
        if (deviceId == null) {
            deviceId = "";
        }
        linkedHashMap.put("device_id", deviceId);
        linkedHashMap.put("priority_region", C1717770unn.LJIIIIZZ().getPriorityRegion());
        linkedHashMap.put("container_id", "");
        linkedHashMap.put("container_type", "inapp");
        linkedHashMap.put("is_in_app", "1");
        if (C1717770unn.LJII().enableBoe()) {
            str3 = "boe";
        } else if (C1717770unn.LJII().enablePpe()) {
            str3 = "ppe";
        } else {
            str3 = "production";
        }
        linkedHashMap.put("env", str3);
        linkedHashMap.put("release_version", C1717770unn.LIZJ().getVersionInfo().LIZ);
        List<Pair<String, String>> list = c1713570uh1.LJIIJ;
        if (list != null) {
            for (Pair<String, String> pair : list) {
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
        }
        InterfaceC1713820uhQ interfaceC1713820uhQ = C1713600uh4.LIZJ;
        if (interfaceC1713820uhQ != null) {
            interfaceC1713820uhQ.onEventV3(str, linkedHashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C1713570uh1 r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, X.C1713520ugw r11, java.util.Map r12) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1714060uho.LIZIZ(X.0uh1, java.lang.String, java.lang.String, java.lang.String, X.0ugw, java.util.Map):void");
    }
}
