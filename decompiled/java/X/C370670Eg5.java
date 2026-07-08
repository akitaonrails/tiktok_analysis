package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Eg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370670Eg5 extends LinearLayout {
    public TuxIconView LL;

    public final void LIZ() {
        Animation animation;
        TuxIconView tuxIconView = this.LL;
        if (tuxIconView != null && (animation = tuxIconView.getAnimation()) != null) {
            animation.cancel();
        }
        TuxIconView tuxIconView2 = this.LL;
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_image_alt_1;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            tuxIconView2.setTuxIcon(c419910GdJ);
        }
    }

    public final void LIZIZ() {
        TuxIconView tuxIconView = this.LL;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_spinner_thin;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        TuxIconView tuxIconView2 = this.LL;
        if (tuxIconView2 != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView2, "rotation", 0.0f, 360.0f);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setDuration(800L);
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
    }

    public C370670Eg5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.x0, this, true);
        findViewById(R.id.wvk);
        this.LL = (TuxIconView) findViewById(R.id.qcl);
    }
}
