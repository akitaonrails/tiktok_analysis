package X;

import Y.ARunnableS123S0100000_23;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.debug.MonitorDebugTool;
import com.bytedance.android.monitorV2.webview.WebViewMonitorHelper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pgj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521190pgj {
    public static final C1521190pgj LIZ = new C1521190pgj();
    public static final HashMap<String, C1521250pgp> LIZIZ = new HashMap<>();
    public static final HashMap<String, C1521250pgp> LIZJ = new HashMap<>();
    public static final HashSet<String> LIZLLL = new HashSet<>();
    public static final long LJ = 20000;
    public static final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());
    public static volatile WeakHashMap<View, C1521200pgk> LJI = new WeakHashMap<>();
    public static boolean LJII;
    public static final C1491690ov9 LJIIIIZZ;
    public static final String LJIIIZ;
    public static final String LJIIJ;
    public static final boolean LJIIJJI;

    static {
        C1491690ov9 c1491690ov9 = new C1491690ov9(18, Long.MAX_VALUE, "WEB_COMMON", null, true, false);
        c1491690ov9.LIZ("COMMON");
        c1491690ov9.LIZLLL(EnumC1521120pgc.VIEW_ENGINE_TYPE.getKey(), "web");
        LJIIIIZZ = c1491690ov9;
        LJIIIZ = "web";
        LJIIJ = "";
        LJIIJJI = true;
    }

    public static C1521250pgp LIZ(C1521250pgp c1521250pgp) {
        String str;
        String str2;
        String[] strArr;
        JSONArray jSONArrayLJI;
        boolean zOptBoolean;
        String strLIZIZ;
        C1521250pgp c1521250pgp2 = new C1521250pgp();
        c1521250pgp.LJFF = c1521250pgp.LJFF;
        c1521250pgp2.LJI = c1521250pgp.LJI;
        if (!TextUtils.isEmpty(c1521250pgp.LJIIJ)) {
            str = c1521250pgp.LJIIJ;
        } else {
            str = null;
        }
        c1521250pgp2.LJIIJ = str;
        c1521250pgp2.LJ = c1521250pgp.LJ;
        c1521250pgp2.LIZJ = c1521250pgp.LIZJ;
        c1521250pgp2.LIZIZ = c1521250pgp.LIZIZ;
        c1521250pgp2.LIZ = c1521250pgp.LIZ;
        c1521250pgp2.LJFF = c1521250pgp.LJFF;
        c1521250pgp2.LJII = c1521250pgp.LJII;
        if (TextUtils.isEmpty(c1521250pgp.LJIIIZ)) {
            str2 = "SlardarHybrid('config',{sendCommonParams:{},monitors:{StaticErrorMonitor:{ignore:[]},StaticPerformanceMonitor:{slowSession:8000,sampleRate:0.1},FPSMonitor:{interval:3000},MemoryMonitor:{interval:3000},PerformanceMonitor:{interval:100,checkPoint:['DOMContentLoaded','load']}}});";
        } else {
            str2 = c1521250pgp.LJIIIZ;
        }
        c1521250pgp2.LJIIIZ = str2;
        c1521250pgp2.LJIIIIZZ = c1521250pgp.LJIIIIZZ;
        if (!TextUtils.isEmpty(c1521250pgp.LIZLLL)) {
            JSONObject jSONObjectLJIILL = C1520640pfq.LJIILL(c1521250pgp.LIZLLL);
            if (C1520640pfq.LJIIIIZZ("webview_classes", jSONObjectLJIILL) == null) {
                strArr = c1521250pgp2.LIZ;
            } else {
                String str3 = c1521250pgp.LIZLLL;
                strArr = new String[0];
                if (!TextUtils.isEmpty(str3) && (jSONArrayLJI = C1520640pfq.LJI("webview_classes", C1520640pfq.LJIILL(str3))) != null) {
                    strArr = new String[jSONArrayLJI.length()];
                    int length = jSONArrayLJI.length();
                    for (int i = 0; i < length; i++) {
                        try {
                            strArr[i] = JSONArrayProtectorUtils.getString(jSONArrayLJI, i);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }
            c1521250pgp2.LIZ = strArr;
            if (C1520640pfq.LJIIIIZZ("webview_is_need_monitor", jSONObjectLJIILL) == null) {
                zOptBoolean = c1521250pgp2.LJ;
            } else {
                zOptBoolean = C1520640pfq.LJIILL(c1521250pgp.LIZLLL).optBoolean("webview_is_need_monitor", false);
            }
            c1521250pgp2.LJ = zOptBoolean;
            if (TextUtils.isEmpty(c1521250pgp.LIZLLL)) {
                strLIZIZ = c1521250pgp2.LJIIIZ;
            } else {
                C1521430ph7 c1521430ph7 = new C1521430ph7(c1521250pgp.LIZLLL);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                C1520640pfq.LJIILJJIL(jSONObject, "monitors", jSONObject2);
                C1520640pfq.LJIILJJIL(jSONObject, "sendCommonParams", c1521430ph7.LJ);
                C1521430ph7.LIZ(jSONObject2, c1521430ph7.LIZ);
                C1521430ph7.LIZ(jSONObject2, c1521430ph7.LIZIZ);
                C1521430ph7.LIZ(jSONObject2, c1521430ph7.LIZJ);
                C1521430ph7.LIZ(jSONObject2, c1521430ph7.LIZLLL);
                String strJ3 = C786410Ut5.J3(jSONObject);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SlardarHybrid('config', ");
                sbLIZ.append(strJ3);
                sbLIZ.append(")");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            c1521250pgp2.LJIIIZ = strLIZIZ;
        }
        return c1521250pgp2;
    }

    public static C1521510phF LIZIZ(WebView webView) {
        Class<?> cls;
        Class<?> cls2;
        HashMap<String, C1521250pgp> map;
        C1521250pgp c1521250pgp;
        if (webView == null) {
            return new C1521510phF("view is null", null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(webView.hashCode());
        sbLIZ.append("");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String name = webView.getClass().getName();
        C1521250pgp c1521250pgp2 = LIZJ.get(strLIZIZ);
        if (c1521250pgp2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mWebViewObjs:");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" viewClass:");
            sbLIZ2.append(name);
            return new C1521510phF(C2188811AlT.LIZIZ(sbLIZ2), c1521250pgp2);
        }
        HashMap<String, C1521250pgp> map2 = LIZIZ;
        C1521250pgp c1521250pgp3 = map2.get(name);
        if (c1521250pgp3 != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("mWebViewClasses:");
            sbLIZ3.append(name);
            return new C1521510phF(C2188811AlT.LIZIZ(sbLIZ3), c1521250pgp3);
        }
        if (LIZLLL.contains(name)) {
            return new C1521510phF("webViewClazz in mWebViewMissClasses", null);
        }
        for (String str : new HashSet(map2.keySet())) {
            try {
                cls = Class.forName(name);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1520960pgM.LIZIZ(th);
                cls = null;
            }
            try {
                cls2 = Class.forName(str);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1520960pgM.LIZIZ(th2);
                cls2 = null;
            }
            if (cls != null && cls2 != null && cls2.isAssignableFrom(cls) && (c1521250pgp = (map = LIZIZ).get(str)) != null) {
                map.put(name, c1521250pgp);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(name);
                sbLIZ4.append(" isAssignedFrom:");
                sbLIZ4.append(str);
                return new C1521510phF(C2188811AlT.LIZIZ(sbLIZ4), c1521250pgp);
            }
        }
        LIZLLL.add(name);
        return new C1521510phF("objects classes superclass all miss", null);
    }

    public static C1521200pgk LIZJ(WebView webView) {
        C1521200pgk c1521200pgk;
        C1521200pgk c1521200pgk2 = LJI.get(webView);
        if (c1521200pgk2 != null) {
            return c1521200pgk2;
        }
        synchronized (LJI) {
            try {
                WeakHashMap<View, C1521200pgk> weakHashMap = LJI;
                C1521200pgk c1521200pgk3 = weakHashMap.get(webView);
                if (c1521200pgk3 == null) {
                    c1521200pgk3 = new C1521200pgk(webView);
                    weakHashMap.put(webView, c1521200pgk3);
                }
                c1521200pgk = c1521200pgk3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1521200pgk;
    }

    public static boolean LJFF(WebView webView) {
        boolean z;
        try {
            C1521250pgp c1521250pgp = LIZIZ(webView).LIZIZ;
            if (c1521250pgp != null) {
                z = c1521250pgp.LJ;
            } else {
                z = true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1520960pgM.LIZIZ(e);
            z = false;
        }
        if (LJII != z) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isNeedMonitor: ");
            sbLIZ.append(z);
            C1521730phb.LJFF("WebViewMonitorHelperImp", C2188811AlT.LIZIZ(sbLIZ));
            LJII = z;
        }
        return z;
    }

    public static void LJII(WebView webView) {
        C1521180pgi c1521180pgi = (C1521180pgi) LIZJ(webView).LLJIJIL;
        if (c1521180pgi != null) {
            C1521130pgd.LIZIZ(c1521180pgi);
            c1521180pgi.LJIILL().LJIIJ = 3;
            C1521420ph6 c1521420ph6LJIILL = c1521180pgi.LJIILL();
            C1491690ov9 c1491690ov9LIZLLL = c1521180pgi.LIZLLL();
            if (c1521420ph6LJIILL.LJ == 0) {
                c1521420ph6LJIILL.LJ = c1491690ov9LIZLLL.LIZIZ(EnumC1521270pgr.ON_PAGE_FINISHED, null);
            }
            c1521180pgi.LJJ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0ph8] */
    public static void LJIIJ(WebView webView) {
        final C1521200pgk c1521200pgkLIZJ = LIZJ(webView);
        c1521200pgkLIZJ.LLJIJIL = new C1521180pgi(c1521200pgkLIZJ);
        c1521200pgkLIZJ.LJIILL(EnumC1521270pgr.CREATED, c1521200pgkLIZJ.LIZIZ());
        WebView webViewLJIIL = c1521200pgkLIZJ.LJIIL();
        if (webViewLJIIL != null) {
            if (c1521200pgkLIZJ.LLJJJJ == null) {
                c1521200pgkLIZJ.LLJJJJ = new View.OnAttachStateChangeListener(c1521200pgkLIZJ) { // from class: X.0ph8
                    public final C1521200pgk LL;

                    {
                        this.LL = c1521200pgkLIZJ;
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view) {
                        if (view instanceof WebView) {
                            C1521200pgk c1521200pgk = this.LL;
                            if (!c1521200pgk.LLJJI) {
                                c1521200pgk.LLJJI = true;
                                c1521200pgk.LJIILL(EnumC1521270pgr.ATTACHED, c1521200pgk.LIZIZ());
                            }
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view) {
                        T t;
                        if (view instanceof WebView) {
                            C1521200pgk c1521200pgk = this.LL;
                            c1521200pgk.getClass();
                            c1521200pgk.LJIILL(EnumC1521270pgr.DETACHED, c1521200pgk.LIZIZ());
                            c1521200pgk.LJIIJ();
                            if (c1521200pgk.LLIZ && (t = c1521200pgk.LLJIJIL) != 0) {
                                t.LJI();
                            }
                        }
                    }
                };
            }
            ViewOnAttachStateChangeListenerC1521440ph8 viewOnAttachStateChangeListenerC1521440ph8 = c1521200pgkLIZJ.LLJJJJ;
            if (viewOnAttachStateChangeListenerC1521440ph8 != null) {
                webViewLJIIL.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1521440ph8);
                webViewLJIIL.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1521440ph8);
            }
        }
        c1521200pgkLIZJ.LJIIZILJ();
        C824310WVh.LIZLLL(new ARunnableS123S0100000_23(c1521200pgkLIZJ, 127));
    }

    public static void LJIIJJI(WebView webView) {
        ViewOnAttachStateChangeListenerC1521440ph8 viewOnAttachStateChangeListenerC1521440ph8;
        C1521200pgk c1521200pgkLIZJ = LIZJ(webView);
        c1521200pgkLIZJ.LJIIJ();
        c1521200pgkLIZJ.LJIILL(EnumC1521270pgr.DESTROYED, c1521200pgkLIZJ.LIZIZ());
        WebView webViewLJIIL = c1521200pgkLIZJ.LJIIL();
        if (webViewLJIIL != null && (viewOnAttachStateChangeListenerC1521440ph8 = c1521200pgkLIZJ.LLJJJJ) != null) {
            webViewLJIIL.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1521440ph8);
        }
        C1286970jax c1286970jax = c1521200pgkLIZJ.LLJJJJLIIL;
        if (c1286970jax != null) {
            c1286970jax.LJIIIIZZ = false;
            c1286970jax.LIZLLL = null;
            c1521200pgkLIZJ.LLJJJJLIIL = null;
        }
        C1491690ov9 c1491690ov9LIZIZ = c1521200pgkLIZJ.LIZIZ();
        c1491690ov9LIZIZ.getClass();
        C1491570oux c1491570oux = C1491570oux.LIZ;
        String str = c1491690ov9LIZIZ.LIZ;
        c1491570oux.getClass();
        C1491570oux.LJIIZILJ(str);
        Map<String, InterfaceC1521900phs> map = C1521590phN.LIZ.get(c1521200pgkLIZJ);
        if (map != null) {
            map.clear();
        }
        String strLIZIZ = "";
        if (webView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(webView.hashCode());
            sbLIZ.append("");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        LIZJ.remove(strLIZIZ);
        WebViewMonitorHelper.getInstance().getMonitorContext().getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.0pgy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(android.webkit.WebView r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1521190pgj.LJI(android.webkit.WebView, java.lang.String):void");
    }

    public static void LJIIIIZZ(WebView webView, C1520220pfA c1520220pfA) throws JSONException, InterruptedException {
        boolean z;
        String str;
        C1491690ov9 c1491690ov9LIZLLL;
        String str2;
        WeakReference<WebView> weakReference;
        String str3;
        C1521180pgi c1521180pgi;
        C1521360ph0 c1521360ph0;
        C1491690ov9 c1491690ov9LIZLLL2;
        Class<?> cls;
        C1521200pgk c1521200pgkLIZJ = LIZJ(webView);
        c1521200pgkLIZJ.LLIZ = true;
        C1491690ov9 c1491690ov9LIZIZ = c1521200pgkLIZJ.LIZIZ();
        EnumC1521120pgc enumC1521120pgc = EnumC1521120pgc.VIEW_IS_PAGE_STARTED;
        String key = enumC1521120pgc.getKey();
        Boolean bool = Boolean.TRUE;
        c1491690ov9LIZIZ.LIZLLL(key, bool);
        c1521200pgkLIZJ.LJFF();
        C1521590phN.LIZ(c1521200pgkLIZJ);
        WebView webViewLJIIL = c1521200pgkLIZJ.LJIIL();
        if (webViewLJIIL != null && webViewLJIIL.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        c1521200pgkLIZJ.LLJI = z;
        c1521200pgkLIZJ.LIZIZ().LIZLLL(EnumC1521120pgc.VIEW_IS_VISIBLE_ON_PAGE_STARTED.getKey(), Boolean.valueOf(z));
        c1521200pgkLIZJ.LLIZ = true;
        c1521200pgkLIZJ.LIZIZ().LIZLLL(enumC1521120pgc.getKey(), bool);
        C1521190pgj c1521190pgj = c1521200pgkLIZJ.LLJILLL;
        WebView webViewLJIIL2 = c1521200pgkLIZJ.LJIIL();
        c1521190pgj.getClass();
        C1521510phF c1521510phFLIZIZ = LIZIZ(webViewLJIIL2);
        int i = C2187451AjH.LIZ;
        String str4 = c1521200pgkLIZJ.LLJJIII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("use config ");
        sbLIZ.append(c1521510phFLIZIZ);
        C1521730phb.LJFF(str4, C2188811AlT.LIZIZ(sbLIZ));
        C1521250pgp c1521250pgp = c1521510phFLIZIZ.LIZIZ;
        String name = null;
        if (c1521250pgp != null && c1521250pgp.LIZJ != null && c1521200pgkLIZJ.LJIIL() != null) {
            HashMap map = new HashMap();
            WebView webViewLJIIL3 = c1521200pgkLIZJ.LJIIL();
            if (webViewLJIIL3 != null) {
                cls = webViewLJIIL3.getClass();
            } else {
                cls = null;
            }
            map.put("config_from_class", String.valueOf(cls));
            C2119208Ry.LIZIZ(null, "interface_monitor", map, null);
        }
        c1521200pgkLIZJ.LLJJIJI = c1521510phFLIZIZ.LIZIZ;
        C1491690ov9 c1491690ov9LIZIZ2 = c1521200pgkLIZJ.LIZIZ();
        String key2 = EnumC1521120pgc.VAID.getKey();
        C1521250pgp c1521250pgp2 = c1521200pgkLIZJ.LLJJIJI;
        if (c1521250pgp2 != null) {
            str = c1521250pgp2.LJI;
        } else {
            str = null;
        }
        c1491690ov9LIZIZ2.LIZLLL(key2, str);
        String str5 = c1520220pfA.LJFF.LIZ;
        if (c1521200pgkLIZJ.LLJILJIL != 0) {
            Intrinsics.LJFF(str5, LJIIJ);
            C1521180pgi c1521180pgi2 = (C1521180pgi) c1521200pgkLIZJ.LLJILJIL;
            if (c1521180pgi2 != null) {
                c1521180pgi2.LJIIZILJ();
            }
            c1521200pgkLIZJ.LLJILJIL = null;
        }
        if (InterfaceC1521710phZ.LIZ.contains(str5)) {
            c1521200pgkLIZJ.LLJIJIL = null;
            c1521200pgkLIZJ.LLJILJIL = null;
            c1520220pfA.onEventTerminated(EnumC1520250pfD.BLOCK_LIST);
            return;
        }
        Long l = c1521200pgkLIZJ.LLJJJIL.get(str5);
        if (l != null) {
            if (c1521200pgkLIZJ.LLJIJIL == 0 || !c1521200pgkLIZJ.LLIZLLLIL) {
                c1521200pgkLIZJ.LLJIJIL = new C1521180pgi(c1521200pgkLIZJ, str5);
            }
            T t = c1521200pgkLIZJ.LLJIJIL;
            if (t != 0) {
                t.LJIIJJI(!c1521200pgkLIZJ.LLIZLLLIL);
            }
            C1521180pgi c1521180pgi3 = (C1521180pgi) c1521200pgkLIZJ.LLJIJIL;
            if (c1521180pgi3 != null) {
                if (c1521180pgi3.LLILZ.length() == 0) {
                    c1521180pgi3.LJIIL(str5);
                }
                c1521180pgi3.LLJJL = true;
                c1521180pgi3.LLJJIJI = l.longValue();
                T t2 = c1521200pgkLIZJ.LLJIJIL;
                if (t2 != 0 && (c1491690ov9LIZLLL2 = t2.LIZLLL()) != null) {
                    c1491690ov9LIZLLL2.LIZIZ(EnumC1521270pgr.ON_PAGE_STARTED, null);
                }
            }
            c1521200pgkLIZJ.LLJJJIL.remove(str5);
        } else if (EnumC1520990pgP.WEB_JUMP_EXIT_LAST_SESSION.isEnabled()) {
            C1521180pgi c1521180pgi4 = (C1521180pgi) c1521200pgkLIZJ.LLJIJIL;
            if (c1521180pgi4 != null) {
                c1521180pgi4.LJIIZILJ();
            }
            C1521180pgi c1521180pgi5 = new C1521180pgi(c1521200pgkLIZJ, str5);
            c1521200pgkLIZJ.LLJIJIL = c1521180pgi5;
            c1521180pgi5.LLJJL = false;
            c1521180pgi5.LJIIJJI(!c1521200pgkLIZJ.LLIZLLLIL);
            c1521180pgi5.LLJJIJI = System.currentTimeMillis();
            T t3 = c1521200pgkLIZJ.LLJIJIL;
            if (t3 != 0 && (c1491690ov9LIZLLL = t3.LIZLLL()) != null) {
                c1491690ov9LIZLLL.LIZIZ(EnumC1521270pgr.ON_PAGE_STARTED, null);
            }
        } else {
            C1521180pgi c1521180pgi6 = new C1521180pgi(c1521200pgkLIZJ, str5);
            c1521200pgkLIZJ.LLJIJIL = c1521180pgi6;
            c1521180pgi6.LLJJIJI = System.currentTimeMillis();
        }
        T t4 = c1521200pgkLIZJ.LLJILJIL;
        if (t4 != 0) {
            str2 = t4.LLILZ;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str5, str2) && (c1521180pgi = (C1521180pgi) c1521200pgkLIZJ.LLJILJIL) != null && (c1521360ph0 = c1521180pgi.LLJJIJIL) != null && c1521360ph0.LJ == C1196780hFU.LIZ()) {
            C1521180pgi c1521180pgi7 = (C1521180pgi) c1521200pgkLIZJ.LLJIJIL;
            if (c1521180pgi7 == null) {
                return;
            }
            c1521180pgi7.LLJJLIIIJLLLLLLLZ = false;
            return;
        }
        C1521180pgi c1521180pgi8 = (C1521180pgi) c1521200pgkLIZJ.LLJIJIL;
        if (c1521180pgi8 != null) {
            c1521180pgi8.LJII();
            if (!Intrinsics.LJFF(c1521180pgi8.LLILZ, "about:blank")) {
                C1521250pgp c1521250pgp3 = c1521180pgi8.LLJJI.LLJJIJI;
                if (c1521250pgp3 == null || (str3 = c1521250pgp3.LJFF) == null) {
                    str3 = "";
                }
                c1521180pgi8.LJIIIZ(str3);
                c1521180pgi8.LLJJJ = c1521180pgi8.LLJJI.LIZ();
                C1521200pgk c1521200pgk = c1521180pgi8.LLJJI;
                c1521200pgk.getClass();
                c1521180pgi8.LLJJJIL = new C1491810ovL(c1521200pgk.LLILZ);
                c1521180pgi8.LJIL();
                c1520220pfA.LJFF = c1521180pgi8.LLJJIJIL;
                c1521180pgi8.LJIILL().LJIIJ = 1;
                c1521180pgi8.LJIILL().LJII = c1521180pgi8.LIZLLL().LIZIZ(EnumC1521270pgr.ON_PAGE_SHOW_START, null);
                C1521420ph6 c1521420ph6LJIILL = c1521180pgi8.LJIILL();
                boolean z2 = c1521180pgi8.LLJJL;
                C1491690ov9 c1491690ov9LIZLLL3 = c1521180pgi8.LIZLLL();
                if (c1521420ph6LJIILL.LIZLLL == 0) {
                    c1521420ph6LJIILL.LIZLLL = c1491690ov9LIZLLL3.LIZIZ(EnumC1521270pgr.ON_PAGE_STARTED, null);
                }
                c1521420ph6LJIILL.LJIIL = z2;
                c1521180pgi8.LJJ();
                JSONObject jSONObject = new JSONObject();
                C12868051u.LJI(jSONObject, "invoke_ts", Long.valueOf(System.currentTimeMillis()));
                View view = c1521180pgi8.LLJJI.LL.get();
                if (view != null) {
                    name = view.getClass().getName();
                } else {
                    C1521730phb.LIZIZ("MonitorViewSession", "view is null or not lynxview");
                }
                C12868051u.LJI(jSONObject, "native_view", name);
                c1521180pgi8.LJIJJLI(c1520220pfA, jSONObject);
            }
        }
        c1521200pgkLIZJ.LLJILJIL = c1521200pgkLIZJ.LLJIJIL;
        c1521200pgkLIZJ.LJ();
        if (c1521200pgkLIZJ.LLJJJJLIIL == null || (weakReference = c1521200pgkLIZJ.LLJJ) == null) {
            return;
        }
        weakReference.get();
    }

    public static void LJIIIZ(WebView webView, int i) {
        String url;
        String str;
        String str2;
        C1521920phu c1521920phu;
        C1521200pgk c1521200pgkLIZJ = LIZJ(webView);
        WebView webViewLJIIL = c1521200pgkLIZJ.LJIIL();
        if (webViewLJIIL != null && !webViewLJIIL.getSettings().getJavaScriptEnabled()) {
            webViewLJIIL.getSettings().setJavaScriptEnabled(true);
        }
        C1521180pgi c1521180pgi = (C1521180pgi) c1521200pgkLIZJ.LLJIJIL;
        if (c1521180pgi != null) {
            WebView webViewLJIIL2 = c1521180pgi.LLJJI.LJIIL();
            if (webViewLJIIL2 != null && i >= c1521180pgi.LLJJJJ) {
                if (!webViewLJIIL2.getSettings().getJavaScriptEnabled()) {
                    webViewLJIIL2.getSettings().setJavaScriptEnabled(true);
                }
                try {
                    if (!EnumC1520990pgP.WebScriptInject.not() && (((url = webViewLJIIL2.getUrl()) == null || !Intrinsics.LJFF(url, "about:blank")) && !c1521180pgi.LLJJLIIIJLLLLLLLZ)) {
                        EnumC1521240pgo enumC1521240pgo = EnumC1521240pgo.webInject;
                        if (!enumC1521240pgo.isEnabled() || !EnumC1521240pgo.webDomainWhiteList.isEnabled() || MonitorDebugTool.skipWhiteListInjectCheck() || c1521180pgi.LJIJ(url)) {
                            C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
                            if (c1520380pfQ != null && (c1521920phu = C1520380pfQ.LJIIIIZZ) != null && EnumC1520990pgP.WebScriptInjectProvider.isEnabled()) {
                                c1521920phu.LIZ(webViewLJIIL2);
                                c1521180pgi.LJIJI(System.currentTimeMillis());
                            } else {
                                String url2 = webViewLJIIL2.getUrl();
                                c1520380pfQ.getClass();
                                if ((!C1520380pfQ.LJI(url2) || MonitorDebugTool.skipWhiteListInjectCheck()) && !TextUtils.isEmpty(url) && !c1521180pgi.LLJJLIIIJLLLLLLLZ) {
                                    C1521250pgp c1521250pgp = c1521180pgi.LLJJI.LLJJIJI;
                                    if (c1521250pgp == null) {
                                        str = "SlardarHybrid('config',{sendCommonParams:{},monitors:{StaticErrorMonitor:{ignore:[]},StaticPerformanceMonitor:{slowSession:8000,sampleRate:0.1},FPSMonitor:{interval:3000},MemoryMonitor:{interval:3000},PerformanceMonitor:{interval:100,checkPoint:['DOMContentLoaded','load']}}});";
                                        str2 = "";
                                    } else {
                                        str = c1521250pgp.LJIIIZ;
                                        str2 = c1521250pgp.LJIIJ;
                                    }
                                    webViewLJIIL2.evaluateJavascript(C08EN.LIZ(webViewLJIIL2.getContext(), str2, str, enumC1521240pgo.isEnabled()), null);
                                    c1521180pgi.LJIJI(System.currentTimeMillis());
                                    int i2 = C2187451AjH.LIZ;
                                    String str3 = c1521180pgi.LLJJIII;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("injectJsScript : ");
                                    sbLIZ.append(url);
                                    C1521730phb.LIZ(str3, C2188811AlT.LIZIZ(sbLIZ));
                                    C2119208Ry.LIZIZ(c1521180pgi.LLJJIJIL.LIZIZ, "jssdk_load", null, null);
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1520960pgM.LIZIZ(e);
                }
            }
            C1521420ph6 c1521420ph6LJIILL = c1521180pgi.LJIILL();
            C1491690ov9 c1491690ov9LIZLLL = c1521180pgi.LIZLLL();
            if (i == 100 && c1521420ph6LJIILL.LJFF == 0) {
                c1521420ph6LJIILL.LJFF = c1491690ov9LIZLLL.LIZIZ(EnumC1521270pgr.ON_PAGE_PROGRESS_FINISHED, null);
            }
        }
    }

    public static void LIZLLL(WebView webView, C1520220pfA c1520220pfA, JSONObject jSONObject) throws JSONException, InterruptedException {
        C1521180pgi c1521180pgi = (C1521180pgi) LIZJ(webView).LLJIJIL;
        if (c1521180pgi != null) {
            c1521180pgi.LJIJJLI(c1520220pfA, jSONObject);
        } else {
            c1520220pfA.onEventTerminated(EnumC1520250pfD.INVALID_CASE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(android.webkit.WebView r11, android.webkit.RenderProcessGoneDetail r12, X.C1521810phj r13) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1521190pgj.LJ(android.webkit.WebView, android.webkit.RenderProcessGoneDetail, X.0phj):void");
    }

    public static void LJIIL(WebView webView, String str, String str2, String str3, String str4) {
        C1521200pgk c1521200pgkLIZJ = LIZJ(webView);
        JSONObject jSONObject = new JSONObject();
        C1520640pfq.LJIILIIL("res_status", str, jSONObject);
        C1520640pfq.LJIILIIL("res_type", str2, jSONObject);
        C1520640pfq.LJIILIIL("res_url", str3, jSONObject);
        C1520640pfq.LJIILIIL("container", "web", jSONObject);
        C1520640pfq.LJIILIIL("res_version", str4, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C1520360pfO c1520360pfO = new C1520360pfO("bd_monitor_get_resource");
        c1520360pfO.LIZIZ = "";
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LJ = null;
        c1520360pfO.LJFF = null;
        c1520360pfO.LJII = jSONObject2;
        c1520360pfO.LIZIZ(0);
        C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
        C1520340pfM c1520340pfM = new C1520340pfM();
        c1520340pfM.LJIILIIL = c1520350pfNLIZ;
        c1520340pfM.LIZJ();
        c1521200pgkLIZJ.LJIIIZ(c1520340pfM);
    }
}
