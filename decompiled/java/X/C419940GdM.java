package X;

import android.view.View;

/* JADX INFO: renamed from: X.0GdM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419940GdM {
    public static final void LIZ(View view, float f) {
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        float fAbs = 1 - (Math.abs(f) * 0.4f);
        C786410Ut5.Ob(view, fAbs);
        C786410Ut5.pc(view, fAbs);
    }
}
