package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dJg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045620dJg extends C1045660dJk {
    public final Map<String, AbstractC1045600dJe> LIZIZ;
    public final Map<String, C1045570dJb> LIZJ;

    public C1045620dJg(InterfaceC1045930dKB interfaceC1045930dKB) {
        super(interfaceC1045930dKB);
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = new LinkedHashMap();
    }

    public final AbstractC1045600dJe LJIILLIIL(final C1045720dJq c1045720dJq) {
        if (!c1045720dJq.LIZ) {
            return null;
        }
        String strLJ = LJ(c1045720dJq);
        AbstractC1045600dJe abstractC1045600dJe = (AbstractC1045600dJe) ((LinkedHashMap) this.LIZIZ).get(strLJ);
        if (abstractC1045600dJe == null) {
            InterfaceC1046010dKJ interfaceC1046010dKJ = new InterfaceC1046010dKJ() { // from class: X.0dJo
                @Override // X.InterfaceC1046010dKJ
                public final void LIZ() {
                    String str;
                    Function0<C1045870dK5> tracker;
                    C1045870dK5 c1045870dK5Invoke;
                    InterfaceC1045710dJp interfaceC1045710dJpLJI = this.LIZ.LJI();
                    if (interfaceC1045710dJpLJI == null || (tracker = interfaceC1045710dJpLJI.getTracker()) == null || (c1045870dK5Invoke = tracker.invoke()) == null || (str = c1045870dK5Invoke.LIZ) == null) {
                        str = "draw_ad";
                    }
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str, "viewable_2s", c1045720dJq.LJIIIZ);
                    c1022820ciuLIZLLL.LIZIZ(1, "is_piv");
                    c1022820ciuLIZLLL.LJII();
                }
            };
            if (C1045940dKC.LIZ.LIZ) {
                C1045610dJf c1045610dJf = new C1045610dJf(interfaceC1046010dKJ);
                this.LIZIZ.put(strLJ, c1045610dJf);
                return c1045610dJf;
            }
            throw new IllegalStateException("ViewabilitySDKManager has to be active");
        }
        return abstractC1045600dJe;
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJIIJJI(C1045720dJq c1045720dJq, Context context) {
        super.LJIIJJI(c1045720dJq, context);
        C1045570dJb c1045570dJbLJIILL = LJIILL(c1045720dJq, null, C13BV.INSTANCE);
        if (c1045570dJbLJIILL != null) {
            C1045580dJc.LIZIZ(c1045570dJbLJIILL.LIZ);
            c1045570dJbLJIILL.LIZ.LJI();
        }
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJIIL(Context context, C1045720dJq c1045720dJq) {
        super.LJIIL(context, c1045720dJq);
        AbstractC1045600dJe abstractC1045600dJeLJIILLIIL = LJIILLIIL(c1045720dJq);
        if (abstractC1045600dJeLJIILLIIL != null) {
            abstractC1045600dJeLJIILLIIL.LIZIZ();
        }
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LIZ(C1045720dJq c1045720dJq, Context context, int i) {
        C1045570dJb c1045570dJbLJIILL;
        super.LIZ(c1045720dJq, context, i);
        if (i == 0 && (c1045570dJbLJIILL = LJIILL(c1045720dJq, null, C13BV.INSTANCE)) != null) {
            C1045580dJc.LIZIZ(c1045570dJbLJIILL.LIZ);
            C1045610dJf c1045610dJf = c1045570dJbLJIILL.LIZ;
            c1045610dJf.getClass();
            c1045610dJf.LJII = System.nanoTime();
            C1046040dKM.LJ.LIZ();
        }
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJIIJ(C1045720dJq c1045720dJq, Context context, int i) {
        C1045570dJb c1045570dJbLJIILL;
        super.LJIIJ(c1045720dJq, context, i);
        if (i == 0 && (c1045570dJbLJIILL = LJIILL(c1045720dJq, null, C13BV.INSTANCE)) != null) {
            C1045580dJc.LIZIZ(c1045570dJbLJIILL.LIZ);
            c1045570dJbLJIILL.LIZ.LJI();
            C1046040dKM.LJ.LIZIZ();
        }
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJIILIIL(C1045720dJq c1045720dJq, Context context, int i) {
        super.LJIILIIL(c1045720dJq, context, i);
        if (i == 1) {
            C1045570dJb c1045570dJbLJIILL = LJIILL(c1045720dJq, null, C13BV.INSTANCE);
            if (c1045570dJbLJIILL != null) {
                C1045580dJc.LIZIZ(c1045570dJbLJIILL.LIZ);
                c1045570dJbLJIILL.LIZ.LJI();
            }
            AbstractC1045600dJe abstractC1045600dJeLJIILLIIL = LJIILLIIL(c1045720dJq);
            if (abstractC1045600dJeLJIILLIIL != null) {
                abstractC1045600dJeLJIILLIIL.LIZIZ();
            }
        }
    }

    public final C1045570dJb LJIILL(C1045720dJq c1045720dJq, View view, List<? extends View> list) {
        C1045570dJb c1045570dJbLIZ = null;
        if (!c1045720dJq.LIZ) {
            return null;
        }
        String strLJ = LJ(c1045720dJq);
        C1045570dJb c1045570dJb = (C1045570dJb) ((LinkedHashMap) this.LIZJ).get(strLJ);
        if (c1045570dJb == null) {
            String strLJ2 = LJ(c1045720dJq);
            AbstractC1045600dJe abstractC1045600dJeLJIILLIIL = LJIILLIIL(c1045720dJq);
            if (abstractC1045600dJeLJIILLIIL != null && view != null) {
                c1045570dJbLIZ = C1045570dJb.LIZ(abstractC1045600dJeLJIILLIIL);
                this.LIZJ.put(strLJ2, c1045570dJbLIZ);
                abstractC1045600dJeLJIILLIIL.LIZJ(view);
                Iterator<? extends View> it2 = list.iterator();
                while (it2.hasNext()) {
                    abstractC1045600dJeLJIILLIIL.LIZ(it2.next());
                }
                abstractC1045600dJeLJIILLIIL.LJFF();
            }
            this.LIZJ.put(strLJ, c1045570dJbLIZ);
            return c1045570dJbLIZ;
        }
        return c1045570dJb;
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJFF(C1045720dJq c1045720dJq, Context context, int i, View view) {
        C1045570dJb c1045570dJbLJIILL;
        Function0<Long> duration;
        super.LJFF(c1045720dJq, context, i, view);
        if (i == 0 && (c1045570dJbLJIILL = LJIILL(c1045720dJq, null, C13BV.INSTANCE)) != null) {
            InterfaceC1045710dJp interfaceC1045710dJpLJI = LJI();
            if (interfaceC1045710dJpLJI != null && (duration = interfaceC1045710dJpLJI.getDuration()) != null && duration.invoke().longValue() < 0.0f) {
                throw new IllegalArgumentException("media duration could not be small than zero");
            }
            C1045580dJc.LIZIZ(c1045570dJbLJIILL.LIZ);
            C1045610dJf c1045610dJf = c1045570dJbLJIILL.LIZ;
            c1045610dJf.getClass();
            c1045610dJf.LJII = System.nanoTime();
        }
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJII(C1045720dJq c1045720dJq, View view, List<? extends View> list, String str) {
        Integer numLIZ;
        super.LJII(c1045720dJq, view, list, str);
        if (C04UM.LIZ() || (numLIZ = SharePrefCache.inst().getEnableBindItemCallOMSDK().LIZ()) == null || numLIZ.intValue() != 0) {
            LJIILL(c1045720dJq, view, list);
        }
    }

    @Override // X.C1045660dJk, X.InterfaceC1045690dJn
    public final void LJIILJJIL(C1045720dJq c1045720dJq, Context context, View view, List<? extends View> list) {
        this.LIZ.LJIILJJIL(c1045720dJq, context, view, list);
        AbstractC1045600dJe abstractC1045600dJe = (AbstractC1045600dJe) ((LinkedHashMap) this.LIZIZ).get(this.LIZ.LJ(c1045720dJq));
        if (abstractC1045600dJe != null) {
            abstractC1045600dJe.LIZJ(view);
            abstractC1045600dJe.LIZLLL();
            Iterator<? extends View> it2 = list.iterator();
            while (it2.hasNext()) {
                abstractC1045600dJe.LIZ(it2.next());
            }
            C1045570dJb c1045570dJbLIZ = C1045570dJb.LIZ(abstractC1045600dJe);
            C1045580dJc.LIZIZ(c1045570dJbLIZ.LIZ);
            C1045610dJf c1045610dJf = c1045570dJbLIZ.LIZ;
            c1045610dJf.getClass();
            c1045610dJf.LJII = System.nanoTime();
            C1046040dKM.LJ.LIZ();
        }
    }
}
