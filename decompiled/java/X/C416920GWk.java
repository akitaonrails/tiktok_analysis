package X;

import android.content.res.Resources;
import android.util.TypedValue;

/* JADX INFO: renamed from: X.0GWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416920GWk {
    public static final float LIZ(float f) {
        return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    public static final int LIZIZ(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }
}
