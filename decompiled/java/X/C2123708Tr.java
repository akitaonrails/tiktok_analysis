package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: X.08Tr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2123708Tr implements Closeable {
    public C0VSV LL;
    public FileLock LLILLJJLI;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            FileLock fileLock = this.LLILLJJLI;
            if (fileLock != null) {
                fileLock.release();
            }
            this.LL.close();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LL.close();
            throw th;
        }
    }

    public C2123708Tr(C0VSJ c0vsj, boolean z) throws IOException {
        FileLock fileLockTryLock;
        C0VSV c0vsv = new C0VSV(c0vsj);
        this.LL = c0vsv;
        try {
            if (z) {
                try {
                    fileLockTryLock = c0vsv.getChannel().tryLock();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    fileLockTryLock = null;
                }
            } else {
                fileLockTryLock = c0vsv.getChannel().lock();
            }
            if (fileLockTryLock == null) {
                this.LL.close();
            }
            this.LLILLJJLI = fileLockTryLock;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LL.close();
            throw th;
        }
    }
}
