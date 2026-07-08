package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ehk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371700Ehk extends FrameLayout {
    public float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public final Paint LLILZIL;
    public final C1295960jpS LLILZLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLILZLL.isAnimating()) {
            this.LLILZLL.cancelAnimation();
            C786410Ut5.LLD(8, this.LLILZLL);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLILZLL.getVisibility() == 0) {
            return;
        }
        canvas.drawCircle(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
    }

    public final void setLoadingAnim(String str) {
        this.LLILZLL.setAnimation(str);
    }

    public final void setStrokeColor(int i) {
        this.LLILZIL.setColor(getResources().getColor(i));
    }

    public final void setStrokeWidth(float f) {
        this.LLILZIL.setStrokeWidth(f);
        this.LL = f;
    }

    public C371700Ehk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.UnReadCircleView);
        this.LL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.UnReadCircleView_strokeWidth, (int) C12ES.LIZJ(2.0f, context));
        typedArrayObtainStyledAttributes.recycle();
        setBackgroundColor(C446980Hfs.LIZ(getContext(), R.color.dr));
        Paint paint = new Paint();
        paint.setColor(C960203pA.LIZ(R.attr.ny, context));
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.LL);
        this.LLILZIL = paint;
        C1295960jpS c1295960jpS = new C1295960jpS(context);
        this.LLILZLL = c1295960jpS;
        c1295960jpS.setAnimation("social_story_upload_loading_tux_lottie.json");
        c1295960jpS.setLayerType(2, null);
        c1295960jpS.setRepeatCount(-1);
        C786410Ut5.LLD(8, c1295960jpS);
        addView(c1295960jpS, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLJJLI = getMeasuredWidth() / 2.0f;
        this.LLILLL = getMeasuredHeight() / 2.0f;
        this.LLILZ = (getMeasuredHeight() / 2) - (this.LL / 2);
    }
}
