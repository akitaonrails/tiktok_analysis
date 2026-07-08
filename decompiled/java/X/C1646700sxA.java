package X;

import Y.AObjectS246S0100000_25;
import Y.ARunnableS44S0110000_25;
import Y.ARunnableS75S0200000_6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import bfk.b0;
import com.bytedance.als.h0;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1646700sxA extends Scene implements InterfaceC1166920gTK {
    public final ShortVideoContext LLJI;
    public final AbstractC1653290t7n LLJIJIL;
    public final h0<Integer> LLJILJIL;
    public final C385670FAf<Boolean> LLJILJILJ;
    public View LLJJ;
    public TabHost LLJJIII;
    public C1647390syH LLJJIJIL;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 527));
    public int LLJJI = -1;
    public final int LLJJIJI = C578130Mlv.LIZIZ();
    public final boolean LLJJIJIIJIL = C0C64.LJIILLIIL().LJIIIZ(31744, "enable_record_button_outer_frame_color_change", true, false);

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final int LLLII() {
        C1653090t7T next;
        Iterator<C1653090t7T> it2 = this.LLJIJIL.LIZLLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.LIZ.LIZLLL) {
                break;
            }
        }
        C1653090t7T c1653090t7T = next;
        if (c1653090t7T != null) {
            return LLLIIIIL(c1653090t7T.LIZ.LIZIZ);
        }
        return -1;
    }

    public final C0GUE LLLIILIL() {
        return (C0GUE) this.LLJILLL.getValue();
    }

    public final int LLLIIIIL(Object obj) {
        if (obj == null) {
            return -1;
        }
        TabHost tabHost = this.LLJJIII;
        if (tabHost == null) {
            tabHost = null;
        }
        int tabCount = tabHost.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabHost tabHost2 = this.LLJJIII;
            if (tabHost2 == null) {
                tabHost2 = null;
            }
            if (Intrinsics.LJFF(obj, tabHost2.LIZ(i))) {
                return i;
            }
        }
        return -1;
    }

    public final void LLLIL(int i) {
        b0 b0Var;
        TextView textView;
        int childCount = LLLIILIL().getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = LLLIILIL().getChildAt(i2);
            if ((childAt instanceof b0) && (b0Var = (b0) childAt) != null && (textView = b0Var.getTextView()) != null) {
                if (i2 == i) {
                    if (this.LLJJIJIIJIL) {
                        textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    }
                    HandlerHook.viewPost(textView, new ARunnableS75S0200000_6(this, textView, 64));
                } else if (this.LLJJIJIIJIL) {
                    textView.setShadowLayer(5.0f, 0.0f, 1.0f, textView.getContext().getResources().getColor(R.color.cx));
                }
            }
        }
    }

    public final void LLLILZ(boolean z) {
        TabHost tabHost = this.LLJJIII;
        if (tabHost == null) {
            tabHost = null;
        }
        HandlerHook.viewPost(tabHost, new ARunnableS44S0110000_25(this, z, 1));
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        TabHost tabHost = (TabHost) requireViewById(R.id.ens);
        this.LLJJIII = tabHost;
        TabHost tabHost2 = null;
        if (tabHost == null) {
            tabHost = null;
        }
        View viewFindViewById = tabHost.findViewById(R.id.enr);
        this.LLJJ = viewFindViewById;
        if (this.LLJJIJIIJIL) {
            if (viewFindViewById == null) {
                viewFindViewById = null;
            }
            viewFindViewById.setBackground(C800330VaR.LIZIZ(requireActivity(), R.drawable.a_3));
            View view = this.LLJJ;
            if (view == null) {
                view = null;
            }
            C1428310nGv.LJII(view, -1, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))));
            TabHost tabHost3 = this.LLJJIII;
            if (tabHost3 == null) {
                tabHost3 = null;
            }
            tabHost3.setSelectedTextColor(R.attr.ej);
            TabHost tabHost4 = this.LLJJIII;
            if (tabHost4 == null) {
                tabHost4 = null;
            }
            tabHost4.setUnselectedTextColor(R.attr.ef);
            TabHost tabHost5 = this.LLJJIII;
            if (tabHost5 == null) {
                tabHost5 = null;
            }
            tabHost5.setTabHostGestureListener(new InterfaceC1653660t8O() { // from class: X.0sx6
                @Override // X.InterfaceC1653660t8O
                public final void LJI() {
                }

                @Override // X.InterfaceC1653660t8O
                public final void LIZ() {
                    try {
                        new C1351210lGZ(this.LIZ.requireSceneContext()).LIZIZ(50, 61);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                @Override // X.InterfaceC1653660t8O
                public final void LJII() {
                    b0 b0Var;
                    int childCount = this.LIZ.LLLIILIL().getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.LIZ.LLLIILIL().getChildAt(i);
                        if ((childAt instanceof b0) && (b0Var = (b0) childAt) != null) {
                            View view2 = this.LIZ.LLJJ;
                            int iAbs = Math.abs(C1428310nGv.LJ(view2 != null ? view2 : null) - C1428310nGv.LJ(b0Var));
                            if (iAbs <= b0Var.getMeasuredWidth() / 2) {
                                TextView textView = b0Var.getTextView();
                                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ej, b0Var.getContext());
                                textView.setTextColor(numLIZJ != null ? numLIZJ.intValue() : -16777216);
                                C786410Ut5.e5(b0Var, ((b0Var.getMeasuredWidth() - iAbs) * 2.0f) / b0Var.getMeasuredWidth());
                                b0Var.e0();
                            } else if (iAbs <= b0Var.getMeasuredWidth() / 2 || iAbs > b0Var.getMeasuredWidth()) {
                                TextView textView2 = b0Var.getTextView();
                                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ef, b0Var.getContext());
                                textView2.setTextColor(numLIZJ2 != null ? numLIZJ2.intValue() : -1);
                                TextView textView3 = b0Var.getTextView();
                                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1a, b0Var.getContext());
                                textView3.setShadowLayer(5.0f, 0.0f, 1.0f, numLIZJ3 != null ? numLIZJ3.intValue() : -16777216);
                                C786410Ut5.e5(b0Var, 1.0f);
                            } else {
                                TextView textView4 = b0Var.getTextView();
                                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.ef, b0Var.getContext());
                                textView4.setTextColor(numLIZJ4 != null ? numLIZJ4.intValue() : -1);
                                TextView textView5 = b0Var.getTextView();
                                Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.a1a, b0Var.getContext());
                                textView5.setShadowLayer(5.0f, 0.0f, 1.0f, numLIZJ5 != null ? numLIZJ5.intValue() : -16777216);
                                C786410Ut5.e5(b0Var, ((iAbs - (b0Var.getMeasuredWidth() / 2)) * 2.0f) / b0Var.getMeasuredWidth());
                            }
                        }
                    }
                }

                @Override // X.InterfaceC1653660t8O
                public final void LJIIIIZZ() {
                    b0 b0Var;
                    int childCount = this.LIZ.LLLIILIL().getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.LIZ.LLLIILIL().getChildAt(i);
                        if ((childAt instanceof b0) && (b0Var = (b0) childAt) != null) {
                            C786410Ut5.e5(b0Var, 1.0f);
                        }
                    }
                }
            });
        }
        TabHost tabHost6 = this.LLJJIII;
        if (tabHost6 == null) {
            tabHost6 = null;
        }
        C786410Ut5.P0(tabHost6, 8);
        AbstractC1653290t7n abstractC1653290t7n = this.LLJIJIL;
        abstractC1653290t7n.LJIIIZ = new InterfaceC1653420t80() { // from class: X.0sxB
            @Override // X.InterfaceC1653420t80
            public final void LIZ(int i, int i2, Object obj, boolean z, boolean z2) {
                this.LIZ.LLLIL(i);
            }
        };
        ShortVideoContext shortVideoContext = this.LLJI;
        TabHost tabHost7 = this.LLJJIII;
        if (tabHost7 == null) {
            tabHost7 = null;
        }
        abstractC1653290t7n.LJIIJJI(shortVideoContext, tabHost7);
        int iLLLII = LLLII();
        TabHost tabHost8 = this.LLJJIII;
        if (tabHost8 != null) {
            tabHost2 = tabHost8;
        }
        tabHost2.setDefaultIndex(iLLLII);
        if (iLLLII >= 0) {
            LLLIL(iLLLII);
        }
        this.LLJILJIL.LIZ(this, new AObjectS246S0100000_25(this, 377));
        this.LLJILJILJ.LIZ(this, new AObjectS246S0100000_25(this, 378));
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.i94, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public C1646700sxA(ShortVideoContext shortVideoContext, C1653170t7b c1653170t7b, h0 h0Var, C385670FAf c385670FAf) {
        this.LLJI = shortVideoContext;
        this.LLJIJIL = c1653170t7b;
        this.LLJILJIL = h0Var;
        this.LLJILJILJ = c385670FAf;
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
