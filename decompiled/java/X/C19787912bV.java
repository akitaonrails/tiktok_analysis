package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.12bV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19787912bV {
    public static Set<String> LIZ(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            cursorRawQuery.close();
            return hashSet;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cursorRawQuery.close();
            throw th;
        }
    }

    public static void LIZIZ(C19806212eS c19806212eS, SQLiteDatabase sQLiteDatabase) {
        if (c19806212eS != null) {
            String path = sQLiteDatabase.getPath();
            int i = AbstractC2262701DhM.LIZ;
            C0VSJ c0vsj = new C0VSJ(path);
            if (!c0vsj.setReadable(false, false)) {
                c19806212eS.LJIIIIZZ.LIZJ("Failed to turn off database read permission");
            }
            if (!c0vsj.setWritable(false, false)) {
                c19806212eS.LJIIIIZZ.LIZJ("Failed to turn off database write permission");
            }
            if (!c0vsj.setReadable(true, true)) {
                c19806212eS.LJIIIIZZ.LIZJ("Failed to turn on database read permission for owner");
            }
            if (!c0vsj.setWritable(true, true)) {
                c19806212eS.LJIIIIZZ.LIZJ("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    public static void LIZJ(C19806212eS c19806212eS, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        boolean zMoveToFirst;
        if (c19806212eS != null) {
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                    zMoveToFirst = cursorQuery.moveToFirst();
                    cursorQuery.close();
                } catch (SQLiteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c19806212eS.LJIIIIZZ.LIZIZ(str, "Error querying for table", e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
                if (!zMoveToFirst) {
                    sQLiteDatabase.execSQL(str2);
                }
                try {
                    Set<String> setLIZ = LIZ(sQLiteDatabase, str);
                    for (String str4 : str3.split(",")) {
                        if (!((HashSet) setLIZ).remove(str4)) {
                            throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                        }
                    }
                    if (strArr != null) {
                        for (int i = 0; i < strArr.length; i += 2) {
                            if (!((HashSet) setLIZ).remove(strArr[i])) {
                                sQLiteDatabase.execSQL(strArr[i + 1]);
                            }
                        }
                    }
                    if (!((HashSet) setLIZ).isEmpty()) {
                        c19806212eS.LJIIIIZZ.LIZIZ(str, "Table has extra columns. table, columns", TextUtils.join(", ", setLIZ));
                        return;
                    }
                    return;
                } catch (SQLiteException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    c19806212eS.LJFF.LIZ(str, "Failed to verify columns on table that was just created");
                    throw e2;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
