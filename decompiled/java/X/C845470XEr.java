package X;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.account.TTAccountInit;

/* JADX INFO: renamed from: X.0XEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845470XEr {
    public final C845490XEt LIZ;
    public SQLiteDatabase LIZIZ;

    public final boolean LIZ() {
        try {
            SQLiteDatabase sQLiteDatabase = this.LIZIZ;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                return true;
            }
            C845490XEt c845490XEt = this.LIZ;
            if (c845490XEt == null) {
                return false;
            }
            this.LIZIZ = c845490XEt.getWritableDatabase();
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0XEt] */
    public C845470XEr() {
        TTAccountInit.LIZ();
        final Context contextLIZ = C848000XOk.LIZ();
        this.LIZ = new SQLiteOpenHelper(contextLIZ) { // from class: X.0XEt
            @Override // android.database.sqlite.SQLiteOpenHelper
            public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                try {
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS login_info (time integer primary key , type integer , info text , uid integer , avatar_url text , user_name text , screen_name text , platform_avatar_url text, platform_screen_name text,sec_uid text,ext text);");
                } catch (SQLException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                if (i < 2) {
                    sQLiteDatabase.execSQL("alter TABLE login_info add COLUMN sec_uid text ");
                    sQLiteDatabase.execSQL("alter TABLE login_info add COLUMN ext text ");
                    C0XFF.LIZ("DBHelper", "update db ");
                }
            }
        };
        this.LIZIZ = null;
    }
}
