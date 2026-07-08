package X;

import Y.AObjectS388S0100000_13;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauthapi.push.appdiff.ISystemPushAppDiffService;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0VrL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810810VrL {
    public static final C813830VwD LIZ = new HashMap<String, Integer>() { // from class: X.0VwD
        {
            ISystemPushAppDiffService.LIZ.getClass();
            C813850VwF.LIZ().LIZ(new AObjectS388S0100000_13(this, 2));
        }
    };

    public static String LIZIZ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("generateChannelIdBySoundType channel id:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (i == 0) {
            i = C810830VrN.LIZIZ(null);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_associated_");
        sbLIZ2.append(i);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LIZJ(Context context, C814730Vxf c814730Vxf) {
        try {
            NotificationManager notificationManager = (NotificationManager) C786410Ut5.H2(context, "notification");
            LIZ(context, notificationManager, LIZ, c814730Vxf);
            int i = Build.VERSION.SDK_INT;
            if (i >= 26 && notificationManager != null && notificationManager.getNotificationChannel("com.ss.android.ugc.aweme.server") != null) {
                notificationManager.deleteNotificationChannel("com.ss.android.ugc.aweme.server");
            }
            if (i >= 26 && notificationManager != null && notificationManager.getNotificationChannel("com.ss.android.ugc.aweme.server.important.low") != null) {
                notificationManager.deleteNotificationChannel("com.ss.android.ugc.aweme.server.important.low");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r14, android.app.NotificationManager r15, X.C813830VwD r16, X.C814730Vxf r17) {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C810810VrL.LIZ(android.content.Context, android.app.NotificationManager, X.0VwD, X.0Vxf):void");
    }
}
