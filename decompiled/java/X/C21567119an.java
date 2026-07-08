package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19an, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21567119an extends C21567019am {
    @Override // X.C21567019am
    public final void LJI() {
        super.LJI();
        if (getLeftContentGravity() == 1) {
            Bitmap leftBitmap = getLeftBitmap();
            setLeftBitmapW(leftBitmap != null ? leftBitmap.getWidth() : (int) getTextLeftPaint().measureText(getLeftCircleText()));
            setLeftP(getPaddingLeft());
            getLeftRect().left = getLeftP();
            getLeftRect().right = getLeftRect().left + getLeftBitmapW();
            getLeftRect().top = (int) ((getTotalHeight() - (getLeftBitmap() != null ? r0.getHeight() : 0)) / 2);
            Rect leftRect = getLeftRect();
            int i = getLeftRect().top;
            Bitmap leftBitmap2 = getLeftBitmap();
            leftRect.bottom = i + (leftBitmap2 != null ? leftBitmap2.getHeight() : 0);
        } else {
            Bitmap leftBitmap3 = getLeftBitmap();
            setLeftBitmapW(leftBitmap3 != null ? leftBitmap3.getWidth() : (int) getTextLeftPaint().measureText(getLeftCircleText()));
            float f = 2;
            setLeftP((int) ((getLeftWidth() - ((getLeftBitmapW() + getTextDis()) + getTextLeftPaint().measureText(getMLeftText()))) / f));
            getLeftRect().left = getLeftP();
            getLeftRect().right = getLeftRect().left + getLeftBitmapW();
            getLeftRect().top = (int) ((getTotalHeight() - (getLeftBitmap() != null ? r0.getHeight() : 0)) / f);
            Rect leftRect2 = getLeftRect();
            int i2 = getLeftRect().top;
            Bitmap leftBitmap4 = getLeftBitmap();
            leftRect2.bottom = i2 + (leftBitmap4 != null ? leftBitmap4.getHeight() : 0);
        }
        if (getRightContentGravity() == 2) {
            Bitmap rightBitmap = getRightBitmap();
            setRightBitmapW(rightBitmap != null ? rightBitmap.getWidth() : (int) getTextRightPaint().measureText(getRightCircleText()));
            setRightP((int) (getTotalWidth() - (((getRightBitmapW() + getTextDis()) + getTextRightPaint().measureText(getMRightText())) + getPaddingRight())));
            getRightRect().left = getRightP();
            getRightRect().right = getRightRect().left + getRightBitmapW();
            getRightRect().top = (int) ((getTotalHeight() - (getRightBitmap() != null ? r0.getHeight() : 0)) / 2);
            Rect rightRect = getRightRect();
            int i3 = getRightRect().top;
            Bitmap rightBitmap2 = getRightBitmap();
            rightRect.bottom = i3 + (rightBitmap2 != null ? rightBitmap2.getHeight() : 0);
            return;
        }
        Bitmap rightBitmap3 = getRightBitmap();
        setRightBitmapW(rightBitmap3 != null ? rightBitmap3.getWidth() : (int) getTextRightPaint().measureText(getRightCircleText()));
        float f2 = 2;
        setRightP((int) (getLeftWidth() + getWidthCaps() + getCaps() + (((((getTotalWidth() - getLeftWidth()) - getWidthCaps()) - getCaps()) - ((getRightBitmapW() + getTextDis()) + getTextRightPaint().measureText(getMRightText()))) / f2)));
        getRightRect().left = getRightP();
        getRightRect().right = getRightRect().left + getRightBitmapW();
        getRightRect().top = (int) ((getTotalHeight() - (getRightBitmap() != null ? r0.getHeight() : 0)) / f2);
        Rect rightRect2 = getRightRect();
        int i4 = getRightRect().top;
        Bitmap rightBitmap4 = getRightBitmap();
        rightRect2.bottom = i4 + (rightBitmap4 != null ? rightBitmap4.getHeight() : 0);
    }

    @Override // X.C21567019am
    public float getNewLeftWidth() {
        float totalWidth = (((getTotalWidth() - getCaps()) - getWidthCaps()) * getLeftPercent()) / (getLeftPercent() + getRightPercent());
        float totalWidth2 = (((getTotalWidth() - getCaps()) - getWidthCaps()) * getRightPercent()) / (getLeftPercent() + getRightPercent());
        if (getLeftPercent() > getRightPercent()) {
            Bitmap rightBitmap = getRightBitmap();
            setRightBitmapW(rightBitmap != null ? rightBitmap.getWidth() : (int) getTextRightPaint().measureText(getRightCircleText()));
            return (getTotalWidth() - Math.max(Math.max(totalWidth2, 0.0f), (((getRightBitmapW() + getTextDis()) + getTextRightPaint().measureText(getMRightText())) + getWidthCaps()) + getPaddingRight())) - getCaps();
        }
        if (getLeftPercent() >= getRightPercent()) {
            return totalWidth;
        }
        Bitmap leftBitmap = getLeftBitmap();
        setLeftBitmapW(leftBitmap != null ? leftBitmap.getWidth() : (int) getTextLeftPaint().measureText(getLeftCircleText()));
        return Math.max(Math.max(totalWidth, 0.0f), getLeftBitmapW() + getTextDis() + getTextLeftPaint().measureText(getMLeftText()) + getPaddingLeft());
    }

    @Override // X.C21567019am, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getTextLeftPaint().setTextSkewX(0.0f);
        getTextLeftPaint().setTypeface(C1119920fFW.LIZJ(getTextLeftPaint().getTextSize(), 400, getContext()));
        Bitmap leftBitmap = getLeftBitmap();
        if (leftBitmap != null) {
            canvas.drawBitmap(leftBitmap, (Rect) null, getLeftRect(), getTextLeftPaint());
        }
        Paint.FontMetrics fontMetrics = getTextLeftPaint().getFontMetrics();
        float fAbs = fontMetrics.descent + Math.abs(fontMetrics.ascent);
        getTextLeftPaint().setTypeface(C1119920fFW.LIZJ(getTextLeftPaint().getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, getContext()));
        float f = 2;
        float f2 = 4;
        float f3 = fAbs / f2;
        canvas.drawText(getLeftCircleText(), getLeftP() + ((getLeftBitmapW() - getTextLeftPaint().measureText(getLeftCircleText())) / f), (getHeight() / 2) + f3, getTextLeftPaint());
        getTextLeftPaint().setTextSkewX(-0.15f);
        canvas.drawText(getMLeftText(), getLeftP() + getLeftBitmapW() + getTextDis(), (getHeight() / 2) + f3, getTextLeftPaint());
        getTextRightPaint().setTextSkewX(0.0f);
        getTextRightPaint().setTypeface(C1119920fFW.LIZJ(getTextRightPaint().getTextSize(), 400, getContext()));
        Bitmap rightBitmap = getRightBitmap();
        if (rightBitmap != null) {
            canvas.drawBitmap(rightBitmap, (Rect) null, getRightRect(), getTextRightPaint());
        }
        Paint.FontMetrics fontMetrics2 = getTextRightPaint().getFontMetrics();
        float fAbs2 = fontMetrics2.descent + Math.abs(fontMetrics2.ascent);
        getTextRightPaint().setTypeface(C1119920fFW.LIZJ(getTextRightPaint().getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, getContext()));
        float f4 = fAbs2 / f2;
        canvas.drawText(getRightCircleText(), getRightP() + ((getRightBitmapW() - getTextRightPaint().measureText(getRightCircleText())) / f), (getHeight() / 2) + f4, getTextRightPaint());
        getTextRightPaint().setTextSkewX(-0.15f);
        canvas.drawText(getMRightText(), getRightP() + getRightBitmapW() + getTextDis(), (getHeight() / 2) + f4, getTextRightPaint());
    }

    public C21567119an(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LIZLLL(context, attributeSet);
    }

    @Override // X.C21567019am
    public final void LIZLLL(Context context, AttributeSet attributeSet) {
        float dimension;
        int resourceId;
        super.LIZLLL(context, attributeSet);
        TypedArray typedArray = getTypedArray();
        float dimension2 = 0.0f;
        if (typedArray != null) {
            dimension = typedArray.getDimension(R$styleable.LivePollView_circleBitmapWidth, C497740JfY.LIZIZ(18.0f));
        } else {
            dimension = 0.0f;
        }
        TypedArray typedArray2 = getTypedArray();
        if (typedArray2 != null) {
            dimension2 = typedArray2.getDimension(R$styleable.LivePollView_circleBitmapHeight, C497740JfY.LIZIZ(18.0f));
        }
        TypedArray typedArray3 = getTypedArray();
        int resourceId2 = 0;
        if (typedArray3 != null) {
            resourceId = typedArray3.getResourceId(R$styleable.LivePollView_circleLeftBitmap, R.drawable.f8j);
        } else {
            resourceId = 0;
        }
        setLeftBitmap(C21567019am.LIZ(BitmapFactory.decodeResource(getResources(), resourceId), dimension, dimension2));
        TypedArray typedArray4 = getTypedArray();
        if (typedArray4 != null) {
            resourceId2 = typedArray4.getResourceId(R$styleable.LivePollView_circleRightBitmap, R.drawable.f8j);
        }
        setRightBitmap(C21567019am.LIZ(BitmapFactory.decodeResource(getResources(), resourceId2), dimension, dimension2));
        setBitmapWidth(dimension);
        setBitmapHeight(dimension2);
        TypedArray typedArray5 = getTypedArray();
        if (typedArray5 != null) {
            typedArray5.recycle();
        }
    }
}
