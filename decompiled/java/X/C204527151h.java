package X;

import java.nio.ByteBuffer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.151h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204527151h {
    public final int LIZ;
    public final int LIZIZ;
    public final C204528151i[] LIZJ;
    public final boolean[] LIZLLL;
    public int LJ;
    public int LJFF;
    public final ReentrantLock LJI;
    public final Condition LJII;

    public C204527151h(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        C204528151i[] c204528151iArr = new C204528151i[i];
        for (int i3 = 0; i3 < i; i3++) {
            c204528151iArr[i3] = new C204528151i(ByteBuffer.allocateDirect(this.LIZIZ));
        }
        this.LIZJ = c204528151iArr;
        int i4 = this.LIZ;
        boolean[] zArr = new boolean[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            zArr[i5] = false;
        }
        this.LIZLLL = zArr;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LJI = reentrantLock;
        this.LJII = reentrantLock.newCondition();
    }
}
