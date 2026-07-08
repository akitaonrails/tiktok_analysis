package X;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0GbY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418820GbY extends RelativeLayout {
    public TextView LL;
    public TextView LLILLJJLI;

    public static Float LIZ(TextView textView) {
        TextPaint paint;
        if (textView != null && (paint = textView.getPaint()) != null) {
            return Float.valueOf(paint.measureText(textView.getText().toString()) + textView.getPaddingLeft() + textView.getPaddingRight());
        }
        return null;
    }

    public C418820GbY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
