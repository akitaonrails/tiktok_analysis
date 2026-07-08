package X;

import android.graphics.Paint;

/* JADX INFO: renamed from: X.0uDX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695290uDX {
    public static final Paint.Cap LIZ(int i) {
        if (i == 0) {
            return Paint.Cap.BUTT;
        }
        if (i == 1) {
            return Paint.Cap.ROUND;
        }
        if (i == 2) {
            return Paint.Cap.SQUARE;
        }
        return Paint.Cap.BUTT;
    }

    public static final Paint.Join LIZIZ(int i) {
        if (i == 0) {
            return Paint.Join.MITER;
        }
        if (i == 1) {
            return Paint.Join.ROUND;
        }
        if (i == 2) {
            return Paint.Join.BEVEL;
        }
        return Paint.Join.MITER;
    }
}
