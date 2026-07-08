package X;

import Y.AObserverS227S0100000_25;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.absetting.EffectDiscoveryButtonMovedToRightExperiment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sfH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1635610sfH<TabView> implements InterfaceC1630240sWc {
    public final C19YA LL;
    public final C19EG LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final C1635820sfc LLILZ;
    public final InterfaceC1625820sPU LLILZIL;
    public final C1630880sXe LLILZLL;
    public final InterfaceC1635640sfK LLIZ;
    public final InterfaceC1635660sfM<TabView, ?> LLIZLLLIL;
    public final C11RK<Pair<EffectCategoryModel, Integer>> LLJ = new C11RK<>();
    public final C11PQ<Pair<EffectCategoryModel, Integer>> LLJI = new C11PQ<>();
    public final List<EffectCategoryModel> LLJIJIL = new ArrayList();
    public boolean LLJILJIL;

    public abstract View LIZ(C19EG c19eg, EffectCategoryModel effectCategoryModel, int i, Function2<? super EffectCategoryModel, ? super Integer, Unit> function2);

    public abstract void LJFF(EffectCategoryModel effectCategoryModel);

    @Override // X.InterfaceC1625800sPS
    public final C11NZ<Integer> Cm() {
        return this.LLILZIL.Cm();
    }

    public final C19475711Hn LIZIZ() {
        C11PQ<Pair<EffectCategoryModel, Integer>> c11pq = this.LLJI;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    public final C19475711Hn LIZLLL() {
        C11RK<Pair<EffectCategoryModel, Integer>> c11rk = this.LLJ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1630240sWc
    public final void LLZ() {
        if (C2281551ESb.LIZIZ.LJFF().LIZ() && !this.LLJILJIL) {
            this.LLJILJIL = true;
            List<? extends EffectCategoryModel> list = (List) this.LLIZ.t().getValue();
            if (list != null) {
                LIZJ(list);
            }
            this.LLIZ.lE();
        }
        String strXs2 = this.LLIZ.Xs2();
        if (strXs2 != null) {
            YL(strXs2, false);
        }
        this.LLIZ.Pv2();
    }

    @Override // X.InterfaceC1625810sPT
    public final void LIZJ(List<? extends EffectCategoryModel> list) {
        C12H3 tabAt;
        this.LLILZIL.LIZJ(list);
        ((ArrayList) this.LLJIJIL).clear();
        ((ArrayList) this.LLJIJIL).addAll(list);
        if (this.LLILZ.LJIIIZ) {
            C1645610svP.LIZIZ(this.LL, list.size());
        }
        boolean z = !Intrinsics.LJFF(this.LLIZ.on1().getValue(), Boolean.TRUE);
        this.LL.removeAllTabs();
        if (EffectDiscoveryButtonMovedToRightExperiment.isEnabled()) {
            int i = 0;
            for (EffectCategoryModel effectCategoryModel : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    View viewLIZ = LIZ(this.LLILLJJLI, effectCategoryModel, i, new C1635620sfI(this));
                    C19YA c19ya = this.LL;
                    C12H3 c12h3NewTab = c19ya.newTab();
                    c12h3NewTab.LJFF = false;
                    c12h3NewTab.LJ = viewLIZ;
                    c12h3NewTab.LIZIZ();
                    c19ya.addTab(c12h3NewTab, false, list.size());
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            int i3 = 0;
            for (EffectCategoryModel effectCategoryModel2 : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    View viewLIZ2 = LIZ(this.LLILLJJLI, effectCategoryModel2, i3, new C1635630sfJ(this));
                    C19YA c19ya2 = this.LL;
                    C12H3 c12h3NewTab2 = c19ya2.newTab();
                    c12h3NewTab2.LJFF = false;
                    c12h3NewTab2.LJ = viewLIZ2;
                    c12h3NewTab2.LIZIZ();
                    c19ya2.addTab(c12h3NewTab2, false);
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (!z && (tabAt = this.LL.getTabAt(this.LLIZ.eK2())) != null) {
            tabAt.LIZ();
        }
    }

    @Override // X.InterfaceC1625800sPS
    public final void in(boolean z) {
        this.LLILZIL.in(z);
    }

    @Override // X.InterfaceC1625800sPS
    public final void qB(Effect effect) {
        this.LLILZIL.qB(effect);
    }

    @Override // X.InterfaceC1625820sPU
    public final void qM(int i) {
        this.LLILZIL.qM(i);
    }

    public final void LJ(int i, EffectCategoryModel effectCategoryModel) {
        this.LLILZLL.LIZ.LJJIIZ(System.currentTimeMillis());
        this.LLJ.onNext(new Pair<>(effectCategoryModel, Integer.valueOf(i)));
        qM(i);
    }

    @Override // X.InterfaceC1625820sPU
    public final void YL(String str, boolean z) {
        this.LLILZIL.YL(str, z);
    }

    public AbstractC1635610sfH(C19561611g6 c19561611g6, C19EG c19eg, LifecycleOwner lifecycleOwner, C1635820sfc c1635820sfc, C1636890shL c1636890shL, C1630880sXe c1630880sXe, InterfaceC1635640sfK interfaceC1635640sfK, InterfaceC1635660sfM interfaceC1635660sfM) {
        this.LL = c19561611g6;
        this.LLILLJJLI = c19eg;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = c1635820sfc;
        this.LLILZIL = c1636890shL;
        this.LLILZLL = c1630880sXe;
        this.LLIZ = interfaceC1635640sfK;
        this.LLIZLLLIL = interfaceC1635660sfM;
        final C1635590sfF c1635590sfF = (C1635590sfF) this;
        c19561611g6.addOnTabSelectedListener(new InterfaceC19561911g9() { // from class: X.0sfD
            @Override // X.InterfaceC19561911g9
            public final void LIZ(C12H3 c12h3) {
            }

            @Override // X.InterfaceC19561911g9
            public final void LIZIZ(C12H3 c12h3) {
            }

            @Override // X.InterfaceC19561911g9
            public final void LIZJ(C12H3 c12h3, boolean z) {
                View view;
                if (c12h3 != null && (view = c12h3.LJ) != null && (view instanceof C1642680sqg)) {
                    ((C1642680sqg) view).LIZ(false);
                }
                int i = c12h3.LIZLLL;
                EffectCategoryModel effectCategoryModel = (EffectCategoryModel) ListProtector.get(c1635590sfF.LLJIJIL, i);
                if (effectCategoryModel.getKey() != null && Intrinsics.LJFF(c1635590sfF.LLIZ.on1().getValue(), Boolean.TRUE)) {
                    c1635590sfF.LLILZLL.LJ.LIZJ(effectCategoryModel);
                    String name = effectCategoryModel.getName();
                    c1635590sfF.LLJI.onNext(new Pair<>(effectCategoryModel, Integer.valueOf(i)));
                    c1635590sfF.LLILZLL.LIZJ.LJIIJJI(effectCategoryModel.getKey(), name);
                }
            }
        });
        c1636890shL.Ng(new C19642311t7(this.LL));
        interfaceC1635640sfK.t().observe(this.LLILLL, new AObserverS227S0100000_25(c1635590sfF, 128));
        c19561611g6.setOnTabClickListener(new InterfaceC1638460sjs() { // from class: X.0sfN
            @Override // X.InterfaceC1638460sjs
            public final void LIZ(C12H3 c12h3) {
            }
        });
        if (!C2281551ESb.LIZIZ.LJFF().LIZ() || this.LLJILJIL) {
            interfaceC1635640sfK.lE();
        }
    }
}
