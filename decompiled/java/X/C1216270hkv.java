package X;

import android.view.View;

/* JADX INFO: renamed from: X.0hkv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216270hkv {
    public static final float LIZ(float f) {
        C844470XAv.LIZ.getClass();
        return (C844470XAv.LIZ().getResources().getDisplayMetrics().density * f) + 0.5f;
    }

    public static final int LIZIZ(int i) {
        return (int) LIZ(i);
    }

    public static final String LIZJ(int i) {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ().getString(i);
    }

    public static final boolean LIZLLL(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }
}
