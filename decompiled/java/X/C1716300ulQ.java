package X;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0ulQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716300ulQ {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ() {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1716300ulQ.LIZIZ():java.util.Map");
    }

    public static String LIZ() {
        String deviceId = C1717770unn.LIZJ().getDeviceId();
        return (deviceId == null || deviceId.length() == 0) ? "-1" : deviceId;
    }

    public static boolean LIZJ(String str, String str2) {
        boolean zLJFF = false;
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            return false;
        }
        if (TextUtils.isEmpty(str) || !(zLJFF = C2162308dZ.LJFF(C1717770unn.LIZJ().getApplicationContext(), str))) {
            if (!TextUtils.isEmpty(str2)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(UriProtector.parse(str2));
                return C2162308dZ.LJ(C1717770unn.LIZJ().getApplicationContext(), intent);
            }
            return zLJFF;
        }
        return zLJFF;
    }
}
