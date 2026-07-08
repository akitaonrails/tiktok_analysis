package X;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0kgw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329120kgw implements InterfaceC1329110kgv, Closeable {
    public ByteBuffer LL;
    public final int LLILLJJLI;
    public final long LLILLL = System.identityHashCode(this);

    @Override // X.InterfaceC1329110kgv, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.LL = null;
    }

    @Override // X.InterfaceC1329110kgv
    public final synchronized ByteBuffer getByteBuffer() {
        return this.LL;
    }

    @Override // X.InterfaceC1329110kgv
    public final synchronized boolean isClosed() {
        return this.LL == null;
    }

    @Override // X.InterfaceC1329110kgv
    public final long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // X.InterfaceC1329110kgv
    public final int getSize() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1329110kgv
    public final long getUniqueId() {
        return this.LLILLL;
    }

    public C1329120kgw(int i) {
        this.LL = ByteBuffer.allocateDirect(i);
        this.LLILLJJLI = i;
    }

    @Override // X.InterfaceC1329110kgv
    public final synchronized byte read(int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LJFF(z);
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1322350kW1.LIZIZ(z2);
        if (i >= this.LLILLJJLI) {
            z3 = false;
        }
        C1322350kW1.LIZIZ(z3);
        return this.LL.get(i);
    }

    public final void LIZ(InterfaceC1329110kgv interfaceC1329110kgv, int i) {
        if (interfaceC1329110kgv instanceof C1329120kgw) {
            C1322350kW1.LJFF(!isClosed());
            C1322350kW1.LJFF(!interfaceC1329110kgv.isClosed());
            C1330490kj9.LIZ(0, interfaceC1329110kgv.getSize(), 0, i, this.LLILLJJLI);
            this.LL.position(0);
            interfaceC1329110kgv.getByteBuffer().position(0);
            byte[] bArr = new byte[i];
            this.LL.get(bArr, 0, i);
            interfaceC1329110kgv.getByteBuffer().put(bArr, 0, i);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0042, code lost:
    
        throw r0;
     */
    @Override // X.InterfaceC1329110kgv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void copy(int r6, X.InterfaceC1329110kgv r7, int r8, int r9) {
        /*
            r5 = this;
            r7.getClass()
            long r3 = r7.getUniqueId()
            long r1 = r5.LLILLL
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L11
            r0 = 0
            X.C1322350kW1.LIZIZ(r0)
        L11:
            long r3 = r7.getUniqueId()
            long r1 = r5.LLILLL
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2f
            monitor-enter(r7)
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L29
            r5.LIZ(r7, r9)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L29
            return
        L23:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
            throw r0     // Catch: java.lang.Throwable -> L29
        L29:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L29
            throw r0
        L2f:
            monitor-enter(r5)
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L3d
            r5.LIZ(r7, r9)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3d
            return
        L37:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.lang.Throwable -> L3d
        L3d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1329120kgw.copy(int, X.0kgv, int, int):void");
    }

    @Override // X.InterfaceC1329110kgv
    public final synchronized int read(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int iMin;
        bArr.getClass();
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LJFF(z);
        iMin = Math.min(Math.max(0, this.LLILLJJLI - i), i3);
        C1330490kj9.LIZ(i, bArr.length, i2, iMin, this.LLILLJJLI);
        this.LL.position(i);
        this.LL.get(bArr, i2, iMin);
        return iMin;
    }

    @Override // X.InterfaceC1329110kgv
    public final synchronized int write(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        int iMin;
        bArr.getClass();
        if (!isClosed()) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LJFF(z);
        iMin = Math.min(Math.max(0, this.LLILLJJLI - i), i3);
        C1330490kj9.LIZ(i, bArr.length, i2, iMin, this.LLILLJJLI);
        this.LL.position(i);
        this.LL.put(bArr, i2, iMin);
        return iMin;
    }
}
