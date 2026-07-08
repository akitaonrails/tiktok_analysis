package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793660VBk {
    public MappedByteBuffer LIZ;
    public long LIZIZ;

    public final long LIZ() {
        if (this.LIZ == null) {
            try {
                String strLJ = C792420V6q.LJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJ.replace(e3.d, "_").replace(":", "-"));
                sbLIZ.append("_seq_num.txt");
                C0VSJ c0vsj = new C0VSJ(C793630VBh.LIZLLL(), C2188811AlT.LIZIZ(sbLIZ));
                boolean zExists = c0vsj.exists();
                if (!zExists) {
                    c0vsj.createNewFile();
                }
                MappedByteBuffer map = new RandomAccessFile(c0vsj, "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, 8L);
                this.LIZ = map;
                if (!zExists) {
                    map.putLong(0, 0L);
                    return 0L;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C792910V8n.LIZJ("APM-Slardar", "prepare seq_number fail.", th);
            }
        }
        MappedByteBuffer mappedByteBuffer = this.LIZ;
        if (mappedByteBuffer == null) {
            long j = this.LIZIZ;
            this.LIZIZ = 1 + j;
            return j;
        }
        long j2 = mappedByteBuffer.getLong(0) + 1;
        this.LIZIZ = j2;
        this.LIZ.putLong(0, j2);
        return this.LIZIZ;
    }
}
