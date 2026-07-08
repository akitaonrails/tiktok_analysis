package X;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: X.0W1M, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0W1M extends GZIPOutputStream {
    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.util.zip.GZIPOutputStream, java.util.zip.DeflaterOutputStream
    public final void finish() {
    }

    public final void LIZ() throws IOException {
        super.finish();
    }

    public C0W1M(OutputStream outputStream) {
        super(outputStream);
    }
}
