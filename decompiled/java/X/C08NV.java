package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: X.08NV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08NV {
    public final String LIZ;
    public RandomAccessFile LIZIZ;
    public final byte[] LIZJ = new byte[96];

    public final synchronized C2097208Jm LIZ() {
        try {
            if (this.LIZIZ == null) {
                this.LIZIZ = new RandomAccessFile(this.LIZ, "r");
            }
            this.LIZIZ.seek(0L);
            int i = this.LIZIZ.read(this.LIZJ);
            if (i > 0) {
                return C2097108Jl.LIZIZ(new String(this.LIZJ, 0, i, StandardCharsets.US_ASCII));
            }
            RandomAccessFile randomAccessFile = this.LIZIZ;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                this.LIZIZ = null;
            }
            return null;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            RandomAccessFile randomAccessFile2 = this.LIZIZ;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
                this.LIZIZ = null;
            }
            return null;
        }
    }

    public C08NV(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/proc/self/task/");
        sbLIZ.append(i);
        sbLIZ.append("/schedstat");
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
    }
}
