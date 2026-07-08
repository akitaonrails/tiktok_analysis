package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0X21, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X21 extends InputStream {
    public final InputStream LL;
    public final C0X24 LLILLJJLI;
    public volatile AtomicBoolean LLILLL = new AtomicBoolean(false);
    public final ByteArrayOutputStream LLILZ = new ByteArrayOutputStream();

    @Override // java.io.InputStream
    public final int available() {
        return this.LL.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.LL.close();
        C0X24 c0x24 = this.LLILLJJLI;
        if (c0x24 == null || this.LLILLL.get()) {
            return;
        }
        c0x24.LIZ(this.LLILZ.toByteArray());
        this.LLILLL.set(true);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.LL.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.LL.read();
        C0X24 c0x24 = this.LLILLJJLI;
        if (c0x24 != null) {
            if (i == -1 && !this.LLILLL.get()) {
                c0x24.LIZ(this.LLILZ.toByteArray());
                this.LLILLL.set(true);
            }
            this.LLILZ.write(i);
        }
        return i;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.LL.reset();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.LL.mark(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.LL.skip(j);
    }

    public C0X21(InputStream inputStream, C0X24 c0x24) {
        this.LL = inputStream;
        this.LLILLJJLI = c0x24;
    }
}
