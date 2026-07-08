package X;

import Y.ALAdapterS12S0200000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.0fGF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120370fGF {
    public ImageView LIZ;
    public final AnimatorSet LIZIZ;

    public C1120370fGF(C1120350fGD c1120350fGD, Bitmap bitmap, PointF pointF) {
        ImageView imageViewLIZIZ = c1120350fGD.LLILZLL.LIZIZ();
        this.LIZ = imageViewLIZIZ;
        if (imageViewLIZIZ == null) {
            ImageView imageView = new ImageView(c1120350fGD.getContext());
            this.LIZ = imageView;
            int i = C1120350fGD.LLJILJIL;
            c1120350fGD.addView(imageView, new ViewGroup.LayoutParams(i, i));
            imageView.layout(0, 0, i, i);
        }
        ImageView imageView2 = this.LIZ;
        if (imageView2 != null) {
            imageView2.setImageBitmap(bitmap);
            C786410Ut5.V4(imageView2, 1.0f);
        }
        ImageView imageView3 = this.LIZ;
        if (imageView3 != null) {
            float f = pointF.x;
            float f2 = C1120350fGD.LLJILJIL / 2;
            C786410Ut5.Lc(imageView3, f - f2);
            C786410Ut5.gd(imageView3, pointF.y - f2);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ImageView imageView4 = this.LIZ;
        if (imageView4 != null) {
            C786410Ut5.LJZI(0, imageView4);
            if (c1120350fGD.LLIZ) {
                imageView4.setLayerType(2, null);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.7f, 1.1f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(this, 30));
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(c1120350fGD.LLILZ, c1120350fGD.LLILZIL);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.setStartDelay(200L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS266S0100000_17(this, 31));
            valueAnimatorOfInt.addListener(new ALAdapterS12S0200000_17(this, c1120350fGD, 9));
            animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfInt);
        }
        this.LIZIZ = animatorSet;
    }
}
