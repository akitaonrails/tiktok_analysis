package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1013103xh {
    public static final /* synthetic */ C1013103xh LIZ = new C1013103xh();

    public static void LIZJ(C1013103xh c1013103xh, Context context, String str, String str2, Integer num, String str3, Map map, String str4, Float f, String str5, String str6, int i) {
        String str7 = str6;
        String str8 = str5;
        Float f2 = f;
        String str9 = str4;
        Map map2 = map;
        String str10 = str3;
        if ((i & 64) != 0) {
            str10 = null;
        }
        if ((i & 128) != 0) {
            map2 = null;
        }
        if ((i & 512) != 0) {
            str9 = "order_submit";
        }
        if ((i & 1024) != 0) {
            f2 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str8 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str7 = null;
        }
        c1013103xh.getClass();
        LIZIZ(c1013103xh, context, str, 2, str9, 3, str10, map2, null, str2, num, null, null, null, null, f2, null, null, null, false, null, null, str8, str7, 4151296);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String LIZ(C1013103xh c1013103xh, Context context, String str, String str2, Map map, String str3, String str4, String str5, Boolean bool, String str6, String str7, List list, boolean z, Integer num, Integer num2, int i) {
        Integer num3 = num2;
        List list2 = list;
        String str8 = str7;
        String str9 = str6;
        Integer num4 = num;
        Boolean bool2 = bool;
        String str10 = str5;
        String str11 = str4;
        boolean z2 = z;
        String str12 = str3;
        Map map2 = map;
        String str13 = str2;
        String strOptString = null;
        if ((i & 8) != 0) {
            str13 = null;
        }
        if ((i & 16) != 0) {
            map2 = null;
        }
        if ((i & 32) != 0) {
            str12 = null;
        }
        if ((i & 64) != 0) {
            str11 = null;
        }
        if ((i & 128) != 0) {
            str10 = null;
        }
        if ((i & 256) != 0) {
            bool2 = null;
        }
        if ((i & 512) != 0) {
            str9 = null;
        }
        if ((i & 1024) != 0) {
            str8 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            list2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z2 = false;
        }
        if ((i & 8192) != 0) {
            num4 = 0;
        }
        if ((i & 16384) != 0) {
            num3 = 0;
        }
        c1013103xh.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "product_detail");
        linkedHashMap.put("entrance_name", "product_detail_coupon");
        linkedHashMap.put("entrance_link", str);
        C1018703yb.LIZIZ("rd_page_entrance_click", linkedHashMap);
        Uri uri = UriProtector.parse(str);
        if (uri.getBooleanQueryParameter("requireLogin", false)) {
            C259800zU c259800zU = new C259800zU();
            Activity activityLIZ = C1388190mED.LIZ(context);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "track_params");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                strOptString = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).optString("enter_method");
            }
            if (activityLIZ != null) {
                C03U5.LIZ(new C1012903xf(c259800zU, context, str, str13, map2, str12, str11, str10, bool2, str9, str8, list2, z2, num4, num3), activityLIZ, strOptString);
            }
            return (String) c259800zU.element;
        }
        return LIZIZ(c1013103xh, context, str, 1, "product_detail", 2, str13, map2, null, null, null, str12, str11, str10, bool2, null, str9, str8, list2, z2, num4, num3, null, null, 12617472);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(X.C1013103xh r23, android.content.Context r24, java.lang.String r25, int r26, java.lang.String r27, int r28, java.lang.String r29, java.util.Map r30, com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInfo r31, java.lang.String r32, java.lang.Integer r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.Boolean r37, java.lang.Float r38, java.lang.String r39, java.lang.String r40, java.util.List r41, boolean r42, java.lang.Integer r43, java.lang.Integer r44, java.lang.String r45, java.lang.String r46, int r47) {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1013103xh.LIZIZ(X.03xh, android.content.Context, java.lang.String, int, java.lang.String, int, java.lang.String, java.util.Map, com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInfo, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.String, java.lang.String, java.util.List, boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, int):java.lang.String");
    }
}
