package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.1BNR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BNR extends InputStream {
    public final C1BNQ LL;
    public int LLILLJJLI;
    public int LLILLL;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int available() {
        return Math.max(this.LL.LIZ.LIZ() - this.LLILLJJLI, 2);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C1BNQ c1bnq = this.LL;
        if (c1bnq.LIZLLL.decrementAndGet() <= 0) {
            c1bnq.LIZIZ.close();
            C1BNS c1bns = c1bnq.LIZ;
            int iLIZ = c1bns.LIZ();
            if (iLIZ < 0) {
                throw new IndexOutOfBoundsException();
            }
            c1bns.LIZ.lock();
            try {
                c1bns.LIZJ.LIZ(iLIZ);
                c1bns.LIZ.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1bns.LIZ.unlock();
                throw th;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.LL.LIZLLL.get() <= 0) {
            throw new IOException();
        }
        if (this.LLILLJJLI >= this.LL.LIZ.LIZ()) {
            this.LL.LIZ();
        }
        if (this.LL.LIZJ.get() && this.LLILLJJLI >= this.LL.LIZ.LIZ()) {
            return -1;
        }
        C1BNS c1bns = this.LL.LIZ;
        int i = this.LLILLJJLI;
        this.LLILLJJLI = i + 1;
        if (i < 0) {
            c1bns.getClass();
            throw new IndexOutOfBoundsException();
        }
        c1bns.LIZIZ.lock();
        try {
            C1BNU c1bnuLIZJ = c1bns.LIZJ.LIZJ(i);
            if (!c1bnuLIZJ.hasNext()) {
                throw new IndexOutOfBoundsException();
            }
            C1BNV c1bnv = (C1BNV) c1bnuLIZJ.next();
            byte b = c1bnv.LIZ[i - c1bnv.LIZIZ];
            c1bns.LIZIZ.unlock();
            return b & 255;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1bns.LIZIZ.unlock();
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.LLILLJJLI = this.LLILLL;
    }

    public C1BNR(C1BNQ c1bnq) {
        this.LL = c1bnq;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.LLILLL = this.LLILLJJLI;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
            if (this.LL.LIZLLL.get() <= 0) {
                throw new IOException();
            }
            int iMin = Math.min(bArr.length - i, i2);
            int i3 = 0;
            while (i3 < iMin) {
                if (this.LLILLJJLI >= this.LL.LIZ.LIZ()) {
                    if (i3 > 0) {
                        return i3;
                    }
                    if (this.LL.LIZJ.get()) {
                        return -1;
                    }
                    this.LL.LIZ();
                }
                C1BNS c1bns = this.LL.LIZ;
                int i4 = this.LLILLJJLI;
                int i5 = i + i3;
                int i6 = iMin - i3;
                c1bns.getClass();
                if (i4 >= 0 && i6 >= 0 && i5 <= bArr.length && i6 <= bArr.length - i5) {
                    int iMin2 = Math.min(i6, bArr.length - i5);
                    c1bns.LIZIZ.lock();
                    try {
                        C1BNU c1bnuLIZJ = c1bns.LIZJ.LIZJ(i4);
                        int i7 = 0;
                        while (i7 < iMin2 && c1bnuLIZJ.hasNext()) {
                            C1BNV c1bnv = (C1BNV) c1bnuLIZJ.next();
                            int i8 = c1bnv.LIZJ;
                            int i9 = i4 - c1bnv.LIZIZ;
                            int i10 = i8 - i9;
                            int i11 = i10 + i7;
                            if (i11 <= iMin2) {
                                System.arraycopy(c1bnv.LIZ, i9, bArr, i7 + i5, i10);
                                i4 += i10;
                                i7 = i11;
                            } else {
                                int i12 = iMin2 - i7;
                                System.arraycopy(c1bnv.LIZ, i9, bArr, i7 + i5, i12);
                                i4 += i12;
                                i7 = iMin2;
                            }
                        }
                        c1bns.LIZIZ.unlock();
                        i3 += i7;
                        this.LLILLJJLI += i7;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c1bns.LIZIZ.unlock();
                        throw th;
                    }
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
            return i3;
        }
        throw new IndexOutOfBoundsException();
    }
}
