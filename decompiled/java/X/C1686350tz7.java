package X;

/* JADX INFO: renamed from: X.0tz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686350tz7 {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZ(float f, float f2, float f3, float f4, float f5) {
        boolean z;
        float f6;
        if (f3 == f4) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            f6 = (f5 - f3) / (f4 - f3);
        } else {
            f6 = 0.0f;
        }
        return f + ((f2 - f) * Math.max(0.0f, Math.min(1.0f, f6)));
    }
}
