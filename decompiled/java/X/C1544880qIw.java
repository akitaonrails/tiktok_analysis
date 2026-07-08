package X;

import android.net.Uri;
import android.util.LruCache;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0qIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544880qIw {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new LruCache(16);
    }

    public static InterfaceC1544960qJ4 LIZ(final WebView webView, final JSInjectConfig jSInjectConfig) {
        Object c098200Yq;
        InterfaceC1544390qI9 interfaceC1544390qI9 = C1544770qIl.LIZLLL;
        if (interfaceC1544390qI9 != null) {
            try {
                c098200Yq = interfaceC1544390qI9.LIZ(EnumC1537240q6c.Offline, new InterfaceC1544330qI3() { // from class: X.0qIz
                    @Override // X.InterfaceC1544330qI3
                    public final Map<String, String> getRequestHeaders() {
                        return null;
                    }

                    @Override // X.InterfaceC1544330qI3
                    public final boolean isForMainFrame() {
                        return false;
                    }

                    @Override // X.InterfaceC1544330qI3
                    public final String LIZIZ() {
                        return jSInjectConfig.geckoChannel;
                    }

                    @Override // X.InterfaceC1544330qI3
                    public final String LIZJ() {
                        return jSInjectConfig.geckoBundle;
                    }

                    @Override // X.InterfaceC1544330qI3
                    public final String LIZLLL() {
                        return jSInjectConfig.geckoAk;
                    }

                    @Override // X.InterfaceC1544330qI3
                    public final Uri getUrl() {
                        return UriProtector.parse(jSInjectConfig.geckoUrl);
                    }

                    @Override // X.InterfaceC1544330qI3
                    public final WebView LIZ() {
                        return webView;
                    }
                });
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[Resource] Fail to fetch js code by resourceLoader. JSName: ");
                sbLIZ.append(jSInjectConfig.name);
                sbLIZ.append(", cdnUrl: ");
                sbLIZ.append(jSInjectConfig.geckoUrl);
                C1544840qIs.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
                c098200Yq = Unit.LIZ;
            }
            if (c098200Yq instanceof InterfaceC1544960qJ4) {
                return (InterfaceC1544960qJ4) c098200Yq;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081 A[PHI: r2 r3
      0x0081: PHI (r2v6 int) = (r2v0 int), (r2v7 int) binds: [B:22:0x007f, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r3v10 java.lang.String) = (r3v2 java.lang.String), (r3v11 java.lang.String) binds: [B:22:0x007f, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[PHI: r2 r3
      0x0087: PHI (r2v4 int) = (r2v0 int), (r2v6 int) binds: [B:22:0x007f, B:24:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r3v8 java.lang.String) = (r3v2 java.lang.String), (r3v10 java.lang.String) binds: [B:22:0x007f, B:24:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4 A[PHI: r3
      0x00c4: PHI (r3v7 java.lang.String) = (r3v5 java.lang.String), (r3v8 java.lang.String) binds: [B:32:0x009b, B:43:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(android.webkit.WebView r9, com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig r10, X.InterfaceC1544830qIr r11, X.C1544870qIv r12) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1544880qIw.LIZIZ(android.webkit.WebView, com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig, X.0qIr, X.0qIv):java.lang.String");
    }

    public static WebResourceResponse LIZJ(WebView webView, JSInjectConfig jSInjectConfig, AbstractC1544900qIy abstractC1544900qIy, C1544870qIv c1544870qIv) {
        int i;
        String strLIZIZ;
        InterfaceC1544960qJ4 interfaceC1544960qJ4LIZ;
        InputStream data;
        String strLJ;
        String strLJ2;
        if (webView == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jSInjectConfig.isUseHardCode && abstractC1544900qIy != null && (strLJ2 = abstractC1544900qIy.LJ()) != null && strLJ2.length() != 0) {
            strLIZIZ = abstractC1544900qIy.LJ();
            i = 0;
            if (strLIZIZ != null && strLIZIZ.length() != 0) {
                interfaceC1544960qJ4LIZ = null;
            }
            if ((strLIZIZ != null || strLIZIZ.length() == 0) && abstractC1544900qIy != null && (strLJ = abstractC1544900qIy.LJ()) != null && strLJ.length() > 0) {
                i = 0;
                strLIZIZ = strLJ;
            }
            c1544870qIv.LIZLLL.LJI = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            if (strLIZIZ == null && strLIZIZ.length() != 0) {
                c1544870qIv.LIZLLL.LIZLLL = 1;
                c1544870qIv.LIZLLL.LJ = Integer.valueOf(i);
                Uri uri = UriProtector.parse(C1544850qIt.LIZLLL.get(Integer.valueOf(webView.hashCode())));
                if (strLIZIZ == null) {
                    strLIZIZ = "";
                }
                String str = (String) LIZLLL(webView, uri, strLIZIZ, jSInjectConfig, abstractC1544900qIy, c1544870qIv).getSecond();
                if (i == 1 && interfaceC1544960qJ4LIZ != null) {
                    WebResourceResponse webResourceResponseLIZ = C1544970qJ5.LIZ(interfaceC1544960qJ4LIZ);
                    webResourceResponseLIZ.setData(new ByteArrayInputStream(str.getBytes(Charsets.UTF_8)));
                    return webResourceResponseLIZ;
                }
                return new WebResourceResponse("application/javascript", "utf-8", 200, "OK", new LinkedHashMap(), new ByteArrayInputStream(str.getBytes(Charsets.UTF_8)));
            }
            c1544870qIv.LIZLLL.LIZLLL = 0;
            return null;
        }
        i = -1;
        strLIZIZ = null;
        c1544870qIv.LIZLLL.LJFF = jSInjectConfig.geckoUrl;
        interfaceC1544960qJ4LIZ = LIZ(webView, jSInjectConfig);
        if (interfaceC1544960qJ4LIZ != null && (data = interfaceC1544960qJ4LIZ.getData()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Resource] Success to fetch js code by resourceLoader. JSName: ");
            sbLIZ.append(jSInjectConfig.name);
            sbLIZ.append(", cdnUrl: ");
            sbLIZ.append(jSInjectConfig.geckoUrl);
            sbLIZ.append(", loadFrom: ");
            sbLIZ.append(interfaceC1544960qJ4LIZ.LIZJ());
            sbLIZ.append(", mimeType: ");
            sbLIZ.append(interfaceC1544960qJ4LIZ.getMimeType());
            C1544840qIs.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), null);
            C839900WxA c839900WxA = C839900WxA.LIZ;
            String strLIZIZ2 = interfaceC1544960qJ4LIZ.LIZIZ();
            c839900WxA.getClass();
            strLIZIZ = C839900WxA.LIZIZ(data, strLIZIZ2);
            i = 1;
        }
        if (strLIZIZ != null) {
            i = 0;
            strLIZIZ = strLJ;
        } else {
            i = 0;
            strLIZIZ = strLJ;
        }
        c1544870qIv.LIZLLL.LJI = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        if (strLIZIZ == null) {
        }
        c1544870qIv.LIZLLL.LIZLLL = 0;
        return null;
    }

    public static Pair LIZLLL(WebView webView, Uri uri, String str, JSInjectConfig jSInjectConfig, InterfaceC1544830qIr interfaceC1544830qIr, C1544870qIv c1544870qIv) {
        String strLJFF;
        Long lValueOf;
        C1544950qJ3 c1544950qJ3;
        if (interfaceC1544830qIr == null || (strLJFF = interfaceC1544830qIr.LJFF(uri, webView)) == null) {
            strLJFF = "";
        }
        if (c1544870qIv != null && (c1544950qJ3 = c1544870qIv.LIZLLL) != null) {
            c1544950qJ3.LJII = strLJFF;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/*version:1.0.4*/(function(){var e=Date.now(),n=");
        if (c1544870qIv != null) {
            lValueOf = Long.valueOf(c1544870qIv.LIZ);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(";function getClientContext(){return ");
        sbLIZ.append(strLJFF);
        sbLIZ.append("}var t=function(e,n){return e.substring(0,n.length)===n},i=function(e,n){var t;return e.indexOf(n)>-1},o=/iPhone|iPad/.test(navigator.userAgent),a=location.hostname+location.pathname,r=location.href,l=\"js_inject_manage_fe\";function s(t,i,a){var l,s,c,d,u,m;i.totalDuration=Date.now()-n,i.totalFeDuration=Date.now()-e,i.current_url=r,i.is_main_doc=window.top===window.self?1:0;var f={eventName:t,category:i,metrics:a,url:r};o?null===(d=null===(c=null===(s=null===(l=window.webkit)||void 0===l?void 0:l.messageHandlers)||void 0===s?void 0:s.WJSIReport)||void 0===c?void 0:c.postMessage)||void 0===d||d.call(c,f):null===(m=null===(u=window.WJSIReport)||void 0===u?void 0:u.postMessage)||void 0===m||m.call(u,JSON.stringify(f))}var c=");
        sbLIZ.append(C20485080t.LIZIZ(jSInjectConfig));
        sbLIZ.append(";try{if(!c)return s(l,{js_name:\"default\",inject_time:\"default\",err_msg:\"inject failed, js config empty\",err_no:4},{}),{code:4,msg:\"failed\"};for(var d=c.blockList||[],u=c.allowList||[],m=c.injectTime,f=0;f<d.length;f++){var w;if(t(a,w=d[f]))return s(l,{js_name:c.name,inject_time:m,err_msg:\"inject failed, in block list\",err_no:1},{blockListDuration:Date.now()-e}),{code:1,msg:\"failed\"}}for(var _=Date.now(),v=0,g=!1;v<u.length;){var w;if(i(a,w=u[v])){g=!0;break}v+=1}if(!g)return s(l,{js_name:c.name,inject_time:m,err_msg:\"inject failed, not in allowList\",err_no:2},{allowListDuration:Date.now()-_,blockListDuration:_-e}),{code:2,msg:\"failed\"};var j=Date.now(),D=(function () { ");
        sbLIZ.append(str);
        sbLIZ.append(" })();return s(l,{js_name:c.name,inject_time:m,err_msg:\"inject success\",err_no:0},{jsExecuteDuration:Date.now()-j,allowListDuration:j-_,blockListDuration:_-e}),{code:0,msg:\"success\",data:D}}catch(e){return s(l,{js_name:(null==c?void 0:c.name)||\"default_failed\",inject_time:(null==c?void 0:c.injectTime)||\"default_failed\",err_msg:\"inject failed, \".concat(e&&e.message||\"unknown\"),err_no:3},{}),{code:3,msg:\"failed\"}}})();\n");
        return new Pair(strLJFF, C2188811AlT.LIZIZ(sbLIZ));
    }
}
