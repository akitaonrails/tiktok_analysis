package X;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0W1X, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W1X implements Closeable {
    public final InputStream[] LL;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.LL) {
            C0W1V.LIZIZ(inputStream);
        }
    }

    public C0W1X(InputStream[] inputStreamArr) {
        this.LL = inputStreamArr;
    }
}
