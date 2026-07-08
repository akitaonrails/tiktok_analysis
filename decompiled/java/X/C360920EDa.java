package X;

import Y.ACListenerS140S0100000_5;
import Y.ARunnableS16S0101000_5;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS441S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0EDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360920EDa extends C0FC9<C360990EDh, InterfaceC360940EDc> {
    public final Activity LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public C367060EaG LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public ConstraintLayout LLJL;
    public TuxTextView LLJLIL;
    public LinearLayout LLJLILLLLZIIL;
    public ConstraintLayout LLJLL;
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;
    public TuxIconView LLJZ;
    public ConstraintLayout LLJZIJLIL;
    public TuxTextView LLL;
    public LinearLayout LLLF;
    public LinearLayout LLLFF;
    public LinearLayout LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public C360690ECd LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final boolean LLLIL;
    public final C01GW LLLILZ;

    public final boolean LLLLLL() {
        return ((Boolean) this.LLLILZ.getValue()).booleanValue();
    }

    public final C367060EaG LLLLLLJ() {
        return (C367060EaG) this.LLLI.getValue();
    }

    public final TuxTextView LLLLLLIL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.haj);
            this.LLJLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout LLLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLLF;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.yhr);
            this.LLLF = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final ConstraintLayout LLLLLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJZIJLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.yhq);
            this.LLJZIJLIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxTextView LLLLLLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.yhs);
            this.LLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ConstraintLayout LLLLLLLZIL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.yht);
            this.LLJL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final LinearLayout LLLLLLZ() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLLFF;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.yi_);
            this.LLLFF = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final ConstraintLayout LLLLLLZZ() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.yig);
            this.LLJLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final int LLLLLJLJLL(int i) {
        Integer numLIZJ;
        Context sceneContext = getSceneContext();
        if (sceneContext != null && (numLIZJ = C1308910kAL.LIZJ(i, sceneContext)) != null) {
            return numLIZJ.intValue();
        }
        return -1;
    }

    public final void LLLLLZ(int i) {
        C0EJZ resourceMultiTab;
        C360690ECd c360690ECd = this.LLLII;
        if (c360690ECd != null) {
            C527320KmA resourceViewPagerFromXml = c360690ECd.getResourceViewPagerFromXml();
            if (resourceViewPagerFromXml != null) {
                resourceViewPagerFromXml.setCurrentItem(i, false);
            }
            c360690ECd.LLJJ = i;
        }
        C360690ECd c360690ECd2 = this.LLLII;
        if (c360690ECd2 != null && (resourceMultiTab = c360690ECd2.getResourceMultiTab()) != null) {
            resourceMultiTab.LJIIIIZZ();
        }
        C360690ECd c360690ECd3 = this.LLLII;
        if (c360690ECd3 != null) {
            HandlerHook.viewPost(c360690ECd3, new ARunnableS16S0101000_5(i, this, 5));
        }
    }

    public final void LLLLLZL(boolean z) {
        if (this.mView == null) {
            return;
        }
        if (z) {
            ConstraintLayout constraintLayoutLLLLLLLLL = LLLLLLLLL();
            if (constraintLayoutLLLLLLLLL != null) {
                C786410Ut5.LL(0, constraintLayoutLLLLLLLLL);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayoutLLLLLLLLL2 = LLLLLLLLL();
        if (constraintLayoutLLLLLLLLL2 == null) {
            return;
        }
        C786410Ut5.LL(8, constraintLayoutLLLLLLLLL2);
    }

    public final void LLLLZ(boolean z) {
        if (this.mView == null) {
            return;
        }
        if (z) {
            ConstraintLayout constraintLayoutLLLLLLZZ = LLLLLLZZ();
            if (constraintLayoutLLLLLLZZ != null) {
                C786410Ut5.LL(0, constraintLayoutLLLLLLZZ);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayoutLLLLLLZZ2 = LLLLLLZZ();
        if (constraintLayoutLLLLLLZZ2 == null) {
            return;
        }
        C786410Ut5.LL(8, constraintLayoutLLLLLLZZ2);
    }

    public C360920EDa(C1DRG c1drg, Activity activity) {
        super(c1drg);
        this.LLJJJJJIL = activity;
        this.LLJJJJLIIL = c1drg;
        this.LLLFZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(144));
        this.LLLI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 484));
        this.LLLIIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 479));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 478));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 476));
        this.LLLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 502));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 500));
        this.LLLIL = true;
        this.LLLILZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 506));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        C19ME c19me;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C362490EJb c362490EJb;
        int i;
        int i2;
        int i3;
        int i4;
        Integer num;
        C19ME c19me2;
        super.onViewCreated(view, bundle);
        if (!C357780E0y.LIZ()) {
            if (LLLLLL()) {
                InterfaceC360570EBr interfaceC360570EBr = (InterfaceC360570EBr) this.LLLIIII.getValue();
                if (interfaceC360570EBr != null) {
                    interfaceC360570EBr.BA0(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(329)));
                }
            } else {
                InterfaceC360570EBr interfaceC360570EBr2 = (InterfaceC360570EBr) this.LLLIIII.getValue();
                if (interfaceC360570EBr2 != null) {
                    interfaceC360570EBr2.BA0(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(276)));
                }
            }
        }
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.yi8);
            this.LLJJLIIIJLLLLLLLZ = (TuxIconView) callbackFindViewById;
        }
        if (callbackFindViewById != null) {
            View viewRequireView2 = requireView();
            Object objFindViewById = this.LLJJLIIIJLLLLLLLZ;
            if (objFindViewById == null) {
                objFindViewById = viewRequireView2.findViewById(R.id.yi8);
                this.LLJJLIIIJLLLLLLLZ = (TuxIconView) objFindViewById;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(objFindViewById, "rotation", 0.0f, 360.0f);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
        C360690ECd c360690ECd = this.LLLII;
        if (c360690ECd != null) {
            ViewGroup.LayoutParams layoutParams3 = c360690ECd.getLayoutParams();
            if ((layoutParams3 instanceof C19ME) && (c19me2 = (C19ME) layoutParams3) != null && this.LLLIL) {
                c19me2.topToBottom = -1;
                c19me2.topToTop = 0;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c360690ECd);
                c360690ECd.setLayoutParams(c19me2);
            }
            C0EJZ c0ejz = c360690ECd.LLILZLL;
            if (c0ejz != null) {
                C786410Ut5.L1(c0ejz, 8);
            }
            c360690ECd.setOnStartFetchCategory(new AwS549S0100000_5(c360690ECd, 470));
            c360690ECd.setOnPreprocessingCategoryData(new AwS584S0100000_5(this, 397));
            c360690ECd.setOnInitFinishListener(new AwS441S0200000_5(this, c360690ECd, 6));
            c360690ECd.setMultiPageViewProvider(new C360930EDb(this, c360690ECd));
            if (C301740BsC.LIZ()) {
                boolean z = this.LLLIL;
                if (C357780E0y.LIZ()) {
                    i = 40;
                } else {
                    i = 52;
                }
                int iLLLLLJLJLL = LLLLLJLJLL(R.attr.a1k);
                int iLLLLLJLJLL2 = LLLLLJLJLL(R.attr.zi);
                int iLLLLLJLJLL3 = LLLLLJLJLL(R.attr.a1k);
                if (this.LLLIL) {
                    i2 = 52;
                } else {
                    i2 = 40;
                }
                if (C357780E0y.LIZ()) {
                    i3 = 20;
                } else {
                    i3 = 4;
                }
                if (this.LLLIL) {
                    i4 = 52;
                } else {
                    i4 = 0;
                }
                if (C357780E0y.LIZ()) {
                    num = 42;
                } else {
                    num = null;
                }
                c362490EJb = new C362490EJb("editor_pro_transition", z, i, new AwS549S0100000_5(this, 480), i4, i3, i2, Integer.valueOf(iLLLLLJLJLL3), iLLLLLJLJLL, num, iLLLLLJLJLL2, true, false, true, Integer.valueOf(R.attr.bn), false, false, true, false, new AwS619S0100000_5(this, 12), 335110400);
            } else {
                c362490EJb = new C362490EJb("editor_pro_transition", false, 0, null, 0, 0, 0, null, 0, null, 0, false, false, false, null, false, true, true, false, null, 973078526);
            }
            c360690ECd.LJ(c362490EJb);
            C0EJZ resourceMultiTab = c360690ECd.getResourceMultiTab();
            if (resourceMultiTab != null) {
                resourceMultiTab.setOnTabSelected(new AwS371S0200000_5(this, c360690ECd, 83));
            }
        }
        if (((Boolean) this.LLLFZ.getValue()).booleanValue()) {
            C367060EaG c367060EaGLLLLLLJ = LLLLLLJ();
            if (c367060EaGLLLLLLJ != null) {
                float fLIZIZ = C418440Gaw.LIZIZ(20);
                float fLIZIZ2 = C418440Gaw.LIZIZ(24);
                c367060EaGLLLLLLJ.LLJJJJJIL = fLIZIZ;
                c367060EaGLLLLLLJ.LLJJJJLIIL = fLIZIZ2;
            }
            C367060EaG c367060EaGLLLLLLJ2 = LLLLLLJ();
            if (c367060EaGLLLLLLJ2 != null) {
                c367060EaGLLLLLLJ2.setEnableThumbAlign(true);
            }
        }
        C367060EaG c367060EaGLLLLLLJ3 = LLLLLLJ();
        if (c367060EaGLLLLLLJ3 != null) {
            C786410Ut5.zb(c367060EaGLLLLLLJ3, new C391570FWx(this, 0));
        }
        ConstraintLayout constraintLayoutLLLLLLLZIL = LLLLLLLZIL();
        if (constraintLayoutLLLLLLLZIL != null) {
            layoutParams = constraintLayoutLLLLLLLZIL.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && this.LLLIL) {
            marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
            ConstraintLayout constraintLayoutLLLLLLLZIL2 = LLLLLLLZIL();
            if (constraintLayoutLLLLLLLZIL2 != null) {
                C786410Ut5.m6(constraintLayoutLLLLLLLZIL2, marginLayoutParams);
            }
        }
        ConstraintLayout constraintLayoutLLLLLLLZIL3 = LLLLLLLZIL();
        if (constraintLayoutLLLLLLLZIL3 != null) {
            C786410Ut5.LL(0, constraintLayoutLLLLLLLZIL3);
        }
        ConstraintLayout constraintLayoutLLLLLLLZIL4 = LLLLLLLZIL();
        if (constraintLayoutLLLLLLLZIL4 != null) {
            C786410Ut5.Y7(constraintLayoutLLLLLLLZIL4, new ACListenerS140S0100000_5(this, 48));
        }
        if (this.LLLIL) {
            ConstraintLayout constraintLayoutLLLLLLLLL = LLLLLLLLL();
            if (constraintLayoutLLLLLLLLL != null) {
                layoutParams2 = constraintLayoutLLLLLLLLL.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                c19me.topToTop = -1;
                c19me.bottomToBottom = 0;
                ConstraintLayout constraintLayoutLLLLLLLLL2 = LLLLLLLLL();
                if (constraintLayoutLLLLLLLLL2 != null) {
                    C786410Ut5.m6(constraintLayoutLLLLLLLLL2, c19me);
                }
            }
        }
        TuxTextView tuxTextViewLLLLLLLLLL = LLLLLLLLLL();
        if (tuxTextViewLLLLLLLLLL != null) {
            tuxTextViewLLLLLLLLLL.setTuxFont(62);
        }
        if (C293810BfP.LIZ()) {
            LinearLayout linearLayoutLLLLLLL = LLLLLLL();
            if (linearLayoutLLLLLLL != null) {
                ViewGroup.LayoutParams layoutParams4 = linearLayoutLLLLLLL.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.height = -2;
                    C786410Ut5.W5(linearLayoutLLLLLLL, layoutParams4);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            LinearLayout linearLayoutLLLLLLL2 = LLLLLLL();
            if (linearLayoutLLLLLLL2 != null) {
                C426750GoL.LJIIL(linearLayoutLLLLLLL2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, null, null, 30);
            }
            LinearLayout linearLayoutLLLLLLL3 = LLLLLLL();
            if (linearLayoutLLLLLLL3 != null) {
                C426750GoL.LJIIIZ(linearLayoutLLLLLLL3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, null, false, 30);
            }
            if (!C357780E0y.LIZ()) {
                TuxTextView tuxTextViewLLLLLLLLLL2 = LLLLLLLLLL();
                if (tuxTextViewLLLLLLLLLL2 != null) {
                    C426750GoL.LJIIL(tuxTextViewLLLLLLLLLL2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 16);
                }
            } else {
                TuxTextView tuxTextViewLLLLLLLLLL3 = LLLLLLLLLL();
                if (tuxTextViewLLLLLLLLLL3 != null) {
                    C426750GoL.LJIIL(tuxTextViewLLLLLLLLLL3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(7.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(7.5d)))), 16);
                }
            }
        }
        LinearLayout linearLayoutLLLLLLL4 = LLLLLLL();
        if (linearLayoutLLLLLLL4 != null) {
            C786410Ut5.R7(linearLayoutLLLLLLL4, new ACListenerS140S0100000_5(this, 47));
        }
        LinearLayout linearLayoutLLLLLLZ = LLLLLLZ();
        if (linearLayoutLLLLLLZ != null) {
            C786410Ut5.R7(linearLayoutLLLLLLZ, new ACListenerS140S0100000_5(this, 43));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EDk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C360990EDh) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 411));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EDl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C360990EDh) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 413));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EDm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C360990EDh) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 414));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EDe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C360990EDh) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 398));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EDd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C360990EDh) obj).LJFF);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 401));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EDf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C360990EDh) obj).LJI;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 403));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EDg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C360990EDh) obj).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 404));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EDi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C360990EDh) obj).LJII;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 405));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EDj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C360990EDh) obj).LJIIIIZZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 407));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EBm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C360990EDh) obj).LJIIIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 410));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        int i;
        int iLIZIZ;
        if (C357780E0y.LIZ()) {
            viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c30, viewGroup, false);
        } else {
            viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c2z, viewGroup, false);
        }
        this.LLLII = new C360690ECd(viewGroup2.getContext(), this);
        C360690ECd c360690ECd = this.LLLII;
        if (c360690ECd != null) {
            if (C357780E0y.LIZ()) {
                iLIZIZ = 0;
            } else if (LLLLLL()) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
            } else {
                if (C293810BfP.LIZ()) {
                    i = 57;
                } else {
                    i = 28;
                }
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            }
            c360690ECd.setId(View.generateViewId());
            C19ME c19me = new C19ME(-1, 0);
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = iLIZIZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c360690ECd);
            c360690ECd.setLayoutParams(c19me);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup2.findViewById(R.id.gtv);
        C360690ECd c360690ECd2 = this.LLLII;
        if (c360690ECd2 != null) {
            constraintLayout.addView(c360690ECd2);
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            if (C357780E0y.LIZ()) {
                c19mb.LJIIIIZZ(c360690ECd2.getId(), 4, R.id.yig, 3);
            } else {
                c19mb.LJIIIIZZ(c360690ECd2.getId(), 4, R.id.yig, 4);
            }
            c19mb.LJIIIIZZ(c360690ECd2.getId(), 3, R.id.yht, 4);
            c19mb.LIZIZ(constraintLayout);
        }
        return viewGroup2;
    }
}
