package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.1BAE, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BAE implements Closeable {
    public final File LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final MappedByteBuffer LLILZ;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public long LLJ;
    public volatile long LLJI;
    public final C1BAF LLJILJIL;
    public final ReentrantLock LLILZIL = new ReentrantLock();
    public final C1BAI LLJIJIL = new ThreadLocal<C1BAH>() { // from class: X.1BAI
        @Override // java.lang.ThreadLocal
        public final C1BAH initialValue() {
            return new C1BAH();
        }
    };

    public final void LIZIZ() {
        int i;
        if (this.LLIZLLLIL == 0) {
            return;
        }
        int i2 = this.LLIZ;
        int i3 = this.LLILZ.getInt(i2 + 48);
        if (i3 == 0) {
            i3 = this.LLILZ.getInt(48);
            i2 = 0;
        }
        if (i3 <= 0 || i3 > (i = this.LLILLL)) {
            LJFF();
            return;
        }
        int i4 = i2 + i3 + 4;
        this.LLIZ = i4 < i ? i4 : 0;
        this.LLIZLLLIL--;
    }

    public final void LIZLLL() {
        this.LLILZ.putInt(8, this.LLILZLL);
        this.LLILZ.putInt(12, this.LLIZ);
        this.LLILZ.putInt(16, this.LLIZLLLIL);
        this.LLILZ.putInt(28, (int) this.LLJ);
    }

    public final void LJFF() {
        this.LLILZ.putInt(0, 1380275009);
        this.LLILZ.putInt(4, 2);
        this.LLILZ.putInt(20, this.LLILLJJLI);
        this.LLILZ.putInt(24, this.LLILLL);
        this.LLILZLL = 0;
        this.LLIZ = 0;
        this.LLIZLLLIL = 0;
        this.LLJ = 0L;
        LIZLLL();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LLILZIL.lock();
        try {
            this.LLILZ.force();
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        this.LLILZIL.unlock();
    }

    public final void LIZ(C1781140wS0 c1781140wS0) {
        int i;
        int i2;
        C1BAH c1bah = get();
        if (c1bah == null) {
            c1bah = new C1BAH();
            set(c1bah);
        }
        c1bah.LIZJ = 0;
        C1790300wgm.LIZ(c1781140wS0, c1bah);
        int i3 = c1bah.LIZJ;
        int i4 = i3 + 4;
        if (i4 > this.LLILLL) {
            return;
        }
        if (!this.LLILZIL.tryLock()) {
            this.LLJI++;
            return;
        }
        while (this.LLIZLLLIL >= this.LLILLJJLI) {
            try {
                LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLILZIL.unlock();
                throw th;
            }
        }
        int i5 = this.LLILLL;
        int i6 = this.LLILZLL;
        int i7 = i5 - i6;
        if (i7 < i4) {
            if (i7 >= 4) {
                this.LLILZ.putInt(i6 + 48, 0);
            }
            this.LLILZLL = 0;
        }
        while (this.LLIZLLLIL > 0 && (i = this.LLILZLL) <= (i2 = this.LLIZ) && i + i4 > i2) {
            LIZIZ();
        }
        this.LLILZ.putInt(this.LLILZLL + 48, i3);
        C1BAF c1baf = this.LLJILJIL;
        c1baf.LIZLLL = this.LLILZLL + 48 + 4;
        C1790300wgm.LIZ(c1781140wS0, c1baf);
        this.LLILZLL += i4;
        this.LLIZLLLIL++;
        this.LLJ++;
        LIZLLL();
        this.LLILZIL.unlock();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1BAI] */
    public C1BAE(int i, int i2, C0VSJ c0vsj) throws IOException {
        int i3;
        int i4;
        this.LL = c0vsj;
        this.LLILLJJLI = i;
        int i5 = i2 * 1024;
        this.LLILLL = i5;
        int i6 = i5 + 48;
        File parentFile = c0vsj.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(c0vsj, "rw");
        long j = i6;
        try {
            randomAccessFile.setLength(j);
            MappedByteBuffer map = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, j);
            this.LLILZ = map;
            randomAccessFile.close();
            this.LLJILJIL = new C1BAF(map);
            if (map.getInt(0) == 1380275009 && map.getInt(4) == 2 && map.getInt(20) == i && map.getInt(24) == i5) {
                this.LLILZLL = map.getInt(8);
                this.LLIZ = map.getInt(12);
                this.LLIZLLLIL = map.getInt(16);
                this.LLJ = ((long) map.getInt(28)) & 4294967295L;
                int i7 = this.LLILZLL;
                if (i7 >= 0 && i7 < i5 && (i3 = this.LLIZ) >= 0 && i3 < i5 && (i4 = this.LLIZLLLIL) >= 0 && i4 <= i) {
                    return;
                }
                LJFF();
                return;
            }
            LJFF();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            randomAccessFile.close();
            throw th;
        }
    }
}
