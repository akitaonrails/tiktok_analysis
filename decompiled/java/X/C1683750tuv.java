package X;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tuv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683750tuv extends AbstractC1682800ttO {
    public final List<C1685910tyP> LIZLLL;
    public final List<Float> LJ;
    public final long LJFF;
    public final float LJI;
    public final int LJII;

    public final int hashCode() {
        int iHashCode = this.LIZLLL.hashCode() * 31;
        List<Float> list = this.LJ;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI)) * 31) + this.LJII;
    }

    public final String toString() {
        String strLIZIZ;
        String strLIZIZ2 = "";
        if ((this.LJFF & 9223372034707292159L) != 9205357640488583168L) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("center=");
            sbLIZ.append((Object) C1378605aS.LJIIIIZZ(this.LJFF));
            sbLIZ.append(", ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        if ((Float.floatToRawIntBits(this.LJI) & Integer.MAX_VALUE) < 2139095040) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("radius=");
            sbLIZ2.append(this.LJI);
            sbLIZ2.append(", ");
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("RadialGradient(colors=");
        sbLIZ3.append(this.LIZLLL);
        sbLIZ3.append(", stops=");
        sbLIZ3.append(this.LJ);
        sbLIZ3.append(", ");
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(strLIZIZ2);
        sbLIZ3.append("tileMode=");
        sbLIZ3.append((Object) C1683800tv0.LIZ(this.LJII));
        sbLIZ3.append(')');
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    @Override // X.AbstractC1682800ttO
    public final Shader LIZIZ(long j) {
        boolean z;
        long j2;
        float fIntBitsToFloat;
        long j3;
        float fIntBitsToFloat2;
        long j4 = this.LJFF;
        if ((9223372034707292159L & j4) == 9205357640488583168L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long jLIZIZ = C1671580tbI.LIZIZ(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jLIZIZ >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jLIZIZ & 4294967295L));
        } else {
            if (Float.intBitsToFloat((int) (j4 >> 32)) == Float.POSITIVE_INFINITY) {
                j2 = j >> 32;
            } else {
                j2 = this.LJFF >> 32;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) j2);
            if (Float.intBitsToFloat((int) (this.LJFF & 4294967295L)) == Float.POSITIVE_INFINITY) {
                j3 = j & 4294967295L;
            } else {
                j3 = this.LJFF & 4294967295L;
            }
            fIntBitsToFloat2 = Float.intBitsToFloat((int) j3);
        }
        List<C1685910tyP> list = this.LIZLLL;
        List<Float> list2 = this.LJ;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        float fLIZJ = this.LJI;
        if (fLIZJ == Float.POSITIVE_INFINITY) {
            fLIZJ = C1680770tq7.LIZJ(j) / 2;
        }
        int i = this.LJII;
        C1683740tuu.LIZLLL(list, list2);
        int iLIZ = C1683740tuu.LIZ(list);
        return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), fLIZJ, C1683740tuu.LIZIZ(iLIZ, list), C1683740tuu.LIZJ(iLIZ, list2, list), C1683780tuy.LIZ(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1683750tuv)) {
            return false;
        }
        C1683750tuv c1683750tuv = (C1683750tuv) obj;
        if (Intrinsics.LJFF(this.LIZLLL, c1683750tuv.LIZLLL) && Intrinsics.LJFF(this.LJ, c1683750tuv.LJ) && C1378605aS.LIZJ(this.LJFF, c1683750tuv.LJFF) && this.LJI == c1683750tuv.LJI && this.LJII == c1683750tuv.LJII) {
            return true;
        }
        return false;
    }

    public C1683750tuv(List list, List list2, long j, float f, int i) {
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = j;
        this.LJI = f;
        this.LJII = i;
    }
}
