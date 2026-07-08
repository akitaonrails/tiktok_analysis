package X;

import Y.ALAdapterS0S0100000_2;
import Y.ALAdapterS3S0200000_6;
import Y.ARunnableS75S0200000_6;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HML, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HML {
    public final View LIZ;
    public final Window LIZIZ;
    public final C0HM2 LIZJ;
    public FrameLayout LIZLLL;
    public float LJ = -1.0f;
    public final WindowManager.LayoutParams LJFF;

    public final Object LIZ(InterfaceC1364105Vn interfaceC1364105Vn) {
        Float fLIZLLL;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        WindowManager.LayoutParams layoutParams = this.LJFF;
        float f = layoutParams.screenBrightness;
        float f2 = this.LJ;
        if (f != f2) {
            layoutParams.screenBrightness = f2;
            this.LIZIZ.setAttributes(layoutParams);
        }
        FrameLayout frameLayout = this.LIZLLL;
        if (frameLayout != null) {
            fLIZLLL = C2286608xc.LIZLLL(frameLayout.getAlpha());
        } else {
            fLIZLLL = null;
        }
        this.LIZJ.getClass();
        if (Intrinsics.LIZLLL(fLIZLLL, 1.0f)) {
            FrameLayout frameLayout2 = this.LIZLLL;
            this.LIZJ.getClass();
            this.LIZJ.getClass();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout2, "alpha", 1.0f, 0.0f);
            this.LIZJ.getClass();
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat.addListener(new ALAdapterS3S0200000_6(c23260099m, this, 17));
            C786410Ut5.Pd(objectAnimatorOfFloat);
        } else {
            FrameLayout frameLayout3 = this.LIZLLL;
            if (frameLayout3 != null) {
                C786410Ut5.U4(frameLayout3, 0.0f);
            }
            FrameLayout frameLayout4 = this.LIZLLL;
            if (frameLayout4 != null) {
                HandlerHook.viewPost(this.LIZ, new ARunnableS75S0200000_6(this, frameLayout4, 74));
            }
            C189200o6.m2constructorimpl(true);
            c23260099m.resumeWith(true);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final Object LIZIZ(InterfaceC1364105Vn interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        this.LJ = this.LJFF.screenBrightness;
        int iLIZ = C778450UgF.LIZ(this.LIZ.getContext());
        WindowManager.LayoutParams layoutParams = this.LJFF;
        float f = iLIZ;
        float f2 = this.LIZJ.LIZ;
        if (f <= f2) {
            f = f2;
        }
        layoutParams.screenBrightness = f;
        this.LIZIZ.setAttributes(layoutParams);
        FrameLayout frameLayout = this.LIZLLL;
        this.LIZJ.getClass();
        this.LIZJ.getClass();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout, "alpha", 0.0f, 1.0f);
        this.LIZJ.getClass();
        objectAnimatorOfFloat.setDuration(100L);
        objectAnimatorOfFloat.addListener(new ALAdapterS0S0100000_2(c23260099m, 3));
        C786410Ut5.Pd(objectAnimatorOfFloat);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public C0HML(View view, Window window, C0HM2 c0hm2) {
        this.LIZ = view;
        this.LIZIZ = window;
        this.LIZJ = c0hm2;
        this.LJFF = window.getAttributes();
    }
}
