package X;

import com.ss.android.ugc.aweme.creation.config.DMImageAuthConfig;
import com.ss.android.ugc.aweme.creation.config.DMMediaAuthToken;

/* JADX INFO: renamed from: X.0YVJ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YVJ {
    public static final C0YRX LIZ(C1435240nS6 c1435240nS6) {
        DMImageAuthConfig dMImageAuthConfig;
        DMMediaAuthToken dMMediaAuthToken;
        String str;
        Integer num;
        C0YVK c0yvk = c1435240nS6.LIZJ;
        if (c0yvk != null && (dMImageAuthConfig = c0yvk.LIZJ) != null && (dMMediaAuthToken = dMImageAuthConfig.authToken) != null) {
            C874210YRf c874210YRf = new C874210YRf(dMMediaAuthToken.accessKeyId, dMMediaAuthToken.sessionToken, dMMediaAuthToken.secretAccessKey, dMMediaAuthToken.expireTime, dMMediaAuthToken.currentTime);
            String str2 = dMImageAuthConfig.service_id;
            if (str2 != null && (str = dMImageAuthConfig.host) != null) {
                C0YQG c0yqg = new C0YQG(str2, str, c874210YRf);
                String str3 = c1435240nS6.LIZIZ;
                String str4 = c0yvk.LIZ;
                if (str4 != null && (num = c0yvk.LIZIZ) != null) {
                    int iIntValue = num.intValue();
                    Integer num2 = c1435240nS6.LJFF;
                    if (num2 != null) {
                        return new C0YRX(str3, str4, iIntValue, c0yqg, num2.intValue());
                    }
                }
            }
        }
        return null;
    }
}
