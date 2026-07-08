package X;

/* JADX INFO: renamed from: X.0jEV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1273050jEV {
    public static final double LIZJ = Math.log(2.0d);
    public final EnumC1273060jEW LIZ;
    public final double LIZIZ;

    public C1273050jEV(long j, long j2) {
        EnumC1273060jEW enumC1273060jEW = EnumC1273060jEW.ExposureValueType_Invalid;
        this.LIZ = enumC1273060jEW;
        if (j > 0) {
            if (j2 > 0) {
                this.LIZ = EnumC1273060jEW.ExposureValueType_ExposureTimeAndIso;
                this.LIZIZ = (-Math.log(j * j2)) / LIZJ;
                return;
            } else {
                this.LIZ = EnumC1273060jEW.ExposureValueType_ExposureTimeOnly;
                this.LIZIZ = (-Math.log(j)) / LIZJ;
                return;
            }
        }
        if (j2 > 0) {
            this.LIZ = EnumC1273060jEW.ExposureValueType_IsoOnly;
            this.LIZIZ = (-Math.log(j2)) / LIZJ;
        } else {
            this.LIZ = enumC1273060jEW;
        }
    }

    public C1273050jEV(double d, EnumC1273060jEW enumC1273060jEW) {
        this.LIZ = EnumC1273060jEW.ExposureValueType_Invalid;
        this.LIZIZ = d;
        this.LIZ = enumC1273060jEW;
    }
}
