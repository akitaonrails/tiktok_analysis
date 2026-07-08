package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0km1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1332270km1 {
    public static final Map<String, String> LIZ = new HashMap();

    public static void LIZ(Uri uri) {
        if (uri != null && uri.isHierarchical()) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "x-expires");
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                try {
                    long j = CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 10) {
                        jCurrentTimeMillis /= 1000;
                    }
                    if (jCurrentTimeMillis > j) {
                        String stackTraceString = Log.getStackTraceString(new Throwable());
                        ((HashMap) LIZ).put(uri.toString(), stackTraceString);
                    }
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public static boolean LIZIZ(Uri uri) {
        if (uri == null || !uri.isHierarchical() || C1332160klq.LJIIIZ().LJIIL() == null) {
            return false;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "x-expires");
        if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            return false;
        }
        long jLIZIZ = C1332160klq.LJIIIZ().LJIIL().LIZIZ();
        try {
            long j = CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 10) {
                jLIZIZ /= 1000;
            }
            if (jLIZIZ <= j) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean LIZJ(Uri uri) {
        if (uri == null || !uri.isHierarchical() || C1332160klq.LJIIIZ().LJIIL() == null) {
            return false;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "x-orig-expires");
        if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            return false;
        }
        long jLIZIZ = C1332160klq.LJIIIZ().LJIIL().LIZIZ();
        try {
            long j = CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 10) {
                jLIZIZ /= 1000;
            }
            if (jLIZIZ <= j) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
