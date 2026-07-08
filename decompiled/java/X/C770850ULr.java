package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.android.live.effect.model.composer.LiveComposerNode;
import com.bytedance.android.live.effect.model.composer.LiveComposerTagNode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0ULr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770850ULr extends SQLiteOpenHelper {
    public C770850ULr(Context context) {
        super(context, "live_composer.db", (SQLiteDatabase.CursorFactory) null, 8);
    }

    public final void LIZLLL(List<LiveComposerNode> list) {
        if (C486790J7d.LIZIZ()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C314590CUv(this, list, null), 3);
            return;
        }
        synchronized (this) {
            try {
                LJFF(C13LP.LLIIII(list));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJFF(List<LiveComposerNode> list) {
        int i;
        int iIntValue;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        String str = null;
        try {
            writableDatabase.beginTransaction();
            writableDatabase.delete("live_composer_node", null, null);
            writableDatabase.delete("sqlite_sequence", "name=?", new String[]{"live_composer_node"});
            writableDatabase.delete("live_composer_tag_node", null, null);
            writableDatabase.delete("sqlite_sequence", "name=?", new String[]{"live_composer_tag_node"});
            writableDatabase.setTransactionSuccessful();
        } finally {
            try {
            } finally {
            }
        }
        writableDatabase.endTransaction();
        for (LiveComposerNode liveComposerNode : list) {
            try {
                writableDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues();
                contentValues.put("use", (Integer) 1);
                writableDatabase.update("live_composer_node", contentValues, "effect_id=?", new String[]{liveComposerNode.resourceId});
                writableDatabase.setTransactionSuccessful();
            } finally {
                try {
                } finally {
                }
            }
            writableDatabase.endTransaction();
            try {
                writableDatabase.beginTransaction();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("panel", liveComposerNode.panel);
                contentValues2.put("effect_id", liveComposerNode.resourceId);
                contentValues2.put("effect_panel_key", liveComposerNode.effectPanelKey);
                contentValues2.put("path", liveComposerNode.path);
                contentValues2.put("update_time", Long.valueOf(liveComposerNode.updateTime));
                if (liveComposerNode.use) {
                    i = 1;
                } else {
                    i = 0;
                }
                contentValues2.put("use", Integer.valueOf(i));
                contentValues2.put("modified", Integer.valueOf(liveComposerNode.modified));
                long jInsertWithOnConflict = writableDatabase.insertWithOnConflict("live_composer_node", str, contentValues2, 5);
                for (LiveComposerTagNode liveComposerTagNode : liveComposerNode.tagList) {
                    String str2 = liveComposerTagNode.resourceId;
                    if (str2.length() == 0) {
                        str2 = liveComposerNode.resourceId;
                    }
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put("tag", liveComposerTagNode.LIZ);
                    contentValues3.put("value", Float.valueOf(liveComposerTagNode.value));
                    Integer num = liveComposerTagNode.uiValue;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = Integer.MIN_VALUE;
                    }
                    contentValues3.put("value_ui", Integer.valueOf(iIntValue));
                    contentValues3.put("resource_id", str2);
                    contentValues3.put("node_id", Long.valueOf(jInsertWithOnConflict));
                    writableDatabase.insertWithOnConflict("live_composer_tag_node", null, contentValues3, 5);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("saveComposerNode, tag：");
                    sbLIZ.append(liveComposerTagNode.LIZ);
                    sbLIZ.append(", modified: ");
                    sbLIZ.append(liveComposerNode.modified);
                    C20441214yg.LIZIZ("BeautyGenderDetect", C2188811AlT.LIZIZ(sbLIZ));
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                try {
                } finally {
                }
            }
            writableDatabase.endTransaction();
            str = null;
        }
        writableDatabase.close();
    }

    public final void LJI(LiveComposerNode liveComposerNode) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            writableDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            contentValues.put("modified", Integer.valueOf(liveComposerNode.modified));
            writableDatabase.update("live_composer_node", contentValues, "effect_id=?", new String[]{liveComposerNode.resourceId});
            writableDatabase.setTransactionSuccessful();
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        writableDatabase.endTransaction();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_composer_node (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,panel TEXT,effect_id TEXT,resource_id TEXT, effect_panel_key TEXT, path TEXT,update_time INTEGER,use INTEGER,modified INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_composer_tag_node(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,tag TEXT,value REAL,value_ui INTEGER,node_id INTEGER,resource_id TEXT)");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r16, kotlin.jvm.functions.Function1<? super java.util.List<com.bytedance.android.live.effect.model.composer.LiveComposerNode>, kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C770850ULr.LIZIZ(java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.execSQL("Drop Table if exists live_composer_node");
        sQLiteDatabase.execSQL("Drop Table if exists live_composer_tag_node");
        onCreate(sQLiteDatabase);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            r0 = 2
            if (r5 >= r0) goto L7
            goto Lb
        L7:
            r0 = 5
            if (r5 >= r0) goto L31
            goto L10
        Lb:
            java.lang.String r0 = "ALTER TABLE live_composer_node ADD COLUMN resource_id TEXT DEFAULT \"\" NOT NULL;"
            r4.execSQL(r0)     // Catch: java.lang.Throwable -> L49
        L10:
            java.lang.String r1 = "SELECT * FROM live_composer_node LIMIT 0"
            r0 = 0
            android.database.Cursor r2 = r4.rawQuery(r1, r0)     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "effect_panel_key"
            int r1 = r2.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L49
            r0 = -1
            if (r1 != r0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            r2.close()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L2d
            java.lang.String r0 = "ALTER TABLE live_composer_node ADD COLUMN effect_panel_key TEXT DEFAULT \"\" NOT NULL;"
            r4.execSQL(r0)     // Catch: java.lang.Throwable -> L49
        L2d:
            r0 = 3
            if (r5 >= r0) goto L31
            goto L39
        L31:
            r0 = 7
            if (r5 < r0) goto L3e
            r0 = 8
            if (r5 >= r0) goto L52
            goto L43
        L39:
            java.lang.String r0 = "ALTER TABLE live_composer_tag_node ADD COLUMN resource_id TEXT DEFAULT \"\" NOT NULL;"
            r4.execSQL(r0)     // Catch: java.lang.Throwable -> L49
        L3e:
            java.lang.String r0 = "ALTER TABLE live_composer_tag_node ADD COLUMN value_ui INTEGER DEFAULT -2147483648 NOT NULL;"
            r4.execSQL(r0)     // Catch: java.lang.Throwable -> L49
        L43:
            java.lang.String r0 = "ALTER TABLE live_composer_node ADD COLUMN modified INTEGER DEFAULT -1 NOT NULL;"
            r4.execSQL(r0)     // Catch: java.lang.Throwable -> L49
            return
        L49:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "LiveComposerSQLiteHelper"
            X.C20441214yg.LJI(r0, r1)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C770850ULr.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a0, code lost:
    
        r1 = r19.tagList;
        r0 = new com.bytedance.android.live.effect.model.composer.LiveComposerTagNode(r5);
        r0.value = r4;
        r0.uiValue = r8;
        r0.resourceId = r3;
        r1.add(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.database.sqlite.SQLiteDatabase r17, java.lang.String r18, com.bytedance.android.live.effect.model.composer.LiveComposerNode r19, java.util.ArrayList<com.bytedance.android.live.effect.model.composer.LiveComposerNode> r20) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C770850ULr.LIZ(android.database.sqlite.SQLiteDatabase, java.lang.String, com.bytedance.android.live.effect.model.composer.LiveComposerNode, java.util.ArrayList):void");
    }
}
