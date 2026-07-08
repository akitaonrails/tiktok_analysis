package X;

import Y.ARunnableS109S0100000_9;
import Y.ARunnableS113S0100000_13;
import Y.AsS40S0100000_13;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.FrameMetrics;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798970VVv implements InterfaceC1602960roc {
    public final String LIZ;
    public final C0V2A LIZIZ;
    public final C0VF0 LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public C0VWC LJFF;
    public C0VWC LJI;
    public final C01GW LJII;
    public final C0N4R LJIIIIZZ;
    public volatile boolean LJIIIZ;

    @Override // X.InterfaceC1602960roc
    public final void LJIIIIZZ() {
        this.LJFF = null;
    }

    public final void LJIIL() {
        C0V2A c0v2a;
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        this.LJ = SystemClock.uptimeMillis();
        C0V2A c0v2a2 = this.LIZIZ;
        if (c0v2a2 != null) {
            c0v2a2.LJFF();
        }
        C0VF0 c0vf0 = this.LIZJ;
        if (c0vf0 != null) {
            c0vf0.LLILLL = System.currentTimeMillis();
            C2113808Pw.LIZIZ.LL.removeCallbacks(c0vf0.LLJI);
        }
        if (C259540AFc.LIZ && (C2187451AjH.LJIIJ() || ((c0v2a = this.LIZIZ) != null && c0v2a.LIZIZ()))) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS113S0100000_13(this, 125));
        }
        if (C798700VUu.LIZIZ(this.LIZ)) {
            C798750VUz.LIZ(this.LIZ).LJFF();
        }
        C0VWC c0vwc = this.LJFF;
        if (c0vwc != null) {
            c0vwc.LJIIJ(this.LIZ);
        }
        C0VWC c0vwc2 = this.LJI;
        if (c0vwc2 != null) {
            c0vwc2.LJIIJ(this.LIZ);
        }
        if (C1241204tO.LIZ()) {
            if (!C798980VVw.LIZIZ) {
                C798980VVw.LIZ(new C798860VVk(), new C0VW8(), new C0VW7(), new C0VW9());
            }
            C798980VVw.LIZIZ(this.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01d3  */
    @Override // X.InterfaceC1602960roc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void stop() {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C798970VVv.stop():void");
    }

    @Override // X.InterfaceC1602960roc
    public final void LJI() {
        LJIIL();
        C2487409ou.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL, new ARunnableS109S0100000_9(this, 116));
    }

    @Override // X.InterfaceC1602960roc
    public final void start() {
        C2407009bw.LIZ();
        C314640CVa.LIZ(this.LIZ);
        LJIIL();
        if (Intrinsics.LJFF(this.LIZ, "homepage_hot")) {
            C0VW0.LIZ = true;
        }
        if (Intrinsics.LJFF(this.LIZ, "homepage_hot") || Intrinsics.LJFF(this.LIZ, "rest_homepage_hot")) {
            String str = this.LIZ;
            C0VWW.LJFF(str, new C0VWX(str, new C0N3U(), new C0N3V()));
        } else {
            String str2 = this.LIZ;
            C0VWW.LJFF(str2, new C0VWZ("metric_type_default", str2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0N4R] */
    public C798970VVv(String str) {
        this.LIZ = str;
        boolean z = true;
        if (!C583330MuJ.LIZ(str) && !Intrinsics.LJFF(str, "dsp_sub_player_launch") && !Intrinsics.LJFF(str, "dsp_launch") && !((Boolean) C0VF3.LIZJ.getValue()).booleanValue() && !u.LJJIIJZLJL(str, "nuj_", false) && !Intrinsics.LJFF(str, "core_scene")) {
            z = false;
        }
        C0V2A c0v2a = new C0V2A(str, z);
        this.LIZIZ = c0v2a;
        this.LIZJ = new C0VF0(str);
        c0v2a.LIZLLL(new C0V22() { // from class: X.0VGS
            @Override // X.C0V22
            public final void LIZIZ(double d) {
                C798970VVv c798970VVv = this.LL;
                c798970VVv.getClass();
                C0VF0 c0vf0 = c798970VVv.LIZJ;
                if (c0vf0 != null) {
                    c0vf0.LIZIZ(d);
                }
            }
        });
        c0v2a.LIZJ(new InterfaceC791210V1z() { // from class: X.0VGT
            @Override // X.InterfaceC791210V1z
            public final void LIZLLL(JSONObject jSONObject) {
                C798970VVv c798970VVv = this.LL;
                c798970VVv.getClass();
                C0VF0 c0vf0 = c798970VVv.LIZJ;
                if (c0vf0 != null) {
                    c0vf0.LIZLLL(jSONObject);
                }
            }
        });
        if (((Boolean) C0VGQ.LIZIZ.getValue()).booleanValue()) {
            C0V21 c0v21 = new C0V21() { // from class: X.0VGP
                @Override // X.C0V21
                public final void LIZ(List<FrameMetrics> list) throws JSONException {
                    C0VGQ c0vgq = C0VGQ.LIZ;
                    String str2 = this.LL.LIZ;
                    c0vgq.getClass();
                    if (str2 != null && list != null && !list.isEmpty() && Build.VERSION.SDK_INT >= 24) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Scene.SCENE_SERVICE, str2);
                        long metric = 0;
                        long metric2 = 0;
                        long metric3 = 0;
                        long metric4 = 0;
                        long metric5 = 0;
                        long metric6 = 0;
                        long metric7 = 0;
                        long metric8 = 0;
                        long metric9 = 0;
                        long metric10 = 0;
                        long metric11 = 0;
                        long metric12 = 0;
                        for (FrameMetrics frameMetrics : list) {
                            metric2 += frameMetrics.getMetric(0);
                            metric4 += frameMetrics.getMetric(1);
                            metric5 += frameMetrics.getMetric(2);
                            metric8 += frameMetrics.getMetric(3);
                            metric10 += frameMetrics.getMetric(4);
                            metric11 += frameMetrics.getMetric(5);
                            metric12 += frameMetrics.getMetric(6);
                            metric9 += frameMetrics.getMetric(7);
                            metric6 += frameMetrics.getMetric(8);
                            metric7 += frameMetrics.getMetric(9);
                            if (Build.VERSION.SDK_INT >= 31) {
                                metric += frameMetrics.getMetric(12);
                                metric3 += frameMetrics.getMetric(13);
                            }
                        }
                        int size = list.size();
                        if (size > 0) {
                            jSONObject.put("UNKNOWN_DELAY_DURATION", Float.valueOf(C0VGQ.LIZ(size, metric2)));
                            jSONObject.put("INPUT_HANDLING_DURATION", Float.valueOf(C0VGQ.LIZ(size, metric4)));
                            jSONObject.put("ANIMATION_DURATION", Float.valueOf(C0VGQ.LIZ(size, metric5)));
                            jSONObject.put("LAYOUT_MEASURE_DURATION", Float.valueOf(C0VGQ.LIZ(size, metric8)));
                            jSONObject.put("DRAW_DURATION", Float.valueOf(C0VGQ.LIZ(size, metric10)));
                            jSONObject.put("SYNC_DURATION", Float.valueOf(C0VGQ.LIZ(size, metric11)));
                            jSONObject.put("COMMAND_ISSUE_DURATION", Float.valueOf(C0VGQ.LIZ(size, metric12)));
                            jSONObject.put("SWAP_BUFFERS_DURATION", Float.valueOf(C0VGQ.LIZ(size, metric9)));
                            jSONObject.put("TOTAL_DURATION", Float.valueOf(C0VGQ.LIZ(size, metric6)));
                            jSONObject.put("FIRST_DRAW_FRAME", Float.valueOf(C0VGQ.LIZ(size, metric7)));
                            if (Build.VERSION.SDK_INT >= 31) {
                                jSONObject.put("GPU_DURATION", Float.valueOf(C0VGQ.LIZ(size, metric)));
                                jSONObject.put("DEADLINE", Float.valueOf(C0VGQ.LIZ(size, metric3)));
                            }
                            C20684815ws.LJIJ("ui_draw_time_report", jSONObject);
                        }
                    }
                }
            };
            C0V29 c0v29 = c0v2a.LJFF;
            if (c0v29 != null) {
                c0v29.LJI = c0v21;
            }
        }
        this.LJII = C452501pT.LIZIZ(new C0VW3(this));
        this.LJIIIIZZ = new Runnable() { // from class: X.0N4R
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("RealFpsMonitor@393d.delayStopRunnable$1");
                try {
                    this.LL.stop();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("RealFpsMonitor@393d.delayStopRunnable$1");
            }
        };
    }

    @Override // X.InterfaceC1602960roc
    public final void LIZIZ(RecyclerView recyclerView) {
        if (!TextUtils.equals(this.LIZ, "user_profile")) {
            C582550Mt3.LIZ = this.LIZ;
        }
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new AsS40S0100000_13(this, 1));
        }
    }

    @Override // X.InterfaceC1602960roc
    public final void LIZJ(long j) {
        C2487409ou.LIZLLL(j, new ARunnableS109S0100000_9(this, 115));
    }

    @Override // X.InterfaceC1602960roc
    public final InterfaceC1602960roc LIZLLL(C0OQN c0oqn) {
        this.LJI = c0oqn;
        return this;
    }

    @Override // X.InterfaceC1602960roc
    public final void LJFF(AbstractC1616220sA0 abstractC1616220sA0) {
        C582550Mt3.LIZ = this.LIZ;
        if (abstractC1616220sA0 != null) {
            abstractC1616220sA0.LIZJ(new C360660ECa() { // from class: X.0VW4
                @Override // X.C360660ECa, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            this.LL.start();
                            C798970VVv c798970VVv = this.LL;
                            if (((Boolean) c798970VVv.LJII.getValue()).booleanValue()) {
                                C202103146b.LIZ(1, c798970VVv.LIZ).LIZIZ(1.0f);
                                return;
                            }
                            return;
                        }
                        this.LL.start();
                        C798970VVv c798970VVv2 = this.LL;
                        if (((Boolean) c798970VVv2.LJII.getValue()).booleanValue()) {
                            C202103146b.LIZ(1, c798970VVv2.LIZ).LIZIZ(1.0f);
                        }
                        C800880VbK.LIZIZ(this.LL.LIZ);
                        return;
                    }
                    this.LL.stop();
                    C798970VVv c798970VVv3 = this.LL;
                    if (((Boolean) c798970VVv3.LJII.getValue()).booleanValue()) {
                        C202103146b.LIZ(1, c798970VVv3.LIZ).stop();
                    }
                    C800880VbK.LIZ();
                }
            });
        }
    }

    @Override // X.InterfaceC1602960roc
    public final void LJII(VerticalViewPager verticalViewPager) {
        if (!((Boolean) C275040AqE.LIZ.getValue()).booleanValue()) {
            return;
        }
        C582550Mt3.LIZ = this.LIZ;
        if (verticalViewPager != null) {
            verticalViewPager.LIZJ(new C360660ECa() { // from class: X.0VW1
                @Override // X.C360660ECa, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            C798970VVv c798970VVv = this.LL;
                            c798970VVv.stop();
                            if (c798970VVv.LJIIIZ) {
                                c798970VVv.LJIIIZ = false;
                                C2487409ou.LIZ(c798970VVv.LJIIIIZZ);
                                return;
                            }
                            return;
                        }
                        C798970VVv c798970VVv2 = this.LL;
                        c798970VVv2.stop();
                        if (!c798970VVv2.LJIIIZ) {
                            return;
                        }
                        c798970VVv2.LJIIIZ = false;
                        C2487409ou.LIZ(c798970VVv2.LJIIIIZZ);
                        return;
                    }
                    C798970VVv c798970VVv3 = this.LL;
                    c798970VVv3.start();
                    C2487409ou.LIZLLL(((Number) C275240AqY.LIZ.getValue()).longValue(), c798970VVv3.LJIIIIZZ);
                    c798970VVv3.LJIIIZ = true;
                }
            });
        }
    }

    @Override // X.InterfaceC1602960roc
    public final void LJIIIZ(ViewPager viewPager) {
        C582550Mt3.LIZ = this.LIZ;
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(new C360660ECa() { // from class: X.0VW6
                @Override // X.C360660ECa, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            this.LL.start();
                            return;
                        } else {
                            this.LL.start();
                            return;
                        }
                    }
                    this.LL.stop();
                }
            });
        }
    }

    @Override // X.InterfaceC1602960roc
    public final InterfaceC1602960roc LJIIJ(C0VWC c0vwc) {
        this.LJFF = c0vwc;
        return this;
    }

    @Override // X.InterfaceC1602960roc
    public final InterfaceC1602960roc LIZ(String str, String str2) {
        C0VF0 c0vf0 = this.LIZJ;
        if (c0vf0 != null) {
            c0vf0.LLIZ.put(str, str2);
        }
        return this;
    }

    @Override // X.InterfaceC1602960roc
    public final InterfaceC1602960roc LJIIJJI(Object obj, String str) {
        C0VF0 c0vf0;
        if ((obj instanceof String) && (c0vf0 = this.LIZJ) != null) {
            c0vf0.LLIZ.put(str, obj);
        }
        return this;
    }

    @Override // X.InterfaceC1602960roc
    public final void LJ(final VerticalViewPager verticalViewPager, final Function0 function0, final Function0 function02, final Function0 function03) {
        C582550Mt3.LIZ = this.LIZ;
        if (verticalViewPager != null) {
            verticalViewPager.LIZJ(new C360660ECa() { // from class: X.0VW5
                @Override // X.C360660ECa, X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            if (function03.invoke().booleanValue()) {
                                Function0<Unit> function04 = function0;
                                if (function04 != null) {
                                    function04.invoke();
                                    return;
                                }
                                return;
                            }
                            verticalViewPager.LIZLLL(this);
                            return;
                        }
                        if (function03.invoke().booleanValue()) {
                            Function0<Unit> function05 = function0;
                            if (function05 != null) {
                                function05.invoke();
                            }
                        } else {
                            verticalViewPager.LIZLLL(this);
                        }
                        C800880VbK.LIZIZ(this.LIZ);
                        return;
                    }
                    if (function03.invoke().booleanValue()) {
                        Function0<Unit> function06 = function02;
                        if (function06 != null) {
                            function06.invoke();
                        }
                    } else {
                        verticalViewPager.LIZLLL(this);
                    }
                    C800880VbK.LIZ();
                }
            });
        }
    }
}
