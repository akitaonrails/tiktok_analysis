package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.10Xu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19263210Xu {
    public static Context LIZIZ;
    public static final C19263310Xv LIZJ = new C0J6I<C19263210Xu>() { // from class: X.10Xv
        @Override // X.C0J6I
        public final C19263210Xu LIZ() {
            return new C19263210Xu();
        }
    };
    public C19263410Xw LIZ;

    public static C19263210Xu LIZ(Context context) {
        LIZIZ = C786410Ut5.N3(context);
        return LIZJ.LIZIZ();
    }

    public static Map LIZIZ(Uri uri) {
        String str;
        Uri uri2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (uri != null) {
            for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                if (!TextUtils.isEmpty(str2)) {
                    linkedHashMap.put(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
                }
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "params_url");
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && (uri2 = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
                for (String str3 : UriProtector.getQueryParameterNames(uri2)) {
                    if (!TextUtils.isEmpty(str3)) {
                        linkedHashMap.put(str3, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, str3));
                    }
                }
            }
            for (String str4 : C1849950yEz.LIZ) {
                if (linkedHashMap.containsKey(str4) && ((str = (String) linkedHashMap.get(str4)) == null || str.isEmpty())) {
                    if (((Boolean) C0ABH.LIZ.getValue()).booleanValue()) {
                        linkedHashMap.remove(str4);
                    }
                }
            }
            linkedHashMap.put("launchlog_protocol", uri.getScheme());
            linkedHashMap.put("launchlog_authority", uri.getAuthority());
            linkedHashMap.put("launchlog_path", uri.getPath());
        }
        return linkedHashMap;
    }

    public final void LIZJ(Uri uri) {
        int i;
        try {
            boolean booleanQueryParameter = uri.getBooleanQueryParameter("needlaunchlog", false);
            try {
                i = C810670Vr7.LIZJ(LIZIZ, 0, "KEY_NEED_UPLOAD_LAUNCHLOG").getInt("json_data", 0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                i = 0;
            }
            if (booleanQueryParameter && i > 0) {
                Map<String, String> mapLIZIZ = LIZIZ(uri);
                C19263410Xw c19263410Xw = this.LIZ;
                if (c19263410Xw != null) {
                    c19263410Xw.onEvent(mapLIZIZ);
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
