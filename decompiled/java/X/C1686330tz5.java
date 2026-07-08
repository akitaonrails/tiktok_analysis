package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0tz5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686330tz5 implements InterfaceC1685240txK {
    public static final /* synthetic */ int LIZJ = 0;
    public final float[] LIZ;
    public final float[] LIZIZ;

    static {
        new C1686340tz6();
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.LIZ) * 31) + Arrays.hashCode(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FontScaleConverter{fromSpValues=");
        sbLIZ.append(Arrays.toString(this.LIZ));
        sbLIZ.append(", toDpValues=");
        sbLIZ.append(Arrays.toString(this.LIZIZ));
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1685240txK
    public final float LIZ(float f) {
        return C1686340tz6.LIZ(f, this.LIZ, this.LIZIZ);
    }

    @Override // X.InterfaceC1685240txK
    public final float LIZIZ(float f) {
        return C1686340tz6.LIZ(f, this.LIZIZ, this.LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1686330tz5)) {
            return false;
        }
        C1686330tz5 c1686330tz5 = (C1686330tz5) obj;
        if (Arrays.equals(this.LIZ, c1686330tz5.LIZ) && Arrays.equals(this.LIZIZ, c1686330tz5.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C1686330tz5(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length && fArr.length != 0) {
            this.LIZ = fArr;
            this.LIZIZ = fArr2;
        } else {
            "Array lengths must match and be nonzero".toString();
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
    }
}
