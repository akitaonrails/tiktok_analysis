package X;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.api.IJSInjectCallback$ErrorCode;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;

/* JADX INFO: renamed from: X.0qIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1544900qIy implements InterfaceC1544830qIr, InterfaceC1545010qJ9 {
    public boolean LIZIZ(String str) {
        return false;
    }

    @Override // X.InterfaceC1544830qIr
    public String LJ() {
        return null;
    }

    @Override // X.InterfaceC1544830qIr
    public String LJFF(Uri uri, WebView webView) {
        return null;
    }

    public String LJI() {
        return "";
    }

    public void LJIIIIZZ(IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode) {
    }

    public void LJIIIZ(C1047860dNI c1047860dNI) {
    }

    public void LJIIJ(int i, Object obj, String str) {
    }

    public void LJIIJJI(Object obj) {
    }

    public void LJII(WebView webView, IJSInjectCallback$ErrorCode iJSInjectCallback$ErrorCode, C1047860dNI c1047860dNI) {
        LJIIIIZZ(iJSInjectCallback$ErrorCode);
    }

    public boolean LIZJ(WebView webView, String str, String str2, JSInjectConfig jSInjectConfig, Integer num) {
        return LIZIZ(str);
    }
}
