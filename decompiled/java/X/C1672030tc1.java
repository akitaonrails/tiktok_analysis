package X;

/* JADX INFO: renamed from: X.0tc1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672030tc1 {
    public static final C1677710tlB LIZ;

    static {
        new C1677710tlB(0.25f, 0.1f, 0.25f, 1.0f);
        new C1677710tlB(0.0f, 0.0f, 0.58f, 1.0f);
        new C1677710tlB(0.42f, 0.0f, 1.0f, 1.0f);
        LIZ = new C1677710tlB(0.42f, 0.0f, 0.58f, 1.0f);
        new C1677710tlB(0.12f, 0.0f, 0.39f, 0.0f);
        new C1677710tlB(0.61f, 1.0f, 0.88f, 1.0f);
        new C1677710tlB(0.37f, 0.0f, 0.63f, 1.0f);
        new C1677710tlB(0.32f, 0.0f, 0.67f, 0.0f);
        new C1677710tlB(0.33f, 1.0f, 0.68f, 1.0f);
        new C1677710tlB(0.65f, 0.0f, 0.35f, 1.0f);
        new C1677710tlB(0.64f, 0.0f, 0.78f, 0.0f);
        new C1677710tlB(0.22f, 1.0f, 0.36f, 1.0f);
        new C1677710tlB(0.83f, 0.0f, 0.17f, 1.0f);
        new C1677710tlB(0.55f, 0.0f, 1.0f, 0.45f);
        new C1677710tlB(0.0f, 0.55f, 0.45f, 1.0f);
        new C1677710tlB(0.85f, 0.0f, 0.15f, 1.0f);
        new C1677710tlB(0.11f, 0.0f, 0.5f, 0.0f);
        new C1677710tlB(0.5f, 1.0f, 0.89f, 1.0f);
        new C1677710tlB(0.45f, 0.0f, 0.55f, 1.0f);
        new C1677710tlB(0.5f, 0.0f, 0.75f, 0.0f);
        new C1677710tlB(0.25f, 1.0f, 0.5f, 1.0f);
        new C1677710tlB(0.76f, 0.0f, 0.24f, 1.0f);
        new C1677710tlB(0.7f, 0.0f, 0.84f, 0.0f);
        new C1677710tlB(0.16f, 1.0f, 0.3f, 1.0f);
        new C1677710tlB(0.87f, 0.0f, 0.13f, 1.0f);
        new C1677710tlB(0.36f, 0.0f, 0.66f, -0.56f);
        new C1677710tlB(0.34f, 1.56f, 0.64f, 1.0f);
        new C1677710tlB(0.68f, -0.6f, 0.32f, 1.6f);
        new InterfaceC1686200tys() { // from class: X.0tc2
            @Override // X.InterfaceC1686200tys
            public final float LIZ(float f) {
                float f2;
                float f3;
                if (f < 0.36363637f) {
                    return 7.5625f * f * f;
                }
                if (f < 0.72727275f) {
                    float f4 = f - 0.54545456f;
                    f2 = 7.5625f * f4 * f4;
                    f3 = 0.75f;
                } else if (f < 0.90909094f) {
                    float f5 = f - 0.8181818f;
                    f2 = 7.5625f * f5 * f5;
                    f3 = 0.9375f;
                } else {
                    float f6 = f - 0.95454544f;
                    f2 = 7.5625f * f6 * f6;
                    f3 = 0.984375f;
                }
                return f2 + f3;
            }
        };
    }
}
