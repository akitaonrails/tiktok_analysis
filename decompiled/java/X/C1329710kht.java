package X;

/* JADX INFO: renamed from: X.0kht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329710kht implements InterfaceC1330990kjx {
    public final InterfaceC1330960kju LIZ;
    public int LIZJ;
    public final int[] LJI;
    public long LIZIZ = -1;
    public int LIZLLL = -1;
    public long LJ = -1;
    public long LJFF = -1;

    @Override // X.InterfaceC1330990kjx
    public final InterfaceC1330990kjx LJ(InterfaceC1330990kjx interfaceC1330990kjx) {
        return null;
    }

    @Override // X.InterfaceC1330990kjx
    public final void LJJLIIIJLJLI() {
    }

    @Override // X.InterfaceC1330990kjx
    public final long LIZLLL() {
        long j = this.LIZIZ;
        if (j != -1) {
            return j;
        }
        this.LIZIZ = 0L;
        int length = this.LJI.length;
        for (int i = 0; i < length; i++) {
            this.LIZIZ += (long) LJFF(this.LJI[i]);
        }
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1330990kjx
    public final long LIZ(long j) {
        if (LIZLLL() == 0) {
            return -1L;
        }
        if (this.LIZ.getLoopCount() != 0 && this.LIZJ >= this.LIZ.getLoopCount()) {
            return -1L;
        }
        long jLJFF = LJFF(this.LJI[this.LIZLLL]);
        long j2 = this.LJ + jLJFF;
        if (j2 >= j) {
            return j2;
        }
        return j + jLJFF;
    }

    @Override // X.InterfaceC1330990kjx
    public final long LIZIZ(int i) {
        long jLJFF = 0;
        for (int i2 = 0; i2 < i; i2++) {
            jLJFF += (long) LJFF(i);
        }
        return jLJFF;
    }

    public final int LJFF(int i) {
        if (i >= this.LIZ.getFrameCount()) {
            return this.LIZ.LJ(0);
        }
        return this.LIZ.LJ(i);
    }

    public C1329710kht(InterfaceC1330960kju interfaceC1330960kju, int[] iArr) {
        this.LIZ = interfaceC1330960kju;
        this.LJI = iArr;
    }

    @Override // X.InterfaceC1330990kjx
    public final int LIZJ(long j, long j2) {
        boolean z;
        int i = 0;
        if (this.LIZ.getLoopCount() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && j / LIZLLL() >= this.LIZ.getLoopCount()) {
            return -1;
        }
        long jLIZLLL = j % LIZLLL();
        long jLJFF = 0;
        int i2 = 0;
        do {
            jLJFF += (long) LJFF(this.LJI[i2]);
            i2++;
        } while (jLIZLLL >= jLJFF);
        int i3 = i2 - 1;
        int i4 = this.LIZLLL;
        if (i4 != -1 && j2 == this.LJFF) {
            this.LJFF = j;
            if (this.LJ + ((long) LJFF(this.LJI[i4])) > j) {
                return this.LJI[this.LIZLLL];
            }
            this.LJ = j;
            int i5 = this.LIZLLL + 1;
            int[] iArr = this.LJI;
            if (i5 >= iArr.length) {
                this.LIZJ++;
            } else {
                i = i5;
            }
            if (this.LIZ.LJIIIZ(iArr[i])) {
                this.LIZLLL = i;
                return this.LJI[i];
            }
            return this.LJI[this.LIZLLL];
        }
        this.LJ = j;
        this.LJFF = j;
        this.LIZLLL = i3;
        return this.LJI[i3];
    }
}
