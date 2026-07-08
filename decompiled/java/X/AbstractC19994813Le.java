package X;

/* JADX INFO: renamed from: X.13Le, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19994813Le {
    public static final C19994913Lf Default = new C19994913Lf();
    public static final AbstractC19994813Le defaultRandom = C19990813Jq.LIZIZ();

    public abstract int nextBits(int i);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    public double nextDouble() {
        return ((((long) nextBits(26)) << 27) + ((long) nextBits(27))) / 9.007199254740992E15d;
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public byte[] nextBytes(int i) {
        return nextBytes(new byte[i]);
    }

    public double nextDouble(double d) {
        return nextDouble(0.0d, d);
    }

    public int nextInt(int i) {
        return nextInt(0, i);
    }

    public long nextLong(long j) {
        return nextLong(0L, j);
    }

    public byte[] nextBytes(byte[] bArr) {
        return nextBytes(bArr, 0, bArr.length);
    }

    public double nextDouble(double d, double d2) {
        double dNextDouble;
        if (d2 > d) {
            double d3 = d2 - d;
            if (Double.isInfinite(d3) && Math.abs(d) <= Double.MAX_VALUE && Math.abs(d2) <= Double.MAX_VALUE) {
                double d4 = 2;
                dNextDouble = nextDouble() * ((d2 / d4) - (d / d4));
                d += dNextDouble;
            } else {
                dNextDouble = nextDouble() * d3;
            }
            double d5 = d + dNextDouble;
            if (d5 >= d2) {
                return Math.nextAfter(d2, Double.NEGATIVE_INFINITY);
            }
            return d5;
        }
        String strLIZJ = C19994513Lb.LIZJ(Double.valueOf(d), Double.valueOf(d2));
        strLIZJ.toString();
        throw new IllegalArgumentException(strLIZJ);
    }

    public int nextInt(int i, int i2) {
        int iNextInt;
        int iNextBits;
        if (i2 > i) {
            int i3 = i2 - i;
            if (i3 > 0 || i3 == Integer.MIN_VALUE) {
                if (((-i3) & i3) == i3) {
                    iNextBits = nextBits(31 - Integer.numberOfLeadingZeros(i3));
                } else {
                    do {
                        iNextInt = nextInt() >>> 1;
                        iNextBits = iNextInt % i3;
                    } while ((iNextInt - iNextBits) + (i3 - 1) < 0);
                }
                return i + iNextBits;
            }
            while (true) {
                int iNextInt2 = nextInt();
                if (i <= iNextInt2 && iNextInt2 < i2) {
                    return iNextInt2;
                }
            }
        } else {
            String strLIZJ = C19994513Lb.LIZJ(Integer.valueOf(i), Integer.valueOf(i2));
            strLIZJ.toString();
            throw new IllegalArgumentException(strLIZJ);
        }
    }

    public long nextLong(long j, long j2) {
        long jNextLong;
        long jNextBits;
        int iNextInt;
        if (j2 > j) {
            long j3 = j2 - j;
            if (j3 > 0) {
                if (((-j3) & j3) == j3) {
                    int i = (int) j3;
                    int i2 = (int) (j3 >>> 32);
                    if (i != 0) {
                        iNextInt = nextBits(31 - Integer.numberOfLeadingZeros(i));
                    } else if (i2 == 1) {
                        iNextInt = nextInt();
                    } else {
                        jNextBits = (((long) nextBits(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) nextInt()) & 4294967295L);
                    }
                    jNextBits = ((long) iNextInt) & 4294967295L;
                } else {
                    do {
                        jNextLong = nextLong() >>> 1;
                        jNextBits = jNextLong % j3;
                    } while ((jNextLong - jNextBits) + (j3 - 1) < 0);
                }
                return j + jNextBits;
            }
            while (true) {
                long jNextLong2 = nextLong();
                if (j <= jNextLong2 && jNextLong2 < j2) {
                    return jNextLong2;
                }
            }
        } else {
            String strLIZJ = C19994513Lb.LIZJ(Long.valueOf(j), Long.valueOf(j2));
            strLIZJ.toString();
            throw new IllegalArgumentException(strLIZJ);
        }
    }

    public byte[] nextBytes(byte[] bArr, int i, int i2) {
        boolean z;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && i2 <= bArr.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i <= i2) {
                int i3 = (i2 - i) / 4;
                for (int i4 = 0; i4 < i3; i4++) {
                    int iNextInt = nextInt();
                    bArr[i] = (byte) iNextInt;
                    bArr[i + 1] = (byte) (iNextInt >>> 8);
                    bArr[i + 2] = (byte) (iNextInt >>> 16);
                    bArr[i + 3] = (byte) (iNextInt >>> 24);
                    i += 4;
                }
                int i5 = i2 - i;
                int iNextBits = nextBits(i5 * 8);
                for (int i6 = 0; i6 < i5; i6++) {
                    bArr[i + i6] = (byte) (iNextBits >>> (i6 * 8));
                }
                return bArr;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fromIndex (");
            sbLIZ.append(i);
            sbLIZ.append(") must be not greater than toIndex (");
            sbLIZ.append(i2);
            sbLIZ.append(").");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fromIndex (");
        sbLIZ2.append(i);
        sbLIZ2.append(") or toIndex (");
        sbLIZ2.append(i2);
        sbLIZ2.append(") are out of range: 0..");
        sbLIZ2.append(bArr.length);
        sbLIZ2.append('.');
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalArgumentException(strLIZIZ2);
    }

    public static /* synthetic */ byte[] nextBytes$default(AbstractC19994813Le abstractC19994813Le, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return abstractC19994813Le.nextBytes(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }
}
