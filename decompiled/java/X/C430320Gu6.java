package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0Gu6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430320Gu6 extends C16F5 {
    public final C16F5 LLJJ;
    public final LinearGradient LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        TextPaint paint;
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null && (paint = c16f5.getPaint()) != null) {
            paint.setStrokeWidth((C497740JfY.LIZIZ(4.0f) / TypedValue.applyDimension(2, 28.0f, getContext().getResources().getDisplayMetrics())) * getTextSize());
        }
        C16F5 c16f52 = this.LLJJ;
        if (c16f52 != null) {
            C842150X1x.LIZIZ(canvas, c16f52);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        super.setEllipsize(truncateAt);
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setEllipsize(truncateAt);
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        super.setGravity(i);
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setGravity(i);
        }
    }

    public final void setIsGradient(boolean z) {
        this.LLJJIJI = z;
        requestLayout();
    }

    @Override // X.C20743216Fa, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            C786410Ut5.y6(c16f5, layoutParams);
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        super.setMaxLines(i);
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setMaxLines(i);
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setMaxWidth(i);
        }
    }

    public final void setStrokeColor(int i) {
        this.LLJJIII = i;
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setTextColor(i);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setTypeface(typeface);
        }
    }

    public C430320Gu6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJI = new LinearGradient(0.0f, 0.0f, 0.0f, (int) C497740JfY.LIZIZ(12.0f), ColorProtector.parseColor("#3DFFE5"), ColorProtector.parseColor("#4FBEFF"), Shader.TileMode.CLAMP);
        this.LLJJIJI = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveShowTimeStickerTextView);
            this.LLJJIII = typedArrayObtainStyledAttributes.getColor(R$styleable.LiveShowTimeStickerTextView_stroke_color, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        C16F5 c16f5 = new C16F5(context, attributeSet, 0);
        this.LLJJ = c16f5;
        c16f5.setGravity(getGravity());
        C16F5 c16f52 = this.LLJJ;
        if (c16f52 != null) {
            c16f52.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
            c16f52.getPaint().setStrokeJoin(Paint.Join.ROUND);
            c16f52.getPaint().setStrokeCap(Paint.Cap.ROUND);
            c16f52.setTextColor(this.LLJJIII);
            c16f52.setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier());
            c16f52.setMaxWidth(getMaxWidth());
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                C786410Ut5.y6(c16f52, layoutParams);
            }
            Typeface typeface = getTypeface();
            if (typeface != null) {
                c16f52.setTypeface(typeface);
            }
            c16f52.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
            c16f52.setGravity(getGravity());
            c16f52.getPaint().setTextSize(getTextSize());
            c16f52.setText(getText());
            c16f52.setMaxLines(getMaxLines());
            c16f52.setEllipsize(getEllipsize());
        }
        float f = 12;
        setShadowLayer(f, 0.0f, 0.0f, 0);
        c16f5.setShadowLayer(f, 0.0f, 0.0f, 0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.measure(i, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setLineSpacing(f, f2);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setText(charSequence, bufferType);
        }
    }

    @Override // X.C16F5, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setTextSize(i, f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setPadding(i, i2, i3, i4);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.layout(i, i2, i3, i4);
        }
        if (z && this.LLJJIJI) {
            getPaint().setShader(this.LLJJI);
        }
    }
}
