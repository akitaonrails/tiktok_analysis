package X;

import java.io.DataOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.0W1L, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W1L {
    public final C0W1N LIZ;
    public final C0W1M LIZIZ;
    public final boolean LIZJ;

    public final void LIZ(byte[] bArr) {
        if (this.LIZJ) {
            this.LIZIZ.write(bArr);
        } else {
            write(bArr);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0W1N] */
    public C0W1L(final OutputStream outputStream, boolean z) {
        this.LIZJ = z;
        if (z) {
            this.LIZIZ = new C0W1M(outputStream);
        } else {
            this.LIZ = new DataOutputStream(outputStream) { // from class: X.0W1N
                @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
        }
    }
}
