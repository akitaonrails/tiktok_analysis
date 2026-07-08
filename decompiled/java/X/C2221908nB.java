package X;

import com.bytedance.geckox.buffer.impl.MMapBuffer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.08nB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2221908nB {
    public static InterfaceC1550870qSb LIZIZ(C0VSJ c0vsj, long j) {
        try {
            return new MMapBuffer(c0vsj, null, j);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1553130qWF.LJ("gecko-debug-tag", "mmap failed:", e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create random access file failed! file:");
            sbLIZ.append(c0vsj.getAbsolutePath());
            sbLIZ.append(" caused by:");
            sbLIZ.append(e.getMessage());
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public static InterfaceC1550870qSb LIZ(C1551530qTf c1551530qTf, C0VSJ c0vsj, long j) throws IOException {
        InterfaceC1550870qSb interfaceC1550870qSbLIZJ = LIZJ(c1551530qTf, c0vsj, j, null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buffer type:");
        sbLIZ.append(interfaceC1550870qSbLIZJ.getClass());
        C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
        return interfaceC1550870qSbLIZJ;
    }

    public static InterfaceC1550870qSb LIZJ(C1551530qTf c1551530qTf, final File file, final long j, final String str) throws IOException {
        if (j <= 0) {
            try {
                return new InterfaceC1550870qSb(file, str) { // from class: X.08mr
                    public final RandomAccessFile LIZ;
                    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
                    public File LIZJ;
                    public final String LIZLLL;

                    @Override // X.InterfaceC1550870qSb
                    public final int read() {
                        byte[] bArr = new byte[1];
                        if (read(bArr, 0, 1) <= 0) {
                            return -1;
                        }
                        return bArr[0];
                    }

                    @Override // X.InterfaceC1550870qSb
                    public final boolean LIZ() {
                        if (this.LIZLLL == null) {
                            return false;
                        }
                        C0VSJ c0vsj = new C0VSJ(this.LIZLLL);
                        boolean zRenameTo = this.LIZJ.renameTo(c0vsj);
                        if (zRenameTo) {
                            this.LIZJ = c0vsj;
                        }
                        return zRenameTo;
                    }

                    @Override // X.InterfaceC1550870qSb
                    public final void LIZJ() throws IOException {
                        if (this.LIZIZ.get()) {
                            throw new IOException("released!");
                        }
                    }

                    @Override // X.InterfaceC1550870qSb
                    public final long length() {
                        return this.LIZ.length();
                    }

                    @Override // X.InterfaceC1550870qSb
                    public final long position() throws IOException {
                        if (this.LIZIZ.get()) {
                            throw new IOException("released!");
                        }
                        return this.LIZ.getFilePointer();
                    }

                    @Override // X.InterfaceC1550870qSb
                    public final void release() {
                        if (this.LIZIZ.getAndSet(true)) {
                            return;
                        }
                        C08IQ.LIZ(this.LIZ);
                    }

                    @Override // X.InterfaceC1550870qSb
                    public final File LIZIZ() {
                        return this.LIZJ;
                    }

                    @Override // X.InterfaceC1550870qSb
                    public final void position(long j2) throws IOException {
                        if (!this.LIZIZ.get()) {
                            if (j2 < 0) {
                                j2 = 0;
                            }
                            this.LIZ.seek(j2);
                            return;
                        }
                        throw new IOException("released!");
                    }

                    @Override // X.InterfaceC1550870qSb
                    public final int read(byte[] bArr) {
                        return read(bArr, 0, bArr.length);
                    }

                    @Override // X.InterfaceC1550870qSb
                    public final synchronized long skip(long j2) {
                        if (!this.LIZIZ.get()) {
                            if (((int) j2) == j2) {
                            } else {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("too large:");
                                sbLIZ.append(j2);
                                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        } else {
                            throw new IOException("released!");
                        }
                        return this.LIZ.skipBytes(r3);
                    }

                    @Override // X.InterfaceC1550870qSb
                    public final void write(int i) throws IOException {
                        LJJIII(0, new byte[]{(byte) i}, 1);
                    }

                    @Override // X.InterfaceC1550870qSb
                    public final void write(byte[] bArr) throws IOException {
                        LJJIII(0, bArr, bArr.length);
                    }

                    {
                        this.LIZJ = file;
                        this.LIZLLL = str;
                        boolean zMkdirs = file.getParentFile().mkdirs();
                        try {
                            this.LIZ = new RandomAccessFile(file, "rw");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            boolean zExists = file.getParentFile().exists();
                            C08IQ.LIZ(this.LIZ);
                            if (e instanceof FileNotFoundException) {
                                boolean zMkdirs2 = file.getParentFile().mkdirs();
                                boolean zExists2 = file.getParentFile().exists();
                                try {
                                    this.LIZ = new RandomAccessFile(file, "rw");
                                    return;
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    C08IQ.LIZ(this.LIZ);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("create raf mSwap failed![2 dir mk:");
                                    sbLIZ.append(zMkdirs2);
                                    sbLIZ.append(",dir exist:+");
                                    sbLIZ.append(zExists2);
                                    sbLIZ.append(", dir mk:");
                                    sbLIZ.append(zMkdirs);
                                    sbLIZ.append(",dir exist:+");
                                    sbLIZ.append(zExists);
                                    sbLIZ.append("] path: ");
                                    sbLIZ.append(file.getAbsolutePath());
                                    sbLIZ.append(" caused by: ");
                                    sbLIZ.append(e.getMessage());
                                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ), e);
                                }
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("create raf mSwap failed![1 dir mk:");
                            sbLIZ2.append(zMkdirs);
                            sbLIZ2.append(",dir exist:+");
                            sbLIZ2.append(zExists);
                            sbLIZ2.append("] path: ");
                            sbLIZ2.append(file.getAbsolutePath());
                            sbLIZ2.append(" caused by: ");
                            sbLIZ2.append(e.getMessage());
                            throw new IOException(C2188811AlT.LIZIZ(sbLIZ2), e);
                        }
                    }

                    @Override // X.InterfaceC1550870qSb
                    public final int LJJIII(int i, byte[] bArr, int i2) throws IOException {
                        if (!this.LIZIZ.get()) {
                            if (bArr == null || bArr.length == 0 || i2 < 1 || i < 0 || i >= bArr.length) {
                                return 0;
                            }
                            if (i + i2 > bArr.length) {
                                i2 = bArr.length - i;
                            }
                            synchronized (this) {
                                try {
                                    this.LIZ.write(bArr, i, i2);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            return i2;
                        }
                        throw new IOException("released!");
                    }

                    @Override // X.InterfaceC1550870qSb
                    public final int read(byte[] bArr, int i, int i2) throws IOException {
                        int i3;
                        if (!this.LIZIZ.get()) {
                            if (bArr != null && i2 >= 1 && i >= 0 && i < bArr.length) {
                                if (i + i2 > bArr.length) {
                                    i2 = bArr.length - i;
                                }
                                synchronized (this) {
                                    try {
                                        i3 = this.LIZ.read(bArr, i, i2);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                                return i3;
                            }
                            return 0;
                        }
                        throw new IOException("released!");
                    }
                };
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("create FileBuffer failed! file:");
                sbLIZ.append(file.getAbsolutePath());
                sbLIZ.append(" caused by:");
                sbLIZ.append(e.getMessage());
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ), e);
            }
        }
        if (c1551530qTf.LJIILJJIL) {
            try {
                return new MMapBuffer(file, str, j);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1553130qWF.LJ("gecko-debug-tag", "mmap failed:", e2);
            }
        }
        try {
            return new InterfaceC1550870qSb(file, str, j) { // from class: X.08ms
                public final long LIZ;
                public long LIZIZ;
                public final RandomAccessFile LIZJ;
                public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
                public File LJ;
                public final String LJFF;

                @Override // X.InterfaceC1550870qSb
                public final int read() {
                    byte[] bArr = new byte[1];
                    if (read(bArr, 0, 1) == 0) {
                        return -1;
                    }
                    return bArr[0];
                }

                @Override // X.InterfaceC1550870qSb
                public final boolean LIZ() {
                    if (this.LJFF == null) {
                        return false;
                    }
                    C0VSJ c0vsj = new C0VSJ(this.LJFF);
                    boolean zRenameTo = this.LJ.renameTo(c0vsj);
                    if (zRenameTo) {
                        this.LJ = c0vsj;
                    }
                    return zRenameTo;
                }

                @Override // X.InterfaceC1550870qSb
                public final void LIZJ() throws IOException {
                    if (this.LIZLLL.get()) {
                        throw new IOException("released!");
                    }
                }

                @Override // X.InterfaceC1550870qSb
                public final long position() throws IOException {
                    if (this.LIZLLL.get()) {
                        throw new IOException("released!");
                    }
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC1550870qSb
                public final void release() {
                    if (this.LIZLLL.getAndSet(true)) {
                        return;
                    }
                    C08IQ.LIZ(this.LIZJ);
                }

                @Override // X.InterfaceC1550870qSb
                public final File LIZIZ() {
                    return this.LJ;
                }

                @Override // X.InterfaceC1550870qSb
                public final long length() {
                    return this.LIZ;
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0014 A[PHI: r1
                  0x0014: PHI (r1v2 long) = (r1v1 long), (r1v3 long) binds: [B:5:0x000c, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.InterfaceC1550870qSb
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void position(long r4) throws java.io.IOException {
                    /*
                        r3 = this;
                        java.util.concurrent.atomic.AtomicBoolean r0 = r3.LIZLLL
                        boolean r0 = r0.get()
                        if (r0 != 0) goto L1d
                        r1 = 0
                        int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                        if (r0 < 0) goto L14
                        long r1 = r3.LIZ
                        int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                        if (r0 <= 0) goto L15
                    L14:
                        r4 = r1
                    L15:
                        r3.LIZIZ = r4
                        java.io.RandomAccessFile r0 = r3.LIZJ
                        r0.seek(r4)
                        return
                    L1d:
                        java.io.IOException r1 = new java.io.IOException
                        java.lang.String r0 = "released!"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2220008ms.position(long):void");
                }

                @Override // X.InterfaceC1550870qSb
                public final int read(byte[] bArr) {
                    return read(bArr, 0, bArr.length);
                }

                @Override // X.InterfaceC1550870qSb
                public final synchronized long skip(long j2) {
                    int iSkipBytes;
                    if (!this.LIZLLL.get()) {
                        int i = (int) j2;
                        if (i == j2) {
                            iSkipBytes = this.LIZJ.skipBytes(i);
                            this.LIZIZ = this.LIZJ.getFilePointer();
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("too large:");
                            sbLIZ2.append(j2);
                            throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    } else {
                        throw new IOException("released!");
                    }
                    return iSkipBytes;
                }

                @Override // X.InterfaceC1550870qSb
                public final void write(int i) throws IOException {
                    LJJIII(0, new byte[]{(byte) i}, 1);
                }

                @Override // X.InterfaceC1550870qSb
                public final void write(byte[] bArr) throws IOException {
                    LJJIII(0, bArr, bArr.length);
                }

                {
                    this.LIZ = j;
                    this.LJ = file;
                    this.LJFF = str;
                    boolean zMkdirs = file.getParentFile().mkdirs();
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                        this.LIZJ = randomAccessFile;
                        randomAccessFile.setLength(j);
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        boolean zExists = file.getParentFile().exists();
                        C08IQ.LIZ(this.LIZJ);
                        if (e3 instanceof FileNotFoundException) {
                            boolean zMkdirs2 = file.getParentFile().mkdirs();
                            boolean zExists2 = file.getParentFile().exists();
                            try {
                                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                                this.LIZJ = randomAccessFile2;
                                randomAccessFile2.setLength(j);
                                return;
                            } catch (Exception e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                C08IQ.LIZ(this.LIZJ);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("create raf swap failed[2 dir mk:");
                                sbLIZ2.append(zMkdirs2);
                                sbLIZ2.append(",dir exist:+");
                                sbLIZ2.append(zExists2);
                                sbLIZ2.append(", dir mk:");
                                sbLIZ2.append(zMkdirs);
                                sbLIZ2.append(",dir exist:+");
                                sbLIZ2.append(zExists);
                                sbLIZ2.append("]! path: ");
                                sbLIZ2.append(file.getAbsolutePath());
                                sbLIZ2.append(" caused by: ");
                                sbLIZ2.append(e3.getMessage());
                                throw new IOException(C2188811AlT.LIZIZ(sbLIZ2), e3);
                            }
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("create raf swap failed[1 dir mk:");
                        sbLIZ3.append(zMkdirs);
                        sbLIZ3.append(",dir exist:+");
                        sbLIZ3.append(zExists);
                        sbLIZ3.append("]! path: ");
                        sbLIZ3.append(file.getAbsolutePath());
                        sbLIZ3.append(" caused by: ");
                        sbLIZ3.append(e3.getMessage());
                        throw new IOException(C2188811AlT.LIZIZ(sbLIZ3), e3);
                    }
                }

                @Override // X.InterfaceC1550870qSb
                public final int LJJIII(int i, byte[] bArr, int i2) throws IOException {
                    if (!this.LIZLLL.get()) {
                        if (bArr == null || bArr.length == 0 || i2 < 1 || i < 0 || i >= bArr.length) {
                            return 0;
                        }
                        if (i + i2 > bArr.length) {
                            i2 = bArr.length - i;
                        }
                        synchronized (this) {
                            try {
                                long j2 = this.LIZIZ;
                                long j3 = this.LIZ;
                                if (j2 == j3) {
                                    return 0;
                                }
                                if (((long) i2) + j2 > j3) {
                                    i2 = (int) (j3 - j2);
                                }
                                this.LIZJ.write(bArr, i, i2);
                                this.LIZIZ += (long) i2;
                                return i2;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                    throw new IOException("released!");
                }

                @Override // X.InterfaceC1550870qSb
                public final int read(byte[] bArr, int i, int i2) throws IOException {
                    if (!this.LIZLLL.get()) {
                        if (bArr != null && i2 >= 1 && i >= 0 && i < bArr.length) {
                            if (i + i2 > bArr.length) {
                                i2 = bArr.length - i;
                            }
                            synchronized (this) {
                                try {
                                    long j2 = this.LIZIZ;
                                    long j3 = this.LIZ;
                                    if (j2 == j3) {
                                        return -1;
                                    }
                                    if (((long) i2) + j2 > j3) {
                                        i2 = (int) (j3 - j2);
                                    }
                                    int i3 = this.LIZJ.read(bArr, i, i2);
                                    if (i3 == -1) {
                                        return -1;
                                    }
                                    this.LIZIZ += (long) i3;
                                    return i3;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                        return 0;
                    }
                    throw new IOException("released!");
                }
            };
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("create random access file failed! file:");
            sbLIZ2.append(file.getAbsolutePath());
            sbLIZ2.append(" caused by:");
            sbLIZ2.append(e3.getMessage());
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e3);
        }
    }
}
