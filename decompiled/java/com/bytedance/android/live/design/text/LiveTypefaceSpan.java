package com.bytedance.android.live.design.text;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* JADX INFO: loaded from: classes21.dex */
public class LiveTypefaceSpan extends TypefaceSpan {
    public final boolean bold;
    public final Typeface typeface;

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        LIZ(textPaint, this.typeface);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        LIZ(textPaint, this.typeface);
    }

    public LiveTypefaceSpan(Typeface typeface, boolean z) {
        super("");
        this.typeface = typeface;
        this.bold = z;
    }

    public final void LIZ(Paint paint, Typeface typeface) {
        if (paint == null) {
            return;
        }
        int style = 0;
        if (typeface == null) {
            String family = getFamily();
            Typeface typeface2 = paint.getTypeface();
            if (typeface2 != null) {
                style = typeface2.getStyle();
            }
            Typeface typefaceCreate = Typeface.create(family, style);
            int i = style & (~typefaceCreate.getStyle());
            if ((i & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((i & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.setTypeface(typefaceCreate);
            return;
        }
        Typeface typeface3 = paint.getTypeface();
        if (typeface3 != null) {
            style = typeface3.getStyle();
        }
        int i2 = style & (~typeface.getStyle());
        if ((i2 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if (this.bold) {
            paint.setFakeBoldText(true);
        }
        if ((i2 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }
}
