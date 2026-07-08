package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0tVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668200tVq {
    public static C1683760tuw LJIIIIZZ(Pair[] pairArr) {
        return LIZJ((Pair[]) Arrays.copyOf(pairArr, pairArr.length), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY))), 0);
    }

    public static C1683760tuw LIZ(List list, float f, int i) {
        if ((i & 4) != 0) {
            f = Float.POSITIVE_INFINITY;
        }
        int i2 = i & 8;
        return new C1683760tuw(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0);
    }

    public static C1683760tuw LJ(Pair[] pairArr, long j, long j2) {
        return LIZJ(pairArr, j, j2, 0);
    }

    public static C1683750tuv LJI(Pair[] pairArr, long j, float f) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            arrayList.add(new C1685910tyP(((C1685910tyP) pair.getSecond()).LIZ));
        }
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair pair2 : pairArr) {
            arrayList2.add(Float.valueOf(((Number) pair2.getFirst()).floatValue()));
        }
        return new C1683750tuv(arrayList, arrayList2, j, f, 0);
    }

    public static C1683760tuw LIZIZ(Pair[] pairArr, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = Float.POSITIVE_INFINITY;
        }
        int i2 = i & 8;
        return LIZJ((Pair[]) Arrays.copyOf(pairArr, pairArr.length), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), 0);
    }

    public static C1683760tuw LIZJ(Pair[] pairArr, long j, long j2, int i) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            arrayList.add(new C1685910tyP(((C1685910tyP) pair.getSecond()).LIZ));
        }
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair pair2 : pairArr) {
            arrayList2.add(Float.valueOf(((Number) pair2.getFirst()).floatValue()));
        }
        return new C1683760tuw(arrayList, arrayList2, j, j2, i);
    }

    public static C1683760tuw LIZLLL(List list, long j, long j2, int i) {
        long j3 = j2;
        long j4 = j;
        if ((i & 2) != 0) {
            j4 = 0;
        }
        if ((i & 4) != 0) {
            j3 = 9187343241974906880L;
        }
        int i2 = i & 8;
        return new C1683760tuw(list, null, j4, j3, 0);
    }

    public static C1683750tuv LJFF(List list, long j, float f, int i) {
        float f2 = f;
        long j2 = j;
        if ((i & 2) != 0) {
            j2 = 9205357640488583168L;
        }
        if ((i & 4) != 0) {
            f2 = Float.POSITIVE_INFINITY;
        }
        int i2 = i & 8;
        return new C1683750tuv(list, null, j2, f2, 0);
    }

    public static C1683760tuw LJII(List list, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = Float.POSITIVE_INFINITY;
        }
        int i2 = i & 8;
        return new C1683760tuw(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), 0);
    }
}
