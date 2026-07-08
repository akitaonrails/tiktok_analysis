package X;

/* JADX INFO: renamed from: X.0kiQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330040kiQ implements InterfaceC1330990kjx {
    public final InterfaceC1330470kj7 LIZ;
    public long LIZIZ = -1;

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
        int frameCount = this.LIZ.getFrameCount();
        for (int i = 0; i < frameCount; i++) {
            this.LIZIZ += (long) this.LIZ.LJ(i);
        }
        return this.LIZIZ;
    }

    public C1330040kiQ(InterfaceC1330470kj7 interfaceC1330470kj7) {
        this.LIZ = interfaceC1330470kj7;
    }

    @Override // X.InterfaceC1330990kjx
    public final long LIZ(long j) {
        long jLIZLLL = LIZLLL();
        long jLJ = 0;
        if (jLIZLLL == 0) {
            return -1L;
        }
        if (this.LIZ.getLoopCount() != 0 && j / LIZLLL() >= this.LIZ.getLoopCount()) {
            return -1L;
        }
        long j2 = j % jLIZLLL;
        int frameCount = this.LIZ.getFrameCount();
        for (int i = 0; i < frameCount && jLJ <= j2; i++) {
            jLJ += (long) this.LIZ.LJ(i);
        }
        return j + (jLJ - j2);
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
    public final int LIZJ(long j, long j2) {
        int i = 0;
        if (this.LIZ.getLoopCount() != 0 && 0 == 0 && j / LIZLLL() >= this.LIZ.getLoopCount()) {
            return -1;
        }
        long jLIZLLL = j % LIZLLL();
        long jLJ = 0;
        do {
            jLJ += (long) this.LIZ.LJ(i);
            i++;
        } while (jLIZLLL >= jLJ);
        return i - 1;
    }
}
