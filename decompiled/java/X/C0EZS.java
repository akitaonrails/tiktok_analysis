package X;

import Y.ACListenerS140S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EZS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EZS extends AbstractC1664490tPr<C0EZP, C0EZM> {
    public final C372500Ej2 LLJJJIL;
    public final C0E48 LLJJJJ;
    public final boolean LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public final ValueAnimator LLJJLIIIJLLLLLLLZ;
    public float[] LLJL;
    public boolean LLJLIL;
    public TuxIconView LLJLILLLLZIIL;

    public final void LLLLLJIL() {
        ViewGroup viewGroup;
        if (this.LLJJJJJIL) {
            TuxIconView tuxIconView = new TuxIconView(requireSceneContext(), null, 0, 6, null);
            tuxIconView.setId(R.id.gto);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
            layoutParams.addRule(21);
            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
            C786410Ut5.M6(tuxIconView, layoutParams);
            tuxIconView.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            this.LLJLILLLLZIIL = tuxIconView;
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[0], LLLLLL(false));
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, LLLLLL(true));
            TuxIconView tuxIconView2 = this.LLJLILLLLZIIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setImageDrawable(stateListDrawable);
            }
            View view = this.LLJJJJLIIL;
            if ((view instanceof RelativeLayout) && (viewGroup = (ViewGroup) view) != null) {
                viewGroup.addView(this.LLJLILLLLZIIL);
            }
            TuxIconView tuxIconView3 = this.LLJLILLLLZIIL;
            if (tuxIconView3 != null) {
                C786410Ut5.a9(tuxIconView3, new ACListenerS140S0100000_5(this, 94));
            }
        }
    }

    public final Drawable LLLLLJLJLL(boolean z) {
        int i;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_collapse;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ej);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(requireSceneContext());
        C384050F3z c384050F3z = new C384050F3z();
        if (z) {
            i = R.attr.zk;
        } else {
            i = R.attr.ee;
        }
        c384050F3z.LIZIZ = Integer.valueOf(i);
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(requireSceneContext()));
    }

    public final Drawable LLLLLL(boolean z) {
        int i;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_ellipsis_horizontal_fill;
        if (z) {
            i = R.attr.zk;
        } else {
            i = R.attr.ee;
        }
        c419910GdJ.LJ = Integer.valueOf(i);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(requireSceneContext());
        C384050F3z c384050F3z = new C384050F3z();
        int iLIZJ = C1308910kAL.LIZJ(R.attr.agm, requireSceneContext());
        if (iLIZJ == null) {
            iLIZJ = 0;
        }
        c384050F3z.LIZ = iLIZJ;
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(37));
        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(requireSceneContext()));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        TuxIconView tuxIconView;
        SeekBar seekBar;
        TuxIconView tuxIconView2;
        View viewFindViewById;
        TuxIconView tuxIconView3;
        View viewFindViewById2;
        View viewFindViewById3;
        super.onViewCreated(view, bundle);
        View view2 = this.LLJJJJLIIL;
        if (view2 != null) {
            tuxIconView = (TuxIconView) view2.findViewById(R.id.lhk);
        } else {
            tuxIconView = null;
        }
        if (tuxIconView != null) {
            if (C293810BfP.LIZ()) {
                ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                    C786410Ut5.W5(tuxIconView, layoutParams);
                    C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22))), null, null, false, 28);
                    C426750GoL.LJIIL(tuxIconView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 16);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            C786410Ut5.a9(tuxIconView, new ACListenerS140S0100000_5(this, 95));
        }
        if (C293800BfO.LIZ()) {
            View view3 = this.LLJJJJLIIL;
            if (view3 != null && (viewFindViewById3 = view3.findViewById(R.id.lhn)) != null) {
                C786410Ut5.I7(new ACListenerS140S0100000_5(this, 96), viewFindViewById3);
            }
            View view4 = this.LLJJJJLIIL;
            if (view4 != null && (viewFindViewById2 = view4.findViewById(R.id.zmv)) != null) {
                C1447470nlp.LIZIZ(viewFindViewById2, C418440Gaw.LIZIZ(200));
                C786410Ut5.I7(new ACListenerS140S0100000_5(this, 97), viewFindViewById2);
            }
            View view5 = this.LLJJJJLIIL;
            if (view5 != null && (tuxIconView3 = (TuxIconView) view5.findViewById(R.id.lhk)) != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
            }
            View view6 = this.LLJJL;
            if (view6 != null && (viewFindViewById = view6.findViewById(R.id.zmw)) != null) {
                ((RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams()).removeRule(21);
            }
            View view7 = this.LLJJL;
            if (view7 != null && (tuxIconView2 = (TuxIconView) view7.findViewById(R.id.lhl)) != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                C786410Ut5.a9(tuxIconView2, new ACListenerS140S0100000_5(this, 98));
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, LLLLLJLJLL(true));
                stateListDrawable.addState(new int[0], LLLLLJLJLL(false));
                tuxIconView2.setImageDrawable(stateListDrawable);
            }
            LLLLLJIL();
        }
        View view8 = this.LLJJJJLIIL;
        if (view8 != null) {
            C786410Ut5.I7(new ACListenerS140S0100000_5(this, 99), view8);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EZR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0EZP) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 721));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EZQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EZP) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS371S0200000_5(this, view, 155));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EZT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0EZP) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 718));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EZU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0EZP) obj).LJ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 719));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EZV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0EZP) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 720));
        View view9 = this.LLJJL;
        if (view9 != null && (seekBar = (SeekBar) view9.findViewById(R.id.ujp)) != null) {
            C786410Ut5.wb(seekBar, new C391570FWx(this, 7));
        }
    }

    public C0EZS(C372500Ej2 c372500Ej2, C0E48 c0e48, boolean z) {
        this.LLJJJIL = c372500Ej2;
        this.LLJJJJ = c0e48;
        this.LLJJJJJIL = z;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(250L);
        this.LLJJLIIIJLLLLLLLZ = valueAnimatorOfFloat;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        Integer numLIZJ;
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        C786410Ut5.LJZ(8, frameLayout);
        C426750GoL.LJIIIZ(frameLayout, null, Integer.valueOf(C497820Jfg.LIZJ(requireSceneContext())), null, null, false, 29);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c2k, viewGroup, false);
        C786410Ut5.W5(viewTd, new FrameLayout.LayoutParams(-1, -1));
        C426750GoL.LJIIIZ(viewTd, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(83))), false, 23);
        View viewTd2 = C786410Ut5.Td(layoutInflater, R.layout.bzo, viewGroup, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(83)));
        layoutParams.gravity = 80;
        C786410Ut5.W5(viewTd2, layoutParams);
        if (C293800BfO.LIZ() && (context = viewGroup.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(C0EGL.LIZ(), context)) != null) {
            viewTd2.setBackgroundColor(numLIZJ.intValue());
        }
        frameLayout.addView(viewTd);
        frameLayout.addView(viewTd2);
        this.LLJJJJLIIL = viewTd;
        this.LLJJL = viewTd2;
        return frameLayout;
    }
}
