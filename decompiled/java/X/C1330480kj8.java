package X;

/* JADX INFO: renamed from: X.0kj8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330480kj8 implements InterfaceC1330990kjx {
    public final InterfaceC1330960kju LIZ;
    public int LIZJ;
    public final int LJI;
    public long LIZIZ = -1;
    public int LIZLLL = -1;
    public long LJ = -1;
    public long LJFF = -1;

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
        int frameCount = this.LIZ.getFrameCount();
        for (int i = 0; i < frameCount; i++) {
            this.LIZIZ += (long) this.LIZ.LJ(i);
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
        long jLJ = this.LIZ.LJ(this.LIZLLL);
        long j2 = this.LJ + jLJ;
        if (j2 >= j) {
            return j2;
        }
        return j + jLJ;
    }

    @Override // X.InterfaceC1330990kjx
    public final long LIZIZ(int i) {
        long jLJ = 0;
        for (int i2 = 0; i2 < i; i2++) {
            jLJ += (long) this.LIZ.LJ(i);
        }
        return jLJ;
    }

    @Override // X.InterfaceC1330990kjx
    public final InterfaceC1330990kjx LJ(InterfaceC1330990kjx interfaceC1330990kjx) {
        if (interfaceC1330990kjx instanceof C1330480kj8) {
            C1330480kj8 c1330480kj8 = (C1330480kj8) interfaceC1330990kjx;
            C1330480kj8 c1330480kj82 = new C1330480kj8(c1330480kj8.LIZ, c1330480kj8.LJI);
            c1330480kj82.LIZLLL = this.LIZLLL;
            c1330480kj82.LJFF = this.LJFF;
            c1330480kj82.LIZJ = this.LIZJ;
            c1330480kj82.LJ = this.LJ;
            return c1330480kj82;
        }
        return null;
    }

    public C1330480kj8(InterfaceC1330960kju interfaceC1330960kju, int i) {
        this.LIZ = interfaceC1330960kju;
        this.LJI = i;
    }

    @Override // X.InterfaceC1330990kjx
    public final int LIZJ(long j, long j2) {
        long jLIZLLL = LIZLLL();
        long jLJ = 0;
        if (jLIZLLL == 0) {
            return -1;
        }
        int i = 0;
        if (this.LIZ.getLoopCount() != 0 && j / jLIZLLL >= this.LIZ.getLoopCount()) {
            return -1;
        }
        long j3 = j % jLIZLLL;
        int i2 = 0;
        do {
            jLJ += (long) this.LIZ.LJ(i2);
            i2++;
        } while (j3 >= jLJ);
        int i3 = i2 - 1;
        int i4 = this.LIZLLL;
        if (i4 != -1 && j2 == this.LJFF) {
            this.LJFF = j;
            if (this.LJ + ((long) this.LIZ.LJ(i4)) > j) {
                return this.LIZLLL;
            }
            this.LJ = j;
            int i5 = this.LIZLLL + 1;
            if (i5 >= this.LIZ.getFrameCount()) {
                int i6 = this.LJI;
                if (i6 != 0 && i6 != 3) {
                    i = i5 - 1;
                } else {
                    this.LIZJ++;
                }
            } else {
                i = i5;
            }
            if (this.LIZ.LJIIIZ(i)) {
                this.LIZLLL = i;
                return i;
            }
            return this.LIZLLL;
        }
        this.LJ = j;
        this.LJFF = j;
        this.LIZLLL = i3;
        this.LIZJ = 0;
        return i3;
    }
}
