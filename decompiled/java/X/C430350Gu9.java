package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gu9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430350Gu9 extends C16F5 {
    public final C16F5 LLJJ;
    public final float LLJJI;
    public final int LLJJIII;
    public boolean LLJJIJI;

    public final boolean getStrokeEnable() {
        return this.LLJJIJI;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        C16F5 c16f5;
        if (this.LLJJIJI && (c16f5 = this.LLJJ) != null) {
            C842150X1x.LIZIZ(canvas, c16f5);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        super.setGravity(i);
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setGravity(i);
        }
    }

    @Override // X.C20743216Fa, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            C786410Ut5.y6(c16f5, layoutParams);
        }
        super.setLayoutParams(layoutParams);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setMaxWidth(i);
        }
    }

    public final void setStrokeEnable(boolean z) {
        this.LLJJIJI = z;
    }

    public final void setText2(CharSequence charSequence) {
        setText(charSequence);
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setText(charSequence);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, i);
        }
        super.setVisibility(i);
    }

    public C430350Gu9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJI = (int) C497740JfY.LIZIZ(1.0f);
        this.LLJJIII = C20736316Cj.LIZIZ(R.attr.ett, getContext());
        C16F5 c16f5 = new C16F5(context, attributeSet, 0);
        this.LLJJ = c16f5;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_interact_stroke_view);
            this.LLJJI = typedArrayObtainStyledAttributes.getDimension(R$styleable.ttlive_interact_stroke_view_ttlive_stroke_width, (int) C497740JfY.LIZIZ(1.0f));
            this.LLJJIII = typedArrayObtainStyledAttributes.getColor(R$styleable.ttlive_interact_stroke_view_ttlive_stroke_color, C20736316Cj.LIZIZ(R.attr.ett, context));
            typedArrayObtainStyledAttributes.recycle();
        }
        TextPaint paint = c16f5.getPaint();
        if (paint != null) {
            paint.setStrokeWidth(this.LLJJI);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
        }
        c16f5.setTextColor(this.LLJJIII);
        c16f5.setGravity(getGravity());
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            if (!Intrinsics.LJFF(c16f5.getText(), getText())) {
                c16f5.setText(getText());
                postInvalidate();
            }
            c16f5.measure(i, i2);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setLineSpacing(f, f2);
        }
    }

    @Override // X.C16F5, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextSize(int i, float f) {
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setTextSize(i, f);
        }
        super.setTextSize(i, f);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setTypeface(typeface, i);
        }
        super.setTypeface(typeface, i);
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
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.layout(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
