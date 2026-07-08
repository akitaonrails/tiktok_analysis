package Y;

import X.C01GW;
import X.C0CFN;
import X.C0CN5;
import X.C0DF6;
import X.C0HTI;
import X.C1233040iBy;
import X.C1389890mGx;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1C7U;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2341909Fp;
import X.C303380Buq;
import X.C336010DFf;
import X.C336040DFi;
import X.C561400M0c;
import X.C786410Ut5;
import X.C793770VBv;
import X.InterfaceC2342209Fs;
import X.InterfaceC792320V6g;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS10S1100000_4 implements Runnable {
    public final int $t;
    public Object l1;
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
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        String str = this.s0;
        Map map = (Map) this.l1;
        Map<String, Double> cpuRate = ((ICreativePerformanceMonitorService) C303380Buq.LIZIZ.getValue()).getCpuRate();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(cpuRate.size()));
        Iterator<T> it2 = cpuRate.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), String.valueOf(((Number) entry.getValue()).doubleValue()));
        }
        map.putAll(linkedHashMap);
        Map<String, Long> memory = ((ICreativePerformanceMonitorService) C303380Buq.LIZIZ.getValue()).getMemory();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(memory.size()));
        Iterator<T> it3 = memory.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it3.next();
            linkedHashMap2.put(entry2.getKey(), String.valueOf(((Number) entry2.getValue()).longValue()));
        }
        map.putAll(linkedHashMap2);
        C01GW c01gw = C303380Buq.LIZIZ;
        map.put("thermal", ((ICreativePerformanceMonitorService) c01gw.getValue()).getBatteryTemperature());
        map.put("battery_level", ((ICreativePerformanceMonitorService) c01gw.getValue()).getBatteryPercent());
        map.put("memory_rate", ((ICreativePerformanceMonitorService) c01gw.getValue()).getMemoryUsedRate());
        C2341909Fp.LIZ(str, map);
    }

    public final void LIZ$1() {
        if (C336040DFi.LIZ.LIZIZ(this.s0)) {
            HashMap<String, Runnable> map = C336010DFf.LIZIZ;
            String str = this.s0;
            synchronized (map) {
                try {
                    map.remove(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C336010DFf.LIZJ.LIZ((C0DF6) this.l1);
        }
    }

    public final void LIZ$2() {
        Integer numValueOf;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C561400M0c c561400M0c = (C561400M0c) this.l1;
        C1749280vcc c1749280vcc = c561400M0c.LIZIZ;
        if (c1749280vcc != null) {
            String str = this.s0;
            RecyclerView recyclerView = c561400M0c.LIZ;
            if (recyclerView != null && (numValueOf = Integer.valueOf(recyclerView.getTop())) != null) {
                C1749280vcc c1749280vcc2 = c561400M0c.LIZIZ;
                ViewGroup.LayoutParams layoutParams = c1749280vcc2 != null ? c1749280vcc2.getLayoutParams() : null;
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.topMargin = numValueOf.intValue();
                }
                C1749280vcc c1749280vcc3 = c561400M0c.LIZIZ;
                if (c1749280vcc3 != null) {
                    c1749280vcc3.requestLayout();
                }
            }
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.n5;
            Drawable drawableLIZ = c0hti.LIZ(c1749280vcc.getContext());
            c1722300uv6.LIZJ = 2;
            c1722300uv6.LIZ = drawableLIZ;
            c1722300uv6.LJI = c1749280vcc.getContext().getString(2131832397);
            c1722300uv6.LJIIIIZZ = str;
            c1749280vcc.setStatus(c1722300uv6);
        }
    }

    public static final void run$0(ARunnableS10S1100000_4 aRunnableS10S1100000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ColdCacheReportUtils@940c.reportEvent$1");
        try {
            C20684815ws.LJIILLIIL(aRunnableS10S1100000_4.s0, (Map) aRunnableS10S1100000_4.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ColdCacheReportUtils@940c.reportEvent$1");
    }

    public static final void run$1(ARunnableS10S1100000_4 aRunnableS10S1100000_4) {
        boolean zLIZ;
        C1C7U.LIZ("FakeMainThreadHandler@ca0.excuteRunnable$3$1$2");
        try {
            Map<String, Runnable> map = C0CFN.LJFF;
            if (map.get(aRunnableS10S1100000_4.s0) != null) {
                Runnable runnable = (Runnable) aRunnableS10S1100000_4.l1;
                String str = aRunnableS10S1100000_4.s0;
                runnable.run();
                map.remove(str);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FakeMainThreadHandler@ca0.excuteRunnable$3$1$2");
    }

    public static final void run$2(ARunnableS10S1100000_4 aRunnableS10S1100000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileEditFragment@18c.bindInstagramError$1");
        try {
            if (((ProfileEditFragment) aRunnableS10S1100000_4.l1).isViewValid()) {
                ((ProfileEditFragment) aRunnableS10S1100000_4.l1).UR(false);
                C1389890mGx c1389890mGx = new C1389890mGx((ProfileEditFragment) aRunnableS10S1100000_4.l1);
                c1389890mGx.LJIIJ(aRunnableS10S1100000_4.s0);
                c1389890mGx.LJIIJJI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileEditFragment@18c.bindInstagramError$1");
    }

    public static final void run$3(ARunnableS10S1100000_4 aRunnableS10S1100000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileEditFragment@18c.onYouTubeError$1");
        try {
            if (((ProfileEditFragment) aRunnableS10S1100000_4.l1).isViewValid()) {
                ((ProfileEditFragment) aRunnableS10S1100000_4.l1).UR(false);
                C1233040iBy c1233040iBy = new C1233040iBy(((ProfileEditFragment) aRunnableS10S1100000_4.l1).getContext());
                c1233040iBy.LIZJ(aRunnableS10S1100000_4.s0);
                c1233040iBy.LIZLLL();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileEditFragment@18c.onYouTubeError$1");
    }

    public static final void run$4(ARunnableS10S1100000_4 aRunnableS10S1100000_4) {
        String str = aRunnableS10S1100000_4.s0;
        Runnable runnable = (Runnable) aRunnableS10S1100000_4.l1;
        C1C7U.LIZ("StartupStateUtils@39b4.delayRunAfterFirstFeedCompletedInner$1L");
        C0CN5.LIZ.remove(str);
        runnable.run();
        C1C7U.LIZIZ("StartupStateUtils@39b4.delayRunAfterFirstFeedCompletedInner$1L");
    }

    public static final void run$5(ARunnableS10S1100000_4 aRunnableS10S1100000_4) {
        boolean zLIZ;
        C1C7U.LIZ("CreativePerformanceManager@bba6.mobEventWithPerformanceMonitor$1");
        try {
            aRunnableS10S1100000_4.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CreativePerformanceManager@bba6.mobEventWithPerformanceMonitor$1");
    }

    public static final void run$6(ARunnableS10S1100000_4 aRunnableS10S1100000_4) {
        boolean zLIZ;
        C1C7U.LIZ("EcpInteractionGuard@7f56.scheduleTimeout$timeoutRunnable$1");
        try {
            aRunnableS10S1100000_4.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcpInteractionGuard@7f56.scheduleTimeout$timeoutRunnable$1");
    }

    public static final void run$7(ARunnableS10S1100000_4 aRunnableS10S1100000_4) {
        boolean zLIZ;
        C1C7U.LIZ("ApmAgent@713b.monitorCommonLog$2");
        try {
            final String str = aRunnableS10S1100000_4.s0;
            final JSONObject jSONObject = (JSONObject) aRunnableS10S1100000_4.l1;
            JSONObject jSONObjectLIZ = new InterfaceC792320V6g(jSONObject, str) { // from class: X.0Uzp
                public final String LIZ;
                public final JSONObject LIZIZ;

                @Override // X.InterfaceC792320V6g
                public final boolean LIZIZ() {
                    return true;
                }

                @Override // X.InterfaceC792320V6g
                public final String LIZLLL() {
                    return "common_log";
                }

                @Override // X.InterfaceC792320V6g
                public final JSONObject LIZ() {
                    JSONObject jSONObject2 = this.LIZIZ;
                    if (jSONObject2 == null) {
                        return null;
                    }
                    try {
                        jSONObject2.put("log_type", this.LIZ);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC792320V6g
                public final String LJ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC792320V6g
                public final boolean LIZJ(JSONObject jSONObject2) {
                    return C790620Uzs.LIZ.getLogTypeSwitch(this.LIZ);
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = jSONObject;
                }
            }.LIZ();
            if (jSONObjectLIZ != null) {
                C793770VBv.LJIIZILJ("monitorCommonLog", C786410Ut5.J3(jSONObjectLIZ));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ApmAgent@713b.monitorCommonLog$2");
    }

    public static final void run$8(ARunnableS10S1100000_4 aRunnableS10S1100000_4) {
        boolean zLIZ;
        C1C7U.LIZ("DraftBoxEmptyComponent@7467.realShowEmpty$1");
        try {
            aRunnableS10S1100000_4.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DraftBoxEmptyComponent@7467.realShowEmpty$1");
    }

    public ARunnableS10S1100000_4(Runnable runnable, String str, int i) {
        this.$t = i;
        if (1 - i != 0) {
            this.s0 = str;
            this.l1 = runnable;
        } else {
            this.s0 = str;
            this.l1 = runnable;
        }
    }

    public ARunnableS10S1100000_4(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
