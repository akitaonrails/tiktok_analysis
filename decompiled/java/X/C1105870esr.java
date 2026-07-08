package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.lynx.tasm.TemplateData;
import kotlin.Unit;
import kotlin.jvm.internal.AwS100S1200000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0esr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105870esr extends FrameLayout implements InterfaceC1059280dfi, GenericLifecycleObserver {
    public final BPEAHandler LL;
    public boolean LLILLJJLI;
    public C1092640eXW LLILLL;
    public C1067900dtc LLILZ;
    public SparkContext LLILZIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public C1105880ess LLJ;
    public boolean LLJI;

    @Override // X.InterfaceC1059280dfi
    public final void close() {
    }

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
    }

    public final void LIZIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, null);
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.removeAllViews();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            this.LLILZLL = null;
        }
        C1067900dtc c1067900dtc = this.LLILZ;
        if (c1067900dtc != null) {
            c1067900dtc.LLILLL = true;
            this.LLILZ = null;
        }
        C1105880ess c1105880ess = this.LLJ;
        if (c1105880ess != null) {
            c1105880ess.LIZ = 0L;
            c1105880ess.LIZIZ = 0L;
            c1105880ess.LIZJ = 0L;
        }
        this.LLJ = null;
        this.LLILLL = null;
        this.LLILZIL = null;
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        this.LLIZ = "";
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJI = false;
        LIZIZ();
    }

    public final Handler getMainHandler() {
        return this.LL;
    }

    public C1105870esr(Context context) {
        super(context);
        this.LL = new BPEAHandler(Looper.getMainLooper());
        this.LLIZ = "";
        this.LLIZLLLIL = "";
    }

    public C1105870esr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new BPEAHandler(Looper.getMainLooper());
        this.LLIZ = "";
        this.LLIZLLLIL = "";
    }

    public final void LIZ(int i, String str, String str2) {
        InterfaceC1541990qEH kitView;
        C1537910q7h c1537910q7h;
        InterfaceC1541990qEH kitView2;
        boolean zU61;
        int i2;
        String str3;
        if (this.LLJI) {
            return;
        }
        if (TextUtils.equals(str, this.LLIZ) && TextUtils.equals(this.LLIZLLLIL, str2)) {
            return;
        }
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        String str4 = this.LLIZ;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        if (this.LLJ == null) {
            this.LLJ = new C1105880ess();
        }
        C1105880ess c1105880ess = this.LLJ;
        Object c098200Yq = null;
        if (c1105880ess != null && (str3 = this.LLIZ) != null && str3.length() > 0) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            C0K04.LJFF("event_name", "use_lynx", jSONObject);
            C0K04.LJFF("lynx_url", str3, jSONObject2);
            c1105880ess.LIZ(jSONObject2);
            C0K04.LJII("extra", jSONObject3, jSONObject2);
            C1CC2.LJ("ttlive_ranklist_lynx_show", jSONObject, null, jSONObject3);
        }
        if (this.LLILZLL == null) {
            C1105880ess c1105880ess2 = this.LLJ;
            if (c1105880ess2 != null && 0 == c1105880ess2.LIZ) {
                c1105880ess2.LIZ = System.currentTimeMillis();
                IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
                if (iHostResource != null) {
                    zU61 = iHostResource.u61("revenue_client_hall_of_fame_rank_lynx");
                } else {
                    zU61 = false;
                }
                c1105880ess2.LIZLLL = zU61;
                if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_rank_lynx_gecko_exist_event")) {
                    JSONObject jSONObject4 = new JSONObject();
                    C0K04.LJFF("channel", "revenue_client_hall_of_fame_rank_lynx", jSONObject4);
                    c1105880ess2.LIZ(jSONObject4);
                    if (c1105880ess2.LIZLLL) {
                        i2 = 2;
                    } else {
                        i2 = 3;
                    }
                    C1CC2.LJIIIIZZ("ttlive_rank_lynx_gecko_exist_event", i2, jSONObject4);
                }
            }
            this.LLIZLLLIL = str2;
            if (this.LLILZLL == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
                removeAllViews();
                C1067900dtc c1067900dtc = new C1067900dtc();
                this.LLILZ = c1067900dtc;
                C1092640eXW c1092640eXW = new C1092640eXW();
                this.LLILLL = c1092640eXW;
                int i3 = C0KYQ.LIZ;
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(getContext(), str, null, false, new AwS100S1200000_16(c1067900dtc, c1092640eXW, str2, 11));
                this.LLILZLL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i);
                    layoutParams.gravity = 16;
                    addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, layoutParams);
                }
                C1105880ess c1105880ess3 = this.LLJ;
                if (c1105880ess3 != null) {
                    JSONObject jSONObject5 = new JSONObject();
                    JSONObject jSONObject6 = new JSONObject();
                    JSONObject jSONObject7 = new JSONObject();
                    JSONObject jSONObject8 = new JSONObject();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    c1105880ess3.LIZJ = jCurrentTimeMillis2;
                    long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                    C0K04.LJFF("event_name", "create_spark_view", jSONObject5);
                    C0K04.LJ("event_duration_all", j, jSONObject6);
                    C0K04.LJ("event_duration", j, jSONObject6);
                    C0K04.LJ("event_duration_all", j, jSONObject7);
                    C0K04.LJ("event_duration", j, jSONObject7);
                    C0K04.LIZLLL(0, "is_precreate", jSONObject7);
                    if (!TextUtils.isEmpty(str)) {
                        C0K04.LJFF("lynx_url", str, jSONObject7);
                    }
                    C0K04.LJII("extra", jSONObject8, jSONObject7);
                    C1CC2.LJ("ttlive_ranklist_lynx_show", jSONObject5, jSONObject6, jSONObject8);
                }
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILZLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
                if (sparkContext != null) {
                    sparkContext.containerId = sparkContext.containerId;
                    this.LLILZIL = sparkContext;
                } else {
                    sparkContext = null;
                }
                C1067900dtc c1067900dtc2 = this.LLILZ;
                if (c1067900dtc2 != null) {
                    c1067900dtc2.LLILLJJLI = new C1151940g5A(this, 11);
                }
                C1092640eXW c1092640eXW2 = this.LLILLL;
                if (c1092640eXW2 != null) {
                    c1092640eXW2.LL = new C1151540g4W(this, sparkContext, 1);
                }
                this.LLILLJJLI = true;
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
                return;
            }
            return;
        }
        if (TextUtils.equals(str, str4)) {
            if (this.LLILZLL == null) {
                return;
            }
            try {
                TemplateData templateData = new TemplateData();
                templateData.LJIILIIL("initial_data", new JSONObject(this.LLIZLLLIL));
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLILZLL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView()) != null && (kitView2 instanceof C1537710q7N)) {
                    ((C1537710q7N) kitView2).updateData(templateData);
                    c098200Yq = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        if (TextUtils.isEmpty(this.LLIZLLLIL)) {
            return;
        }
        SparkContext sparkContext2 = this.LLILZIL;
        String str5 = "";
        if (sparkContext2 != null) {
            sparkContext2.LJJLIIJ("");
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = this.LLILZLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getKitView()) == null || !(kitView instanceof C1537710q7N)) {
            return;
        }
        C1537710q7N c1537710q7N = (C1537710q7N) kitView;
        C1067460dsu c1067460dsuLIZIZ = C1067320dsg.LIZIZ(this.LLIZLLLIL);
        c1067460dsuLIZIZ.LIZ("initial_data", new JSONObject(this.LLIZLLLIL));
        TemplateData templateData2 = c1067460dsuLIZIZ.LIZ;
        String str6 = this.LLIZ;
        if (str6 != null) {
            str5 = str6;
        }
        if (templateData2 != null && (c1537910q7h = c1537710q7N.LLILZ) != null) {
            c1537910q7h.LJIJJ = templateData2;
        }
        c1537710q7N.load(str5);
    }
}
