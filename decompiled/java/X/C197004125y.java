package X;

import Y.AObjectS247S0100000_29;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS39S0300000_6;
import Y.ARunnableS75S0200000_6;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.als.LiveEvent;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.125y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197004125y extends AbstractC1664490tPr<C389230FNx, C197081128x> {
    public FrameLayout LLJJJIL;
    public View LLJJJJ;
    public C389110FNl LLJJJJJIL;
    public ViewTreeObserverOnGlobalLayoutListenerC426130GnL LLJJJJLIIL;

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
    }

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        View view;
        ViewTreeObserver viewTreeObserver;
        C389110FNl c389110FNl = this.LLJJJJJIL;
        if (c389110FNl != null) {
            c389110FNl.LIZLLL();
        }
        ViewTreeObserverOnGlobalLayoutListenerC426130GnL viewTreeObserverOnGlobalLayoutListenerC426130GnL = this.LLJJJJLIIL;
        if (viewTreeObserverOnGlobalLayoutListenerC426130GnL != null && (view = this.mView) != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC426130GnL);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC426130GnL, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        this.LLJJJJLIIL = null;
    }

    public final View LLLLLJIL() {
        View viewRequireView = requireView();
        View view = this.LLJJJJ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = viewRequireView.findViewById(R.id.v_touch_outside);
        this.LLJJJJ = viewFindViewById;
        return viewFindViewById;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        LiveEvent<C375830EoP<Unit>> liveEventV2;
        C385670FAf<C375830EoP<Unit>> c385670FAfXt0;
        C385670FAf<C375830EoP<Unit>> c385670FAfYe1;
        super.onActivityCreated(bundle);
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.i4n);
            this.LLJJJIL = (FrameLayout) callbackFindViewById;
        }
        FrameLayout frameLayout = (FrameLayout) callbackFindViewById;
        if (frameLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
            C1546210qL5.LIZ.getClass();
            c384050F3z.LJIIIIZZ = Float.valueOf(C1546210qL5.LIZ(26));
            c384050F3z.LJIIIZ = Float.valueOf(C1546210qL5.LIZ(26));
            frameLayout.setBackground(c384050F3z.LIZ(C1385040m98.LIZ(frameLayout.getContext(), true)));
            C786410Ut5.O7(frameLayout, new View.OnClickListener() { // from class: X.125z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        View viewLLLLLJIL = LLLLLJIL();
        if (viewLLLLLJIL != null) {
            C786410Ut5.I7(new AkS95S0100000_29(this, 46), viewLLLLLJIL);
            viewLLLLLJIL.setClickable(true ^ C301660Bs4.LIZ());
        }
        C1664590tQ1.LIZLLL(this, null, false, AFwS273S0000000_29.get$arr$(209), 3);
        C1664600tQ2.LIZ(this, null, new AwS584S0100000_5(this, 176));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FNy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C389230FNx) obj).LJI;
            }
        }, new AwS584S0100000_5(this, 177));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11y0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C389230FNx) obj).LJ;
            }
        }, new AwS608S0100000_29(this, 359));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11y1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C389230FNx) obj).LJFF;
            }
        }, new AwS608S0100000_29(this, 357));
        C389110FNl c389110FNl = this.LLJJJJJIL;
        if (c389110FNl != null && (c385670FAfYe1 = c389110FNl.ye1()) != null) {
            c385670FAfYe1.LIZ(this, new AObjectS247S0100000_29(this, 69));
        }
        C389110FNl c389110FNl2 = this.LLJJJJJIL;
        if (c389110FNl2 != null && (c385670FAfXt0 = c389110FNl2.Xt0()) != null) {
            c385670FAfXt0.LIZ(this, new AObjectS247S0100000_29(this, 70));
        }
        C389110FNl c389110FNl3 = this.LLJJJJJIL;
        if (c389110FNl3 != null && (liveEventV2 = c389110FNl3.v2()) != null) {
            liveEventV2.LIZ(this, new AObjectS247S0100000_29(this, 71));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eof, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0GnL, android.view.ViewTreeObserver$OnGlobalLayoutListener, java.lang.Object] */
    public final void LLLLLJLJLL(final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03) {
        View viewLLLLLJIL = LLLLLJIL();
        if (viewLLLLLJIL != null) {
            viewLLLLLJIL.setClickable(false);
        }
        final View view = this.mView;
        if (view == null) {
            function03.invoke();
            return;
        }
        if (view.getHeight() == 0) {
            ViewTreeObserverOnGlobalLayoutListenerC426130GnL viewTreeObserverOnGlobalLayoutListenerC426130GnL = this.LLJJJJLIIL;
            if (viewTreeObserverOnGlobalLayoutListenerC426130GnL != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC426130GnL);
                    C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC426130GnL, ViewTreeObserver.OnGlobalLayoutListener.class);
                }
            }
            ?? r2 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0GnL
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    ViewTreeObserverOnGlobalLayoutListenerC426130GnL viewTreeObserverOnGlobalLayoutListenerC426130GnL2 = this.LLJJJJLIIL;
                    if (viewTreeObserverOnGlobalLayoutListenerC426130GnL2 != null) {
                        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                        if (viewTreeObserver2.isAlive()) {
                            viewTreeObserver2.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC426130GnL2);
                            C2187701Ajg.LIZIZ(viewTreeObserver2, viewTreeObserverOnGlobalLayoutListenerC426130GnL2, ViewTreeObserver.OnGlobalLayoutListener.class);
                        }
                    }
                    C197004125y c197004125y = this;
                    c197004125y.LLJJJJLIIL = null;
                    C197004125y.LLLLLL(view, z, function0, function02, c197004125y, function03, height);
                }
            };
            this.LLJJJJLIIL = r2;
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.addOnGlobalLayoutListener(r2);
                C2187701Ajg.LIZ(viewTreeObserver2, r2, ViewTreeObserver.OnGlobalLayoutListener.class);
                return;
            }
            return;
        }
        LLLLLL(view, z, function0, function02, this, function03, view.getHeight());
    }

    public static final void LLLLLL(View view, boolean z, Function0<Unit> function0, Function0<Unit> function02, C197004125y c197004125y, Function0<Unit> function03, float f) {
        view.animate().cancel();
        if (z) {
            if (view.getTranslationY() != f) {
                C786410Ut5.ed(view, f);
            }
            view.animate().translationY(0.0f).setDuration(300L).withStartAction(new ARunnableS106S0100000_6((Function0) function0, 126)).withEndAction(new ARunnableS39S0300000_6(function02, c197004125y, function03, 6)).start();
        } else {
            if (view.getTranslationY() != 0.0f) {
                C786410Ut5.ed(view, 0.0f);
            }
            view.animate().translationY(f).setDuration(300L).withStartAction(new ARunnableS106S0100000_6((Function0) function0, 126)).withEndAction(new ARunnableS75S0200000_6(function02, function03, 63)).start();
        }
    }
}
