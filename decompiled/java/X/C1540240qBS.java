package X;

import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPageSchemaParam;
import com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0qBS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540240qBS {
    public static final C1540240qBS LIZ = new C1540240qBS();
    public static String LIZIZ;

    public static int LIZIZ(WebView webView) {
        int currentIndex;
        WebBackForwardList webBackForwardListCopyBackForwardList;
        if (webView != null && (webBackForwardListCopyBackForwardList = webView.copyBackForwardList()) != null) {
            currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
        } else {
            currentIndex = 0;
        }
        return currentIndex + 1;
    }

    public static void LJI(SparkContext sparkContext) {
        String str = null;
        long jLIZJ = C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.START, EnumC1537220q6a.OPEN_TIME, EnumC1537220q6a.CONTAINER_INIT_START}, null);
        Long lLJI = C1550300qRg.LIZIZ.LJI();
        if (lLJI != null) {
            C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.APP_START}, Long.valueOf(System.currentTimeMillis() - lLJI.longValue()));
        }
        EnumC1520990pgP enumC1520990pgP = EnumC1520990pgP.SparkPerfMonitorOpt;
        if (enumC1520990pgP.not()) {
            if (sparkContext != null) {
                str = sparkContext.containerId;
            }
            C1520360pfO c1520360pfO = new C1520360pfO("hybrid_monitor_spark_start");
            c1520360pfO.LIZIZ = "hybridkit_default_bid";
            C1520080pew.LIZ(str, c1520360pfO.LIZ());
            C1520080pew.LIZLLL("hybrid_log_report", C2097908Jt.LIZJ(new Pair(Scene.SCENE_SERVICE, "hybrid_monitor_spark_start")));
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        if (sparkContext != null) {
            String strLJIJI = sparkContext.LJIJI();
            sparkContext.LJIIIZ().LIZJ("spark_container_name", "Spark");
            sparkContext.LJIIIZ().LIZJ("spark_schema", strLJIJI);
            sparkContext.LJIIIZ().LIZJ("spark_container_version", "1.7.2");
            LIZ.getClass();
            String str2 = LIZIZ;
            if (str2 != null) {
                sparkContext.LJIIIZ().LIZJ("pre_schema", str2);
            }
            LIZIZ = strLJIJI;
        }
        if (enumC1520990pgP.not()) {
            C1520080pew.LIZLLL("hybrid_log_report", C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "container_init_time_view"), new Pair("system_duration", 0), new Pair("systemclock_duration", Long.valueOf(jUptimeMillis2 - jUptimeMillis))));
        }
        C1538200q8A c1538200q8A = new C1538200q8A();
        c1538200q8A.LIZIZ = Long.valueOf(jLIZJ);
        c1538200q8A.LIZJ = Long.valueOf(jLIZJ);
        if (sparkContext != null) {
            sparkContext.LJJ(C1538200q8A.class, c1538200q8A);
        }
    }

    public static void LJII(View view) {
        if (view != null && view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            C786410Ut5.LJJJLZIJ(view, (ViewGroup) view.getParent());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(com.bytedance.hybrid.spark.SparkContext r14, com.bytedance.lynx.spark.schema.model.SparkSchemaParam r15) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1540240qBS.LIZJ(com.bytedance.hybrid.spark.SparkContext, com.bytedance.lynx.spark.schema.model.SparkSchemaParam):java.lang.String");
    }

    public static String LIZLLL(SparkContext sparkContext, SparkSchemaParam sparkSchemaParam) {
        String sparkPerfBiz;
        String sparkPerfBid;
        boolean z;
        boolean z2;
        List<String> list;
        String strLJIJI;
        String strLJIJI2;
        Object key = null;
        if (sparkSchemaParam != null) {
            sparkPerfBiz = sparkSchemaParam.getSparkPerfBiz();
        } else {
            sparkPerfBiz = null;
        }
        if (C1533950q1J.LJ(sparkPerfBiz)) {
            if (sparkSchemaParam == null) {
                return null;
            }
            return sparkSchemaParam.getSparkPerfBiz();
        }
        if (sparkSchemaParam != null) {
            sparkPerfBid = sparkSchemaParam.getSparkPerfBid();
        } else {
            sparkPerfBid = null;
        }
        if (C1533950q1J.LJ(sparkPerfBid)) {
            if (sparkSchemaParam == null) {
                return null;
            }
            return sparkSchemaParam.getSparkPerfBid();
        }
        if (sparkSchemaParam != null && sparkSchemaParam.getSparkPerfBidStrictMode()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        C1546560qLe.LIZ.getClass();
        Map mapLIZLLL = C1546500qLY.LIZLLL();
        synchronized (mapLIZLLL) {
            try {
                for (Map.Entry entry : mapLIZLLL.entrySet()) {
                    List<String> list2 = ((C1546510qLZ) entry.getValue()).LJIILIIL;
                    if (list2 != null) {
                        z2 = false;
                        for (String str : list2) {
                            C1540240qBS c1540240qBS = LIZ;
                            if (sparkContext == null || (strLJIJI2 = sparkContext.LJIJI()) == null) {
                                strLJIJI2 = "";
                            }
                            c1540240qBS.getClass();
                            if (LJFF(strLJIJI2, str)) {
                                z2 = true;
                            }
                        }
                    } else {
                        z2 = false;
                    }
                    if (!z2 && (list = ((C1546510qLZ) entry.getValue()).LJIIL) != null) {
                        for (String str2 : list) {
                            C1540240qBS c1540240qBS2 = LIZ;
                            if (sparkContext == null || (strLJIJI = sparkContext.LJIJI()) == null) {
                                strLJIJI = "";
                            }
                            c1540240qBS2.getClass();
                            if (LJFF(strLJIJI, str2)) {
                                key = entry.getKey();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return (String) key;
    }

    public static boolean LJFF(String str, String str2) {
        Uri uri = UriProtector.parse(str);
        String strLIZIZ = C1942307jB.LIZIZ(uri, "url");
        String str3 = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        String strLIZIZ2 = C1942307jB.LIZIZ(uri, "surl");
        if (strLIZIZ2 != null) {
            str3 = strLIZIZ2;
        }
        if (!a0.LJJIIZI(str, str2, false) && !a0.LJJIIZI(strLIZIZ, str2, false) && !a0.LJJIIZI(str3, str2, false)) {
            return false;
        }
        return true;
    }

    public static void LIZ(View view, final SparkPageSchemaParam sparkPageSchemaParam, final boolean z) {
        if (C1535630q41.LJJI && Build.VERSION.SDK_INT >= 35 && view != null) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0qXs
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    int paddingTop;
                    boolean transNavigationBar;
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    int paddingLeft = view2.getPaddingLeft();
                    int paddingRight = view2.getPaddingRight();
                    int i = 0;
                    if (view2.getPaddingTop() == 0) {
                        if (z) {
                            paddingTop = 0;
                        } else {
                            paddingTop = c20244914JjLIZ.LIZIZ;
                        }
                    } else {
                        paddingTop = view2.getPaddingTop();
                    }
                    SparkSchemaParam sparkSchemaParam = sparkPageSchemaParam;
                    if (sparkSchemaParam instanceof AbsSparkPageSchemaParam) {
                        transNavigationBar = ((AbsSparkPageSchemaParam) sparkSchemaParam).getTransNavigationBar();
                    } else {
                        if (sparkSchemaParam instanceof AbsSparkPopupSchemaParam) {
                            transNavigationBar = ((AbsSparkPopupSchemaParam) sparkSchemaParam).getTransNavigationBar();
                        }
                        i = c20244914JjLIZ.LIZLLL;
                        view2.setPadding(paddingLeft, paddingTop, paddingRight, i);
                        return c20246014Ju;
                    }
                    if (!transNavigationBar) {
                        i = c20244914JjLIZ.LIZLLL;
                    }
                    view2.setPadding(paddingLeft, paddingTop, paddingRight, i);
                    return c20246014Ju;
                }
            });
            C20097313kJ.LIZJ(view);
        }
    }

    public static void LJIIIIZZ(Window window, SparkSchemaParam sparkSchemaParam, final View view, boolean z) {
        AbsSparkPageSchemaParam absSparkPageSchemaParam;
        boolean transStatusBar;
        EnumC1067640dtC engineType = sparkSchemaParam.getEngineType();
        int keyboardAdjust = sparkSchemaParam.getKeyboardAdjust();
        final boolean transNavigationBar = false;
        if (keyboardAdjust != 0) {
            if (keyboardAdjust != 1) {
                if (keyboardAdjust != 2) {
                    if (window != null) {
                        window.setSoftInputMode(32);
                        return;
                    }
                    return;
                }
                if (window != null) {
                    window.setSoftInputMode(16);
                }
                if (sparkSchemaParam instanceof AbsSparkPageSchemaParam) {
                    transStatusBar = ((AbsSparkPageSchemaParam) sparkSchemaParam).getTransStatusBar();
                } else {
                    transStatusBar = false;
                }
                if (!z && !transStatusBar) {
                    return;
                }
            } else {
                if (window != null) {
                    window.setSoftInputMode(32);
                }
                if (engineType != EnumC1067640dtC.WEB) {
                    return;
                }
            }
            if (view == null || z) {
                return;
            }
            if ((sparkSchemaParam instanceof SparkPageSchemaParam) && (absSparkPageSchemaParam = (AbsSparkPageSchemaParam) sparkSchemaParam) != null) {
                transNavigationBar = absSparkPageSchemaParam.getTransNavigationBar();
            }
            new ViewTreeObserver.OnGlobalLayoutListener(view, transNavigationBar) { // from class: X.0qQA
                public final WeakReference<View> LL;
                public final ViewTreeObserver LLILLJJLI;
                public int LLILLL;
                public final ViewGroup.LayoutParams LLILZ;
                public final boolean LLILZIL;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    View view2 = this.LL.get();
                    if (view2 == null) {
                        if (this.LLILLJJLI.isAlive()) {
                            C786410Ut5.A3(this.LLILLJJLI, this);
                            return;
                        }
                        return;
                    }
                    Rect rect = new Rect();
                    view2.getWindowVisibleDisplayFrame(rect);
                    int iLJII = rect.bottom;
                    if (view2.getFitsSystemWindows() || (view2.getParent() != null && ((View) view2.getParent()).getFitsSystemWindows())) {
                        C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                        Context context = view2.getContext();
                        c1546210qL5.getClass();
                        iLJII -= C1546210qL5.LJII(context);
                    }
                    boolean z2 = this.LLILZIL && (view2.getRootView().getSystemUiVisibility() & 512) == 512;
                    WindowInsets rootWindowInsets = view2.getRootWindowInsets();
                    int stableInsetBottom = iLJII + (z2 ? rootWindowInsets.getStableInsetBottom() : 0);
                    if (rootWindowInsets != null && rootWindowInsets.getStableInsetTop() != rect.top) {
                        int stableInsetTop = rootWindowInsets.getStableInsetTop();
                        int i = rect.top;
                        if (stableInsetTop < i) {
                            stableInsetBottom -= i - rootWindowInsets.getStableInsetTop();
                        }
                    }
                    if (stableInsetBottom != this.LLILLL) {
                        this.LLILZ.height = stableInsetBottom;
                        C786410Ut5.W5(view2, this.LLILZ);
                        HandlerHook.viewPost(view2, new ARunnableS106S0100000_6(view2, 318));
                        this.LLILLL = stableInsetBottom;
                    }
                }

                {
                    if (view != null) {
                        this.LL = new WeakReference<>(view);
                        this.LLILLJJLI = view.getViewTreeObserver();
                        C786410Ut5.x3(this.LLILLJJLI, this);
                        this.LLILZ = view.getLayoutParams();
                        this.LLILZIL = transNavigationBar;
                    }
                }
            };
            return;
        }
        if (window == null) {
            return;
        }
        window.setSoftInputMode(48);
    }

    public static boolean LJ(Uri uri, String str, String str2, String str3, String str4) {
        if (uri == null) {
            uri = UriProtector.parse(str);
        }
        if (str3 == null && (str3 = C1942307jB.LIZIZ(uri, "url")) == null) {
            str3 = "";
        }
        if (str4 == null && (str4 = C1942307jB.LIZIZ(uri, "surl")) == null) {
            str4 = "";
        }
        if (!a0.LJJIIZI(str, str2, false) && !a0.LJJIIZI(str3, str2, false) && !a0.LJJIIZI(str4, str2, false)) {
            return false;
        }
        return true;
    }
}
