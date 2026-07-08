package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VS0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VS0 {
    public static final String[] LIZJ = {"message_id", "arrive_time", "client_intelligence_expire_time", "sender", "handle_by_sdk", "has_been_shown", "push_body"};
    public static C0VS0 LIZLLL;
    public SQLiteDatabase LIZ;
    public final C0VOF LIZIZ;

    public final SQLiteDatabase LJFF() {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        try {
                            this.LIZ = getWritableDatabase();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return this.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0VOF] */
    public C0VS0(final Context context) {
        this.LIZIZ = new SQLiteOpenHelper(context) { // from class: X.0VOF
            @Override // android.database.sqlite.SQLiteOpenHelper
            public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                try {
                    sQLiteDatabase.execSQL("CREATE TABLE message ( message_id BIGINT PRIMARY KEY, arrive_time BIGINT, client_intelligence_expire_time BIGINT, sender INT,handle_by_sdk INT,has_been_shown INT,push_body TEXT )");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("create db exception ");
                    sbLIZ.append(th);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        };
    }

    public static C0VS0 LIZLLL(Context context) {
        if (LIZLLL == null) {
            synchronized (C0VS0.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C0VS0(C786410Ut5.N3(context));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public static void LJI(Cursor cursor) {
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

    public final synchronized void LIZ(C0VS1 c0vs1) {
        C808950VoL.LIZIZ().getClass();
        if (!C808950VoL.LIZ()) {
            return;
        }
        SQLiteDatabase sQLiteDatabaseLJFF = LJFF();
        if (sQLiteDatabaseLJFF != null) {
            try {
                if (sQLiteDatabaseLJFF.isOpen()) {
                    ContentValues contentValuesLIZ = c0vs1.LIZ();
                    Cursor cursorRawQuery = sQLiteDatabaseLJFF.rawQuery("select count(*) from message", null);
                    cursorRawQuery.moveToFirst();
                    long j = cursorRawQuery.getLong(0);
                    LJI(cursorRawQuery);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[addMessageToDb] curMessageCount is ");
                    sbLIZ.append(j);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C808950VoL.LIZIZ().getClass();
                    if (j >= C808950VoL.LIZLLL().LJIILJJIL().LIZIZ) {
                        sQLiteDatabaseLJFF.execSQL("delete from message where message_id in(select message_id from message where has_been_shown=0 limit 1)");
                    }
                    sQLiteDatabaseLJFF.insert("message", null, contentValuesLIZ);
                }
            } finally {
            }
        }
    }

    public final synchronized boolean LIZIZ(long j) {
        C808950VoL.LIZIZ().getClass();
        boolean z = false;
        if (!C808950VoL.LIZ()) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[curMessageHasExists] messageId is ");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        SQLiteDatabase sQLiteDatabaseLJFF = LJFF();
        if (sQLiteDatabaseLJFF != null) {
            try {
                if (sQLiteDatabaseLJFF.isOpen()) {
                    Cursor cursorQuery = null;
                    try {
                        cursorQuery = sQLiteDatabaseLJFF.query("message", LIZJ, "message_id = ?", new String[]{String.valueOf(j)}, null, null, null, null);
                        if (cursorQuery.getCount() >= 1) {
                            z = true;
                        }
                    } finally {
                        try {
                        } catch (Throwable th) {
                        }
                    }
                    LJI(cursorQuery);
                    return z;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return false;
    }

    public final synchronized void LIZJ(long j) {
        C808950VoL.LIZIZ().getClass();
        if (!C808950VoL.LIZ()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - (3600000 * j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[deleteExpiredMsg] lastTimeStamp is ");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(" maxCacheTimeInHour is ");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        SQLiteDatabase sQLiteDatabaseLJFF = LJFF();
        if (sQLiteDatabaseLJFF != null) {
            try {
                if (sQLiteDatabaseLJFF.isOpen()) {
                    sQLiteDatabaseLJFF.delete("message", "arrive_time <= ?", new String[]{String.valueOf(jCurrentTimeMillis)});
                }
            } catch (Throwable th) {
                try {
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008c A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0004, B:7:0x0017, B:10:0x001c, B:17:0x0058, B:27:0x0076, B:38:0x008c, B:42:0x0093, B:35:0x0086, B:36:0x0089, B:31:0x007c, B:12:0x0031, B:14:0x0037, B:15:0x004f, B:21:0x005e, B:23:0x0067, B:25:0x006d), top: B:50:0x0004, inners: #0, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJ(long r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 202300(0x3163c, float:2.83483E-40)
            boolean r6 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)     // Catch: java.lang.Throwable -> L98
            X.0VoL r0 = X.C808950VoL.LIZIZ()     // Catch: java.lang.Throwable -> L98
            r0.getClass()     // Catch: java.lang.Throwable -> L98
            boolean r0 = X.C808950VoL.LIZ()     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L1c
            if (r6 == 0) goto L1a
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()     // Catch: java.lang.Throwable -> L98
        L1a:
            monitor-exit(r7)
            return
        L1c:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = "[markMessageAsShown] messageId is "
            r1.append(r0)     // Catch: java.lang.Throwable -> L98
            r1.append(r8)     // Catch: java.lang.Throwable -> L98
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L98
            android.database.sqlite.SQLiteDatabase r5 = r7.LJFF()     // Catch: java.lang.Throwable -> L98
            if (r5 == 0) goto L91
            boolean r0 = r5.isOpen()     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L91
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L7b
            r4.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "has_been_shown"
            r1 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L7b
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L7b
            r0 = 0
            r3[r0] = r1     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "message"
            java.lang.String r0 = "message_id = ?"
            r5.update(r1, r4, r0, r3)     // Catch: java.lang.IllegalStateException -> L5d java.lang.Throwable -> L7b
            if (r6 == 0) goto L5b
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()     // Catch: java.lang.Throwable -> L98
        L5b:
            monitor-exit(r7)
            return
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7b
            android.database.sqlite.SQLiteDatabase r2 = r7.LJFF()     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L8a
            boolean r0 = r2.isOpen()     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L8a
            java.lang.String r1 = "message"
            java.lang.String r0 = "message_id = ?"
            r2.update(r1, r4, r0, r3)     // Catch: java.lang.Throwable -> L7b
            if (r6 == 0) goto L79
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()     // Catch: java.lang.Throwable -> L98
        L79:
            monitor-exit(r7)
            return
        L7b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L80
            goto L8a
        L80:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L80
            if (r6 == 0) goto L89
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()     // Catch: java.lang.Throwable -> L98
        L89:
            throw r0     // Catch: java.lang.Throwable -> L98
        L8a:
            if (r6 == 0) goto L8f
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()     // Catch: java.lang.Throwable -> L98
        L8f:
            monitor-exit(r7)
            return
        L91:
            if (r6 == 0) goto L96
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()     // Catch: java.lang.Throwable -> L98
        L96:
            monitor-exit(r7)
            return
        L98:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VS0.LJ(long):void");
    }
}
