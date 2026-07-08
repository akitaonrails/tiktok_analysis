package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixCardModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixTabModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z6S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883100z6S implements InterfaceC1883040z6M, InterfaceC1883310z6n {
    public final Context LL;
    public final InterfaceC1883040z6M LLILLJJLI;
    public final MixTabModel LLILLL;
    public final boolean LLILZ;
    public final InterfaceC1883090z6R LLILZIL;
    public final int LLILZLL;
    public View LLIZ;
    public C1884300z8O LLIZLLLIL;
    public ViewGroup LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final List<InterfaceC1883030z6L> LLJILJIL = new ArrayList();
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C1883140z6W());
    public C1883120z6U LLJILLL;
    public AbstractC1883160z6Y LLJJ;
    public View LLJJI;
    public Integer LLJJIII;
    public boolean LLJJIJI;

    @Override // X.InterfaceC1883040z6M
    public final View getView() {
        throw null;
    }

    public final void LJIIL() {
        if (this.LLJJIJI) {
            return;
        }
        this.LLJJIJI = true;
        SystemClock.elapsedRealtime();
        Iterator it2 = ((ArrayList) this.LLJILJIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1883040z6M) it2.next()).LJII(this.LLJ);
        }
        if (this.LLJI) {
            C1883120z6U c1883120z6U = this.LLJILLL;
            if (c1883120z6U != null) {
                c1883120z6U.invoke();
            }
            this.LLJILLL = null;
        }
    }

    public final void LJIILIIL() {
        List<InterfaceC1883030z6L> list = this.LLJILJIL;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (InterfaceC1883030z6L interfaceC1883030z6L : list) {
                if (interfaceC1883030z6L.LJIIJ() == 3 && !interfaceC1883030z6L.LJFF()) {
                    LJJ(C1883230z6f.LIZ);
                    return;
                }
            }
        }
        List<InterfaceC1883030z6L> list2 = this.LLJILJIL;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (InterfaceC1883030z6L interfaceC1883030z6L2 : list2) {
                if (interfaceC1883030z6L2.LJIIJ() == 1 || interfaceC1883030z6L2.LJIIJ() == 0) {
                    LJJ(C1883240z6g.LIZ);
                    return;
                }
            }
        }
        LJJ(C1883260z6i.LIZ);
    }

    @Override // X.InterfaceC1883040z6M
    public final void destroy() {
        Iterator<InterfaceC1883030z6L> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            it2.next().destroy();
        }
        C1884300z8O c1884300z8O = this.LLIZLLLIL;
        if (c1884300z8O != null) {
            c1884300z8O.onDestroy();
        }
    }

    @Override // X.InterfaceC1882930z6B
    public final void onCreate() {
        List<MixCardModel> list = this.LLILLL.cards;
        if (list != null) {
            int i = 0;
            for (MixCardModel mixCardModel : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                MixCardModel mixCardModel2 = mixCardModel;
                if (mixCardModel2 != null) {
                    mixCardModel2.LIZIZ = i;
                    MixTabModel mixTabModel = this.LLILLL;
                    int i3 = mixTabModel.LIZ;
                    String str = mixTabModel.tabClass;
                    if (str == null) {
                        str = "";
                    }
                    mixCardModel2.LIZ = new C1881800z4M(i3, str);
                    InterfaceC1883030z6L interfaceC1883030z6LLIZ = this.LLILZIL.LJIILIIL().LIZ(this.LL, mixCardModel2);
                    if (interfaceC1883030z6LLIZ != null) {
                        ((ArrayList) this.LLJILJIL).add(interfaceC1883030z6LLIZ);
                        interfaceC1883030z6LLIZ.LJIJI(this);
                        interfaceC1883030z6LLIZ.onCreate();
                    }
                }
                i = i2;
            }
        }
    }

    @Override // X.InterfaceC1883040z6M
    public final void retry() {
        SystemClock.elapsedRealtime();
        Iterator<InterfaceC1883030z6L> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            it2.next().retry();
        }
    }

    @Override // X.InterfaceC1883040z6M
    public final InterfaceC1883040z6M getParent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1882930z6B
    public final View LIZIZ(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.h8b, viewGroup, false);
    }

    @Override // X.InterfaceC1883040z6M
    public final void LJII(ViewGroup viewGroup) {
        View viewLIZIZ = LIZIZ(viewGroup);
        if (viewLIZIZ != null) {
            this.LLIZ = viewLIZIZ;
            this.LLIZLLLIL = (C1884300z8O) viewLIZIZ.findViewById(R.id.ohy);
            this.LLJ = (ViewGroup) viewLIZIZ.findViewById(R.id.ohv);
            if (this.LLILZ) {
                LJIIL();
            }
        }
    }

    @Override // X.InterfaceC1883040z6M
    public final void LJIIJJI(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (!this.LLJI) {
            return;
        }
        if (this.LLJJIJI && (viewGroup2 = this.LLJ) != null) {
            Iterator it2 = ((ArrayList) this.LLJILJIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1883040z6M) it2.next()).LJIIJJI(viewGroup2);
            }
        }
        View view = this.LLIZ;
        if (view != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
        }
        this.LLILZIL.LJIIJJI().LJIIZILJ(this);
        this.LLJI = false;
        this.LLJILLL = null;
        LJIJJLI(this.LLJJI);
        LJIJ(1);
    }

    @Override // X.InterfaceC1883040z6M
    public final void LJIILJJIL(ViewGroup viewGroup) {
        if (this.LLJI) {
            return;
        }
        View view = this.LLIZ;
        if (view != null) {
            int i = this.LLILZLL;
            int childCount = viewGroup.getChildCount();
            if (i > childCount) {
                i = childCount;
            }
            viewGroup.addView(view, i);
        }
        this.LLJI = true;
        LJIILLIIL(1);
        this.LLILZIL.LJIIJJI().LIZ(this);
        C1883120z6U c1883120z6U = new C1883120z6U(this);
        this.LLJILLL = c1883120z6U;
        if (this.LLJJIJI) {
            c1883120z6U.invoke();
            this.LLJILLL = null;
        }
    }

    @Override // X.InterfaceC1883040z6M
    public final void LJIILL(Size size) {
        for (InterfaceC1883040z6M interfaceC1883040z6M : (ArrayList) this.LLJILJIL) {
            interfaceC1883040z6M.LJIILL(this.LLILZIL.LJIIJJI().LJIIJ(interfaceC1883040z6M));
        }
    }

    public final void LJIILLIIL(int i) {
        this.LLJIJIL = true;
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup != null) {
            HandlerHook.viewPostDelay(viewGroup, new RunnableC1883110z6T(this, i), 500L);
        }
    }

    @Override // X.InterfaceC1882930z6B
    public final void LJIJ(int i) {
        this.LLJIJIL = false;
        ((HashSet) this.LLJILJILJ.getValue()).clear();
        Iterator it2 = ((ArrayList) this.LLJILJIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1883040z6M) it2.next()).LJIIIIZZ(i, false);
        }
    }

    public final void LJIJJLI(View view) {
        C1883550z7B c1883550z7B;
        ViewGroup viewGroup;
        this.LLJJI = null;
        if (view != null) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
        }
        InterfaceC1883040z6M interfaceC1883040z6M = this.LLILLJJLI;
        if ((interfaceC1883040z6M instanceof C1883550z7B) && (c1883550z7B = (C1883550z7B) interfaceC1883040z6M) != null) {
            c1883550z7B.LJJI(this.LLILLL.LIZ, false);
        }
    }

    public final void LJJ(AbstractC1883160z6Y abstractC1883160z6Y) {
        C1881800z4M c1881800z4MLJIIL;
        String str;
        List<InterfaceC1883030z6L> listLJII;
        Long lValueOf;
        InterfaceC1883030z6L next;
        C1883550z7B c1883550z7B;
        if (Intrinsics.LJFF(this.LLJJ, abstractC1883160z6Y)) {
            return;
        }
        this.LLJJ = abstractC1883160z6Y;
        String strLJIL = null;
        if (Intrinsics.LJFF(abstractC1883160z6Y, C1883240z6g.LIZ)) {
            C1884300z8O c1884300z8O = this.LLIZLLLIL;
            if (c1884300z8O != null) {
                c1884300z8O.showLoading();
            }
        } else if (Intrinsics.LJFF(abstractC1883160z6Y, C1883260z6i.LIZ)) {
            SystemClock.elapsedRealtime();
            C20441214yg.LIZIZ("TabTreeNode", "onTabLoadSuccess");
            C09GF c09gf = C09GF.LIZ;
            InterfaceC1883090z6R interfaceC1883090z6R = this.LLILZIL;
            int i = this.LLILLL.LIZ;
            Map mapLJ = C2097608Jq.LJ();
            c09gf.getClass();
            if (interfaceC1883090z6R != null && (c1881800z4MLJIIL = interfaceC1883090z6R.LJIIJJI().LJIIL(i)) != null && (str = c1881800z4MLJIIL.LIZIZ) != null && (listLJII = interfaceC1883090z6R.LJIIJJI().LJII(i)) != null) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_partnership_mix_tab_duration");
                for (Map.Entry entry : mapLJ.entrySet()) {
                    c474500IjALIZ.LJJII(entry.getValue(), (String) entry.getKey());
                }
                c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(C1882380z5I.LIZLLL(interfaceC1883090z6R))));
                c474500IjALIZ.LJJII(interfaceC1883090z6R.LJIILLIIL(), "mix_page_tag");
                c474500IjALIZ.LJJII(str, "tab_class");
                Iterator<InterfaceC1883030z6L> it2 = listLJII.iterator();
                if (!it2.hasNext()) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(it2.next().LJIIZILJ());
                    while (it2.hasNext()) {
                        Long lValueOf2 = Long.valueOf(it2.next().LJIIZILJ());
                        if (lValueOf.compareTo(lValueOf2) < 0) {
                            lValueOf = lValueOf2;
                        }
                    }
                }
                c474500IjALIZ.LJJII(lValueOf, "fmp");
                Iterator<InterfaceC1883030z6L> it3 = listLJII.iterator();
                if (!it3.hasNext()) {
                    next = null;
                } else {
                    next = it3.next();
                    if (it3.hasNext()) {
                        long jLJIIZILJ = next.LJIIZILJ();
                        do {
                            InterfaceC1883030z6L next2 = it3.next();
                            long jLJIIZILJ2 = next2.LJIIZILJ();
                            if (jLJIIZILJ < jLJIIZILJ2) {
                                next = next2;
                                jLJIIZILJ = jLJIIZILJ2;
                            }
                        } while (it3.hasNext());
                    }
                }
                InterfaceC1883030z6L interfaceC1883030z6L = next;
                if (interfaceC1883030z6L != null) {
                    strLJIL = interfaceC1883030z6L.LJIL();
                }
                c474500IjALIZ.LJJII(strLJIL, "longest_loading_card_class");
                c474500IjALIZ.LIZ();
            }
            C1884300z8O c1884300z8O2 = this.LLIZLLLIL;
            if (c1884300z8O2 != null) {
                c1884300z8O2.showChildCards();
            }
            ViewGroup viewGroup = this.LLJ;
            if (viewGroup != null) {
                HandlerHook.viewPostDelay(viewGroup, new RunnableC1883110z6T(this, 1), 500L);
            }
        } else if (Intrinsics.LJFF(abstractC1883160z6Y, C1883230z6f.LIZ)) {
            SystemClock.elapsedRealtime();
            C20441214yg.LIZIZ("TabTreeNode", "onTabLoadFailed");
            C1884300z8O c1884300z8O3 = this.LLIZLLLIL;
            if (c1884300z8O3 != null) {
                c1884300z8O3.showRetryBtn();
            }
        }
        InterfaceC1883040z6M interfaceC1883040z6M = this.LLILLJJLI;
        if ((interfaceC1883040z6M instanceof C1883550z7B) && (c1883550z7B = (C1883550z7B) interfaceC1883040z6M) != null) {
            int i2 = this.LLILLL.LIZ;
            C1883450z71 c1883450z71 = c1883550z7B.LLJJI;
            if (c1883450z71 != null) {
                c1883450z71.LIZIZ(i2, abstractC1883160z6Y);
            }
        }
    }

    @Override // X.InterfaceC1883310z6n
    public final void LJ(InterfaceC1883030z6L interfaceC1883030z6L, int i) {
        C1881800z4M c1881800z4MLJIJJ = interfaceC1883030z6L.LJIJJ();
        if (c1881800z4MLJIJJ != null && c1881800z4MLJIJJ.LIZ == this.LLILLL.LIZ) {
            LJIILIIL();
        }
    }

    @Override // X.InterfaceC1883040z6M
    public final void LJIIIIZZ(int i, boolean z) {
        ViewGroup viewGroup;
        if (this.LLJIJIL == z && z && ((HashSet) this.LLJILJILJ.getValue()).size() < ((ArrayList) this.LLJILJIL).size() && (viewGroup = this.LLJ) != null) {
            HandlerHook.viewPostDelay(viewGroup, new RunnableC1883110z6T(this, i), 500L);
        }
        if (this.LLJIJIL != z) {
            if (z) {
                LJIILLIIL(i);
            } else {
                LJIJ(i);
            }
        }
    }

    public C1883100z6S(Context context, InterfaceC1883040z6M interfaceC1883040z6M, MixTabModel mixTabModel, boolean z, InterfaceC1883090z6R interfaceC1883090z6R, int i) {
        this.LL = context;
        this.LLILLJJLI = interfaceC1883040z6M;
        this.LLILLL = mixTabModel;
        this.LLILZ = z;
        this.LLILZIL = interfaceC1883090z6R;
        this.LLILZLL = i;
        SystemClock.elapsedRealtime();
        this.LLJJ = new AbstractC1883160z6Y() { // from class: X.0z6h
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1883250z6h);
            }

            public final int hashCode() {
                return 976103771;
            }

            public final String toString() {
                return "NONE";
            }
        };
    }
}
