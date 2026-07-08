package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0snx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640990snx {
    public final ViewPager LIZ;
    public final C19YA LIZIZ;
    public final View LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ = false;
    public final List<Pair<C1641020so0, Function0<View>>> LJFF = new ArrayList();
    public final C1641000sny LJI = new PagerAdapter() { // from class: X.0sny
        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean LJJIFFI(View view, Object obj) {
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return ((ArrayList) this.LLILLJJLI.LJFF).size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object LJJI(int i, ViewGroup viewGroup) {
            Function0 function0;
            View view;
            InterfaceC1640870snl interfaceC1640870snl;
            ViewGroup viewGroup2;
            Pair pair = (Pair) C13LP.LJJJLZIJ(i, this.LLILLJJLI.LJFF);
            if (pair != null && (function0 = (Function0) pair.getSecond()) != null && (view = (View) function0.invoke()) != null) {
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(view, viewGroup2);
                }
                Object tag = view.getTag(R.id.kmz);
                if ((tag instanceof InterfaceC1640870snl) && (interfaceC1640870snl = (InterfaceC1640870snl) tag) != null) {
                    interfaceC1640870snl.uw();
                }
                viewGroup.addView(view);
                return view;
            }
            return new Object();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
            View view;
            InterfaceC1640870snl interfaceC1640870snl;
            if ((obj instanceof View) && (view = (View) obj) != null) {
                C1640990snx c1640990snx = this.LLILLJJLI;
                C786410Ut5.LJJJLZIJ(view, viewGroup);
                if (!c1640990snx.LJ) {
                    Object tag = view.getTag(R.id.kmz);
                    if ((tag instanceof InterfaceC1640870snl) && (interfaceC1640870snl = (InterfaceC1640870snl) tag) != null) {
                        interfaceC1640870snl.vw();
                    }
                }
            }
        }
    };
    public final C11RK<Pair<C1641020so0, Integer>> LJII = new C11RK<>();
    public final int LJIIIIZZ = R.attr.a1h;
    public final int LJIIIZ = R.attr.a1k;
    public boolean LJIIJ;

    public final void LIZ(int i, boolean z) {
        if (i < getCount()) {
            this.LIZ.setCurrentItem(i, z);
        }
    }

    public final void LIZIZ(C12H3 c12h3, boolean z) {
        TuxIconView tuxIconView;
        int i;
        ViewGroup viewGroup;
        View childAt;
        View tabView = this.LIZIZ.getTabView(c12h3.LIZLLL);
        Object tag = null;
        if ((tabView instanceof C19YC) && (viewGroup = (ViewGroup) tabView) != null && (childAt = viewGroup.getChildAt(0)) != null) {
            tag = childAt.getTag(R.id.w7i);
        }
        if ((tag instanceof TuxIconView) && (tuxIconView = (TuxIconView) tag) != null) {
            if (z) {
                i = this.LJIIIIZZ;
            } else {
                i = this.LJIIIZ;
            }
            tuxIconView.setTintColorRes(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0sny] */
    public C1640990snx(ViewPager viewPager, C19YA c19ya, View view, boolean z, boolean z2) {
        this.LIZ = viewPager;
        this.LIZIZ = c19ya;
        this.LIZJ = view;
        this.LIZLLL = z;
        this.LJIIJ = !z2;
        viewPager.addOnPageChangeListener(new C19642311t7(this.LIZIZ));
        viewPager.addOnPageChangeListener(new InterfaceC469360Ias() { // from class: X.0snz
            @Override // X.InterfaceC469360Ias
            public final void onPageScrolled(int i, float f, int i2) {
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
                AbstractC1640400sn0 abstractC1640400sn0;
                Function0 function0;
                View view2;
                if (i == 0) {
                    C1640990snx c1640990snx = this.LL;
                    Pair pair = (Pair) C13LP.LJJJLZIJ(c1640990snx.LIZ.getCurrentItem(), c1640990snx.LJFF);
                    Object tag = null;
                    if (pair != null && (function0 = (Function0) pair.getSecond()) != null && (view2 = (View) function0.invoke()) != null) {
                        tag = view2.getTag(R.id.kmz);
                    }
                    if ((tag instanceof AbstractC1640400sn0) && (abstractC1640400sn0 = (AbstractC1640400sn0) tag) != null) {
                        abstractC1640400sn0.LJJI();
                    }
                }
            }
        });
        c19ya.addOnTabSelectedListener(new InterfaceC19561911g9() { // from class: X.0snw
            @Override // X.InterfaceC19561911g9
            public final void LIZIZ(C12H3 c12h3) {
            }

            @Override // X.InterfaceC19561911g9
            public final void LIZ(C12H3 c12h3) {
                if (c12h3 != null) {
                    this.LIZ.LIZIZ(c12h3, false);
                }
            }

            @Override // X.InterfaceC19561911g9
            public final void LIZJ(C12H3 c12h3, boolean z3) {
                View viewFindViewById;
                View viewFindViewById2;
                Object first;
                InterfaceC1640870snl interfaceC1640870snl;
                this.LIZ.LIZIZ(c12h3, true);
                int i = c12h3.LIZLLL;
                C1640990snx c1640990snx = this.LIZ;
                Pair pair = (Pair) C13LP.LJJJLZIJ(i, c1640990snx.LJFF);
                Object tag = null;
                if (pair != null && (first = pair.getFirst()) != null) {
                    c1640990snx.LIZ(i, true);
                    if (c1640990snx.LIZLLL) {
                        Object tag2 = ((View) ((Function0) ((Pair) ListProtector.get(c1640990snx.LJFF, i)).getSecond()).invoke()).getTag(R.id.kmz);
                        if ((tag2 instanceof InterfaceC1640870snl) && (interfaceC1640870snl = (InterfaceC1640870snl) tag2) != null) {
                            interfaceC1640870snl.loadData();
                        }
                    }
                    if (!c1640990snx.LJIIJ) {
                        c1640990snx.LJII.onNext(new Pair<>(first, Integer.valueOf(i)));
                    }
                }
                C1640990snx c1640990snx2 = this.LIZ;
                if (!c1640990snx2.LJIIJ) {
                    View tabView = c1640990snx2.LIZIZ.getTabView(c12h3.LIZLLL);
                    if ((tabView instanceof C19YC) && tabView != null && (viewFindViewById2 = tabView.findViewById(R.id.lt3)) != null) {
                        C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                    }
                    View tabView2 = this.LIZ.LIZIZ.getTabView(c12h3.LIZLLL);
                    if ((tabView2 instanceof C19YC) && tabView2 != null && (viewFindViewById = tabView2.findViewById(R.id.kn5)) != null) {
                        tag = viewFindViewById.getTag(R.id.kn3);
                    }
                    if (Intrinsics.LJFF(tag, EnumC1641350soX.COLLECT.getTag())) {
                        try {
                            ((Keva) C1641030so1.LIZ.getValue()).storeInt(C0CHQ.LIZ().getAccountService().getCurrentUserID(), 1);
                            return;
                        } catch (RuntimeException e) {
                            TryCatchGuardChecker.doCheck(e);
                            return;
                        }
                    }
                    return;
                }
                c1640990snx2.LJIIJ = false;
            }
        });
    }
}
