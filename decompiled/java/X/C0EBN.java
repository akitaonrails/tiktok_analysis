package X;

import Y.ACListenerS140S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS441S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EBN, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EBN extends C0FC9<C358230E2r, C358270E2v> {
    public final C355530Dwl LLJJJJJIL;
    public final Activity LLJJJJLIIL;
    public final C1DRG LLJJL;
    public C360690ECd LLJJLIIIJLLLLLLLZ;
    public C367060EaG LLJL;
    public TuxIconView LLJLIL;
    public C0ED1 LLJLILLLLZIIL;
    public TuxIconView LLJLL;
    public ConstraintLayout LLJLLIL;
    public TuxIconView LLJLLL;
    public TuxTextView LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;

    public final C0ED1 LLLLLLIL() {
        return (C0ED1) this.LLL.getValue();
    }

    public final C367060EaG LLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.h9x);
            this.LLJL = (C367060EaG) callbackFindViewById;
        }
        return (C367060EaG) callbackFindViewById;
    }

    public final TuxTextView LLLLLLJ() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.vk6);
            this.LLJZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final int LLLLLJLJLL(int i) {
        Integer numLIZJ;
        Context sceneContext = getSceneContext();
        if (sceneContext != null && (numLIZJ = C1308910kAL.LIZJ(i, sceneContext)) != null) {
            return numLIZJ.intValue();
        }
        return -1;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        InterfaceC360570EBr interfaceC360570EBr;
        int i;
        Integer num;
        super.onActivityCreated(bundle);
        C360690ECd c360690ECd = this.LLJJLIIIJLLLLLLLZ;
        if (c360690ECd != null) {
            c360690ECd.setOnStartFetchCategory(new AwS549S0100000_5(this, 456));
            c360690ECd.setOnInitFinishListener(new AwS441S0200000_5(this, c360690ECd, 5));
            c360690ECd.setOnFilterCategoryData(new AwS549S0100000_5(c360690ECd, 459));
            c360690ECd.setMultiPageViewProvider(new C0EBO(this, c360690ECd));
            int iLLLLLJLJLL = LLLLLJLJLL(R.attr.a1k);
            int iLLLLLJLJLL2 = LLLLLJLJLL(R.attr.a1h);
            int iLLLLLJLJLL3 = LLLLLJLJLL(R.attr.a1h);
            if (C357780E0y.LIZ()) {
                i = 52;
            } else {
                i = 54;
            }
            if (C357780E0y.LIZ()) {
                num = 42;
            } else {
                num = null;
            }
            c360690ECd.LJ(new C362490EJb("filtercomposer", false, 0, new AwS549S0100000_5(this, 460), 0, 0, i, Integer.valueOf(iLLLLLJLJLL3), iLLLLLJLJLL, num, iLLLLLJLJLL2, true, false, false, null, false, false, true, true, null, 738156982));
            C0EJZ resourceMultiTab = c360690ECd.getResourceMultiTab();
            if (resourceMultiTab != null) {
                resourceMultiTab.setOnTabSelected(new AwS371S0200000_5(this, c360690ECd, 81));
            }
        }
        if (!C357780E0y.LIZ() && (interfaceC360570EBr = (InterfaceC360570EBr) this.LLLFZ.getValue()) != null) {
            interfaceC360570EBr.Xo0();
        }
        LLLLLLIL().setLoadingTip(this.LLJJJJLIIL.getString(2131833349));
        LLLLLLIL().setErrorTip(this.LLJJJJLIIL.getString(2131833344));
        LLLLLLIL().setOnRetryClick(new AwS584S0100000_5(this, 394));
        C786410Ut5.LJLLLLLL(0, (View) this.LLLFF.getValue());
        C786410Ut5.LJLLLLLL(8, (View) this.LLLF.getValue());
        C786410Ut5.I7(new ACListenerS140S0100000_5(this, 41), (View) this.LLLFF.getValue());
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(final View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C367060EaG c367060EaGLLLLLL = LLLLLL();
        if (c367060EaGLLLLLL != null) {
            float fLIZIZ = C418440Gaw.LIZIZ(20);
            float fLIZIZ2 = C418440Gaw.LIZIZ(24);
            c367060EaGLLLLLL.LLJJJJJIL = fLIZIZ;
            c367060EaGLLLLLL.LLJJJJLIIL = fLIZIZ2;
        }
        C367060EaG c367060EaGLLLLLL2 = LLLLLL();
        if (c367060EaGLLLLLL2 != null) {
            c367060EaGLLLLLL2.setEnableThumbAlign(true);
        }
        C786410Ut5.zb((C367060EaG) this.LLJZIJLIL.getValue(), new SeekBar.OnSeekBarChangeListener() { // from class: X.0EBD
            public final void LIZ(SeekBar seekBar) {
                int paddingStart;
                int paddingEnd;
                int measuredWidth;
                int iLIZIZ;
                if (seekBar != null) {
                    paddingStart = seekBar.getPaddingStart();
                    paddingEnd = seekBar.getPaddingEnd();
                    measuredWidth = seekBar.getMeasuredWidth();
                } else {
                    paddingStart = 0;
                    paddingEnd = 0;
                    measuredWidth = 0;
                }
                int i = (measuredWidth - paddingStart) - paddingEnd;
                if (!(seekBar instanceof C367060EaG)) {
                    return;
                }
                TuxTextView tuxTextViewLLLLLLJ = this.LL.LLLLLLJ();
                if (tuxTextViewLLLLLLJ != null) {
                    tuxTextViewLLLLLLJ.setText(String.valueOf(((C367060EaG) seekBar).getActualProgress()));
                }
                TuxTextView tuxTextViewLLLLLLJ2 = this.LL.LLLLLLJ();
                if (tuxTextViewLLLLLLJ2 == null || (iLIZIZ = tuxTextViewLLLLLLJ2.getMeasuredWidth()) == 0) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(55));
                }
                C367060EaG c367060EaG = (C367060EaG) seekBar;
                double x = ((double) ((c367060EaG.getX() + paddingStart) + (c367060EaG.getScale() * i))) - (((double) iLIZIZ) / 2.0d);
                TuxTextView tuxTextViewLLLLLLJ3 = this.LL.LLLLLLJ();
                if (tuxTextViewLLLLLLJ3 != null) {
                    int i2 = (int) x;
                    int width = (view.getWidth() - iLIZIZ) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.5d)));
                    if (i2 > width) {
                        i2 = width;
                    }
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.5d)));
                    if (i2 < iLIZIZ2) {
                        i2 = iLIZIZ2;
                    }
                    C426750GoL.LJIIIZ(tuxTextViewLLLLLLJ3, Integer.valueOf(i2), null, null, null, false, 30);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                this.LL.LLLLIL().LIZ.invoke();
                LIZ(seekBar);
                TuxTextView tuxTextViewLLLLLLJ = this.LL.LLLLLLJ();
                if (tuxTextViewLLLLLLJ != null) {
                    C12C5.LIZIZ(tuxTextViewLLLLLLJ, 0L, 0.0f, null, 7);
                }
                if (!(seekBar instanceof C367060EaG)) {
                    return;
                }
                ((C367060EaG) seekBar).LJII(true);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                int progress;
                Function1<Integer, Unit> function1 = this.LL.LLLLIL().LIZJ;
                if (seekBar != null) {
                    progress = seekBar.getProgress();
                } else {
                    progress = 0;
                }
                function1.invoke(Integer.valueOf(progress));
                TuxTextView tuxTextViewLLLLLLJ = this.LL.LLLLLLJ();
                if (tuxTextViewLLLLLLJ != null) {
                    C0F29.LIZ(tuxTextViewLLLLLLJ, null, 15);
                }
                if (!(seekBar instanceof C367060EaG)) {
                    return;
                }
                ((C367060EaG) seekBar).LJII(false);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                this.LL.LLLLIL().LIZIZ.invoke(Integer.valueOf(i));
                LIZ(seekBar);
            }
        });
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E31
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C358230E2r) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 389));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E32
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C358230E2r) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 390));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E33
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C358230E2r) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 391));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E35
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C358230E2r) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 392));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E34
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C358230E2r) obj).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 388));
    }

    public C0EBN(C355530Dwl c355530Dwl, Activity activity, C1DRG c1drg) {
        super(c1drg);
        this.LLJJJJJIL = c355530Dwl;
        this.LLJJJJLIIL = activity;
        this.LLJJL = c1drg;
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 454));
        this.LLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 451));
        this.LLLF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 448));
        this.LLLFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 449));
        this.LLLFFI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 450));
        this.LLLFZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 453));
        this.LLLI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 452));
        this.LLLII = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(141));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        if (C357780E0y.LIZ()) {
            viewGroup2 = (ViewGroup) C786410Ut5.Sd(R.layout.c10, layoutInflater, null);
        } else {
            viewGroup2 = (ViewGroup) C786410Ut5.Sd(R.layout.c0z, layoutInflater, null);
        }
        this.LLJJLIIIJLLLLLLLZ = new C360690ECd(viewGroup2.getContext(), this);
        C360690ECd c360690ECd = this.LLJJLIIIJLLLLLLLZ;
        if (c360690ECd != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c360690ECd);
            c360690ECd.setLayoutParams(layoutParams);
        }
        C360690ECd c360690ECd2 = this.LLJJLIIIJLLLLLLLZ;
        if (c360690ECd2 != null) {
            viewGroup2.addView(c360690ECd2, 0);
        }
        return viewGroup2;
    }
}
