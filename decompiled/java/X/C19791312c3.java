package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12c3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19791312c3 extends SQLiteOpenHelper {
    public final /* synthetic */ C19805312eJ LL;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (SQLiteException e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LL.LJIILJJIL().LJFF.LIZJ("Opening the local database failed, dropping and recreating it");
            if (!this.LL.LIZ.LIZ.getDatabasePath("google_app_measurement_local.db").delete()) {
                this.LL.LJIILJJIL().LJFF.LIZ("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e3) {
                TryCatchGuardChecker.doCheck(e3);
                this.LL.LJIILJJIL().LJFF.LIZ(e3, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C19787912bV.LIZIZ(this.LL.LJIILJJIL(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C19787912bV.LIZJ(this.LL.LJIILJJIL(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19791312c3(C19805312eJ c19805312eJ, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.LL = c19805312eJ;
    }
}
