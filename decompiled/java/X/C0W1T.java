package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: X.0W1T, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W1T {
    public final C0W1U LIZ;
    public boolean LIZIZ;
    public final /* synthetic */ C0W1V LIZJ;

    public final void LIZ() {
        if (!this.LIZIZ) {
            this.LIZJ.LIZLLL(this, true);
        } else {
            this.LIZJ.LIZLLL(this, false);
            this.LIZJ.LJJJ(this.LIZ.LIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0W1F] */
    public final C0W1F LIZIZ() {
        ?? r3;
        synchronized (this.LIZJ) {
            try {
                if (this.LIZ.LIZLLL != this) {
                    throw new IllegalStateException();
                }
                final C0VSV c0vsv = new C0VSV(this.LIZ.LIZIZ(0));
                r3 = new FilterOutputStream(c0vsv) { // from class: X.0W1F
                    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        try {
                            ((FilterOutputStream) this).out.close();
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.LL.LIZIZ = true;
                        }
                    }

                    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
                    public final void flush() {
                        try {
                            ((FilterOutputStream) this).out.flush();
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.LL.LIZIZ = true;
                        }
                    }

                    @Override // java.io.FilterOutputStream, java.io.OutputStream
                    public final void write(int i) {
                        try {
                            ((FilterOutputStream) this).out.write(i);
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.LL.LIZIZ = true;
                        }
                    }

                    @Override // java.io.FilterOutputStream, java.io.OutputStream
                    public final void write(byte[] bArr, int i, int i2) {
                        try {
                            ((FilterOutputStream) this).out.write(bArr, i, i2);
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.LL.LIZIZ = true;
                        }
                    }
                };
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return r3;
    }

    public C0W1T(C0W1V c0w1v, C0W1U c0w1u) {
        this.LIZJ = c0w1v;
        this.LIZ = c0w1u;
    }
}
