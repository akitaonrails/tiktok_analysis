package X;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.autofill.AutofillValue;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.api.component.videoshrink.CommerceLandingPageVideoShrinkComponent;
import com.ss.android.ugc.aweme.web.webcallback.AdWebViewClient;

/* JADX INFO: renamed from: X.0d7W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1038080d7W {
    void LIZ(InterfaceC1887270zDB interfaceC1887270zDB);

    void LIZIZ();

    void LIZJ(WebView webView);

    void LIZLLL(WebKitView webKitView, SparkContext sparkContext);

    void LJ(InterfaceC1039910dAT interfaceC1039910dAT);

    void LJFF();

    void LJI(boolean z);

    void LJII(InterfaceC1036860d5Y interfaceC1036860d5Y, InterfaceC1036210d4V interfaceC1036210d4V);

    void LJIIIIZZ(C1035880d3y c1035880d3y, InterfaceC1036270d4b interfaceC1036270d4b);

    void LJIIIZ(EnumC1039490d9n enumC1039490d9n, int i, Long l);

    void LJIIJ(View.OnTouchListener onTouchListener);

    void LJIIJJI(WebBackForwardList webBackForwardList, WebView webView, String str);

    void LJIIL(WebView webView, boolean z, boolean z2);

    C1044220dHQ LJIILIIL(WebKitView webKitView);

    void LJIILJJIL(int i);

    void LJIILL(String str);

    boolean LJIILLIIL(WebView webView, MotionEvent motionEvent);

    void LJIIZILJ(CommerceLandingPageVideoShrinkComponent commerceLandingPageVideoShrinkComponent);

    void LJIJ(long j, String str);

    void LJIJI(InterfaceC1039570d9v interfaceC1039570d9v);

    String LJIJJ();

    void LJIJJLI(boolean z);

    void LJIL(String str);

    void LJJ(String str);

    void LJJI();

    void LJJIFFI(C1035880d3y c1035880d3y, Long l, String str);

    void LJJII(InterfaceC1039660dA4 interfaceC1039660dA4);

    void LJJIII(WebView webView);

    void LJJIIJ(SparseArray<AutofillValue> sparseArray);

    void canGoBack();

    void canGoForward();

    AdWebViewClient getWebViewClient();

    void goBack();

    void goForward();

    void onDestroy();

    void onLoadUrl(WebView webView, String str);

    void onScrollChanged(int i, int i2, int i3, int i4);
}
