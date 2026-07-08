package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1685860tyK {
    public final String LIZ;
    public final long LIZIZ;
    public final int LIZJ;

    public abstract float[] LIZ(float[] fArr);

    public abstract float LIZIZ(int i);

    public abstract float LIZJ(int i);

    public boolean LIZLLL() {
        return false;
    }

    public abstract float[] LJFF(float[] fArr);

    public int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" (id=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", model=");
        sbLIZ.append((Object) C1685870tyL.LIZIZ(this.LIZIZ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1685860tyK abstractC1685860tyK = (AbstractC1685860tyK) obj;
        if (this.LIZJ != abstractC1685860tyK.LIZJ || !Intrinsics.LJFF(this.LIZ, abstractC1685860tyK.LIZ)) {
            return false;
        }
        return C1685870tyL.LIZ(this.LIZIZ, abstractC1685860tyK.LIZIZ);
    }

    public AbstractC1685860tyK(String str, long j, int i) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i >= -1 && i <= 63) {
        } else {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public long LJ(float f, float f2, float f3) {
        float[] fArr = {f, f2, f3};
        LJFF(fArr);
        return (((long) Float.floatToRawIntBits(fArr[0])) << 32) | (((long) Float.floatToRawIntBits(fArr[1])) & 4294967295L);
    }

    public float LJI(float f, float f2, float f3) {
        float[] fArr = {f, f2, f3};
        LJFF(fArr);
        return fArr[2];
    }

    public long LJII(float f, float f2, float f3, float f4, AbstractC1685860tyK abstractC1685860tyK) {
        float[] fArr = new float[(int) (this.LIZIZ >> 32)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        LIZ(fArr);
        return C1685850tyJ.LIZ(fArr[0], fArr[1], fArr[2], f4, abstractC1685860tyK);
    }
}
