package androidx.work.impl.utils;

import X.C08NT;
import X.C0VHM;
import X.C0VI1;
import X.C0VI8;
import X.C0VZ5;
import X.C2179971ATj;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C788530UwV;
import X.C795390VIb;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class ForceStopRunnable implements Runnable {
    public static final long LLILZ;
    public final Context LL;
    public final C0VI1 LLILLJJLI;
    public int LLILLL = 0;

    /* JADX INFO: loaded from: classes4.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        static {
            C0VI8.LIZIZ("ForceStopRunnable$Rcvr");
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if ("ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                    C0VI8.LIZ().getClass();
                    ForceStopRunnable.LIZLLL(context);
                    return;
                }
                return;
            }
            C2408409cA.LIZ();
            if (!"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            C0VI8.LIZ().getClass();
            ForceStopRunnable.LIZLLL(context);
        }
    }

    static {
        C0VI8.LIZIZ("ForceStopRunnable");
        LLILZ = TimeUnit.DAYS.toMillis(3650L);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.LIZIZ():void");
    }

    public final boolean LIZJ() {
        C0VHM c0vhm = this.LLILLJJLI.LIZIZ;
        c0vhm.getClass();
        if (TextUtils.isEmpty(null)) {
            C0VI8.LIZ().getClass();
            return true;
        }
        boolean zLIZ = C08NT.LIZ(this.LL, c0vhm);
        C0VI8 c0vi8LIZ = C0VI8.LIZ();
        C786410Ut5.j4("Is default app process = %s", new Object[]{Boolean.valueOf(zLIZ)});
        c0vi8LIZ.getClass();
        return zLIZ;
    }

    public final void LIZ() {
        try {
            if (!LIZJ()) {
                this.LLILLJJLI.LJIIIZ();
                return;
            }
            while (true) {
                C795390VIb.LIZ(this.LL);
                C0VI8.LIZ().getClass();
                try {
                    LIZIZ();
                    this.LLILLJJLI.LJIIIZ();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i = this.LLILLL + 1;
                    this.LLILLL = i;
                    if (i >= 3) {
                        C0VI8.LIZ().getClass();
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        this.LLILLJJLI.LIZIZ.getClass();
                        throw illegalStateException;
                    }
                    C0VI8 c0vi8LIZ = C0VI8.LIZ();
                    C786410Ut5.j4("Retrying after %s", new Object[]{Long.valueOf(((long) i) * 300)});
                    c0vi8LIZ.getClass();
                    try {
                        Thread.sleep(((long) this.LLILLL) * 300);
                    } catch (InterruptedException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LJIIIZ();
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static void LIZLLL(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) C786410Ut5.H2(context, "alarm");
        if (C0VZ5.LIZ()) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + LLILZ;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    public ForceStopRunnable(Context context, C0VI1 c0vi1) {
        this.LL = C786410Ut5.N3(context);
        this.LLILLJJLI = c0vi1;
    }
}
