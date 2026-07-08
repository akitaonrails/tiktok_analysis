package X;

import com.ttnet.org.chromium.net.j;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0p3Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1496900p3Y extends InputStream {
    public final CronetHttpURLConnection LL;
    public boolean LLILLJJLI;
    public ByteBuffer LLILLL;
    public IOException LLILZ;

    public final void LIZ() throws IOException {
        if (this.LLILLJJLI) {
            IOException iOException = this.LLILZ;
            if (iOException != null) {
                throw iOException;
            }
            return;
        }
        if (LIZIZ()) {
            return;
        }
        if (this.LLILLL == null) {
            int i = this.LL.LJIJJLI;
            if (i < 8192) {
                i = 32768;
            }
            this.LLILLL = ByteBuffer.allocateDirect(i);
        }
        this.LLILLL.clear();
        CronetHttpURLConnection cronetHttpURLConnection = this.LL;
        ByteBuffer byteBuffer = this.LLILLL;
        j jVar = cronetHttpURLConnection.LIZJ;
        if (jVar != null) {
            jVar.LJI(byteBuffer);
            cronetHttpURLConnection.LJFF(cronetHttpURLConnection.getReadTimeout());
        }
        IOException iOException2 = this.LLILZ;
        if (iOException2 != null) {
            throw iOException2;
        }
        ByteBuffer byteBuffer2 = this.LLILLL;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean LIZIZ() {
        ByteBuffer byteBuffer = this.LLILLL;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (!this.LLILLJJLI) {
            if (LIZIZ()) {
                return this.LLILLL.remaining();
            }
            return 0;
        }
        IOException iOException = this.LLILZ;
        if (iOException == null) {
            return 0;
        }
        throw iOException;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        CronetHttpURLConnection cronetHttpURLConnection = this.LL;
        if (cronetHttpURLConnection != null) {
            cronetHttpURLConnection.disconnect();
        }
        super.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        LIZ();
        if (LIZIZ()) {
            return this.LLILLL.get() & 255;
        }
        return -1;
    }

    public C1496900p3Y(CronetHttpURLConnection cronetHttpURLConnection) {
        this.LL = cronetHttpURLConnection;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            if (i2 == 0) {
                return 0;
            }
            LIZ();
            if (LIZIZ()) {
                int iMin = Math.min(this.LLILLL.limit() - this.LLILLL.position(), i2);
                this.LLILLL.get(bArr, i, iMin);
                return iMin;
            }
            return -1;
        }
        throw new IndexOutOfBoundsException();
    }
}
