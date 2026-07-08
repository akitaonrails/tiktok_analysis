package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.08IH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08IH {
    public static final Charset LIZ = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static void LIZIZ(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    LIZIZ(file2);
                }
                if (!file2.delete()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("failed to delete file: ");
                    sbLIZ.append(file2);
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("not a readable directory: ");
        sbLIZ2.append(file);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
