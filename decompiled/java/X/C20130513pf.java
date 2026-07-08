package X;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: X.13pf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20130513pf implements InterfaceC20130413pe {
    public final FileInputStream LIZ;
    public final FileChannel LIZIZ;
    public final ByteBuffer LIZJ = ByteBuffer.allocate(8192);

    @Override // X.InterfaceC20130413pe
    public final void close() {
        C2199671B7d.LJJIIJ(this.LIZIZ, this.LIZ);
    }

    @Override // X.InterfaceC20130413pe
    public final long length() {
        return this.LIZIZ.size();
    }

    public C20130513pf(FileInputStream fileInputStream) {
        this.LIZ = fileInputStream;
        this.LIZIZ = fileInputStream.getChannel();
    }

    @Override // X.InterfaceC20130413pe
    public final void LIZIZ(long j) throws IOException {
        this.LIZIZ.position(j);
    }

    @Override // X.InterfaceC20130413pe
    public final int LIZ(byte[] bArr, int i) throws IOException {
        int i2 = this.LIZIZ.read(this.LIZJ);
        if (i2 != -1) {
            this.LIZJ.flip();
            this.LIZJ.get(bArr, 0, i2);
            this.LIZJ.clear();
        }
        return i2;
    }
}
