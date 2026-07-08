package X;

import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: renamed from: X.0kdb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1327050kdb implements InterfaceC1327060kdc, InterfaceC1290810jh9<C1327050kdb>, InterfaceC1325190kab {
    public final C1323050kX9<InterfaceC1327060kdc> LL;
    public Map<String, String> LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    @Override // X.InterfaceC1325190kab
    public final void hitBitmapMemoryCache() {
        this.LLILZ = true;
    }

    @Override // X.InterfaceC1325190kab
    public final void hitEncodeMemoryCache() {
        this.LLILLL = true;
    }

    @Override // X.InterfaceC1327060kdc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LL.get().close();
    }

    @Override // X.InterfaceC1327060kdc
    public final ByteBuffer getByteBuffer() {
        return this.LL.get().getByteBuffer();
    }

    @Override // X.InterfaceC1327060kdc
    public final long getNativePtr() {
        return this.LL.get().getNativePtr();
    }

    @Override // X.InterfaceC1327060kdc
    public final boolean isClosed() {
        return this.LL.get().isClosed();
    }

    @Override // X.InterfaceC1327060kdc
    public final int size() {
        return this.LL.get().size();
    }

    public C1327050kdb(C1323050kX9<InterfaceC1327060kdc> c1323050kX9) {
        this.LL = c1323050kX9;
    }

    @Override // X.InterfaceC1290810jh9
    public final void LIZ(C1327050kdb c1327050kdb) {
        c1327050kdb.LL.close();
    }

    @Override // X.InterfaceC1327060kdc
    public final byte read(int i) {
        return this.LL.get().read(i);
    }

    @Override // X.InterfaceC1327060kdc
    public final int read(int i, byte[] bArr, int i2, int i3) {
        return this.LL.get().read(i, bArr, i2, i3);
    }
}
