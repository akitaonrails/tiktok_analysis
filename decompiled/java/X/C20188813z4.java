package X;

import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13z4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20188813z4 {
    public static final C20188813z4 LIZ = new C20188813z4();
    public static C816370W0t LIZIZ;

    public static SQLiteDatabase LIZ() {
        try {
            C816370W0t c816370W0t = LIZIZ;
            if (c816370W0t != null) {
                return c816370W0t.getWritableDatabase();
            }
            return null;
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C20221514Aj.LIZIZ();
            Intrinsics.LJIIJJI(e.getMessage(), "ResourceNotFoundException: ");
            return null;
        } catch (SQLiteException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20221514Aj.LIZIZ();
            Intrinsics.LJIIJJI(e2.getMessage(), "SQLite Exception: ");
            return null;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            C20221514Aj.LIZIZ();
            Intrinsics.LJIIJJI(e3.getMessage(), "Exception: ");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ() {
        /*
            r11 = this;
            java.lang.String r1 = "settings"
            monitor-enter(r11)
            android.database.sqlite.SQLiteDatabase r2 = LIZ()     // Catch: java.lang.Throwable -> L3c
            r7 = 0
            if (r2 != 0) goto Lb
            goto L22
        Lb:
            java.lang.String r3 = "h5_storage"
            java.lang.String r0 = "content"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = "primary_key=?"
            java.lang.String[] r6 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L3c
            java.lang.String r10 = "1"
            r8 = r7
            r9 = r7
            android.database.Cursor r3 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L3c
            goto L23
        L22:
            r3 = r7
        L23:
            r2 = 0
            if (r3 == 0) goto L2e
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L3c
            r1 = 1
            if (r0 != r1) goto L2e
            goto L2f
        L2e:
            r1 = 0
        L2f:
            if (r1 == 0) goto L35
            java.lang.String r7 = r3.getString(r2)     // Catch: java.lang.Throwable -> L3c
        L35:
            if (r3 == 0) goto L3a
            r3.close()     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r11)
            return r7
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20188813z4.LIZIZ():java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0W0t] */
    public final void LIZJ(final Context context) {
        synchronized (this) {
            try {
                LIZIZ = new SQLiteOpenHelper(context) { // from class: X.0W0t
                    @Override // android.database.sqlite.SQLiteOpenHelper
                    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                    }

                    @Override // android.database.sqlite.SQLiteOpenHelper
                    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS h5_storage (\n    id INTEGER PRIMARY KEY AUTOINCREMENT,\n    primary_key TEXT,\n    time_stamp LONG, \n    content TEXT\n    )");
                    }

                    @Override // android.database.sqlite.SQLiteOpenHelper
                    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
                        super.onOpen(sQLiteDatabase);
                        if (Build.VERSION.SDK_INT >= 35 && TextUtils.equals("honor", Build.BRAND.toLowerCase()) && sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.execSQL("PRAGMA journal_mode=TRUNCATE");
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[Catch: all -> 0x006c, PHI: r5
      0x0068: PHI (r5v0 java.lang.Long) = (r5v1 java.lang.Long), (r5v2 java.lang.Long) binds: [B:18:0x0064, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x006c, blocks: (B:5:0x0005, B:7:0x0032, B:9:0x0045, B:12:0x0051, B:21:0x0068, B:16:0x0060), top: B:30:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L67
            java.lang.String r3 = "settings"
            monitor-enter(r9)
            java.lang.String r0 = "insertOrUpdate: "
            kotlin.jvm.internal.Intrinsics.LJIIJJI(r3, r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "content: "
            kotlin.jvm.internal.Intrinsics.LJIIJJI(r10, r0)     // Catch: java.lang.Throwable -> L6c
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6c
            r7.<init>()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "primary_key"
            r7.put(r0, r3)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r2 = "time_stamp"
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6c
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L6c
            r7.put(r2, r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "content"
            r7.put(r0, r10)     // Catch: java.lang.Throwable -> L6c
            android.database.sqlite.SQLiteDatabase r8 = LIZ()     // Catch: java.lang.Throwable -> L6c
            r6 = 0
            if (r8 == 0) goto L66
            java.lang.String r2 = "h5_storage"
            java.lang.String r1 = "primary_key=?"
            java.lang.String[] r0 = new java.lang.String[]{r3}     // Catch: android.database.SQLException -> L5f java.lang.Throwable -> L6c
            int r0 = r8.update(r2, r7, r1, r0)     // Catch: android.database.SQLException -> L5f java.lang.Throwable -> L6c
            long r0 = (long) r0     // Catch: android.database.SQLException -> L5f java.lang.Throwable -> L6c
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch: android.database.SQLException -> L5f java.lang.Throwable -> L6c
            if (r5 == 0) goto L66
            long r3 = r5.longValue()     // Catch: android.database.SQLException -> L5c java.lang.Throwable -> L6c
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L68
            if (r8 == 0) goto L66
            java.lang.String r0 = "h5_storage"
            long r0 = r8.insert(r0, r6, r7)     // Catch: android.database.SQLException -> L5c java.lang.Throwable -> L6c
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch: android.database.SQLException -> L5c java.lang.Throwable -> L6c
            goto L63
        L5c:
            r0 = move-exception
            r6 = r5
            goto L60
        L5f:
            r0 = move-exception
        L60:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6c
        L63:
            r5 = r6
            if (r6 != 0) goto L68
        L66:
            monitor-exit(r9)
        L67:
            return
        L68:
            r5.longValue()     // Catch: java.lang.Throwable -> L6c
            goto L66
        L6c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20188813z4.LIZLLL(java.lang.String):void");
    }
}
