package X;

import android.content.Context;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ss.android.deviceregister.DeviceRegisterManager;

/* JADX INFO: renamed from: X.0W9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818670W9p {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.util.Pair<java.lang.String, java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public static Pair<String, Boolean> LIZ(Context context) {
        AdvertisingIdClient.Info advertisingIdInfo;
        C0XE7 bpeaApiCallback = DeviceRegisterManager.getBpeaApiCallback();
        if (bpeaApiCallback != null) {
            return bpeaApiCallback.LIZJ();
        }
        Object id = 0;
        id = 0;
        boolean z = false;
        try {
            if (C10EU.LJIILIIL() && C20123813oa.LIZ()) {
                advertisingIdInfo = new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
            } else {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            }
            if (advertisingIdInfo != null) {
                z = advertisingIdInfo.LIZIZ;
                id = advertisingIdInfo.getId();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!(th instanceof ClassNotFoundException) && !(th instanceof NoClassDefFoundError)) {
                return id;
            }
        }
        return new Pair<>(id, Boolean.valueOf(z));
    }
}
