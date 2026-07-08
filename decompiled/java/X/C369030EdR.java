package X;

import android.view.View;

/* JADX INFO: renamed from: X.0EdR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C369030EdR {
    public static final int LIZ(View view) {
        if (C423170GiZ.LIZ(view.getContext())) {
            return view.getPaddingLeft();
        }
        return view.getPaddingRight();
    }

    public static final int LIZIZ(View view) {
        if (C423170GiZ.LIZ(view.getContext())) {
            return view.getPaddingRight();
        }
        return view.getPaddingLeft();
    }

    public static final void LIZJ(View view, int i, int i2, int i3, int i4) {
        if (C423170GiZ.LIZ(view.getContext())) {
            view.setPadding(i3, i2, i, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }
}
