package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tPW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664280tPW extends AbstractC1664270tPV {
    public final ImageView LIZLLL;
    public final View LJ;
    public ObjectAnimator LJFF;

    @Override // X.InterfaceC1664320tPa
    public final void LIZIZ(boolean z) {
    }

    @Override // X.InterfaceC1664320tPa
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1664320tPa
    public final void LIZ() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.LJFF;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LJFF) != null) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.LIZLLL;
        if (imageView != null) {
            C786410Ut5.Cb(imageView, 0.0f);
        }
    }

    @Override // X.InterfaceC1664320tPa
    public final void LJ() {
        ImageView imageView = this.LIZLLL;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        LIZ();
    }

    public C1664280tPW(View view) {
        super(view);
        this.LIZLLL = null;
        this.LJ = view;
    }

    @Override // X.InterfaceC1664320tPa
    public final void LIZJ(AwS604S0100000_25 awS604S0100000_25) {
        ImageView imageView = this.LIZLLL;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
        ImageView imageView2 = this.LIZLLL;
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.aa0);
        }
        ImageView imageView3 = this.LIZLLL;
        if (imageView3 == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView3, "rotation", 0.0f, 360.0f);
        this.LJFF = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setDuration(800L);
        }
        ObjectAnimator objectAnimator = this.LJFF;
        if (objectAnimator != null) {
            objectAnimator.setRepeatMode(1);
        }
        ObjectAnimator objectAnimator2 = this.LJFF;
        if (objectAnimator2 != null) {
            objectAnimator2.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator3 = this.LJFF;
        if (objectAnimator3 != null) {
            C786410Ut5.Pd(objectAnimator3);
        }
    }
}
