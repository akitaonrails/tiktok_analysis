package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.13TG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13TG {
    public final C13TH LIZ;
    public final boolean[] LIZIZ;
    public boolean LIZJ;
    public final /* synthetic */ C13TF LIZLLL;

    public final void LIZ() {
        this.LIZLLL.LIZ(this, false);
    }

    public final void LIZIZ() {
        if (!this.LIZJ) {
            this.LIZLLL.LIZ(this, true);
        } else {
            this.LIZLLL.LIZ(this, false);
            this.LIZLLL.LJIJJLI(this.LIZ.LIZ);
        }
    }

    public final OutputStream LIZJ() {
        final C0VSV c0vsv;
        FilterOutputStream filterOutputStream;
        C13TF c13tf = this.LIZLLL;
        if (c13tf.LLIZ <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected index ");
            sbLIZ.append(0);
            sbLIZ.append(" to be greater than 0 and less than the maximum value count of ");
            sbLIZ.append(this.LIZLLL.LLIZ);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        synchronized (c13tf) {
            try {
                C13TH c13th = this.LIZ;
                if (c13th.LIZLLL != this) {
                    throw new IllegalStateException();
                }
                if (!c13th.LIZJ) {
                    this.LIZIZ[0] = true;
                }
                C0VSJ c0vsjLIZIZ = c13th.LIZIZ(0);
                try {
                    c0vsv = new C0VSV(c0vsjLIZIZ);
                } catch (FileNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LIZLLL.LL.mkdirs();
                    try {
                        c0vsv = new C0VSV(c0vsjLIZIZ);
                    } catch (FileNotFoundException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return C13TF.LLJJI;
                    }
                }
                filterOutputStream = new FilterOutputStream(c0vsv) { // from class: X.09nY
                    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        try {
                            ((FilterOutputStream) this).out.close();
                        } catch (IOException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            this.LL.LIZJ = true;
                        }
                    }

                    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
                    public final void flush() {
                        try {
                            ((FilterOutputStream) this).out.flush();
                        } catch (IOException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            this.LL.LIZJ = true;
                        }
                    }

                    @Override // java.io.FilterOutputStream, java.io.OutputStream
                    public final void write(int i) {
                        try {
                            ((FilterOutputStream) this).out.write(i);
                        } catch (IOException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            this.LL.LIZJ = true;
                        }
                    }

                    @Override // java.io.FilterOutputStream, java.io.OutputStream
                    public final void write(byte[] bArr, int i, int i2) {
                        try {
                            ((FilterOutputStream) this).out.write(bArr, i, i2);
                        } catch (IOException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            this.LL.LIZJ = true;
                        }
                    }
                };
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return filterOutputStream;
    }

    public C13TG(C13TF c13tf, C13TH c13th) {
        boolean[] zArr;
        this.LIZLLL = c13tf;
        this.LIZ = c13th;
        if (c13th.LIZJ) {
            zArr = null;
        } else {
            zArr = new boolean[c13tf.LLIZ];
        }
        this.LIZIZ = zArr;
    }
}
