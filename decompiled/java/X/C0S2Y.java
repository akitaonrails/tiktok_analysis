package X;

import Y.ALAdapterS3S0110000_11;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0S2Y, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0S2Y extends FrameLayout {
    public ImageView LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final Vibrator LLJ;
    public int LLJI;

    public View getContentView() {
        return this;
    }

    public final void LIZIZ() {
        if (this.LLIZ) {
            this.LLIZ = false;
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 0.0f, 10.0f, 30.0f);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setDuration(300L);
            this.LL.startAnimation(rotateAnimation);
            LIZ(this.LLILLL, false, false);
        }
    }

    public final void LIZLLL() {
        if (this.LLIZ) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, this.LLILLL);
        this.LLIZ = true;
        LIZ(this.LLILLL, true, false);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -20.0f, 10.0f, 30.0f);
        rotateAnimation.setDuration(300L);
        rotateAnimation.setFillAfter(true);
        this.LL.startAnimation(rotateAnimation);
    }

    public Rect getDeleteRect() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    public final void LJ() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        layoutParams.topMargin = ScreenUtils.getStatusBarHeight(getContext());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public C0S2Y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewSd = C786410Ut5.Sd(R.layout.djm, C786410Ut5.ne(context), null);
        this.LL = (ImageView) viewSd.findViewById(R.id.yar);
        this.LLILLJJLI = viewSd.findViewById(R.id.flc);
        this.LLILZ = viewSd.findViewById(R.id.q32);
        this.LLILLL = viewSd.findViewById(R.id.bym);
        addView(viewSd);
        C786410Ut5.LJLLLLLL(8, this.LLILLL);
        C786410Ut5.LJLLLLLL(8, this.LLILZ);
        this.LLJ = (Vibrator) C786410Ut5.H2(context, "vibrator");
    }

    public static void LIZ(View view, boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = new float[2];
        float f6 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleX", fArr2);
        float[] fArr3 = new float[2];
        if (z) {
            f5 = 0.0f;
        } else {
            f5 = 1.0f;
        }
        fArr3[0] = f5;
        if (z) {
            f6 = 1.0f;
        }
        fArr3[1] = f6;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "scaleY", fArr3);
        animatorSet.setDuration(300L);
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        animatorSet.addListener(new ALAdapterS3S0110000_11(view, z2, 0));
        animatorSet.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZJ(int r10, int r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0S2Y.LIZJ(int, int, boolean, boolean):int");
    }
}
