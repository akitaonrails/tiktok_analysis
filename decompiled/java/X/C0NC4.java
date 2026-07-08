package X;

import Y.ACListenerS113S0200000_9;
import Y.ARunnableS78S0200000_9;
import Y.AfS178S0100000_9;
import android.content.Context;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NC4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public abstract class C0NC4<CATEGORY, DATA> implements C0NC5<CATEGORY, DATA> {
    public final C19YA LIZ;
    public InterfaceC1640700snU<CATEGORY, DATA> LIZIZ;
    public final List<Pair<CATEGORY, List<DATA>>> LIZJ = new ArrayList();
    public int LIZLLL = -1;
    public final C11RK LJ = new C11RK();
    public final C11RK LJFF = new C11RK();
    public C11NJ LJI;

    public abstract void LJ(int i, int i2, View view, Object obj);

    public abstract View LJFF(Context context, CATEGORY category);

    public abstract void LJI(View view);

    public abstract void LJIIIIZZ(View view, int i);

    @Override // X.C0NC5
    public final C19475711Hn LIZ() {
        C11RK c11rk = this.LJ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.C0NC5
    public final C19475711Hn LIZLLL() {
        C11RK c11rk = this.LJFF;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public C0NC4(C19YA c19ya) {
        this.LIZ = c19ya;
        int visibility = c19ya.getVisibility();
        c19ya.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c19ya);
        c19ya.setTabMargin(0);
    }

    @Override // X.C0NC5
    public final void LIZJ(C1640500snA c1640500snA) {
        C11NJ c11nj = this.LJI;
        if (c11nj != null) {
            c11nj.dispose();
        }
        C11NJ c11nj2 = new C11NJ();
        this.LJI = c11nj2;
        C19475711Hn c19475711HnLJIJJLI = c1640500snA.LJIJJLI();
        AfS178S0100000_9 afS178S0100000_9 = new AfS178S0100000_9(this, 51);
        C09HM c09hm = C09HN.LIZ;
        c11nj2.LIZ(c19475711HnLJIJJLI.LJJLL(afS178S0100000_9, c09hm));
        C11NJ c11nj3 = this.LJI;
        if (c11nj3 != null) {
            c11nj3.LIZ(c1640500snA.LJJIL().LJJLL(new AfS178S0100000_9(this, 52), c09hm));
        }
        this.LIZIZ = c1640500snA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJII(List<? extends Pair<? extends CATEGORY, ? extends List<? extends DATA>>> list) {
        ((ArrayList) this.LIZJ).clear();
        ((ArrayList) this.LIZJ).addAll(list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends Pair<? extends CATEGORY, ? extends List<? extends DATA>>> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getFirst());
        }
        this.LIZ.removeAllTabs();
        int i = 0;
        int i2 = 0;
        for (Object obj : arrayList) {
            View viewLJFF = LJFF(this.LIZ.getContext(), obj);
            C12H3 c12h3NewTab = this.LIZ.newTab();
            c12h3NewTab.LJ = viewLJFF;
            c12h3NewTab.LIZIZ();
            this.LIZ.addTab(c12h3NewTab);
            C786410Ut5.I7(new ACListenerS113S0200000_9(this, obj, 35), viewLJFF);
            LJ(i2, arrayList.size(), this.LIZ.getTabView(i2), obj);
            i2++;
        }
        HandlerHook.viewPost(this.LIZ, new ARunnableS78S0200000_9(this, list, 55));
        C19YA c19ya = this.LIZ;
        if (list.isEmpty()) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, c19ya);
    }

    @Override // X.C0NC5
    public final void LIZIZ(CATEGORY category, boolean z) {
        int i;
        View view;
        Pair pair;
        List list;
        Object objLJJJLL;
        InterfaceC1640700snU<CATEGORY, DATA> interfaceC1640700snU;
        if (category != null) {
            Iterator it2 = ((ArrayList) this.LIZJ).iterator();
            i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((Pair) it2.next()).getFirst(), category)) {
                    break;
                } else {
                    i++;
                }
            }
            i = -1;
        } else {
            i = -1;
        }
        if (z && i >= 0 && (pair = (Pair) C13LP.LJJJLZIJ(i, this.LIZJ)) != null && (list = (List) pair.getSecond()) != null && (objLJJJLL = C13LP.LJJJLL(list)) != null && (interfaceC1640700snU = this.LIZIZ) != null) {
            interfaceC1640700snU.LIZ(i, objLJJJLL);
        }
        int i2 = this.LIZLLL;
        View view2 = null;
        if (i2 != i && i2 >= 0) {
            this.LIZ.getTabAt(i2);
            C12H3 tabAt = this.LIZ.getTabAt(this.LIZLLL);
            if (tabAt != null) {
                view = tabAt.LJ;
            } else {
                view = null;
            }
            LJIIIIZZ(view, this.LIZLLL);
        }
        if (i >= 0 && this.LIZLLL != i) {
            C12H3 tabAt2 = this.LIZ.getTabAt(i);
            if (tabAt2 != null) {
                view2 = tabAt2.LJ;
            }
            LJI(view2);
            this.LIZ.smoothSelectTab(tabAt2, true);
        }
        this.LIZLLL = i;
    }
}
