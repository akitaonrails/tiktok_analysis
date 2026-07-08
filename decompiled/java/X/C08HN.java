package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08HN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08HN {
    public static String LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (bytes[i] ^ 5);
            }
            return C08HM.LJFF(bytes, bytes.length);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }
}
