package X;

import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.amazon.AmazonShopWebInterfaceHandler;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: renamed from: X.0dAN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039850dAN {
    public final WebView LIZ;
    public C0DHD LIZIZ;
    public final InterfaceC1036110d4L LIZJ;
    public final C1035880d3y LIZLLL;

    public C1039850dAN(WebKitView webKitView, InterfaceC1036110d4L interfaceC1036110d4L, C1035880d3y c1035880d3y) {
        this.LIZ = webKitView;
        this.LIZIZ = null;
        this.LIZJ = interfaceC1036110d4L;
        this.LIZLLL = c1035880d3y;
        this.LIZIZ = new C0DHD(webKitView, new AwS630S0100000_16(this, 111), new AwS595S0100000_16(this, 477), interfaceC1036110d4L, c1035880d3y);
        webKitView.addJavascriptInterface(new AmazonShopWebInterfaceHandler(new C828200WeI(webKitView, new C0DQJ(webKitView, this.LIZIZ, interfaceC1036110d4L, c1035880d3y))), "AmazonShopExternalInterfaceHandler");
    }
}
