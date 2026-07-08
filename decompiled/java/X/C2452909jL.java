package X;

import com.ss.android.ugc.aweme.legoImp.task.crypto.CryptoSdkConfigModel;
import com.ss.android.ugc.aweme.legoImp.task.crypto.KeyVersion;
import java.util.Map;

/* JADX INFO: renamed from: X.09jL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2452909jL {
    public static final CryptoSdkConfigModel LIZ = new CryptoSdkConfigModel(0, false, false, 0, 0, 0, false, false, null, null, 1023, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C2453209jO());

    public static CryptoSdkConfigModel LIZ() {
        return (CryptoSdkConfigModel) LIZIZ.getValue();
    }

    public static String LIZIZ(String str) {
        String str2;
        Map<String, KeyVersion> map = LIZ().signKey;
        if (!C13LQ.LJLIIL(new String[]{"us", "eu", "row"}).contains(str)) {
            str = null;
        }
        KeyVersion keyVersion = map.get(str);
        if (keyVersion == null || (str2 = keyVersion.key) == null) {
            return "";
        }
        return str2;
    }

    public static int LIZJ(String str) {
        Map<String, KeyVersion> map = LIZ().signKey;
        if (!C13LQ.LJLIIL(new String[]{"us", "eu", "row"}).contains(str)) {
            str = null;
        }
        KeyVersion keyVersion = map.get(str);
        if (keyVersion != null) {
            return keyVersion.version;
        }
        return 0;
    }
}
