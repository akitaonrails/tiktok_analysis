package X;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.08Gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2088308Gb {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        String strEncodeToString = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            byte[] bArrLIZ = EncryptorUtil.LIZ(bytes.length, bytes);
            if (bArrLIZ == null) {
                return null;
            }
            strEncodeToString = Base64.encodeToString(bArrLIZ, 0);
            return strEncodeToString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return strEncodeToString;
        }
    }
}
