package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0d6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037750d6z {
    public static C1041660dDI LIZIZ(Intent intent) {
        Bundle bundle;
        try {
            bundle = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (TextUtils.isEmpty(bundle.getString("url")) && intent.getData() != null && !TextUtils.isEmpty(intent.getData().toString())) {
            C786410Ut5.LJJJI("url", intent.getData().toString(), bundle);
        }
        try {
            if (!TextUtils.isEmpty(bundle.getString("url"))) {
                Uri uri = UriProtector.parse(bundle.getString("url"));
                C786410Ut5.LJJJI("hybrid_report_source", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "hybrid_report_source"), bundle);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "has_adinfojson");
                C786410Ut5.LJJJI("has_ad_info_json", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, bundle);
                if (TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1")) {
                    C786410Ut5.LJJJI("ad_info_json", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(bundle.getString("url")), "adinfojson"), bundle);
                }
            }
            String string = bundle.getString("hide_nav_bar", "-1");
            if (!TextUtils.equals(string, "-1")) {
                LIZ("hide_nav_bar", string, bundle);
            }
            String string2 = bundle.getString("hide_status_bar", "-1");
            if (!TextUtils.equals(string2, "-1")) {
                LIZ("hide_status_bar", string2, bundle);
            }
            String string3 = bundle.getString("hide_more", "-1");
            if (!TextUtils.equals(string3, "-1")) {
                LIZ("hide_more", string3, bundle);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return C1041560dD8.LIZ(bundle);
    }

    public static void LIZ(String str, String str2, Bundle bundle) {
        if (TextUtils.equals("1", str2)) {
            bundle.putBoolean(str, true);
            return;
        }
        if (TextUtils.equals("true", str2)) {
            bundle.putBoolean(str, true);
        } else if (TextUtils.equals(CardStruct.IStatusCode.DEFAULT, str2)) {
            bundle.putBoolean(str, false);
        } else {
            if (!TextUtils.equals("false", str2)) {
                return;
            }
            bundle.putBoolean(str, false);
        }
    }
}
