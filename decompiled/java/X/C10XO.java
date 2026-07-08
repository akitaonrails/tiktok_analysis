package X;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.10XO, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10XO {
    public static void LIZ(Context context, String str, C10XK c10xk, String str2, String str3, int i) {
        PackageInfo packageInfoY3;
        long j;
        SQLiteDatabase writableDatabase = new C0WFW(context).getWritableDatabase();
        writableDatabase.execSQL("delete from preinstall_tb");
        ContentValues contentValues = new ContentValues();
        C10XH c10xh = c10xk.LIZ;
        String str4 = c10xk.LIZJ.LIZIZ;
        contentValues.put("preinstall_channel_af", str2);
        contentValues.put("preinstall_campaign_af", str3);
        contentValues.put("preinstall_channel_tt", c10xh.LIZ);
        contentValues.put("system_file_channel", c10xh.LJFF);
        contentValues.put("file_path", c10xh.LJI);
        contentValues.put("name_in_manifest", c10xh.LJIIIZ);
        contentValues.put("install_referrer", str4);
        contentValues.put("app_channel", str);
        try {
            packageInfoY3 = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            packageInfoY3 = null;
        }
        long j2 = -1;
        if (packageInfoY3 != null) {
            j = packageInfoY3.firstInstallTime;
        } else {
            j = -1;
        }
        contentValues.put("apk_first_install_time", Long.valueOf(j));
        try {
            PackageInfo packageInfoY32 = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0);
            if (packageInfoY32 != null) {
                j2 = packageInfoY32.lastUpdateTime;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        contentValues.put("apk_last_update_time", Long.valueOf(j2));
        contentValues.put("is_factory_uninstall", Integer.valueOf(c10xh.LJIIIIZZ ? 1 : 0));
        contentValues.put("preinstall_method", Integer.valueOf(c10xh.LJIIJJI));
        contentValues.put("df_code", Integer.valueOf(i));
        writableDatabase.insert("preinstall_tb", null, contentValues);
        writableDatabase.close();
    }
}
