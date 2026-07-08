package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01l3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C425101l3 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, Function0 function0) {
        try {
            Uri uri = UriProtector.parse(str);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                return str;
            }
            C490590JLt c490590JLt = C490590JLt.LIZ;
            Map map = (Map) function0.invoke();
            c490590JLt.getClass();
            String strLIZIZ = C490590JLt.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, map);
            Uri.Builder builderPath = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath());
            for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                if (Intrinsics.LJFF(str2, "url")) {
                    builderPath.appendQueryParameter(str2, strLIZIZ);
                } else {
                    builderPath.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
                }
            }
            return builderPath.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }
}
