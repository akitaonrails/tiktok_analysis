package X;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0Hj4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC448960Hj4 {
    public static int LIZ(Canvas canvas, CharSequence charSequence) {
        Layout layout;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            C448970Hj5[] c448970Hj5Arr = (C448970Hj5[]) spanned.getSpans(0, spanned.length(), C448970Hj5.class);
            if (c448970Hj5Arr != null && c448970Hj5Arr.length > 0 && (layout = c448970Hj5Arr[0].LIZ.get()) != null) {
                return layout.getWidth();
            }
            TextView textViewLIZ = C448980Hj6.LIZ(spanned);
            if (textViewLIZ != null) {
                return (textViewLIZ.getWidth() - textViewLIZ.getPaddingLeft()) - textViewLIZ.getPaddingRight();
            }
        }
        return canvas.getWidth();
    }
}
