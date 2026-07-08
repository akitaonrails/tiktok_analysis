package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: X.0VAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793460VAq {
    public static C793730VBr LIZ(C793730VBr c793730VBr, Map<String, String> map) throws IOException {
        int i = c793730VBr.LIZIZ;
        if (i > 128) {
            AbstractC793700VBo abstractC793700VBoLIZIZ = AbstractC793700VBo.LIZIZ(C0VC5.LIZJ());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(abstractC793700VBoLIZIZ);
            try {
                try {
                    gZIPOutputStream.write(c793730VBr.LIZ, 0, i);
                    gZIPOutputStream.close();
                    C793730VBr c793730VBrLIZ = abstractC793700VBoLIZIZ.LIZ();
                    ((HashMap) map).put("Content-Encoding", "gzip");
                    return c793730VBrLIZ;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                gZIPOutputStream.close();
                throw th;
            }
        }
        return c793730VBr;
    }

    public static byte[] LIZIZ(byte[] bArr, Map<String, String> map) throws IOException {
        if (bArr.length > 128) {
            AbstractC793700VBo abstractC793700VBoLIZIZ = AbstractC793700VBo.LIZIZ(C0VC5.LIZJ());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(abstractC793700VBoLIZIZ);
            try {
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.close();
                    byte[] bArrLIZLLL = abstractC793700VBoLIZIZ.LIZLLL();
                    ((HashMap) map).put("Content-Encoding", "gzip");
                    return bArrLIZLLL;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                gZIPOutputStream.close();
                throw th;
            }
        }
        return bArr;
    }
}
