package X;

import Y.ARunnableS14S1300000_16;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0daA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1055840daA implements InterfaceC1544190qHp {
    public final WebView LIZ;
    public String LIZIZ = "";
    public final ArrayList<InterfaceC1055850daB> LIZJ = new ArrayList<>();
    public boolean LIZLLL;

    @Override // X.InterfaceC1544190qHp
    public final String getUrl() {
        ViewParent viewParent = this.LIZ;
        if (viewParent instanceof InterfaceC1055860daC) {
            String strLJFF = ((InterfaceC1055860daC) viewParent).LJFF();
            if (!TextUtils.isEmpty(strLJFF)) {
                return strLJFF;
            }
        }
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            return this.LIZIZ;
        }
        int i = C2187451AjH.LIZ;
        InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        AtomicBoolean atomicBoolean = C1544000qHW.LIZ;
        if (!C1544000qHW.LJIIL && this.LIZLLL) {
            return "enable://no_url";
        }
        WebView webView = this.LIZ;
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    @Override // X.InterfaceC1055850daB
    public final void onDestroy() {
        Iterator<InterfaceC1055850daB> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().onDestroy();
        }
        this.LIZJ.clear();
        WebView webView = this.LIZ;
        if (webView != null) {
            C1543920qHO.LIZ(webView);
        }
    }

    @Override // X.InterfaceC1544190qHp
    public final WebView LIZ() {
        return this.LIZ;
    }

    public C1055840daA(WebView webView) {
        this.LIZ = webView;
    }

    @Override // X.InterfaceC1055850daB
    public final boolean LIZIZ(String str) {
        Iterator<InterfaceC1055850daB> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZIZ(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1055850daB
    public final void LIZJ(String str) {
        Iterator<InterfaceC1055850daB> it2 = this.LIZJ.iterator();
        if (it2.hasNext()) {
            it2.next().LIZJ(str);
        }
    }

    @Override // X.InterfaceC1055850daB
    public final void LIZLLL(String str) {
        Iterator<InterfaceC1055850daB> it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(str);
        }
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC1544190qHp
    public final void LJ(InterfaceC1055850daB interfaceC1055850daB) {
        this.LIZJ.add(interfaceC1055850daB);
    }

    @Override // X.InterfaceC1544190qHp
    public final void LJI(AbstractC1543580qGq abstractC1543580qGq, String str) {
        WebView webView = this.LIZ;
        if (webView != null) {
            webView.addJavascriptInterface(abstractC1543580qGq, str);
        }
    }

    @Override // X.InterfaceC1544190qHp
    public final void LJII(String str, ValueCallback<String> valueCallback, AbstractC1544900qIy abstractC1544900qIy) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            InterfaceC1055820da8 interfaceC1055820da8 = C1054720dYM.LIZ;
            WebView webView = this.LIZ;
            if (webView != null) {
                if (abstractC1544900qIy != null && interfaceC1055820da8 != null) {
                    interfaceC1055820da8.LIZ(webView, str, valueCallback, EnumC1055790da5.EvaluateJS, abstractC1544900qIy);
                    return;
                } else {
                    webView.evaluateJavascript(str, valueCallback);
                    return;
                }
            }
            return;
        }
        WebView webView2 = this.LIZ;
        if (webView2 == null) {
            return;
        }
        HandlerHook.viewPost(webView2, new ARunnableS14S1300000_16(this, str, valueCallback, abstractC1544900qIy, 0));
    }
}
