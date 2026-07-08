package X;

import android.net.Uri;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dDE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041620dDE extends C1041660dDI {
    public static String LIZ(Uri uri, String str) {
        if (uri.isHierarchical()) {
            return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uri", uri);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1041930dDj webViewMonitorHelper = WebViewMonitorHelper.getInstance();
        C1520360pfO c1520360pfO = new C1520360pfO("INVALID_QUERY_URI");
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LIZIZ(0);
        webViewMonitorHelper.customReport(null, c1520360pfO.LIZ());
        return "";
    }
}
