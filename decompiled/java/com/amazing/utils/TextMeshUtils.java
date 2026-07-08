package com.amazing.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes30.dex */
public class TextMeshUtils {
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] getAndroidSystemFontPaths() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazing.utils.TextMeshUtils.getAndroidSystemFontPaths():java.lang.String[]");
    }

    public static float getDeviceDpi() {
        return Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    public static Bitmap callIStaticGenerateBitmapForEmoji(byte[] bArr, int i) {
        String str = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(i);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        Rect rect = new Rect();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawText(str, -rect.left, -rect.top, textPaint);
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public static Bitmap generateImage(String str, float f, byte[] bArr, int i, boolean z, float f2, int i2, boolean z2, float f3, float f4, int i3, float f5) {
        float f6 = f5;
        float f7 = f4;
        float f8 = f3;
        String str2 = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(i);
        Rect rect = new Rect();
        textPaint.getTextWidths(str2, new float[str2.length()]);
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        if (!z) {
            f2 = 0.0f;
        }
        if (!z2) {
            f8 = 0.0f;
            f7 = 0.0f;
            f6 = 0.0f;
        }
        float fMax = Math.max(Math.abs(f8), Math.abs(f7)) + f2;
        TextPaint textPaint2 = new TextPaint();
        if (z || z2) {
            textPaint2.setTextSize(f);
            textPaint2.setAntiAlias(true);
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setTextAlign(Paint.Align.LEFT);
            textPaint2.setStrokeWidth(f2 * 2.0f * f);
            textPaint2.setColor(i2);
            if (z2) {
                textPaint2.setShadowLayer(f6 * f, f8 * f, f7 * f, i3);
            }
        }
        float f9 = 2.0f * fMax * f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (rect.width() + f9), (int) (rect.height() + f9), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (z || z2) {
            float f10 = fMax * f;
            canvas.drawText(str2, (-rect.left) + f10, (-rect.top) + f10, textPaint2);
        }
        float f11 = fMax * f;
        canvas.drawText(str2, (-rect.left) + f11, (-rect.top) + f11, textPaint);
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public static float[] generateImageSize(String str, float f, byte[] bArr, int i, boolean z, float f2, int i2, boolean z2, float f3, float f4, int i3, float f5) {
        String str2 = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(i);
        Rect rect = new Rect();
        float[] fArr = new float[str2.length()];
        textPaint.getTextWidths(str2, fArr);
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        if (!z) {
            f2 = 0.0f;
        }
        if (!z2) {
            f3 = 0.0f;
            f4 = 0.0f;
        }
        return new float[]{rect.left, rect.right, -rect.bottom, -rect.top, fArr[0], (f2 + Math.max(Math.abs(f3), Math.abs(f4))) * f, textPaint.ascent(), textPaint.descent()};
    }

    public static Bitmap callIStaticGenerateBitmapFromTextMesh(byte[] bArr, String str, int i, int i2, int i3, float f, int i4, float f2, int i5, float f3, float f4, float f5, int i6, int i7, int i8, int i9) {
        String str2 = new String(bArr);
        Rect rect = new Rect(0, 0, i8, i9);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(i2);
        float f6 = i;
        textPaint.setTextSize(f6);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        if (i7 == 0) {
            textPaint.setTextAlign(Paint.Align.LEFT);
        } else if (i7 == 1) {
            textPaint.setTextAlign(Paint.Align.CENTER);
        } else {
            textPaint.setTextAlign(Paint.Align.RIGHT);
        }
        if ((i4 & 16) == 16) {
            textPaint.setUnderlineText(true);
        }
        if ((i4 & 32) == 32) {
            textPaint.setStrikeThruText(true);
        }
        if ((i4 & 4) == 4) {
            textPaint.setTextSkewX((-f) / 90.0f);
        }
        if ((i4 & 8) == 8) {
            textPaint.setFakeBoldText(true);
        }
        if ((i4 & 2) == 2) {
            textPaint.setShadowLayer(f3, f4, f5, i6);
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f7 = fontMetrics.top;
        float f8 = fontMetrics.bottom;
        String[] strArrSplit = str2.split("\n");
        int length = strArrSplit.length;
        if ((i4 & 1) == 1) {
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setColor(i5);
            textPaint2.setTextSize(textPaint.getTextSize());
            textPaint2.setAntiAlias(textPaint.isAntiAlias());
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setStrokeWidth((5.0f * f2) / f6);
            textPaint2.setTextAlign(textPaint.getTextAlign());
            textPaint2.setTextSkewX(textPaint.getTextSkewX());
            textPaint.setFakeBoldText(false);
            textPaint2.setFakeBoldText(true);
            float f9 = i3 / f6;
            float f10 = (-fontMetrics.ascent) + fontMetrics.descent;
            float f11 = f10 * 0.1f;
            for (int i10 = 0; i10 < length; i10++) {
                int iCenterY = (int) (((double) ((int) ((rect.centerY() - (f7 / 2.0f)) - (f8 / 2.0f)))) - (((((double) (length - 1)) * 0.5d) - ((double) i10)) * ((double) (f11 + f10))));
                textPaint2.setLetterSpacing(f9);
                if (i7 == 0) {
                    canvas.drawText(strArrSplit[i10], rect.left, iCenterY, textPaint2);
                } else if (i7 == 1) {
                    canvas.drawText(strArrSplit[i10], rect.centerX(), iCenterY, textPaint2);
                } else {
                    canvas.drawText(strArrSplit[i10], rect.right, iCenterY, textPaint2);
                }
            }
        }
        float f12 = i3 / f6;
        float f13 = (-fontMetrics.ascent) + fontMetrics.descent;
        float f14 = 0.1f * f13;
        for (int i11 = 0; i11 < length; i11++) {
            int iCenterY2 = (int) (((double) ((int) ((rect.centerY() - (f7 / 2.0f)) - (f8 / 2.0f)))) - (((((double) (length - 1)) * 0.5d) - ((double) i11)) * ((double) (f14 + f13))));
            textPaint.setLetterSpacing(f12);
            if (i7 == 0) {
                canvas.drawText(strArrSplit[i11], rect.left, iCenterY2, textPaint);
            } else if (i7 == 1) {
                canvas.drawText(strArrSplit[i11], rect.centerX(), iCenterY2, textPaint);
            } else {
                canvas.drawText(strArrSplit[i11], rect.right, iCenterY2, textPaint);
            }
        }
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }
}
