package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0tlS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677880tlS {
    public static C1677900tlU LIZIZ() {
        final float f = 1.0f;
        final float f2 = 0.1f;
        return new C1677900tlU(new InterfaceC1677930tlX(f, f2) { // from class: X.0tlV
            public final float LIZ;
            public final float LIZIZ;

            @Override // X.InterfaceC1677930tlX
            public final float LIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1677930tlX
            public final long LJ(float f3) {
                return ((long) ((((float) Math.log(this.LIZ / Math.abs(f3))) * 1000.0f) / this.LIZIZ)) * 1000000;
            }

            {
                this.LIZ = Math.max(1.0E-7f, Math.abs(f2));
                this.LIZIZ = Math.max(1.0E-4f, f) * (-4.2f);
            }

            @Override // X.InterfaceC1677930tlX
            public final float LIZIZ(float f3, float f4) {
                if (Math.abs(f4) <= this.LIZ) {
                    return f3;
                }
                double dLog = Math.log(Math.abs(r1 / f4));
                float f5 = this.LIZIZ;
                double d = f5;
                float f6 = f4 / f5;
                return (f3 - f6) + (f6 * ((float) Math.exp((d * ((dLog / d) * ((double) LSPassThroughRecordSizeConfig.DEFAULT))) / ((double) 1000.0f))));
            }

            @Override // X.InterfaceC1677930tlX
            public final float LIZJ(float f3, long j) {
                return f3 * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.LIZIZ));
            }

            @Override // X.InterfaceC1677930tlX
            public final float LIZLLL(float f3, float f4, long j) {
                float f5 = f4 / this.LIZIZ;
                return (f3 - f5) + (f5 * ((float) Math.exp((r1 * (j / 1000000)) / 1000.0f)));
            }
        });
    }

    public static final float LIZ(InterfaceC1677940tlY<Float> interfaceC1677940tlY, float f, float f2) {
        return ((C1677280tkU) interfaceC1677940tlY.LIZ().LJ(new C1677280tkU(f), new C1677280tkU(f2))).LIZ;
    }
}
