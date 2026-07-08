package X;

import android.animation.ObjectAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.1CjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238341CjA implements InterfaceC2254971DNv<C1DLM>, C1DLM {
    public final InterfaceC2238351CjB LIZ;
    public FrameLayout LIZIZ;
    public float LIZJ = -1.0f;

    @Override // X.InterfaceC2254971DNv
    public final void onDestroy() {
    }

    @Override // X.InterfaceC2254971DNv
    public final void init() {
        FrameLayout frameLayout = new FrameLayout(this.LIZ.LIZ().getCkCameraViewLikeFunction().getView().getContext());
        frameLayout.setBackgroundColor(-1);
        C786410Ut5.LJZ(0, frameLayout);
        C786410Ut5.U4(frameLayout, 0.0f);
        this.LIZIZ = frameLayout;
        C1DLB ckCameraViewLikeFunction = this.LIZ.LIZ().getCkCameraViewLikeFunction();
        FrameLayout frameLayout2 = this.LIZIZ;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        ckCameraViewLikeFunction.addView(frameLayout2);
        FrameLayout frameLayout3 = this.LIZIZ;
        (frameLayout3 != null ? frameLayout3 : null).bringToFront();
    }

    public C2238341CjA(InterfaceC2238351CjB interfaceC2238351CjB) {
        this.LIZ = interfaceC2238351CjB;
    }

    @Override // X.C1DLM
    public final void X8(boolean z) {
        if (this.LIZJ != -1.0f) {
            Window window = this.LIZ.getActivity().getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = this.LIZJ;
            window.setAttributes(attributes);
        }
        FrameLayout frameLayout = null;
        if (z) {
            FrameLayout frameLayout2 = this.LIZIZ;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            if (frameLayout2.getAlpha() == 0.5f) {
                FrameLayout frameLayout3 = this.LIZIZ;
                if (frameLayout3 != null) {
                    frameLayout = frameLayout3;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout, "alpha", 0.5f, 0.0f);
                objectAnimatorOfFloat.setDuration(25L);
                C786410Ut5.Pd(objectAnimatorOfFloat);
                return;
            }
        }
        FrameLayout frameLayout4 = this.LIZIZ;
        if (frameLayout4 != null) {
            frameLayout = frameLayout4;
        }
        C786410Ut5.U4(frameLayout, 0.0f);
    }

    @Override // X.C1DLM
    public final void zo(boolean z) {
        Window window = this.LIZ.getActivity().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        this.LIZJ = attributes.screenBrightness;
        attributes.screenBrightness = 1.0f;
        window.setAttributes(attributes);
        FrameLayout frameLayout = null;
        if (z) {
            FrameLayout frameLayout2 = this.LIZIZ;
            if (frameLayout2 != null) {
                frameLayout = frameLayout2;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout, "alpha", 0.0f, 0.5f);
            objectAnimatorOfFloat.setDuration(25L);
            C786410Ut5.Pd(objectAnimatorOfFloat);
            return;
        }
        FrameLayout frameLayout3 = this.LIZIZ;
        if (frameLayout3 != null) {
            frameLayout = frameLayout3;
        }
        C786410Ut5.U4(frameLayout, 0.5f);
    }
}
