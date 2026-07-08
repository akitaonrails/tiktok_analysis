package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0W0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816280W0k {
    public static final AtomicReference<byte[]> LIZ = new AtomicReference<>(new byte[8192]);

    static {
        new AtomicInteger(0);
        new AtomicInteger(0);
    }

    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZIZ(File file) {
        if (file.isFile()) {
            file.delete();
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    LIZIZ(file2);
                }
                file.delete();
                return;
            }
            file.delete();
        }
    }

    public static void LIZJ(File file) {
        if (file == null || file.isFile() || file.isDirectory()) {
            return;
        }
        int i = 0;
        do {
            file.mkdirs();
            if (file.isDirectory()) {
                return;
            }
            try {
                Thread.sleep(1L);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            i++;
        } while (i < 5);
        file.isDirectory();
    }
}
