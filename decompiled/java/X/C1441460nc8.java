package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModelExtKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0nc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441460nc8 extends SQLiteOpenHelper {
    public static C1441460nc8 LL;

    public final List<C1441520ncE> LIZLLL() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = getReadableDatabase().query("frames_table", new String[]{"aweme_id", "video_id", "zip_uri", "zip_path", "extract_model", "union_id", "update_time", "match_factors", "is_draft", "origin", "vframe_type", "is_backup", "query_times", "aweme_type_2"}, null, null, null, null, "update_time desc");
                arrayList.addAll(LJI(cursorQuery));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (e instanceof SQLiteBlobTooBigException) {
                    C201955140j.LJ("VideoFramesSQLiteHelper > Row too big to fit into CursorWindow");
                    if (Build.VERSION.SDK_INT >= 28) {
                        SettingsManager.LIZLLL().getClass();
                        if (SettingsManager.LIZ("enlarge_cursor_window_db_frame", false)) {
                            C201955140j.LJ("VideoFramesSQLiteHelper > enlarge cursor window, and query again");
                            List<C1441520ncE> listLJFF = LJFF();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return listLJFF;
                        }
                    }
                }
                if (cursorQuery != null) {
                }
                return arrayList;
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final List<C1441520ncE> LJFF() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = getReadableDatabase().query("frames_table", new String[]{"aweme_id", "video_id", "zip_uri", "zip_path", "extract_model", "union_id", "update_time", "match_factors", "is_draft", "origin", "is_backup", "query_times", "aweme_type_2"}, null, null, null, null, null);
                ((AbstractWindowedCursor) cursorQuery).setWindow(new CursorWindow("frame_cursor_window", 3170304L));
                arrayList.addAll(LJI(cursorQuery));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJ("VideoFramesSQLiteHelper > enlarge cursor window, query failed");
                if (cursorQuery != null) {
                }
                return arrayList;
            }
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public C1441460nc8(Context context) {
        super(context, "frames_table", (SQLiteDatabase.CursorFactory) null, 5);
    }

    public static C1441460nc8 LIZIZ(Context context) {
        if (LL == null) {
            synchronized (C1441460nc8.class) {
                try {
                    if (LL == null) {
                        LL = new C1441460nc8(C786410Ut5.N3(context));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LL;
    }

    public static List LJI(Cursor cursor) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            C1441400nc2 c1441400nc2 = new C1441400nc2();
            c1441400nc2.LIZ = cursor.getString(cursor.getColumnIndex("aweme_id"));
            c1441400nc2.LIZJ = cursor.getString(cursor.getColumnIndex("video_id"));
            c1441400nc2.LIZLLL = cursor.getString(cursor.getColumnIndex("zip_uri"));
            c1441400nc2.LJ = cursor.getString(cursor.getColumnIndex("zip_path"));
            c1441400nc2.LJFF = ExtractFramesModelExtKt.string2Model(cursor.getString(cursor.getColumnIndex("extract_model")));
            c1441400nc2.LJII = cursor.getString(cursor.getColumnIndex("union_id"));
            c1441400nc2.LJI = cursor.getLong(cursor.getColumnIndex("update_time"));
            c1441400nc2.LJIIIIZZ = cursor.getInt(cursor.getColumnIndex("match_factors"));
            boolean z2 = false;
            if (cursor.getInt(cursor.getColumnIndex("is_draft")) == 1) {
                z = true;
            } else {
                z = false;
            }
            c1441400nc2.LJIIIZ = z;
            c1441400nc2.LJIIJ = cursor.getInt(cursor.getColumnIndex("origin"));
            if (cursor.getInt(cursor.getColumnIndex("is_backup")) == 1) {
                z2 = true;
            }
            c1441400nc2.LJIIJJI = z2;
            c1441400nc2.LJIIL = cursor.getInt(cursor.getColumnIndex("query_times"));
            c1441400nc2.LIZIZ = cursor.getInt(cursor.getColumnIndex("aweme_type_2"));
            c1441400nc2.LJIILIIL = cursor.getInt(cursor.getColumnIndex("vframe_type"));
            arrayList.add(c1441400nc2.LIZ());
        }
        return arrayList;
    }

    public final void LIZ(C1441410nc3 c1441410nc3) {
        for (C1441520ncE c1441520ncE : (ArrayList) c1441410nc3.LIZ) {
            if (c1441520ncE.LJI == null) {
                String str = c1441520ncE.LIZ;
                if (!TextUtils.isEmpty(str)) {
                    getWritableDatabase().delete("frames_table", "aweme_id = ?", new String[]{str});
                    return;
                }
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("aweme_id", c1441520ncE.LIZ);
            String str2 = c1441520ncE.LIZLLL;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("video_id", str2);
            contentValues.put("zip_uri", c1441520ncE.LJ);
            contentValues.put("zip_path", c1441520ncE.LJFF);
            contentValues.put("extract_model", c1441520ncE.LJI.toString());
            contentValues.put("union_id", c1441520ncE.LJIIIIZZ);
            contentValues.put("update_time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("match_factors", Integer.valueOf(c1441520ncE.LJIIIZ));
            if (c1441520ncE.LJIIJ) {
                contentValues.put("is_draft", (Integer) 1);
            } else {
                contentValues.put("is_draft", (Integer) 0);
            }
            contentValues.put("origin", Integer.valueOf(c1441520ncE.LJIIJJI));
            if (c1441520ncE.LJIIL) {
                contentValues.put("is_backup", (Integer) 1);
            } else {
                contentValues.put("is_backup", (Integer) 0);
            }
            contentValues.put("query_times", Integer.valueOf(c1441520ncE.LJIILIIL));
            contentValues.put("aweme_type_2", Integer.valueOf(c1441520ncE.LIZIZ));
            contentValues.put("vframe_type", Integer.valueOf(c1441520ncE.LIZJ));
            getWritableDatabase().replace("frames_table", null, contentValues);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `frames_table` (\n\t`aweme_id`\tTEXT NOT NULL PRIMARY KEY UNIQUE,\n\taweme_type_2\tINTEGER,\n\t`video_id`\tTEXT NOT NULL,\n\t`zip_uri`\tTEXT NOT NULL,\n\t`zip_path`\tTEXT NOT NULL,\n\t`extract_model`\tTEXT NOT NULL,\n\t`union_id`\tTEXT,\n\t`match_factors`\tINTEGER,\n\t`is_draft`\tINTEGER,\n\t`origin`\tINTEGER,\n\t`vframe_type`\tINTEGER,\n\t`is_backup`\tINTEGER,\n\t`query_times`\tINTEGER,\n\t`update_time`\tLONG NOT NULL\n);");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
        /*
            r3 = this;
            r0 = 2
            if (r5 >= r0) goto L5d
            if (r5 == r6) goto La
            java.lang.String r0 = "ALTER TABLE frames_table ADD COLUMN union_id TEXT"
            r4.execSQL(r0)
        La:
            if (r5 == r6) goto L25
            java.lang.String r0 = "ALTER TABLE frames_table ADD COLUMN match_factors INTEGER"
            r4.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE frames_table ADD COLUMN is_draft INTEGER"
            r4.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE frames_table ADD COLUMN origin INTEGER"
            r4.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE frames_table ADD COLUMN is_backup INTEGER"
            r4.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE frames_table ADD COLUMN query_times INTEGER"
            r4.execSQL(r0)
        L25:
            if (r5 == r6) goto L2c
            java.lang.String r0 = "ALTER TABLE frames_table ADD COLUMN aweme_type_2 INTEGER DEFAULT -1"
            r4.execSQL(r0)
        L2c:
            if (r5 == r6) goto L33
            java.lang.String r0 = "ALTER TABLE frames_table ADD COLUMN vframe_type INTEGER DEFAULT 1"
            r4.execSQL(r0)
        L33:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0nYH r0 = r0.getPublishService()
            X.0nVl r2 = r0.LJJLIIIJ()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "upgrade from "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " to "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "extract_frame_db"
            r2.LIZ(r0, r1)
            return
        L5d:
            r0 = 3
            if (r5 < r0) goto La
            r0 = 4
            if (r5 < r0) goto L25
            r0 = 5
            if (r5 >= r0) goto L33
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1441460nc8.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
