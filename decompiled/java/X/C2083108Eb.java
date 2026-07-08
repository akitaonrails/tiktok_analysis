package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinUploadAuthKeyResponse;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.08Eb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2083108Eb {
    public static final ConcurrentHashMap<C1899107cD, C1899207cE> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<C1899107cD, Boolean> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(String str, BulletinUploadAuthKeyResponse bulletinUploadAuthKeyResponse) {
        Long lValueOf;
        if (str.length() == 0) {
            return;
        }
        long j = bulletinUploadAuthKeyResponse.expiredTime - bulletinUploadAuthKeyResponse.currentTime;
        if (j <= 0) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(j * 1000);
            if (lValueOf != null && lValueOf.longValue() >= Mp4ScreenVideoLoadTimeout.CONTROL) {
                C1899107cD c1899107cD = new C1899107cD(str);
                LIZ.put(c1899107cD, new C1899207cE(c1899107cD, bulletinUploadAuthKeyResponse, lValueOf.longValue(), SystemClock.elapsedRealtime()));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AuthKeyCache: put uid=");
                sbLIZ.append(str);
                sbLIZ.append(" type=");
                sbLIZ.append(2);
                sbLIZ.append(" host=");
                sbLIZ.append(bulletinUploadAuthKeyResponse.uploadHost);
                sbLIZ.append(" lifetimeMs=");
                sbLIZ.append(lValueOf);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AuthKeyCache: skip put, unusable lifetimeMs=");
        sbLIZ2.append(lValueOf);
        sbLIZ2.append(" (server expiredTime=");
        sbLIZ2.append(bulletinUploadAuthKeyResponse.expiredTime);
        sbLIZ2.append(", currentTime=");
        sbLIZ2.append(bulletinUploadAuthKeyResponse.currentTime);
        sbLIZ2.append(')');
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
