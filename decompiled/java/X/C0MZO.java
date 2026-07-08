package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0MZO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MZO {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.database.Cursor, android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap LIZ() {
        /*
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r5 = 0
            X.01GW<X.0MZP> r0 = X.C0MZP.LL     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45
            X.0MZP r0 = (X.C0MZP) r0     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45
            android.database.sqlite.SQLiteDatabase r4 = r0.getReadableDatabase()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45
            java.lang.String r0 = "SELECT * FROM image_live_photo_info"
            android.database.Cursor r5 = r4.rawQuery(r0, r5)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L72
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L72
            if (r0 == 0) goto L6b
        L1e:
            java.lang.String r0 = "image_file_path"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L72
            java.lang.String r1 = r5.getString(r0)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L72
            java.lang.String r0 = "is_live_photo"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L72
            int r0 = r5.getInt(r0)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L72
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L72
            r6.put(r1, r0)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L72
            boolean r0 = r5.moveToNext()     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L72
            if (r0 != 0) goto L1e
            goto L6b
        L40:
            r3 = move-exception
            goto L47
        L42:
            r0 = move-exception
            r4 = r5
            goto L73
        L45:
            r3 = move-exception
            r4 = r5
        L47:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L72
            X.0nqf r2 = X.C1450470nqf.LIZIZ     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = " query image "
            r1.append(r0)     // Catch: java.lang.Throwable -> L72
            java.lang.StackTraceElement[] r0 = r3.getStackTrace()     // Catch: java.lang.Throwable -> L72
            r1.append(r0)     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L72
            X.C201955140j.LJII(r2, r0)     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L68
            r5.close()
        L68:
            if (r4 == 0) goto L71
            goto L6e
        L6b:
            r5.close()
        L6e:
            r4.close()
        L71:
            return r6
        L72:
            r0 = move-exception
        L73:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L7b
            r5.close()
        L7b:
            if (r4 == 0) goto L80
            r4.close()
        L80:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MZO.LIZ():java.util.HashMap");
    }

    public static void LIZIZ(int i, String str) {
        SQLiteDatabase writableDatabase;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                writableDatabase = C0MZP.LL.getValue().getWritableDatabase();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("image_file_path", str);
            contentValues.put("is_live_photo", Integer.valueOf(i));
            writableDatabase.insertWithOnConflict("image_live_photo_info", null, contentValues, 5);
            writableDatabase.close();
        } catch (Exception e2) {
            e = e2;
            sQLiteDatabase = writableDatabase;
            TryCatchGuardChecker.doCheck(e);
            C1450470nqf c1450470nqf = C1450470nqf.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" insert image ");
            sbLIZ.append(e.getStackTrace());
            C201955140j.LJII(c1450470nqf, C2188811AlT.LIZIZ(sbLIZ));
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = writableDatabase;
            TryCatchGuardChecker.doCheck(th);
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }
}
