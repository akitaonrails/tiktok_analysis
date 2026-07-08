package X;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: X.1Do3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2266851Do3 {
    public static void LIZ(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage LIZIZ(C2266891Do7 c2266891Do7) {
        String str = c2266891Do7.LIZIZ;
        AbstractC2266911Do9[] abstractC2266911Do9Arr = c2266891Do7.LIZ;
        WebMessagePort[] webMessagePortArr = null;
        if (abstractC2266911Do9Arr != null) {
            int length = abstractC2266911Do9Arr.length;
            WebMessagePort[] webMessagePortArr2 = new WebMessagePort[length];
            for (int i = 0; i < length; i++) {
                C2266901Do8 c2266901Do8 = (C2266901Do8) abstractC2266911Do9Arr[i];
                if (c2266901Do8.LIZ == null) {
                    C085J c085j = C085G.LIZ;
                    c2266901Do8.LIZ = (WebMessagePort) c085j.LIZ.convertWebMessagePort(Proxy.getInvocationHandler(null));
                }
                webMessagePortArr2[i] = c2266901Do8.LIZ;
            }
            webMessagePortArr = webMessagePortArr2;
        }
        return new WebMessage(str, webMessagePortArr);
    }

    public static WebMessagePort[] LIZJ(WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static C2266891Do7 LIZLLL(WebMessage webMessage) {
        AbstractC2266911Do9[] abstractC2266911Do9Arr;
        String data = webMessage.getData();
        WebMessagePort[] ports = webMessage.getPorts();
        if (ports == null) {
            abstractC2266911Do9Arr = null;
        } else {
            abstractC2266911Do9Arr = new AbstractC2266911Do9[ports.length];
            for (int i = 0; i < ports.length; i++) {
                abstractC2266911Do9Arr[i] = new C2266901Do8(ports[i]);
            }
        }
        return new C2266891Do7(data, abstractC2266911Do9Arr);
    }

    public static CharSequence LJ(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int LJFF(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean LJI(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void LJII(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void LJIIJ(WebSettings webSettings, boolean z) {
        webSettings.setOffscreenPreRaster(z);
    }

    public static void LJIIJJI(WebMessagePort webMessagePort, AbstractC2266921DoA abstractC2266921DoA) {
        webMessagePort.setWebMessageCallback(new WebMessagePort.WebMessageCallback() { // from class: X.1Do5
            @Override // android.webkit.WebMessagePort.WebMessageCallback
            public final void onMessage(WebMessagePort webMessagePort2, WebMessage webMessage) {
                C2266851Do3.LIZLLL(webMessage);
                throw null;
            }
        });
    }

    public static void LJIIIIZZ(WebView webView, long j, InterfaceC2114208Qa interfaceC2114208Qa) {
        webView.postVisualStateCallback(j, new WebView.VisualStateCallback() { // from class: X.1Do6
            @Override // android.webkit.WebView.VisualStateCallback
            public final void onComplete(long j2) {
                throw null;
            }
        });
    }

    public static void LJIIIZ(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void LJIIL(WebMessagePort webMessagePort, AbstractC2266921DoA abstractC2266921DoA, Handler handler) {
        webMessagePort.setWebMessageCallback(new WebMessagePort.WebMessageCallback() { // from class: X.1Do4
            @Override // android.webkit.WebMessagePort.WebMessageCallback
            public final void onMessage(WebMessagePort webMessagePort2, WebMessage webMessage) {
                C2266851Do3.LIZLLL(webMessage);
                throw null;
            }
        }, handler);
    }
}
