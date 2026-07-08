package X;

import android.content.Context;
import android.util.Size;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixDslModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixTabInfoModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixTabModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z6O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883060z6O implements InterfaceC1883310z6n {
    public final Context LL;
    public final ViewGroup LLILLJJLI;
    public final InterfaceC1883090z6R LLILLL;
    public final List<InterfaceC1883040z6M> LLILZ;
    public MixDslModel LLILZIL;
    public Boolean LLILZLL;
    public C1881800z4M LLIZ;
    public Size LLIZLLLIL;
    public final C1883080z6Q LLJ;
    public boolean LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public boolean LLJJI;
    public Pair<? extends ViewGroup, ? extends ViewTreeObserver.OnScrollChangedListener> LLJJIII;

    public final C1881800z4M LJIIIIZZ() {
        Object next;
        C1883550z7B c1883550z7B;
        MixTabModel mixTabModel;
        Iterator it2 = ((ArrayList) this.LLILZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next instanceof C1883550z7B) {
                break;
            }
        }
        InterfaceC1883040z6M interfaceC1883040z6M = (InterfaceC1883040z6M) next;
        if (interfaceC1883040z6M != null && (interfaceC1883040z6M instanceof C1883550z7B) && (c1883550z7B = (C1883550z7B) interfaceC1883040z6M) != null) {
            C1883100z6S c1883100z6S = (C1883100z6S) C13LP.LJJJLZIJ(c1883550z7B.LJIIL(), c1883550z7B.LLJJJIL);
            if (c1883100z6S != null && (mixTabModel = c1883100z6S.LLILLL) != null) {
                int i = mixTabModel.LIZ;
                String str = mixTabModel.tabClass;
                if (str == null) {
                    str = "";
                }
                return new C1881800z4M(i, str);
            }
        }
        return null;
    }

    public final C1881800z4M LJIIIZ() {
        MixTabInfoModel mixTabInfoModel;
        MixTabModel next;
        C1881800z4M c1881800z4M = this.LLIZ;
        if (c1881800z4M != null) {
            return c1881800z4M;
        }
        MixDslModel mixDslModel = this.LLILZIL;
        C1881800z4M c1881800z4M2 = null;
        if (mixDslModel == null || (mixTabInfoModel = mixDslModel.tabInfo) == null || mixTabInfoModel.tabs.isEmpty()) {
            return null;
        }
        String strLIZIZ = this.LLILLL.LIZ().LIZIZ(mixTabInfoModel.defaultTab, mixTabInfoModel.tabs);
        List<MixTabModel> list = mixTabInfoModel.tabs;
        if ((list instanceof Collection) && list.isEmpty()) {
            strLIZIZ = mixTabInfoModel.defaultTab;
        } else {
            Iterator<MixTabModel> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().tabClass, strLIZIZ)) {
                    break;
                }
            }
            strLIZIZ = mixTabInfoModel.defaultTab;
        }
        Iterator<MixTabModel> it3 = mixTabInfoModel.tabs.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (Intrinsics.LJFF(next.tabClass, strLIZIZ)) {
                break;
            }
        }
        MixTabModel mixTabModel = next;
        if (mixTabModel != null) {
            int i = mixTabModel.LIZ;
            String str = mixTabModel.tabClass;
            if (str == null) {
                str = "";
            }
            c1881800z4M2 = new C1881800z4M(i, str);
        }
        this.LLIZ = c1881800z4M2;
        return c1881800z4M2;
    }

    public final List LJIIJJI() {
        return (CopyOnWriteArrayList) this.LLJILJIL.getValue();
    }

    public final List LJIILIIL() {
        return (CopyOnWriteArrayList) this.LLJIJIL.getValue();
    }

    public final List LJIILJJIL() {
        return (CopyOnWriteArrayList) this.LLJILLL.getValue();
    }

    public final List LJIILL() {
        return (CopyOnWriteArrayList) this.LLJILJILJ.getValue();
    }

    public final void LIZ(InterfaceC1883310z6n interfaceC1883310z6n) {
        ((CopyOnWriteArrayList) this.LLJJ.getValue()).add(interfaceC1883310z6n);
    }

    public final void LIZIZ(InterfaceC469360Ias interfaceC469360Ias) {
        ((CopyOnWriteArrayList) this.LLJILJIL.getValue()).add(interfaceC469360Ias);
    }

    public final void LIZJ(ViewOnScrollChangeListenerC1880880z2s viewOnScrollChangeListenerC1880880z2s) {
        ((CopyOnWriteArrayList) this.LLJILLL.getValue()).add(viewOnScrollChangeListenerC1880880z2s);
    }

    public final void LIZLLL(C1882540z5Y c1882540z5Y) {
        ((CopyOnWriteArrayList) this.LLJILJILJ.getValue()).add(c1882540z5Y);
    }

    public final void LJFF(C1883440z70 c1883440z70) {
        ((CopyOnWriteArrayList) this.LLJIJIL.getValue()).add(c1883440z70);
    }

    public final void LJI(final C21578619ce c21578619ce) {
        ViewGroup first;
        Pair<? extends ViewGroup, ? extends ViewTreeObserver.OnScrollChangedListener> pair = this.LLJJIII;
        ViewTreeObserver.OnScrollChangedListener second = null;
        if (pair != null && (first = pair.getFirst()) != null) {
            Pair<? extends ViewGroup, ? extends ViewTreeObserver.OnScrollChangedListener> pair2 = this.LLJJIII;
            if (pair2 != null) {
                C786410Ut5.E3(first.getViewTreeObserver(), pair2.getSecond());
            }
            this.LLJJIII = null;
        }
        this.LLJJIII = new Pair<>(c21578619ce, new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0z7K
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.LJIJJLI(c21578619ce.getScrollY() >= (c21578619ce.getChildAt(0).getMeasuredHeight() - c21578619ce.getMeasuredHeight()) + c21578619ce.getPaddingTop());
            }
        });
        ViewTreeObserver viewTreeObserver = c21578619ce.getViewTreeObserver();
        Pair<? extends ViewGroup, ? extends ViewTreeObserver.OnScrollChangedListener> pair3 = this.LLJJIII;
        if (pair3 != null) {
            second = pair3.getSecond();
        }
        C786410Ut5.z3(viewTreeObserver, second);
    }

    public final List<InterfaceC1883030z6L> LJII(int i) {
        Object next;
        C1883550z7B c1883550z7B;
        C1883100z6S c1883100z6S;
        Iterator it2 = ((ArrayList) this.LLILZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C1883550z7B) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1883040z6M interfaceC1883040z6M = (InterfaceC1883040z6M) next;
        if (interfaceC1883040z6M == null || !(interfaceC1883040z6M instanceof C1883550z7B) || (c1883550z7B = (C1883550z7B) interfaceC1883040z6M) == null || (c1883100z6S = (C1883100z6S) C13LP.LJJJLZIJ(i, c1883550z7B.LLJJJIL)) == null) {
            return null;
        }
        return c1883100z6S.LLJILJIL;
    }

    public final Size LJIIJ(InterfaceC1883040z6M interfaceC1883040z6M) {
        int i = 0;
        if (interfaceC1883040z6M instanceof InterfaceC1883030z6L) {
            if (interfaceC1883040z6M.getParent() instanceof C1883100z6S) {
                int width = this.LLIZLLLIL.getWidth();
                int height = this.LLIZLLLIL.getHeight();
                if (Intrinsics.LJFF(this.LLILZLL, Boolean.TRUE)) {
                    i = C1883220z6e.LIZ;
                }
                return new Size(width, height - i);
            }
            if (interfaceC1883040z6M.getParent() instanceof C1883080z6Q) {
                return this.LLIZLLLIL;
            }
            return new Size(0, 0);
        }
        if (interfaceC1883040z6M instanceof C1883100z6S) {
            int width2 = this.LLIZLLLIL.getWidth();
            int height2 = this.LLIZLLLIL.getHeight();
            if (Intrinsics.LJFF(this.LLILZLL, Boolean.TRUE)) {
                i = C1883220z6e.LIZ;
            }
            return new Size(width2, height2 - i);
        }
        if (interfaceC1883040z6M instanceof C1883550z7B) {
            return this.LLIZLLLIL;
        }
        return new Size(0, 0);
    }

    public final C1881800z4M LJIIL(int i) {
        Object next;
        C1883550z7B c1883550z7B;
        C1883100z6S c1883100z6S;
        MixTabModel mixTabModel;
        Iterator it2 = ((ArrayList) this.LLILZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C1883550z7B) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1883040z6M interfaceC1883040z6M = (InterfaceC1883040z6M) next;
        if (interfaceC1883040z6M == null || !(interfaceC1883040z6M instanceof C1883550z7B) || (c1883550z7B = (C1883550z7B) interfaceC1883040z6M) == null || (c1883100z6S = (C1883100z6S) C13LP.LJJJLZIJ(i, c1883550z7B.LLJJJIL)) == null || (mixTabModel = c1883100z6S.LLILLL) == null) {
            return null;
        }
        String str = mixTabModel.tabClass;
        if (str == null) {
            str = "";
        }
        return new C1881800z4M(i, str);
    }

    public final void LJIIZILJ(InterfaceC1883310z6n interfaceC1883310z6n) {
        ((CopyOnWriteArrayList) this.LLJJ.getValue()).remove(interfaceC1883310z6n);
    }

    public final void LJIJ(ViewOnScrollChangeListenerC1880880z2s viewOnScrollChangeListenerC1880880z2s) {
        ((CopyOnWriteArrayList) this.LLJILLL.getValue()).remove(viewOnScrollChangeListenerC1880880z2s);
    }

    public final void LJIJI(Size size) {
        this.LLIZLLLIL = size;
        for (InterfaceC1883040z6M interfaceC1883040z6M : (ArrayList) this.LLILZ) {
            interfaceC1883040z6M.LJIILL(LJIIJ(interfaceC1883040z6M));
        }
    }

    public final void LJIJJ(Function1<? super InterfaceC1883030z6L, Unit> function1) {
        for (InterfaceC1883040z6M interfaceC1883040z6M : (ArrayList) this.LLILZ) {
            if (interfaceC1883040z6M instanceof InterfaceC1883030z6L) {
                function1.invoke(interfaceC1883040z6M);
            } else if (interfaceC1883040z6M instanceof C1883550z7B) {
                Iterator it2 = ((ArrayList) ((C1883550z7B) interfaceC1883040z6M).LLJJJIL).iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((ArrayList) ((C1883100z6S) it2.next()).LLJILJIL).iterator();
                    while (it3.hasNext()) {
                        function1.invoke(it3.next());
                    }
                }
            }
        }
    }

    public final void LJIJJLI(boolean z) {
        if (z != this.LLJJI) {
            this.LLJJI = z;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateTabSticky: ");
            sbLIZ.append(z);
            C20441214yg.LIZIZ("MixViewTree", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                this.LLILLL.getEventCenter().LIZIZ(null, "on_tab_sticky_enter");
            } else {
                this.LLILLL.getEventCenter().LIZIZ(null, "on_tab_sticky_exit");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1883310z6n
    public final void LJ(InterfaceC1883030z6L interfaceC1883030z6L, int i) {
        String str;
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1883310z6n) it2.next()).LJ(interfaceC1883030z6L, i);
        }
        if (!this.LLJI) {
            C013C c013c = new C013C();
            c013c.element = true;
            C1883070z6P c1883070z6P = new C1883070z6P(c013c);
            C1881800z4M c1881800z4MLJIIIZ = LJIIIZ();
            for (InterfaceC1883040z6M interfaceC1883040z6M : (ArrayList) this.LLILZ) {
                if (interfaceC1883040z6M instanceof InterfaceC1883030z6L) {
                    if (!((Boolean) c1883070z6P.invoke(interfaceC1883040z6M)).booleanValue()) {
                        return;
                    }
                } else if (interfaceC1883040z6M instanceof C1883550z7B) {
                    for (C1883100z6S c1883100z6S : (ArrayList) ((C1883550z7B) interfaceC1883040z6M).LLJJJIL) {
                        String str2 = c1883100z6S.LLILLL.tabClass;
                        if (c1881800z4MLJIIIZ != null) {
                            str = c1881800z4MLJIIIZ.LIZIZ;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str2, str)) {
                            Iterator it3 = ((ArrayList) c1883100z6S.LLJILJIL).iterator();
                            while (it3.hasNext()) {
                                if (!((Boolean) c1883070z6P.invoke(it3.next())).booleanValue()) {
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
            if (!c013c.element) {
                C1882960z6E.LIZJ(this.LLILLL, 1002, "card load fail");
            }
            this.LLJI = true;
            this.LLILLL.LJIIZILJ(c013c.element);
        }
    }

    public final void LJIILLIIL(String str, boolean z) {
        List<InterfaceC1883040z6M> list = this.LLILZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (obj instanceof C1883550z7B) {
                arrayList.add(obj);
            }
        }
        C1883550z7B c1883550z7B = (C1883550z7B) C13LP.LJJJLL(arrayList);
        if (c1883550z7B != null) {
            Iterator it2 = ((ArrayList) c1883550z7B.LLJJJIL).iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((C1883100z6S) it2.next()).LLILLL.tabClass, str)) {
                    if (i >= 0) {
                        C21594519fD c21594519fD = c1883550z7B.LLJILLL;
                        if (c21594519fD != null && i == c21594519fD.getCurrentItem()) {
                            return;
                        }
                        C21594519fD c21594519fD2 = c1883550z7B.LLJILLL;
                        if (c21594519fD2 != null) {
                            c21594519fD2.setCurrentItem(i);
                        }
                        if (!z) {
                            return;
                        }
                        c1883550z7B.LLILZ.getEventCenter().LIZIZ(null, "__mix_base_jump_tab_by_class");
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0z6Q] */
    public C1883060z6O(Context context, C1883180z6a c1883180z6a, C1882980z6G c1882980z6G) {
        this.LL = context;
        this.LLILLJJLI = c1883180z6a;
        this.LLILLL = c1882980z6G;
        final ArrayList arrayList = new ArrayList();
        this.LLILZ = arrayList;
        this.LLIZLLLIL = new Size(0, 0);
        this.LLJ = new InterfaceC1883040z6M(arrayList) { // from class: X.0z6Q
            public final List<InterfaceC1883040z6M> LL;

            @Override // X.InterfaceC1883040z6M
            public final void LJII(ViewGroup viewGroup) {
            }

            @Override // X.InterfaceC1883040z6M
            public final void LJIIIIZZ(int i, boolean z) {
            }

            @Override // X.InterfaceC1883040z6M
            public final void LJIIJJI(ViewGroup viewGroup) {
            }

            @Override // X.InterfaceC1883040z6M
            public final void LJIILJJIL(ViewGroup viewGroup) {
            }

            @Override // X.InterfaceC1883040z6M
            public final void LJIILL(Size size) {
            }

            @Override // X.InterfaceC1882930z6B
            public final void LJIJ(int i) {
            }

            @Override // X.InterfaceC1883040z6M
            public final void destroy() {
            }

            @Override // X.InterfaceC1883040z6M
            public final InterfaceC1883040z6M getParent() {
                return null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LL = arrayList;
            }
        };
        this.LLJIJIL = C452501pT.LIZIZ(new C1699560uKQ());
        this.LLJILJIL = C452501pT.LIZIZ(new C1883200z6c());
        this.LLJILJILJ = C452501pT.LIZIZ(new C1883210z6d());
        this.LLJILLL = C452501pT.LIZIZ(new C1699570uKR());
        this.LLJJ = C452501pT.LIZIZ(new C1699550uKP());
    }
}
