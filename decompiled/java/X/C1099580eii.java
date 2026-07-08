package X;

import Y.ALAdapterS13S0100000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0eii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099580eii extends View {
    public final float LL;
    public final C2268791DrB LLILLJJLI;
    public final C2268791DrB LLILLL;
    public final float LLILZ;
    public final float LLILZIL;
    public final float LLILZLL;
    public Bitmap LLIZ;
    public Canvas LLIZLLLIL;
    public Bitmap LLJ;
    public Bitmap LLJI;
    public final Paint LLJIJIL;
    public final Paint LLJILJIL;
    public final Paint LLJILJILJ;
    public final Path LLJILLL;
    public final RectF LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;

    public final ValueAnimator[] getEntryAnimation() {
        if (this.LLJ == null) {
            return new ValueAnimator[0];
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.LL);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.setStartDelay(200L);
        valueAnimatorOfFloat.setInterpolator(this.LLILLJJLI);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(this, 41));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, this.LL);
        valueAnimatorOfFloat2.setDuration(560L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS266S0100000_17(this, 40));
        valueAnimatorOfFloat2.addListener(new ALAdapterS13S0100000_17(this, 21));
        Pair pair = C497740JfY.LJJ() ? new Pair(Float.valueOf(0.0f), Float.valueOf((-getLayoutParams().width) - C497740JfY.LIZIZ(this.LLILZLL))) : new Pair(Float.valueOf(-C497740JfY.LIZIZ(this.LLILZLL)), Float.valueOf(getLayoutParams().width));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
        valueAnimatorOfFloat3.setDuration(1200L);
        valueAnimatorOfFloat3.setStartDelay(200L);
        valueAnimatorOfFloat3.setInterpolator(this.LLILLJJLI);
        valueAnimatorOfFloat3.addUpdateListener(new AUListenerS266S0100000_17(this, 42));
        return new ValueAnimator[]{valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3};
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Canvas canvas3;
        super.onDraw(canvas);
        if (this.LLJ == null) {
            return;
        }
        this.LLJILLL.reset();
        this.LLJJ.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.LLJILLL;
        RectF rectF = this.LLJJ;
        float f = this.LLILZ;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(this.LLJILLL);
        this.LLJILJIL.setAlpha((int) this.LLJJI);
        this.LLJILJILJ.setAlpha((int) this.LLJJIII);
        Canvas canvas4 = this.LLIZLLLIL;
        if (canvas4 != null) {
            float width = getWidth();
            float height = getHeight();
            float f2 = this.LLILZ;
            canvas4.drawRoundRect(0.0f, 0.0f, width, height, f2, f2, this.LLJILJIL);
        }
        Bitmap bitmap = this.LLJ;
        if (bitmap != null && (canvas3 = this.LLIZLLLIL) != null) {
            canvas3.drawBitmap(bitmap, 0.0f, 0.0f, this.LLJILJILJ);
        }
        Bitmap bitmap2 = this.LLJI;
        if (bitmap2 != null && (canvas2 = this.LLIZLLLIL) != null) {
            canvas2.drawBitmap(bitmap2, this.LLJJIJI, 0.0f, this.LLJIJIL);
        }
        Bitmap bitmap3 = this.LLIZ;
        if (bitmap3 != null) {
            canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
        }
    }

    public final void setAnimatedView(View view) {
        view.measure(0, View.MeasureSpec.makeMeasureSpec((int) this.LLILZIL, 1073741824));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = view.getMeasuredWidth();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        C842150X1x.LIZIZ(canvas, view);
        this.LLJ = bitmapCreateBitmap;
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getMeasuredWidth(), (int) this.LLILZIL, Bitmap.Config.ARGB_8888);
        this.LLIZLLLIL = new Canvas(bitmapCreateBitmap2);
        this.LLIZ = bitmapCreateBitmap2;
        int measuredWidth = view.getMeasuredWidth();
        int i = (int) this.LLILZIL;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setShader(new LinearGradient(0.0f, 0.0f, C497740JfY.LIZIZ(this.LLILZLL), 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        shapeDrawable.setIntrinsicWidth((int) C497740JfY.LIZIZ(this.LLILZLL));
        shapeDrawable.setIntrinsicHeight(i);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
        shapeDrawable2.getPaint().setColor(-16777216);
        shapeDrawable2.setIntrinsicWidth(measuredWidth);
        shapeDrawable2.setIntrinsicHeight(i);
        LayerDrawable layerDrawable = new LayerDrawable(new ShapeDrawable[]{shapeDrawable, shapeDrawable2});
        layerDrawable.setLayerInset(0, 0, 0, measuredWidth, 0);
        layerDrawable.setLayerInset(1, (int) C497740JfY.LIZIZ(this.LLILZLL), 0, 0, 0);
        int intrinsicWidth = layerDrawable.getIntrinsicWidth();
        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(intrinsicWidth, layerDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap3);
        if (C497740JfY.LJJ()) {
            canvas2.translate(intrinsicWidth, 0.0f);
            canvas2.scale(-1.0f, 1.0f);
        }
        layerDrawable.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
        layerDrawable.draw(canvas2);
        this.LLJI = bitmapCreateBitmap3;
    }

    public final void setColor(int i) {
        GradientDrawable gradientDrawable;
        this.LLJILJIL.setColor(i);
        Drawable background = getBackground();
        if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
            gradientDrawable.setStroke((int) C497740JfY.LIZIZ(1.0f), i);
        }
        setBackground(background);
    }

    public C1099580eii(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = 255.0f;
        this.LLILLJJLI = new C2268791DrB(0.28f, 0.0f, 0.43f, 1.0f);
        this.LLILLL = new C2268791DrB(0.57f, 0.0f, 0.7f, 1.0f);
        this.LLILZ = C497740JfY.LJIIIZ(R.dimen.b1w);
        this.LLILZIL = C497740JfY.LJIIIZ(R.dimen.b1t);
        this.LLILZLL = 42.0f;
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.LLJIJIL = paint;
        this.LLJILJIL = new Paint(1);
        this.LLJILJILJ = new Paint(1);
        this.LLJILLL = new Path();
        this.LLJJ = new RectF();
        this.LLJJI = 0.0f;
        this.LLJJIII = 0.0f;
    }
}
