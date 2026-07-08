package X;

import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* JADX INFO: renamed from: X.0WI7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WI7 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("34df0e7a9f1cf1892e45c056b4973cd81ccf148a4050d11aea4ac5a65f900a42", "c8a2e9bccf597c2fb6dc66bee293fc13f2fc47ec77bc6b2b0d52c11f51192ab8", "e9eb8899c638ffd21b16a6a24ba8b19b4f60c9af686bab9c3bd436e807be5ff8");
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("com.example.mediasearch", "com.sec.android.app.launcher");

    public static String LIZ(Signature signature) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(signature.toByteArray());
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
}
