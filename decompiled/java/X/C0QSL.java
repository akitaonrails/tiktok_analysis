package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: X.0QSL, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QSL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str) {
        AlarmManager alarmManager;
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setClassName(context, str);
        intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, str.hashCode(), intent, 603979776);
        if (broadcast != null) {
            Object objH2 = C786410Ut5.H2(context, "alarm");
            if ((objH2 instanceof AlarmManager) && (alarmManager = (AlarmManager) objH2) != null) {
                alarmManager.cancel(broadcast);
            }
        }
    }
}
