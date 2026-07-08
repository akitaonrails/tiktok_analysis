package X;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: renamed from: X.0WKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821490WKl {
    public static boolean LIZ(String str, String str2, String str3) {
        Signature signature;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return false;
        }
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
            try {
                byte[] bArrDecode = Base64.decode(str3, 0);
                try {
                    signature = Signature.getInstance("SHA1withRSA");
                    signature.initVerify(publicKeyGeneratePublic);
                    signature.update(str2.getBytes());
                } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (!signature.verify(bArrDecode)) {
                    return false;
                }
                return true;
            } catch (IllegalArgumentException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw new RuntimeException(th);
        }
    }
}
