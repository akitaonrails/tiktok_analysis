package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;

/* JADX INFO: renamed from: X.0WKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821530WKp {
    public static PublicKey LIZJ(String str) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").replace("-----BEGIN RSA PUBLIC KEY-----", "").replace("-----END RSA PUBLIC KEY-----", "").replace("\n", ""), 0)));
    }

    public static String LIZ(String str, String str2) {
        String strEncodeToString = "";
        try {
            try {
                strEncodeToString = Base64.encodeToString(LIZIZ(str2.getBytes(), (RSAPublicKey) LIZJ(str)), 2);
                return strEncodeToString;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("encryptByPublicKey:2 Exception = ");
                sbLIZ.append(e);
                C1328570kg3.LIZIZ("EncryptUtil", C2188811AlT.LIZIZ(sbLIZ));
                return strEncodeToString;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("encryptByPublicKey:getPublicKey exception = ");
            sbLIZ2.append(e2);
            C1328570kg3.LIZIZ("EncryptUtil", C2188811AlT.LIZIZ(sbLIZ2));
            return "";
        }
    }

    public static byte[] LIZIZ(byte[] bArr, RSAPublicKey rSAPublicKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, ShortBufferException {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        cipher.init(1, rSAPublicKey);
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr2 = new byte[outputSize];
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("encryptByPublicKey: data.len = ");
        sbLIZ.append(bArr.length);
        sbLIZ.append(" outLen = ");
        sbLIZ.append(outputSize);
        C1328570kg3.LJFF("EncryptUtil", C2188811AlT.LIZIZ(sbLIZ));
        int length = bArr.length / LSPassThroughRecordSizeConfig.DEFAULT;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int iUpdate = cipher.update(bArr, i, LSPassThroughRecordSizeConfig.DEFAULT, bArr2, i2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("encryptByPublicKey: outLen = ");
            sbLIZ2.append(iUpdate);
            sbLIZ2.append(" inLen = ");
            sbLIZ2.append(LSPassThroughRecordSizeConfig.DEFAULT);
            C1328570kg3.LJFF("EncryptUtil", C2188811AlT.LIZIZ(sbLIZ2));
            i += LSPassThroughRecordSizeConfig.DEFAULT;
            i2 += iUpdate;
        }
        if (i <= bArr.length) {
            cipher.update(bArr, i, bArr.length - i, bArr2, i2);
        }
        return cipher.doFinal();
    }
}
