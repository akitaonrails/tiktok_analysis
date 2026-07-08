package X;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0plJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1524030plJ extends AbstractC1541650qDj {
    public final C1522910pjV LLIZ = new AbstractC2205961BVi() { // from class: X.0pjV
        @Override // X.AbstractC1541670qDl
        public final AbstractC1541650qDj getExtension() {
            return this.LL;
        }

        public final void LIZ(C1522930pjX c1522930pjX) {
            if (c1522930pjX != null && this.LL.LLIZLLLIL.LLIZLLLIL != null) {
                HashMap map = new HashMap();
                String strLIZIZ = c1522930pjX.LIZ;
                if (!TextUtils.isEmpty(strLIZIZ)) {
                    Uri uri = UriProtector.parse(strLIZIZ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(uri.getScheme());
                    sbLIZ.append("://");
                    sbLIZ.append(uri.getHost());
                    sbLIZ.append(uri.getPath());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                map.put("url", strLIZIZ);
                map.put("label", c1522930pjX.LIZIZ);
                map.put("scc_reason", c1522930pjX.LIZLLL);
                map.put("scc_passed_time", String.valueOf(c1522930pjX.LJ));
                map.put("scc_logid", c1522930pjX.LIZJ);
                this.LL.LLIZLLLIL.LLIZLLLIL.LIZIZ(map);
            }
        }

        public static C1522930pjX LIZIZ(String str, JSONObject jSONObject) {
            C1522930pjX c1522930pjX = new C1522930pjX();
            try {
                c1522930pjX.LIZ = str;
                jSONObject.optInt("code", -1);
                jSONObject.optString("message", "");
                c1522930pjX.LIZLLL = jSONObject.optString("scc_reason", "");
                c1522930pjX.LJ = jSONObject.optInt("scc_passed_time", -1);
                c1522930pjX.LIZJ = jSONObject.optString("scc_logid", "");
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
                jSONObject2.optInt("score", -1);
                c1522930pjX.LIZIZ = jSONObject2.optString("label", "");
                return c1522930pjX;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return new C1522930pjX();
            }
        }

        @Override // X.AbstractC2205961BVi
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (this.LL.LLIZLLLIL.LLJ != null && this.LL.LLIZLLLIL.LLIZLLLIL != null) {
                String string = webResourceRequest.getUrl().toString();
                JSONObject jSONObjectLIZIZ = this.LL.LLIZLLLIL.LLJ.LIZIZ(string);
                if (jSONObjectLIZIZ == null) {
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
                this.LL.LLIZLLLIL.LLJI = LIZIZ(string, jSONObjectLIZIZ);
                String str = this.LL.LLIZLLLIL.LLJI.LIZIZ;
                if (TextUtils.equals(str, "notice")) {
                    C1497050p3n c1497050p3n = this.LL.LLIZLLLIL.LLJ;
                    c1497050p3n.getClass();
                    String strLIZIZ = C1934607hw.LIZIZ(string);
                    synchronized (c1497050p3n) {
                        try {
                            c1497050p3n.LJ = strLIZIZ;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                }
                if (TextUtils.equals(str, "deny")) {
                    this.LL.LLIZLLLIL.LLJ.LIZLLL(string);
                    return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                }
                WebResourceResponse webResourceResponseShouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
                if (webResourceResponseShouldInterceptRequest == null) {
                    return this.LL.LLIZLLLIL.LLJ.LJFF(string);
                }
                return webResourceResponseShouldInterceptRequest;
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // X.AbstractC2205961BVi
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String string = webResourceRequest.getUrl().toString();
            if (!this.LL.LLIZLLLIL.LJII(string)) {
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            this.LL.LLIZLLLIL.LLJ.LIZ(string);
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        @Override // X.AbstractC2205961BVi
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (this.LL.LLIZLLLIL.LLJ != null) {
                C1523990plF c1523990plF = this.LL.LLIZLLLIL;
                if (c1523990plF.LLIZLLLIL != null) {
                    JSONObject jSONObjectLIZIZ = c1523990plF.LLJ.LIZIZ(str);
                    if (jSONObjectLIZIZ == null) {
                        return super.shouldInterceptRequest(webView, str);
                    }
                    this.LL.LLIZLLLIL.LLJI = LIZIZ(str, jSONObjectLIZIZ);
                    String str2 = this.LL.LLIZLLLIL.LLJI.LIZIZ;
                    if (TextUtils.equals(str2, "notice")) {
                        C1497050p3n c1497050p3n = this.LL.LLIZLLLIL.LLJ;
                        c1497050p3n.getClass();
                        String strLIZIZ = C1934607hw.LIZIZ(str);
                        synchronized (c1497050p3n) {
                            try {
                                c1497050p3n.LJ = strLIZIZ;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                    if (TextUtils.equals(str2, "deny")) {
                        this.LL.LLIZLLLIL.LLJ.LIZLLL(str);
                        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
                    }
                    WebResourceResponse webResourceResponseShouldInterceptRequest = super.shouldInterceptRequest(webView, str);
                    if (webResourceResponseShouldInterceptRequest == null) {
                        return this.LL.LLIZLLLIL.LLJ.LJFF(str);
                    }
                    return webResourceResponseShouldInterceptRequest;
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // X.AbstractC2205961BVi
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!this.LL.LLIZLLLIL.LJII(str)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            this.LL.LLIZLLLIL.LLJ.LIZ(str);
            return super.shouldOverrideUrlLoading(webView, str);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
        @Override // X.AbstractC2205961BVi
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onPageStarted(android.webkit.WebView r4, java.lang.String r5, android.graphics.Bitmap r6) {
            /*
                r3 = this;
                X.0plJ r0 = r3.LL
                X.0plF r0 = r0.LLIZLLLIL
                X.0p3n r0 = r0.LLJ
                if (r0 == 0) goto L81
                X.0plJ r0 = r3.LL
                X.0plF r1 = r0.LLIZLLLIL
                X.0pjW r0 = r1.LLIZLLLIL
                if (r0 == 0) goto L81
                X.0p3n r2 = r1.LLJ
                r2.getClass()
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L35
                java.lang.String r1 = X.C1934607hw.LIZIZ(r5)
                monitor-enter(r2)
                java.lang.String r0 = r2.LJ     // Catch: java.lang.Throwable -> L2f
                boolean r0 = android.text.TextUtils.equals(r0, r1)     // Catch: java.lang.Throwable -> L2f
                if (r0 == 0) goto L2d
                r0 = 0
                r2.LJ = r0     // Catch: java.lang.Throwable -> L2f
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
                goto L6b
            L2d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
                goto L35
            L2f:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L2f
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
                throw r0
            L35:
                X.0plJ r0 = r3.LL
                X.0plF r0 = r0.LLIZLLLIL
                X.0p3n r0 = r0.LLJ
                boolean r0 = r0.LJ(r5)
                if (r0 == 0) goto L54
                X.0plJ r0 = r3.LL
                X.0plF r0 = r0.LLIZLLLIL
                X.0pjW r0 = r0.LLIZLLLIL
                r0.LIZJ(r4, r5)
                X.0plJ r0 = r3.LL
                X.0plF r0 = r0.LLIZLLLIL
                X.0pjX r0 = r0.LLJI
                r3.LIZ(r0)
                goto L7d
            L54:
                X.0plJ r0 = r3.LL
                X.0plF r1 = r0.LLIZLLLIL
                X.0pjX r0 = r1.LLJI
                if (r0 == 0) goto L7d
                X.0pjW r0 = r1.LLIZLLLIL
                r0.LJ()
                X.0plJ r0 = r3.LL
                X.0plF r0 = r0.LLIZLLLIL
                X.0pjX r0 = r0.LLJI
                r3.LIZ(r0)
                goto L7d
            L6b:
                X.0plJ r0 = r3.LL
                X.0plF r0 = r0.LLIZLLLIL
                X.0pjW r0 = r0.LLIZLLLIL
                r0.LIZ(r4, r5)
                X.0plJ r0 = r3.LL
                X.0plF r0 = r0.LLIZLLLIL
                X.0pjX r0 = r0.LLJI
                r3.LIZ(r0)
            L7d:
                super.onPageStarted(r4, r5, r6)
                return
            L81:
                super.onPageStarted(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1522910pjV.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
        }
    };
    public final /* synthetic */ C1523990plF LLIZLLLIL;

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        LIZLLL("shouldOverrideUrlLoading", this.LLIZ);
        LIZLLL("shouldInterceptRequest", this.LLIZ);
        LIZLLL("onPageStarted", this.LLIZ);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0pjV] */
    public C1524030plJ(C1523990plF c1523990plF) {
        this.LLIZLLLIL = c1523990plF;
    }
}
