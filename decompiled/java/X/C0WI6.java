package X;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0WI6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WI6 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArrDigest.length * 2];
        int length = bArrDigest.length;
        for (int i = 0; i < length; i++) {
            int i2 = bArrDigest[i] & 255;
            int i3 = i * 2;
            cArr2[i3] = cArr[i2 >>> 4];
            cArr2[i3 + 1] = cArr[i2 & 15];
        }
        return new String(cArr2);
    }

    public static String LIZ(PackageManager packageManager, String str) {
        ArrayList arrayList;
        if (str == null) {
            return "";
        }
        int i = 0;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                SigningInfo signingInfo = C786410Ut5.Y3(packageManager, str, 134217728).signingInfo;
                if (signingInfo == null) {
                    return "";
                }
                if (signingInfo.hasMultipleSigners()) {
                    Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                    arrayList = new ArrayList(apkContentsSigners.length);
                    int length = apkContentsSigners.length;
                    while (i < length) {
                        arrayList.add(LIZIZ(apkContentsSigners[i].toByteArray()));
                        i++;
                    }
                } else {
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    arrayList = new ArrayList(signingCertificateHistory.length);
                    int length2 = signingCertificateHistory.length;
                    while (i < length2) {
                        arrayList.add(LIZIZ(signingCertificateHistory[i].toByteArray()));
                        i++;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return "";
            }
        } else {
            try {
                Signature[] signatureArr = C786410Ut5.Y3(packageManager, str, 64).signatures;
                if (signatureArr == null) {
                    return "";
                }
                arrayList = new ArrayList(signatureArr.length);
                int length3 = signatureArr.length;
                while (i < length3) {
                    arrayList.add(LIZIZ(signatureArr[i].toByteArray()));
                    i++;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return "";
            }
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }
}
