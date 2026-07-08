package X;

import android.util.Log;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X74, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X74 extends FilterInputStream {
    public final WebView LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final C0X70 LLILZ;

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
            C0X70 c0x70 = this.LLILZ;
            if (c0x70 == null) {
                return;
            }
            c0x70.LIZJ.put("res_load_finish", Long.valueOf(System.currentTimeMillis()));
            LIZ(this.LL, this.LLILLL, this.LLILZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("report_metrics, url:");
            sbLIZ.append(this.LLILLJJLI);
            C189200o6.m2constructorimpl(Integer.valueOf(Log.i("HWResponseStreamWrapper", C2188811AlT.LIZIZ(sbLIZ))));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZ(WebView webView, boolean z, C0X70 c0x70) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject(c0x70.LIZ);
        JSONObject jSONObject3 = new JSONObject(c0x70.LIZIZ);
        JSONObject jSONObject4 = new JSONObject(c0x70.LIZJ);
        Map<String, Object> map = c0x70.LIZLLL;
        if (map != null) {
            jSONObject = new JSONObject(map);
        } else {
            jSONObject = null;
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("res_loader_info", jSONObject2);
        jSONObject5.put("res_info", jSONObject3);
        jSONObject5.put("res_load_perf", jSONObject4);
        jSONObject5.put("res_load_error", jSONObject);
        if (z) {
            WebViewMonitorHelper.getInstance().handleNativeInfo(webView, "res_loader_perf_template", jSONObject5);
        } else {
            WebViewMonitorHelper.getInstance().handleNativeInfo(webView, "res_loader_perf", jSONObject5);
        }
        if (c0x70.LIZLLL != null && !Intrinsics.LJFF(((LinkedHashMap) c0x70.LIZIZ).get("res_state"), "success")) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("res_loader_info", c0x70.LIZ);
            jSONObject6.put("res_info", c0x70.LIZIZ);
            jSONObject6.put("res_load_error", c0x70.LIZLLL);
            if (z) {
                WebViewMonitorHelper.getInstance().handleNativeInfo(webView, "res_loader_error_template", jSONObject6);
            } else {
                WebViewMonitorHelper.getInstance().handleNativeInfo(webView, "res_loader_error", jSONObject6);
            }
        }
    }

    public C0X74(WebView webView, String str, boolean z, C0X70 c0x70, InputStream inputStream) {
        super(inputStream);
        this.LL = webView;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = c0x70;
    }
}
