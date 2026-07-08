package X;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Emn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374830Emn extends AbstractC1664490tPr<C374720Emc, C374730Emd> {
    public C367060EaG LLJJJIL;
    public TuxTextView LLJJJJ;
    public C367060EaG LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public C1295960jpS LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public LinearLayout LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public InterfaceC374530EmJ LLJLLL;

    public final TuxTextView LLLLLLJ() {
        return (TuxTextView) this.LLJLLIL.getValue();
    }

    public C374830Emn() {
        setTheme(R.style.y0);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 536));
        this.LLJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 535));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 537));
        this.LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 538));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 539));
    }

    public final C367060EaG LLLLLJIL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.kuu);
            this.LLJJJIL = (C367060EaG) callbackFindViewById;
        }
        C367060EaG c367060EaG = (C367060EaG) callbackFindViewById;
        if (c367060EaG == null) {
            return null;
        }
        c367060EaG.setVibrate(false);
        C426750GoL.LJIIIZ(c367060EaG, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, false, 26);
        C366990Ea9 c366990Ea9 = new C366990Ea9();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c367060EaG.getContext());
        c366990Ea9.LIZ = numLIZJ != null ? numLIZJ.intValue() : -1;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, c367060EaG.getContext());
        c366990Ea9.LIZIZ = numLIZJ2 != null ? numLIZJ2.intValue() : -16777216;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.oz, c367060EaG.getContext());
        c366990Ea9.LIZLLL = numLIZJ3 != null ? numLIZJ3.intValue() : -16777216;
        c367060EaG.setProgressDrawable(c366990Ea9);
        c367060EaG.setEnableThumbAlign(true);
        float fLIZIZ = C418440Gaw.LIZIZ(20);
        float fLIZIZ2 = C418440Gaw.LIZIZ(24);
        c367060EaG.LLJJJJJIL = fLIZIZ;
        c367060EaG.LLJJJJLIIL = fLIZIZ2;
        int i = (int) (LLLLILI().LIZ.LIZLLL * 100);
        c367060EaG.setProgress(i);
        TuxTextView tuxTextViewLLLLLJLJLL = LLLLLJLJLL();
        if (tuxTextViewLLLLLJLJLL != null) {
            tuxTextViewLLLLLJLJLL.setText(String.valueOf(i));
        }
        return c367060EaG;
    }

    public final TuxTextView LLLLLJLJLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.kuw);
            this.LLJJJJ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C367060EaG LLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.uxx);
            this.LLJJJJJIL = (C367060EaG) callbackFindViewById;
        }
        C367060EaG c367060EaG = (C367060EaG) callbackFindViewById;
        if (c367060EaG == null) {
            return null;
        }
        c367060EaG.setVibrate(false);
        C426750GoL.LJIIIZ(c367060EaG, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, false, 26);
        C366990Ea9 c366990Ea9 = new C366990Ea9();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c367060EaG.getContext());
        c366990Ea9.LIZ = numLIZJ != null ? numLIZJ.intValue() : -1;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, c367060EaG.getContext());
        c366990Ea9.LIZIZ = numLIZJ2 != null ? numLIZJ2.intValue() : -16777216;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.oz, c367060EaG.getContext());
        c366990Ea9.LIZLLL = numLIZJ3 != null ? numLIZJ3.intValue() : -16777216;
        c367060EaG.setProgressDrawable(c366990Ea9);
        c367060EaG.setEnableThumbAlign(true);
        float fLIZIZ = C418440Gaw.LIZIZ(20);
        float fLIZIZ2 = C418440Gaw.LIZIZ(24);
        c367060EaG.LLJJJJJIL = fLIZIZ;
        c367060EaG.LLJJJJLIIL = fLIZIZ2;
        int i = (int) (LLLLILI().LIZ.LJ * 100);
        c367060EaG.setProgress(i);
        TuxTextView tuxTextViewLLLLLLIL = LLLLLLIL();
        if (tuxTextViewLLLLLLIL != null) {
            tuxTextViewLLLLLLIL.setText(String.valueOf(i));
        }
        return c367060EaG;
    }

    public final TuxTextView LLLLLLIL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJJJLIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.uy0);
            this.LLJJJJLIIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void LLLLLLL(SeekBar seekBar) {
        View view;
        int iLIZIZ;
        int iLIZIZ2;
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (seekBar == null || (view = (View) this.LLJLIL.getValue()) == null) {
            return;
        }
        int paddingStart = seekBar.getPaddingStart();
        int measuredWidth = (seekBar.getMeasuredWidth() - paddingStart) - seekBar.getPaddingEnd();
        if (!(seekBar instanceof C367060EaG)) {
            return;
        }
        TuxTextView tuxTextViewLLLLLLJ = LLLLLLJ();
        if (tuxTextViewLLLLLLJ != null) {
            tuxTextViewLLLLLLJ.setText(String.valueOf(((C367060EaG) seekBar).getActualProgress()));
        }
        TuxTextView tuxTextViewLLLLLLJ2 = LLLLLLJ();
        int i = 0;
        if (tuxTextViewLLLLLLJ2 == null || (iLIZIZ = tuxTextViewLLLLLLJ2.getMeasuredWidth()) == 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(53));
        }
        TuxTextView tuxTextViewLLLLLLJ3 = LLLLLLJ();
        if (tuxTextViewLLLLLLJ3 == null || (iLIZIZ2 = tuxTextViewLLLLLLJ3.getMeasuredHeight()) == 0) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33));
        }
        C367060EaG c367060EaG = (C367060EaG) seekBar;
        double x = ((double) ((c367060EaG.getX() + paddingStart) + (c367060EaG.getScale() * measuredWidth))) - (((double) iLIZIZ) / 2.0d);
        Object parent = c367060EaG.getParent();
        if ((parent instanceof ViewGroup) && (view2 = (View) parent) != null) {
            float f = (float) x;
            float width = (view2.getWidth() - iLIZIZ) - C418440Gaw.LIZIZ(Double.valueOf(5.5d));
            if (f > width) {
                f = width;
            }
            float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(5.5d));
            if (f < fLIZIZ) {
                f = fLIZIZ;
            }
            TuxTextView tuxTextViewLLLLLLJ4 = LLLLLLJ();
            if (tuxTextViewLLLLLLJ4 != null) {
                if (C423170GiZ.LIZ(requireSceneContext())) {
                    f = -f;
                }
                C786410Ut5.Vc(tuxTextViewLLLLLLJ4, f);
            }
            TuxTextView tuxTextViewLLLLLLJ5 = LLLLLLJ();
            if (tuxTextViewLLLLLLJ5 != null) {
                int top = view2.getTop() + view.getPaddingTop();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    i = marginLayoutParams.topMargin;
                }
                C786410Ut5.wd(tuxTextViewLLLLLLJ5, (((top + i) + c367060EaG.getTop()) - iLIZIZ2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            }
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C1654320t9S.LIZIZ(this, AFwS234S0000000_5.get$arr$(222));
        C1664590tQ1.LIZLLL(this, "ChromaKeyScene", false, AFwS234S0000000_5.get$arr$(224), 2);
        C1664600tQ2.LIZ(this, "ChromaKeyScene", new AwS584S0100000_5(this, 443));
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
        if (c1drg != null) {
            this.LLJLLL = (InterfaceC374530EmJ) c1drg.LJIIL(null, InterfaceC374530EmJ.class);
        }
        InterfaceC374530EmJ interfaceC374530EmJ = this.LLJLLL;
        if (interfaceC374530EmJ != null) {
            interfaceC374530EmJ.setTitle("");
            interfaceC374530EmJ.s00(new C377060EqO(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), Integer.valueOf(R.raw.icon_tick), Integer.valueOf(R.raw.icon_arrow_counter_clockwise)));
        }
        C367060EaG c367060EaGLLLLLJIL = LLLLLJIL();
        if (c367060EaGLLLLLJIL != null) {
            C786410Ut5.zb(c367060EaGLLLLLJIL, new C391570FWx(this, 2));
        }
        C367060EaG c367060EaGLLLLLL = LLLLLL();
        if (c367060EaGLLLLLL != null) {
            C786410Ut5.zb(c367060EaGLLLLLL, new C391570FWx(this, 3));
        }
        InterfaceC374530EmJ interfaceC374530EmJ2 = this.LLJLLL;
        if (interfaceC374530EmJ2 != null) {
            interfaceC374530EmJ2.u11(new InterfaceC374650EmV() { // from class: X.0Emg
                @Override // X.InterfaceC374650EmV
                public final void LIZ() {
                    this.LIZ.LLLLIL().LIZJ.invoke();
                }

                @Override // X.InterfaceC374650EmV
                public final void onCancel() {
                    this.LIZ.LLLLIL().LIZLLL.invoke();
                }
            });
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Emk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C374720Emc) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 448));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Emo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C374720Emc) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 449));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Emp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C374720Emc) obj).LJII);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 450));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Eml
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C374720Emc) obj).LJI);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 440));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Emm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C374720Emc) obj).LJFF);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 447));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c0b, viewGroup, false);
    }
}
