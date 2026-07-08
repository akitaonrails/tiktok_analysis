package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0MZW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MZW extends SQLiteOpenHelper {
    public static C0MZW LLILLL;
    public final SQLiteDatabase LL;
    public final SQLiteDatabase LLILLJJLI;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MZW() {
        super(C844470XAv.LIZ(), "TIKTOK.db", (SQLiteDatabase.CursorFactory) null, 1);
        C844470XAv.LIZ.getClass();
        this.LL = getWritableDatabase();
        this.LLILLJJLI = getReadableDatabase();
    }

    public static C0MZW LIZ() {
        if (LLILLL == null) {
            synchronized (C0MZW.class) {
                try {
                    if (LLILLL == null) {
                        LLILLL = new C0MZW();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLILLL;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `app_open` (\n\t`open_time`\tINTEGER UNIQUE);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `like_dialog_open` (\n\t`open_time`\tINTEGER,\n\t`version`\tINTEGER\n);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            super.onDowngrade(sQLiteDatabase, i, i2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
            System.exit(0);
        }
    }
}
