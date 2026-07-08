package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: X.13pi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20130813pi implements Closeable {
    public final C1B8D LL;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LL.close();
    }

    public C20130813pi(final C0VSJ c0vsj, final int i) {
        if (C2199751B7l.LJFF.LJIIIIZZ("enable_file_channel_write", 0) > 0) {
            this.LL = new C1B8D(c0vsj) { // from class: X.13pg
                public final RandomAccessFile LIZ;
                public final FileChannel LIZIZ;
                public final ByteBuffer LIZJ;

                @Override // X.C1B8D
                public final void LIZ() {
                }

                @Override // X.C1B8D
                public final void close() {
                    C2199671B7d.LJJIIJ(this.LIZIZ, this.LIZ);
                }

                @Override // X.C1B8D
                public final void flush() throws IOException {
                    this.LIZIZ.force(true);
                }

                @Override // X.C1B8D
                public final void LIZJ() throws IOException {
                    flush();
                }

                {
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(c0vsj, "rw");
                        this.LIZ = randomAccessFile;
                        this.LIZIZ = randomAccessFile.getChannel();
                        String str = C1490880otq.LIZ;
                        this.LIZJ = ByteBuffer.allocate(32768);
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new BaseException(1039, e);
                    }
                }

                @Override // X.C1B8D
                public final void LIZIZ(long j) throws IOException {
                    this.LIZIZ.position(j);
                }

                @Override // X.C1B8D
                public final void LJ(long j) throws IOException {
                    this.LIZ.setLength(j);
                }

                @Override // X.C1B8D
                public final void LIZLLL(byte[] bArr, int i2) throws IOException {
                    this.LIZJ.clear();
                    this.LIZJ.put(bArr, 0, i2);
                    this.LIZJ.flip();
                    while (this.LIZJ.hasRemaining()) {
                        this.LIZIZ.write(this.LIZJ);
                    }
                }
            };
        } else {
            this.LL = new C1B8D(c0vsj, i) { // from class: X.13ph
                public final BufferedOutputStream LIZ;
                public final FileDescriptor LIZIZ;
                public final RandomAccessFile LIZJ;

                @Override // X.C1B8D
                public final void close() {
                    C2199671B7d.LJJIIJ(this.LIZ, this.LIZJ);
                }

                @Override // X.C1B8D
                public final void LIZ() throws SyncFailedException {
                    FileDescriptor fileDescriptor = this.LIZIZ;
                    if (fileDescriptor != null) {
                        fileDescriptor.sync();
                    }
                }

                @Override // X.C1B8D
                public final void LIZJ() throws IOException {
                    BufferedOutputStream bufferedOutputStream = this.LIZ;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.flush();
                    }
                    FileDescriptor fileDescriptor = this.LIZIZ;
                    if (fileDescriptor != null) {
                        fileDescriptor.sync();
                    }
                }

                @Override // X.C1B8D
                public final void flush() throws IOException {
                    BufferedOutputStream bufferedOutputStream = this.LIZ;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.flush();
                    }
                }

                @Override // X.C1B8D
                public final void LIZIZ(long j) throws IOException {
                    this.LIZJ.seek(j);
                }

                @Override // X.C1B8D
                public final void LJ(long j) throws IOException {
                    this.LIZJ.setLength(j);
                }

                /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[PHI: r0
                  0x001c: PHI (r0v5 int) = (r0v4 int), (r0v7 int) binds: [B:6:0x0016, B:8:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
                {
                    /*
                        r4 = this;
                        r4.<init>()
                        java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L3f
                        java.lang.String r0 = "rw"
                        r3.<init>(r5, r0)     // Catch: java.io.IOException -> L3f
                        r4.LIZJ = r3     // Catch: java.io.IOException -> L3f
                        java.io.FileDescriptor r0 = r3.getFD()     // Catch: java.io.IOException -> L3f
                        r4.LIZIZ = r0     // Catch: java.io.IOException -> L3f
                        if (r6 <= 0) goto L2e
                        r0 = 8192(0x2000, float:1.148E-41)
                        if (r6 < r0) goto L1c
                        r0 = 131072(0x20000, float:1.83671E-40)
                        if (r6 <= r0) goto L1d
                    L1c:
                        r6 = r0
                    L1d:
                        java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.io.IOException -> L3f
                        X.0VSV r1 = new X.0VSV     // Catch: java.io.IOException -> L3f
                        java.io.FileDescriptor r0 = r3.getFD()     // Catch: java.io.IOException -> L3f
                        r1.<init>(r0)     // Catch: java.io.IOException -> L3f
                        r2.<init>(r1, r6)     // Catch: java.io.IOException -> L3f
                        r4.LIZ = r2     // Catch: java.io.IOException -> L3f
                        return
                    L2e:
                        java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.io.IOException -> L3f
                        X.0VSV r1 = new X.0VSV     // Catch: java.io.IOException -> L3f
                        java.io.FileDescriptor r0 = r3.getFD()     // Catch: java.io.IOException -> L3f
                        r1.<init>(r0)     // Catch: java.io.IOException -> L3f
                        r2.<init>(r1)     // Catch: java.io.IOException -> L3f
                        r4.LIZ = r2     // Catch: java.io.IOException -> L3f
                        return
                    L3f:
                        r2 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
                        com.ss.android.socialbase.downloader.exception.BaseException r1 = new com.ss.android.socialbase.downloader.exception.BaseException
                        r0 = 1039(0x40f, float:1.456E-42)
                        r1.<init>(r0, r2)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C20130713ph.<init>(X.0VSJ, int):void");
                }

                @Override // X.C1B8D
                public final void LIZLLL(byte[] bArr, int i2) throws IOException {
                    this.LIZ.write(bArr, 0, i2);
                }
            };
        }
    }
}
