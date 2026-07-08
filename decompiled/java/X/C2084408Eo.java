package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: renamed from: X.08Eo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2084408Eo {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(File file) {
        if (file.exists() && file.isFile()) {
            return LIZIZ(new C0VSP(file));
        }
        return null;
    }

    public static String LIZIZ(InputStream inputStream) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[8192];
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            th = null;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(inputStream, th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
            C2107108Nh.LIZ(inputStream, null);
            String strLIZIZ = "";
            for (byte b : messageDigest.digest()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(C786410Ut5.j4("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            return strLIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
