package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13z3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20188713z3 {
    public static final C20188713z3 LIZ = new C20188713z3();
    public static C816380W0u LIZIZ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0W0u] */
    public final void LIZ(Context context) {
        synchronized (this) {
            try {
                final Context contextN3 = C786410Ut5.N3(context);
                LIZIZ = new SQLiteOpenHelper(contextN3) { // from class: X.0W0u
                    @Override // android.database.sqlite.SQLiteOpenHelper
                    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                    }

                    @Override // android.database.sqlite.SQLiteOpenHelper
                    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS h5_storage (\n    id INTEGER PRIMARY KEY AUTOINCREMENT,\n    primary_key TEXT,\n    time_stamp LONG, \n    content TEXT\n    )");
                    }

                    @Override // android.database.sqlite.SQLiteOpenHelper
                    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                        sQLiteDatabase.execSQL("DROP TABLE h5_storage");
                        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS h5_storage (\n    id INTEGER PRIMARY KEY AUTOINCREMENT,\n    primary_key TEXT,\n    time_stamp LONG, \n    content TEXT\n    )");
                    }
                };
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final String LIZJ(String str) {
        String string;
        SQLiteDatabase writableDatabase;
        Cursor cursorQuery;
        C816380W0u c816380W0u;
        synchronized (this) {
            string = null;
            try {
                try {
                    c816380W0u = LIZIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C14A6.LIZIZ();
                }
                if (c816380W0u != null) {
                    writableDatabase = c816380W0u.getWritableDatabase();
                } else {
                    writableDatabase = null;
                }
                boolean z = true;
                if (writableDatabase == null) {
                    cursorQuery = null;
                } else {
                    cursorQuery = writableDatabase.query("h5_storage", new String[]{"content"}, "primary_key=?", new String[]{str}, null, null, null, "1");
                }
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    z = false;
                }
                if (z) {
                    string = cursorQuery.getString(0);
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[Catch: all -> 0x0076, PHI: r5
      0x0072: PHI (r5v2 java.lang.Long) = (r5v3 java.lang.Long), (r5v4 java.lang.Long) binds: [B:21:0x006e, B:11:0x004f] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0076, blocks: (B:3:0x0001, B:4:0x0028, B:6:0x002c, B:8:0x0032, B:10:0x0047, B:13:0x0053, B:24:0x0072, B:18:0x0062, B:20:0x0067), top: B:29:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "insertOrUpdate: "
            kotlin.jvm.internal.Intrinsics.LJIIJJI(r10, r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "content: "
            kotlin.jvm.internal.Intrinsics.LJIIJJI(r11, r0)     // Catch: java.lang.Throwable -> L76
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L76
            r7.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "primary_key"
            r7.put(r0, r10)     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = "time_stamp"
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L76
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L76
            r7.put(r2, r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "content"
            r7.put(r0, r11)     // Catch: java.lang.Throwable -> L76
            r6 = 0
            X.0W0u r0 = X.C20188713z3.LIZIZ     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L76
            if (r0 == 0) goto L70
            android.database.sqlite.SQLiteDatabase r8 = r0.getWritableDatabase()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L76
            if (r8 == 0) goto L70
            java.lang.String r3 = "h5_storage"
            java.lang.String r2 = "primary_key=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch: android.database.SQLException -> L60 java.lang.Throwable -> L76
            r0 = 0
            r1[r0] = r10     // Catch: android.database.SQLException -> L60 java.lang.Throwable -> L76
            int r0 = r8.update(r3, r7, r2, r1)     // Catch: android.database.SQLException -> L60 java.lang.Throwable -> L76
            long r0 = (long) r0     // Catch: android.database.SQLException -> L60 java.lang.Throwable -> L76
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch: android.database.SQLException -> L60 java.lang.Throwable -> L76
            if (r5 == 0) goto L70
            long r3 = r5.longValue()     // Catch: android.database.SQLException -> L5e java.lang.Throwable -> L76
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L72
            if (r8 == 0) goto L70
            java.lang.String r0 = "h5_storage"
            long r0 = r8.insert(r0, r6, r7)     // Catch: android.database.SQLException -> L5e java.lang.Throwable -> L76
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch: android.database.SQLException -> L5e java.lang.Throwable -> L76
            goto L6e
        L5e:
            r0 = move-exception
            goto L62
        L60:
            r0 = move-exception
            r5 = r6
        L62:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L76
            goto L6e
        L66:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L76
            X.C14A6.LIZIZ()     // Catch: java.lang.Throwable -> L76
            goto L70
        L6e:
            if (r5 != 0) goto L72
        L70:
            monitor-exit(r9)
            return
        L72:
            r5.longValue()     // Catch: java.lang.Throwable -> L76
            goto L70
        L76:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L76
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20188713z3.LIZIZ(java.lang.String, java.lang.String):void");
    }
}
