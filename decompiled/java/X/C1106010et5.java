package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0et5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106010et5 extends C20743416Fc {
    public final int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public final int LLJLIL;
    public final int LLJLILLLLZIIL;
    public final int LLJLL;
    public final RectF LLJLLIL;
    public final LinearGradient LLJLLL;
    public long LLJZ;
    public float LLJZIJLIL;

    @Override // com.bytedance.android.live.design.widget.SimpleLiveTextView, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        getPaint().setStyle(Paint.Style.FILL);
        getPaint().setColor(this.LLJLIL);
        canvas.drawArc(this.LLJLLIL, 270.0f, 360.0f - this.LLJZIJLIL, true, getPaint());
        getPaint();
        getPaint().setShader(this.LLJLLL);
        RectF rectF = this.LLJLLIL;
        float f = this.LLJZIJLIL;
        canvas.drawArc(rectF, (360.0f - f) + 270.0f, f, true, getPaint());
        getPaint().setStyle(Paint.Style.STROKE);
        getPaint().setColor(this.LLJJLIIIJLLLLLLLZ);
        getPaint().setShader(null);
        getPaint().setStrokeWidth(this.LLJLL);
        canvas.drawArc(this.LLJLLIL, 0.0f, 360.0f, true, getPaint());
        super.onDraw(canvas);
    }

    public final void setRemainTime(long j) {
        float f = this.LLJZIJLIL;
        long j2 = this.LLJZ;
        if (j2 > 0 && j >= 0) {
            this.LLJZIJLIL = (j * 360.0f) / j2;
        }
        if (f != this.LLJZIJLIL) {
            invalidate();
        }
    }

    public final void setSolidColor(int i) {
        this.LLJL = i;
        invalidate();
    }

    public final void setTotalTime(long j) {
        this.LLJZ = j;
        invalidate();
    }

    public C1106010et5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJLIIIJLLLLLLLZ = -16777216;
        this.LLJL = -1;
        this.LLJLIL = -1;
        this.LLJLLL = new LinearGradient(0.0f, 0.0f, 0.0f, (int) C497740JfY.LIZIZ(12.0f), ColorProtector.parseColor("#3DFFE5"), ColorProtector.parseColor("#4FBEFF"), Shader.TileMode.CLAMP);
        this.LLJZIJLIL = 360.0f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveShowTimeStickerCircleView);
            this.LLJJLIIIJLLLLLLLZ = typedArrayObtainStyledAttributes.getColor(R$styleable.LiveShowTimeStickerCircleView_circle_stroke_color, -16777216);
            this.LLJL = typedArrayObtainStyledAttributes.getColor(R$styleable.LiveShowTimeStickerCircleView_circle_solid_color, this.LLJL);
            this.LLJLIL = typedArrayObtainStyledAttributes.getColor(R$styleable.LiveShowTimeStickerCircleView_circle_solid_bg_color, -1);
            this.LLJLILLLLZIIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LiveShowTimeStickerCircleView_circle_radius, this.LLJLILLLLZIIL);
            this.LLJLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LiveShowTimeStickerCircleView_circle_stroke_width, this.LLJLL);
            typedArrayObtainStyledAttributes.recycle();
        }
        float f = this.LLJLL;
        float f2 = (this.LLJLILLLLZIIL * 2) + r2 + 0.0f;
        this.LLJLLIL = new RectF(f, f, f2, f2);
    }
}
