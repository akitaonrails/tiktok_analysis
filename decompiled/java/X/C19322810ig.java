package X;

import Y.ALAdapterS11S0200000_16;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS134S0110000_16;
import kotlin.jvm.internal.AwS177S1100000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.10ig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19322810ig extends FrameLayout {
    public boolean LL;
    public String LLILLJJLI;
    public final long LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public CharSequence LLILZLL;
    public boolean LLIZ;
    public AnimatorSet LLIZLLLIL;
    public AnimatorSet LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;

    private final Interpolator getAnimInterpolator() {
        return C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f);
    }

    private final TuxIconView getArrowView() {
        return (TuxIconView) this.LLJILLL.getValue();
    }

    private final View getContainerView() {
        return (View) this.LLJJI.getValue();
    }

    private final TextView getContentView() {
        return (TextView) this.LLJI.getValue();
    }

    private final TuxTextView getFirstRowContentView() {
        return (TuxTextView) this.LLJILJIL.getValue();
    }

    private final TuxTextView getSecondRowContentView() {
        return (TuxTextView) this.LLJILJILJ.getValue();
    }

    private final ViewGroup getTwoRowContentView() {
        return (ViewGroup) this.LLJIJIL.getValue();
    }

    public final void LIZ() {
        AnimatorSet animatorSet = this.LLJ;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        AnimatorSet animatorSet2 = this.LLJ;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
    }

    public final ViewGroup getShapeContentContainer() {
        return (ViewGroup) this.LLJJ.getValue();
    }

    public final void LIZLLL() {
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        AnimatorSet animatorSet = new AnimatorSet();
        float f = (-getShapeContentContainer().getMeasuredWidth()) + (this.LLILZ * 2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getShapeContentContainer(), "alpha", 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(this.LLILLL);
        objectAnimatorOfFloat.setInterpolator(getAnimInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getShapeContentContainer(), "translationX", f, 0.0f);
        objectAnimatorOfFloat2.setDuration(this.LLILLL);
        objectAnimatorOfFloat2.setInterpolator(getAnimInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
        this.LLIZLLLIL = animatorSet;
    }

    public final float getTransitionX() {
        return (-getShapeContentContainer().getMeasuredWidth()) + this.LLILZ + C418440Gaw.LIZIZ(12);
    }

    public final void LIZIZ(boolean z) {
        float[] fArr;
        if (this.LL) {
            C786410Ut5.LLIL(getContentView(), 8);
            C786410Ut5.LJLZ(0, getTwoRowContentView());
            getFirstRowContentView().setText(this.LLILZLL);
            getSecondRowContentView().setText(this.LLILLJJLI);
        } else {
            C786410Ut5.LLIL(getContentView(), 0);
            C786410Ut5.LJLZ(8, getTwoRowContentView());
            getContentView().setText(this.LLILZLL);
        }
        getShapeContentContainer().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = getShapeContentContainer().getMeasuredWidth();
        float f = this.LLILZ * 2;
        int i = (int) f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(false);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(measuredWidth, i, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.LLILZIL);
        if (z) {
            fArr = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
        } else {
            fArr = new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
        }
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setBounds(0, 0, measuredWidth, i);
        gradientDrawable.draw(canvas2);
        canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        if (z) {
            float f2 = f / 2.0f;
            canvas.drawCircle(measuredWidth, f2, f2, paint);
        } else {
            float f3 = f / 2.0f;
            canvas.drawCircle(0.0f, f3, f3, paint);
        }
        getShapeContentContainer().setBackground(new BitmapDrawable(bitmapCreateBitmap));
    }

    public final void LIZJ(boolean z) {
        if (this.LLIZ) {
            if (z) {
                return;
            }
        } else {
            if (z) {
                C786410Ut5.Lb(-1.0f, getShapeContentContainer());
                this.LLIZ = true;
            }
            C01U6.LIZIZ(new AwS134S0110000_16(z, this, 9));
            LIZIZ(z);
        }
        C786410Ut5.Lb(1.0f, getShapeContentContainer());
        this.LLIZ = false;
        C01U6.LIZIZ(new AwS134S0110000_16(z, this, 9));
        LIZIZ(z);
    }

    public final void LJ(Function0<Unit> function0) {
        AnimatorSet animatorSet = this.LLIZLLLIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getShapeContentContainer(), "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(this.LLILLL);
        objectAnimatorOfFloat.setInterpolator(getAnimInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getShapeContentContainer(), "translationX", 0.0f, -getShapeContentContainer().getMeasuredWidth());
        objectAnimatorOfFloat2.setDuration(this.LLILLL);
        objectAnimatorOfFloat2.setInterpolator(getAnimInterpolator());
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet2.start();
        animatorSet2.addListener(new ALAdapterS11S0200000_16(this, function0, 1));
        this.LLJ = animatorSet2;
    }

    public final void setArrowVisible(boolean z) {
        if (z) {
            if (this.LL) {
                C786410Ut5.LLLLLLZZ(getArrowView(), 0);
            } else {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_chevron_right_slim_ltr;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LJ = Integer.valueOf(R.attr.j8);
                getContentView().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, c419910GdJ.LIZ(getContext()), (Drawable) null);
            }
            getContentView().setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            return;
        }
        if (this.LL) {
            C786410Ut5.LLLLLLZZ(getArrowView(), 8);
        } else {
            getContentView().setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        getContentView().setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
    }

    public final void setBubbleText(CharSequence charSequence) {
        this.LLILZLL = charSequence;
        LIZIZ(this.LLIZ);
    }

    public final void setMaxWidth(int i) {
        if (i == -1) {
            getContentView().setMaxWidth(Integer.MAX_VALUE);
        } else {
            getContentView().setMaxWidth(i);
        }
    }

    public final void setSecondRowContent(String str) {
        C01U6.LIZIZ(new AwS177S1100000_28(this, str, 1));
    }

    public final void setShapeBgColor(int i) {
        this.LLILZIL = i;
        setBubbleText(this.LLILZLL);
    }

    public final void setShapeRadius(float f) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        this.LLILZ = f;
        ViewGroup.LayoutParams layoutParams = getContainerView().getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart((int) this.LLILZ);
        }
        setBubbleText(this.LLILZLL);
    }

    public C19322810ig(Context context, AttributeSet attributeSet) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(context, attributeSet, 0);
        this.LLILLJJLI = "";
        this.LLILLL = 350L;
        this.LLILZIL = -1;
        this.LLILZLL = "";
        this.LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1080));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1084));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1081));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1082));
        this.LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1078));
        this.LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1083));
        this.LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1079));
        FrameLayout.inflate(context, R.layout.fwx, this);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.ShapeBubbleView, 0, 0);
        try {
            this.LLILZ = typedArrayObtainStyledAttributes.getDimension(R$styleable.ShapeBubbleView_sbv_radius, 0.0f);
            this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.ShapeBubbleView_sbv_background_color, -7829368);
            typedArrayObtainStyledAttributes.recycle();
            ViewGroup.LayoutParams layoutParams = getContainerView().getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart((int) this.LLILZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
