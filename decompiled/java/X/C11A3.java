package X;

import Y.ACListenerS163S0100000_29;
import Y.ARunnableS0S0100300_29;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS40S0101000_29;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ftc.countdown.FTCCountdownState;
import com.ss.android.ugc.aweme.ftc.countdown.FTCCountdownViewModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS135S0101000_29;
import kotlin.jvm.internal.AwS36S0102000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.11A3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11A3 extends Scene implements InterfaceC1171660gay {
    public static final /* synthetic */ int LLJL = 0;
    public C15RW LLJI;
    public C11A6 LLJIJIL;
    public C11A8 LLJILJIL;
    public TextView LLJILJILJ;
    public TextView LLJILLL;
    public TextView LLJJ;
    public TextView LLJJI;
    public SafeHandler LLJJIII;
    public final FTCCountdownViewModel LLJJIJI;
    public int LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public TextView LLJJJ;
    public ViewGroup LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public View LLJJJJLIIL;
    public C1051900dTo LLJJL;
    public C11A5 LLJJLIIIJLLLLLLLZ;

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
        C11A6 c11a6 = this.LLJIJIL;
        if (c11a6 != null) {
            c11a6.LIZ();
        }
        C11A8 c11a8 = this.LLJILJIL;
        if (c11a8 != null) {
            c11a8.onDismiss();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        ViewGroup viewGroup = this.LLJJIJIL;
        if (viewGroup == null) {
            viewGroup = null;
        }
        HandlerHook.viewPost(viewGroup, new ARunnableS129S0100000_29(this, 45));
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        C1051900dTo c1051900dTo = this.LLJJL;
        if (c1051900dTo != null) {
            c1051900dTo.LIZ();
        }
    }

    public C11A3(FTCCountdownState fTCCountdownState) {
        this.LLJJIJI = new FTCCountdownViewModel(fTCCountdownState);
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
        C15RW c15rw = this.LLJI;
        TextView textView = null;
        if (c15rw == null) {
            c15rw = null;
        }
        float measuredWidth = c15rw.getMeasuredWidth() - f;
        TextView textView2 = this.LLJILLL;
        if (textView2 != null) {
            textView = textView2;
        }
        return Math.min(1.0f, (measuredWidth - textView.getMeasuredWidth()) / 100.0f);
    }

    public final void LLLIILIL(int i) {
        boolean z;
        TuxTextView tuxTextView = this.LLJJJJ;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        boolean z2 = true;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        tuxTextView.setSelected(z);
        TuxTextView tuxTextView3 = this.LLJJJJJIL;
        if (tuxTextView3 != null) {
            tuxTextView2 = tuxTextView3;
        }
        if (i != 10) {
            z2 = false;
        }
        tuxTextView2.setSelected(z2);
    }

    public final void LLLIL(int i) {
        String str;
        Activity activity = this.mActivity;
        if (activity == null) {
            return;
        }
        this.LLJJIJIIJIL = i;
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) ViewModelProviders.of((C19EG) activity).get(ShortVideoContextViewModel.class)).LL;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("content_type", "video");
        if (this.LLJJIJIIJIL == 3) {
            str = "3s";
        } else {
            str = "10s";
        }
        c0lab.LJ("to_status", str);
        C20684815ws.LJIILLIIL("select_countdown_type", c0lab.LIZ);
        SafeHandler safeHandler = this.LLJJIII;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.post(new ARunnableS40S0101000_29(this, i, 6));
        new C1436840nUg(activity).LIZJ().edit().putInt("count_down_mode", i).apply();
        C11A5 c11a5 = this.LLJJLIIIJLLLLLLLZ;
        if (c11a5 != null) {
            c11a5.onSwitch(i);
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public final void LLLILZ(long j, long j2, long j3) {
        SafeHandler safeHandler = this.LLJJIII;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.post(new ARunnableS0S0100300_29(this, j, j2, j3, 0));
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.LLJJIII = new SafeHandler(this);
        this.LLJJIJI.JQ2(AFwS273S0000000_29.get$arr$(61));
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.cc6, viewGroup, false);
        viewTd.setMinimumWidth(100000);
        this.LLJI = (C15RW) viewTd.findViewById(R.id.volume_taps_view);
        this.LLJILJILJ = (TextView) viewTd.findViewById(R.id.xql);
        this.LLJILLL = (TextView) viewTd.findViewById(R.id.xmc);
        this.LLJJ = (TextView) viewTd.findViewById(R.id.xpw);
        this.LLJJI = (TextView) viewTd.findViewById(R.id.vz7);
        this.LLJJIJIL = (ViewGroup) viewTd.findViewById(R.id.y10);
        this.LLJJJ = (TextView) viewTd.findViewById(R.id.xlq);
        this.LLJJJJLIIL = viewTd.findViewById(R.id.ezu);
        this.LLJJJIL = (ViewGroup) viewTd.findViewById(R.id.tjn);
        this.LLJJJJ = (TuxTextView) viewTd.findViewById(R.id.ssv);
        this.LLJJJJJIL = (TuxTextView) viewTd.findViewById(R.id.ssu);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        TuxTextView tuxTextView = this.LLJJJJ;
        TextView textView = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.getPaint().setTypeface(c444890HcV.getTypeface());
        TuxTextView tuxTextView2 = this.LLJJJJJIL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        tuxTextView2.getPaint().setTypeface(c444890HcV.getTypeface());
        Activity activity = this.mActivity;
        if (activity != null && C1388580mEq.LIZIZ(activity)) {
            TuxTextView tuxTextView3 = this.LLJJJJ;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            tuxTextView3.setBackgroundResource(R.drawable.a__);
            TuxTextView tuxTextView4 = this.LLJJJJJIL;
            if (tuxTextView4 == null) {
                tuxTextView4 = null;
            }
            tuxTextView4.setBackgroundResource(R.drawable.a_4);
        }
        TuxTextView tuxTextView5 = this.LLJJJJ;
        if (tuxTextView5 == null) {
            tuxTextView5 = null;
        }
        C786410Ut5.h9(tuxTextView5, new ACListenerS163S0100000_29(this, 46));
        TuxTextView tuxTextView6 = this.LLJJJJJIL;
        if (tuxTextView6 == null) {
            tuxTextView6 = null;
        }
        C786410Ut5.h9(tuxTextView6, new ACListenerS163S0100000_29(this, 47));
        int i = new C1436840nUg(requireActivity()).LIZJ().getInt("count_down_mode", 3);
        this.LLJJIJIIJIL = i;
        LLLIILIL(i);
        TextView textView2 = this.LLJJI;
        if (textView2 == null) {
            textView2 = null;
        }
        C786410Ut5.T7(textView2, new ACListenerS163S0100000_29(this, 48));
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 49), viewTd.findViewById(R.id.f01));
        View view = this.LLJJJJLIIL;
        if (view == null) {
            view = null;
        }
        C11EA.LJIIL(this, this.LLJJIJI, new AwS643S0100000_29(this, 22));
        C15RW c15rw = this.LLJI;
        if (c15rw == null) {
            c15rw = null;
        }
        c15rw.setOnProgressChangeListener(new InterfaceC19457511An() { // from class: X.11A7
            @Override // X.InterfaceC19457511An
            public final void LIZ(int i2) {
                C11A3 c11a3 = this.LIZ;
                c11a3.withState(c11a3.LLJJIJI, new AwS135S0101000_29(c11a3, i2, 1));
            }

            @Override // X.InterfaceC19457511An
            public final void LIZIZ(int i2, int i3) {
                C11A3 c11a3 = this.LIZ;
                c11a3.withState(c11a3.LLJJIJI, new AwS36S0102000_29(c11a3, i2, i3, 0));
            }
        });
        TextView textView3 = this.LLJILJILJ;
        if (textView3 != null) {
            textView = textView3;
        }
        textView.setText("0s");
        C11EA.LJII(this, this.LLJJIJI, new C2217381BqS() { // from class: X.11A4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((FTCCountdownState) obj).getMaxDuration());
            }
        }, new AwS643S0100000_29(this, 23));
        C786410Ut5.x3(viewTd.getViewTreeObserver(), new C12YV(this, view, viewTd, 0));
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
