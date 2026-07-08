package X;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.0W1C, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0W1C extends FilterOutputStream {
    public long LL;

    public C0W1C(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.LL++;
        ((FilterOutputStream) this).out.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.LL += (long) i2;
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
