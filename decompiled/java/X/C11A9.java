package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS40S0101000_29;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.countdown.CountdownState;
import com.ss.android.ugc.aweme.shortvideo.countdown.CountdownViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS135S0101000_29;
import kotlin.jvm.internal.AwS36S0102000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.11A9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11A9 extends Scene implements InterfaceC1171660gay {
    public static final /* synthetic */ int LLJLILLLLZIIL = 0;
    public View LLJI;
    public C11AF LLJIJIL;
    public C11AC LLJILJIL;
    public C11AE LLJILJILJ;
    public TextView LLJILLL;
    public TextView LLJJ;
    public TextView LLJJI;
    public TextView LLJJIII;
    public SafeHandler LLJJIJI;
    public final CountdownViewModel LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public ViewGroup LLJJJIL;
    public TextView LLJJJJ;
    public LinearLayout LLJJJJJIL;
    public TextView LLJJJJLIIL;
    public TextView LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public C1051900dTo LLJL;
    public C11AD LLJLIL;

    public final ShortVideoContext LLLIL() {
        return ((ShortVideoContextViewModel) C1659630tI1.LJIIIIZZ(this, null, null, 6).get(ShortVideoContextViewModel.class)).LL;
    }

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

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C11AC c11ac = this.LLJILJIL;
        if (c11ac != null) {
            c11ac.LIZ();
        }
        C11AE c11ae = this.LLJILJILJ;
        if (c11ae != null) {
            c11ae.onDismiss();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        ViewGroup viewGroup = this.LLJJJIL;
        if (viewGroup == null) {
            viewGroup = null;
        }
        HandlerHook.viewPost(viewGroup, new ARunnableS129S0100000_29(this, 60));
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        C1051900dTo c1051900dTo = this.LLJL;
        if (c1051900dTo != null) {
            c1051900dTo.LIZ();
        }
    }

    public C11A9(CountdownState countdownState) {
        this.LLJJIJIIJIL = new CountdownViewModel(countdownState);
    }

    public final void LLLII(TextView textView) {
        RadioGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if ((layoutParams2 instanceof RadioGroup.LayoutParams) && (layoutParams = (RadioGroup.LayoutParams) layoutParams2) != null) {
            layoutParams.width = (int) C12ES.LIZJ(32.0f, this.mActivity);
            C786410Ut5.g6(textView, layoutParams);
        }
    }

    public final float LLLIIIIL(float f) {
        C11AF c11af = this.LLJIJIL;
        TextView textView = null;
        if (c11af == null) {
            c11af = null;
        }
        float measuredWidth = c11af.getMeasuredWidth() - f;
        TextView textView2 = this.LLJJ;
        if (textView2 != null) {
            textView = textView2;
        }
        return Math.min(1.0f, (measuredWidth - textView.getMeasuredWidth()) / 100.0f);
    }

    public final void LLLIILIL(int i) {
        boolean z;
        TextView textView = this.LLJJJJLIIL;
        TextView textView2 = null;
        if (textView == null) {
            textView = null;
        }
        boolean z2 = true;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        textView.setSelected(z);
        TextView textView3 = this.LLJJL;
        if (textView3 != null) {
            textView2 = textView3;
        }
        if (i != 10) {
            z2 = false;
        }
        textView2.setSelected(z2);
    }

    public final void LLLILZ(int i) {
        Context contextLIZIZ = C545820Lau.LIZIZ(this);
        if (contextLIZIZ == null) {
            return;
        }
        this.LLJJIJIL = i;
        SafeHandler safeHandler = this.LLJJIJI;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.post(new ARunnableS40S0101000_29(this, i, 8));
        new C1436840nUg(contextLIZIZ).LIZJ().edit().putInt("count_down_mode", i).apply();
        C11AD c11ad = this.LLJLIL;
        if (c11ad != null) {
            c11ad.onSwitch(i);
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LLJJIJI = new SafeHandler(this);
        this.LLJJIJIIJIL.JQ2(AFwS273S0000000_29.get$arr$(104));
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c9k, viewGroup, false);
        viewTd.setMinimumWidth(100000);
        this.LLJIJIL = (C11AF) viewTd.findViewById(R.id.volume_taps_view);
        this.LLJI = viewTd.findViewById(R.id.volume_taps_view_mask);
        this.LLJILLL = (TextView) viewTd.findViewById(R.id.xql);
        this.LLJJ = (TextView) viewTd.findViewById(R.id.xmc);
        this.LLJJI = (TextView) viewTd.findViewById(R.id.xpw);
        this.LLJJIII = (TextView) viewTd.findViewById(R.id.vz7);
        this.LLJJJIL = (ViewGroup) viewTd.findViewById(R.id.y10);
        this.LLJJJJ = (TextView) viewTd.findViewById(R.id.xlq);
        this.LLJJLIIIJLLLLLLLZ = viewTd.findViewById(R.id.ezu);
        this.LLJJJJJIL = (LinearLayout) viewTd.findViewById(R.id.tjn);
        this.LLJJJJLIIL = (TextView) viewTd.findViewById(R.id.ssv);
        this.LLJJL = (TextView) viewTd.findViewById(R.id.ssu);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        TextView textView = this.LLJJJJLIIL;
        TextView textView2 = null;
        if (textView == null) {
            textView = null;
        }
        textView.getPaint().setTypeface(c444890HcV.getTypeface());
        TextView textView3 = this.LLJJL;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.getPaint().setTypeface(c444890HcV.getTypeface());
        if (C1388580mEq.LIZIZ(C545820Lau.LIZIZ(this))) {
            TextView textView4 = this.LLJJJJLIIL;
            if (textView4 == null) {
                textView4 = null;
            }
            textView4.setBackgroundResource(R.drawable.a_a);
            TextView textView5 = this.LLJJL;
            if (textView5 == null) {
                textView5 = null;
            }
            textView5.setBackgroundResource(R.drawable.a_5);
        }
        TextView textView6 = this.LLJJJJLIIL;
        if (textView6 == null) {
            textView6 = null;
        }
        C786410Ut5.T7(textView6, new ACListenerS163S0100000_29(this, 75));
        TextView textView7 = this.LLJJL;
        if (textView7 == null) {
            textView7 = null;
        }
        C786410Ut5.T7(textView7, new ACListenerS163S0100000_29(this, 76));
        int i = new C1436840nUg(requireActivity()).LIZJ().getInt("count_down_mode", 3);
        this.LLJJIJIL = i;
        LLLIILIL(i);
        TextView textView8 = this.LLJJIII;
        if (textView8 == null) {
            textView8 = null;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        TextView textView9 = this.LLJJIII;
        if (textView9 == null) {
            textView9 = null;
        }
        Context context = textView9.getContext();
        TextView textView10 = this.LLJJIII;
        if (textView10 == null) {
            textView10 = null;
        }
        textView8.setBackground(c384050F3z.LIZ(C1388190mED.LJFF(context, textView10.getContext().getTheme())));
        TextView textView11 = this.LLJJIII;
        if (textView11 == null) {
            textView11 = null;
        }
        C786410Ut5.T7(textView11, new ACListenerS163S0100000_29(this, 77));
        View viewFindViewById = viewTd.findViewById(R.id.f01);
        if (C0BN7.LIZ()) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        } else {
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 78), viewFindViewById);
        }
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view == null) {
            view = null;
        }
        C11EA.LJIIL(this, this.LLJJIJIIJIL, new AwS643S0100000_29(this, 29));
        C11AF c11af = this.LLJIJIL;
        if (c11af == null) {
            c11af = null;
        }
        c11af.setOnProgressChangeListener(new InterfaceC19457511An() { // from class: X.11AA
            @Override // X.InterfaceC19457511An
            public final void LIZ(int i2) {
                C11A9 c11a9 = this.LIZ;
                c11a9.withState(c11a9.LLJJIJIIJIL, new AwS135S0101000_29(c11a9, i2, 3));
            }

            @Override // X.InterfaceC19457511An
            public final void LIZIZ(int i2, int i3) {
                C11A9 c11a9 = this.LIZ;
                c11a9.withState(c11a9.LLJJIJIIJIL, new AwS36S0102000_29(c11a9, i2, i3, 1));
            }
        });
        TextView textView12 = this.LLJILLL;
        if (textView12 != null) {
            textView2 = textView12;
        }
        textView2.setText("0s");
        C11EA.LJII(this, this.LLJJIJIIJIL, new C2217381BqS() { // from class: X.11AB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((CountdownState) obj).getMaxDuration());
            }
        }, new AwS643S0100000_29(this, 30));
        C786410Ut5.x3(viewTd.getViewTreeObserver(), new C12YV(this, view, viewTd, 1));
        return viewTd;
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
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
