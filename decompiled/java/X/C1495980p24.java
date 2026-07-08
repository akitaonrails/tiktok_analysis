package X;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.0p24, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495980p24 implements InterfaceC842570X3n {
    public final InterfaceC1496620p36 LL;
    public int LLILLJJLI;
    public byte LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public short LLILZLL;

    @Override // X.InterfaceC842570X3n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // X.InterfaceC842570X3n
    public final C1496250p2V timeout() {
        return this.LL.timeout();
    }

    public C1495980p24(InterfaceC1496620p36 interfaceC1496620p36) {
        this.LL = interfaceC1496620p36;
    }

    @Override // X.InterfaceC842570X3n
    public final long read(C1496690p3D c1496690p3D, long j) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.LLILZIL;
            if (i3 == 0) {
                this.LL.skip(this.LLILZLL);
                this.LLILZLL = (short) 0;
                if ((this.LLILLL & 4) != 0) {
                    return -1L;
                }
                i = this.LLILZ;
                InterfaceC1496620p36 interfaceC1496620p36 = this.LL;
                int i4 = (interfaceC1496620p36.readByte() & 255) | ((interfaceC1496620p36.readByte() & 255) << 16) | ((interfaceC1496620p36.readByte() & 255) << 8);
                this.LLILZIL = i4;
                this.LLILLJJLI = i4;
                byte b = (byte) (this.LL.readByte() & 255);
                this.LLILLL = (byte) (this.LL.readByte() & 255);
                Logger logger = C1495930p1z.LLILZIL;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C1495990p25.LIZ(true, this.LLILZ, this.LLILLJJLI, b, this.LLILLL));
                }
                i2 = this.LL.readInt() & Integer.MAX_VALUE;
                this.LLILZ = i2;
                if (b != 9) {
                    C1495990p25.LIZIZ("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                    throw null;
                }
            } else {
                long j2 = this.LL.read(c1496690p3D, Math.min(j, i3));
                if (j2 == -1) {
                    return -1L;
                }
                this.LLILZIL = (int) (((long) this.LLILZIL) - j2);
                return j2;
            }
        } while (i2 == i);
        C1495990p25.LIZIZ("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }
}
