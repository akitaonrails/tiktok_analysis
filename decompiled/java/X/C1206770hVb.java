package X;

import android.view.View;

/* JADX INFO: renamed from: X.0hVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206770hVb {
    public static final void LIZ(View view) {
        C12ES.LJIILL(8, view);
    }

    public static final void LIZIZ(int i, View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static final void LIZJ(int i, View view) {
        if (C1388580mEq.LIZIZ(view.getContext())) {
            view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
        }
    }

    public static final void LIZLLL(int i, View view) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }
}
