package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;

/* JADX INFO: renamed from: X.0ncG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441540ncG extends SQLiteOpenHelper {
    public static C1441540ncG LL;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x00ba
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final java.util.ArrayList<com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask> LIZIZ() {
        /*
            r19 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r11 = r19.getReadableDatabase()
            java.lang.String r12 = "OriginalSound"
            java.lang.String r1 = "aweme_id"
            java.lang.String r2 = "vid"
            java.lang.String r3 = "audio_path"
            java.lang.String r4 = "union_id"
            java.lang.String r5 = "update_time"
            java.lang.String r6 = "match_factors"
            java.lang.String r7 = "is_draft"
            java.lang.String r8 = "origin"
            java.lang.String r9 = "is_backup"
            java.lang.String r10 = "query_times"
            java.lang.String[] r13 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            r14 = 0
            java.lang.String r18 = "update_time desc"
            r15 = r14
            r16 = r14
            r17 = r14
            android.database.Cursor r1 = r11.query(r12, r13, r14, r15, r16, r17, r18)
        L2f:
            r11 = 0
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> Lb2
            if (r2 == 0) goto Lae
            com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask r4 = new com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "aweme_id"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "vid"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r6 = r1.getString(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "audio_path"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r7 = r1.getString(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "update_time"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb2
            long r8 = r1.getLong(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "union_id"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r10 = r1.getString(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "match_factors"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb2
            int r12 = r1.getInt(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "is_draft"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb2
            int r2 = r1.getInt(r2)     // Catch: java.lang.Throwable -> Lb2
            r3 = 1
            if (r2 != r3) goto L83
            r13 = 1
            goto L84
        L83:
            r13 = 0
        L84:
            java.lang.String r2 = "origin"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb2
            int r14 = r1.getInt(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r2 = "is_backup"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb2
            int r2 = r1.getInt(r2)     // Catch: java.lang.Throwable -> Lb2
            if (r2 != r3) goto L9c
            r15 = 1
            goto L9d
        L9c:
            r15 = 0
        L9d:
            java.lang.String r2 = "query_times"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Throwable -> Lb2
            int r16 = r1.getInt(r2)     // Catch: java.lang.Throwable -> Lb2
            r4.<init>(r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> Lb2
            r0.add(r4)     // Catch: java.lang.Throwable -> Lb2
            goto L2f
        Lae:
            X.C2107108Nh.LIZ(r1, r11)
            return r0
        Lb2:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> Lba
            throw r2     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r0 = move-exception
            r11 = r2
            goto Lbb
        Lba:
            r0 = move-exception
        Lbb:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lba
            X.C2107108Nh.LIZ(r1, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1441540ncG.LIZIZ():java.util.ArrayList");
    }

    public C1441540ncG(Context context) {
        super(context, "OriginalSound", (SQLiteDatabase.CursorFactory) null, 3);
    }

    public final void LIZ(OriginalSoundUploadTask originalSoundUploadTask) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("aweme_id", originalSoundUploadTask.awemeId);
        contentValues.put("vid", originalSoundUploadTask.vid);
        contentValues.put("audio_path", originalSoundUploadTask.originalSoundPath);
        contentValues.put("audio_vid", originalSoundUploadTask.audioVid);
        contentValues.put("update_time", Long.valueOf(originalSoundUploadTask.updateTime));
        contentValues.put("union_id", originalSoundUploadTask.unionId);
        contentValues.put("match_factors", Integer.valueOf(originalSoundUploadTask.matchFactors));
        contentValues.put("is_draft", Integer.valueOf(originalSoundUploadTask.isDraft ? 1 : 0));
        contentValues.put("origin", Integer.valueOf(originalSoundUploadTask.origin));
        contentValues.put("is_backup", Integer.valueOf(originalSoundUploadTask.isBackup ? 1 : 0));
        contentValues.put("query_times", Integer.valueOf(originalSoundUploadTask.queryTimes));
        getWritableDatabase().replace("OriginalSound", null, contentValues);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `OriginalSound` (\n\t`aweme_id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\t`vid`\tTEXT NOT NULL,\n\t`audio_path`\tTEXT NOT NULL,\n\t`audio_vid`\tTEXT,\n\t`union_id`\tTEXT,\n\t`match_factors`\tINTEGER,\n\t`is_draft`\tINTEGER,\n\t`origin`\tINTEGER,\n\t`is_backup`\tINTEGER,\n\t`query_times`\tINTEGER,\n\t`update_time`\tLONG NOT NULL\n);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2) {
            if (i != i2) {
                sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN union_id TEXT");
            }
        } else if (i >= 3) {
            return;
        }
        if (i != i2) {
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN match_factors INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN is_draft INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN origin INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN is_backup INTEGER");
            sQLiteDatabase.execSQL("ALTER TABLE OriginalSound ADD COLUMN query_times INTEGER");
        }
    }
}
