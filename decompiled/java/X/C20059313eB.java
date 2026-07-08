package X;

/* JADX INFO: renamed from: X.13eB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20059313eB {
    public static final int LIZ(float[] fArr) {
        boolean z;
        int i;
        int i2 = 0;
        if (fArr.length < 16) {
            return 0;
        }
        if (fArr[0] == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) {
            i = 1;
        } else {
            i = 0;
        }
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i2 = 1;
        }
        return i2 | (i << 1);
    }

    public static final boolean LIZIZ(long j) {
        return !C1676820tjk.LIZIZ(j, 9223372034707292159L);
    }
}
