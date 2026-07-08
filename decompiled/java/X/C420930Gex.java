package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0Gex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420930Gex {
    public static final String LIZ(int i, int i2, CharSequence charSequence) {
        if (i >= 0 && i2 <= charSequence.length() && i <= i2) {
            return charSequence.subSequence(i, i2).toString();
        }
        return "";
    }

    public static final void LIZIZ(TuxTextView tuxTextView, TuxIconDrawable tuxIconDrawable, Context context) {
        Drawable[] compoundDrawables = tuxTextView.getCompoundDrawables();
        Drawable drawable = compoundDrawables[0];
        Drawable drawable2 = compoundDrawables[1];
        Drawable drawable3 = compoundDrawables[2];
        Drawable drawable4 = compoundDrawables[3];
        if (C426750GoL.LIZLLL(context)) {
            tuxTextView.setCompoundDrawables(tuxIconDrawable, drawable2, drawable3, drawable4);
        } else {
            tuxTextView.setCompoundDrawables(drawable, drawable2, tuxIconDrawable, drawable4);
        }
    }
}
