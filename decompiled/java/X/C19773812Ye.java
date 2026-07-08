package X;

import android.view.View;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.12Ye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19773812Ye implements C092O {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.C092O
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
        }
    }

    public static final void accept$0(C19773812Ye c19773812Ye, Object obj) {
        C19557811fU c19557811fU = (C19557811fU) c19773812Ye.l0;
        if (c19773812Ye.z1) {
            C786410Ut5.LLIL(c19557811fU.LJIIZILJ, 0);
            C786410Ut5.LLIL(c19557811fU.LJIJ, 0);
        } else {
            c19557811fU.getClass();
        }
    }

    public static final void accept$1(C19773812Ye c19773812Ye, Object obj) {
        C128Y c128y;
        C128Y c128y2;
        C19557511fR c19557511fR = (C19557511fR) c19773812Ye.l0;
        if (c19773812Ye.z1) {
            C786410Ut5.LLIL(c19557511fR.LJIJJ, 0);
            C786410Ut5.LLIL(c19557511fR.LJIJJLI, 0);
            C113Z c113z = c19557511fR.LJJIZ;
            if (c113z != null && c113z.getCurrentPage() != null) {
                AnonymousClass1136 currentPage = c19557511fR.LJJIZ.getCurrentPage();
                ArrayList<EffectPointModel> arrayList = new ArrayList<>();
                if (currentPage instanceof C113E) {
                    C113E c113e = (C113E) currentPage;
                    c113e.LJIJJ();
                    arrayList = c113e.LLJL;
                }
                c19557511fR.LJJLIIIJJIZ.LIZJ(currentPage.LL, arrayList);
                c19557511fR.LJIIIZ.LJI(arrayList, c19557511fR.LJJIIJ.LIZ);
            }
            C194364112k c194364112k = c19557511fR.LJJIJIL;
            if (c194364112k != null && (c128y2 = c194364112k.LLJIJIL) != null && (c128y2 instanceof InterfaceC19557211fO)) {
                c19557511fR.LJIIIZ.LJI(((InterfaceC19557211fO) c128y2).LLILIL(), c19557511fR.LJJIIJ.LIZ);
            }
            C194364112k c194364112k2 = c19557511fR.LJJIJIL;
            if (c194364112k2 != null && (c128y = c194364112k2.LLJIJIL) != null && (c128y instanceof InterfaceC19557211fO)) {
                c19557511fR.LJIIIZ.LJI(((InterfaceC19557211fO) c128y).LLILIL(), c19557511fR.LJJIIJ.LIZ);
            }
            if (c19557511fR.LJJLIIIJILLIZJL) {
                c19557511fR.LJJLIIIJILLIZJL = false;
                c19557511fR.LJIIJ();
                return;
            }
            return;
        }
        c19557511fR.getClass();
    }

    public static final void accept$2(C19773812Ye c19773812Ye, Object obj) {
        if (c19773812Ye.z1) {
            View view = ((C19762612Tw) c19773812Ye.l0).LLJZ;
            View view2 = null;
            if (view == null) {
                view = null;
            }
            C786410Ut5.LJLLLLLL(0, view);
            View view3 = ((C19762612Tw) c19773812Ye.l0).LLJZIJLIL;
            if (view3 != null) {
                view2 = view3;
            }
            C786410Ut5.LJLLLLLL(0, view2);
            return;
        }
        C19762612Tw c19762612Tw = (C19762612Tw) c19773812Ye.l0;
        C19A3 c19a3 = (C19A3) c19762612Tw.mParentScene;
        if (c19a3 == null) {
            return;
        }
        c19a3.hide(c19762612Tw);
    }

    public static final void accept$3(C19773812Ye c19773812Ye, Object obj) {
        if (!c19773812Ye.z1) {
            ((C114F) c19773812Ye.l0).LLLLIL().LJIIJ.invoke();
        }
        ((C114F) c19773812Ye.l0).LLLIL = c19773812Ye.z1;
    }

    public static final void accept$4(C19773812Ye c19773812Ye, Object obj) {
        ((C114K) c19773812Ye.l0).LLLLIL().LIZ.invoke(Boolean.valueOf(c19773812Ye.z1));
    }

    public static final void accept$5(C19773812Ye c19773812Ye, Object obj) {
        int i;
        C121W c121w = (C121W) c19773812Ye.l0;
        boolean z = c19773812Ye.z1;
        c121w.getClass();
        boolean z2 = !z;
        C121Z c121z = c121w.LLILLL;
        if (z2) {
            i = 0;
        } else {
            i = 4;
        }
        int visibility = c121z.getVisibility();
        c121z.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c121z);
        if (z2) {
            c121w.LLILLL.LIZ();
        }
        if (z) {
            c121w.LLILLL.LLIZLLLIL = 1;
            c121w.LLJJIII.setLoopPlay(true);
        } else {
            c121w.LLILLL.LLIZLLLIL = 0;
            c121w.LLJJIJI.vW1().setValue(C1452730nuJ.LIZLLL(0L));
            c121w.LLJJIII.setLoopPlay(true);
            c121w.LLJJIJI.vW1().setValue(C1452730nuJ.LIZ());
        }
    }

    public static final void accept$6(C19773812Ye c19773812Ye, Object obj) {
        int i;
        C196868120s c196868120s = (C196868120s) c19773812Ye.l0;
        boolean z = c19773812Ye.z1;
        c196868120s.getClass();
        boolean z2 = !z;
        C196871120v c196871120v = c196868120s.LLILLL;
        if (c196871120v != null) {
            if (z2) {
                i = 0;
            } else {
                i = 4;
            }
            int visibility = c196871120v.getVisibility();
            c196871120v.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c196871120v);
            if (z2) {
                c196868120s.LLILLL.LIZ();
            }
            if (z) {
                c196868120s.LLILLL.LLJJ = 1;
                InterfaceC1452170ntP interfaceC1452170ntP = c196868120s.LLJJIJI;
                if (interfaceC1452170ntP != null) {
                    interfaceC1452170ntP.setLoopPlay(true);
                    return;
                }
                return;
            }
            c196868120s.LLILLL.LLJJ = 0;
            c196868120s.LLJJIJIIJIL.vW1().setValue(C1452730nuJ.LIZLLL(0L));
            InterfaceC1452170ntP interfaceC1452170ntP2 = c196868120s.LLJJIJI;
            if (interfaceC1452170ntP2 != null) {
                interfaceC1452170ntP2.setLoopPlay(true);
            }
            c196868120s.LLJJIJIIJIL.vW1().setValue(C1452730nuJ.LIZ());
        }
    }

    public static final void accept$7(C19773812Ye c19773812Ye, Object obj) {
        if (c19773812Ye.z1) {
            View view = ((C12U9) c19773812Ye.l0).LLJL;
            View view2 = null;
            if (view == null) {
                view = null;
            }
            C786410Ut5.LJLLLLLL(0, view);
            View view3 = ((C12U9) c19773812Ye.l0).LLJLIL;
            if (view3 != null) {
                view2 = view3;
            }
            C786410Ut5.LJLLLLLL(0, view2);
            return;
        }
        C12U9 c12u9 = (C12U9) c19773812Ye.l0;
        C19A3 c19a3 = (C19A3) c12u9.mParentScene;
        if (c19a3 == null) {
            return;
        }
        c19a3.hide(c12u9);
    }

    public C19773812Ye(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
