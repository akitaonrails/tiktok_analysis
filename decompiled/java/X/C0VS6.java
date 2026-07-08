package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS247S0000000_13;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VS6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VS6 {
    public final C687430Qxp LIZ;
    public SQLiteStatement LIZIZ;
    public SQLiteStatement LIZJ;

    public C0VS6(C687430Qxp c687430Qxp) {
        this.LIZ = c687430Qxp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r0 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZ(java.lang.String r10) {
        /*
            r9 = this;
            X.0Qxp r0 = r9.LIZ
            android.database.sqlite.SQLiteDatabase r8 = r0.getWritableDatabase()
            android.database.sqlite.SQLiteStatement r0 = r9.LIZIZ
            if (r0 != 0) goto L12
            java.lang.String r0 = "INSERT OR ABORT INTO cp_entries(cp_id, session_id, json, created_at) VALUES(?, ?, ?, ?)"
            android.database.sqlite.SQLiteStatement r0 = r8.compileStatement(r0)
            r9.LIZIZ = r0
        L12:
            android.database.sqlite.SQLiteStatement r0 = r9.LIZJ
            if (r0 != 0) goto L1e
            java.lang.String r0 = "DELETE FROM cp_entries WHERE session_id!=?"
            android.database.sqlite.SQLiteStatement r0 = r8.compileStatement(r0)
            r9.LIZJ = r0
        L1e:
            r8.beginTransaction()
            r7 = 1
            r6 = 0
            android.database.sqlite.SQLiteStatement r0 = r9.LIZJ     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L76
            r0.bindString(r7, r10)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L76
            int r5 = r0.executeUpdateDelete()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L76
            r8.setTransactionSuccessful()     // Catch: java.lang.Exception -> L38 java.lang.Throwable -> L76
            r8.endTransaction()     // Catch: java.lang.Exception -> L33
            goto L69
        L33:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L69
        L38:
            r4 = move-exception
            goto L3c
        L3a:
            r4 = move-exception
            r5 = 0
        L3c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)     // Catch: java.lang.Throwable -> L76
            X.1Bdq r3 = X.C2209791BeD.LJIJJ()     // Catch: java.lang.Throwable -> L76
            java.util.List<java.lang.String> r2 = X.C1845107Kn.LIZ     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "DB deleteHistoryByCurrentSession failed for session="
            r1.append(r0)     // Catch: java.lang.Throwable -> L76
            r1.append(r10)     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L76
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L76
            r0[r6] = r4     // Catch: java.lang.Throwable -> L76
            r3.LIZJ(r2, r1, r0)     // Catch: java.lang.Throwable -> L76
            r8.endTransaction()     // Catch: java.lang.Exception -> L60
            goto L64
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L64:
            android.database.sqlite.SQLiteStatement r0 = r9.LIZJ     // Catch: java.lang.Exception -> L71
            if (r0 == 0) goto L75
            goto L6d
        L69:
            android.database.sqlite.SQLiteStatement r0 = r9.LIZJ     // Catch: java.lang.Exception -> L71
            if (r0 == 0) goto L75
        L6d:
            r0.clearBindings()     // Catch: java.lang.Exception -> L71
            return r5
        L71:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L75:
            return r5
        L76:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L76
            r8.endTransaction()     // Catch: java.lang.Exception -> L7e
            goto L82
        L7e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L82:
            android.database.sqlite.SQLiteStatement r0 = r9.LIZJ     // Catch: java.lang.Exception -> L8a
            if (r0 == 0) goto L8e
            r0.clearBindings()     // Catch: java.lang.Exception -> L8a
            throw r1
        L8a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L8e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VS6.LIZ(java.lang.String):int");
    }

    public final Map<String, JSONObject> LIZIZ(List<String> list) {
        String strLIZIZ;
        Object[] array;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return C2097608Jq.LJ();
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        HashMap map = new HashMap(arrayList.size());
        Cursor cursorRawQuery = null;
        try {
            try {
                String strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS247S0000000_13.get$arr$(68), 30);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SELECT cp_id, json FROM cp_entries WHERE cp_id IN (");
                sbLIZ.append(strLJJLIIIJ);
                sbLIZ.append(')');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                array = arrayList.toArray(new String[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (0 != 0) {
                    try {
                        cursorRawQuery.close();
                        throw th;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2209791BeD.LJIJJ().LIZJ(C1845107Kn.LIZ, "DB batch query failed in getByIds", e2);
            if (0 != 0) {
            }
            return map;
        }
        if (array != null) {
            cursorRawQuery = readableDatabase.rawQuery(strLIZIZ, (String[]) array);
            while (cursorRawQuery.moveToNext()) {
                String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("cp_id"));
                try {
                    map.put(string, new JSONObject(cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("json"))));
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    InterfaceC2209561Bdq interfaceC2209561BdqLJIJJ = C2209791BeD.LJIJJ();
                    List<String> list2 = C1845107Kn.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Invalid JSON for cp_id=");
                    sbLIZ2.append(string);
                    sbLIZ2.append(" in batch getByIds, skipping");
                    interfaceC2209561BdqLJIJJ.LIZJ(list2, C2188811AlT.LIZIZ(sbLIZ2), e3);
                }
            }
            try {
                cursorRawQuery.close();
                return map;
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                return map;
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final List<String> LIZLLL(String str) {
        SQLiteDatabase readableDatabase = getReadableDatabase();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = readableDatabase.query("cp_entries", new String[]{"cp_id"}, "session_id!=?", new String[]{str}, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("cp_id")));
                    }
                    cursorQuery.close();
                    return arrayList;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    InterfaceC2209561Bdq interfaceC2209561BdqLJIJJ = C2209791BeD.LJIJJ();
                    List<String> list = C1845107Kn.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DB listIdsBySession failed for session=");
                    sbLIZ.append(str);
                    interfaceC2209561BdqLJIJJ.LIZJ(list, C2188811AlT.LIZIZ(sbLIZ), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        return arrayList;
                    }
                    return arrayList;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }

    public final boolean LIZJ(String str, String str2, String str3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (this.LIZIZ == null) {
            this.LIZIZ = writableDatabase.compileStatement("INSERT OR ABORT INTO cp_entries(cp_id, session_id, json, created_at) VALUES(?, ?, ?, ?)");
        }
        if (this.LIZJ == null) {
            this.LIZJ = writableDatabase.compileStatement("DELETE FROM cp_entries WHERE session_id!=?");
        }
        SQLiteStatement sQLiteStatement = this.LIZIZ;
        boolean z = false;
        try {
            try {
                sQLiteStatement.bindString(1, str);
                sQLiteStatement.bindString(2, str2);
                sQLiteStatement.bindString(3, str3);
                sQLiteStatement.bindLong(4, jCurrentTimeMillis);
                if (sQLiteStatement.executeInsert() != -1) {
                    z = true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                InterfaceC2209561Bdq interfaceC2209561BdqLJIJJ = C2209791BeD.LJIJJ();
                List<String> list = C1845107Kn.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DB insert failed for cp_id=");
                sbLIZ.append(str);
                interfaceC2209561BdqLJIJJ.LIZJ(list, C2188811AlT.LIZIZ(sbLIZ), e);
            }
            try {
                sQLiteStatement.clearBindings();
                return z;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return z;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                sQLiteStatement.clearBindings();
                throw th;
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw th;
            }
        }
    }
}
