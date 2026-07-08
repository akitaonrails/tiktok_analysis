package X;

import Y.AsS37S0100000_10;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.ability.IVisualSearchHalfScreenAbility;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PjN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652990PjN {
    public final RecyclerView LIZ;
    public final Set<AbstractC653010PjP> LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final InterfaceC653030PjR LJFF;
    public final InterfaceC653050PjT LJI;
    public InterfaceC653000PjO LJII;
    public final boolean LJIIIIZZ;
    public Class LJIIIZ;
    public boolean LJIIJ;

    public final void LIZ() {
        if (C086I.LIZIZ(this.LIZIZ)) {
            return;
        }
        Iterator<AbstractC653010PjP> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ = 0;
        }
    }

    public final void LIZIZ() {
        if (C086I.LIZIZ(this.LIZIZ)) {
            return;
        }
        for (AbstractC653010PjP abstractC653010PjP : this.LIZIZ) {
            if (this.LJII.LIZIZ(abstractC653010PjP.LIZJ()) && !abstractC653010PjP.LIZIZ) {
                abstractC653010PjP.LIZIZ = true;
                abstractC653010PjP.LIZ();
            }
        }
    }

    public final boolean LIZLLL() {
        InterfaceC588610N6t interfaceC588610N6t;
        InterfaceC648350Pbt interfaceC648350PbtLJFF;
        Taco tacoLIZ = C0PCE.LIZ(this.LIZ, true);
        Class cls = this.LJIIIZ;
        return (cls == null || tacoLIZ == null || (interfaceC588610N6t = tacoLIZ.LLILLJJLI) == null || (interfaceC648350PbtLJFF = interfaceC588610N6t.LJFF()) == null || Intrinsics.LJFF(interfaceC648350PbtLJFF.getClass(), cls)) ? false : true;
    }

    public final void LIZJ() {
        AbstractC653010PjP abstractC653010PjPLIZJ;
        C19EG c19eg;
        ContextWrapper contextWrapper;
        IVisualSearchHalfScreenAbility iVisualSearchHalfScreenAbilityLIZIZ;
        C19EG c19eg2;
        if (LIZLLL() || C0PCF.LIZIZ(this.LIZ) || this.LJIIJ || this.LIZJ == 2 || C086I.LIZIZ(this.LIZIZ)) {
            return;
        }
        InterfaceC653050PjT interfaceC653050PjT = this.LJI;
        if ((interfaceC653050PjT == null || interfaceC653050PjT.LLD()) && (abstractC653010PjPLIZJ = this.LJII.LIZJ(this.LIZIZ)) != null) {
            RecyclerView recyclerView = this.LIZ;
            Context baseContext = null;
            Context context = recyclerView != null ? recyclerView.getContext() : null;
            if (!(context instanceof C19EG) || (c19eg2 = (C19EG) context) == null) {
                Context context2 = recyclerView != null ? recyclerView.getContext() : null;
                if ((context2 instanceof C488650JEh) && (contextWrapper = (ContextWrapper) context2) != null) {
                    baseContext = contextWrapper.getBaseContext();
                }
                if (baseContext instanceof C19EG) {
                    c19eg = (C19EG) baseContext;
                }
                abstractC653010PjPLIZJ.LJ(this.LIZJ);
            }
            c19eg = c19eg2;
            if (c19eg != null && (((iVisualSearchHalfScreenAbilityLIZIZ = C654510Plp.LIZIZ(c19eg)) != null && iVisualSearchHalfScreenAbilityLIZIZ.isShowing()) || C0QDN.LIZJ(c19eg))) {
                return;
            }
            abstractC653010PjPLIZJ.LJ(this.LIZJ);
        }
    }

    public final void LJ(AbstractC653010PjP abstractC653010PjP) {
        if (abstractC653010PjP != null) {
            abstractC653010PjP.LIZ = 0;
            abstractC653010PjP.LIZIZ = false;
            abstractC653010PjP.LIZIZ();
            this.LIZIZ.remove(abstractC653010PjP);
        }
    }

    public C652990PjN(RecyclerView recyclerView, InterfaceC653030PjR interfaceC653030PjR, InterfaceC653050PjT interfaceC653050PjT) {
        this.LJIIIIZZ = C0BE5.LIZ;
        this.LJIIIZ = null;
        this.LJIIJ = false;
        this.LJFF = interfaceC653030PjR;
        this.LJI = interfaceC653050PjT;
        this.LIZ = recyclerView;
        recyclerView.addOnScrollListener(new AsS37S0100000_10(this, 3));
        this.LIZIZ = new LinkedHashSet();
    }
}
