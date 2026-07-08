package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dOE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1048440dOE {
    public static final C1048440dOE LIZ = new C1048440dOE();

    public static final HashMap LIZIZ(Aweme aweme) {
        String string;
        Long groupId;
        HashMap map = new HashMap();
        map.put("enter_from", "homepage_hot");
        map.put("author_id", AwemeExtKt.getAuthorUid(aweme));
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || (groupId = awemeRawAd.getGroupId()) == null || (string = groupId.toString()) == null) {
            string = "";
        }
        map.put("group_id", string);
        return map;
    }

    public static final Uri.Builder LIZJ(Aweme aweme, String str) {
        String logExtra;
        String creativeIdStr;
        Uri.Builder builder = new Uri.Builder();
        HashMap map = new HashMap();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String str2 = "";
        if (awemeRawAd == null || awemeRawAd.getLogExtra() == null || (logExtra = aweme.getAwemeRawAd().getLogExtra()) == null) {
            logExtra = "";
        }
        map.put("log_extra", logExtra);
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && (creativeIdStr = awemeRawAd2.getCreativeIdStr()) != null) {
            str2 = creativeIdStr;
        }
        map.put("cid", str2);
        Uri.Builder builderLIZ = LIZ(builder, aweme, str, GsonProtectorUtils.toJson(new Gson(), map));
        C596450NaN c596450NaN = C596440NaM.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("commerce_report_uri_key_");
        sbLIZ.append(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        c596450NaN.LIZJ(builderLIZ.toString(), C2188811AlT.LIZIZ(sbLIZ));
        return builderLIZ;
    }

    public static final Uri.Builder LIZ(Uri.Builder builder, Aweme aweme, String str, String str2) {
        Long groupId;
        int reportAdType;
        C596450NaN c596450NaN = C596440NaM.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ies_ad_info_key_");
        sbLIZ.append(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        c596450NaN.LIZJ(str2, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ies_ad_info_key_");
        sbLIZ2.append(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        if (!TextUtils.equals(c596450NaN.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), ""), str2) || TextUtils.isEmpty(str2)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str, "client_report_write_failed", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZIZ(str2, "ies_ad_info");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ies_ad_info_key_");
            sbLIZ3.append(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
            c1022820ciuLIZLLL.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3), "ies_key");
            c1022820ciuLIZLLL.LJII();
        }
        if (TextUtils.isEmpty(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId())) {
            C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL(str, "client_report_required_param_lost", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL2.LIZIZ(1, "device_id_null");
            c1022820ciuLIZLLL2.LJII();
        }
        if (!TextUtils.isEmpty(str2)) {
            JSONObject jSONObject = new JSONObject(str2);
            if (TextUtils.isEmpty(jSONObject.get("log_extra").toString())) {
                C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL(str, "client_report_required_param_lost", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL3.LIZIZ(1, "log_extra_null");
                c1022820ciuLIZLLL3.LJII();
            }
            if (TextUtils.isEmpty(jSONObject.get("cid").toString())) {
                C1022820ciu c1022820ciuLIZLLL4 = C2184171Adz.LIZLLL(str, "client_report_required_param_lost", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL4.LIZIZ(1, "cid_value_invalid");
                c1022820ciuLIZLLL4.LJII();
            }
        }
        Uri.Builder builderAppendQueryParameter = builder.appendQueryParameter("report_type", "ad").appendQueryParameter("object_id", aweme.getAid()).appendQueryParameter("item_id", aweme.getAid()).appendQueryParameter("owner_id", AwemeExtKt.getAuthorUid(aweme)).appendQueryParameter("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String str3 = null;
        if (awemeRawAd != null) {
            groupId = awemeRawAd.getGroupId();
        } else {
            groupId = null;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("group_id", String.valueOf(groupId)).appendQueryParameter("report_from", str).appendQueryParameter("app_language", ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage());
        C844470XAv.LIZ.getClass();
        String str4 = C844470XAv.LJ;
        if (str4 != null) {
            str3 = str4;
        }
        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("app_name", str3).appendQueryParameter("device_id", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId()).appendQueryParameter("platform", "android").appendQueryParameter("version", C844470XAv.LIZJ()).appendQueryParameter("install_id", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId());
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && (reportAdType = awemeRawAd2.getReportAdType()) != 0) {
            builder.appendQueryParameter("report_ad_type", String.valueOf(reportAdType));
        }
        return builderAppendQueryParameter3;
    }
}
