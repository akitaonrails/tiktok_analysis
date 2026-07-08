package X;

import com.ttnet.org.chromium.net.n0;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0p49, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497270p49 extends AbstractC1497310p4D {
    public final int LLILZ;
    public final C1497290p4B LLILZIL = new AbstractC1498040p5O() { // from class: X.0p4B
        @Override // X.AbstractC1498040p5O
        public final long LIZ() {
            C1497270p49 c1497270p49 = this.LL;
            int i = c1497270p49.LLILZ;
            if (i != -1) {
                return i;
            }
            boolean z = c1497270p49.LLIZ;
            ByteBuffer byteBuffer = c1497270p49.LLILZLL;
            return z ? byteBuffer.limit() : byteBuffer.position();
        }

        @Override // X.AbstractC1498040p5O
        public final void LIZLLL(n0 n0Var) {
            this.LL.LLILZLL.position(0);
            n0Var.LIZJ();
        }

        @Override // X.AbstractC1498040p5O
        public final void LIZIZ(n0 n0Var, ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (iRemaining < this.LL.LLILZLL.remaining()) {
                byteBuffer.put(this.LL.LLILZLL.array(), this.LL.LLILZLL.position(), iRemaining);
                ByteBuffer byteBuffer2 = this.LL.LLILZLL;
                byteBuffer2.position(byteBuffer2.position() + iRemaining);
            } else {
                byteBuffer.put(this.LL.LLILZLL);
            }
            n0Var.LIZ(false);
        }
    };
    public ByteBuffer LLILZLL;
    public boolean LLIZ;

    @Override // X.AbstractC1497310p4D
    public final void LIZIZ() {
    }

    @Override // X.AbstractC1497310p4D
    public final void LJFF() throws ProtocolException {
        this.LLIZ = true;
        if (this.LLILZLL.position() < this.LLILZ) {
            throw new ProtocolException("Content received is less than Content-Length");
        }
        this.LLILZLL.flip();
    }

    @Override // X.AbstractC1497310p4D
    public final AbstractC1498040p5O LIZLLL() {
        return this.LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0p4B] */
    public C1497270p49(CronetHttpURLConnection cronetHttpURLConnection) {
        cronetHttpURLConnection.getClass();
        this.LLILZ = -1;
        this.LLILZLL = ByteBuffer.allocate(16384);
    }

    public final void LJI(int i) throws ProtocolException {
        if (this.LLILZ != -1 && this.LLILZLL.position() + i > this.LLILZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exceeded content-length limit of ");
            sbLIZ.append(this.LLILZ);
            sbLIZ.append(" bytes");
            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!this.LLIZ) {
            if (this.LLILZ != -1 || this.LLILZLL.limit() - this.LLILZLL.position() > i) {
                return;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Math.max(this.LLILZLL.capacity() * 2, this.LLILZLL.capacity() + i));
            this.LLILZLL.flip();
            byteBufferAllocate.put(this.LLILZLL);
            this.LLILZLL = byteBufferAllocate;
            return;
        }
        throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        LIZ();
        LJI(1);
        this.LLILZLL.put((byte) i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0p4B] */
    public C1497270p49(CronetHttpURLConnection cronetHttpURLConnection, long j) {
        if (cronetHttpURLConnection != null) {
            if (j <= 2147483647L) {
                if (j >= 0) {
                    int i = (int) j;
                    this.LLILZ = i;
                    this.LLILZLL = ByteBuffer.allocate(i);
                    return;
                }
                throw new IllegalArgumentException("Content length < 0.");
            }
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        }
        throw new NullPointerException("Argument connection cannot be null.");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        LIZ();
        LJI(i2);
        this.LLILZLL.put(bArr, i, i2);
    }
}
