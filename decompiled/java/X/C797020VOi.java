package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C797020VOi {
    public static final String[] LIZIZ = {"_id", "category", "tag", "label", "value", "ext_value", "ext_json"};
    public static final Object LIZJ = new Object();
    public static C797020VOi LIZLLL;
    public final SQLiteDatabase LIZ;

    public C797020VOi(final Context context) {
        this.LIZ = new SQLiteOpenHelper(context) { // from class: X.0VOj
            @Override // android.database.sqlite.SQLiteOpenHelper
            public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                try {
                    sQLiteDatabase.execSQL("CREATE TABLE event ( _id INTEGER PRIMARY KEY AUTOINCREMENT, category VARCHAR, tag VARCHAR, label VARCHAR, value INTEGER, ext_value INTEGER, ext_json TEXT )");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }.getWritableDatabase();
    }

    public static C797020VOi LIZIZ(Context context) {
        synchronized (LIZJ) {
            try {
                if (LIZLLL == null) {
                    LIZLLL = new C797020VOi(C786410Ut5.N3(context));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return LIZLLL;
    }

    public static void LIZJ(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final synchronized JSONArray LIZ(long j) {
        Cursor cursorQuery;
        int i;
        String string;
        long j2;
        long j3;
        String string2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        int i2 = 5;
        sbLIZ.append(5);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i3 = 1;
        int i4 = 0;
        String[] strArr = {String.valueOf(j)};
        JSONArray jSONArray = new JSONArray();
        try {
            cursorQuery = this.LIZ.query("event", LIZIZ, "_id > ? ", strArr, null, null, "_id ASC", strLIZIZ);
            i = 0;
            long j4 = 0;
            while (cursorQuery.moveToNext()) {
                try {
                    long j5 = cursorQuery.getLong(i4);
                    String string3 = cursorQuery.getString(i3);
                    String string4 = cursorQuery.getString(2);
                    if (!cursorQuery.isNull(3)) {
                        string = cursorQuery.getString(3);
                    } else {
                        string = null;
                    }
                    if (!cursorQuery.isNull(4)) {
                        j2 = cursorQuery.getLong(4);
                    } else {
                        j2 = 0;
                    }
                    if (!cursorQuery.isNull(i2)) {
                        j3 = cursorQuery.getLong(i2);
                    } else {
                        j3 = 0;
                    }
                    if (!cursorQuery.isNull(6)) {
                        string2 = cursorQuery.getString(6);
                    } else {
                        string2 = null;
                    }
                    if (j4 < j5) {
                        j4 = j5;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("_id", j5);
                    if (!C2093608Ic.LJ(string2)) {
                        jSONObject.put("ext_json", string2);
                    }
                    jSONObject.put("category", string3);
                    jSONObject.put("tag", string4);
                    if (!C2093608Ic.LJ(string)) {
                        jSONObject.put("label", string);
                    }
                    if (j2 != 0) {
                        jSONObject.put("value", j2);
                    }
                    if (j3 != 0) {
                        jSONObject.put("ext_value", j3);
                    }
                    jSONArray.put(jSONObject);
                    i++;
                    i3 = 1;
                    i2 = 5;
                    i4 = 0;
                } catch (Throwable th) {
                    th = th;
                    i4 = i;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        LIZJ(cursorQuery);
                        i = i4;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        LIZJ(cursorQuery);
                        throw th2;
                    }
                }
            }
            LIZJ(cursorQuery);
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
        if (i > 0) {
            return jSONArray;
        }
        return null;
    }
}
