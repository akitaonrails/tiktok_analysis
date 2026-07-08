package X;

import Y.ARunnableS112S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.crash.Npth;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.hybrid.common.autoservice.ISDUIAPI;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.autoservice.ISparkInnerPIA;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.hybrid.spark.page.SparkViewLifecycleObserver;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPageSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qEB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB extends FrameLayout implements InterfaceC1051240dSk, InterfaceC1105930esx, SharedPreferences.OnSharedPreferenceChangeListener {
    public static final boolean LLLILZJ;
    public static final boolean LLLILZLLLI;
    public long LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public TextView LLILZ;
    public InterfaceC1541990qEH LLILZIL;
    public SparkContext LLILZLL;
    public SparkContext LLIZ;
    public final ConcurrentLinkedQueue<WeakReference<SparkContext>> LLIZLLLIL;
    public final ConcurrentLinkedQueue<WeakReference<InterfaceC1541990qEH>> LLJ;
    public InterfaceC1531560pxS LLJI;
    public InterfaceC1531560pxS LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public AbstractC1542100qES LLJILLL;
    public InterfaceC1538950q9N LLJJ;
    public AbstractC1542200qEc LLJJI;
    public InterfaceC1163110gNB LLJJIII;
    public InterfaceC1542220qEe LLJJIJI;
    public View LLJJIJIIJIL;
    public InterfaceC1542250qEh LLJJIJIL;
    public SparkSchemaParam LLJJJ;
    public Integer LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public final FrameLayout LLJJJJLIIL;
    public final TextView LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public final FrameLayout LLJL;
    public InterfaceC1016420cYa LLJLIL;
    public EnumC1538460q8a LLJLILLLLZIIL;
    public long LLJLL;
    public boolean LLJLLIL;
    public long LLJLLL;
    public long LLJZ;
    public String LLJZIJLIL;
    public int LLL;
    public final List<WebKitView> LLLF;
    public final boolean LLLFF;
    public final boolean LLLFFI;
    public final boolean LLLFZ;
    public final boolean LLLI;
    public final boolean LLLII;
    public final String LLLIIII;
    public ViewTreeObserver LLLIIIIL;
    public boolean LLLIIIL;
    public final ViewTreeObserverOnPreDrawListenerC1554400qYI LLLIIL;
    public final C1541970qEF LLLIILIL;
    public InterfaceC1546060qKq LLLIL;
    public volatile AtomicInteger LLLILZ;
    public boolean forceDowngradeWebView;

    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 60);
    }

    @Override // X.InterfaceC1540940qCa
    public final void LJI() {
    }

    @Override // X.InterfaceC1540940qCa
    public final View LJII() {
        return this;
    }

    public final C1542390qEv getSparkDeployDebugInfo$spark_release() {
        return null;
    }

    @Override // X.InterfaceC1540940qCa
    public final void release() {
        LJJIFFI(true);
    }

    public final void setSparkDeployDebugInfo$spark_release(C1542390qEv c1542390qEv) {
    }

    static {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("reduce_reload_global_props_update");
            c098200Yq = config != null ? Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable")) : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        LLLILZJ = bool != null ? bool.booleanValue() : true;
        try {
            JSONObject config2 = HybridSettings.INSTANCE.getConfig("fix_fallback_url_bug");
            c098200Yq2 = config2 != null ? Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config2, "enable")) : null;
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Boolean bool2 = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
        LLLILZLLLI = bool2 != null ? bool2.booleanValue() : true;
    }

    @Override // X.InterfaceC1105930esx
    public final boolean LIZIZ() {
        return this.LLJLILLLLZIIL == EnumC1538460q8a.SUCCESS;
    }

    @Override // X.InterfaceC1540940qCa
    public final void LIZJ() {
        this.LLLILZ = new AtomicInteger(1);
    }

    @Override // X.InterfaceC1540940qCa
    public final void LIZLLL() {
        int i;
        boolean z;
        AtomicInteger atomicInteger = this.LLLILZ;
        if (atomicInteger == null) {
            C086F c086f = C086F.LIZ;
            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(this, 147);
            c086f.getClass();
            C086F.LJII(aRunnableS112S0100000_12);
            return;
        }
        do {
            i = atomicInteger.get();
            z = i >= 2;
        } while (!atomicInteger.compareAndSet(i, 0));
        this.LLLILZ = null;
        if (z) {
            return;
        }
        C086F c086f2 = C086F.LIZ;
        ARunnableS112S0100000_12 aRunnableS112S0100000_122 = new ARunnableS112S0100000_12(this, 146);
        c086f2.getClass();
        C086F.LJII(aRunnableS112S0100000_122);
    }

    @Override // X.InterfaceC1540940qCa
    public final boolean LJFF() {
        AtomicInteger atomicInteger = this.LLLILZ;
        return atomicInteger != null && atomicInteger.compareAndSet(1, 3);
    }

    @Override // X.InterfaceC1540940qCa
    public final void LJIIIIZZ() {
        Object obj;
        Method method;
        InterfaceC1531560pxS interfaceC1531560pxS;
        try {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            String url = getUrl();
            if (url == null) {
                SparkContext sparkContext = this.LLILZLL;
                url = String.valueOf((sparkContext == null || (interfaceC1531560pxS = sparkContext.hybridParams) == null) ? null : interfaceC1531560pxS.LIZ());
            }
            c1537900q7g.getClass();
            try {
                if (C1541950qED.LJIIJJI != null && (obj = C1541950qED.LJIIL) != null && (method = C1541950qED.LJIILJJIL) != null) {
                    C2204961BRm.a0(method, obj, new Object[]{url}, new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHFVSiC1k=", null));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            String message = th2.getMessage();
            if (message != null) {
                C1530030puz.LIZ("SparkView", message, this.LLILZLL);
            }
        }
        C1530030puz.LIZIZ("SparkView", "loadUrl", this.LLILZLL);
        LJJJJI(this, null, null, 3);
        this.LLJLILLLLZIIL = EnumC1538460q8a.LOADING;
        LJJIIZ();
        SparkContext originalSparkContext = getOriginalSparkContext();
        AbstractC1542100qES abstractC1542100qES = originalSparkContext != null ? (AbstractC1542100qES) originalSparkContext.LJFF(AbstractC1542100qES.class) : null;
        SparkContext originalSparkContext2 = getOriginalSparkContext();
        AbstractC1542200qEc abstractC1542200qEc = originalSparkContext2 != null ? (AbstractC1542200qEc) originalSparkContext2.LJFF(AbstractC1542200qEc.class) : null;
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLLI(this.LLILZLL);
        }
        if (abstractC1542200qEc != null) {
            do {
                abstractC1542200qEc.LJLLI(this.LLILZLL);
                abstractC1542200qEc = abstractC1542200qEc.LL;
            } while (abstractC1542200qEc != null);
        }
        SparkContext sparkContext2 = getSparkContext();
        AbstractC1542100qES abstractC1542100qES2 = sparkContext2 != null ? (AbstractC1542100qES) sparkContext2.LJFF(AbstractC1542100qES.class) : null;
        SparkContext sparkContext3 = getSparkContext();
        AbstractC1542200qEc abstractC1542200qEc2 = sparkContext3 != null ? (AbstractC1542200qEc) sparkContext3.LJFF(AbstractC1542200qEc.class) : null;
        if (abstractC1542100qES2 != null) {
            abstractC1542100qES2.LJLLI(this.LLILZLL);
        }
        if (abstractC1542200qEc2 != null) {
            do {
                abstractC1542200qEc2.LJLLI(this.LLILZLL);
                abstractC1542200qEc2 = abstractC1542200qEc2.LL;
            } while (abstractC1542200qEc2 != null);
        }
        final SparkContext sparkContext4 = this.LLILZLL;
        if (sparkContext4 != null) {
            C1524260plg c1524260plg = (C1524260plg) sparkContext4.LJFF(C1524260plg.class);
            if (c1524260plg != null) {
                c1524260plg.release();
            }
            sparkContext4.LJJ(C1524260plg.class, new C1524260plg(new WeakReference(sparkContext4)));
            C1075770e6J c1075770e6J = (C1075770e6J) sparkContext4.LJFF(C1075770e6J.class);
            if (c1075770e6J != null) {
                c1075770e6J.LJIIIIZZ(new InterfaceC1522340pia() { // from class: X.0pio
                    @Override // X.InterfaceC1522340pia
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1522340pia
                    public final void LIZIZ(C1522330piZ c1522330piZ) {
                        C1524260plg c1524260plg2;
                        String str = c1522330piZ.LIZ;
                        if (str != null && (c1524260plg2 = (C1524260plg) sparkContext4.LJFF(C1524260plg.class)) != null) {
                            c1524260plg2.LLILLJJLI.add(str);
                            c1524260plg2.LLILLL.incrementAndGet();
                        }
                    }

                    @Override // X.InterfaceC1522340pia
                    public final void LIZJ(C1522330piZ c1522330piZ) {
                        C1524260plg c1524260plg2;
                        String str = c1522330piZ.LIZ;
                        if (str == null || (c1524260plg2 = (C1524260plg) sparkContext4.LJFF(C1524260plg.class)) == null) {
                            return;
                        }
                        String str2 = c1522330piZ.LIZJ;
                        if (str2 != null && a0.LJJIIZI(str2, "[MetaBridge]", false)) {
                            c1524260plg2.LLILZ.incrementAndGet();
                        }
                        Integer num = c1522330piZ.LIZIZ;
                        if (num != null && num.intValue() == -1) {
                            return;
                        }
                        c1524260plg2.LLILLJJLI.add(str);
                        c1524260plg2.LLILLL.incrementAndGet();
                    }
                });
            }
        }
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.load();
        }
        if (this.LLILZIL != null) {
            SparkContext sparkContext5 = this.LLILZLL;
            if (sparkContext5 != null) {
                sparkContext5.LJIJI();
            }
            LJJIZ("start", null);
        }
    }

    @Override // X.InterfaceC1540940qCa
    public final void LJIIJJI() {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.onHide();
        }
    }

    @Override // X.InterfaceC1540940qCa
    public final void LJIIL() {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.onShow();
        }
    }

    public final AbsSparkPageSchemaParam LJIILL() {
        SparkSchemaParam sparkSchemaParamLJJJI;
        AbsSparkPageSchemaParam absSparkPageSchemaParam;
        SparkSchemaParam sparkSchemaParam = this.LLJJJ;
        if ((sparkSchemaParam instanceof AbsSparkPageSchemaParam) && (absSparkPageSchemaParam = (AbsSparkPageSchemaParam) sparkSchemaParam) != null) {
            return absSparkPageSchemaParam;
        }
        SparkContext sparkContext = this.LLILZLL;
        if (sparkContext != null) {
            C1529880puk c1529880puk = SparkContext.Companion;
            sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
        } else {
            sparkSchemaParamLJJJI = null;
        }
        if (sparkSchemaParamLJJJI instanceof AbsSparkPageSchemaParam) {
            return (AbsSparkPageSchemaParam) sparkSchemaParamLJJJI;
        }
        return null;
    }

    public final boolean LJIILLIIL() {
        C1530030puz.LIZIZ("SparkView", "============canGoBack============", this.LLILZLL);
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        WebKitView webKitView = interfaceC1541990qEH instanceof WebKitView ? (WebKitView) interfaceC1541990qEH : null;
        if (webKitView == null) {
            return false;
        }
        if (webKitView.canGoBack()) {
            C1530030puz.LIZIZ("SparkView", "current view canGoback", webKitView.getHybridContext());
            return true;
        }
        if (this.LLL <= 0) {
            return false;
        }
        C1530030puz.LIZIZ("SparkView", "current view canGoback", webKitView.getHybridContext());
        return true;
    }

    public final boolean LJIIZILJ() {
        C1530030puz.LIZIZ("SparkView", "============canGoForward============", this.LLILZLL);
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        WebKitView webKitView = interfaceC1541990qEH instanceof WebKitView ? (WebKitView) interfaceC1541990qEH : null;
        if (webKitView == null) {
            return false;
        }
        if (webKitView.canGoForward()) {
            C1530030puz.LIZIZ("SparkView", "current view canGoForward", webKitView.getHybridContext());
            return true;
        }
        if (this.LLL >= ((ArrayList) this.LLLF).size() - 1) {
            return false;
        }
        C1530030puz.LIZIZ("SparkView", "current view canGoForward", webKitView.getHybridContext());
        return true;
    }

    public final void LJIJI() {
        InterfaceC1542320qEo interfaceC1542320qEo;
        WebKitView webKitView;
        String currentSubTitle;
        WebView webView;
        SparkContext sparkContext = this.LLILZLL;
        String title = null;
        if (sparkContext != null) {
            interfaceC1542320qEo = (InterfaceC1542320qEo) sparkContext.LJFF(InterfaceC1542320qEo.class);
            if (interfaceC1542320qEo != null) {
                Object obj = this.LLILZIL;
                if ((obj instanceof WebKitView) && (webView = (WebView) obj) != null) {
                    title = webView.getTitle();
                }
                interfaceC1542320qEo.LIZIZ(title);
            }
        } else {
            interfaceC1542320qEo = null;
        }
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        if (!(interfaceC1541990qEH instanceof WebKitView) || (webKitView = (WebKitView) interfaceC1541990qEH) == null || (currentSubTitle = webKitView.getCurrentSubTitle()) == null || interfaceC1542320qEo == null) {
            return;
        }
        interfaceC1542320qEo.LIZJ(currentSubTitle, true);
    }

    public final boolean LJIJJ() {
        int i;
        AtomicInteger atomicInteger = this.LLLILZ;
        if (atomicInteger != null) {
            do {
                i = atomicInteger.get();
                if (i <= 1) {
                    if (i == 1) {
                        return false;
                    }
                    this.LLLILZ = null;
                }
            } while (!atomicInteger.compareAndSet(i, 1));
            setOptimization(4);
            SparkContext sparkContext = this.LLILZLL;
            if (sparkContext != null) {
                sparkContext.LIZJ("reuse");
            }
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            C1541030qCj.LIZIZ(this, C1161970gLL.LIZIZ().LIZJ());
            return false;
        }
        return true;
    }

    public final boolean LJJIII() {
        C1530030puz.LIZIZ("SparkView", "============goBack============", this.LLILZLL);
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        WebKitView webKitView = interfaceC1541990qEH instanceof WebKitView ? (WebKitView) interfaceC1541990qEH : null;
        if (webKitView == null) {
            return false;
        }
        if (webKitView.canGoBack()) {
            webKitView.goBack();
            C1530030puz.LIZIZ("SparkView", "current view goback", webKitView.getHybridContext());
            return true;
        }
        int i = this.LLL;
        if (i <= 0) {
            return false;
        }
        WebKitView webKitView2 = (WebKitView) ListProtector.get(this.LLLF, i);
        int i2 = this.LLL - 1;
        this.LLL = i2;
        WebKitView webKitView3 = (WebKitView) ListProtector.get(this.LLLF, i2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try change tab from ");
        sbLIZ.append(webKitView2.getHybridContext().containerId);
        sbLIZ.append(" to ");
        sbLIZ.append(webKitView3.getHybridContext().containerId);
        C1530030puz.LIZIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ), this.LLILZLL);
        LJIJ(this.LLL);
        LJIJI();
        return true;
    }

    public final boolean LJJIIZ() {
        if (Intrinsics.LJFF(C1535630q41.LIZIZ("fix_spark_saf_memory_leak"), Boolean.TRUE)) {
            SparkContext sparkContext = this.LLILZLL;
            if ((sparkContext != null ? sparkContext.LJJIJLIJ() : null) instanceof InterfaceC1546650qLn) {
                return false;
            }
        }
        SparkContext sparkContext2 = this.LLILZLL;
        if ((sparkContext2 != null ? sparkContext2.LJJIJLIJ() : null) instanceof SparkActivity) {
            return false;
        }
        SparkContext sparkContext3 = this.LLILZLL;
        if ((sparkContext3 != null ? sparkContext3.LJJIJLIJ() : null) instanceof SparkPopup) {
            return false;
        }
        SparkContext sparkContext4 = this.LLILZLL;
        return !((sparkContext4 != null ? sparkContext4.LJJIJLIJ() : null) instanceof SparkFragment);
    }

    public final Pair<Boolean, String> getBackUrl() {
        WebKitView webKitView;
        C1530030puz.LIZIZ("SparkView", "============getBackUrl============", this.LLILZLL);
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        if (!(interfaceC1541990qEH instanceof WebKitView) || (webKitView = (WebKitView) interfaceC1541990qEH) == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (webKitView.canGoBack()) {
            C1530030puz.LIZIZ("SparkView", "current view canGoback", webKitView.getHybridContext());
            Boolean bool = Boolean.FALSE;
            WebHistoryItem itemAtIndex = webKitView.copyBackForwardList().getItemAtIndex(webKitView.copyBackForwardList().getCurrentIndex() - 1);
            return new Pair<>(bool, itemAtIndex != null ? itemAtIndex.getUrl() : null);
        }
        if (this.LLL <= 0) {
            return new Pair<>(Boolean.FALSE, null);
        }
        C1530030puz.LIZIZ("SparkView", "current view canGoback", webKitView.getHybridContext());
        return new Pair<>(Boolean.TRUE, ((WebView) ListProtector.get(this.LLLF, this.LLL - 1)).getUrl());
    }

    public final int getCurrentPageCount() {
        int i = this.LLL;
        if (i < 0 || i >= ((ArrayList) this.LLLF).size()) {
            return 0;
        }
        return ((WebView) ListProtector.get(this.LLLF, this.LLL)).copyBackForwardList().getSize();
    }

    public final int getCurrentPageOrder() {
        int i = this.LLL;
        if (i < 0 || i >= ((ArrayList) this.LLLF).size()) {
            return 0;
        }
        return ((WebView) ListProtector.get(this.LLLF, this.LLL)).copyBackForwardList().getCurrentIndex();
    }

    public final TextView getDebugInfoTagFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fgm);
            this.LLILZ = (TextView) callbackFindViewById;
        }
        return (TextView) callbackFindViewById;
    }

    public final Pair<Boolean, String> getForwardUrl() {
        WebKitView webKitView;
        C1530030puz.LIZIZ("SparkView", "============getForwardUrl============", this.LLILZLL);
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        if (!(interfaceC1541990qEH instanceof WebKitView) || (webKitView = (WebKitView) interfaceC1541990qEH) == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (webKitView.canGoForward()) {
            C1530030puz.LIZIZ("SparkView", "current view canGoForward", webKitView.getHybridContext());
            Boolean bool = Boolean.FALSE;
            WebHistoryItem itemAtIndex = webKitView.copyBackForwardList().getItemAtIndex(webKitView.copyBackForwardList().getCurrentIndex() + 1);
            return new Pair<>(bool, itemAtIndex != null ? itemAtIndex.getUrl() : null);
        }
        if (this.LLL >= ((ArrayList) this.LLLF).size() - 1) {
            return new Pair<>(Boolean.FALSE, null);
        }
        C1530030puz.LIZIZ("SparkView", "current view canGoForward", webKitView.getHybridContext());
        return new Pair<>(Boolean.TRUE, ((WebView) ListProtector.get(this.LLLF, this.LLL + 1)).getUrl());
    }

    public final EnumC1067640dtC getHybridKitType() {
        EnumC1067640dtC engineType;
        SparkSchemaParam sparkSchemaParam = this.LLJJJ;
        if (sparkSchemaParam == null || (engineType = sparkSchemaParam.getEngineType()) == null) {
            engineType = EnumC1067640dtC.UNKNOWN;
        }
        if (!this.forceDowngradeWebView) {
            return engineType;
        }
        SparkContext sparkContext = this.LLILZLL;
        if (sparkContext != null) {
            sparkContext.LJIIIZ().LIZJ("spark_is_fallback", Boolean.TRUE);
        }
        return EnumC1067640dtC.WEB;
    }

    public final InterfaceC1542220qEe getLoadingProvider() {
        InterfaceC1542220qEe interfaceC1542220qEe;
        SparkContext sparkContext = this.LLILZLL;
        if (sparkContext != null && (interfaceC1542220qEe = (InterfaceC1542220qEe) sparkContext.LJFF(InterfaceC1542220qEe.class)) != null) {
            return interfaceC1542220qEe;
        }
        InterfaceC1542060qEO interfaceC1542060qEO = C1546010qKl.LIZ;
        if (interfaceC1542060qEO != null) {
            return interfaceC1542060qEO.LJIIIIZZ();
        }
        return null;
    }

    public final InterfaceC1163110gNB getStatusViewProvider() {
        InterfaceC1163110gNB interfaceC1163110gNB;
        SparkContext sparkContext = this.LLILZLL;
        if (sparkContext != null && (interfaceC1163110gNB = (InterfaceC1163110gNB) sparkContext.LJFF(InterfaceC1163110gNB.class)) != null) {
            return interfaceC1163110gNB;
        }
        InterfaceC1542060qEO interfaceC1542060qEO = C1546010qKl.LIZ;
        if (interfaceC1542060qEO != null) {
            return interfaceC1542060qEO.LJI();
        }
        return null;
    }

    public final String getUrl() {
        SparkContext sparkContext = this.LLILZLL;
        if (sparkContext != null) {
            return sparkContext.LJIJI();
        }
        return null;
    }

    public final int getWebHistorySize() {
        return ((ArrayList) this.LLLF).size();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() throws JSONException {
        if (this.LLLIIIL) {
            C1537570q79.LIZ().unregisterOnSharedPreferenceChangeListener(this);
            this.LLLIIIL = false;
        }
        C1541970qEF c1541970qEF = this.LLLIILIL;
        if (c1541970qEF.LJI) {
            c1541970qEF.LJI = false;
            C14K9.LJIJJ(c1541970qEF.LIZ, null);
        }
        if (c1541970qEF.LJFF) {
            c1541970qEF.LJFF = false;
            c1541970qEF.LIZ.removeOnLayoutChangeListener(c1541970qEF.LJIIJ);
            View view = c1541970qEF.LJIIIIZZ;
            if (view != null) {
                view.removeOnLayoutChangeListener(c1541970qEF.LJIIJ);
            }
            c1541970qEF.LJIIIIZZ = null;
        }
        ViewTreeObserver viewTreeObserver = this.LLLIIIIL;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            ViewTreeObserverOnPreDrawListenerC1554400qYI viewTreeObserverOnPreDrawListenerC1554400qYI = this.LLLIIL;
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1554400qYI);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1554400qYI, ViewTreeObserver.OnPreDrawListener.class);
        }
        this.LLLIIIIL = null;
        View view2 = this.LLJJIJIIJIL;
        if (view2 != null) {
            C786410Ut5.LJJLIIIIJ(view2, this);
        }
        super.onDetachedFromWindow();
        if (this.LLJLLIL) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJLL;
        int i = C1539220q9o.LIZJ[this.LLJLILLLLZIIL.ordinal()];
        String str = i != 1 ? i != 2 ? "cancel" : "failure" : "success";
        SparkContext sparkContext = this.LLILZLL;
        String str2 = sparkContext != null ? sparkContext.containerId : null;
        C1520360pfO c1520360pfO = new C1520360pfO("hybrid_monitor_container_exit");
        c1520360pfO.LIZIZ = sparkContext != null ? sparkContext.bid : null;
        c1520360pfO.LIZ = this.LLJZIJLIL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c1520360pfO.LIZLLL = jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("stay_duration", jCurrentTimeMillis);
        c1520360pfO.LJ = jSONObject2;
        C1520080pew.LIZ(str2, c1520360pfO.LIZ());
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() throws JSONException {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        if (!(interfaceC1541990qEH instanceof WebKitView)) {
            LJIIIIZZ();
            return;
        }
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.reload();
        }
        if (this.LLILZIL != null) {
            SparkContext sparkContext = this.LLILZLL;
            if (sparkContext != null) {
                sparkContext.LJIJI();
            }
            LJJIZ("start", null);
        }
    }

    @Override // X.InterfaceC1540940qCa
    public Context getHybridViewContext() {
        return getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LIZ && !this.LLLIIIL) {
            C1537570q79.LIZ().registerOnSharedPreferenceChangeListener(this);
            this.LLLIIIL = true;
        }
        C1541970qEF c1541970qEF = this.LLLIILIL;
        if (!c1541970qEF.LJFF && C1541970qEF.LJII()) {
            if (!c1541970qEF.LJI) {
                c1541970qEF.LJI = true;
                C14K9.LJIJJ(c1541970qEF.LIZ, c1541970qEF.LJIIIZ);
                C20097313kJ.LIZJ(c1541970qEF.LIZ);
            }
            c1541970qEF.LJFF = true;
            c1541970qEF.LIZ.addOnLayoutChangeListener(c1541970qEF.LJIIJ);
            View viewLIZJ = c1541970qEF.LIZJ();
            c1541970qEF.LJIIIIZZ = viewLIZJ;
            if (viewLIZJ != null) {
                viewLIZJ.addOnLayoutChangeListener(c1541970qEF.LJIIJ);
            }
        }
        c1541970qEF.LIZ();
        if (this.LLLII && this.LLLIIIIL == null) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            this.LLLIIIIL = viewTreeObserver;
            C786410Ut5.y3(viewTreeObserver, this.LLLIIL);
        }
    }

    @Override // X.InterfaceC1540940qCa
    public final EnumC1538460q8a LJ() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC1540940qCa
    public final boolean LJIIJ() {
        return this.LLJLLIL;
    }

    @Override // X.InterfaceC1540940qCa
    public final C1537480q70 LJIILJJIL() {
        return this.LLILZLL;
    }

    public final int getCurrentWebIndex() {
        return this.LLL;
    }

    public boolean getKeepAlive() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1540940qCa
    public InterfaceC1541990qEH getKitView() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1540940qCa
    public int getOptimization() {
        return this.LLILLJJLI;
    }

    public final SparkContext getOriginalSparkContext() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1540940qCa
    public C1537480q70 getPerformanceViewHybridContext() {
        return this.LLILZLL;
    }

    public final SparkContext getSparkContext() {
        return this.LLILZLL;
    }

    public final InterfaceC1546060qKq getSparkDeployPage$spark_release() {
        return this.LLLIL;
    }

    public final SparkSchemaParam getSparkSchemaParam() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1540940qCa
    public long getViewCreatedTime() {
        return this.LL;
    }

    public final InterfaceC1541990qEH getViewDelegate$spark_release() {
        return this.LLILZIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIL(X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB r3) {
        /*
            boolean r0 = r3.LJIJJ()
            if (r0 == 0) goto L3e
            X.0qBS r2 = X.C1540240qBS.LIZ
            com.bytedance.hybrid.spark.SparkContext r1 = r3.LLILZLL
            com.bytedance.lynx.spark.schema.model.SparkSchemaParam r0 = r3.LLJJJ
            r2.getClass()
            java.lang.String r2 = X.C1540240qBS.LIZLLL(r1, r0)
            if (r2 == 0) goto L34
            android.content.Context r0 = r3.getContext()
            boolean r0 = r0 instanceof android.content.MutableContextWrapper
            if (r0 == 0) goto L34
            com.bytedance.hybrid.spark.SparkContext r0 = r3.LLILZLL
            if (r0 == 0) goto L27
            java.lang.String r1 = r0.LJIJI()
            if (r1 != 0) goto L29
        L27:
            java.lang.String r1 = ""
        L29:
            X.0qLY r0 = X.C1546560qLe.LIZ
            r0.getClass()
            boolean r0 = X.C1546500qLY.LIZ(r1, r2, r3)
            if (r0 != 0) goto L3f
        L34:
            boolean r0 = r3.getKeepAlive()
            if (r0 != 0) goto L3f
            r0 = 1
            r3.LJJIFFI(r0)
        L3e:
            return
        L3f:
            android.view.ViewParent r1 = r3.getParent()
            if (r1 == 0) goto L4e
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L4e
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.C786410Ut5.LJJJLZIJ(r3, r1)
        L4e:
            org.json.JSONArray r0 = X.C1533710q0v.LIZ
            com.bytedance.hybrid.spark.SparkContext r0 = r3.LLILZLL
            X.C1533710q0v.LIZ(r0)
            com.bytedance.hybrid.spark.SparkContext r1 = r3.LLILZLL
            if (r1 == 0) goto L5e
            java.lang.String r0 = "reuse"
            r1.LIZJ(r0)
        L5e:
            com.bytedance.hybrid.spark.SparkContext r2 = r3.LLILZLL
            java.lang.String r1 = "SparkView"
            java.lang.String r0 = "SparkView need reuse, add it to cache pool"
            X.C1530030puz.LIZIZ(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(X.0qEB):void");
    }

    private final void set_sparkContext(SparkContext sparkContext) {
        this.LLILZLL = sparkContext;
        C19719612Di.LJJIII(this.LLIZLLLIL, new AwS591S0100000_12(sparkContext, 582), true);
        if (sparkContext != null) {
            this.LLIZLLLIL.add(new WeakReference<>(sparkContext));
        }
    }

    @Override // X.InterfaceC1540940qCa
    public final void LJIILIIL(C1537480q70 c1537480q70) {
        SparkSchemaParam sparkSchemaParamLJJJI;
        SparkContext sparkContext = this.LLILZLL;
        SparkContext sparkContext2 = null;
        if (sparkContext != null) {
            C1529880puk c1529880puk = SparkContext.Companion;
            sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
        } else {
            sparkSchemaParamLJJJI = null;
        }
        if (c1537480q70 instanceof SparkContext) {
            sparkContext2 = (SparkContext) c1537480q70;
        }
        LJJIJIIJIL(sparkContext2, sparkSchemaParamLJJJI);
    }

    public final void LJIJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchWebViewTab targetIndex ");
        sbLIZ.append(i);
        C1530030puz.LIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ), this.LLILZLL);
        if (i >= 0 && i < ((ArrayList) this.LLLF).size()) {
            int i2 = 0;
            for (Object obj : (ArrayList) this.LLLF) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    WebKitView webKitView = (WebKitView) obj;
                    if ((webKitView instanceof WebKitView) && webKitView != null) {
                        if (i2 == i) {
                            int visibility = webKitView.getVisibility();
                            webKitView.setVisibility(0);
                            C1602160rnK.LIZIZ(visibility, 0, webKitView);
                            webKitView.requestFocus();
                            setKitViewDelegate(webKitView);
                            LJJIJIL(EnumC1067640dtC.WEB);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Showing WebView at index ");
                            sbLIZ2.append(i2);
                            C1530030puz.LIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ2), this.LLILZLL);
                        } else {
                            int visibility2 = webKitView.getVisibility();
                            webKitView.setVisibility(4);
                            C1602160rnK.LIZIZ(visibility2, 4, webKitView);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Hiding WebView at index ");
                            sbLIZ3.append(i2);
                            C1530030puz.LIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ3), this.LLILZLL);
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("switchWebViewTab failed: Invalid index ");
        sbLIZ4.append(i);
        C1530030puz.LIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ4), this.LLILZLL);
    }

    public final boolean LJJ(boolean z) {
        boolean zLIZ;
        String strLJIJI;
        ViewParent parent;
        ViewGroup viewGroup;
        SparkContext sparkContext;
        ViewGroup viewGroup2;
        C1524260plg c1524260plg;
        SparkContext sparkContext2 = this.LLILZLL;
        if (sparkContext2 != null && (c1524260plg = (C1524260plg) sparkContext2.LJFF(C1524260plg.class)) != null) {
            c1524260plg.release();
        }
        SparkContext sparkContext3 = this.LLILZLL;
        if (sparkContext3 != null) {
            sparkContext3.LJJIII(C1524260plg.class);
        }
        if (!LJIJJ()) {
            return false;
        }
        if (getKeepAlive()) {
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            C1541030qCj.LIZIZ(this, C1161970gLL.LIZIZ().LIZJ());
            setOptimization(4);
            SparkContext sparkContext4 = this.LLILZLL;
            if (sparkContext4 != null) {
                sparkContext4.useReuse = true;
            }
            zLIZ = true;
        } else {
            C1540240qBS c1540240qBS = C1540240qBS.LIZ;
            SparkContext sparkContext5 = this.LLILZLL;
            SparkSchemaParam sparkSchemaParam = this.LLJJJ;
            c1540240qBS.getClass();
            String strLIZLLL = C1540240qBS.LIZLLL(sparkContext5, sparkSchemaParam);
            if (strLIZLLL != null && (getContext() instanceof MutableContextWrapper)) {
                SparkContext sparkContext6 = this.LLILZLL;
                if (sparkContext6 == null || (strLJIJI = sparkContext6.LJIJI()) == null) {
                    strLJIJI = "";
                }
                C1546560qLe.LIZ.getClass();
                zLIZ = C1546500qLY.LIZ(strLJIJI, strLIZLLL, this);
            } else {
                zLIZ = false;
            }
        }
        if (zLIZ) {
            if (Intrinsics.LJFF(C1535630q41.LIZIZ("fix_spark_saf_memory_leak"), Boolean.TRUE)) {
                ViewParent parent2 = getParent();
                if (parent2 != null && (parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                    viewGroup2.endViewTransition(this);
                    C786410Ut5.LJJJLZIJ(this, viewGroup2);
                }
                ViewTreeLifecycleOwner.set(this, null);
                ViewTreeViewModelStoreOwner.set(this, null);
                setTag(R.id.view_tree_saved_state_registry_owner, null);
                setTag(R.id.ij1, null);
                setTag(R.id.en4, null);
                SparkContext sparkContext7 = this.LLILZLL;
                if (sparkContext7 != null) {
                    sparkContext7.LJJJJJ(null);
                }
            } else {
                ViewParent parent3 = getParent();
                if (parent3 != null && (parent3 instanceof ViewGroup)) {
                    C786410Ut5.LJJJLZIJ(this, (ViewGroup) parent3);
                }
                if (this.LLLFZ && (sparkContext = this.LLILZLL) != null) {
                    sparkContext.LJJJJJ(null);
                }
            }
            JSONArray jSONArray = C1533710q0v.LIZ;
            C1533710q0v.LIZ(this.LLILZLL);
            C1530030puz.LIZIZ("SparkView", "SparkView need reuse, add it to cache pool", this.LLILZLL);
            return false;
        }
        if (Intrinsics.LJFF(C1535630q41.LIZIZ("fix_spark_saf_memory_leak"), Boolean.TRUE) && (parent = getParent()) != null && (parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.endViewTransition(this);
            C786410Ut5.LJJJLZIJ(this, viewGroup);
        }
        LJJIFFI(z);
        return true;
    }

    public final void LJJIFFI(boolean z) {
        String str;
        String str2;
        if (this.LLJLLIL || !LJIJJ()) {
            return;
        }
        if (C1535880q4Q.LJI) {
            Iterator<WeakReference<SparkContext>> it2 = this.LLIZLLLIL.iterator();
            while (it2.hasNext()) {
                SparkContext sparkContext = it2.next().get();
                if (sparkContext != null) {
                    sparkContext.lifecycleOwner = null;
                    String str3 = sparkContext.containerId;
                    C1537480q70.Companion.getClass();
                    C1529830puf.LIZLLL(str3);
                    String strLIZ = C1529860pui.LIZ(str3);
                    if (strLIZ != null) {
                        C1529830puf.LIZLLL(strLIZ);
                    }
                }
            }
            SparkContext sparkContext2 = this.LLIZ;
            if (sparkContext2 != null && (str2 = sparkContext2.containerId) != null) {
                Map<String, String> map = C1529860pui.LIZ;
                map.remove(str2);
                C1537480q70.Companion.getClass();
                map.remove(C1529830puf.LIZ(str2));
            }
        } else {
            SparkContext sparkContext3 = this.LLILZLL;
            if (sparkContext3 != null) {
                sparkContext3.lifecycleOwner = null;
                String str4 = sparkContext3.containerId;
                if (str4 != null) {
                    C1537480q70.Companion.getClass();
                    C1529830puf.LIZLLL(str4);
                    String strLIZ2 = C1529860pui.LIZ(str4);
                    if (strLIZ2 != null) {
                        C1529830puf.LIZLLL(strLIZ2);
                    }
                }
            }
            SparkContext sparkContext4 = this.LLIZ;
            if (sparkContext4 != null && (str = sparkContext4.containerId) != null) {
                C1514810pWR c1514810pWRLJIIIZ = sparkContext4.LJIIIZ();
                if (c1514810pWRLJIIIZ != null) {
                    c1514810pWRLJIIIZ.LIZ();
                }
                Map<String, String> map2 = C1529860pui.LIZ;
                map2.remove(str);
                C1537480q70.Companion.getClass();
                map2.remove(C1529830puf.LIZ(str));
            }
        }
        boolean zLJFF = Intrinsics.LJFF(C1535630q41.LIZIZ("fix_spark_webkit_double_destroy"), Boolean.TRUE);
        if (C1535880q4Q.LJII) {
            Iterator<WeakReference<InterfaceC1541990qEH>> it3 = this.LLJ.iterator();
            while (it3.hasNext()) {
                InterfaceC1541990qEH interfaceC1541990qEH = it3.next().get();
                if (interfaceC1541990qEH != null && interfaceC1541990qEH != this.LLILZIL && !C13LP.LJJJJ(interfaceC1541990qEH, this.LLLF)) {
                    try {
                        interfaceC1541990qEH.LLD(z);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
        }
        InterfaceC1541990qEH interfaceC1541990qEH2 = this.LLILZIL;
        if (interfaceC1541990qEH2 != null) {
            interfaceC1541990qEH2.LLD(z);
        }
        for (WebKitView webKitView : (ArrayList) this.LLLF) {
            if (!zLJFF || webKitView != this.LLILZIL) {
                webKitView.LLD(z);
            }
        }
        ((ArrayList) this.LLLF).clear();
        if (this.LLLIIIL) {
            C1537570q79.LIZ().unregisterOnSharedPreferenceChangeListener(this);
            this.LLLIIIL = false;
        }
        setKitViewDelegate(null);
        set_sparkContext(null);
        this.LLIZ = null;
        this.LLIZLLLIL.clear();
        this.LLJ.clear();
        this.LLJLLIL = true;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final C1537510q73 LJJII(SparkContext sparkContext) {
        boolean z;
        String strLIZLLL;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        SparkPopup sparkPopup;
        int iLJFF;
        int iLJ;
        String debugGlobalProps;
        C1537510q73 c1537510q73 = sparkContext.extraRuntimeInfo;
        if (!LJJIIZ() && !(sparkContext.LJJIJLIJ() instanceof SparkFragment)) {
            this.LLJJJ = sparkContext.LJJJI(-1);
        } else {
            this.LLJJJ = sparkContext.LJJJI(3);
        }
        C1545480qJu c1545480qJu = C1545480qJu.LIZ;
        String str = sparkContext.containerId;
        c1545480qJu.getClass();
        Map<String, String> mapLIZJ = C08RQ.LIZJ(str);
        if (this.LLJJJ != null) {
            c1537510q73.put((Object) "queryItems", (Object) mapLIZJ);
            if (mapLIZJ.containsKey("ab_params")) {
                c1537510q73.put((Object) "abParams", (Object) String.valueOf(mapLIZJ.get("ab_params")));
            }
        }
        double dLIZ = C445490HdT.LIZ(getContext());
        Activity activityLIZLLL = C1537820q7Y.LIZLLL();
        JSONObject jSONObject = HybridSettings.INSTANCE.get("safe_area_height_double");
        int i = 0;
        if (jSONObject != null && !jSONObject.optBoolean("enable", true)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            c1537510q73.put((Object) "statusBarHeight", (Object) Double.valueOf(dLIZ));
            c1537510q73.put((Object) "status_bar_height", (Object) Double.valueOf(dLIZ));
            if (activityLIZLLL != null) {
                c1537510q73.put((Object) "safeAreaHeight", (Object) Double.valueOf(C445490HdT.LIZIZ(activityLIZLLL, Double.valueOf(dLIZ))));
            }
        } else {
            int iLIZ = C814420VxA.LIZ(dLIZ);
            c1537510q73.put((Object) "statusBarHeight", (Object) Integer.valueOf(iLIZ));
            c1537510q73.put((Object) "status_bar_height", (Object) Double.valueOf(dLIZ));
            if (activityLIZLLL != null) {
                C1546210qL5.LIZ.getClass();
                c1537510q73.put((Object) "safeAreaHeight", (Object) Integer.valueOf(C1546210qL5.LJIILIIL(iLIZ, activityLIZLLL)));
            }
        }
        c1537510q73.put((Object) "spark_version", (Object) "1.7.2");
        String strLJJIL = sparkContext.LJJIL();
        if (strLJJIL == null) {
            strLJJIL = "";
        }
        c1537510q73.put((Object) "originUrl", (Object) strLJJIL);
        c1537510q73.putAll(sparkContext.runtimeInfo);
        C1541970qEF c1541970qEF = this.LLLIILIL;
        c1541970qEF.LIZIZ = c1541970qEF.LJI().LJ;
        InterfaceC1545990qKj interfaceC1545990qKjLIZ = C1542190qEb.LIZ();
        String debugGlobalProps2 = null;
        if (interfaceC1545990qKjLIZ != null) {
            c1541970qEF.LIZLLL();
            strLIZLLL = interfaceC1545990qKjLIZ.LIZLLL();
        } else {
            strLIZLLL = null;
        }
        c1541970qEF.LJIIJJI = strLIZLLL;
        if (c1541970qEF.LIZIZ == 2) {
            i = 1;
        }
        c1537510q73.put((Object) "orientation", (Object) Integer.valueOf(i));
        c1541970qEF.LIZ();
        SparkContext sparkContext2 = c1541970qEF.LIZ.LLILZLL;
        if (sparkContext2 != null) {
            interfaceC1059280dfiLJJIJLIJ = sparkContext2.LJJIJLIJ();
        } else {
            interfaceC1059280dfiLJJIJLIJ = null;
        }
        if (interfaceC1059280dfiLJJIJLIJ instanceof SparkPopup) {
            sparkPopup = (SparkPopup) interfaceC1059280dfiLJJIJLIJ;
        } else {
            sparkPopup = null;
        }
        int i2 = c1541970qEF.LJI().LIZJ;
        int i3 = c1541970qEF.LJI().LIZLLL;
        if (sparkPopup != null) {
            C1545970qKh c1545970qKhZR = sparkPopup.ZR();
            iLJFF = c1545970qKhZR.LJI(c1545970qKhZR.LJ());
            C1545970qKh c1545970qKhZR2 = sparkPopup.ZR();
            iLJ = c1545970qKhZR2.LJFF(c1545970qKhZR2.LIZLLL());
        } else {
            iLJFF = c1541970qEF.LJFF(i2);
            iLJ = c1541970qEF.LJ();
        }
        C1542090qER c1542090qERLJI = c1541970qEF.LJI();
        if (C1541970qEF.LJII()) {
            c1537510q73.putAll(C1545950qKf.LIZ(c1541970qEF.LIZLLL(), c1542090qERLJI.LIZ, c1542090qERLJI.LIZIZ, iLJFF, iLJ));
        }
        C1542180qEa c1542180qEa = c1541970qEF.LIZLLL;
        c1542180qEa.LIZ = i2;
        c1542180qEa.LIZIZ = i3;
        c1542180qEa.LIZJ = iLJFF;
        c1542180qEa.LIZLLL = iLJ;
        c1542180qEa.LJ = true;
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LIZ) {
            SparkSchemaParam sparkSchemaParam = this.LLJJJ;
            if (sparkSchemaParam != null) {
                debugGlobalProps = sparkSchemaParam.getDebugGlobalProps();
            } else {
                debugGlobalProps = null;
            }
            if (C1533950q1J.LJ(debugGlobalProps)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                SparkSchemaParam sparkSchemaParam2 = this.LLJJJ;
                if (sparkSchemaParam2 != null) {
                    debugGlobalProps2 = sparkSchemaParam2.getDebugGlobalProps();
                }
                for (Map.Entry entry : ((Map) C1058250de3.LIZ(debugGlobalProps2, HashMap.class)).entrySet()) {
                    linkedHashMap.put(entry.getKey().toString(), entry.getValue());
                }
                c1537510q73.putAll(linkedHashMap);
            }
        }
        return c1537510q73;
    }

    public final void LJJIIZI(Configuration configuration) {
        WebKitView webKitView;
        C1541970qEF c1541970qEF = this.LLLIILIL;
        Configuration configuration2 = null;
        if (configuration != null) {
            c1541970qEF.getClass();
            configuration2 = new Configuration(configuration);
        }
        c1541970qEF.LIZJ = configuration2;
        if (c1541970qEF.LJIIL || c1541970qEF.LJIIIIZZ()) {
            ArrayList arrayList = (ArrayList) c1541970qEF.LIZ.LLLF;
            if (arrayList.isEmpty()) {
                InterfaceC1541990qEH viewDelegate$spark_release = c1541970qEF.LIZ.getViewDelegate$spark_release();
                if ((viewDelegate$spark_release instanceof WebKitView) && (webKitView = (WebKitView) viewDelegate$spark_release) != null) {
                    c1541970qEF.LJIIIZ(webKitView);
                }
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    c1541970qEF.LJIIIZ((WebKitView) it2.next());
                }
            }
            c1541970qEF.LIZ();
        }
        int i = c1541970qEF.LJI().LJ;
        if (i != c1541970qEF.LIZIZ) {
            c1541970qEF.LIZIZ = i;
            c1541970qEF.LJIIJJI("screenOrientationChanged");
        }
        InterfaceC1545990qKj interfaceC1545990qKjLIZ = C1542190qEb.LIZ();
        if (interfaceC1545990qKjLIZ != null) {
            c1541970qEF.LIZLLL();
            String strLIZLLL = interfaceC1545990qKjLIZ.LIZLLL();
            if (strLIZLLL != null && !Intrinsics.LJFF(strLIZLLL, c1541970qEF.LJIIJJI)) {
                c1541970qEF.LJIIJJI = strLIZLLL;
                c1541970qEF.LJIIJJI("screenFoldStateChanged");
            }
        }
        c1541970qEF.LIZIZ();
    }

    public final void LJJIJ(SparkContext sparkContext) {
        if (C1535880q4Q.LJFF && sparkContext.isPrepared && this.LLILZIL != null) {
            C1530030puz.LIZ("SparkView", "DUPLICATE SPARK PREPARE, SKIPPED", sparkContext);
            return;
        }
        C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_PREPARE_INNER_START}, null);
        LJJIJIIJI(sparkContext);
        this.forceDowngradeWebView = false;
        C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.SPARK_PREPARE_INNER_END}, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v124, types: [com.bytedance.hybrid.common.autoservice.ISDUIAPI] */
    /* JADX WARN: Type inference failed for: r0v130, types: [X.0qEE] */
    /* JADX WARN: Type inference failed for: r0v131, types: [X.0qBQ] */
    /* JADX WARN: Type inference failed for: r0v77, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r1v20, types: [X.0pxS] */
    /* JADX WARN: Type inference failed for: r1v31, types: [T, X.0qDS] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r23v0, types: [X.0dSk, X.0qEB, android.view.View, android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r8v11, types: [X.0q9T] */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.0q9T] */
    /* JADX WARN: Type inference failed for: r8v9, types: [X.0q9R, X.0q9T] */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.0ddR] */
    public final void LJJIJIIJI(final SparkContext sparkContext) {
        InterfaceC1016420cYa interfaceC1016420cYa;
        long jCurrentTimeMillis;
        String url;
        String surl;
        String surl2;
        C1537910q7h c1537910q7h;
        C1537910q7h c1537910q7h2;
        ?? r1;
        C1537910q7h c1537910q7h3;
        ?? r5;
        View viewE1;
        C1541480qDS c1541480qDS;
        ?? c1541480qDS2;
        boolean z;
        InterfaceC1542060qEO interfaceC1542060qEO;
        C1546120qKw c1546120qKwLJFF;
        String url2;
        String clickTime;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        String clickTime2;
        Long l;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        int i = 1;
        if (!sparkContext.hasExecuteGlobalPreHandler) {
            sparkContext.hasExecuteGlobalPreHandler = true;
        }
        JSONArray jSONArray = C1533710q0v.LIZ;
        C1533720q0w.LJ(C1533720q0w.LIZ, C1533710q0v.LIZLLL(null, new RequestParams(null, i, false ? 1 : 0), sparkContext.LJIJI()), sparkContext);
        setSparkContext(sparkContext);
        this.LLJLLIL = false;
        C1540240qBS.LIZ.getClass();
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        InterfaceC1529520puA interfaceC1529520puA = C1161970gLL.LIZIZ().LJFF;
        if (interfaceC1529520puA instanceof C1535690q47) {
            interfaceC1529520puA.getClass();
        }
        C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
        if (c1538050q7v != null && c1538050q7v.getCompatReuseKitInitParamIssue()) {
            if (this.LLILZIL == null) {
                this.LLJI = sparkContext.hybridParams;
            } else if (this.LLJI == null && Intrinsics.LJFF(sparkContext.hybridParams, this.LLJIJIL)) {
                sparkContext.hybridParams = null;
            }
        }
        SparkContext sparkContext2 = this.LLILZLL;
        if (sparkContext2 != null && (interfaceC1016420cYa = (InterfaceC1016420cYa) sparkContext2.LJFF(InterfaceC1016420cYa.class)) != null) {
            this.LLJJLIIIJLLLLLLLZ = interfaceC1016420cYa.LIZ();
        } else {
            interfaceC1016420cYa = null;
        }
        this.LLJLIL = interfaceC1016420cYa;
        C786410Ut5.LJJJJIZL(this.LLJL);
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            C1540240qBS.LJII(view);
            C786410Ut5.LJZ(0, this.LLJL);
            this.LLJL.addView(view);
        }
        try {
            Npth.addTags(C2097608Jq.LJIIJ(new Pair("spark_version", "1.7.2")));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1530030puz.LIZ("SparkView", String.valueOf(th.getMessage()), sparkContext);
        }
        SparkContext sparkContext3 = this.LLILZLL;
        if (sparkContext3 != null && (lifecycleOwner = sparkContext3.lifecycleOwner) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new SparkViewLifecycleObserver(new WeakReference(this)));
        }
        boolean zLJJIIZ = LJJIIZ();
        if (!zLJJIIZ) {
            boolean z2 = sparkContext.LJJIJLIJ() instanceof SparkFragment;
        } else if (zLJJIIZ) {
            C1540240qBS.LIZ.getClass();
            C1540240qBS.LJI(sparkContext);
            C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.CREATE_SPARK_START}, null);
            C1541950qED.LIZJ.LJIIL();
            C1541950qED.LIZJ.LIZLLL(sparkContext, getContext(), 3);
        }
        C1538200q8A c1538200q8A = (C1538200q8A) sparkContext.LJFF(C1538200q8A.class);
        if (c1538200q8A != null && (l = c1538200q8A.LIZJ) != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.LLJLL = jCurrentTimeMillis;
        C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.START_LOAD}, Long.valueOf(jCurrentTimeMillis));
        String str = sparkContext.containerId;
        C1537480q70.Companion.getClass();
        C1529830puf.LIZJ(sparkContext, str);
        sparkContext.LJJ(InterfaceC1887270zDB.class, new InterfaceC1887270zDB() { // from class: X.0qEV
            @Override // X.InterfaceC1887270zDB
            public final void LIZ() {
                InterfaceC1542220qEe interfaceC1542220qEe = this.LIZ.LLJJIJI;
                if (interfaceC1542220qEe != null) {
                    interfaceC1542220qEe.show();
                }
            }

            @Override // X.InterfaceC1887270zDB
            public final void LIZIZ(boolean z3) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZ;
                if (z3) {
                    C786410Ut5.LJJJJIZL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJJJLIIL);
                    C786410Ut5.LJZ(8, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJJJLIIL);
                } else {
                    InterfaceC1542220qEe interfaceC1542220qEe = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJIJI;
                    if (interfaceC1542220qEe == null) {
                        return;
                    }
                    interfaceC1542220qEe.hide();
                }
            }
        });
        sparkContext.LJJ(AbstractC1542200qEc.class, new C1554500qYS(0));
        sparkContext.LJJJJZI(new C1554520qYU(this, 2));
        String strLJIJI = sparkContext.LJIJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareInner start, url:");
        sbLIZ.append(strLJIJI);
        C1530030puz.LIZIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ), sparkContext);
        if (TextUtils.isEmpty(strLJIJI)) {
            return;
        }
        setKitViewDelegate(null);
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof InterfaceC1541990qEH) {
                C786410Ut5.LJJLIIIIJ(childAt, this);
            }
        }
        this.LLJILLL = (AbstractC1542100qES) sparkContext.LJFF(AbstractC1542100qES.class);
        this.LLJJ = (InterfaceC1538950q9N) sparkContext.LJFF(InterfaceC1538950q9N.class);
        this.LLJJI = (AbstractC1542200qEc) sparkContext.LJFF(AbstractC1542200qEc.class);
        this.LLJJIII = getStatusViewProvider();
        if (!zLJJIIZ && !(sparkContext.LJJIJLIJ() instanceof SparkFragment)) {
            this.LLJJJ = sparkContext.LJJJI(-1);
        } else {
            this.LLJJJ = sparkContext.LJJJI(3);
        }
        SparkSchemaParam sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
        if (sparkSchemaParamLJJJI != null && (clickTime = sparkSchemaParamLJJJI.getClickTime()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(clickTime)) != null) {
            lLJIILIIL.longValue();
            if (sparkContext.LJFF(C1538200q8A.class) != null) {
                SparkSchemaParam sparkSchemaParamLJJJI2 = sparkContext.LJJJI(-1);
                if (sparkSchemaParamLJJJI2 != null && (clickTime2 = sparkSchemaParamLJJJI2.getClickTime()) != null) {
                    lLJIILIIL2 = C2095008Iq.LJIILIIL(clickTime2);
                } else {
                    lLJIILIIL2 = null;
                }
                C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.CLICK_TIME}, lLJIILIIL2);
            }
        }
        SparkSchemaParam sparkSchemaParam = this.LLJJJ;
        if (sparkSchemaParam != null) {
            url = sparkSchemaParam.getUrl();
        } else {
            url = null;
        }
        String str2 = "";
        if (C1533950q1J.LJ(url)) {
            SparkSchemaParam sparkSchemaParam2 = this.LLJJJ;
            if (sparkSchemaParam2 != null && (url2 = sparkSchemaParam2.getUrl()) != null) {
                str2 = url2;
            }
            this.LLJZIJLIL = str2;
        } else {
            SparkSchemaParam sparkSchemaParam3 = this.LLJJJ;
            if (sparkSchemaParam3 != null) {
                surl = sparkSchemaParam3.getSurl();
            } else {
                surl = null;
            }
            if (C1533950q1J.LJ(surl)) {
                SparkSchemaParam sparkSchemaParam4 = this.LLJJJ;
                if (sparkSchemaParam4 != null && (surl2 = sparkSchemaParam4.getSurl()) != null) {
                    str2 = surl2;
                }
                this.LLJZIJLIL = str2;
            } else {
                this.LLJZIJLIL = strLJIJI;
            }
        }
        final EnumC1067640dtC hybridKitType = getHybridKitType();
        sparkContext.LJIIIZ().LIZJ("spark_container_type", hybridKitType.name().toLowerCase(Locale.ROOT));
        int[] iArr = C1539220q9o.LIZ;
        int i2 = iArr[hybridKitType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    this.LLJLILLLLZIIL = EnumC1538460q8a.FAIL;
                    C1542120qEU c1542120qEU = new C1542120qEU();
                    c1542120qEU.LIZ = 103;
                    c1542120qEU.LIZIZ = "SparkView init failed, not support engine";
                    AbstractC1542100qES abstractC1542100qES = this.LLJILLL;
                    if (abstractC1542100qES != null) {
                        abstractC1542100qES.LJL(C1539330q9z.LIZ, strLJIJI, c1542120qEU);
                    }
                    InterfaceC1538950q9N interfaceC1538950q9N = this.LLJJ;
                    if (interfaceC1538950q9N != null) {
                        interfaceC1538950q9N.LJJJ(c1542120qEU);
                    }
                    AbstractC1542200qEc abstractC1542200qEc = this.LLJJI;
                    if (abstractC1542200qEc != null) {
                        do {
                            abstractC1542200qEc.LJL(C1539330q9z.LIZ, strLJIJI, c1542120qEU);
                            abstractC1542200qEc = abstractC1542200qEc.LL;
                        } while (abstractC1542200qEc != null);
                    }
                    if ((sparkContext.LJJIJLIJ() instanceof SparkActivity) && (interfaceC1542060qEO = C1546010qKl.LIZ) != null && (c1546120qKwLJFF = interfaceC1542060qEO.LJFF()) != null && c1546120qKwLJFF.LIZJ) {
                        InterfaceC1542250qEh interfaceC1542250qEh = (InterfaceC1542250qEh) sparkContext.LJFF(InterfaceC1542250qEh.class);
                        this.LLJJIJIL = interfaceC1542250qEh;
                        if (interfaceC1542250qEh != null) {
                            interfaceC1542250qEh.LIZ(false);
                        }
                    }
                    InterfaceC1163110gNB interfaceC1163110gNB = this.LLJJIII;
                    if (interfaceC1163110gNB != null) {
                        LJJJJ(interfaceC1163110gNB, sparkContext);
                        View viewLJJJLIIL = interfaceC1163110gNB.LJJJLIIL(this);
                        this.LLJILJILJ = viewLJJJLIIL;
                        C1540240qBS.LIZ.getClass();
                        C1540240qBS.LJII(viewLJJJLIIL);
                        View view2 = this.LLJILJILJ;
                        if (view2 != null) {
                            C786410Ut5.LJJJJIZL(this.LLJJJJLIIL);
                            this.LLJJJJLIIL.addView(view2);
                            C786410Ut5.LJZ(0, this.LLJJJJLIIL);
                        }
                    }
                    String str3 = sparkContext.containerId;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SparkView init failed, not support engine. schema = ");
                    sbLIZ2.append(sparkContext.LJIJI());
                    C1520080pew.LJ(null, str3, new C1520180pf6(100, C2188811AlT.LIZIZ(sbLIZ2)));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("HybridKit Init do nothing type:");
                    sbLIZ3.append(hybridKitType);
                    C1530030puz.LIZIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ3), sparkContext);
                    return;
                }
                C587540N2q.LIZ.getClass();
                ISDUIAPI isduiapi = (ISDUIAPI) C587540N2q.LIZ(ISDUIAPI.class);
                if (isduiapi != null && !isduiapi.sduiKitReady()) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    ISDUIAPI isduiapi2 = (ISDUIAPI) C587540N2q.LIZ(ISDUIAPI.class);
                    if (isduiapi2 != null) {
                        isduiapi2.initSDUIKit();
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("HybridKit Init SDUI Finish by Spark, cost: ");
                    sbLIZ4.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                    sbLIZ4.append("ms");
                    C1530030puz.LIZIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ4), sparkContext);
                }
            } else {
                C1537820q7Y c1537820q7Y = C1538260q8G.LIZ;
                if (!C1538340q8O.LIZIZ.get()) {
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    c1537820q7Y.LJI();
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("HybridKit Init Web Finish by Spark, cost: ");
                    sbLIZ5.append(System.currentTimeMillis() - jCurrentTimeMillis3);
                    sbLIZ5.append("ms");
                    C1530030puz.LIZIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ5), sparkContext);
                }
            }
        } else {
            C1537820q7Y c1537820q7Y2 = C1538260q8G.LIZ;
            C1536660q5g.LIZ.getClass();
            C1536670q5h.LIZ.getClass();
            if (!C1536670q5h.LIZJ) {
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                c1537820q7Y2.LJ(sparkContext);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("HybridKit Init Lynx Finish by Spark, cost: ");
                sbLIZ6.append(System.currentTimeMillis() - jCurrentTimeMillis4);
                sbLIZ6.append("ms");
                C1530030puz.LIZIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ6), sparkContext);
            }
        }
        final C1537510q73 c1537510q73LJJII = LJJII(sparkContext);
        C1530030puz.LIZIZ("SparkView", "prepareInner  GlobalProps:" + c1537510q73LJJII, sparkContext);
        ?? r9 = (InterfaceC1057870ddR) sparkContext.LJFF(InterfaceC1057870ddR.class);
        sparkContext.LJJJJZ(new C1538560q8k());
        ?? r8 = (AbstractC1539010q9T) sparkContext.LJFF(AbstractC1539010q9T.class);
        final InterfaceC1542320qEo interfaceC1542320qEo = (InterfaceC1542320qEo) sparkContext.LJFF(InterfaceC1542320qEo.class);
        this.LLJJIJIL = (InterfaceC1542250qEh) sparkContext.LJFF(InterfaceC1542250qEh.class);
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = sparkContext.LJFF(InterfaceC1892990zMP.class);
        String strLJJIL = sparkContext.LJJIL();
        int i3 = iArr[hybridKitType.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("hybridParams transform do nothing type:");
                    sbLIZ7.append(hybridKitType);
                    C1530030puz.LIZIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ7), sparkContext);
                } else {
                    C587540N2q.LIZ.getClass();
                    ISDUIAPI isduiapi3 = (ISDUIAPI) C587540N2q.LIZ(ISDUIAPI.class);
                    if (isduiapi3 != null) {
                        InterfaceC1542250qEh interfaceC1542250qEh2 = this.LLJJIJIL;
                        SparkSchemaParam sparkSchemaParam5 = this.LLJJJ;
                        if (sparkSchemaParam5 != null && sparkSchemaParam5.getShowProgressBarInAllPage()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        InterfaceC1531560pxS orCreateSDUIKitInitParams = isduiapi3.getOrCreateSDUIKitInitParams(sparkContext, strLJJIL, interfaceC1542250qEh2, z);
                        r1 = orCreateSDUIKitInitParams;
                        if (orCreateSDUIKitInitParams != null) {
                        }
                    }
                }
                sparkContext.isPrepared = true;
            }
            final C259800zU c259800zU2 = new C259800zU();
            InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
            if (interfaceC1531560pxS instanceof C1541480qDS) {
                c1541480qDS2 = (C1541480qDS) interfaceC1531560pxS;
            } else {
                c1541480qDS2 = new C1541480qDS(UriProtector.parse(strLJJIL));
            }
            c259800zU2.element = c1541480qDS2;
            C1541950qED.LIZJ.getClass();
            c1541480qDS2.LJFF.LIZIZ = new C1542400qEw() { // from class: X.0qEE
                public View LL;

                @Override // X.C1BVX
                public final void onHideCustomView() {
                    super.onHideCustomView();
                    InterfaceC1542340qEq interfaceC1542340qEq = (InterfaceC1542340qEq) sparkContext.LJFF(InterfaceC1542340qEq.class);
                    if (interfaceC1542340qEq != null) {
                        interfaceC1542340qEq.qn();
                        return;
                    }
                    View view3 = this.LL;
                    if (view3 != null) {
                        C786410Ut5.LJJLIIIIJ(view3, this);
                        this.LL = null;
                    }
                }

                @Override // X.C1BVX
                public final void onCloseWindow(WebView webView) {
                    Object next;
                    boolean z3;
                    C1530030puz.LIZIZ("SparkView", "onCloseWindow triggered", sparkContext);
                    SparkSchemaParam sparkSchemaParam6 = this.LLJJJ;
                    int i4 = 0;
                    if ((sparkSchemaParam6 != null && !sparkSchemaParam6.getEnableMultiTab()) || webView == null) {
                        super.onCloseWindow(webView);
                        return;
                    }
                    Iterator it2 = ((ArrayList) this.LLLF).iterator();
                    do {
                        next = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        next = it2.next();
                        next.getClass();
                    } while (!Intrinsics.LJFF(next, webView));
                    C1ET2 c1et2 = (C1ET2) next;
                    if (c1et2 != null) {
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this;
                        SparkContext sparkContext4 = sparkContext;
                        int iIndexOf = ((ArrayList) sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLF).indexOf(c1et2);
                        if (iIndexOf == -1) {
                            return;
                        }
                        if (iIndexOf == sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLL) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        ListProtector.remove(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLF, iIndexOf);
                        C786410Ut5.LJJLIIIIJ(c1et2, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                        c1et2.destroy();
                        if (z3) {
                            int i5 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLL - 1;
                            if (i5 >= 0) {
                                i4 = i5;
                            }
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLL = i4;
                            if (true ^ ((ArrayList) sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLF).isEmpty()) {
                                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLL);
                                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIJI();
                            }
                        } else {
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLL--;
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIJI();
                        }
                        AbstractC1542100qES abstractC1542100qES2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJILLL;
                        if (abstractC1542100qES2 != null) {
                            abstractC1542100qES2.LJLJL(sparkContext4, iIndexOf);
                        }
                        AbstractC1542200qEc abstractC1542200qEc2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJJI;
                        if (abstractC1542200qEc2 != null) {
                            do {
                                abstractC1542200qEc2.LJLJL(sparkContext4, iIndexOf);
                                abstractC1542200qEc2 = abstractC1542200qEc2.LL;
                            } while (abstractC1542200qEc2 != null);
                        }
                        C1530030puz.LIZIZ("SparkView", "Window closed successfully. Remaining tabs: " + ((ArrayList) sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLF).size(), sparkContext4);
                    }
                }

                @Override // X.C1BVX
                public final void onProgressChanged(WebView webView, int i4) {
                    super.onProgressChanged(webView, i4);
                    InterfaceC1542250qEh interfaceC1542250qEh3 = this.LLJJIJIL;
                    if (interfaceC1542250qEh3 != null) {
                        interfaceC1542250qEh3.setProgress(((int) (i4 * 0.9f)) + 10);
                    }
                }

                @Override // X.C1BVX
                public final void onReceivedTitle(WebView webView, String str4) {
                    boolean z3;
                    WebKitView webKitView;
                    String url3;
                    WebKitView webKitView2;
                    WebKitView webKitView3;
                    String url4;
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("onReceivedTitle ");
                    sbLIZ8.append(str4);
                    C1530030puz.LIZIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ8), sparkContext);
                    super.onReceivedTitle(webView, str4);
                    if (str4 != null && str4.length() != 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3 || (webView != null && (url4 = webView.getUrl()) != null && a0.LJJIIZI(url4, str4, false))) {
                        InterfaceC1542320qEo interfaceC1542320qEo2 = interfaceC1542320qEo;
                        if (interfaceC1542320qEo2 != null) {
                            interfaceC1542320qEo2.LIZIZ("");
                        }
                        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
                        if ((interfaceC1541990qEH instanceof WebKitView) && (webKitView = (WebKitView) interfaceC1541990qEH) != null) {
                            webKitView.setCurrentTitle("");
                        }
                    } else {
                        InterfaceC1542320qEo interfaceC1542320qEo3 = interfaceC1542320qEo;
                        if (interfaceC1542320qEo3 != null) {
                            interfaceC1542320qEo3.LIZIZ(str4);
                        }
                        InterfaceC1541990qEH interfaceC1541990qEH2 = this.LLILZIL;
                        if ((interfaceC1541990qEH2 instanceof WebKitView) && (webKitView3 = (WebKitView) interfaceC1541990qEH2) != null) {
                            webKitView3.setCurrentTitle(str4);
                        }
                    }
                    if (webView != null && (url3 = webView.getUrl()) != null) {
                        InterfaceC1542320qEo interfaceC1542320qEo4 = interfaceC1542320qEo;
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this;
                        if (interfaceC1542320qEo4 != null) {
                            interfaceC1542320qEo4.LIZ(url3);
                            interfaceC1542320qEo4.LIZJ(url3, false);
                        }
                        InterfaceC1541990qEH interfaceC1541990qEH3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLILZIL;
                        if ((interfaceC1541990qEH3 instanceof WebKitView) && (webKitView2 = (WebKitView) interfaceC1541990qEH3) != null) {
                            webKitView2.setCurrentSubTitle(url3);
                        }
                    }
                }

                @Override // X.C1BVX
                public final void onShowCustomView(View view3, WebChromeClient.CustomViewCallback customViewCallback) {
                    super.onShowCustomView(view3, customViewCallback);
                    if (view3 != null) {
                        SparkContext sparkContext4 = sparkContext;
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this;
                        InterfaceC1542340qEq interfaceC1542340qEq = (InterfaceC1542340qEq) sparkContext4.LJFF(InterfaceC1542340qEq.class);
                        if (interfaceC1542340qEq != null) {
                            interfaceC1542340qEq.LIZ(view3);
                        } else {
                            this.LL = view3;
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.addView(view3);
                        }
                    }
                }

                @Override // X.C1BVX
                public final boolean onCreateWindow(WebView webView, boolean z3, boolean z4, Message message) {
                    Object messageObj;
                    String url3;
                    Object messageObj2;
                    WebView.WebViewTransport webViewTransport;
                    WebView webView2;
                    WebView.WebViewTransport webViewTransport2;
                    WebView webView3;
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("onCreateWindow, transport url = ");
                    if (message != null) {
                        messageObj = HandlerHook.getMessageObj(message.obj);
                    } else {
                        messageObj = null;
                    }
                    if ((messageObj instanceof WebView.WebViewTransport) && (webViewTransport2 = (WebView.WebViewTransport) messageObj) != null && (webView3 = webViewTransport2.getWebView()) != null) {
                        url3 = webView3.getUrl();
                    } else {
                        url3 = null;
                    }
                    sbLIZ8.append(url3);
                    C1530030puz.LIZIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ8), sparkContext);
                    SparkSchemaParam sparkSchemaParam6 = this.LLJJJ;
                    int i4 = 0;
                    if (sparkSchemaParam6 != null && !sparkSchemaParam6.getEnableMultiTab()) {
                        return super.onCreateWindow(webView, z3, z4, message);
                    }
                    if (message != null) {
                        messageObj2 = HandlerHook.getMessageObj(message.obj);
                    } else {
                        messageObj2 = null;
                    }
                    if (messageObj2 instanceof WebView.WebViewTransport) {
                        webViewTransport = (WebView.WebViewTransport) messageObj2;
                    } else {
                        webViewTransport = null;
                    }
                    if (message != null && webViewTransport != null) {
                        SparkSchemaParam sparkSchemaParam7 = this.LLJJJ;
                        if (sparkSchemaParam7 != null && !sparkSchemaParam7.getEnableMultiTab()) {
                            return super.onCreateWindow(webView, z3, z4, message);
                        }
                        SparkContext sparkContext4 = sparkContext;
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this;
                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                        C1529830puf c1529830puf = C1537480q70.Companion;
                        String str4 = sparkContext4.containerId;
                        c1529830puf.getClass();
                        sbLIZ9.append(C1529830puf.LIZ(str4));
                        sbLIZ9.append('#');
                        sbLIZ9.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLL + 1);
                        sparkContext4.containerId = C2188811AlT.LIZIZ(sbLIZ9);
                        C259800zU<C1541480qDS> c259800zU3 = c259800zU2;
                        C1537510q73 c1537510q73 = c1537510q73LJJII;
                        sparkContext4.hybridParams = c259800zU3.element;
                        sparkContext4.runtimeInfo = c1537510q73;
                        HybridSchemaParam hybridSchemaParam = this.LLJJJ;
                        if (hybridSchemaParam == null) {
                            hybridSchemaParam = new HybridSchemaParam(hybridKitType);
                        }
                        hybridSchemaParam.setEngineType(hybridKitType);
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LLL != ((ArrayList) sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LLLF).size() - 1) {
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this;
                            ArrayList arrayList = (ArrayList) sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.LLLF;
                            List listSubList = arrayList.subList(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.LLL + 1, arrayList.size());
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = this;
                            SparkContext sparkContext5 = sparkContext;
                            for (Object obj : listSubList) {
                                int i5 = i4 + 1;
                                if (i4 >= 0) {
                                    C1ET2 c1et2 = (C1ET2) obj;
                                    int i6 = i4 + sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.LLL + 1;
                                    C786410Ut5.LJJLIIIIJ(c1et2, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4);
                                    c1et2.getClass();
                                    c1et2.destroy();
                                    AbstractC1542100qES abstractC1542100qES2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.LLJILLL;
                                    if (abstractC1542100qES2 != null) {
                                        abstractC1542100qES2.LJLJL(sparkContext5, i6);
                                    }
                                    AbstractC1542200qEc abstractC1542200qEc2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.LLJJI;
                                    if (abstractC1542200qEc2 != null) {
                                        do {
                                            abstractC1542200qEc2.LJLJL(sparkContext5, i6);
                                            abstractC1542200qEc2 = abstractC1542200qEc2.LL;
                                        } while (abstractC1542200qEc2 != null);
                                    }
                                    i4 = i5;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            listSubList.clear();
                        }
                        this.setKitViewDelegate(this.LJIJJLI(hybridSchemaParam, sparkContext4, sparkContext4, null));
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5 = this;
                        Object obj2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLILZIL;
                        if ((obj2 instanceof WebKitView) && (webView2 = (WebView) obj2) != null) {
                            SparkContext sparkContext6 = sparkContext;
                            ((ArrayList) sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLLF).add(webView2);
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLL = ((ArrayList) sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLLF).indexOf(webView2);
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.addView(webView2, new FrameLayout.LayoutParams(-1, -1));
                            webViewTransport.setWebView(webView2);
                            message.sendToTarget();
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LJIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLL);
                            AbstractC1542100qES abstractC1542100qES3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLJILLL;
                            if (abstractC1542100qES3 != null) {
                                abstractC1542100qES3.LJLJLJ(sparkContext6);
                            }
                            AbstractC1542200qEc abstractC1542200qEc3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB5.LLJJI;
                            if (abstractC1542200qEc3 != null) {
                                do {
                                    abstractC1542200qEc3.LJLJLJ(sparkContext6);
                                    abstractC1542200qEc3 = abstractC1542200qEc3.LL;
                                } while (abstractC1542200qEc3 != null);
                            }
                            C1530030puz.LIZIZ("SparkView", "New window created and WebView passed to system.", sparkContext6);
                            return true;
                        }
                        C1530030puz.LIZ("SparkView", "onCreateWindow failed: createKitView did not return a valid WebKitView", sparkContext);
                        return super.onCreateWindow(webView, z3, z4, message);
                    }
                    C1530030puz.LIZ("SparkView", "onCreateWindow failed: resultMsg is null", sparkContext);
                    return false;
                }
            };
            c1541480qDS2.LJFF.LIZ = new C844210X9v() { // from class: X.0qBQ
                @Override // X.AbstractC2205961BVi
                public final void onPageFinished(WebView webView, String str4) throws JSONException {
                    long jLongValue;
                    super.onPageFinished(webView, str4);
                    InterfaceC1542250qEh interfaceC1542250qEh3 = this.LL.LLJJIJIL;
                    if (interfaceC1542250qEh3 != null) {
                        interfaceC1542250qEh3.LIZ(false);
                    }
                    String str5 = null;
                    this.LL.LLJLLL = C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.WEB_VIEW_PAGE_FINISH}, null);
                    EnumC1520990pgP enumC1520990pgP = EnumC1520990pgP.SparkPerfMonitorOpt;
                    if (enumC1520990pgP.not()) {
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
                        C1520080pew.LIZLLL("hybrid_log_report", C2097608Jq.LJIIIIZZ(new Pair(Scene.SCENE_SERVICE, "web_start_to_draw_end"), new Pair("schema", sparkContext.LJJIL()), new Pair("duration", Long.valueOf(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJLLL - sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJLL))));
                    }
                    C1538200q8A c1538200q8A2 = (C1538200q8A) sparkContext.LJFF(C1538200q8A.class);
                    if (c1538200q8A2 != null) {
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LL;
                        Long l2 = c1538200q8A2.LJIILIIL;
                        if (l2 != null) {
                            c1538200q8A2.LJIILJJIL = Long.valueOf(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LLJLLL - l2.longValue());
                        }
                    }
                    C1538200q8A c1538200q8A3 = (C1538200q8A) sparkContext.LJFF(C1538200q8A.class);
                    if (c1538200q8A3 != null) {
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LL;
                        SparkContext sparkContext4 = sparkContext;
                        Long l3 = c1538200q8A3.LIZJ;
                        if (l3 != null) {
                            l3.longValue();
                            if (enumC1520990pgP.not()) {
                                long jCurrentTimeMillis5 = System.currentTimeMillis() - sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.LLJLL;
                                if (sparkContext4 != null) {
                                    str5 = sparkContext4.containerId;
                                }
                                C1520360pfO c1520360pfO = new C1520360pfO("hybrid_monitor_web_first_screen_duration");
                                c1520360pfO.LIZIZ = sparkContext4.bid;
                                c1520360pfO.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.LLJZIJLIL;
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("duration", jCurrentTimeMillis5);
                                c1520360pfO.LJ = jSONObject;
                                C1520080pew.LIZ(str5, c1520360pfO.LIZ());
                                String str6 = sparkContext4.containerId;
                                C1520360pfO c1520360pfO2 = new C1520360pfO("hybrid_monitor_web_timeline");
                                c1520360pfO2.LIZIZ = sparkContext4.bid;
                                c1520360pfO2.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.LLJZIJLIL;
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("init_to_start_render", c1538200q8A3.LJIIIIZZ);
                                jSONObject2.put("webview_create", c1538200q8A3.LJIIL);
                                jSONObject2.put("webview_render", c1538200q8A3.LJIILJJIL);
                                c1520360pfO2.LJ = jSONObject2;
                                C1520080pew.LIZ(str6, c1520360pfO2.LIZ());
                            }
                            C01GW<C1537410q6t> c01gw2 = C1537410q6t.LJIIIZ;
                            if (C1161970gLL.LIZIZ().LIZ) {
                                long jCurrentTimeMillis6 = System.currentTimeMillis();
                                Long l4 = c1538200q8A3.LIZIZ;
                                if (l4 != null) {
                                    jLongValue = l4.longValue();
                                } else {
                                    jLongValue = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.LLJLL;
                                }
                                String str7 = sparkContext4.containerId;
                                C1520360pfO c1520360pfO3 = new C1520360pfO("web_start_to_finish");
                                c1520360pfO3.LIZIZ = sparkContext4.bid;
                                c1520360pfO3.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.LLJZIJLIL;
                                c1520360pfO3.LJIIJJI = EnumC993170bx5.Both;
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("duration", jCurrentTimeMillis6 - jLongValue);
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("metric_name", "web_start_to_finish");
                                jSONObject4.put("start_time", jLongValue);
                                jSONObject4.put("end_time", jCurrentTimeMillis6);
                                jSONObject3.put("metric_extra", Collections.singletonList(jSONObject4));
                                c1520360pfO3.LJ = jSONObject3;
                                C1520080pew.LIZ(str7, c1520360pfO3.LIZ());
                            }
                        }
                    }
                }

                @Override // X.AbstractC2205961BVi
                public final void onPageStarted(WebView webView, String str4, Bitmap bitmap) {
                    SparkSchemaParam sparkSchemaParam6;
                    int pageDepthOfReportShow;
                    Object navBtnType;
                    HybridSchemaParam hybridSchemaParamLIZJ;
                    Integer num;
                    HashMap<String, Object> map;
                    Long l2;
                    Integer num2;
                    C1538200q8A c1538200q8A2;
                    InterfaceC1542250qEh interfaceC1542250qEh3;
                    super.onPageStarted(webView, str4, bitmap);
                    SparkSchemaParam sparkSchemaParam7 = this.LL.LLJJJ;
                    if (((sparkSchemaParam7 != null && sparkSchemaParam7.getShowProgressBarInAllPage()) || ((sparkSchemaParam6 = this.LL.LLJJJ) != null && sparkSchemaParam6.getWebviewProgressBar())) && (interfaceC1542250qEh3 = this.LL.LLJJIJIL) != null) {
                        interfaceC1542250qEh3.LIZ(true);
                    }
                    SparkSchemaParam sparkSchemaParam8 = this.LL.LLJJJ;
                    if (sparkSchemaParam8 != null && (sparkSchemaParam8 instanceof AbsSparkPageSchemaParam)) {
                        pageDepthOfReportShow = ((AbsSparkPageSchemaParam) sparkSchemaParam8).getPageDepthOfReportShow();
                    } else {
                        pageDepthOfReportShow = 0;
                    }
                    SparkSchemaParam sparkSchemaParam9 = this.LL.LLJJJ;
                    if (sparkSchemaParam9 == null || !(sparkSchemaParam9 instanceof AbsSparkPageSchemaParam) || (navBtnType = ((AbsSparkPageSchemaParam) sparkSchemaParam9).getNavBtnType()) == null) {
                        navBtnType = EnumC1067700dtI.TYPE_NONE;
                    }
                    if (Intrinsics.LJFF(navBtnType, "report") && pageDepthOfReportShow > 0) {
                        C1540240qBS.LIZ.getClass();
                        if (C1540240qBS.LIZIZ(webView) <= pageDepthOfReportShow) {
                            InterfaceC1892990zMP interfaceC1892990zMP = c259800zU.element;
                            if (interfaceC1892990zMP != null) {
                                interfaceC1892990zMP.LJJIFFI(EnumC1067700dtI.TYPE_REPORT);
                            }
                        } else {
                            InterfaceC1892990zMP interfaceC1892990zMP2 = c259800zU.element;
                            if (interfaceC1892990zMP2 != null) {
                                interfaceC1892990zMP2.LJJIFFI(EnumC1067700dtI.TYPE_NONE);
                            }
                        }
                    }
                    SparkContext sparkContext4 = this.LL.getSparkContext();
                    if (sparkContext4 != null && sparkContext4.enableAutoHideLoadingScript) {
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
                        C1540230qBR.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLIIII;
                        SparkContext sparkContext5 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
                        if (sparkContext5 != null) {
                            num = sparkContext5.fmpValueForAutoHideLoadingScript;
                        } else {
                            num = null;
                        }
                        SparkContext sparkContext6 = this.LL.getSparkContext();
                        if (sparkContext6 != null) {
                            map = sparkContext6.autoHideLoadingEventExtraInfo;
                        } else {
                            map = null;
                        }
                        SparkContext sparkContext7 = this.LL.getSparkContext();
                        if (sparkContext7 != null && (c1538200q8A2 = (C1538200q8A) sparkContext7.LJFF(C1538200q8A.class)) != null) {
                            l2 = c1538200q8A2.LIZJ;
                        } else {
                            l2 = null;
                        }
                        SparkContext sparkContext8 = this.LL.getSparkContext();
                        if (sparkContext8 != null) {
                            num2 = sparkContext8.disableHideLoadingByJS;
                        } else {
                            num2 = null;
                        }
                        String strLJJIFFI = C1540230qBR.LIZ;
                        if (webView != null && strLJJIFFI.length() != 0) {
                            if (a0.LJJIIZI(strLJJIFFI, "/** LIMIT_TIME **/", false) && num != null) {
                                strLJJIFFI = u.LJJIFFI(strLJJIFFI, "/** LIMIT_TIME **/", num.toString(), false);
                            }
                            if (a0.LJJIIZI(strLJJIFFI, "/** START_TIME **/", false)) {
                                strLJJIFFI = u.LJJIFFI(strLJJIFFI, "/** START_TIME **/", String.valueOf(l2), false);
                            }
                            if (a0.LJJIIZI(strLJJIFFI, "\"/** DISABLE_HIDE_LOADING **/\"", false) && num2 != null) {
                                strLJJIFFI = u.LJJIFFI(strLJJIFFI, "\"/** DISABLE_HIDE_LOADING **/\"", num2.toString(), false);
                            }
                            if (a0.LJJIIZI(strLJJIFFI, "\"/** EXTRA_INFO **/\"", false)) {
                                if (map == null) {
                                    map = new HashMap<>();
                                }
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    Iterator<T> it2 = map.entrySet().iterator();
                                    while (it2.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it2.next();
                                        jSONObject.put((String) entry.getKey(), entry.getValue());
                                    }
                                    strLJJIFFI = u.LJJIFFI(strLJJIFFI, "\"/** EXTRA_INFO **/\"", String.valueOf(jSONObject), false);
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                }
                            }
                            WebSettings settings = webView.getSettings();
                            if (settings != null) {
                                settings.setJavaScriptEnabled(true);
                            }
                            webView.evaluateJavascript(strLJJIFFI, null);
                        }
                    }
                    InterfaceC1531560pxS interfaceC1531560pxS2 = sparkContext.hybridParams;
                    if (interfaceC1531560pxS2 != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS2.LIZJ()) != null && hybridSchemaParamLIZJ.getCleanCookieWhenAccountChange()) {
                        C0W7X.LIZ.getClass();
                        C1490740otc c1490740otc = C1490740otc.LIZ;
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("url : ");
                        sbLIZ8.append(str4);
                        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ8), null, null, 6);
                        if (str4 != null) {
                            Set<String> set = C0W7X.LIZIZ;
                            set.add(str4);
                            ((SharedPreferences) C818010W7b.LIZ.getValue()).edit().putStringSet("cookie_url_set_key", set).apply();
                        }
                    }
                }
            };
            r1 = c1541480qDS2;
        } else {
            InterfaceC1531560pxS interfaceC1531560pxS2 = sparkContext.hybridParams;
            if (interfaceC1531560pxS2 instanceof C1537910q7h) {
                c1537910q7h = (C1537910q7h) interfaceC1531560pxS2;
            } else {
                c1537910q7h = new C1537910q7h(UriProtector.parse(strLJJIL));
            }
            SparkContext sparkContext4 = getSparkContext();
            if (sparkContext4 != null) {
                InterfaceC1531560pxS interfaceC1531560pxS3 = sparkContext4.hybridParams;
                if (interfaceC1531560pxS3 instanceof C1537910q7h) {
                    c1537910q7h2 = (C1537910q7h) interfaceC1531560pxS3;
                } else {
                    c1537910q7h2 = null;
                }
                sparkContext4.LJJJJZI(new C1554500qYS(this, sparkContext4, c1537910q7h2, 4));
            }
            C1541950qED.LIZJ.getClass();
            c1537910q7h.LJIIIIZZ(new C1554370qYF(sparkContext, this, 0));
            r1 = c1537910q7h;
        }
        this.LLJIJIL = r1;
        sparkContext.hybridParams = r1;
        sparkContext.runtimeInfo = c1537510q73LJJII;
        HybridSchemaParam hybridSchemaParam = this.LLJJJ;
        if (hybridSchemaParam == null) {
            hybridSchemaParam = new HybridSchemaParam(hybridKitType);
        }
        hybridSchemaParam.setEngineType(hybridKitType);
        int i4 = iArr[hybridKitType.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("hybridParams set value do nothing type:");
                    sbLIZ8.append(hybridKitType);
                    C1530030puz.LIZIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ8), sparkContext);
                } else {
                    C587540N2q.LIZ.getClass();
                    ?? r0 = (ISDUIAPI) C587540N2q.LIZ(ISDUIAPI.class);
                    if (r0 != 0) {
                        r0.setHybridSchemaParams(r1, hybridSchemaParam);
                    }
                }
            } else if ((r1 instanceof C1541480qDS) && (c1541480qDS = (C1541480qDS) r1) != null) {
                c1541480qDS.LJIIL = hybridSchemaParam;
            }
        } else if ((r1 instanceof C1537910q7h) && (c1537910q7h3 = (C1537910q7h) r1) != null) {
            c1537910q7h3.LJJIIJ = hybridSchemaParam;
        }
        if (r9 != 0) {
            r9.LJJJLL(r1);
        }
        if (r8 != 0) {
            do {
                r8.LJJJLL(r1);
                Object obj = r8.LL;
                if (obj == null || !(obj instanceof AbstractC1539010q9T)) {
                    break;
                } else {
                    r8 = (AbstractC1539010q9T) obj;
                }
            } while (r8 != 0);
        }
        C1530030puz.LIZIZ("SparkView", "prepareInner  HybridKit.createKitView hybridKitType:" + hybridKitType, sparkContext);
        View viewE12 = null;
        long jLIZJ = C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.CREATE_VIEW_START}, null);
        setKitViewDelegate(LJIJJLI(hybridSchemaParam, sparkContext, sparkContext, null));
        C1538200q8A c1538200q8A2 = (C1538200q8A) sparkContext.LJFF(C1538200q8A.class);
        if (c1538200q8A2 != null) {
            r5 = 0;
            viewE12 = null;
            c1538200q8A2.LJIIJJI = Long.valueOf(C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.CREATE_VIEW_END}, null) - jLIZJ);
        } else {
            r5 = 0;
        }
        LJJIIJZLJL(this.LLJJJ, sparkContext, r5);
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        if (interfaceC1541990qEH != null && (viewE1 = interfaceC1541990qEH.e1()) != null) {
            addView(viewE1, r5, new FrameLayout.LayoutParams(-1, -1));
            if (viewE1 instanceof WebKitView) {
                ((ArrayList) this.LLLF).add(viewE1);
            }
        }
        C1541970qEF c1541970qEF = this.LLLIILIL;
        if (c1541970qEF != null) {
            c1541970qEF.LIZ();
        }
        InterfaceC1541990qEH interfaceC1541990qEH2 = this.LLILZIL;
        SparkContext sparkContext5 = this.LLILZLL;
        if (sparkContext5 != null) {
            C1514810pWR c1514810pWRLJIIIZ = sparkContext5.LJIIIZ();
            if (interfaceC1541990qEH2 != null) {
                viewE12 = interfaceC1541990qEH2.e1();
            }
            c1514810pWRLJIIIZ.LIZIZ(viewE12, getHybridKitType().name().toLowerCase(Locale.ROOT));
        }
        C1539580qAO c1539580qAO = (C1539580qAO) sparkContext.LJFF(C1539580qAO.class);
        if (c1539580qAO != null) {
            c1539580qAO.LJIIJ = C13LP.LJLILLLLZI(new InterfaceC1539930qAx() { // from class: X.0qAr
                @Override // X.InterfaceC1539930qAx
                public final void LIZ(EnumC1539690qAZ enumC1539690qAZ) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZ;
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getHybridKitType());
                }
            }, c1539580qAO.LJIIJ);
        }
        LJJIJIL(hybridKitType);
        if (sparkContext.LJJIJLIJ() == null) {
            EnumC1537220q6a[] enumC1537220q6aArr = new EnumC1537220q6a[1];
            enumC1537220q6aArr[r5] = EnumC1537220q6a.CONTAINER_INIT_END;
            C1530570pvr.LIZJ(sparkContext, enumC1537220q6aArr, null);
            sparkContext.LJFF(C1538200q8A.class);
        }
        sparkContext.isPrepared = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v35, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v40, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v46, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v52, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v56, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIL(X.EnumC1067640dtC r19) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJIL(X.0dtC):void");
    }

    public final void LJJIJL(SparkContext sparkContext) {
        InterfaceC1016420cYa interfaceC1016420cYa;
        InterfaceC1531560pxS interfaceC1531560pxS;
        set_sparkContext(sparkContext);
        if (!LJJIIZ() && !(sparkContext.LJJIJLIJ() instanceof SparkFragment)) {
            this.LLJJJ = sparkContext.LJJJI(-1);
        } else {
            this.LLJJJ = sparkContext.LJJJI(3);
        }
        this.LLJJIJIL = (InterfaceC1542250qEh) sparkContext.LJFF(InterfaceC1542250qEh.class);
        InterfaceC1531560pxS interfaceC1531560pxS2 = sparkContext.hybridParams;
        if (interfaceC1531560pxS2 != null) {
            interfaceC1531560pxS2.LJI(C1537540q76.LJ(sparkContext.LJJIL()));
        }
        SparkSchemaParam sparkSchemaParam = this.LLJJJ;
        if (sparkSchemaParam != null && (interfaceC1531560pxS = sparkContext.hybridParams) != null) {
            interfaceC1531560pxS.LJ(sparkSchemaParam);
        }
        SparkContext sparkContext2 = this.LLILZLL;
        if (sparkContext2 != null && (interfaceC1016420cYa = (InterfaceC1016420cYa) sparkContext2.LJFF(InterfaceC1016420cYa.class)) != null) {
            View viewLIZ = interfaceC1016420cYa.LIZ();
            if (!Intrinsics.LJFF(viewLIZ, this.LLJJLIIIJLLLLLLLZ)) {
                this.LLJJLIIIJLLLLLLLZ = viewLIZ;
                C786410Ut5.LJJJJIZL(this.LLJL);
                View view = this.LLJJLIIIJLLLLLLLZ;
                if (view != null) {
                    C1540240qBS.LIZ.getClass();
                    C1540240qBS.LJII(view);
                    C786410Ut5.LJZ(0, this.LLJL);
                    this.LLJL.addView(view);
                }
            }
        } else {
            interfaceC1016420cYa = null;
        }
        this.LLJLIL = interfaceC1016420cYa;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJIL(com.bytedance.hybrid.spark.SparkContext r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJJIL(com.bytedance.hybrid.spark.SparkContext):void");
    }

    @Override // X.InterfaceC1540940qCa
    public final void U0(Map<String, ? extends Object> map) {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.U0(map);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LJJIIZI(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            X.0qEF r7 = r8.LLLIILIL
            boolean r0 = r7.LJIIL
            r4 = 1
            r3 = 0
            if (r0 == 0) goto Lbe
            int r0 = r7.LJIILIIL
            if (r0 <= 0) goto Lbe
            android.view.View r5 = r7.LIZJ()
            r2 = 0
            if (r5 == 0) goto Lbe
            boolean r0 = r5 instanceof com.lynx.tasm.LynxView
            if (r0 == 0) goto L4b
            X.0qEB r0 = r7.LIZ
            com.bytedance.lynx.spark.schema.model.AbsModel.AbsSparkPageSchemaParam r0 = r0.LJIILL()
            if (r0 == 0) goto Lbe
            java.lang.String r1 = r0.getAutoAdaptationScrollViewId()
            if (r1 == 0) goto Lbe
            int r0 = r1.length()
            if (r0 == 0) goto Lbe
            com.lynx.tasm.LynxView r5 = (com.lynx.tasm.LynxView) r5     // Catch: java.lang.Throwable -> L35
            android.view.View r1 = r5.findViewByIdSelector(r1)     // Catch: java.lang.Throwable -> L35
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L35
            goto L41
        L35:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L41:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L48
            r2 = r1
        L48:
            r5 = r2
            android.view.View r5 = (android.view.View) r5
        L4b:
            if (r5 == 0) goto Lbe
            int r0 = r5.getWidth()
            if (r0 <= 0) goto Lbe
            int[] r0 = r7.LJIILJJIL
            r5.getLocationOnScreen(r0)
            int[] r2 = r7.LJIILJJIL
            r1 = r2[r3]
            r6 = r2[r4]
            X.0qEB r0 = r7.LIZ
            r0.getLocationOnScreen(r2)
            int[] r0 = r7.LJIILJJIL
            r0 = r0[r3]
            float r3 = (float) r0
            float r0 = r9.getX()
            float r3 = r3 + r0
            int[] r0 = r7.LJIILJJIL
            r0 = r0[r4]
            float r2 = (float) r0
            float r0 = r9.getY()
            float r2 = r2 + r0
            float r0 = (float) r1
            float r3 = r3 - r0
            int r0 = r5.getWidth()
            int r0 = r0 - r4
            if (r0 >= r4) goto L81
            r0 = 1
        L81:
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = X.C13LZ.LIZLLL(r3, r0, r1)
            float r0 = (float) r6
            float r2 = r2 - r0
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r9)
            r3.setLocation(r1, r2)
            boolean r0 = r5.dispatchTouchEvent(r3)     // Catch: java.lang.Throwable -> L9d
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L9d
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L9d
            goto La9
        L9d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        La9:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto Lb2
            r2 = r1
        Lb2:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            r3.recycle()
            if (r0 == 0) goto Lbe
            return r4
        Lbe:
            boolean r0 = super.onTouchEvent(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDebugInfoTagFromXml(TextView textView) {
        this.LLILZ = textView;
    }

    @Override // X.InterfaceC1540940qCa
    public void setKeepAlive(boolean z) {
        this.LLILLL = z;
    }

    public final void setKitViewDelegate(InterfaceC1541990qEH interfaceC1541990qEH) {
        boolean z;
        View viewLIZJ;
        View view;
        if (this.LLILZIL != interfaceC1541990qEH) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZIL = interfaceC1541990qEH;
        C19719612Di.LJJIII(this.LLJ, new AwS602S0100000_23(interfaceC1541990qEH, 25), true);
        if (interfaceC1541990qEH != null) {
            this.LLJ.add(new WeakReference<>(interfaceC1541990qEH));
        }
        if (z) {
            C1541970qEF c1541970qEF = this.LLLIILIL;
            if (c1541970qEF.LJFF && (viewLIZJ = c1541970qEF.LIZJ()) != (view = c1541970qEF.LJIIIIZZ)) {
                if (view != null) {
                    view.removeOnLayoutChangeListener(c1541970qEF.LJIIJ);
                }
                c1541970qEF.LJIIIIZZ = viewLIZJ;
                if (viewLIZJ != null) {
                    viewLIZJ.addOnLayoutChangeListener(c1541970qEF.LJIIJ);
                }
                c1541970qEF.LIZIZ();
            }
        }
    }

    @Override // X.InterfaceC1540940qCa
    public void setOptimization(int i) {
        this.LLILLJJLI = i;
    }

    public final void setSparkContext(SparkContext sparkContext) {
        set_sparkContext(sparkContext);
        this.LLIZ = sparkContext;
    }

    public final void setSparkDeployPage$spark_release(InterfaceC1546060qKq interfaceC1546060qKq) {
        this.LLLIL = interfaceC1546060qKq;
    }

    public void setViewCreatedTime(long j) {
        this.LL = j;
    }

    public static final C1058140dds LJJIIJ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, SparkSchemaParam sparkSchemaParam) {
        int iLIZ;
        InterfaceC1545600qK6 interfaceC1545600qK6LIZLLL;
        Integer numLIZIZ;
        int iLIZ2;
        if (!(sparkSchemaParam instanceof SparkPageSchemaParam) && !(sparkSchemaParam instanceof SparkPopupSchemaParam)) {
            try {
                Context context = C1100000ejO.LIZ;
                if (context == null) {
                    context = null;
                }
                iLIZ2 = C446980Hfs.LIZ(context, R.color.d4);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                iLIZ2 = 0;
            }
            return new C1058140dds(iLIZ2);
        }
        if (C1540320qBa.LIZ) {
            InterfaceC1542060qEO interfaceC1542060qEO = C1546010qKl.LIZ;
            if (interfaceC1542060qEO != null && (interfaceC1545600qK6LIZLLL = interfaceC1542060qEO.LIZLLL()) != null && (numLIZIZ = interfaceC1545600qK6LIZLLL.LIZIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getContext())) != null) {
                iLIZ = numLIZIZ.intValue();
            } else {
                iLIZ = C1542150qEX.LIZ();
            }
            return new C1058140dds(iLIZ);
        }
        return new C1058140dds(C1542150qEX.LIZ());
    }

    @Override // X.InterfaceC1540940qCa
    public final void LIZ(String str, JSONObject jSONObject) {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLILZIL;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.LIZ(str, jSONObject);
        }
    }

    @Override // X.InterfaceC1540940qCa
    public final void LJIIIZ(Context context, C1537480q70 c1537480q70) {
        SparkContext sparkContext;
        InterfaceC1541990qEH interfaceC1541990qEH;
        InterfaceC1541990qEH interfaceC1541990qEH2 = this.LLILZIL;
        if (interfaceC1541990qEH2 != null) {
            interfaceC1541990qEH2.W0(context);
        }
        if ((c1537480q70 instanceof SparkContext) && (sparkContext = (SparkContext) c1537480q70) != null) {
            C1529880puk c1529880puk = SparkContext.Companion;
            SparkSchemaParam sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
            if (sparkSchemaParamLJJJI != null && (interfaceC1541990qEH = this.LLILZIL) != null) {
                interfaceC1541990qEH.f1(sparkSchemaParamLJJJI);
            }
        }
        if (this.LLJLILLLLZIIL == EnumC1538460q8a.SUCCESS) {
            LJJJJI(this, Long.valueOf(System.currentTimeMillis()), null, 2);
        } else {
            this.LLJZ = System.currentTimeMillis();
        }
    }

    public final void LJJIJIIJIL(SparkContext sparkContext, SparkSchemaParam sparkSchemaParam) {
        String str;
        String str2;
        Object kitView;
        LJJIIJZLJL(sparkSchemaParam, sparkContext, true);
        SparkContext originalSparkContext = getOriginalSparkContext();
        if (originalSparkContext != null) {
            str = originalSparkContext.containerId;
        } else {
            str = null;
        }
        if (sparkContext != null) {
            str2 = sparkContext.containerId;
        } else {
            str2 = null;
        }
        if (str != null && str2 != null) {
            Map<String, String> map = C1529860pui.LIZ;
            C1537480q70.Companion.getClass();
            map.put(C1529830puf.LIZ(str), C1529830puf.LIZ(str2));
        }
        if (sparkContext != null) {
            C1529830puf c1529830puf = C1537480q70.Companion;
            String str3 = sparkContext.containerId;
            c1529830puf.getClass();
            C1529830puf.LIZJ(sparkContext, str3);
            C1530570pvr.LIZIZ(sparkContext, "spark_consume_pre_result");
            sparkContext.runtimeInfo = LJJII(sparkContext);
            C1537510q73 c1537510q73 = sparkContext.runtimeInfo;
            if (c1537510q73 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(c1537510q73);
                U0(linkedHashMap);
            }
        }
        if (getOptimization() == 4 && (kitView = getKitView()) != null && (kitView instanceof WebKitView)) {
            ((C1ET2) kitView).onResume();
        }
        if (this.LLJLILLLLZIIL == EnumC1538460q8a.SUCCESS) {
            LIZ("hybridViewCacheUsed", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIZ(java.lang.String r10, java.lang.String r11) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIZ(java.lang.String, java.lang.String):void");
    }

    public final void LJJJ(SparkContext sparkContext, boolean z) {
        InterfaceC1163110gNB interfaceC1163110gNB = this.LLJJIII;
        if (interfaceC1163110gNB != null) {
            LJJJJ(interfaceC1163110gNB, sparkContext);
            if (!z) {
                InterfaceC1163110gNB interfaceC1163110gNB2 = this.LLJJIII;
                if (interfaceC1163110gNB2 != null) {
                    View viewLJJJLIIL = interfaceC1163110gNB2.LJJJLIIL(this);
                    this.LLJILJILJ = viewLJJJLIIL;
                    C1540240qBS.LIZ.getClass();
                    C1540240qBS.LJII(viewLJJJLIIL);
                    View view = this.LLJILJILJ;
                    if (view != null) {
                        C786410Ut5.LJJJJIZL(this.LLJJJJLIIL);
                        this.LLJJJJLIIL.addView(view);
                        C786410Ut5.LJZ(0, this.LLJJJJLIIL);
                        return;
                    }
                    return;
                }
                return;
            }
            C786410Ut5.LJJJJIZL(this.LLJJJJLIIL);
            C786410Ut5.LJZ(8, this.LLJJJJLIIL);
        }
    }

    public final void LJJJJ(InterfaceC1163110gNB interfaceC1163110gNB, SparkContext sparkContext) {
        AbstractC1542070qEP abstractC1542070qEP;
        AtomicBoolean atomicBoolean;
        boolean z = interfaceC1163110gNB instanceof AbstractC1542070qEP;
        if (z) {
            AbstractC1542070qEP abstractC1542070qEP2 = (AbstractC1542070qEP) interfaceC1163110gNB;
            if (abstractC1542070qEP2.LL.get()) {
                return;
            } else {
                abstractC1542070qEP2.LIZ(sparkContext);
            }
        }
        interfaceC1163110gNB.LJIIJ(getContext());
        if (z && (abstractC1542070qEP = (AbstractC1542070qEP) interfaceC1163110gNB) != null && (atomicBoolean = abstractC1542070qEP.LL) != null) {
            atomicBoolean.set(true);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (Intrinsics.LJFF(str, "enable_spark_debug_label")) {
            LJJIJIL(getHybridKitType());
        }
        if (Intrinsics.LJFF(str, "enable_resource_info_in_spark_debug_label")) {
            LJJIJIL(getHybridKitType());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB(Context context, AttributeSet attributeSet, int i) {
        long jCurrentTimeMillis;
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        if ((i & 8) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        this(context, attributeSet2, 0, jCurrentTimeMillis, 0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(com.bytedance.lynx.spark.schema.model.SparkSchemaParam r10, com.bytedance.hybrid.spark.SparkContext r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIIJZLJL(com.bytedance.lynx.spark.schema.model.SparkSchemaParam, com.bytedance.hybrid.spark.SparkContext, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIJLIJ(TemplateData templateData, String str, boolean z) throws JSONException {
        String strLJJIL;
        String strLJIJI;
        AbstractC1542100qES abstractC1542100qES;
        AbstractC1542200qEc abstractC1542200qEc;
        AbstractC1542100qES abstractC1542100qES2;
        AbstractC1542200qEc abstractC1542200qEc2;
        View viewE1;
        C1539580qAO c1539580qAO;
        C1537910q7h c1537910q7h;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        SparkSchemaParam sparkSchemaParamLJJJI;
        String str2;
        C1537510q73 c1537510q73;
        Object objPut;
        InterfaceC1541990qEH interfaceC1541990qEH;
        SparkContext sparkContext;
        SparkSchemaParam sparkSchemaParamLJJJI2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reload start, url:");
        sbLIZ.append(str);
        sbLIZ.append(", templateData = ");
        sbLIZ.append(templateData);
        C1530030puz.LIZIZ("SparkView", C2188811AlT.LIZIZ(sbLIZ), this.LLILZLL);
        SparkContext sparkContext2 = this.LLILZLL;
        Object obj = "";
        if (sparkContext2 == null || (strLJJIL = sparkContext2.LJJIL()) == null) {
            strLJJIL = "";
        }
        SparkContext sparkContext3 = this.LLILZLL;
        EnumC1533980q1M enumC1533980q1M = null;
        Object[] objArr = 0;
        if (sparkContext3 != null) {
            strLJIJI = sparkContext3.LJIJI();
        } else {
            strLJIJI = null;
        }
        int i = 1;
        if (!Intrinsics.LJFF(str, strLJIJI)) {
            SparkContext sparkContext4 = this.LLILZLL;
            if (sparkContext4 == null || sparkContext4.mainDocumentGeckoInfo == null) {
                JSONArray jSONArray = C1533710q0v.LIZ;
                C1533720q0w.LJ(C1533720q0w.LIZ, C1533710q0v.LIZLLL(null, new RequestParams(enumC1533980q1M, i, objArr == true ? 1 : 0), str), this.LLILZLL);
            }
            SparkContext sparkContext5 = this.LLILZLL;
            if (sparkContext5 != null) {
                sparkContext5.LJJLIIJ(str);
            }
            SparkContext sparkContext6 = this.LLILZLL;
            if (sparkContext6 != null) {
                interfaceC1059280dfiLJJIJLIJ = sparkContext6.LJJIJLIJ();
            } else {
                interfaceC1059280dfiLJJIJLIJ = null;
            }
            if (interfaceC1059280dfiLJJIJLIJ == null) {
                SparkContext sparkContext7 = this.LLILZLL;
                if (sparkContext7 != null) {
                    sparkSchemaParamLJJJI2 = sparkContext7.LJJJI(3);
                } else {
                    sparkSchemaParamLJJJI2 = null;
                }
                this.LLJJJ = sparkSchemaParamLJJJI2;
            } else {
                SparkContext sparkContext8 = this.LLILZLL;
                if (sparkContext8 != null) {
                    C1529880puk c1529880puk = SparkContext.Companion;
                    sparkSchemaParamLJJJI = sparkContext8.LJJJI(-1);
                } else {
                    sparkSchemaParamLJJJI = null;
                }
                this.LLJJJ = sparkSchemaParamLJJJI;
            }
            if (z && (sparkContext = this.LLILZLL) != null) {
                C587540N2q.LIZ.getClass();
                ISparkInnerPIA iSparkInnerPIA = (ISparkInnerPIA) C587540N2q.LIZ(ISparkInnerPIA.class);
                if (iSparkInnerPIA != null) {
                    iSparkInnerPIA.warmup(sparkContext, getContext());
                }
            }
            SparkSchemaParam sparkSchemaParam = this.LLJJJ;
            if (sparkSchemaParam != null && (interfaceC1541990qEH = this.LLILZIL) != null) {
                interfaceC1541990qEH.f1(sparkSchemaParam);
            }
            if (this.LLLFFI) {
                SparkContext sparkContext9 = this.LLILZLL;
                if (sparkContext9 != null) {
                    sparkContext9.runtimeInfo = LJJII(sparkContext9);
                }
                if (!LLLILZJ) {
                    U0(C2097908Jt.LIZJ(new Pair("originUrl", strLJJIL)));
                }
            } else {
                C1545480qJu c1545480qJu = C1545480qJu.LIZ;
                SparkContext sparkContext10 = this.LLILZLL;
                if (sparkContext10 == null || (str2 = sparkContext10.containerId) == null) {
                    str2 = "";
                }
                c1545480qJu.getClass();
                Map<String, String> mapLIZJ = C08RQ.LIZJ(str2);
                if (this.LLLFF) {
                    SparkContext sparkContext11 = this.LLILZLL;
                    if (sparkContext11 != null && (c1537510q73 = sparkContext11.runtimeInfo) != null && (objPut = c1537510q73.put("abParams", (Object) String.valueOf(mapLIZJ.get("ab_params")))) != null) {
                        obj = objPut;
                    }
                    U0(C2097608Jq.LJIIIIZZ(new Pair("originUrl", strLJJIL), new Pair("queryItems", mapLIZJ), new Pair("abParams", obj)));
                } else {
                    U0(C2097608Jq.LJIIIIZZ(new Pair("originUrl", strLJJIL), new Pair("queryItems", mapLIZJ)));
                }
            }
        }
        Map<String, Object> mapLIZJ2 = C1537540q76.LIZJ(this.LLILZIL, this.LLJJJ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(mapLIZJ2);
        if (LLLILZJ) {
            linkedHashMap.putAll(C2097908Jt.LIZJ(new Pair("originUrl", strLJJIL)));
            LJJJJI(this, null, linkedHashMap, 1);
        } else {
            LJJJJI(this, null, mapLIZJ2, 1);
        }
        SparkContext originalSparkContext = getOriginalSparkContext();
        if (originalSparkContext != null) {
            abstractC1542100qES = (AbstractC1542100qES) originalSparkContext.LJFF(AbstractC1542100qES.class);
        } else {
            abstractC1542100qES = null;
        }
        SparkContext originalSparkContext2 = getOriginalSparkContext();
        if (originalSparkContext2 != null) {
            abstractC1542200qEc = (AbstractC1542200qEc) originalSparkContext2.LJFF(AbstractC1542200qEc.class);
        } else {
            abstractC1542200qEc = null;
        }
        if (abstractC1542100qES != null) {
            abstractC1542100qES.LJLLL(this.LLILZLL);
        }
        if (abstractC1542200qEc != null) {
            do {
                abstractC1542200qEc.LJLLL(this.LLILZLL);
                abstractC1542200qEc = abstractC1542200qEc.LL;
            } while (abstractC1542200qEc != null);
        }
        SparkContext sparkContext12 = getSparkContext();
        if (sparkContext12 != null) {
            abstractC1542100qES2 = (AbstractC1542100qES) sparkContext12.LJFF(AbstractC1542100qES.class);
        } else {
            abstractC1542100qES2 = null;
        }
        SparkContext sparkContext13 = getSparkContext();
        if (sparkContext13 != null) {
            abstractC1542200qEc2 = (AbstractC1542200qEc) sparkContext13.LJFF(AbstractC1542200qEc.class);
        } else {
            abstractC1542200qEc2 = null;
        }
        if (abstractC1542100qES2 != null) {
            abstractC1542100qES2.LJLLL(this.LLILZLL);
        }
        if (abstractC1542200qEc2 != null) {
            do {
                abstractC1542200qEc2.LJLLL(this.LLILZLL);
                abstractC1542200qEc2 = abstractC1542200qEc2.LL;
            } while (abstractC1542200qEc2 != null);
        }
        InterfaceC1541990qEH interfaceC1541990qEH2 = this.LLILZIL;
        if (interfaceC1541990qEH2 != null) {
            viewE1 = interfaceC1541990qEH2.e1();
        } else {
            viewE1 = null;
        }
        if (viewE1 instanceof LynxView) {
            C1537710q7N c1537710q7N = (C1537710q7N) this.LLILZIL;
            if (templateData != null && (c1537910q7h = c1537710q7N.LLILZ) != null) {
                c1537910q7h.LJIJJ = templateData;
            }
            c1537710q7N.load(str);
        } else if (u.LJJIIJZLJL(str, "https", false)) {
            InterfaceC1541990qEH interfaceC1541990qEH3 = this.LLILZIL;
            if (interfaceC1541990qEH3 != null) {
                interfaceC1541990qEH3.load(str);
            }
        } else {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C1537540q76.LJ(str), "url");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            }
            InterfaceC1541990qEH interfaceC1541990qEH4 = this.LLILZIL;
            if (interfaceC1541990qEH4 != null) {
                interfaceC1541990qEH4.load(str);
            }
        }
        SparkContext sparkContext14 = this.LLILZLL;
        if (sparkContext14 != null && (c1539580qAO = (C1539580qAO) sparkContext14.LJFF(C1539580qAO.class)) != null) {
            c1539580qAO.LJIIJ = C13LP.LJLILLLLZI(new InterfaceC1539930qAx() { // from class: X.0qAs
                @Override // X.InterfaceC1539930qAx
                public final void LIZ(EnumC1539690qAZ enumC1539690qAZ) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZ;
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getHybridKitType());
                }
            }, c1539580qAO.LJIIJ);
        }
        if (this.LLILZIL != null) {
            SparkContext sparkContext15 = this.LLILZLL;
            if (sparkContext15 != null) {
                sparkContext15.LJIJI();
            }
            LJJIZ("start", null);
        }
    }

    public final void LJJJI(SparkContext sparkContext, boolean z, boolean z2) {
        InterfaceC1542250qEh interfaceC1542250qEh;
        InterfaceC1163110gNB interfaceC1163110gNB = this.LLJJIII;
        if (interfaceC1163110gNB != null) {
            LJJJJ(interfaceC1163110gNB, sparkContext);
            if (!z) {
                SparkSchemaParam sparkSchemaParam = this.LLJJJ;
                if (sparkSchemaParam != null && !sparkSchemaParam.getDisableAutoRemoveLoading()) {
                    C786410Ut5.LJJJJIZL(this.LLJJJJLIIL);
                    C786410Ut5.LJZ(8, this.LLJJJJLIIL);
                }
                InterfaceC1542250qEh interfaceC1542250qEh2 = this.LLJJIJIL;
                if (interfaceC1542250qEh2 != null) {
                    interfaceC1542250qEh2.setProgress(100);
                }
            }
            if (z2 && (interfaceC1542250qEh = this.LLJJIJIL) != null) {
                interfaceC1542250qEh.LIZ(false);
            }
        }
    }

    public static void LJJJJI(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, Long l, Map map, int i) {
        long jLongValue;
        C1537510q73 c1537510q73;
        C1537510q73 c1537510q732;
        InterfaceC1539040q9W interfaceC1539040q9W;
        Map map2;
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            map = null;
        }
        if (l != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getClass();
            jLongValue = l.longValue();
        } else {
            jLongValue = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJLL;
        }
        int iIntValue = 0;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLFFI && l != null) {
            long jLongValue2 = l.longValue();
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJLL = jLongValue2;
            SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLILZLL;
            if (sparkContext != null) {
                C1530570pvr.LIZJ(sparkContext, new EnumC1537220q6a[]{EnumC1537220q6a.START_LOAD}, Long.valueOf(jLongValue2));
            }
        }
        SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLILZLL;
        if (sparkContext2 != null && (c1537510q732 = sparkContext2.runtimeInfo) != null) {
            c1537510q732.put("containerInitTime", (Object) String.valueOf(jLongValue));
            Object obj = c1537510q732.get((Object) "queryItems");
            if (C19719512Dh.LJII(obj) && (map2 = (Map) obj) != null) {
                map2.put("containerInitTime", String.valueOf(jLongValue));
            }
            C1538880q9G.LIZ.getClass();
            Integer numValueOf = C1538880q9G.LIZJ;
            if (numValueOf != null || ((interfaceC1539040q9W = C1538880q9G.LIZIZ) != null && (numValueOf = Integer.valueOf(interfaceC1539040q9W.LIZ())) != null)) {
                iIntValue = numValueOf.intValue();
            }
            c1537510q732.put("networkLevel", (Object) Integer.valueOf(iIntValue));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SparkContext sparkContext3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLILZLL;
        if (sparkContext3 != null && (c1537510q73 = sparkContext3.runtimeInfo) != null) {
            linkedHashMap.putAll(c1537510q73);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.U0(linkedHashMap);
    }

    public final InterfaceC1541990qEH LJIJJLI(HybridSchemaParam hybridSchemaParam, SparkContext sparkContext, SparkContext sparkContext2, AbstractC1537870q7d abstractC1537870q7d) {
        EnumC1067640dtC viewType;
        EnumC1067640dtC type;
        View viewE1;
        View viewE12;
        Context context;
        Activity activityLIZ;
        EnumC1067640dtC type2;
        String strName;
        Context context2 = getContext();
        C1541920qEA c1541920qEA = new C1541920qEA(this, sparkContext2, abstractC1537870q7d);
        InterfaceC1538750q93<? extends InterfaceC1541990qEH>[] value = C1538260q8G.LIZIZ.getValue();
        int length = value.length;
        int i = 0;
        while (true) {
            String lowerCase = null;
            if (i >= length) {
                break;
            }
            InterfaceC1538750q93<? extends InterfaceC1541990qEH> interfaceC1538750q93 = value[i];
            if (interfaceC1538750q93 != null) {
                viewType = interfaceC1538750q93.getViewType();
            } else {
                viewType = null;
            }
            InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
            if (interfaceC1531560pxS != null) {
                type = interfaceC1531560pxS.getType();
            } else {
                type = null;
            }
            if (viewType == type) {
                if (interfaceC1538750q93 != null) {
                    InterfaceC1541990qEH interfaceC1541990qEHLIZ = interfaceC1538750q93.LIZ(hybridSchemaParam, sparkContext, context2, c1541920qEA);
                    C1514810pWR c1514810pWRLJIIIZ = sparkContext.LJIIIZ();
                    if (interfaceC1541990qEHLIZ != null) {
                        viewE1 = interfaceC1541990qEHLIZ.e1();
                    } else {
                        viewE1 = null;
                    }
                    InterfaceC1531560pxS interfaceC1531560pxS2 = sparkContext.hybridParams;
                    if (interfaceC1531560pxS2 != null && (type2 = interfaceC1531560pxS2.getType()) != null && (strName = type2.name()) != null) {
                        lowerCase = strName.toLowerCase(Locale.ROOT);
                    }
                    c1514810pWRLJIIIZ.LIZIZ(viewE1, lowerCase);
                    sparkContext.lifecycleState = Lifecycle.State.CREATED;
                    CopyOnWriteArrayList<WeakReference<C01CN>> copyOnWriteArrayList = C01CM.LIZ;
                    if (interfaceC1541990qEHLIZ != null && (viewE12 = interfaceC1541990qEHLIZ.e1()) != null && (context = viewE12.getContext()) != null && (activityLIZ = C715020S2y.LIZ(context)) != null) {
                        C01CM.LIZ.add(new WeakReference<>(new C01CN(activityLIZ, interfaceC1541990qEHLIZ)));
                    }
                    return interfaceC1541990qEHLIZ;
                }
            } else {
                i++;
            }
        }
        return null;
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB(Context context, AttributeSet attributeSet, int i, long j, int i2, boolean z) {
        Object c098200Yq;
        boolean zBooleanValue;
        Object c098200Yq2;
        boolean zBooleanValue2;
        Object c098200Yq3;
        boolean zBooleanValue3;
        Object c098200Yq4;
        Object c098200Yq5;
        Object c098200Yq6;
        super(context, attributeSet, i);
        this.LL = j;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
        this.LLIZLLLIL = new ConcurrentLinkedQueue<>();
        this.LLJ = new ConcurrentLinkedQueue<>();
        this.LLJLILLLLZIIL = EnumC1538460q8a.INIT;
        this.LLJLL = System.currentTimeMillis();
        this.LLJZ = -1L;
        this.LLJZIJLIL = "";
        this.LLLF = new ArrayList();
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("spark_reload_abparams");
            if (config != null) {
                c098200Yq = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable"));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.LLLFF = zBooleanValue;
        try {
            JSONObject config2 = HybridSettings.INSTANCE.getConfig("update_runtime_info_after_reload");
            if (config2 != null) {
                c098200Yq2 = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config2, "enable"));
            } else {
                c098200Yq2 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Boolean bool2 = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = true;
        }
        this.LLLFFI = zBooleanValue2;
        try {
            Object objLIZIZ = C1535630q41.LIZIZ("spark_clear_container_when_reused");
            if (objLIZIZ instanceof Boolean) {
                c098200Yq3 = (Boolean) objLIZIZ;
            } else {
                c098200Yq3 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        Boolean bool3 = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq3) ? null : c098200Yq3);
        if (bool3 != null) {
            zBooleanValue3 = bool3.booleanValue();
        } else {
            zBooleanValue3 = false;
        }
        this.LLLFZ = zBooleanValue3;
        try {
            JSONObject config3 = HybridSettings.INSTANCE.getConfig("self_adaptive_height_on_page_update");
            if (config3 != null) {
                c098200Yq4 = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config3, "enable"));
            } else {
                c098200Yq4 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq4 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        Boolean bool4 = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq4) ? null : c098200Yq4);
        this.LLLI = bool4 != null ? bool4.booleanValue() : false;
        try {
            JSONObject config4 = HybridSettings.INSTANCE.getConfig("self_adaptive_height_on_view_pre_draw");
            if (config4 != null) {
                c098200Yq5 = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config4, "enable"));
            } else {
                c098200Yq5 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq5);
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            c098200Yq5 = new C098200Yq(th5);
            C189200o6.m2constructorimpl(c098200Yq5);
        }
        Boolean bool5 = (Boolean) (C189200o6.m7isFailureimpl(c098200Yq5) ? null : c098200Yq5);
        this.LLLII = bool5 != null ? bool5.booleanValue() : true;
        try {
            Object objLIZIZ2 = C1535630q41.LIZIZ("spark_hide_loading_js");
            if (objLIZIZ2 instanceof String) {
                c098200Yq6 = (String) objLIZIZ2;
            } else {
                c098200Yq6 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq6);
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            c098200Yq6 = new C098200Yq(th6);
            C189200o6.m2constructorimpl(c098200Yq6);
        }
        String str = (String) (C189200o6.m7isFailureimpl(c098200Yq6) ? null : c098200Yq6);
        this.LLLIIII = str != null ? str : "";
        this.LLLIIL = new ViewTreeObserverOnPreDrawListenerC1554400qYI(this, 0);
        this.LLLIILIL = new C1541970qEF(this);
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LIZ) {
            C786410Ut5.Sd(R.layout.f_m, C786410Ut5.ne(context), this);
        } else {
            C786410Ut5.Sd(R.layout.f_n, C786410Ut5.ne(context), this);
        }
        this.LLJJJJLIIL = (FrameLayout) findViewById(R.id.w0p);
        this.LLJL = (FrameLayout) findViewById(R.id.f5v);
        this.LLJJL = (TextView) findViewById(R.id.fgm);
        C1541950qED.LIZJ.getClass();
        C1537900q7g.LJII();
    }
}
