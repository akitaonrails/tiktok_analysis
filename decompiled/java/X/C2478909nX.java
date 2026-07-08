package X;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: renamed from: X.09nX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2478909nX implements Closeable {
    public final InputStream[] LL;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.LL) {
            C08IH.LIZ(inputStream);
        }
    }

    public C2478909nX(InputStream[] inputStreamArr) {
        this.LL = inputStreamArr;
    }
}
