package X;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.hybrid.web.extension.ttnet.TtnetRetrofitApi;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: X.0plM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524060plM extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public final C841980X1g LLIZ = new AbstractC1541650qDj<C2205951BVh>() { // from class: X.0X1g
        public final C841970X1f LLIZ = new AbstractC2205961BVi() { // from class: X.0X1f
            @Override // X.AbstractC1541670qDl
            public final AbstractC1541650qDj<?> getExtension() {
                return this.LL;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static android.webkit.WebResourceResponse LIZ(X.C0X52 r6, java.io.InputStream r7) {
                /*
                    X.08fh r0 = r6.LIZ
                    java.util.List<X.080U> r2 = r0.LIZLLL
                    r3 = 0
                    if (r2 == 0) goto L41
                    r0 = 10
                    int r0 = X.C15438062q.LJIJJ(r2, r0)
                    int r1 = X.C2097908Jt.LIZIZ(r0)
                    r0 = 16
                    if (r1 >= r0) goto L17
                    r1 = 16
                L17:
                    java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                    r5.<init>(r1)
                    java.util.Iterator r4 = r2.iterator()
                L20:
                    boolean r0 = r4.hasNext()
                    if (r0 == 0) goto L43
                    java.lang.Object r0 = r4.next()
                    X.080U r0 = (X.C080U) r0
                    kotlin.Pair r2 = new kotlin.Pair
                    java.lang.String r1 = r0.LIZ
                    java.lang.String r0 = r0.LIZIZ
                    r2.<init>(r1, r0)
                    java.lang.Object r1 = r2.getFirst()
                    java.lang.Object r0 = r2.getSecond()
                    r5.put(r1, r0)
                    goto L20
                L41:
                    r5 = r3
                    goto L57
                L43:
                    java.lang.String r0 = "Content-Type"
                    java.lang.Object r0 = r5.get(r0)
                    java.lang.String r0 = (java.lang.String) r0
                    if (r0 != 0) goto L5a
                    java.lang.String r0 = "content-type"
                    java.lang.Object r0 = r5.get(r0)
                    java.lang.String r0 = (java.lang.String) r0
                    if (r0 != 0) goto L5a
                L57:
                    java.lang.String r0 = "text/html; charset=UTF-8"
                L5a:
                    X.0X0P r2 = X.C0X0P.LIZJ(r0)
                    if (r2 != 0) goto L8e
                    java.lang.String r1 = "text/html"
                L63:
                    if (r2 == 0) goto L71
                    java.nio.charset.Charset r0 = r2.LIZ(r3)
                    if (r0 == 0) goto L71
                    java.lang.String r2 = r0.toString()
                    if (r2 != 0) goto L74
                L71:
                    java.lang.String r2 = "utf-8"
                L74:
                    X.08fh r0 = r6.LIZ
                    int r3 = r0.LIZIZ
                    java.lang.String r0 = r0.LIZJ
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L89
                    java.lang.String r4 = "OK"
                L82:
                    android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse
                    r6 = r7
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r0
                L89:
                    X.08fh r0 = r6.LIZ
                    java.lang.String r4 = r0.LIZJ
                    goto L82
                L8e:
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = r2.LIZIZ
                    r1.append(r0)
                    r0 = 47
                    r1.append(r0)
                    java.lang.String r0 = r2.LIZJ
                    r1.append(r0)
                    java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                    goto L63
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C841970X1f.LIZ(X.0X52, java.io.InputStream):android.webkit.WebResourceResponse");
            }

            @Override // X.AbstractC2205961BVi
            public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                Uri url;
                String strLIZIZ;
                ArrayList arrayList;
                InputStream inputStreamIn;
                WebResourceResponse webResourceResponseShouldInterceptRequest = super.shouldInterceptRequest(webView, webResourceRequest);
                if (webResourceResponseShouldInterceptRequest != null) {
                    return webResourceResponseShouldInterceptRequest;
                }
                WebResourceResponse webResourceResponseLIZ = null;
                if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                    return null;
                }
                if (url.getHost() != null && url.getScheme() != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(url.getScheme());
                    sbLIZ.append("://");
                    sbLIZ.append(url.getHost());
                    sbLIZ.append("/");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = null;
                }
                if (strLIZIZ == null) {
                    return null;
                }
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                if (requestHeaders != null) {
                    arrayList = new ArrayList(requestHeaders.size());
                    for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                        arrayList.add(new C080U(entry.getKey(), entry.getValue()));
                    }
                } else {
                    arrayList = null;
                }
                C0X9S<TypedInput> c0x9sStreamRequest = ((TtnetRetrofitApi) C1515120pWw.LJIIIZ(TtnetRetrofitApi.class, strLIZIZ)).streamRequest(url.toString(), arrayList);
                C1541610qDf.LIZIZ();
                C786950Utx.LIZ("TtnetInterceptExtension");
                try {
                    C0X52<TypedInput> c0x52Execute = c0x9sStreamRequest.execute();
                    if (c0x52Execute != null) {
                        TypedInput typedInput = c0x52Execute.LIZIZ;
                        if (typedInput != null) {
                            inputStreamIn = typedInput.in();
                        } else {
                            inputStreamIn = null;
                        }
                        if (inputStreamIn == null) {
                            c0x9sStreamRequest.cancel();
                        }
                        C786950Utx.LIZ("TtnetInterceptExtension");
                        webResourceResponseLIZ = LIZ(c0x52Execute, inputStreamIn);
                        return webResourceResponseLIZ;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ttnetRequest ");
                    sbLIZ2.append(e);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C786950Utx.LIZ("TtnetInterceptExtension");
                    c0x9sStreamRequest.cancel();
                }
                return webResourceResponseLIZ;
            }
        };

        @Override // X.AbstractC1541650qDj
        public final boolean LIZIZ() {
            return this.LLIZLLLIL.LLILZ;
        }

        @Override // X.AbstractC1541650qDj
        public final void LIZJ() {
            LJ("shouldInterceptRequest", this.LLIZ, 7000);
        }
    };

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        this.LLILLL = "ttnet";
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebViewClient(), this.LLIZ);
    }
}
