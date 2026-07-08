package X;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0kgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328760kgM extends AbstractC1328940kge {
    public final AbstractC1329130kgx LL;
    public C1323050kX9<InterfaceC1329110kgv> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0kgT] */
    public final C1328830kgT LIZ() {
        if (!C1323050kX9.LJIJJ(this.LLILLJJLI)) {
            throw new C1330210kih();
        }
        final C1323050kX9<InterfaceC1329110kgv> c1323050kX9 = this.LLILLJJLI;
        final int i = this.LLILLL;
        return new InterfaceC1327060kdc(c1323050kX9, i) { // from class: X.0kgT
            public final int LL;
            public C1323050kX9<InterfaceC1329110kgv> LLILLJJLI;

            public final synchronized void LIZ() {
                if (isClosed()) {
                    throw new RuntimeException() { // from class: X.0kdd
                    };
                }
            }

            @Override // X.InterfaceC1327060kdc, java.io.Closeable, java.lang.AutoCloseable
            public final synchronized void close() {
                C1323050kX9.LJII(this.LLILLJJLI);
                this.LLILLJJLI = null;
            }

            @Override // X.InterfaceC1327060kdc
            public final synchronized ByteBuffer getByteBuffer() {
                return this.LLILLJJLI.get().getByteBuffer();
            }

            @Override // X.InterfaceC1327060kdc
            public final synchronized long getNativePtr() {
                LIZ();
                return this.LLILLJJLI.get().getNativePtr();
            }

            @Override // X.InterfaceC1327060kdc
            public final synchronized boolean isClosed() {
                return !C1323050kX9.LJIJJ(this.LLILLJJLI);
            }

            @Override // X.InterfaceC1327060kdc
            public final synchronized int size() {
                LIZ();
                return this.LL;
            }

            @Override // X.InterfaceC1327060kdc
            public final synchronized byte read(int i2) {
                boolean z;
                LIZ();
                boolean z2 = true;
                if (i2 >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                C1322350kW1.LIZIZ(z);
                if (i2 >= this.LL) {
                    z2 = false;
                }
                C1322350kW1.LIZIZ(z2);
                return this.LLILLJJLI.get().read(i2);
            }

            {
                boolean z;
                c1323050kX9.getClass();
                if (i >= 0 && i <= c1323050kX9.get().getSize()) {
                    z = true;
                } else {
                    z = false;
                }
                C1322350kW1.LIZIZ(z);
                this.LLILLJJLI = c1323050kX9.clone();
                this.LL = i;
            }

            @Override // X.InterfaceC1327060kdc
            public final synchronized int read(int i2, byte[] bArr, int i3, int i4) {
                boolean z;
                LIZ();
                if (i2 + i4 <= this.LL) {
                    z = true;
                } else {
                    z = false;
                }
                C1322350kW1.LIZIZ(z);
                return this.LLILLJJLI.get().read(i2, bArr, i3, i4);
            }
        };
    }

    @Override // X.AbstractC1328940kge, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1323050kX9.LJII(this.LLILLJJLI);
        this.LLILLJJLI = null;
        this.LLILLL = -1;
        super.close();
    }

    public C1328760kgM(AbstractC1329130kgx abstractC1329130kgx) {
        this(abstractC1329130kgx, abstractC1329130kgx.LLJI[0]);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    public C1328760kgM(AbstractC1329130kgx abstractC1329130kgx, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        abstractC1329130kgx.getClass();
        this.LL = abstractC1329130kgx;
        this.LLILLL = 0;
        this.LLILLJJLI = C1323050kX9.LJJIZ(abstractC1329130kgx.get(i), abstractC1329130kgx);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws Throwable {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            if (C1323050kX9.LJIJJ(this.LLILLJJLI)) {
                int i3 = this.LLILLL + i2;
                if (C1323050kX9.LJIJJ(this.LLILLJJLI)) {
                    if (i3 > this.LLILLJJLI.get().getSize()) {
                        InterfaceC1329110kgv interfaceC1329110kgv = this.LL.get(i3);
                        this.LLILLJJLI.get().copy(0, interfaceC1329110kgv, 0, this.LLILLL);
                        this.LLILLJJLI.close();
                        this.LLILLJJLI = C1323050kX9.LJJIZ(interfaceC1329110kgv, this.LL);
                    }
                    this.LLILLJJLI.get().write(this.LLILLL, bArr, i, i2);
                    this.LLILLL += i2;
                    return;
                }
                throw new C1330210kih();
            }
            throw new C1330210kih();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("length=");
        sbLIZ.append(bArr.length);
        sbLIZ.append("; regionStart=");
        sbLIZ.append(i);
        sbLIZ.append("; regionLength=");
        sbLIZ.append(i2);
        throw new ArrayIndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
