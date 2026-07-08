package X;

import Y.ALAdapterS17S0200000_22;
import Y.ALAdapterS18S0100000_22;
import Y.AObjectS245S0100000_22;
import Y.AObserverS225S0100000_22;
import Y.AUListenerS270S0100000_21;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nCe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425660nCe extends i<InterfaceC1425550nCT, C1425670nCf, C1425680nCg, C1425700nCi> implements InterfaceC1425550nCT, InterfaceC379610EuV {
    public static final C1425760nCo LLJJLIIIJLLLLLLLZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final ShortVideoContext LLJJ;
    public final SmartImageView LLJJI;
    public C1425670nCf LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public final C01GW LLJJJJ;
    public Animator LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0nCo] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1425660nCe.class, "editTabStateApi", "getEditTabStateApi()Lcom/ss/android/ugc/aweme/editorpro/EditorTabStateApi;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1425660nCe.class, "newEditBtnApi", "getNewEditBtnApi()Lcom/ss/android/ugc/aweme/editorpro/newedit/INewEditApi;", 0), new C2217381BqS(C1425660nCe.class, "templateHelpApi", "getTemplateHelpApi()Lcom/ss/android/ugc/aweme/editorpro/TemplateHelpApi;", 0)};
        LLJJLIIIJLLLLLLLZ = new Object() { // from class: X.0nCo
        };
    }

    public final void O4(Float f) {
    }

    private final InterfaceC1425510nCP T4() {
        return (InterfaceC1425510nCP) this.LLJJIJI.getValue(this, LLJL[0]);
    }

    private final InterfaceC1425690nCh Z4() {
        return (InterfaceC1425690nCh) this.LLJJIJIIJIL.getValue(this, LLJL[1]);
    }

    private final boolean k5() {
        return ((Boolean) this.LLJJJJ.getValue()).booleanValue();
    }

    @Override // ge.i
    public Function0<C1425670nCf> E3() {
        return new AwS566S0100000_22(this, 107);
    }

    public final InterfaceC1424260nAO d5() {
        return (InterfaceC1424260nAO) this.LLJJIJIL.getValue(this, LLJL[2]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1425680nCg> o2() {
        return AFwS210S0000000_22.get$arr$(60);
    }

    public final void t5() {
        C0L0E c0l0e = C0L0E.LIZ;
        Activity activityRequireActivity = this.LLJILJILJ.requireActivity();
        ShortVideoContext shortVideoContext = this.LLJJ;
        C19A3 c19a3 = this.LLJILJILJ;
        c0l0e.getClass();
        C0L0E.LIZ(activityRequireActivity, shortVideoContext, c19a3);
        C1419580n2q c1419580n2q = C1419580n2q.LIZ;
        ShortVideoContext shortVideoContext2 = this.LLJJ;
        c1419580n2q.getClass();
        C1419580n2q.LIZ(shortVideoContext2);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1425700nCi> w2() {
        return new AwS566S0100000_22(this, 106);
    }

    public final void K4() {
        T4().Ts0("click_cross");
    }

    public final void n5() {
        if (C288810BTr.LIZ()) {
            C531110KsH.LIZJ(C531110KsH.LIZ, this.LLJILJILJ, this.LLJJ, true, System.currentTimeMillis(), null, false, null, false, false, false, true, 1008);
            C0MWG c0mwg = C0MWG.LIZ;
            ShortVideoContext shortVideoContext = this.LLJJ;
            c0mwg.getClass();
            C0MWG.LIZ("new_edit", shortVideoContext, false);
        } else {
            Z4().wF0();
        }
        C0MWG c0mwg2 = C0MWG.LIZ;
        ShortVideoContext shortVideoContext2 = this.LLJJ;
        c0mwg2.getClass();
        C0MWG.LIZIZ(true, shortVideoContext2);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<C1422970n8J> c385670FAfEq1;
        super.onCreate();
        i3(AFwS261S0000000_22.get$arr$(57));
        T4().zT().observe(this, new AObserverS225S0100000_22(this, 13));
        Z4().Wn().LIZ(this, new AObjectS245S0100000_22(this, 17));
        Z4().BM().LIZ(this, new AObjectS245S0100000_22(this, 18));
        d5().GO().LIZ(this, new AObjectS245S0100000_22(this, 19));
        if (!k5() || C298960Bni.LIZ() || (c385670FAfEq1 = d5().Eq1()) == null) {
            return;
        }
        c385670FAfEq1.LIZ(this, new AObjectS245S0100000_22(this, 20));
    }

    @Override // X.InterfaceC1425550nCT
    public int tY1() {
        return T2().LIZ;
    }

    public final void v5() {
        d5().MG2(false);
    }

    public final void x5() {
        d5().MG2(!C298960Bni.LIZ());
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    private final void C5(float f) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        if (this.LLJJJ) {
            C1425670nCf c1425670nCf = this.LLJJIII;
            if (c1425670nCf != null && (view5 = c1425670nCf.LLJJJIL) != null) {
                C786410Ut5.LJLLLLLL(0, view5);
            }
            C1425670nCf c1425670nCf2 = this.LLJJIII;
            if (c1425670nCf2 != null && (view4 = c1425670nCf2.LLJJJJ) != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
            this.LLJJJ = false;
        }
        C1425670nCf c1425670nCf3 = this.LLJJIII;
        if (c1425670nCf3 != null && (view3 = c1425670nCf3.LLJJJIL) != null) {
            C786410Ut5.T4(view3, f);
        }
        if (f == 0.0f) {
            this.LLJJJIL = false;
            C1425670nCf c1425670nCf4 = this.LLJJIII;
            if (c1425670nCf4 != null && (view2 = c1425670nCf4.LLJJJIL) != null) {
                C786410Ut5.LJLLLLLL(4, view2);
            }
        } else {
            C1425670nCf c1425670nCf5 = this.LLJJIII;
            if (c1425670nCf5 != null && (view = c1425670nCf5.LLJJJIL) != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        }
        if (f == 1.0f && !this.LLJJJIL) {
            C0MWG c0mwg = C0MWG.LIZ;
            ShortVideoContext shortVideoContext = this.LLJJ;
            c0mwg.getClass();
            C0MWG.LIZJ(true, shortVideoContext);
            this.LLJJJIL = true;
        }
    }

    public final void D5(Float f) {
        View view;
        View view2;
        ImageView imageView;
        boolean z;
        C1425670nCf c1425670nCf = this.LLJJIII;
        if (c1425670nCf != null && (view = c1425670nCf.LLJJJJLIIL) != null && (view2 = c1425670nCf.LLJL) != null && (imageView = c1425670nCf.LLJJJJJIL) != null) {
            if (k5() && f != null) {
                if (f.floatValue() <= 0.05f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z == this.LLJJJJLIIL) {
                    return;
                }
                this.LLJJL = z;
                this.LLJJJJLIIL = z;
                Animator animator = this.LLJJJJJIL;
                if (animator != null) {
                    animator.cancel();
                }
                if (z) {
                    H4(view, view2, imageView);
                    return;
                } else {
                    F4(view, imageView);
                    return;
                }
            }
            E5(view, this);
        }
    }

    public final void P4(Float f) {
        if (f == null) {
            return;
        }
        C5(1 - f.floatValue());
    }

    public static final void E5(View view, C1425660nCe c1425660nCe) {
        View view2;
        View view3;
        C786410Ut5.LJLLLLLL(8, view);
        C786410Ut5.T4(view, 0.0f);
        C1425670nCf c1425670nCf = c1425660nCe.LLJJIII;
        if (c1425670nCf != null && (view3 = c1425670nCf.LLJJJIL) != null) {
            view3.setClickable(true);
        }
        C1425670nCf c1425670nCf2 = c1425660nCe.LLJJIII;
        if (c1425670nCf2 != null && (view2 = c1425670nCf2.LLJJJJ) != null) {
            view2.setClickable(true);
        }
    }

    private final void F4(View view, View view2) {
        View view3;
        int width = view.getWidth();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(148.0f)));
        float alpha = view.getAlpha();
        C1425670nCf c1425670nCf = this.LLJJIII;
        if (c1425670nCf != null) {
            view3 = c1425670nCf.LLJJJIL;
        } else {
            view3 = null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(width, iLIZIZ);
        valueAnimatorOfInt.setDuration(400L);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS270S0100000_21(view, 10));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(alpha, 0.0f);
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS270S0100000_21(view, 7));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(300L);
        valueAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS270S0100000_21(view2, 9));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.setDuration(300L);
        valueAnimatorOfFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat3.addUpdateListener(new AUListenerS270S0100000_21(view3, 8));
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3);
        animatorSet.addListener(new ALAdapterS17S0200000_22(view, this, 0));
        animatorSet.start();
        this.LLJJJJJIL = animatorSet;
    }

    private final void H4(View view, View view2, View view3) {
        View view4;
        float alpha;
        C786410Ut5.LJLLLLLL(0, view);
        Object parent = view.getParent();
        View view5 = null;
        if ((parent instanceof View) && (view4 = (View) parent) != null) {
            int width = (view4.getWidth() - view2.getRight()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(148.0f)));
            C1425670nCf c1425670nCf = this.LLJJIII;
            if (c1425670nCf != null && (view5 = c1425670nCf.LLJJJIL) != null) {
                alpha = view5.getAlpha();
            } else {
                alpha = 1.0f;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iLIZIZ, width);
            valueAnimatorOfInt.setDuration(400L);
            valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfInt.addUpdateListener(new AUListenerS270S0100000_21(view, 14));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(400L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS270S0100000_21(view, 11));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat2.setDuration(300L);
            valueAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS270S0100000_21(view3, 13));
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(alpha, 0.0f);
            valueAnimatorOfFloat3.setDuration(300L);
            valueAnimatorOfFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat3.addUpdateListener(new AUListenerS270S0100000_21(view5, 12));
            animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3);
            animatorSet.addListener(new ALAdapterS18S0100000_22(this, 0));
            animatorSet.start();
            this.LLJJJJJIL = animatorSet;
        }
    }

    public C1425660nCe(C19A3 c19a3, C1DRG c1drg, ShortVideoContext shortVideoContext, SmartImageView smartImageView) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = shortVideoContext;
        this.LLJJI = smartImageView;
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1425510nCP.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1425690nCh.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1424260nAO.class, null);
        this.LLJJJJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(61));
    }
}
