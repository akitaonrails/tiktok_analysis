package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0Tqn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C759510Tqn {
    public static final InterfaceC497601wk LIZIZ(SparkContext sparkContext) {
        InterfaceC497601wk interfaceC497601wk;
        if (sparkContext == null || (interfaceC497601wk = sparkContext.coroutineScope) == null) {
            return C817503Hh.LL;
        }
        return interfaceC497601wk;
    }

    public static final String LIZ(String str, Map<String, String> map) {
        Uri uriLIZLLL;
        if (str == null || (uriLIZLLL = LIZLLL(str, "append pipo container query parameter")) == null) {
            return null;
        }
        Uri.Builder builderBuildUpon = uriLIZLLL.buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    public static final Uri LIZLLL(String str, String str2) {
        try {
            return UriProtector.parse(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("uri illegal, scene: ");
            sbLIZ.append(str2);
            sbLIZ.append(", msg: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", raw uri: ");
            sbLIZ.append(str);
            C1725270uzt.LJFF("204", C2188811AlT.LIZIZ(sbLIZ), null, null);
            return null;
        }
    }

    public static final String LIZJ(Uri uri, String str, String str2) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        if (uri != null) {
            try {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
                return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("uri illegal, scene: ");
                sbLIZ.append(str2);
                sbLIZ.append(", msg: ");
                sbLIZ.append(th.getMessage());
                sbLIZ.append(", raw uri: ");
                sbLIZ.append(uri);
                C1725270uzt.LJFF("204", C2188811AlT.LIZIZ(sbLIZ), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }
}
