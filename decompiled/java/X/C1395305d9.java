package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.05d9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1395305d9 {
    public final boolean LIZ;
    public final EnumC1395405dA LIZIZ;
    public final int LIZJ;
    public final C1395605dC[] LIZLLL;
    public int LJ;
    public final float[] LJFF;
    public final float[] LJI;
    public final float[] LJII;

    public C1395305d9() {
        this(true, EnumC1395405dA.Impulse);
    }

    public final float LIZIZ(float f) {
        float f2;
        float fSignum;
        float f3;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("maximumVelocity should be a positive value. You specified=");
            sbLIZ.append(f);
            C1696250uF5.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        float[] fArr = this.LJFF;
        float[] fArr2 = this.LJI;
        int i = this.LJ;
        C1395605dC c1395605dC = this.LIZLLL[i];
        if (c1395605dC != null) {
            C1395605dC c1395605dC2 = c1395605dC;
            int i2 = 0;
            do {
                C1395605dC c1395605dC3 = this.LIZLLL[i];
                if (c1395605dC3 == null) {
                    break;
                }
                long j = c1395605dC.LIZ;
                long j2 = c1395605dC3.LIZ;
                float f5 = j - j2;
                float fAbs = Math.abs(j2 - c1395605dC2.LIZ);
                if (this.LIZIZ != EnumC1395405dA.Lsq2 && !this.LIZ) {
                    c1395605dC2 = c1395605dC;
                } else {
                    c1395605dC2 = c1395605dC3;
                }
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i2] = c1395605dC3.LIZIZ;
                fArr2[i2] = -f5;
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
            } while (i2 < 20);
            if (i2 >= this.LIZJ) {
                int i3 = C1395505dB.LIZ[this.LIZIZ.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        try {
                            float[] fArr3 = this.LJII;
                            C1395105d7.LIZJ(fArr2, fArr, i2, fArr3);
                            fSignum = fArr3[1];
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            fSignum = 0.0f;
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    boolean z = this.LIZ;
                    int i4 = i2 - 1;
                    float f6 = fArr2[i4];
                    int i5 = i4;
                    float fSignum2 = 0.0f;
                    while (i5 > 0) {
                        int i6 = i5 - 1;
                        float f7 = fArr2[i6];
                        if (f6 != f7) {
                            if (z) {
                                f3 = -fArr[i6];
                            } else {
                                f3 = fArr[i5] - fArr[i6];
                            }
                            float f8 = f3 / (f6 - f7);
                            fSignum2 += (f8 - (Math.signum(fSignum2) * ((float) Math.sqrt(2 * Math.abs(fSignum2))))) * Math.abs(f8);
                            if (i5 == i4) {
                                fSignum2 *= 0.5f;
                            }
                        }
                        i5 = i6;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fSignum2) * ((float) Math.sqrt(2 * Math.abs(fSignum2)));
                }
                f2 = fSignum * LSPassThroughRecordSizeConfig.DEFAULT;
            } else {
                f2 = 0.0f;
            }
            f4 = 0.0f;
            if (f2 != 0.0f && !Float.isNaN(f2)) {
                if (f2 > 0.0f) {
                    if (f2 > f) {
                        return f;
                    }
                } else {
                    float f9 = -f;
                    if (f2 < f9) {
                        return f9;
                    }
                }
                return f2;
            }
        }
        return f4;
    }

    public C1395305d9(boolean z, EnumC1395405dA enumC1395405dA) {
        this.LIZ = z;
        this.LIZIZ = enumC1395405dA;
        if (z && enumC1395405dA.equals(EnumC1395405dA.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i = C1395505dB.LIZ[enumC1395405dA.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                i2 = 3;
            } else {
                throw new C1954807lC();
            }
        }
        this.LIZJ = i2;
        this.LIZLLL = new C1395605dC[20];
        this.LJFF = new float[20];
        this.LJI = new float[20];
        this.LJII = new float[3];
    }

    public final void LIZ(float f, long j) {
        int i = (this.LJ + 1) % 20;
        this.LJ = i;
        C1395605dC[] c1395605dCArr = this.LIZLLL;
        C1395605dC c1395605dC = c1395605dCArr[i];
        if (c1395605dC == null) {
            c1395605dCArr[i] = new C1395605dC(j, f);
        } else {
            c1395605dC.LIZ = j;
            c1395605dC.LIZIZ = f;
        }
    }
}
