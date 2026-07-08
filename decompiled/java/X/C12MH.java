package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;

/* JADX INFO: renamed from: X.12MH, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12MH {
    public static Bitmap LIZ(MaskSrc maskSrc) {
        if (TextUtils.isEmpty(maskSrc.getText())) {
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setStyle(Paint.Style.FILL);
        if (maskSrc.isBold()) {
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
        if (maskSrc.getTextSize() <= 0) {
            maskSrc.setTextSize(36);
        }
        textPaint.setTextSize(maskSrc.getTextSize() * 0.6f);
        if (TextUtils.isEmpty(maskSrc.getTextColor())) {
            maskSrc.setTextColor("#FF000000");
        }
        textPaint.setColor(ColorProtector.parseColor(maskSrc.getTextColor()));
        Rect rect = new Rect();
        textPaint.getTextBounds(maskSrc.getText(), 0, maskSrc.getText().length(), rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        rect.set(0, 0, iWidth, iHeight);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        bitmapCreateBitmap.eraseColor(0);
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        int iCenterY = rect.centerY();
        int i = fontMetricsInt.bottom;
        canvas.drawText(maskSrc.getText(), rect.centerX(), (iCenterY + ((i - fontMetricsInt.top) / 2)) - i, textPaint);
        return bitmapCreateBitmap;
    }
}
