package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: X.0X9H, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X9H {
    public final File LIZ;
    public String LIZIZ;
    public String LIZJ;

    public C0X9H(File file) {
        this.LIZ = file;
    }

    public final File LIZ(File file, String str) throws IOException {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("res");
        sbLIZ.append(File.separator);
        sbLIZ.append(str);
        C0VSJ c0vsj = new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            if (c0vsj.exists()) {
                try {
                    C0X9F.LIZIZ(c0vsj);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        message = C08IP.LIZJ(c0vsj);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        message = th2.getMessage();
                    }
                    C1551780qU4.LJIIIIZZ(C786410Ut5.j4("last modify time: %d", new Object[]{Long.valueOf(c0vsj.lastModified())}), 11, C786410Ut5.j4("path:%s, length: %d, md5:%s", new Object[]{str, Long.valueOf(c0vsj.length()), message}), this.LIZIZ, 1101, this.LIZJ);
                    C0X9F.LJFF(file);
                    throw new IOException("file was broken");
                }
            }
            return c0vsj.getCanonicalFile();
        }
        throw new IOException("file not found");
    }
}
