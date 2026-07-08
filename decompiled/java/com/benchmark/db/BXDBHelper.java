package com.benchmark.db;

import X.C0VO9;
import X.C0VOB;
import X.C2079408Cq;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class BXDBHelper extends SQLiteOpenHelper {
    public static C0VO9 parser = new C0VO9();
    public static BXDBHelper mhander = null;
    public static int tryNum = 0;

    public static native ArrayList<String> nativeGetCreateTableQuery();

    public static native void nativeInit();

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public BXDBHelper(Context context) {
        super(context, "bytebench_db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static void setHander(BXDBHelper bXDBHelper) {
        mhander = bXDBHelper;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!C2079408Cq.LIZIZ) {
            return;
        }
        nativeInit();
        ArrayList<String> arrayListNativeGetCreateTableQuery = nativeGetCreateTableQuery();
        for (int i = 0; i < arrayListNativeGetCreateTableQuery.size(); i++) {
            sQLiteDatabase.execSQL((String) ListProtector.get(arrayListNativeGetCreateTableQuery, i));
        }
    }

    public static JSONArray cursorToJsonArray(Cursor cursor, String str) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        if (cursor == null) {
            return jSONArray;
        }
        while (cursor.moveToNext()) {
            try {
                C0VOB c0vob = (C0VOB) ((HashMap) parser.LIZ).get(str);
                if (c0vob != null) {
                    jSONObject = c0vob.LIZ(cursor);
                } else {
                    jSONObject = new JSONObject();
                }
                jSONArray.put(jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return jSONArray;
    }

    public static boolean delete(String str, String str2) {
        BXDBHelper bXDBHelper = mhander;
        if (bXDBHelper == null || bXDBHelper.getWritableDatabase().delete(str, str2, null) <= 0) {
            return false;
        }
        return true;
    }

    public static String queryData(String str, String str2) {
        BXDBHelper bXDBHelper = mhander;
        if (bXDBHelper == null) {
            return "";
        }
        try {
            Cursor cursorRawQuery = bXDBHelper.getWritableDatabase().rawQuery(str, null);
            JSONArray jSONArrayCursorToJsonArray = cursorToJsonArray(cursorRawQuery, str2);
            cursorRawQuery.close();
            return jSONArrayCursorToJsonArray.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public boolean isTableExists(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z = true;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table' AND name=?", new String[]{str});
        if (cursorRawQuery.getCount() <= 0) {
            z = false;
        }
        cursorRawQuery.close();
        return z;
    }

    public static boolean insert(String str, String str2, String str3, boolean z) {
        int i;
        int i2;
        BXDBHelper bXDBHelper = mhander;
        if (bXDBHelper == null) {
            return false;
        }
        SQLiteDatabase writableDatabase = bXDBHelper.getWritableDatabase();
        try {
            JSONArray jSONArray = new JSONArray(str2);
            JSONArray jSONArray2 = new JSONArray(str3);
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                ContentValues contentValues = new ContentValues();
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i3);
                for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                    String string = JSONArrayProtectorUtils.getString(jSONArray2, i4);
                    if (jSONObject.has(string)) {
                        Object obj = jSONObject.get(string);
                        if (obj instanceof String) {
                            contentValues.put(string, (String) obj);
                        } else if (obj instanceof Integer) {
                            contentValues.put(string, (Integer) obj);
                        } else if (obj instanceof Boolean) {
                            contentValues.put(string, (Boolean) obj);
                        }
                    }
                }
                if (z) {
                    i2 = 5;
                } else {
                    i2 = 4;
                }
                if (writableDatabase.insertWithOnConflict(str, null, contentValues, i2) == -1) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            BXDBHelper bXDBHelper2 = mhander;
            if (!bXDBHelper2.isTableExists(bXDBHelper2.getWritableDatabase(), str) && (i = tryNum) < 10) {
                tryNum = i + 1;
                ArrayList<String> arrayListNativeGetCreateTableQuery = nativeGetCreateTableQuery();
                for (int i5 = 0; i5 < arrayListNativeGetCreateTableQuery.size(); i5++) {
                    if (((String) ListProtector.get(arrayListNativeGetCreateTableQuery, i5)).contains(str)) {
                        writableDatabase.execSQL((String) ListProtector.get(arrayListNativeGetCreateTableQuery, i5));
                    }
                }
            }
            return false;
        }
    }
}
