package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0F9Y, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F9Y extends View {
    public int LL;
    public int LLILLJJLI;
    public Rect LLILLL;
    public Rect LLILZ;
    public Pair<Integer, Integer> LLILZIL;
    public Pair<Integer, Integer> LLILZLL;
    public final Paint LLIZ;
    public final PorterDuffXfermode LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final float LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;

    public static /* synthetic */ void getCurrentRatioMode$annotations() {
    }

    static {
        Color.argb(128, 0, 0, 0);
    }

    private final int getHalfStrokeWidth() {
        return ((Number) this.LLJI.getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.graphics.Rect getTransparentRect() {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F9Y.getTransparentRect():android.graphics.Rect");
    }

    public final int getCropAreaWidth() {
        if (this.LLJILJIL <= 0) {
            this.LLJILJIL = getMeasuredWidth() - ((int) C12ES.LIZJ(32.0f, getContext()));
        }
        return this.LLJILJIL;
    }

    public final float getStrokeWidth() {
        return ((Number) this.LLJ.getValue()).floatValue();
    }

    public final Rect getAnimRect() {
        return this.LLILZ;
    }

    public final int getBgColor() {
        return this.LL;
    }

    public final Rect getCropAreaRect() {
        return this.LLILLL;
    }

    public final int getCurrentRatioMode() {
        return this.LLILLJJLI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(this.LL);
        Rect transparentRect = getTransparentRect();
        this.LLIZ.setXfermode(this.LLIZLLLIL);
        this.LLIZ.setStyle(Paint.Style.FILL);
        canvas.drawRect(transparentRect, this.LLIZ);
        this.LLIZ.setXfermode(null);
        this.LLIZ.setColor(-1);
        this.LLIZ.setStyle(Paint.Style.STROKE);
        this.LLIZ.setStrokeWidth(getStrokeWidth());
        canvas.drawRect(new Rect(transparentRect.left + getHalfStrokeWidth(), transparentRect.top + getHalfStrokeWidth(), transparentRect.right - getHalfStrokeWidth(), transparentRect.bottom - getHalfStrokeWidth()), this.LLIZ);
        this.LLIZ.setStrokeWidth(this.LLJIJIL);
        Paint paint = this.LLIZ;
        if (this.LLJILJILJ) {
            float f = 3;
            float fWidth = transparentRect.width() / f;
            float f2 = transparentRect.left + fWidth;
            canvas.drawLine(f2, transparentRect.top, f2, transparentRect.bottom, paint);
            float f3 = f2 + fWidth;
            canvas.drawLine(f3, transparentRect.top, f3, transparentRect.bottom, paint);
            float fHeight = transparentRect.height() / f;
            float f4 = transparentRect.top + fHeight;
            canvas.drawLine(transparentRect.left, f4, transparentRect.right, f4, paint);
            float f5 = f4 + fHeight;
            canvas.drawLine(transparentRect.left, f5, transparentRect.right, f5, paint);
        }
    }

    public final void setAnimRect(Rect rect) {
        this.LLILZ = rect;
    }

    public final void setBgColor(int i) {
        this.LL = i;
    }

    public final void setCanShowAuxiliaryLines(boolean z) {
        if (z != this.LLJILJILJ) {
            this.LLJILJILJ = z;
            invalidate();
        }
    }

    public final void setCropAreaRect(Rect rect) {
        this.LLILLL = rect;
    }

    public final void setCurrentRatioMode(int i) {
        this.LLILLJJLI = i;
    }

    public C0F9Y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = Color.argb(128, 0, 0, 0);
        this.LLILLL = new Rect();
        this.LLILZ = new Rect();
        this.LLILZIL = new Pair<>(0, 0);
        this.LLIZ = new Paint();
        this.LLIZLLLIL = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.LLJ = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1263));
        this.LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1262));
        this.LLJIJIL = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
        setLayerType(1, null);
    }
}
