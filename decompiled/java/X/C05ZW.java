package X;

/* JADX INFO: renamed from: X.05ZW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05ZW {
    public final EnumC1684030tvN LIZ;
    public long LIZIZ;

    public final float LIZIZ(long j) {
        long j2;
        if (this.LIZ == EnumC1684030tvN.Horizontal) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public C05ZW(EnumC1684030tvN enumC1684030tvN, long j) {
        this.LIZ = enumC1684030tvN;
        this.LIZIZ = j;
    }

    public final long LIZ(C20066813fO c20066813fO, float f) {
        float fAbs;
        long j;
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        long jLJI = C1378605aS.LJI(this.LIZIZ, C1378605aS.LJFF(c20066813fO.LIZJ, c20066813fO.LJI));
        this.LIZIZ = jLJI;
        if (this.LIZ == null) {
            fAbs = C1378605aS.LIZLLL(jLJI);
        } else {
            fAbs = Math.abs(LIZIZ(jLJI));
        }
        if (fAbs >= f) {
            if (this.LIZ == null) {
                long j2 = this.LIZIZ;
                return C1378605aS.LJFF(this.LIZIZ, C1378605aS.LJII(f, C1378605aS.LIZIZ(C1378605aS.LIZLLL(j2), j2)));
            }
            float fLIZIZ = LIZIZ(this.LIZIZ) - (Math.signum(LIZIZ(this.LIZIZ)) * f);
            long j3 = this.LIZIZ;
            EnumC1684030tvN enumC1684030tvN = this.LIZ;
            EnumC1684030tvN enumC1684030tvN2 = EnumC1684030tvN.Horizontal;
            if (enumC1684030tvN == enumC1684030tvN2) {
                j = j3 & 4294967295L;
            } else {
                j = j3 >> 32;
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) j);
            if (this.LIZ == enumC1684030tvN2) {
                jFloatToRawIntBits = Float.floatToRawIntBits(fLIZIZ);
                iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            } else {
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                iFloatToRawIntBits = Float.floatToRawIntBits(fLIZIZ);
            }
            return (((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits << 32);
        }
        return 9205357640488583168L;
    }
}
