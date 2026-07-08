package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08gC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2178608gC {
    public static final HashSet<String> LIZ = C093Y.LIZJ("8a3c4b262d721acd49a4bf97d5213199c86fa2b9", "cc2751449a350f668590264ed76692694a80308a", "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc", "df6b721c8b4d3b6eb44c861d4415007e5a35fc95", "9b8f518b086098de3d77736f9458a3d2f6f95a37", "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3", "c56fb7d591ba6704df047fd98f535372fea00211");

    public static final boolean LIZ(Context context, String str) {
        String string;
        String str2 = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        if (u.LJJIIJZLJL(str2, "generic", false) && (i & 2) != 0) {
            return true;
        }
        try {
            Signature[] signatureArr = C786410Ut5.Y3(context.getPackageManager(), str, 64).signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                return false;
            }
            for (Signature signature : signatureArr) {
                HashSet<String> hashSet = LIZ;
                byte[] byteArray = signature.toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(byteArray);
                    byte[] bArrDigest = messageDigest.digest();
                    StringBuilder sb = new StringBuilder();
                    int length = bArrDigest.length;
                    int i2 = 0;
                    while (i2 < length) {
                        byte b = bArrDigest[i2];
                        i2++;
                        sb.append(Integer.toHexString((b >> 4) & 15));
                        sb.append(Integer.toHexString((b >> 0) & 15));
                    }
                    string = sb.toString();
                } catch (NoSuchAlgorithmException e) {
                    TryCatchGuardChecker.doCheck(e);
                    string = null;
                }
                if (!C13LP.LJJJJ(string, hashSet)) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        }
    }
}
