package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.19ao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21567219ao extends C21567019am {
    @Override // X.C21567019am
    public float getNewLeftWidth() {
        float totalWidth = (((getTotalWidth() - getCaps()) - getWidthCaps()) * getLeftPercent()) / (getLeftPercent() + getRightPercent());
        float totalWidth2 = (((getTotalWidth() - getCaps()) - getWidthCaps()) * getRightPercent()) / (getLeftPercent() + getRightPercent());
        if (getLeftPercent() > getRightPercent()) {
            setRightBitmapW((int) C497740JfY.LIZIZ(46.0f));
            return (getTotalWidth() - Math.max(Math.max(totalWidth2, 0.0f), (((getRightBitmapW() + getTextDis()) + getTextRightPaint().measureText(getMRightText())) + getWidthCaps()) + getPaddingRight())) - getCaps();
        }
        if (getLeftPercent() >= getRightPercent()) {
            return totalWidth;
        }
        setLeftBitmapW((int) C497740JfY.LIZIZ(46.0f));
        return Math.max(Math.max(totalWidth, 0.0f), getLeftBitmapW() + getTextDis() + getTextLeftPaint().measureText(getMLeftText()) + getPaddingLeft());
    }

    @Override // X.C21567019am
    public final void LJI() {
        super.LJI();
    }

    @Override // X.C21567019am, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public C21567219ao(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LIZLLL(context, attributeSet);
    }

    @Override // X.C21567019am
    public final void LIZLLL(Context context, AttributeSet attributeSet) {
        super.LIZLLL(context, attributeSet);
        if (C497740JfY.LJJ()) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setScaleX(-1.0f);
        }
        TypedArray typedArray = getTypedArray();
        if (typedArray != null) {
            typedArray.recycle();
        }
    }
}
