package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: X.0WL2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WL2 {
    public static String LIZ(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStreamLJJI = C2471909mP.LJJI(0, str);
            if (fileInputStreamLJJI == null) {
                return null;
            }
            byte[] bArr = new byte[8192];
            int i = 0;
            while (true) {
                try {
                    try {
                        int i2 = fileInputStreamLJJI.read(bArr);
                        if (i2 <= 0) {
                            break;
                        }
                        i += i2;
                        int i3 = i - 524288;
                        if (i3 < 0) {
                            messageDigest.update(bArr, 0, i2);
                        } else {
                            messageDigest.update(bArr, 0, i2 - i3);
                            break;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            fileInputStreamLJJI.close();
                            throw th;
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(C580200MpG.LIZ);
                            sbLIZ.append(" Exception on closing MD5 input stream");
                            C201955140j.LJI(C2188811AlT.LIZIZ(sbLIZ), e);
                            throw th;
                        }
                    }
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(C580200MpG.LIZ);
                    sbLIZ2.append(" Unable to process file for MD5");
                    C201955140j.LJI(C2188811AlT.LIZIZ(sbLIZ2), e2);
                    try {
                        fileInputStreamLJJI.close();
                        return null;
                    } catch (IOException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(C580200MpG.LIZ);
                        sbLIZ3.append(" Exception on closing MD5 input stream");
                        C201955140j.LJI(C2188811AlT.LIZIZ(sbLIZ3), e3);
                        return null;
                    }
                }
            }
            String strReplace = C786410Ut5.j4("%32s", new Object[]{new BigInteger(1, messageDigest.digest()).toString(16)}).replace(' ', '0');
            try {
                fileInputStreamLJJI.close();
                return strReplace;
            } catch (IOException e4) {
                TryCatchGuardChecker.doCheck(e4);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(C580200MpG.LIZ);
                sbLIZ4.append(" Exception on closing MD5 input stream");
                C201955140j.LJI(C2188811AlT.LIZIZ(sbLIZ4), e4);
                return strReplace;
            }
        } catch (NoSuchAlgorithmException e5) {
            TryCatchGuardChecker.doCheck(e5);
            return null;
        }
    }
}
