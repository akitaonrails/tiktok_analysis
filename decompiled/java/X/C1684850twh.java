package X;

/* JADX INFO: renamed from: X.0twh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684850twh<E> {
    public E[] LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public C1684850twh() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.LIZLLL = iHighestOneBit - 1;
        this.LIZ = (E[]) new Object[iHighestOneBit];
    }

    public final void LIZ(E e) {
        E[] eArr = this.LIZ;
        int i = this.LIZJ;
        eArr[i] = e;
        int i2 = this.LIZLLL & (i + 1);
        this.LIZJ = i2;
        int i3 = this.LIZIZ;
        if (i2 == i3) {
            int length = eArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 >= 0) {
                E[] eArr2 = (E[]) new Object[i5];
                System.arraycopy(eArr, i3, eArr2, 0, i4);
                System.arraycopy(this.LIZ, 0, eArr2, i4, this.LIZIZ);
                this.LIZ = eArr2;
                this.LIZIZ = 0;
                this.LIZJ = length;
                this.LIZLLL = i5 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }
}
