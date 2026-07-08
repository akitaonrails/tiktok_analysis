package X;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: X.1Dbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2259211Dbj extends FilterOutputStream {
    public final OutputStream LL;
    public ByteOrder LLILLJJLI;

    public final void LIZ(int i) throws IOException {
        this.LL.write(i);
    }

    public final void LIZIZ(int i) throws IOException {
        ByteOrder byteOrder = this.LLILLJJLI;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.LL.write((i >>> 0) & 255);
            this.LL.write((i >>> 8) & 255);
            this.LL.write((i >>> 16) & 255);
            this.LL.write((i >>> 24) & 255);
            return;
        }
        if (byteOrder != ByteOrder.BIG_ENDIAN) {
            return;
        }
        this.LL.write((i >>> 24) & 255);
        this.LL.write((i >>> 16) & 255);
        this.LL.write((i >>> 8) & 255);
        this.LL.write((i >>> 0) & 255);
    }

    public final void LIZLLL(short s) throws IOException {
        ByteOrder byteOrder = this.LLILLJJLI;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.LL.write((s >>> 0) & 255);
            this.LL.write((s >>> 8) & 255);
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                return;
            }
            this.LL.write((s >>> 8) & 255);
            this.LL.write((s >>> 0) & 255);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.LL.write(bArr);
    }

    public C2259211Dbj(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.LL = outputStream;
        this.LLILLJJLI = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.LL.write(bArr, i, i2);
    }
}
