package X;

/* JADX INFO: renamed from: X.0H0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC434010H0d<T> {
    public int LIZIZ;
    public final int LIZ = 3;
    public final T[] LIZJ = (T[]) new Object[3];

    public abstract int LIZ(T t);

    public final void LIZIZ(Object obj, Object obj2) {
        int i;
        int i2 = this.LIZ - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = 0;
            int i5 = 0;
            i = 0;
            while (true) {
                T t = this.LIZJ[i4];
                if (t != null) {
                    if (i5 < i4) {
                        int i6 = i4 - i5;
                        System.arraycopy(obj, i5, obj2, i, i6);
                        i += i6;
                    }
                    int iLIZ = LIZ(t);
                    System.arraycopy(t, 0, obj2, i, iLIZ);
                    i += iLIZ;
                    i5 = i4 + 1;
                }
                if (i4 == i2) {
                    break;
                } else {
                    i4++;
                }
            }
            i3 = i5;
        } else {
            i = 0;
        }
        int i7 = this.LIZ;
        if (i3 < i7) {
            System.arraycopy(obj, i3, obj2, i, i7 - i3);
        }
    }
}
