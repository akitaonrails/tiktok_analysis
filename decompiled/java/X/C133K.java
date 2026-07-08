package X;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.133K, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C133K implements InterfaceC2221271Bwj {
    public final ByteBuffer LIZ;

    @Override // X.InterfaceC2221271Bwj
    public final int getLength() {
        return this.LIZ.remaining();
    }

    public C133K(ByteBuffer byteBuffer) {
        this.LIZ = byteBuffer;
    }

    @Override // X.InterfaceC2221271Bwj
    public final InterfaceC2221271Bwj LIZ(int i) {
        ByteBuffer byteBufferDuplicate = this.LIZ.duplicate();
        byteBufferDuplicate.limit(byteBufferDuplicate.position() + Math.min(i, byteBufferDuplicate.remaining()));
        return new C133K(byteBufferDuplicate.slice());
    }

    @Override // X.InterfaceC2221271Bwj
    public final void LIZIZ(C133L c133l, int i, int i2) throws IOException {
        ByteBuffer byteBufferDuplicate = this.LIZ.duplicate();
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.limit(byteBufferDuplicate.position() + i2);
        while (byteBufferDuplicate.hasRemaining()) {
            c133l.getChannel().write(byteBufferDuplicate);
        }
    }
}
