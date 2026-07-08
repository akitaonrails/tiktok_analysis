package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.08IP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08IP {
    public static final char[] LIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String LIZIZ(InputStream inputStream) {
        byte[] bArr = new byte[16384];
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        messageDigest.update(bArr, 0, i);
                    } else {
                        byte[] bArrDigest = messageDigest.digest();
                        String strLJFF = LJFF(bArrDigest, bArrDigest.length);
                        C08IQ.LIZ(inputStream);
                        return strLJFF;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getHash error: ");
                sbLIZ.append(e.getMessage());
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C08IQ.LIZ(inputStream);
            throw th;
        }
    }

    public static String LIZJ(C0VSJ c0vsj) throws Throwable {
        C0VSP c0vsp;
        C0VSP c0vsp2 = null;
        try {
            c0vsp = new C0VSP(c0vsj);
        } catch (Throwable th) {
            th = th;
        }
        try {
            String strLIZIZ = LIZIZ(c0vsp);
            C08IQ.LIZ(c0vsp);
            return strLIZIZ;
        } catch (Throwable th2) {
            th = th2;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(th);
            C08IQ.LIZ(c0vsp2);
            throw th;
        }
    }

    public static String LIZLLL(List<String> list) throws NoSuchAlgorithmException {
        ArrayList<String> arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
        }
        String strLJ = LJ(sb.toString());
        C1553130qWF.LIZ("gecko-debug-tag", "accessKey to MD5", sb.toString(), strLJ);
        return strLJ;
    }

    public static String LJ(String str) throws NoSuchAlgorithmException {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(str.getBytes());
        byte[] bArrDigest = messageDigest.digest();
        return LJFF(bArrDigest, bArrDigest.length);
    }

    public static void LIZ(C1550880qSc c1550880qSc, String str) {
        if (str != null) {
            String strLIZIZ = LIZIZ(c1550880qSc);
            if (strLIZIZ.equals(str)) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("md5 check failed file: local md5:");
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(" expect md5:");
            sbLIZ.append(str);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new RuntimeException("md5 check failed: md5 == null");
    }

    public static String LJFF(byte[] bArr, int i) {
        if (i <= bArr.length) {
            int i2 = i * 2;
            char[] cArr = new char[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArr[i4] & 255;
                int i6 = i3 + 1;
                char[] cArr2 = LIZ;
                cArr[i3] = cArr2[i5 >> 4];
                i3 = i6 + 1;
                cArr[i6] = cArr2[i5 & 15];
            }
            return new String(cArr, 0, i2);
        }
        throw new IndexOutOfBoundsException();
    }
}
