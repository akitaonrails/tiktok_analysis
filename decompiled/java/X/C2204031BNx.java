package X;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.bridge.channel.WebViewPort;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1BNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204031BNx implements InterfaceC1533080pzu {
    public final Object LIZLLL;
    public final C1BOC LIZ = new C1BOC();
    public WeakReference<View> LIZIZ = null;
    public boolean LJ = false;
    public C2204041BNy LJFF = null;
    public C0XGW LJI = null;
    public final String LIZJ = "HybridKit";

    @Override // X.InterfaceC1533080pzu
    public final void LIZ() {
        this.LJ = false;
        C2204041BNy c2204041BNy = this.LJFF;
        if (c2204041BNy != null) {
            if (c2204041BNy.LJJII.get()) {
                C1BPP.LIZ("[Runtime] call onLoadStarted after release.");
                return;
            }
            if (!c2204041BNy.LJJI.compareAndSet(false, true)) {
                C1BPP.LIZ("[Runtime] onLoadStarted more than once!");
                return;
            }
            for (C1BO6 c1bo6 : c2204041BNy.LJIJ) {
                try {
                    c1bo6.LJFF();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[Runtime] ");
                    sbLIZ.append(c1bo6.LIZ());
                    sbLIZ.append(" onLoadStarted error:");
                    C1BPP.LIZJ(4, C2188811AlT.LIZIZ(sbLIZ), th);
                }
            }
        }
    }

    @Override // X.InterfaceC1533080pzu
    public final Object LJFF() {
        C2204041BNy c2204041BNy = this.LJFF;
        return c2204041BNy != null ? c2204041BNy.LJIIJJI : this.LIZLLL;
    }

    public final void LJIIIZ() {
        WebViewPort.JSInterface jSInterface;
        if (this.LJFF != null) {
            View view = this.LIZIZ.get();
            if ((view instanceof WebView) && (jSInterface = WebViewPort.JSInterface.LIZJ.get(view)) != null) {
                jSInterface.LIZ.set(null);
                jSInterface.LIZIZ = null;
            }
            this.LJFF.release();
            this.LJFF = null;
        }
    }

    @Override // X.InterfaceC1533080pzu
    public final void LJJIZ() {
        C2204041BNy c2204041BNy = this.LJFF;
        if (c2204041BNy != null) {
            if (c2204041BNy.LJJII.get()) {
                C1BPP.LIZ("[Runtime] call onLoadFinished after release.");
                return;
            }
            if (!c2204041BNy.LJJIFFI.compareAndSet(false, true)) {
                C1BPP.LIZ("[Runtime] onLoadFinished more than once!");
                return;
            }
            C1287750jcD c1287750jcD = c2204041BNy.LJII;
            c1287750jcD.getClass();
            C1287700jc8.LIZJ(new RunnableC1287740jcC(c1287750jcD));
            for (C1BO6 c1bo6 : c2204041BNy.LJIJ) {
                try {
                    c1bo6.getClass();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[Runtime] ");
                    sbLIZ.append(c1bo6.LIZ());
                    sbLIZ.append(" onLoadFinished error:");
                    C1BPP.LIZJ(4, C2188811AlT.LIZIZ(sbLIZ), th);
                }
            }
        }
    }

    @Override // X.InterfaceC1533080pzu
    public final void onDestroy() {
        this.LIZ.release();
        LJIIIZ();
        View view = this.LIZIZ.get();
        if (view instanceof WebView) {
            final WebView webView = (WebView) view;
            C1287700jc8.LIZIZ(new Runnable() { // from class: X.1BOH
                @Override // java.lang.Runnable
                public final void run() {
                    WebView webView2 = webView;
                    webView2.removeJavascriptInterface("pia_bridge");
                    WebViewPort.JSInterface.LIZJ.remove(webView2);
                }
            });
        }
    }

    @Override // X.InterfaceC1533080pzu
    public final void LIZIZ() {
        LJIIIZ();
    }

    public C2204031BNx(C1530150pvB c1530150pvB) {
        this.LIZLLL = c1530150pvB;
    }

    @Override // X.InterfaceC1533080pzu
    public final void LIZJ(String str) {
        Uri uri;
        if (str != null) {
            uri = UriProtector.parse(str);
        } else {
            uri = null;
        }
        if (!C1953107kv.LIZIZ(uri)) {
            return;
        }
        this.LJ = true;
        if (this.LJFF == null) {
            return;
        }
        LJIIIZ();
        this.LJFF = LJII(str);
    }

    @Override // X.InterfaceC1533080pzu
    public final boolean LIZLLL(Uri uri) {
        C2204041BNy c2204041BNy = this.LJFF;
        if (c2204041BNy == null) {
            return false;
        }
        c2204041BNy.getClass();
        if (!C1953107kv.LIZIZ(uri)) {
            return false;
        }
        if (!uri.getBooleanQueryParameter("__pia_manifest__", false) && !uri.getBooleanQueryParameter("_pia_", false) && (!C2203961BNq.LIZ().isPiaQueryDisable || !TextUtils.equals(uri.getHost(), c2204041BNy.LJ.getHost()) || !TextUtils.equals(uri.getPath(), c2204041BNy.LJ.getPath()))) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1533080pzu
    public final void LJ(C0XGV c0xgv) {
        this.LJI = c0xgv;
        C2204041BNy c2204041BNy = this.LJFF;
        if (c2204041BNy != null) {
            c2204041BNy.LJIIJJI("event-on-bind-bridge-handle", c0xgv);
        }
    }

    @Override // X.InterfaceC1533080pzu
    public final InterfaceC1532650pzD LJI(InterfaceC1535470q3l interfaceC1535470q3l) {
        C1BPP.LJ("[Runtime] start onBeforeLoadResource.");
        InterfaceC1532650pzD interfaceC1532650pzD = null;
        if (!C1953107kv.LIZIZ(interfaceC1535470q3l.getUrl())) {
            return null;
        }
        if (!this.LJ && this.LJFF != null && interfaceC1535470q3l.isForMainFrame() && interfaceC1535470q3l.getUrl() != null) {
            C2204001BNu c2204001BNu = new C2204001BNu();
            c2204001BNu.LIZIZ = interfaceC1535470q3l.getUrl().toString();
            if (c2204001BNu.LIZIZ() != null) {
                LJIIIZ();
                this.LJFF = LJII(interfaceC1535470q3l.getUrl().toString());
            }
        }
        if (this.LJFF != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C2204041BNy c2204041BNy = this.LJFF;
            if (c2204041BNy.LJJII.get()) {
                C1BPP.LIZ("[Runtime] call onBeforeLoadResource after release.");
            } else {
                Iterator<C1BO6> it2 = c2204041BNy.LJIJ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C1BO6 next = it2.next();
                    try {
                        InterfaceC1532650pzD interfaceC1532650pzDLIZJ = next.LIZJ(interfaceC1535470q3l);
                        if (interfaceC1532650pzDLIZJ != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("[Runtime] ");
                            sbLIZ.append(next.LIZ());
                            sbLIZ.append(" intercepted resource loading, url=");
                            sbLIZ.append(interfaceC1535470q3l.getUrl());
                            C1BPP.LJ(C2188811AlT.LIZIZ(sbLIZ));
                            interfaceC1532650pzD = interfaceC1532650pzDLIZJ;
                            if (interfaceC1535470q3l.isForMainFrame()) {
                                this.LJFF.LJIILJJIL.LIZJ(jCurrentTimeMillis, "intercept_html.start");
                                this.LJFF.LJIILJJIL.LIZJ(System.currentTimeMillis(), "intercept_html.end");
                            }
                        } else {
                            continue;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[Runtime] ");
                        sbLIZ2.append(next.LIZ());
                        sbLIZ2.append(" error:");
                        C1BPP.LIZJ(4, C2188811AlT.LIZIZ(sbLIZ2), th);
                    }
                }
            }
        }
        C1BPP.LJ("[Runtime] end onBeforeLoadResource.");
        return interfaceC1532650pzD;
    }

    public final C2204041BNy LJII(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2204011BNv c2204011BNv = C1BOK.LIZ;
        String str2 = this.LIZJ;
        Object obj = this.LIZLLL;
        c2204011BNv.getClass();
        C2204041BNy c2204041BNyLIZ = C2204011BNv.LIZ(str, str2, obj, null, true);
        if (c2204041BNyLIZ != null) {
            C1BOC c1boc = this.LIZ;
            c2204041BNyLIZ.LJJIII = c1boc;
            c1boc.LIZ(c2204041BNyLIZ, "ctx-pia-runtime");
            if (!c2204041BNyLIZ.LJIL.get()) {
                C2201341BDo.LIZIZ.LIZ(c2204041BNyLIZ);
                c2204041BNyLIZ.LJII();
            }
            View view = this.LIZIZ.get();
            if (view != null) {
                c2204041BNyLIZ.LJIIJ(view);
            }
            C0XGW c0xgw = this.LJI;
            if (c0xgw != null) {
                c2204041BNyLIZ.LJIIJJI("event-on-bind-bridge-handle", c0xgw);
            }
        }
        return c2204041BNyLIZ;
    }

    public final void LJIIIIZZ(WebKitView webKitView) {
        this.LIZIZ = new WeakReference<>(webKitView);
        String userAgentString = webKitView.getSettings().getUserAgentString();
        if (!userAgentString.contains("PIA/2.5.3")) {
            WebSettings settings = webKitView.getSettings();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(userAgentString);
            sbLIZ.append(" ");
            sbLIZ.append("PIA/2.5.3");
            C786410Ut5.se(settings, C2188811AlT.LIZIZ(sbLIZ));
        }
        C2204041BNy c2204041BNy = this.LJFF;
        if (c2204041BNy != null) {
            c2204041BNy.LJIIJ(webKitView);
        }
    }

    @Override // X.InterfaceC1533080pzu
    public final void LJJ(String str) {
        Uri uri;
        boolean zLJI = MethodIDManager.LJI(202297);
        C1BPP.LJ("[Runtime] start loadUrl");
        if (str != null) {
            uri = UriProtector.parse(str);
        } else {
            uri = null;
        }
        if (!C1953107kv.LIZIZ(uri)) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            this.LJ = true;
            LJIIIZ();
            this.LJFF = LJII(str);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }
}
