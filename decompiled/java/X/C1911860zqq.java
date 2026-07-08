package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911860zqq {
    public static final /* synthetic */ int LJFF = 0;
    public final Keva LIZ = Keva.getRepo("fission_sp");
    public final C1911870zqr LIZIZ = new C1911870zqr();
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public int LJ = -1;

    public static long LIZ() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static String LIZIZ() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return String.valueOf(calendar.getTimeInMillis());
    }

    public final int LIZLLL() {
        if (Intrinsics.LJFF(LIZIZ(), this.LIZ.getString("current_day", ""))) {
            return this.LIZ.getInt("today_showed_time", 0);
        }
        this.LIZ.storeString("current_day", LIZIZ());
        this.LIZ.storeInt("today_showed_time", 0);
        return 0;
    }

    public static boolean LIZJ(int i, int i2, Context context) throws Throwable {
        long j;
        Cursor cursor;
        PackageInfo packageInfoY3;
        Cursor cursorQuery = null;
        boolean z = false;
        try {
            packageInfoY3 = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (packageInfoY3 == null) {
            j = 0;
        } else {
            j = packageInfoY3.firstInstallTime;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        long j2 = 86400000 * i;
        if (jCurrentTimeMillis >= j2) {
            return false;
        }
        try {
            SQLiteDatabase sQLiteDatabaseLJIILIIL = ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIILIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("open_time");
            sbLIZ.append(" > ?");
            Cursor cursorQuery2 = sQLiteDatabaseLJIILIIL.query(true, "app_open", null, C2188811AlT.LIZIZ(sbLIZ), new String[]{String.valueOf(System.currentTimeMillis() - j2)}, null, null, null, null);
            if (cursorQuery2 == null) {
                return false;
            }
            try {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("open_time");
                sbLIZ2.append(" = ?");
                cursorQuery = sQLiteDatabaseLJIILIIL.query(true, "app_open", null, C2188811AlT.LIZIZ(sbLIZ2), new String[]{String.valueOf(calendar.getTimeInMillis())}, null, null, null, null);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (cursorQuery.getCount() > 0) {
                    if (cursorQuery2.getCount() <= i2) {
                        z = true;
                    }
                } else if (cursorQuery2.getCount() < i2) {
                    z = true;
                }
                cursorQuery2.close();
                cursorQuery.close();
                return z;
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                cursorQuery = cursorQuery2;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        break;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
    }
}
