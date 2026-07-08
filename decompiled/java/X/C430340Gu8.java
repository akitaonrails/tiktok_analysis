package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gu8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430340Gu8 extends C16F5 {
    public final C16F5 LLJJ;
    public float LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;

    public final boolean getStrokeEnable() {
        return this.LLJJIJI;
    }

    public final void LJJJJI(int i) {
        TextPaint paint;
        float f = this.LLJJI;
        this.LLJJIJI = true;
        this.LLJJIII = i;
        this.LLJJI = f;
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null && (paint = c16f5.getPaint()) != null) {
            paint.setStrokeWidth(this.LLJJI);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        C16F5 c16f52 = this.LLJJ;
        if (c16f52 != null) {
            c16f52.setTextColor(this.LLJJIII);
        }
        C16F5 c16f53 = this.LLJJ;
        if (c16f53 != null) {
            c16f53.setGravity(getGravity());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        C16F5 c16f5;
        if (this.LLJJIJI && (c16f5 = this.LLJJ) != null) {
            C842150X1x.LIZIZ(canvas, c16f5);
        }
        super.onDraw(canvas);
    }

    @Override // X.C20743216Fa, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            C786410Ut5.y6(c16f5, layoutParams);
        }
        super.setLayoutParams(layoutParams);
    }

    public final void setStrokeEnable(boolean z) {
        this.LLJJIJI = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, i);
        }
        super.setVisibility(i);
    }

    public C430340Gu8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJI = (int) C497740JfY.LIZIZ(1.7f);
        C16F5 c16f5 = new C16F5(context, attributeSet, 0);
        this.LLJJ = c16f5;
        TextPaint paint = c16f5.getPaint();
        if (paint != null) {
            paint.setStrokeWidth(this.LLJJI);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
        }
        c16f5.setTextColor(this.LLJJIII);
        c16f5.setGravity(getGravity());
        c16f5.setIncludeFontPadding(getIncludeFontPadding());
        if (C497740JfY.LJJ()) {
            c16f5.setTextDirection(4);
        }
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

    @Override // X.C16F5, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextSize(int i, float f) {
        C16F5 c16f5 = this.LLJJ;
        if (c16f5 != null) {
            c16f5.setTextSize(i, f);
        }
        super.setTextSize(i, f);
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
