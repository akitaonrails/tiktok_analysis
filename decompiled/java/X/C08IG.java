package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.08IG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08IG {
    public static final Charset LIZ = Charset.forName("US-ASCII");
    public static final char[] LIZIZ;
    public static final char[] LIZJ;

    static {
        Charset.forName("UTF-8");
        LIZIZ = new char[64];
        LIZJ = "0123456789abcdef".toCharArray();
    }

    public static void LIZ(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    LIZ(file2);
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

    public static String LIZIZ(byte[] bArr) {
        String str;
        char[] cArr = LIZIZ;
        synchronized (cArr) {
            for (int i = 0; i < bArr.length; i++) {
                try {
                    int i2 = bArr[i] & 255;
                    int i3 = i * 2;
                    char[] cArr2 = LIZJ;
                    cArr[i3] = cArr2[i2 >>> 4];
                    cArr[i3 + 1] = cArr2[i2 & 15];
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}
