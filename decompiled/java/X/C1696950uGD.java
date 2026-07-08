package X;

/* JADX INFO: renamed from: X.0uGD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696950uGD {
    public final float[] LIZ = new float[57];
    public final float[] LIZIZ = new float[57];
    public final float[] LIZJ = new float[57];

    public C1696950uGD(float f) {
        int i = 0;
        do {
            this.LIZ[i] = (((float) Math.sin(3.1415927f * r5)) * 0.12f) + 0.88f;
            this.LIZIZ[i] = i * 0.017857144f * f;
            i++;
        } while (i < 57);
    }
}
