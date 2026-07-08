package X;

/* JADX INFO: renamed from: X.10oN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19358110oN {
    public final float LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public C19358110oN(boolean z, boolean z2) {
        if (z) {
            this.LIZ += EnumC19357910oL.DOWNLOAD_TYPE.getWeight();
        }
        if (z2) {
            this.LIZ += EnumC19357910oL.WATER_TYPE.getWeight();
        }
    }

    public final int LIZ(EnumC19357910oL enumC19357910oL, int i) {
        int i2 = C19358010oM.LIZ[enumC19357910oL.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                this.LIZJ = true;
            } else {
                throw new C1954807lC();
            }
        } else {
            this.LIZIZ = true;
        }
        float weight = (enumC19357910oL.getWeight() / this.LIZ) * i;
        int weight2 = 0;
        if (enumC19357910oL != EnumC19357910oL.DOWNLOAD_TYPE && this.LIZIZ) {
            weight2 = 0 + ((int) ((r1.getWeight() / this.LIZ) * 100));
        }
        if (enumC19357910oL != EnumC19357910oL.WATER_TYPE && this.LIZJ) {
            weight2 += (int) ((r1.getWeight() / this.LIZ) * 100);
        }
        return (int) (weight + weight2);
    }
}
