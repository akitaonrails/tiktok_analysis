package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.impl.AbsBaseMixPageHost$addLifeCycleObserver$1$1;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.trace.BasePerfData;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.trace.BasePerfRecorder;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z5N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1882430z5N implements InterfaceC1882450z5P, InterfaceC1882750z5t, InterfaceC1882630z5h {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final Context LL;
    public final String LLILLJJLI;
    public boolean LLILLL;
    public Fragment LLILZ;
    public LifecycleOwner LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1882440z5O(this));
    public final C01GW LLJ = C452501pT.LIZIZ(new C1882390z5J(this));
    public final C01GW LLJI = C452501pT.LIZIZ(new C1882400z5K(this));
    public final C1882460z5Q LLJIJIL;

    public void LJIIJ(Object obj, String str) {
    }

    public void LJIIJJI(String str, InterfaceC1881290z3X interfaceC1881290z3X) {
    }

    public abstract void LJIILL(boolean z);

    public abstract void LJIJJ(FragmentManager fragmentManager);

    public final void LJI() {
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        LJIIIZ().onDestroy();
        LJIIIZ().getEventCenter().LJ(this);
        C1882650z5j.LIZLLL(this);
        LJIILIIL();
    }

    public final C1882410z5L LJII() {
        return (C1882410z5L) this.LLJ.getValue();
    }

    public final C1882410z5L LJIIIIZZ() {
        return (C1882410z5L) this.LLJI.getValue();
    }

    public final InterfaceC1881340z3c LJIIIZ() {
        return (InterfaceC1881340z3c) this.LLIZLLLIL.getValue();
    }

    public final void LJIIL() {
        if (this.LLIZ) {
            this.LLIZ = false;
            LJIIIZ().onHide();
            LJIILJJIL();
        }
    }

    public final void LJIJI() {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        LJIIIZ().onShow();
        LJIILLIIL();
    }

    public void LJIILIIL() {
        final BasePerfRecorder basePerfRecorder;
        Object c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(": onDestroy");
        C20441214yg.LIZIZ("AbsBaseMixPageHost", C2188811AlT.LIZIZ(sbLIZ));
        C09GF c09gf = C09GF.LIZ;
        String strLIZLLL = LJIIIZ().LIZLLL();
        c09gf.getClass();
        try {
            if (C09GF.LIZ() && (basePerfRecorder = (BasePerfRecorder) ((ConcurrentHashMap) C09GF.LIZJ.getValue()).remove(strLIZLLL)) != null) {
                try {
                    basePerfRecorder.LIZLLL = true;
                    basePerfRecorder.LJFF.removeMessages(100);
                    c098200Yq = C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.1DhC
                        public final void LIZ() {
                            BasePerfRecorder basePerfRecorder2 = basePerfRecorder;
                            basePerfRecorder2.LIZ().quitCpuRate = basePerfRecorder2.LIZIZ();
                            basePerfRecorder2.LIZ().quitMemoryUsage = basePerfRecorder2.LIZJ();
                            BasePerfData basePerfDataLIZ = basePerfRecorder2.LIZ();
                            IHostPerformanceMonitor iHostPerformanceMonitor = basePerfRecorder2.LIZJ;
                            basePerfDataLIZ.quitGpuUsage = iHostPerformanceMonitor != null ? iHostPerformanceMonitor.Sb2() : 0.0d;
                            basePerfRecorder2.LIZ().averageMemoryUsageIncrease = basePerfRecorder2.LIZ().averageMemoryUsage - basePerfRecorder2.LIZ().baselineMemoryUsage;
                            basePerfRecorder2.LIZ().averageCpuRateIncrease = basePerfRecorder2.LIZ().averageCpuRate - basePerfRecorder2.LIZ().baselineCpuRate;
                            basePerfRecorder2.LIZ().averageGpuUsageIncrease = basePerfRecorder2.LIZ().averageGpuUsage - basePerfRecorder2.LIZ().baselineGpuUsage;
                            String strLIZLLL2 = C1058250de3.LIZLLL(basePerfRecorder.LIZ());
                            if (strLIZLLL2 != null) {
                                BasePerfRecorder basePerfRecorder3 = basePerfRecorder;
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_partnership_mix_page_base_perf");
                                c474500IjALIZ.LJJII(basePerfRecorder3.LIZ, "mix_page_tag");
                                c474500IjALIZ.LJJIIJZLJL(new JSONObject(strLIZLLL2));
                                c474500IjALIZ.LIZ();
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("BasePerfRecorder@d347.report$1$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("BasePerfRecorder@d347.report$1$1");
                        }
                    });
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public void LJIILJJIL() {
        BasePerfRecorder basePerfRecorder;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(": onHide");
        C20441214yg.LIZIZ("AbsBaseMixPageHost", C2188811AlT.LIZIZ(sbLIZ));
        C09GF c09gf = C09GF.LIZ;
        String strLIZLLL = LJIIIZ().LIZLLL();
        c09gf.getClass();
        try {
            if (C09GF.LIZ() && (basePerfRecorder = (BasePerfRecorder) ((ConcurrentHashMap) C09GF.LIZJ.getValue()).get(strLIZLLL)) != null) {
                basePerfRecorder.LJ = true;
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public void LJIILLIIL() {
        final BasePerfRecorder basePerfRecorder;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(": onShow");
        C20441214yg.LIZIZ("AbsBaseMixPageHost", C2188811AlT.LIZIZ(sbLIZ));
        C09GF c09gf = C09GF.LIZ;
        String strLIZLLL = LJIIIZ().LIZLLL();
        c09gf.getClass();
        try {
            if (C09GF.LIZ() && (basePerfRecorder = (BasePerfRecorder) ((ConcurrentHashMap) C09GF.LIZJ.getValue()).get(strLIZLLL)) != null) {
                basePerfRecorder.LJ = false;
                C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.1DhE
                    public final void LIZ() {
                        BasePerfRecorder basePerfRecorder2 = basePerfRecorder;
                        if (basePerfRecorder2.LIZ().increaseMemory <= 0.0d) {
                            basePerfRecorder2.LIZ().increaseMemory = basePerfRecorder2.LIZJ() - basePerfRecorder2.LIZ().baselineMemoryUsage;
                            basePerfRecorder2.LIZ().increaseCpuRate = basePerfRecorder2.LIZIZ() - basePerfRecorder2.LIZ().baselineCpuRate;
                            BasePerfData basePerfDataLIZ = basePerfRecorder2.LIZ();
                            IHostPerformanceMonitor iHostPerformanceMonitor = basePerfRecorder2.LIZJ;
                            basePerfDataLIZ.increaseGpuUsage = (iHostPerformanceMonitor != null ? iHostPerformanceMonitor.Sb2() : 0.0d) - basePerfRecorder2.LIZ().baselineGpuUsage;
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("BasePerfRecorder@d347.pageOnResume$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("BasePerfRecorder@d347.pageOnResume$1");
                    }
                });
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC1882450z5P
    public final InterfaceC1881340z3c getPage() {
        return LJIIIZ();
    }

    @Override // X.InterfaceC1882450z5P
    public final C1882460z5Q LIZ() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1882450z5P
    public final LifecycleOwner LJJJJ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1882450z5P
    public final Fragment getFragment() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1882450z5P
    public View LJ(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gmy, viewGroup, false);
    }

    public final void LJIIZILJ(String str) {
        LJIIIZ().getEventCenter().LIZJ(str, this);
    }

    public final void e(Fragment fragment) {
        this.LLILZ = fragment;
        if (this.LLILZIL == null) {
            this.LLILZIL = fragment;
            if (!this.LLILLL && fragment != null) {
                this.LLILLL = true;
                fragment.getLifecycle().addObserver(new AbsBaseMixPageHost$addLifeCycleObserver$1$1(this, fragment));
            }
        }
    }

    public final void h(FrameLayout frameLayout) {
        LifecycleOwner lifecycleOwner;
        LJIIIZ().LJIIL(frameLayout);
        if (!this.LLILLL && (lifecycleOwner = this.LLILZIL) != null) {
            this.LLILLL = true;
            lifecycleOwner.getLifecycle().addObserver(new AbsBaseMixPageHost$addLifeCycleObserver$1$1(this, lifecycleOwner));
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0z5Q] */
    public AbstractC1882430z5N(Context context, String str) {
        this.LL = context;
        this.LLILLJJLI = str;
        if (str.length() > 0) {
            C09GF c09gf = C09GF.LIZ;
            String strLIZLLL = LJIIIZ().LIZLLL();
            c09gf.getClass();
            try {
                if (C09GF.LIZ()) {
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C09GF.LIZJ.getValue();
                    if (concurrentHashMap.get(strLIZLLL) == null) {
                        concurrentHashMap.putIfAbsent(strLIZLLL, new BasePerfRecorder(str));
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(": onCreate");
        C20441214yg.LIZIZ("AbsBaseMixPageHost", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJIJIL = new AbstractC1882470z5R() { // from class: X.0z5Q
            @Override // X.AbstractC1882470z5R
            public final void LIZ(boolean z) {
                this.LIZIZ.LJIILL(z);
            }
        };
    }

    @Override // X.InterfaceC1882450z5P
    public View LIZIZ(ViewGroup viewGroup, C1883300z6m c1883300z6m) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.gmx, viewGroup, false);
        C1749280vcc c1749280vcc = (C1749280vcc) viewTd.findViewById(R.id.tf5);
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LJFF(c1722300uv6, c1883300z6m);
            c1749280vcc.setStatus(c1722300uv6);
        }
        return viewTd;
    }

    public final void LJIJ(C1881730z4F<C1881820z4O> c1881730z4F, boolean z) {
        if (z) {
            this.LLJIJIL.LIZ.setValue(c1881730z4F);
        } else {
            this.LLJIJIL.LIZ.postValue(c1881730z4F);
        }
    }

    @Override // X.InterfaceC1882630z5h
    public final void LJIJJLI(String str, InterfaceC1881290z3X interfaceC1881290z3X) {
        LJIIJJI(str, interfaceC1881290z3X);
    }

    @Override // X.InterfaceC1882750z5t
    public final void y60(Object obj, String str) {
        LJIIJ(obj, str);
    }
}
