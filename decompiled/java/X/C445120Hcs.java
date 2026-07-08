package X;

import android.content.res.Resources;

/* JADX INFO: renamed from: X.0Hcs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445120Hcs {
    public static final int LIZ(Number number) {
        return (int) ((number.floatValue() * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static final float LIZIZ(Number number) {
        return number.floatValue() * Resources.getSystem().getDisplayMetrics().density;
    }

    public static final float LIZJ(Number number) {
        return (number.floatValue() / Resources.getSystem().getDisplayMetrics().density) + 0.5f;
    }
}
