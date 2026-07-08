package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Pah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647610Pah {
    public static final ConcurrentHashMap<String, Map<?, ?>> LIZ = new ConcurrentHashMap<>();

    public static String LIZ(String str) {
        Uri uriLJ = C1537540q76.LJ(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "channel");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "bundle");
        if (C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && C123100dR.LIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            sbLIZ.append('/');
            sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }

    public static Map LIZIZ(String str) {
        String strLIZ = LIZ(str);
        if (strLIZ == null) {
            return null;
        }
        return LIZ.get(strLIZ);
    }

    public static void LIZJ(String str, Map map) {
        String strLIZ = LIZ(str);
        if (strLIZ == null) {
            return;
        }
        ConcurrentHashMap<String, Map<?, ?>> concurrentHashMap = LIZ;
        if (concurrentHashMap.get(strLIZ) == null) {
            concurrentHashMap.put(strLIZ, map);
        }
    }
}
