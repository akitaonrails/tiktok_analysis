package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795110VGz {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C0VI8.LIZIZ("Alarms");
    }

    public static void LIZ(Context context, int i, String str) {
        AlarmManager alarmManager = (AlarmManager) C786410Ut5.H2(context, "alarm");
        PendingIntent service = PendingIntent.getService(context, i, C795030VGr.LIZIZ(context, str), 603979776);
        if (service != null && alarmManager != null) {
            C0VI8 c0vi8LIZ = C0VI8.LIZ();
            C786410Ut5.j4("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)});
            c0vi8LIZ.getClass();
            alarmManager.cancel(service);
        }
    }

    public static void LIZIZ(Context context, C0VI1 c0vi1, String str, long j) {
        int iLIZ;
        WorkDatabase workDatabase = c0vi1.LIZJ;
        C0VI9 c0vi9 = (C0VI9) workDatabase.LIZJ();
        C0VH0 c0vh0LIZ = c0vi9.LIZ(str);
        if (c0vh0LIZ != null) {
            LIZ(context, c0vh0LIZ.LIZIZ, str);
            int i = c0vh0LIZ.LIZIZ;
            AlarmManager alarmManager = (AlarmManager) C786410Ut5.H2(context, "alarm");
            PendingIntent service = PendingIntent.getService(context, i, C795030VGr.LIZIZ(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        C0VI3 c0vi3 = new C0VI3(workDatabase);
        synchronized (C0VI3.class) {
            try {
                iLIZ = c0vi3.LIZ("next_alarm_manager_id");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c0vi9.LIZIZ(new C0VH0(str, iLIZ));
        AlarmManager alarmManager2 = (AlarmManager) C786410Ut5.H2(context, "alarm");
        PendingIntent service2 = PendingIntent.getService(context, iLIZ, C795030VGr.LIZIZ(context, str), 201326592);
        if (alarmManager2 == null) {
            return;
        }
        alarmManager2.setExact(0, j, service2);
    }
}
