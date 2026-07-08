package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d9W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1039320d9W extends C844210X9v {
    public final InterfaceC1039110d9B bulletBusiness;
    public final C1039050d95 container;
    public final boolean debugMode;
    public static final C1039340d9Y Companion = new Object() { // from class: X.0d9Y
    };
    public static final int $stable = 8;

    public void monitorAdOpenWebUrlRate(JSONObject jSONObject, boolean z) {
    }

    @Override // X.AbstractC2205961BVi
    public void onReceivedError(WebView webView, int i, String str, String str2) {
    }

    public final InterfaceC1039110d9B getBulletBusiness() {
        return this.bulletBusiness;
    }

    public final C1039050d95 getContainer() {
        return this.container;
    }

    public final boolean getDebugMode() {
        return this.debugMode;
    }

    public C1039320d9W(C1039050d95 c1039050d95) {
        this.container = c1039050d95;
        this.bulletBusiness = c1039050d95.LL;
    }

    @Override // X.AbstractC2205961BVi
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        monitorOpenWebUrlRate(0, "", str, true);
        C1039050d95 c1039050d95 = this.container;
        c1039050d95.getClass();
        new C1039330d9X(c1039050d95).onPageFinished(webView, str);
    }

    @Override // X.AbstractC2205961BVi
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // X.AbstractC2205961BVi
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZ() != null) {
            C1028210crb.LIZJ(str);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    private final void monitorResourceLoadError(String str, String str2, int i) {
        JSONObject jSONObject = new JSONObject();
        safePutJsonKV(jSONObject, "host", str);
        safePutJsonKV(jSONObject, "path", str2);
        safePutJsonKV(jSONObject, "statusCode", null);
        safePutJsonKV(jSONObject, "errorCode", Integer.valueOf(i));
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("aweme_webview_assets_error", 0, jSONObject);
    }

    @Override // X.AbstractC2205961BVi
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZ() != null) {
            C1028210crb.LJIJ(this, str);
        }
        C1039050d95 c1039050d95 = this.container;
        c1039050d95.getClass();
        new C1039330d9X(c1039050d95).onPageStarted(webView, str, bitmap);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    @Override // X.AbstractC2205961BVi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceivedError(android.webkit.WebView r8, android.webkit.WebResourceRequest r9, android.webkit.WebResourceError r10) {
        /*
            r7 = this;
            r5 = 1
            r6 = 0
            if (r9 == 0) goto L8c
            boolean r0 = r9.isForMainFrame()
            if (r0 != r5) goto L8c
            r0 = 1
        Lb:
            java.lang.String r4 = "favicon.ico"
            r3 = 0
            if (r0 != 0) goto L24
            if (r9 == 0) goto L66
            android.net.Uri r0 = r9.getUrl()
            if (r0 == 0) goto L4e
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L4e
            boolean r0 = kotlin.text.u.LJIIZILJ(r0, r4, r6)
            if (r0 != 0) goto L4e
        L24:
            android.net.Uri r0 = r9.getUrl()
            if (r0 == 0) goto L2d
            r0.toString()
        L2d:
            if (r10 == 0) goto L89
            int r0 = r10.getErrorCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.CharSequence r0 = r10.getDescription()
            if (r0 == 0) goto L8a
            java.lang.String r1 = r0.toString()
        L41:
            android.net.Uri r0 = r9.getUrl()
            if (r0 == 0) goto L87
            java.lang.String r0 = r0.toString()
        L4b:
            r7.monitorOpenWebUrlRate(r2, r1, r0, r6)
        L4e:
            boolean r0 = r9.isForMainFrame()
            if (r0 != 0) goto L66
            android.net.Uri r0 = r9.getUrl()
            if (r0 == 0) goto L67
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L67
            boolean r0 = kotlin.text.u.LJIIZILJ(r0, r4, r6)
            if (r0 != r5) goto L67
        L66:
            return
        L67:
            if (r10 == 0) goto L66
            int r2 = r10.getErrorCode()
            android.net.Uri r0 = r9.getUrl()
            if (r0 == 0) goto L85
            java.lang.String r1 = r0.getHost()
        L77:
            android.net.Uri r0 = r9.getUrl()
            if (r0 == 0) goto L81
            java.lang.String r3 = r0.getPath()
        L81:
            r7.monitorResourceLoadError(r1, r3, r2)
            return
        L85:
            r1 = r3
            goto L77
        L87:
            r0 = r3
            goto L4b
        L89:
            r2 = r3
        L8a:
            r1 = r3
            goto L41
        L8c:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1039320d9W.onReceivedError(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
    }

    public final void safePutJsonKV(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null && !TextUtils.isEmpty(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
    }

    private final void monitorOpenWebUrlRate(Integer num, String str, String str2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        safePutJsonKV(jSONObject, "errorCode", num);
        if (!TextUtils.isEmpty(str)) {
            safePutJsonKV(jSONObject, "errorDesc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            Uri uri = UriProtector.parse(str2);
            safePutJsonKV(jSONObject, "url", str2);
            safePutJsonKV(jSONObject, "host", uri.getHost());
            safePutJsonKV(jSONObject, "path", uri.getPath());
        }
        safePutJsonKV(jSONObject, "container_type", "bullet");
        monitorAdOpenWebUrlRate(jSONObject, z);
        int i = !z ? 1 : 0;
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJIIJJI("aweme_webview_open_error_rate", i, jSONObject);
    }
}
