package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: X.08PB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08PB {
    public static void LIZ(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C2418109dj.LIZLLL().LJFF("Failed to close resource");
        }
    }

    public static boolean LIZIZ(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean zCanWrite = file.canWrite();
        boolean zCanRead = file.canRead();
        if (!zCanWrite) {
            zCanWrite = file.setWritable(true);
        }
        if ((zCanRead || file.setReadable(true)) && zCanWrite) {
            return true;
        }
        return false;
    }
}
