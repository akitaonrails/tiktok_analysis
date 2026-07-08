package X;

/* JADX INFO: renamed from: X.0Q5G, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q5G {
    public static final /* synthetic */ int LIZ = 0;

    public static final C0Q5E LIZ(int i, int i2, int i3, int i4) {
        float f;
        if (i > 0 && i2 > 0 && i3 > 0 && i4 > 0) {
            float f2 = 1.0f;
            float f3 = (i4 * 1.0f) / i3;
            float f4 = i2;
            float f5 = i;
            float f6 = (f4 * 1.0f) / f5;
            if (f6 > f3) {
                float f7 = f6 / f3;
                f = 1.0f;
                f2 = f7;
            } else {
                f = f3 / f6;
            }
            return new C0Q5E(i, i2, i3, i4, f2, f, f5 / 2.0f, f4 / 2.0f);
        }
        return new C0Q5E(i, i2, i3, i4, 1.0f, 1.0f, 0.0f, 0.0f);
    }
}
