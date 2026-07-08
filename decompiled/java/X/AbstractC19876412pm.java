package X;

/* JADX INFO: renamed from: X.12pm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19876412pm<E> {
    public abstract AbstractC19876412pm<E> LIZ(E e);

    public static int LIZIZ(int i, int i2) {
        if (i2 >= 0) {
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
                if (iHighestOneBit < 0) {
                    return Integer.MAX_VALUE;
                }
                return iHighestOneBit;
            }
            return i3;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }
}
