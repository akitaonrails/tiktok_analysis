package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.applog.store.DbStore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1Bed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2210051Bed extends SQLiteOpenHelper {
    public final long LL;
    public long LLILLJJLI;
    public final /* synthetic */ DbStore LLILLL;

    public final void LIZ() {
        if (DbStore.LJIILJJIL) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.LLILLJJLI <= DbStore.LJIILL) {
                return;
            }
            this.LLILLJJLI = jCurrentTimeMillis;
            try {
                Cursor cursorRawQuery = getWritableDatabase().rawQuery("PRAGMA wal_checkpoint(2)", null);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                this.LLILLL.LJII().LJIIIZ(5, null, "executeWALCheckpoint success", new Object[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLILLL.LJII().LJIILIIL(5, "executeWALCheckpoint failed", th, new Object[0]);
                this.LLILLL.LIZ.LLILLL.LJJJJLI.LJI("executeWALCheckpoint failed", th, true);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (DbStore.LJIILJJIL) {
            sQLiteDatabase.enableWriteAheadLogging();
            this.LLILLL.LJII().LJIIIZ(5, null, "enable sqlite WAL", new Object[0]);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            Iterator<AbstractC2209931BeR> it2 = this.LLILLL.LIZJ.values().iterator();
            while (it2.hasNext()) {
                String strLIZIZ = it2.next().LIZIZ();
                if (strLIZIZ != null) {
                    sQLiteDatabase.execSQL(strLIZIZ);
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        C2200271B9l.LJFF(sQLiteDatabase);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2210051Bed(DbStore dbStore, Context context, String str) {
        long length;
        super(context, str, (SQLiteDatabase.CursorFactory) null, 58);
        this.LLILLL = dbStore;
        File databasePath = context.getDatabasePath(str);
        if (databasePath != null) {
            length = databasePath.length();
        } else {
            length = 0;
        }
        this.LL = length;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.LLILLL.LJII().LJIIIZ(5, null, "onUpgrade: v{} -> v{}", Integer.valueOf(i), Integer.valueOf(i2));
        try {
            sQLiteDatabase.beginTransaction();
            for (AbstractC2209931BeR abstractC2209931BeR : this.LLILLL.LIZJ.values()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DROP TABLE IF EXISTS ");
                sbLIZ.append(abstractC2209931BeR.LJIIIZ());
                sQLiteDatabase.execSQL(C2188811AlT.LIZIZ(sbLIZ));
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        C2200271B9l.LJFF(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }
}
