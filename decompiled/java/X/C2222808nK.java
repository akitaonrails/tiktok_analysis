package X;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: X.08nK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2222808nK implements InterfaceC2423009eW {
    public final File LL;
    public C0VSP LLILLJJLI;
    public FileChannel LLILLL;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LLILLJJLI.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.LLILLL.isOpen();
    }

    public C2222808nK(C0VSJ c0vsj) {
        this.LL = c0vsj;
        C0VSP c0vsp = new C0VSP(c0vsj);
        this.LLILLJJLI = c0vsp;
        this.LLILLL = c0vsp.getChannel();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.LLILLL.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        return this.LLILLL.write(byteBuffer);
    }

    @Override // X.InterfaceC2423009eW
    public final int LJLIL(ByteBuffer byteBuffer, long j) {
        return this.LLILLL.read(byteBuffer, j);
    }
}
