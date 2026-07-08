package X;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0GfR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421230GfR extends C21411418qm {
    public final void LIZ(Drawable[] drawableArr) {
        Drawable drawable;
        if (drawableArr != null && (drawable = drawableArr[0]) != null) {
            Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
            Rect rect = new Rect();
            getPaint().getTextBounds(getText().toString(), 0, length(), rect);
            int height = (((getHeight() - drawable.getIntrinsicHeight()) / 2) - (rect.top - fontMetricsInt.top)) - (getPaddingTop() / 2);
            drawable.setBounds(0, -height, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() - height);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (!TextUtils.isEmpty(getText())) {
            LIZ(getCompoundDrawables());
            LIZ(getCompoundDrawablesRelative());
        }
        super.onDraw(canvas);
    }

    public C421230GfR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        setTypeface(C1697580uHE.LIZIZ(0.0f, 400, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224));
    }
}
