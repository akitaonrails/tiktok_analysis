package X;

import Y.ARunnableS119S0100000_19;
import Y.ARunnableS12S0301000_19;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS700S0100000_19;

/* JADX INFO: renamed from: X.0ixe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262600ixe implements InterfaceC1262800ixy, InterfaceC1261750iwH {
    public Integer LL;
    public AbstractC1262620ixg LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public ViewGroup LLILZIL;
    public AbstractC1262620ixg LLILZLL;

    @Override // X.InterfaceC1262800ixy
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1262800ixy, X.InterfaceC1262810ixz
    public final void LJI(AbstractC1264080j02<C1261860iwS> abstractC1264080j02) {
    }

    @Override // X.InterfaceC1261750iwH
    public final void LLF(RecyclerView recyclerView, int i) {
    }

    @Override // X.InterfaceC1262810ixz
    public final void destroy() {
        AbstractC1262620ixg abstractC1262620ixg = this.LLILZLL;
        if (abstractC1262620ixg == null) {
            abstractC1262620ixg = null;
        }
        abstractC1262620ixg.getPowerList().clearOnScrollListeners();
        AbstractC1262620ixg abstractC1262620ixg2 = this.LLILZLL;
        (abstractC1262620ixg2 != null ? abstractC1262620ixg2 : null).destroy();
    }

    @Override // X.InterfaceC1262810ixz
    public final C1075800e6M getCurrentState() {
        AbstractC1262620ixg abstractC1262620ixg = this.LLILZLL;
        if (abstractC1262620ixg == null) {
            abstractC1262620ixg = null;
        }
        return abstractC1262620ixg.getCurrentState();
    }

    @Override // X.InterfaceC1262810ixz
    public final AbstractC21673719rz getItemAnimator() {
        "Not support itemAnimator".toString();
        throw new IllegalStateException("Not support itemAnimator");
    }

    @Override // X.InterfaceC1262800ixy
    public final AbstractC1262620ixg getLayout() {
        AbstractC1262620ixg abstractC1262620ixg = this.LLILLJJLI;
        if (abstractC1262620ixg == null) {
            return null;
        }
        return abstractC1262620ixg;
    }

    @Override // X.InterfaceC1262800ixy
    public final ViewOnAttachStateChangeListenerC20604515jv getPowerList() {
        AbstractC1262620ixg abstractC1262620ixg = this.LLILZLL;
        if (abstractC1262620ixg == null) {
            abstractC1262620ixg = null;
        }
        return abstractC1262620ixg.getPowerList();
    }

    @Override // X.InterfaceC1262800ixy
    public final C1749280vcc getStatusView() {
        AbstractC1262620ixg abstractC1262620ixg = this.LLILZLL;
        if (abstractC1262620ixg == null) {
            abstractC1262620ixg = null;
        }
        return abstractC1262620ixg.getStatusView();
    }

    @Override // X.InterfaceC1262810ixz
    public final void reset() {
        AbstractC1262620ixg abstractC1262620ixg = this.LLILZLL;
        if (abstractC1262620ixg == null) {
            abstractC1262620ixg = null;
        }
        abstractC1262620ixg.reset();
    }

    public static C1262300ixA LIZ(C1262300ixA c1262300ixA) {
        C1262320ixC c1262320ixC = c1262300ixA.listConfig;
        C1262320ixC c1262320ixC2 = new C1262320ixC(400, c1262320ixC.LIZIZ, c1262320ixC.LIZJ, c1262320ixC.LIZLLL, c1262320ixC.LJ, c1262320ixC.LJFF, c1262320ixC.LJI);
        C1262090iwp c1262090iwpLIZ = C1262090iwp.LIZ(c1262300ixA.uiConfig, -180355);
        C1262590ixd c1262590ixd = c1262300ixA.apiConfig;
        return c1262300ixA.copy(c1262300ixA.hostActivity, c1262300ixA.hostFragment, c1262090iwpLIZ, c1262320ixC2, c1262300ixA.trackerConfig, new C1262590ixd(c1262590ixd.LIZ, 1, c1262590ixd.LIZJ, c1262590ixd.LIZLLL, c1262590ixd.LJ, c1262590ixd.LJFF, c1262590ixd.LJI, c1262590ixd.LJII, c1262590ixd.LJIIIIZZ, c1262590ixd.LJIIIZ, c1262590ixd.LJIIJ, c1262590ixd.LJIIJJI, c1262590ixd.LJIIL, c1262590ixd.LJIILIIL, c1262590ixd.LJIILJJIL, c1262590ixd.LJIILL, c1262590ixd.LJIILLIIL, c1262590ixd.LJIIZILJ, c1262590ixd.LJIJ, c1262590ixd.LJIJI, c1262590ixd.LJIJJ), c1262300ixA.arguments, c1262300ixA.onFail);
    }

    @Override // X.InterfaceC1262810ixz
    public final void Eg(InterfaceC1261750iwH interfaceC1261750iwH) {
        AbstractC1262620ixg abstractC1262620ixg = this.LLILZLL;
        if (abstractC1262620ixg == null) {
            abstractC1262620ixg = null;
        }
        abstractC1262620ixg.Eg(interfaceC1261750iwH);
    }

    @Override // X.InterfaceC1261750iwH
    public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
        if (abstractC1261460ivo instanceof C1261440ivm) {
            if (this.LL == null) {
                this.LL = Integer.valueOf(getPowerList().getChildAt(0).getWidth());
            }
            if (getPowerList().canScrollHorizontally(1)) {
                HandlerHook.viewPostDelay(getPowerList(), new ARunnableS119S0100000_19(this, 175), 600L);
            }
        }
    }

    public final void LIZIZ(C1262300ixA c1262300ixA) {
        int iIntValue;
        AbstractC1262620ixg abstractC1262620ixg = null;
        if (this.LLILLJJLI == null) {
            LLLIIII(new C1262780ixw(C1262490ixT.LIZIZ(c1262300ixA), null, this, 6));
        }
        C1262090iwp c1262090iwp = c1262300ixA.uiConfig;
        C1262050iwl c1262050iwl = c1262090iwp.LJIIIIZZ;
        if (c1262050iwl != null) {
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView == null) {
                tuxTextView = null;
            }
            tuxTextView.setText(c1262050iwl.LLILLJJLI);
            TuxTextView tuxTextView2 = this.LLILLL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            tuxTextView2.setTextColorRes(c1262050iwl.LLILLL);
            Integer num = c1262050iwl.LLJILJILJ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = R.attr.a1k;
            }
            TuxIconView tuxIconView = this.LLILZ;
            if (tuxIconView == null) {
                tuxIconView = null;
            }
            tuxIconView.setTintColorRes(iIntValue);
            TuxTextView tuxTextView3 = this.LLILLL;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            tuxTextView3.setTuxFont(c1262050iwl.LLILZ);
        }
        AbstractC1262620ixg abstractC1262620ixg2 = this.LLILZLL;
        if (abstractC1262620ixg2 == null) {
            abstractC1262620ixg2 = null;
        }
        C426750GoL.LJIIL(abstractC1262620ixg2.getPowerList(), Integer.valueOf(c1262090iwp.LJJIJL), null, Integer.valueOf(c1262090iwp.LJJIJLIJ), null, 26);
        ViewGroup viewGroup = this.LLILZIL;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C426750GoL.LJIIIZ(viewGroup, null, Integer.valueOf(c1262090iwp.LJJJI), null, null, false, 29);
        AbstractC1262620ixg abstractC1262620ixg3 = this.LLILZLL;
        if (abstractC1262620ixg3 == null) {
            abstractC1262620ixg3 = null;
        }
        C426750GoL.LJIIIZ(abstractC1262620ixg3, null, Integer.valueOf(c1262090iwp.LJJJIL), null, null, false, 29);
        TuxIconView tuxIconView2 = this.LLILZ;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        C428150Gqb.LIZ(tuxIconView2, EnumC428940Grs.ALPHA, 0.0f);
        TuxIconView tuxIconView3 = this.LLILZ;
        if (tuxIconView3 == null) {
            tuxIconView3 = null;
        }
        C786410Ut5.I7(new AbS700S0100000_19(c1262300ixA, 13), tuxIconView3);
        C1262300ixA c1262300ixACopy = c1262300ixA.copy(c1262300ixA.hostActivity, c1262300ixA.hostFragment, C1262090iwp.LIZ(c1262090iwp, -2305), c1262300ixA.listConfig, c1262300ixA.trackerConfig, c1262300ixA.apiConfig, c1262300ixA.arguments, c1262300ixA.onFail);
        AbstractC1262620ixg abstractC1262620ixg4 = this.LLILZLL;
        if (abstractC1262620ixg4 == null) {
            abstractC1262620ixg4 = null;
        }
        abstractC1262620ixg4.setConfigInner(c1262300ixACopy);
        AbstractC1262620ixg abstractC1262620ixg5 = this.LLILZLL;
        if (abstractC1262620ixg5 != null) {
            abstractC1262620ixg = abstractC1262620ixg5;
        }
        abstractC1262620ixg.Eg(this);
    }

    @Override // X.InterfaceC1262800ixy
    public final void LJLILLLLZI(boolean z) {
        AbstractC1262620ixg abstractC1262620ixg = this.LLILZLL;
        if (abstractC1262620ixg == null) {
            abstractC1262620ixg = null;
        }
        abstractC1262620ixg.LJLILLLLZI(z);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LLFZ(boolean z) {
        AbstractC1262620ixg abstractC1262620ixg = this.LLILZLL;
        if (abstractC1262620ixg == null) {
            abstractC1262620ixg = null;
        }
        abstractC1262620ixg.LLFZ(z);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LLL(Function1<? super C1261270ivV, C1261270ivV> function1) {
        AbstractC1262620ixg abstractC1262620ixg = this.LLILZLL;
        if (abstractC1262620ixg == null) {
            abstractC1262620ixg = null;
        }
        abstractC1262620ixg.LLL(function1);
    }

    @Override // X.InterfaceC1262800ixy
    public final void LLLIIII(AbstractC1262620ixg abstractC1262620ixg) {
        this.LLILLJJLI = abstractC1262620ixg;
        this.LLILZIL = (ViewGroup) abstractC1262620ixg.findViewById(R.id.jjs);
        this.LLILLL = (TuxTextView) abstractC1262620ixg.findViewById(R.id.y3o);
        this.LLILZ = (TuxIconView) abstractC1262620ixg.findViewById(R.id.kmh);
        AbstractC1262620ixg abstractC1262620ixg2 = (AbstractC1262620ixg) abstractC1262620ixg.findViewById(R.id.t4w);
        this.LLILZLL = abstractC1262620ixg2;
        if (abstractC1262620ixg2 == null) {
            abstractC1262620ixg2 = null;
        }
        final ViewOnAttachStateChangeListenerC20604515jv powerList = abstractC1262620ixg2.getPowerList();
        C426750GoL.LJIIL(powerList, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, 26);
        powerList.setClipToPadding(false);
        AbstractC21673619ry adapter = powerList.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.0ixf
                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i, int i2) {
                    C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("insert start! start:");
                    sbLIZ.append(i);
                    sbLIZ.append(", count: ");
                    sbLIZ.append(i2);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c1264320j0Q.getClass();
                    C1264320j0Q.LIZLLL("HLayoutController", strLIZIZ);
                    AbstractC21673719rz itemAnimator = powerList.getItemAnimator();
                    powerList.setItemAnimator(null);
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = powerList;
                    HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS12S0301000_19(i, viewOnAttachStateChangeListenerC20604515jv, this, itemAnimator, 2));
                }
            });
        }
        powerList.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0ixh
            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                if (!recyclerView.canScrollHorizontally(-1)) {
                    C1264320j0Q.LIZ.getClass();
                    C1264320j0Q.LIZLLL("HLayoutController", "requestDisallowInterceptTouchEvent to FALSE");
                    recyclerView.requestDisallowInterceptTouchEvent(false);
                }
            }
        });
    }

    @Override // X.InterfaceC1261750iwH
    public final void nO0(C1075800e6M c1075800e6M) {
        int i;
        if (c1075800e6M.LIZJ instanceof C1623606Xi) {
            ViewGroup viewGroup = this.LLILZIL;
            if (viewGroup == null) {
                viewGroup = null;
            }
            if (!((Collection) ((C1623606Xi) r2).LIZ).isEmpty()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewGroup);
        }
    }

    @Override // X.InterfaceC1262810ixz
    public final void ng(InterfaceC1261750iwH interfaceC1261750iwH) {
        AbstractC1262620ixg abstractC1262620ixg = this.LLILZLL;
        if (abstractC1262620ixg == null) {
            abstractC1262620ixg = null;
        }
        abstractC1262620ixg.ng(interfaceC1261750iwH);
    }

    @Override // X.InterfaceC1262800ixy
    public final void setConfigInner(C1262300ixA c1262300ixA) {
        LIZIZ(LIZ(c1262300ixA));
    }

    @Override // X.InterfaceC1262810ixz
    public final void LJJLIIIJILLIZJL(String str, String str2, List list) {
        AbstractC1262620ixg abstractC1262620ixg = this.LLILZLL;
        if (abstractC1262620ixg == null) {
            abstractC1262620ixg = null;
        }
        abstractC1262620ixg.LJJLIIIJILLIZJL(str, str2, list);
    }

    @Override // X.InterfaceC1262800ixy
    public final void LJLJLLL(C19EG c19eg, Fragment fragment, Function1<? super C1262310ixB, Unit> function1) {
        C1262310ixB c1262310ixB = new C1262310ixB(c19eg, fragment);
        function1.invoke(c1262310ixB);
        C1262320ixC c1262320ixC = c1262310ixB.LIZLLL;
        if (c1262320ixC.LIZLLL == -1) {
            int i = c1262310ixB.LJFF.LIZJ - 10;
            if (i < 5) {
                i = 5;
            }
            c1262320ixC.LIZLLL = i;
        }
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C1262780ixw.class);
        if (!Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262790ixx.class)) && !Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262780ixw.class)) && (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1263550izB.class)) || Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1890380zIC.class)))) {
            C1262590ixd c1262590ixd = c1262310ixB.LJFF;
            if (c1262590ixd.LJIILJJIL == null) {
                c1262590ixd.LJIILJJIL = Boolean.TRUE;
            }
        }
        LIZIZ(LIZ(new C1262300ixA(c19eg, fragment, c1262310ixB.LIZJ, c1262310ixB.LIZLLL, c1262310ixB.LJ, c1262310ixB.LJFF, null, c1262310ixB.LJI)));
    }
}
