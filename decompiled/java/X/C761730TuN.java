package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TuN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761730TuN extends FrameLayout {
    public ImageView LL;
    public C20515815Po LLILLJJLI;
    public TuxTextView LLILLL;
    public ValueAnimator LLILZ;
    public boolean LLILZIL;

    public final void LIZJ() {
        this.LLILZIL = false;
        LIZIZ();
        getPercentage().setText("");
        getCircleProgressView().setProgress(0);
    }

    public final void LIZLLL() {
        this.LLILZIL = true;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_clockwise_clock;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e5);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(34));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        getImageView().setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(getContext())));
        getPercentage().setText("");
        getCircleProgressView().setProgress(0);
    }

    public final void LIZ() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_spinner_thin;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e5);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(34));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJFF = Integer.valueOf(R.attr.zj);
        getImageView().setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(getContext())));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getImageView(), "rotation", 0.0f, 360.0f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        C786410Ut5.Pd(objectAnimatorOfFloat);
        this.LLILZ = objectAnimatorOfFloat;
    }

    public final void LIZIZ() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_down_to_line;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e5);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(34));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJFF = Integer.valueOf(R.attr.zj);
        getImageView().setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(getContext())));
        ValueAnimator valueAnimator = this.LLILZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C786410Ut5.Cb(getImageView(), 0.0f);
    }

    public final C20515815Po getCircleProgressView() {
        C20515815Po c20515815Po = this.LLILLJJLI;
        if (c20515815Po != null) {
            return c20515815Po;
        }
        return null;
    }

    public final ImageView getImageView() {
        ImageView imageView = this.LL;
        if (imageView != null) {
            return imageView;
        }
        return null;
    }

    public final TuxTextView getPercentage() {
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLILZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final boolean getShowingScheduledImage() {
        return this.LLILZIL;
    }

    public final void setCircleProgressView(C20515815Po c20515815Po) {
        this.LLILLJJLI = c20515815Po;
    }

    public final void setImageView(ImageView imageView) {
        this.LL = imageView;
    }

    public final void setPause(int i) {
        this.LLILZIL = false;
        getCircleProgressView().setProgress(i);
        getPercentage().setText("");
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_arrow_down_to_line;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e5);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(34));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        getImageView().setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(getContext())));
    }

    public final void setPercentage(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setProgress(int i) {
        this.LLILZIL = false;
        getCircleProgressView().setProgress(i);
        TuxTextView percentage = getPercentage();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('%');
        percentage.setText(C2188811AlT.LIZIZ(sbLIZ));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e5);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(34));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        getImageView().setImageDrawable(c384050F3z.LIZ(getContext()));
    }

    public final void setShowingScheduledImage(boolean z) {
        this.LLILZIL = z;
    }

    public C761730TuN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dbw, this, true);
        setImageView((ImageView) findViewById(R.id.g45));
        LIZIZ();
        setCircleProgressView((C20515815Po) findViewById(R.id.nl1));
        setPercentage((TuxTextView) findViewById(R.id.q8h));
        getCircleProgressView().setProgress(0);
        getCircleProgressView().setMaxProgress(100);
        getCircleProgressView().setBgCircleColor(-1);
        getCircleProgressView().setProgressColor(-1);
        getCircleProgressView().setCircleWidth((int) C497740JfY.LIZIZ(4.0f));
        getCircleProgressView().setBgCircleWidth((int) C497740JfY.LIZIZ(4.0f));
    }
}
