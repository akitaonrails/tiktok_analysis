package X;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0WKm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821500WKm {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, String str2, String str3) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(new Regex("\\s+").replace(u.LJJIFFI(u.LJJIFFI(str, "-----BEGIN PUBLIC KEY-----", "", false), "-----END PUBLIC KEY-----", "", false), ""), 0)));
        byte[] bArrDecode = Base64.decode(str3, 0);
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initVerify(publicKeyGeneratePublic);
        signature.update(str2.getBytes(Charset.forName("UTF-8")));
        return signature.verify(bArrDecode);
    }
}
