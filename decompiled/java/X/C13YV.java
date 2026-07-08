package X;

/* JADX INFO: renamed from: X.13YV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13YV {
    public final int LIZ;
    public final long[] LIZIZ;
    public final Object[] LIZJ;

    public final int LIZ(long j) {
        int i = this.LIZ - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i == 0) {
            long j2 = this.LIZIZ[0];
            if (j2 == j) {
                return 0;
            }
            if (j2 <= j) {
                return -1;
            }
            return -2;
        }
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j3 = this.LIZIZ[i3] - j;
            if (j3 < 0) {
                i2 = i3 + 1;
            } else if (j3 > 0) {
                i = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public final C13YV LIZIZ(long j, Object obj) {
        int i = this.LIZ;
        int i2 = 0;
        int i3 = 0;
        for (Object obj2 : this.LIZJ) {
            if (obj2 != null) {
                i3++;
            }
        }
        int i4 = i3 + 1;
        long[] jArr = new long[i4];
        Object[] objArr = new Object[i4];
        if (i4 > 1) {
            int i5 = 0;
            while (true) {
                if (i5 >= i) {
                    break;
                }
                long j2 = this.LIZIZ[i5];
                Object obj3 = this.LIZJ[i5];
                if (j2 > j) {
                    jArr[i2] = j;
                    objArr[i2] = obj;
                    i2++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i2] = j2;
                    objArr[i2] = obj3;
                    i2++;
                }
                i5++;
                if (i2 >= i4) {
                    break;
                }
            }
            if (i5 == i) {
                int i6 = i4 - 1;
                jArr[i6] = j;
                objArr[i6] = obj;
            } else {
                while (i2 < i4) {
                    long j3 = this.LIZIZ[i5];
                    Object obj4 = this.LIZJ[i5];
                    if (obj4 != null) {
                        jArr[i2] = j3;
                        objArr[i2] = obj4;
                        i2++;
                    }
                    i5++;
                }
            }
        } else {
            jArr[0] = j;
            objArr[0] = obj;
        }
        return new C13YV(i4, jArr, objArr);
    }

    public C13YV(int i, long[] jArr, Object[] objArr) {
        this.LIZ = i;
        this.LIZIZ = jArr;
        this.LIZJ = objArr;
    }
}
