package Y;

import X.AbstractC1544900qIy;
import X.C1030580cvQ;
import X.C1054720dYM;
import X.C1055840daA;
import X.C1061110dif;
import X.C1061800djm;
import X.C1062300dka;
import X.C1323450kXn;
import X.C1611490s2N;
import X.C1C7U;
import X.EnumC1055790da5;
import X.InterfaceC1055820da8;
import X.InterfaceC1063920dnC;
import android.content.Context;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS14S1300000_16 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            C1061800djm c1061800djm = (C1061800djm) C1062300dka.LIZJ(C1061800djm.class);
            if (c1061800djm != null) {
                String str = this.s0;
                C1323450kXn c1323450kXn = new C1323450kXn((ReadableMap) this.l1);
                final Callback callback = (Callback) this.l3;
                c1061800djm.LIZIZ(str, c1323450kXn, new InterfaceC1063920dnC() { // from class: X.0dmx
                    @Override // X.InterfaceC1063920dnC
                    public final void LIZ(Map<String, Object> map) {
                        callback.invoke(C1298010jsl.LIZJ(map));
                    }
                }, (C1061110dif) this.l2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void run$0(ARunnableS14S1300000_16 aRunnableS14S1300000_16) {
        boolean zLIZ;
        C1C7U.LIZ("BridgeWebViewDelegate@a136.evaluateJavaScript$1");
        try {
            C1055840daA c1055840daA = (C1055840daA) aRunnableS14S1300000_16.l1;
            String str = aRunnableS14S1300000_16.s0;
            ValueCallback<String> valueCallback = (ValueCallback) aRunnableS14S1300000_16.l2;
            AbstractC1544900qIy abstractC1544900qIy = (AbstractC1544900qIy) aRunnableS14S1300000_16.l3;
            c1055840daA.getClass();
            InterfaceC1055820da8 interfaceC1055820da8 = C1054720dYM.LIZ;
            WebView webView = c1055840daA.LIZ;
            if (webView != null) {
                if (abstractC1544900qIy != null && interfaceC1055820da8 != null) {
                    interfaceC1055820da8.LIZ(webView, str, valueCallback, EnumC1055790da5.EvaluateJS, abstractC1544900qIy);
                } else {
                    webView.evaluateJavascript(str, valueCallback);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BridgeWebViewDelegate@a136.evaluateJavaScript$1");
    }

    public static final void run$1(ARunnableS14S1300000_16 aRunnableS14S1300000_16) {
        boolean zLIZ;
        C1C7U.LIZ("LynxBridgeModule@17f7.call$1");
        try {
            aRunnableS14S1300000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxBridgeModule@17f7.call$1");
    }

    public static final void run$2(ARunnableS14S1300000_16 aRunnableS14S1300000_16) {
        boolean zLIZ;
        C1C7U.LIZ("MiniAppServiceProxy@cf.openMiniApp$2");
        try {
            if (((C1030580cvQ) aRunnableS14S1300000_16.l3).LIZ() != null) {
                ((C1030580cvQ) aRunnableS14S1300000_16.l3).LIZIZ().openMiniApp((Context) aRunnableS14S1300000_16.l1, aRunnableS14S1300000_16.s0, (C1611490s2N) aRunnableS14S1300000_16.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniAppServiceProxy@cf.openMiniApp$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS14S1300000_16(Object obj, C1055840daA c1055840daA, String str, ValueCallback<String> valueCallback, AbstractC1544900qIy abstractC1544900qIy) {
        this.$t = abstractC1544900qIy;
        this.l1 = obj;
        this.s0 = c1055840daA;
        this.l2 = str;
        this.l3 = valueCallback;
    }
}
