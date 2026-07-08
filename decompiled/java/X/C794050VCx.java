package X;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794050VCx {
    public static String LIZ(String str, byte[] bArr) {
        String str2 = "";
        try {
            byte[] bArrDecode = Base64.decode(bArr, 0);
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "AES");
                Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
                cipher.init(2, secretKeySpec);
                String str3 = new String(cipher.doFinal(bArrDecode));
                try {
                    int iIndexOf = str3.indexOf(e3.c);
                    if (iIndexOf != -1) {
                        str3 = str3.substring(0, iIndexOf);
                        return str3;
                    }
                    return str3;
                } catch (Exception e) {
                    e = e;
                    str2 = str3;
                    TryCatchGuardChecker.doCheck(e);
                    return str2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            return "";
        }
    }
}
