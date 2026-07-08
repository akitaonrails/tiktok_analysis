package X;

import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.1Bwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221201Bwc {
    public final RandomAccessFile LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final ReentrantLock LJFF;

    public C2221201Bwc(RandomAccessFile randomAccessFile, String str, boolean z, boolean z2, boolean z3) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZ = randomAccessFile;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = reentrantLock;
    }
}
