package X;

import android.graphics.Point;

/* JADX INFO: renamed from: X.0Gil, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423290Gil {
    public static final /* synthetic */ int LIZ = 0;

    public static Point LIZ(int i, int i2, int i3, Point point) {
        int i4 = point.x;
        int i5 = point.y;
        int i6 = i2 * i2;
        int i7 = i * i;
        double d = i6 + i7;
        return new Point(C814420VxA.LIZ(((double) (((i6 * i4) - ((i * i2) * i5)) - (i * i3))) / d), C814420VxA.LIZ(((double) (((((-i) * i2) * i4) + (i7 * i5)) - (i2 * i3))) / d));
    }
}
