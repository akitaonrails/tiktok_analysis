package X;

import Y.ACListenerS153S0100000_18;
import Y.ACListenerS154S0100000_19;
import Y.ARunnableS103S0100000_3;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.relation.base.CustomDialogFragment;
import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserPopupVM;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS116S0400000_19;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS84S1300000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iy3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262850iy3 extends AbstractC1168350gVd {
    public CustomDialogFragment LLJILJIL;
    public boolean LLJILJILJ;
    public Function0<Unit> LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public final List<Function1<CustomDialogFragment, Unit>> LLJJIII = new ArrayList();
    public boolean LLJJIJI;

    @Override // X.InterfaceC1072780e1U
    public final void dismiss() {
        Object c098200Yq;
        CustomDialogFragment customDialogFragment = this.LLJILJIL;
        if (customDialogFragment != null) {
            try {
                customDialogFragment.LLIZ = "default";
                if (customDialogFragment.getFragmentManager() != null) {
                    customDialogFragment.dismiss();
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                try {
                    customDialogFragment.dismissAllowingStateLoss();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZIZ("UserCard", "CustomDialog dismiss", thM5exceptionOrNullimpl);
            }
        }
    }

    @Override // X.InterfaceC1261750iwH
    public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
        Function0<Unit> function0;
        if (((abstractC1261460ivo instanceof C1261440ivm) || (abstractC1261460ivo instanceof C1261470ivp) || (abstractC1261460ivo instanceof C1261480ivq)) && (function0 = this.LLJILLL) != null) {
            function0.invoke();
        }
    }

    @Override // X.InterfaceC1072780e1U
    public final void LJIIIIZZ(AwS578S0100000_34 awS578S0100000_34) {
        this.LLJILLL = awS578S0100000_34;
    }

    @Override // X.InterfaceC1261750iwH
    public final void nO0(C1075800e6M c1075800e6M) {
        Function1<? super C1075800e6M, Unit> function1 = this.LLJ;
        if (function1 != null) {
            function1.invoke(c1075800e6M);
        }
        if (this.LL != null) {
            boolean z = c1075800e6M.LIZJ instanceof C1623606Xi;
            if (z && !c1075800e6M.LIZLLL()) {
                LJIILJJIL(this, LIZIZ().getPowerList(), this.LLJJI, 0, null, 12);
                this.LLJJIJI = true;
                return;
            }
            if (z && c1075800e6M.LIZLLL()) {
                LIZIZ().getStatusView().setTopMargin(C418440Gaw.LIZIZ(36));
                C1749280vcc statusView = LIZIZ().getStatusView();
                ViewGroup.LayoutParams layoutParams = statusView.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.gravity = 48;
                    C786410Ut5.W5(statusView, layoutParams2);
                    LJIILJJIL(this, LIZIZ().getStatusView(), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)), new AwS562S0100000_18(this, 2573), 2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            if (!(c1075800e6M.LIZ instanceof C491001vg)) {
                return;
            }
            LIZIZ().getStatusView().setTopMargin(C418440Gaw.LIZIZ(32));
            C1749280vcc statusView2 = LIZIZ().getStatusView();
            ViewGroup.LayoutParams layoutParams3 = statusView2.getLayoutParams();
            if (layoutParams3 != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.gravity = 48;
                C786410Ut5.W5(statusView2, layoutParams4);
                LJIILJJIL(this, LIZIZ().getStatusView(), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), new AwS562S0100000_18(this, 2574), 2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    @Override // X.AbstractC1168350gVd
    public final void LIZ(C19EG c19eg, Bundle bundle) {
        AbstractC1262620ixg abstractC1262620ixgLJ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19eg);
        if (c19egLIZIZ != null) {
            TuxIconView tuxIconView = null;
            C1262310ixB c1262310ixB = new C1262310ixB(c19egLIZIZ, false ? 1 : 0, 2);
            new AwS385S0200000_19(this, bundle, 106).invoke(c1262310ixB.LJ);
            new AwS595S0100000_16(bundle, 295).invoke(c1262310ixB.LJFF);
            new AwS116S0400000_19(this, c19eg, bundle, bundle, 4).invoke(c1262310ixB.LIZJ);
            new AwS385S0200000_19(this, c19eg, 107).invoke(c1262310ixB.LIZLLL);
            IRelationUserCardInternalService.LIZ.getClass();
            IRelationUserCardInternalService iRelationUserCardInternalServiceLIZ = C1073940e3M.LIZ();
            C1262320ixC c1262320ixC = c1262310ixB.LIZLLL;
            if (c1262320ixC.LIZLLL == -1) {
                int i = c1262310ixB.LJFF.LIZJ - 10;
                if (i < 5) {
                    i = 5;
                }
                c1262320ixC.LIZLLL = i;
            }
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(C1262790ixx.class);
            if (!Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262790ixx.class)) && !Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1262780ixw.class)) && (Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1263550izB.class)) || Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(AbstractC1890380zIC.class)))) {
                C1262590ixd c1262590ixd = c1262310ixB.LJFF;
                if (c1262590ixd.LJIILJJIL == null) {
                    c1262590ixd.LJIILJJIL = Boolean.TRUE;
                }
            }
            C1262300ixA c1262300ixA = new C1262300ixA(c1262310ixB.LIZ, c1262310ixB.LIZIZ, c1262310ixB.LIZJ, c1262310ixB.LIZLLL, c1262310ixB.LJ, c1262310ixB.LJFF, null, c1262310ixB.LJI);
            C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(C1262790ixx.class);
            int i2 = 0;
            if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1262790ixx.class))) {
                abstractC1262620ixgLJ = iRelationUserCardInternalServiceLIZ.LIZ(c1262300ixA, 1).getLayout();
            } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(C1262780ixw.class))) {
                abstractC1262620ixgLJ = iRelationUserCardInternalServiceLIZ.LIZ(c1262300ixA, 0).getLayout();
            } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1263550izB.class))) {
                abstractC1262620ixgLJ = iRelationUserCardInternalServiceLIZ.LIZIZ(c1262300ixA);
            } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1890380zIC.class))) {
                abstractC1262620ixgLJ = iRelationUserCardInternalServiceLIZ.LIZJ(c1262300ixA);
            } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1903730zdj.class))) {
                abstractC1262620ixgLJ = iRelationUserCardInternalServiceLIZ.LIZLLL(c1262300ixA);
            } else if (Intrinsics.LJFF(c19719912DlLIZ2, C13LE.LIZ(AbstractC1263540izA.class))) {
                abstractC1262620ixgLJ = iRelationUserCardInternalServiceLIZ.LJ(c1262300ixA);
            } else {
                "type is error!".toString();
                throw new IllegalStateException("type is error!");
            }
            if (abstractC1262620ixgLJ != null) {
                C1262790ixx c1262790ixx = (C1262790ixx) abstractC1262620ixgLJ;
                C447550Hgn.LJFF(c1262790ixx.getPowerList(), -1, -2);
                C447550Hgn.LJFF(c1262790ixx.getStatusView(), -1, -2);
                c1262790ixx.getStatusView().setLayoutVariant(1);
                c1262790ixx.Eg(this);
                this.LL = c1262790ixx;
                this.LLILZIL = (RecUserPopupVM) new AssemVMLazy(C724750Sbp.LJIIJ(c19eg, C13LE.LIZ(RecUserPopupVM.class)), AFwS189S0000000_3.get$arr$(1233), new C452070Ho5(), C724750Sbp.LJII(c19eg), C724750Sbp.LJIIIZ(c19eg), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) c19eg, 3081), AFwS256S0000000_18.get$arr$(927)).getValue();
                C736680Sv4.LJIIIIZZ(this, LIZJ(), new C2217381BqS() { // from class: X.0gLX
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1159350gH7) obj).LLILLL;
                    }
                }, null, new AwS632S0100000_18(this, 268), 6);
                C736680Sv4.LJIIIIZZ(this, LIZJ(), new C2217381BqS() { // from class: X.0gLP
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C1159350gH7) obj).LLILLJJLI);
                    }
                }, null, new AwS633S0100000_19(this, 264), 6);
                C736680Sv4.LJIIIIZZ(this, LIZJ(), new C2217381BqS() { // from class: X.0gLW
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1159350gH7) obj).LL;
                    }
                }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 269), 4);
                c19eg.runOnUiThread(new ARunnableS103S0100000_3(this, 108));
                this.LLILLJJLI.set(true);
                View viewLIZ = C0JF1.LIZ(c19eg, R.layout.ekl, null);
                TuxIconView tuxIconView2 = (TuxIconView) viewLIZ.findViewById(R.id.kmh);
                this.LLILLL = tuxIconView2;
                if (tuxIconView2 == null) {
                    tuxIconView2 = null;
                }
                if (!this.LLILZ) {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, tuxIconView2);
                TuxIconView tuxIconView3 = this.LLILLL;
                if (tuxIconView3 != null) {
                    tuxIconView = tuxIconView3;
                }
                C786410Ut5.a9(tuxIconView, new ACListenerS153S0100000_18(this, 173));
                C786410Ut5.a9((TuxIconView) viewLIZ.findViewById(R.id.e2d), new ACListenerS154S0100000_19(this, 242));
                ((ViewGroup) viewLIZ.findViewById(R.id.evt)).addView(LIZIZ(), new ViewGroup.LayoutParams(-1, -1));
                ((RadiusLayout) viewLIZ.findViewById(R.id.sv6)).setRadius(C418440Gaw.LIZIZ(16));
                C1262910iy9 c1262910iy9 = new C1262910iy9();
                c1262910iy9.LIZ.getClass();
                CustomDialogFragment customDialogFragment = c1262910iy9.LIZ;
                customDialogFragment.LLILLL = viewLIZ;
                customDialogFragment.LLILZ = new Pair<>(1, Integer.valueOf(R.style.afl));
                ((ArrayList) c1262910iy9.LIZ.LLILZIL).add(new AwS373S0200000_7(this, c19eg, 73));
                this.LLJILJIL = c1262910iy9.LIZ;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.usercard.RelationUserCardLayout");
        }
        "current context is not fragmentActivity!".toString();
        throw new IllegalStateException("current context is not fragmentActivity!");
    }

    @Override // X.InterfaceC1261750iwH
    public final void LLF(RecyclerView recyclerView, int i) {
        Function0<Unit> function0;
        if (i == 1 && (function0 = this.LLJILLL) != null) {
            function0.invoke();
        }
    }

    @Override // X.InterfaceC1072780e1U
    public final void LJIIL(FragmentManager fragmentManager, String str, Function1<? super EnumC1073720e30, Unit> function1) {
        if (C057T.LIZIZ.LIZ()) {
            return;
        }
        LJIILIIL(new AwS84S1300000_19(this, (C1262850iy3) fragmentManager, (FragmentManager) str, (String) function1, (Function1<? super EnumC1073720e30, Unit>) 0));
    }

    public static void LJIILJJIL(C1262850iy3 c1262850iy3, View view, int i, int i2, Function0 function0, int i3) {
        Function0 function02 = function0;
        int i4 = i2;
        int i5 = i;
        if ((i3 & 2) != 0) {
            i5 = -1;
        }
        if ((i3 & 4) != 0) {
            i4 = 0;
        }
        if ((i3 & 8) != 0) {
            function02 = null;
        }
        c1262850iy3.getClass();
        int i6 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("adjustSize, measureMaxHeight: ");
        sbLIZ.append(i5);
        sbLIZ.append(", extraIncHeight: ");
        sbLIZ.append(i4);
        C2188811AlT.LIZIZ(sbLIZ);
        HandlerHook.viewPost(view, new RunnableC1262860iy4(i5, i4, view, c1262850iy3, function02));
    }
}
