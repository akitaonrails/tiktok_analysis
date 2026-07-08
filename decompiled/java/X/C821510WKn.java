package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* JADX INFO: renamed from: X.0WKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821510WKn {
    public static C821520WKo LIZ(String str, String str2) {
        String strReplaceAll = str.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").replaceAll("\n", "").replaceAll("\t", "");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("entryWithRsaPublicKey:");
        sbLIZ.append(strReplaceAll);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(strReplaceAll.getBytes(), 0)));
            OAEPParameterSpec oAEPParameterSpec = new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), PSource.PSpecified.DEFAULT);
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(1, publicKeyGeneratePublic, oAEPParameterSpec);
            return new C821520WKo(true, Base64.encodeToString(cipher.doFinal(str2.getBytes()), 2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("entryWithRsaPublicKey exception: ");
            sbLIZ2.append(th.getLocalizedMessage());
            return new C821520WKo(false, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
