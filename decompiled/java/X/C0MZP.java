package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MZP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MZP extends SQLiteOpenHelper {
    public static final C01GW<C0MZP> LL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(150));

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C0MZP() {
        super(C786410Ut5.M3(C0CHQ.LIZ), "aweme_live_photo.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `image_live_photo_info` (\n\t`image_file_path`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`is_live_photo`\tINTEGER NOT NULL\n);");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1450470nqf c1450470nqf = C1450470nqf.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" create table ");
                sbLIZ.append(e.getStackTrace());
                C201955140j.LJII(c1450470nqf, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
