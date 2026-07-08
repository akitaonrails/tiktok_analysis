package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12eJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19805312eJ extends AbstractC19810512f9 {
    public final C19791312c3 LIZJ;
    public boolean LIZLLL;

    @Override // X.AbstractC19810512f9
    public final boolean LJIILL() {
        return false;
    }

    public final boolean LJIJJ() {
        LJ();
        if (this.LIZLLL || !this.LIZ.LIZ.getDatabasePath("google_app_measurement_local.db").exists()) {
            return false;
        }
        int i = 5;
        int i2 = 0;
        do {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase sQLiteDatabaseLJIJJLI = LJIJJLI();
                    if (sQLiteDatabaseLJIJJLI == null) {
                        this.LIZLLL = true;
                        return false;
                    }
                    sQLiteDatabaseLJIJJLI.beginTransaction();
                    sQLiteDatabaseLJIJJLI.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    sQLiteDatabaseLJIJJLI.setTransactionSuccessful();
                    sQLiteDatabaseLJIJJLI.endTransaction();
                    sQLiteDatabaseLJIJJLI.close();
                    return true;
                } catch (SQLiteDatabaseLockedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                    i2++;
                }
            } catch (SQLiteFullException e2) {
                TryCatchGuardChecker.doCheck(e2);
                LJIILJJIL().LJFF.LIZ(e2, "Error deleting app launch break from local database");
                this.LIZLLL = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
                i2++;
            } catch (SQLiteException e3) {
                try {
                    TryCatchGuardChecker.doCheck(e3);
                    if (0 != 0 && sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                    LJIILJJIL().LJFF.LIZ(e3, "Error deleting app launch break from local database");
                    this.LIZLLL = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                    i2++;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            }
        } while (i2 < 5);
        LJIILJJIL().LJIIIIZZ.LIZJ("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    public final SQLiteDatabase LJIJJLI() {
        if (this.LIZLLL) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.LIZJ.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.LIZLLL = true;
        return null;
    }

    public final void LJIJI() {
        int iDelete;
        LJ();
        try {
            SQLiteDatabase sQLiteDatabaseLJIJJLI = LJIJJLI();
            if (sQLiteDatabaseLJIJJLI == null || (iDelete = sQLiteDatabaseLJIJJLI.delete("messages", null, null)) <= 0) {
                return;
            }
            LJIILJJIL().LJIILIIL.LIZ(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILJJIL().LJFF.LIZ(e, "Error resetting local analytics data. error");
        }
    }

    public C19805312eJ(C19804712eD c19804712eD) {
        super(c19804712eD);
        this.LIZJ = new C19791312c3(this, this.LIZ.LIZ);
    }

    public static long LJIILLIIL(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (cursorQuery.moveToFirst()) {
                long j = cursorQuery.getLong(0);
                cursorQuery.close();
                return j;
            }
            cursorQuery.close();
            return -1L;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0136  */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIZILJ(int r19, byte[] r20) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19805312eJ.LJIIZILJ(int, byte[]):boolean");
    }
}
