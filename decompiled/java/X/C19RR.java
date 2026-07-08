package X;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.19RR, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19RR extends Drawable {
    public static final double LIZ = Math.cos(Math.toRadians(45.0d));
    public static final /* synthetic */ int LIZIZ = 0;

    public static float LIZ(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) (f * 1.5f)) + ((1.0d - LIZ) * ((double) f2)));
        }
        return f * 1.5f;
    }
}
