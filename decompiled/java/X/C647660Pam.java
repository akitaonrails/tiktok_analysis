package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Pam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647660Pam {
    public static C644680PQk LIZ(Object obj) {
        ArrayMap<Object, C644680PQk> arrayMap = C644680PQk.LJ;
        if (arrayMap.containsKey(obj)) {
            return arrayMap.get(obj);
        }
        C644680PQk c644680PQk = new C644680PQk(obj);
        arrayMap.put(obj, c644680PQk);
        return c644680PQk;
    }

    public static String LIZIZ(Uri uri) {
        String strLJJIFFI;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bundle");
        if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            return "unknow";
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || (strLJJIFFI = u.LJJIFFI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "/template.js", "", false)) == null) {
            return "";
        }
        return strLJJIFFI;
    }
}
