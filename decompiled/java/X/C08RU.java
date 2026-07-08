package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;

/* JADX INFO: renamed from: X.08RU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08RU {
    public static final String LIZ(Bundle bundle, String str) {
        Object obj;
        Object obj2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Set<String> setKeySet = bundle.keySet();
        if (setKeySet.isEmpty()) {
            return str;
        }
        Uri uri = UriProtector.parse(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "fallback_url");
        if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            Uri.Builder builderBuildUpon = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).buildUpon();
            Uri.Builder builderBuildUpon2 = C470701sP.LIZ(uri, "fallback_url").buildUpon();
            for (String str2 : setKeySet) {
                try {
                    obj2 = bundle.get(str2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    obj2 = null;
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    obj2 = null;
                }
                String strValueOf = String.valueOf(obj2);
                builderBuildUpon2.appendQueryParameter(str2, strValueOf);
                builderBuildUpon.appendQueryParameter(str2, strValueOf);
            }
            builderBuildUpon2.appendQueryParameter("fallback_url", Uri.decode(builderBuildUpon.build().toString()));
            return builderBuildUpon2.build().toString();
        }
        Uri.Builder builderBuildUpon3 = uri.buildUpon();
        for (String str3 : setKeySet) {
            try {
                obj = bundle.get(str3);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                obj = null;
            } catch (OutOfMemoryError e4) {
                TryCatchGuardChecker.doCheck(e4);
                obj = null;
            }
            builderBuildUpon3.appendQueryParameter(str3, String.valueOf(obj));
        }
        return builderBuildUpon3.build().toString();
    }
}
