package X;

import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.1Bwb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221191Bwb {
    public final RandomAccessFile LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final ReentrantLock LJI;

    public C2221191Bwb(RandomAccessFile randomAccessFile, String str, String str2, boolean z, boolean z2, boolean z3) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZ = randomAccessFile;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = reentrantLock;
    }
}
