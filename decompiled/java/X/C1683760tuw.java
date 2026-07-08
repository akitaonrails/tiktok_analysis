package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tuw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683760tuw extends AbstractC1682800ttO {
    public final List<C1685910tyP> LIZLLL;
    public final List<Float> LJ;
    public final long LJFF;
    public final long LJI;
    public final int LJII;

    public final int hashCode() {
        int iHashCode = this.LIZLLL.hashCode() * 31;
        List<Float> list = this.LJ;
        return ((((((iHashCode + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + this.LJII;
    }

    public final String toString() {
        String strLIZIZ;
        String strLIZIZ2 = "";
        if (((((this.LJFF & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start=");
            sbLIZ.append((Object) C1378605aS.LJIIIIZZ(this.LJFF));
            sbLIZ.append(", ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = "";
        }
        if ((((9187343241974906880L ^ (this.LJI & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("end=");
            sbLIZ2.append((Object) C1378605aS.LJIIIIZZ(this.LJI));
            sbLIZ2.append(", ");
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("LinearGradient(colors=");
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
        long j2;
        long j3;
        long j4;
        long j5;
        if (Float.intBitsToFloat((int) (this.LJFF >> 32)) == Float.POSITIVE_INFINITY) {
            j2 = j >> 32;
        } else {
            j2 = this.LJFF >> 32;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) j2);
        if (Float.intBitsToFloat((int) (this.LJFF & 4294967295L)) == Float.POSITIVE_INFINITY) {
            j3 = j & 4294967295L;
        } else {
            j3 = this.LJFF & 4294967295L;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) j3);
        if (Float.intBitsToFloat((int) (this.LJI >> 32)) == Float.POSITIVE_INFINITY) {
            j4 = j >> 32;
        } else {
            j4 = this.LJI >> 32;
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) j4);
        if (Float.intBitsToFloat((int) (this.LJI & 4294967295L)) == Float.POSITIVE_INFINITY) {
            j5 = j & 4294967295L;
        } else {
            j5 = this.LJI & 4294967295L;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) j5);
        List<C1685910tyP> list = this.LIZLLL;
        List<Float> list2 = this.LJ;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32);
        int i = this.LJII;
        C1683740tuu.LIZLLL(list, list2);
        int iLIZ = C1683740tuu.LIZ(list);
        return new LinearGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)), C1683740tuu.LIZIZ(iLIZ, list), C1683740tuu.LIZJ(iLIZ, list2, list), C1683780tuy.LIZ(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1683760tuw)) {
            return false;
        }
        C1683760tuw c1683760tuw = (C1683760tuw) obj;
        if (Intrinsics.LJFF(this.LIZLLL, c1683760tuw.LIZLLL) && Intrinsics.LJFF(this.LJ, c1683760tuw.LJ) && C1378605aS.LIZJ(this.LJFF, c1683760tuw.LJFF) && C1378605aS.LIZJ(this.LJI, c1683760tuw.LJI) && this.LJII == c1683760tuw.LJII) {
            return true;
        }
        return false;
    }

    public C1683760tuw(List list, List list2, long j, long j2, int i) {
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = j;
        this.LJI = j2;
        this.LJII = i;
    }
}
