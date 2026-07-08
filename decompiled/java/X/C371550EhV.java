package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0EhV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C371550EhV extends FrameLayout {
    public Paint LL;
    public Paint LLILLJJLI;
    public Paint LLILLL;
    public Paint LLILZ;
    public int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public final int[] LLJJI;
    public final float[] LLJJIII;

    public static Paint LIZ() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        return paint;
    }

    public final void LIZIZ() {
        this.LLILLL.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LLJI, this.LLJJI, this.LLJJIII, Shader.TileMode.CLAMP));
        this.LLILZ.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LLJIJIL, this.LLJJI, this.LLJJIII, Shader.TileMode.CLAMP));
        this.LL.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LLJILJIL, this.LLJJI, this.LLJJIII, Shader.TileMode.CLAMP));
        this.LLILLJJLI.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LLJILJILJ, this.LLJJI, this.LLJJIII, Shader.TileMode.CLAMP));
    }

    public void setDrawSize(float f) {
        LIZJ(f, f, f, f);
    }

    public C371550EhV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZLL = 1;
        this.LLIZ = 2;
        this.LLIZLLLIL = 4;
        this.LLJ = 8;
        this.LLJI = -1.0f;
        this.LLJIJIL = -1.0f;
        this.LLJILJIL = -1.0f;
        this.LLJILJILJ = -1.0f;
        this.LLJJI = new int[]{-1, 0};
        this.LLJJIII = new float[]{0.0f, 1.0f};
        this.LLILLL = LIZ();
        this.LLILZ = LIZ();
        this.LL = LIZ();
        this.LLILLJJLI = LIZ();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.StyleEdgeTransparentView);
        this.LLILZIL = typedArrayObtainStyledAttributes.getInt(R$styleable.StyleEdgeTransparentView_style_edge_position, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.StyleEdgeTransparentView_style_edge_width, C11VU.LIZIZ(20.0f, getContext()));
        this.LLJILJILJ = dimension;
        this.LLJILJIL = dimension;
        this.LLJIJIL = dimension;
        this.LLJI = dimension;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        boolean zDrawChild = super.drawChild(canvas, view, j);
        float f = this.LLJI;
        if (f > 0.0f && ((i4 = this.LLILZIL) == 0 || (i4 & this.LLILZLL) != 0)) {
            canvas.drawRect(0.0f, -3.0f, this.LLJILLL, f, this.LLILLL);
        }
        if (this.LLJIJIL > 0.0f && ((i3 = this.LLILZIL) == 0 || (i3 & this.LLIZ) != 0)) {
            int iSave = canvas.save();
            canvas.rotate(180.0f, this.LLJILLL / 2, this.LLJJ / 2);
            canvas.drawRect(0.0f, -3.0f, this.LLJILLL, this.LLJIJIL, this.LLILZ);
            canvas.restoreToCount(iSave);
        }
        int i5 = (this.LLJJ - this.LLJILLL) / 2;
        if (this.LLJILJILJ > 0.0f && ((i2 = this.LLILZIL) == 0 || (i2 & this.LLIZLLLIL) != 0)) {
            int iSave2 = canvas.save();
            canvas.rotate(90.0f, this.LLJILLL / 2, this.LLJJ / 2);
            canvas.translate(0.0f, i5);
            canvas.drawRect(-i5, -3.0f, this.LLJILLL + i5, this.LLJILJILJ, this.LLILLJJLI);
            canvas.restoreToCount(iSave2);
        }
        if (this.LLJILJIL > 0.0f && ((i = this.LLILZIL) == 0 || (i & this.LLJ) != 0)) {
            int iSave3 = canvas.save();
            canvas.rotate(270.0f, this.LLJILLL / 2, this.LLJJ / 2);
            canvas.translate(0.0f, i5);
            canvas.drawRect(-i5, -3.0f, this.LLJILLL + i5, this.LLJILJIL, this.LL);
            canvas.restoreToCount(iSave3);
        }
        canvas.restoreToCount(iSaveLayer);
        return zDrawChild;
    }

    public final void LIZJ(float f, float f2, float f3, float f4) {
        this.LLJILJIL = f;
        this.LLJI = f2;
        this.LLJILJILJ = f3;
        this.LLJIJIL = f4;
        LIZIZ();
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LIZIZ();
        this.LLJILLL = getWidth();
        this.LLJJ = getHeight();
    }
}
