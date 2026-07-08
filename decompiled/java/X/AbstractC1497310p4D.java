package X;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.0p4D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1497310p4D extends OutputStream {
    public IOException LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;

    public abstract void LIZIZ();

    public abstract AbstractC1498040p5O LIZLLL();

    public abstract void LJFF();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.LLILLJJLI = true;
    }

    public final void LIZ() throws IOException {
        if (!this.LLILLL) {
            if (this.LLILLJJLI) {
                throw new IOException("Stream has been closed.");
            }
        } else {
            IOException iOException = this.LL;
            if (iOException != null) {
                throw iOException;
            }
            throw new IOException("Writing after request completed.");
        }
    }
}
