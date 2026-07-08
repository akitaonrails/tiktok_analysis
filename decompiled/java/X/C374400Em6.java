package X;

import Y.ACListenerS140S0100000_5;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Em6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374400Em6 extends AbstractC1664490tPr<C374140Elg, C374300Elw> {
    public View LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public SurfaceView LLJJJJLIIL;
    public RelativeLayout LLJJL;
    public C1295960jpS LLJJLIIIJLLLLLLLZ;
    public RelativeLayout LLJL;
    public TuxTextView LLJLIL;
    public View LLJLILLLLZIIL;
    public ConstraintLayout LLJLL;
    public C374770Emh LLJLLIL;
    public FrameLayout LLJLLL;
    public Function0<Unit> LLJZ;
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 560));

    public final TuxIconDrawable LLLLLJIL(int i) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        return c419910GdJ.LIZ((Context) this.LLJZIJLIL.getValue());
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EmN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C374140Elg) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 470));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EmO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C374140Elg) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 471));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Em9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C374140Elg) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 472));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EmC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C374140Elg) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 461));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EmM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C374140Elg) obj).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 467));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EmA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C374140Elg) obj).LJII);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 468));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EmB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C374140Elg) obj).LJFF);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 469));
        View view = this.LLJJJJ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS140S0100000_5(this, 56), view);
        }
        View view2 = this.LLJLILLLLZIIL;
        if (view2 != null) {
            C786410Ut5.I7(new C391500FWq(this, 1), view2);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(R.style.y0);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c0o, viewGroup, false);
        this.LLJJJJ = viewTd.findViewById(R.id.exk);
        this.LLJJL = (RelativeLayout) viewTd.findViewById(R.id.wq0);
        this.LLJJLIIIJLLLLLLLZ = (C1295960jpS) viewTd.findViewById(R.id.ap6);
        this.LLJL = (RelativeLayout) viewTd.findViewById(R.id.ap7);
        this.LLJLIL = (TuxTextView) viewTd.findViewById(R.id.feh);
        this.LLJLILLLLZIIL = viewTd.findViewById(R.id.feg);
        this.LLJJJJJIL = viewTd.findViewById(R.id.nvv);
        this.LLJJJJLIIL = (SurfaceView) viewTd.findViewById(R.id.nvu);
        this.LLJLL = (ConstraintLayout) viewTd.findViewById(R.id.tre);
        this.LLJLLIL = (C374770Emh) viewTd.findViewById(R.id.e8m);
        this.LLJLLL = (FrameLayout) viewTd.findViewById(R.id.e8o);
        this.LLJJJIL = viewTd;
        float fLIZIZ = C418440Gaw.LIZIZ(8);
        SurfaceView surfaceView = this.LLJJJJLIIL;
        if (surfaceView != null) {
            C1447470nlp.LIZIZ(surfaceView, fLIZIZ);
        }
        View view = this.LLJJJJ;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, LLLLLJIL(R.raw.icon_eye));
        stateListDrawable.addState(new int[0], LLLLLJIL(R.raw.icon_eye_slash));
        if (view != null) {
            view.setBackground(stateListDrawable);
        }
        return (ViewGroup) viewTd;
    }
}
