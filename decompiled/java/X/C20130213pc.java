package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: X.13pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20130213pc implements InterfaceC20130413pe {
    public final RandomAccessFile LIZ;

    @Override // X.InterfaceC20130413pe
    public final void close() throws IOException {
        this.LIZ.close();
    }

    @Override // X.InterfaceC20130413pe
    public final long length() {
        return this.LIZ.length();
    }

    public C20130213pc(File file) {
        this.LIZ = new RandomAccessFile(file, "r");
    }

    @Override // X.InterfaceC20130413pe
    public final void LIZIZ(long j) throws IOException {
        this.LIZ.seek(j);
    }

    @Override // X.InterfaceC20130413pe
    public final int LIZ(byte[] bArr, int i) {
        return this.LIZ.read(bArr, 0, i);
    }
}
