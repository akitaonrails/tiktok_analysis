package X;

import com.bytedance.keva.Keva;
import com.ss.android.deviceregister.DeviceRegisterManager;

/* JADX INFO: renamed from: X.0XfO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C854360XfO {
    public static final Keva LIZ = Keva.getRepo("email_pop_up_keva");
    public static final String LIZIZ = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();

    public static long LIZ(Integer num) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("time");
        sbLIZ.append(LIZIZ);
        sbLIZ.append(num);
        return LIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public static int LIZIZ(Integer num) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("times");
        sbLIZ.append(LIZIZ);
        sbLIZ.append(num);
        return LIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static void LIZJ(Integer num) {
        String str = LIZIZ;
        if (str == null) {
            return;
        }
        int iLIZIZ = LIZIZ(num);
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("time");
        sbLIZ.append(str);
        sbLIZ.append(num);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("times");
        sbLIZ2.append(str);
        sbLIZ2.append(num);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        Keva keva = LIZ;
        keva.storeLong(strLIZIZ, jCurrentTimeMillis);
        keva.storeInt(strLIZIZ2, iLIZIZ + 1);
    }

    public static void LIZLLL(boolean z) {
        String str = LIZIZ;
        if (str == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("feed");
        sbLIZ.append(str);
        LIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), z);
    }
}
