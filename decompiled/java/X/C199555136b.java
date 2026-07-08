package X;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: X.136b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199555136b implements InterfaceC2221271Bwj {
    public final byte[] LIZ;

    @Override // X.InterfaceC2221271Bwj
    public final int getLength() {
        return this.LIZ.length;
    }

    public C199555136b(byte[] bArr) {
        this.LIZ = bArr;
    }

    @Override // X.InterfaceC2221271Bwj
    public final InterfaceC2221271Bwj LIZ(int i) {
        return new C199555136b(Arrays.copyOf(this.LIZ, i));
    }

    @Override // X.InterfaceC2221271Bwj
    public final void LIZIZ(C133L c133l, int i, int i2) throws IOException {
        c133l.write(this.LIZ, i, i2);
    }
}
