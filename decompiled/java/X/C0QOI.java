package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0QOI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QOI {
    public static AnonymousClass0956 LIZLLL;
    public static volatile C687410Qxn LJFF;
    public static final C0QOI LIZ = new C0QOI();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(518));
    public static final ConcurrentLinkedQueue<SearchSugEntity> LIZJ = new ConcurrentLinkedQueue<>();
    public static final C054G LJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    public final void LIZ(List<? extends SearchSugEntity> list) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C844470XAv.LIZ.getClass();
            SQLiteDatabase writableDatabase = LIZIZ(C844470XAv.LIZ()).getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                for (SearchSugEntity searchSugEntity : list) {
                    searchSugEntity.sugExtraInfo = null;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("content", searchSugEntity.content);
                    contentValues.put("entity", ((Gson) LIZIZ.getValue()).LJIILL(searchSugEntity));
                    contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                    writableDatabase.insertWithOnConflict("sug_history", null, contentValues, 5);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\n                    DELETE FROM sug_history \n                    WHERE id NOT IN (\n                        SELECT id FROM sug_history \n                        ORDER BY timestamp DESC \n                        LIMIT ");
                sbLIZ.append(((Number) C284290BCh.LIZ.getValue()).intValue());
                sbLIZ.append("\n                    )\n                ");
                writableDatabase.execSQL(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("DB addSugListFlush, cost ");
                sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ2);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Qxn] */
    public final C687410Qxn LIZIZ(final Context context) {
        C687410Qxn c687410Qxn = LJFF;
        if (c687410Qxn == 0) {
            synchronized (this) {
                try {
                    C687410Qxn c687410Qxn2 = LJFF;
                    c687410Qxn = c687410Qxn2;
                    if (c687410Qxn2 == null) {
                        ?? r0 = new SQLiteOpenHelper(context) { // from class: X.0Qxn
                            @Override // android.database.sqlite.SQLiteOpenHelper
                            public final void onConfigure(SQLiteDatabase sQLiteDatabase) throws Throwable {
                                Cursor cursorRawQuery;
                                super.onConfigure(sQLiteDatabase);
                                if (sQLiteDatabase != null) {
                                    try {
                                        sQLiteDatabase.enableWriteAheadLogging();
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("PRAGMA cache_size = ");
                                        sbLIZ.append(5);
                                        sQLiteDatabase.execSQL(C2188811AlT.LIZIZ(sbLIZ));
                                        if (sQLiteDatabase != null && (cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*) FROM sug_history", null)) != null) {
                                            try {
                                                if (cursorRawQuery.moveToFirst()) {
                                                    long j = cursorRawQuery.getLong(0);
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append("Database initialized. Total count: ");
                                                    sbLIZ2.append(j);
                                                    C2188811AlT.LIZIZ(sbLIZ2);
                                                }
                                                C2107108Nh.LIZ(cursorRawQuery, null);
                                            } catch (Throwable th) {
                                                th = th;
                                                try {
                                                    try {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        TryCatchGuardChecker.doCheck(th);
                                                        C2107108Nh.LIZ(cursorRawQuery, th);
                                                        throw th;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    th = null;
                                                    TryCatchGuardChecker.doCheck(th);
                                                    C2107108Nh.LIZ(cursorRawQuery, th);
                                                    throw th;
                                                }
                                            }
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                            }

                            @Override // android.database.sqlite.SQLiteOpenHelper
                            public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.execSQL("CREATE TABLE sug_history (\n    id INTEGER PRIMARY KEY AUTOINCREMENT,\n    content TEXT UNIQUE,\n    entity TEXT,\n    timestamp INTEGER\n)");
                                }
                            }

                            @Override // android.database.sqlite.SQLiteOpenHelper
                            public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sug_history");
                                }
                                onCreate(sQLiteDatabase);
                            }
                        };
                        LJFF = r0;
                        c687410Qxn = r0;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c687410Qxn;
    }
}
