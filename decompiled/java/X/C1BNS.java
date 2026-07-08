package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.1BNS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BNS {
    public final ReentrantReadWriteLock.WriteLock LIZ;
    public final ReentrantReadWriteLock.ReadLock LIZIZ;
    public final C1BNT LIZJ;

    public final int LIZ() {
        this.LIZIZ.lock();
        try {
            int i = this.LIZJ.LIZLLL;
            this.LIZIZ.unlock();
            return i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZIZ.unlock();
            throw th;
        }
    }

    public C1BNS() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.LIZ = reentrantReadWriteLock.writeLock();
        this.LIZIZ = reentrantReadWriteLock.readLock();
        this.LIZJ = new C1BNT();
    }

    public final void LIZIZ(int i, byte[] bArr) {
        if (i >= 0 && i <= bArr.length) {
            if (bArr.length != 0 && i != 0) {
                this.LIZ.lock();
                try {
                    this.LIZJ.LIZLLL(i, bArr);
                    this.LIZ.unlock();
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZ.unlock();
                    throw th;
                }
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
