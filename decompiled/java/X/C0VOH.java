package X;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* JADX INFO: renamed from: X.0VOH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VOH implements InterfaceC796970VOd {
    public final SQLiteDatabase LIZ;
    public final String LIZIZ;
    public final C0VOG LIZJ;
    public final boolean LIZLLL;

    @Override // X.InterfaceC796970VOd
    public final boolean clear() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = this.LIZ;
        if (sQLiteDatabase2 == null) {
            return false;
        }
        try {
            sQLiteDatabase2.beginTransaction();
            try {
                try {
                    this.LIZ.execSQL(C786410Ut5.j4("DELETE FROM %s ", new Object[]{this.LIZIZ}));
                    this.LIZ.setTransactionSuccessful();
                    int i = C2187451AjH.LIZ;
                    TTVideoEngineLog.d("KVDBManager", "all cleared");
                    sQLiteDatabase = this.LIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i2 = C2187451AjH.LIZ;
                    TTVideoEngineLog.d(e);
                    sQLiteDatabase = this.LIZ;
                }
                sQLiteDatabase.endTransaction();
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZ.endTransaction();
                throw th;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i3 = C2187451AjH.LIZ;
            TTVideoEngineLog.d(e2);
            return false;
        }
    }

    @Override // X.InterfaceC796970VOd
    public final boolean LIZ(String str) {
        return LIZJ(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:21:0x006b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final java.lang.String LIZIZ(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r4 = "KVDBManager"
            r3 = 0
            if (r0 != 0) goto L6e
            android.database.sqlite.SQLiteDatabase r0 = r6.LIZ
            if (r0 == 0) goto L6e
            java.lang.String r5 = "SELECT * FROM %s WHERE key='%s'"
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L6b
            java.lang.String r1 = r6.LIZIZ     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L6b
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L6b
            r0 = 1
            r2[r0] = r7     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L6b
            java.lang.String r1 = X.C786410Ut5.j4(r5, r2)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L6b
            android.database.sqlite.SQLiteDatabase r0 = r6.LIZ     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L6b
            android.database.Cursor r1 = r0.rawQuery(r1, r3)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L6b
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L6b
            if (r0 == 0) goto L36
            java.lang.String r0 = "value"
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L6b
            java.lang.String r2 = r1.getString(r0)     // Catch: java.lang.Exception -> L5a java.lang.Throwable -> L6b
            goto L37
        L36:
            r2 = r3
        L37:
            r1.close()     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L65
            int r0 = X.C2187451AjH.LIZ     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L65
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L65
            java.lang.String r0 = "get key: "
            r1.append(r0)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L65
            r1.append(r7)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L65
            java.lang.String r0 = " value: "
            r1.append(r0)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L65
            r1.append(r2)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L65
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L65
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r4, r0)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L65
            return r2
        L58:
            r1 = move-exception
            goto L5c
        L5a:
            r1 = move-exception
            r2 = r3
        L5c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L65
            int r0 = X.C2187451AjH.LIZ     // Catch: java.lang.Throwable -> L65
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r1)     // Catch: java.lang.Throwable -> L65
            return r3
        L65:
            r0 = move-exception
            r3 = r2
        L67:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6b
            goto L6d
        L6b:
            r0 = move-exception
            goto L67
        L6d:
            return r3
        L6e:
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r0 = "open db fail"
            X.C1471660oOq.LIZIZ(r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VOH.LIZIZ(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[Catch: all -> 0x007d, TryCatch #5 {all -> 0x007d, blocks: (B:7:0x0010, B:9:0x002e, B:22:0x0060, B:24:0x0067, B:25:0x007a), top: B:44:0x0010 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005c -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r3 = "remove key "
            android.database.sqlite.SQLiteDatabase r0 = r7.LIZ
            java.lang.String r2 = "KVDBManager"
            r6 = 0
            if (r0 == 0) goto L90
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L90
            r5 = 1
            android.database.sqlite.SQLiteDatabase r0 = r7.LIZ     // Catch: java.lang.Throwable -> L7d
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "DELETE FROM %s WHERE key='%s'"
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5c
            java.lang.String r0 = r7.LIZIZ     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5c
            r1[r6] = r0     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5c
            r1[r5] = r8     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5c
            java.lang.String r1 = X.C786410Ut5.j4(r4, r1)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5c
            android.database.sqlite.SQLiteDatabase r0 = r7.LIZ     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5c
            r0.execSQL(r1)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5c
            android.database.sqlite.SQLiteDatabase r0 = r7.LIZ     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5c
            r0.setTransactionSuccessful()     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L5c
            android.database.sqlite.SQLiteDatabase r0 = r7.LIZ     // Catch: java.lang.Throwable -> L7d
            r0.endTransaction()     // Catch: java.lang.Throwable -> L7d
            int r0 = X.C2187451AjH.LIZ     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L7d
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            r0.append(r8)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)     // Catch: java.lang.Throwable -> L7d
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r2, r0)     // Catch: java.lang.Throwable -> L7d
            return r5
        L47:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L5c
            int r0 = X.C2187451AjH.LIZ     // Catch: java.lang.Throwable -> L59
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r1)     // Catch: java.lang.Throwable -> L59
            android.database.sqlite.SQLiteDatabase r0 = r7.LIZ     // Catch: java.lang.Throwable -> L56
            r0.endTransaction()     // Catch: java.lang.Throwable -> L56
            return r6
        L56:
            r1 = move-exception
            r6 = 1
            goto L7e
        L59:
            r0 = move-exception
            r6 = 1
            goto L5d
        L5c:
            r0 = move-exception
        L5d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5c
            android.database.sqlite.SQLiteDatabase r0 = r7.LIZ     // Catch: java.lang.Throwable -> L7d
            r0.endTransaction()     // Catch: java.lang.Throwable -> L7d
            if (r6 != 0) goto L7a
            int r0 = X.C2187451AjH.LIZ     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L7d
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            r0.append(r8)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)     // Catch: java.lang.Throwable -> L7d
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r2, r0)     // Catch: java.lang.Throwable -> L7d
        L7a:
            r0 = r6 ^ 1
            return r0
        L7d:
            r1 = move-exception
        L7e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L89
            int r0 = X.C2187451AjH.LIZ     // Catch: java.lang.Throwable -> L89
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r1)     // Catch: java.lang.Throwable -> L89
            r0 = r6 ^ 1
            return r0
        L89:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L89
            r0 = r6 ^ 1
            return r0
        L90:
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r0 = "open db fail"
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VOH.LIZJ(java.lang.String):boolean");
    }

    @Override // X.InterfaceC796970VOd
    public final String getString(String str) {
        return LIZIZ(str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0VOG, android.database.sqlite.SQLiteOpenHelper] */
    public C0VOH(final Context context, final String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            this.LIZIZ = str;
            ?? r0 = new SQLiteOpenHelper(context, str) { // from class: X.0VOG
                public static final Integer LL = 1;

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                }

                {
                    int iIntValue = LL.intValue();
                }
            };
            this.LIZJ = r0;
            try {
                SQLiteDatabase writableDatabase = r0.getWritableDatabase();
                this.LIZ = writableDatabase;
                if (writableDatabase != null) {
                    writableDatabase.execSQL(C786410Ut5.j4("CREATE TABLE IF NOT EXISTS %s(key TEXT PRIMARY KEY,value TEXT,time INTEGER)", new Object[]{str}));
                }
                this.LIZLLL = true;
                return;
            } catch (Throwable th) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    int i = C2187451AjH.LIZ;
                    TTVideoEngineLog.d(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("create db fail, table name ");
                    sbLIZ.append(this.LIZIZ);
                    C1471660oOq.LIZIZ("KVDBManager", C2188811AlT.LIZIZ(sbLIZ));
                    if (this.LIZJ == null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("create db fail, mHelper == null, table name ");
                        sbLIZ2.append(this.LIZIZ);
                        C1471660oOq.LIZIZ("KVDBManager", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    this.LIZLLL = false;
                    return;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (this.LIZJ == null) {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("create db fail, mHelper == null, table name ");
                        sbLIZ3.append(this.LIZIZ);
                        C1471660oOq.LIZIZ("KVDBManager", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    this.LIZLLL = this.LIZJ != null;
                    throw th2;
                }
            }
        }
        int i3 = C2187451AjH.LIZ;
        C1471660oOq.LIZIZ("KVDBManager", "context or name is invalid");
    }

    public final boolean LIZLLL(String str, String str2) {
        boolean z;
        if (this.LIZ != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("save key: ");
            sbLIZ.append(str);
            sbLIZ.append(" value: ");
            sbLIZ.append(str2);
            C1471660oOq.LIZJ("KVDBManager", C2188811AlT.LIZIZ(sbLIZ));
            try {
                this.LIZ.beginTransaction();
                try {
                    try {
                        try {
                            this.LIZ.execSQL(C786410Ut5.j4("REPLACE INTO %s VALUES ('%s','%s',%d)", new Object[]{this.LIZIZ, str, str2, Long.valueOf(System.currentTimeMillis())}));
                            this.LIZ.setTransactionSuccessful();
                            this.LIZ.endTransaction();
                            return true;
                        } catch (IllegalStateException e) {
                            TryCatchGuardChecker.doCheck(e);
                            int i2 = C2187451AjH.LIZ;
                            TTVideoEngineLog.d(e);
                            this.LIZ.endTransaction();
                            return true;
                        }
                    } catch (SQLException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        int i3 = C2187451AjH.LIZ;
                        TTVideoEngineLog.d(e2);
                        try {
                            this.LIZ.endTransaction();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                int i4 = C2187451AjH.LIZ;
                                TTVideoEngineLog.d(th);
                                return !z;
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                return !z;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    this.LIZ.endTransaction();
                    return true;
                }
            } catch (Throwable th4) {
                th = th4;
                z = false;
                TryCatchGuardChecker.doCheck(th);
                int i42 = C2187451AjH.LIZ;
                TTVideoEngineLog.d(th);
                return !z;
            }
        }
        int i5 = C2187451AjH.LIZ;
        C1471660oOq.LIZIZ("KVDBManager", "open db fail");
        return false;
    }

    @Override // X.InterfaceC796970VOd
    public final boolean putString(String str, String str2) {
        return LIZLLL(str, str2);
    }
}
