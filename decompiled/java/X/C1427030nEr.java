package X;

import Y.ACListenerS156S0100000_22;
import Y.ARunnableS91S0200000_22;
import Y.AsS49S0100000_22;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0nEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427030nEr extends AbstractC1664490tPr<C1426550nE5, C1426920nEg> {
    public View LLJJJIL;
    public C197039127h LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public C1295960jpS LLJJJJLIIL;
    public RecyclerView LLJJL;
    public IntRange LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 87));

    public final C1427210nF9 LLLLLJIL() {
        return (C1427210nF9) this.LLJL.getValue();
    }

    public final void LLLLLJLJLL(Function1<? super IntRange, Unit> function1) {
        IntRange intRange = this.LLJJLIIIJLLLLLLLZ;
        if (intRange != null) {
            function1.invoke(intRange);
            return;
        }
        RecyclerView recyclerView = this.LLJJL;
        if (recyclerView != null) {
            HandlerHook.viewPost(recyclerView, new ARunnableS91S0200000_22(this, function1, 2));
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        int iIntValue;
        super.onViewCreated(view, bundle);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = LLLLILI().LIZ.LIZJ;
            C786410Ut5.W5(view, layoutParams);
            this.LLJJJIL = view.findViewById(R.id.hc6);
            this.LLJJJJ = (C197039127h) view.findViewById(R.id.tec);
            C1361400lX0 c1361400lX0 = new C1361400lX0(view.getContext(), R.style.y0);
            C197039127h c197039127h = this.LLJJJJ;
            int iIntValue2 = -1;
            if (c197039127h != null) {
                c197039127h.setButtonVariant(1);
                c197039127h.setButtonSize(0);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.zj, c1361400lX0);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
                c197039127h.setBackground(c384050F3z.LIZ(c1361400lX0));
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c1361400lX0);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -1;
                }
                c197039127h.setTextColor(iIntValue);
            }
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.hc3);
            this.LLJJJJJIL = tuxTextView;
            if (tuxTextView != null) {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, c1361400lX0);
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                }
                tuxTextView.setTextColor(iIntValue2);
            }
            this.LLJJJJLIIL = (C1295960jpS) view.findViewById(R.id.nnp);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.td4);
            this.LLJJL = recyclerView;
            if (recyclerView != null) {
                recyclerView.setAdapter(LLLLLJIL());
                recyclerView.setLayoutManager(new WrapGridLayoutManager(LLLLILI().LIZ.LIZ.LJIILJJIL, 1, requireSceneContext(), false));
                recyclerView.setItemAnimator(null);
                recyclerView.addOnItemTouchListener(new C113K(this, recyclerView, LLLLILI().LIZ.LIZ.LIZJ));
                recyclerView.addOnScrollListener(new AsS49S0100000_22(this, 2));
            }
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nEE
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1426550nE5) obj).LIZIZ;
                }
            }, Lifecycle.State.STARTED, new AwS585S0100000_6(this, 55));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nEo
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1426550nE5) obj).LIZLLL;
                }
            }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 73));
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nEt
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1426550nE5) obj).LJ;
                }
            }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 74));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nEl
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1426550nE5) obj).LJIIJJI;
                }
            }, new AwS601S0100000_22(this, 75));
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nEs
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1426550nE5) obj).LJIILIIL;
                }
            }, new AwS601S0100000_22(this, 68));
            LLLLLJIL().LLILZLL = new C1427070nEv(this);
            LLLLLJIL().LLIZ = new AwS636S0100000_22(this, 2);
            C197039127h c197039127h2 = this.LLJJJJ;
            if (c197039127h2 != null) {
                C786410Ut5.U8(c197039127h2, new ACListenerS156S0100000_22(this, 3));
            }
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nEk
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1426550nE5) obj).LJIIL;
                }
            }, new AwS601S0100000_22(this, 70));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.byb, viewGroup, false);
    }
}
