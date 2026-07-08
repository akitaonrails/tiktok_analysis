package X;

/* JADX INFO: renamed from: X.0fph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142350fph {
    public final InterfaceC1496780p3M LIZ;

    public static int LIZIZ(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public C1142350fph(InterfaceC1496780p3M interfaceC1496780p3M) {
        this.LIZ = interfaceC1496780p3M;
    }

    public static int LIZ(int i) {
        return LIZIZ(i << 3);
    }

    public final void LIZJ(int i) {
        if (i >= 0) {
            LJ(i);
        } else {
            LJFF(i);
        }
    }

    public final void LJ(int i) {
        while ((i & (-128)) != 0) {
            this.LIZ.writeByte((i & 127) | 128);
            i >>>= 7;
        }
        this.LIZ.writeByte(i);
    }

    public final void LJFF(long j) {
        while (((-128) & j) != 0) {
            this.LIZ.writeByte((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.LIZ.writeByte((int) j);
    }

    public final void LIZLLL(int i, int i2) {
        LJ((i << 3) | i2);
    }
}
