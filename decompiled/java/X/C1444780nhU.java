package X;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0nhU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444780nhU {
    public static void LIZ() {
        LIZLLL("clear");
        Application application = C0CHQ.LIZ;
        LIZJ(application);
        new C815520Vyw(application).LIZIZ(10001, null);
        Iterator it2 = ((ArrayList) PublishService.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            new C815520Vyw(application).LIZIZ(((Number) it2.next()).intValue(), null);
        }
        ((ArrayList) PublishService.LLILLJJLI).clear();
    }

    public static void LIZIZ() {
        LIZLLL("clearProgress");
        Application application = C0CHQ.LIZ;
        LIZJ(application);
        new C815520Vyw(application).LIZIZ(10001, null);
    }

    public static void LIZJ(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) C786410Ut5.H2(context, "notification")).createNotificationChannel(new NotificationChannel("com.ss.android.ugc.trill.publish", context.getString(2131857961), 2));
        }
    }

    public static void LIZLLL(String str) {
        C1433730nPf c1433730nPf = C1433730nPf.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishForegroundService ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1433730nPf.getClass();
        C1433730nPf.LJIJJLI(strLIZIZ);
    }
}
