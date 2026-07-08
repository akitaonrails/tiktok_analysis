package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: X.0VY0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VY0 {
    public static void LIZ(String str) {
        System.currentTimeMillis();
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            return;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(c0vsj, "r");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                map.load();
                map.isLoaded();
                map.capacity();
                randomAccessFile.close();
            } finally {
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
