package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0Glk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425140Glk extends ViewOnAttachStateChangeListenerC20604515jv {
    public boolean LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public final Paint LLIZ;
    public Shader LLIZLLLIL;

    public final boolean getAsymmetricFadingEdgeEnabled() {
        return this.LLILZ;
    }

    public final float getBottomFade() {
        return this.LLILZLL;
    }

    public final float getTopFade() {
        return this.LLILZIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!this.LLILZ) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.dispatchDraw(canvas);
        this.LLIZ.setShader(this.LLIZLLLIL);
        this.LLIZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.LLIZ);
        this.LLIZ.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public final void setAsymmetricFadingEdgeEnabled(boolean z) {
        this.LLILZ = z;
        invalidate();
    }

    public final void setBottomFade(float f) {
        this.LLILZLL = f;
        LJJI(getWidth(), getHeight());
        invalidate();
    }

    public final void setTopFade(float f) {
        this.LLILZIL = f;
        LJJI(getWidth(), getHeight());
        invalidate();
    }

    public C425140Glk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJJI(int i, int i2) {
        if (i > 0 && i2 > 0) {
            float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(this.LLILZIL));
            float fLIZIZ2 = C418440Gaw.LIZIZ(Float.valueOf(this.LLILZLL));
            float f = i2;
            float fLIZLLL = C13LZ.LIZLLL(fLIZIZ / f, 0.0f, 1.0f);
            float fLIZLLL2 = 1.0f - C13LZ.LIZLLL(fLIZIZ2 / f, 0.0f, 1.0f);
            if (fLIZLLL2 < fLIZLLL) {
                fLIZLLL2 = fLIZLLL;
            }
            this.LLIZLLLIL = new LinearGradient(0.0f, 0.0f, 0.0f, f, new int[]{16777215, -1, -1, 16777215}, new float[]{0.0f, fLIZLLL, fLIZLLL2, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    public C425140Glk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZIL = 25.0f;
        this.LLILZLL = 50.0f;
        this.LLIZ = new Paint(1);
        setLayerType(2, null);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        LJJI(i, i2);
    }
}
