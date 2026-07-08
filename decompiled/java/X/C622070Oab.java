package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bulletin.db.api.IBulletinClientBridge;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.io.File;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Oab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622070Oab {
    public SQLiteDatabase LIZIZ;
    public AbstractC622560ObO LIZJ;
    public final InterfaceC622260Oau LIZ = C622190Oan.LIZ;
    public String LIZLLL = "";

    public final synchronized SQLiteDatabase LJ() {
        AbstractC622560ObO abstractC622560ObO;
        if (this.LIZJ == null) {
            this.LIZ.LIZ();
            C622290Oax.LJFF("BulletinDBHelper", "openHelper is Null. Init not finished");
        } else if (!Intrinsics.LJFF(this.LIZLLL, LIZLLL())) {
            this.LIZ.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ResetOpenHelper by DB name change: ");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(" -> ");
            sbLIZ.append(LIZLLL());
            C622290Oax.LJFF("BulletinDBHelper", C2188811AlT.LIZIZ(sbLIZ));
            LJIIIIZZ();
        }
        abstractC622560ObO = this.LIZJ;
        return abstractC622560ObO != null ? abstractC622560ObO.LJ() : null;
    }

    public final synchronized void LJFF() {
        IBulletinClientBridge iBulletinClientBridgeLIZIZ = this.LIZ.LIZIZ();
        if (iBulletinClientBridgeLIZIZ != null) {
            iBulletinClientBridgeLIZIZ.LIZ();
        }
        try {
            if (this.LIZJ == null) {
                this.LIZJ = LIZIZ(this.LIZ);
            }
            if (!Intrinsics.LJFF(this.LIZLLL, LIZLLL())) {
                this.LIZ.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ResetOpenHelper by DB name change: ");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(" -> ");
                sbLIZ.append(LIZLLL());
                C622290Oax.LJFF("BulletinDBHelper", C2188811AlT.LIZIZ(sbLIZ));
                LJIIIIZZ();
            }
            this.LIZ.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getOpenHelper: ");
            sbLIZ2.append(this.LIZJ);
            C622290Oax.LJFF("BulletinDBHelper", C2188811AlT.LIZIZ(sbLIZ2));
            AbstractC622560ObO abstractC622560ObO = this.LIZJ;
            SQLiteDatabase sQLiteDatabaseLJ = abstractC622560ObO != null ? abstractC622560ObO.LJ() : null;
            this.LIZIZ = sQLiteDatabaseLJ;
            if (sQLiteDatabaseLJ == null || this.LIZJ == null) {
                throw new Exception("openHelper.writableDatabase return null");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null || !(a0.LJJIIZI(message, "encrypted", false) || a0.LJJIIZI(message, "not a database", false) || a0.LJJIIZI(message, "corrupt", false))) {
                this.LIZJ = null;
                throw e;
            }
            this.LIZ.LIZ();
            C622290Oax.LIZJ("BulletinDBHelper", "delete db file by password Error", e);
            C622160Oak.LIZJ(LIZLLL());
            LIZJ();
            LJIIIIZZ();
            AbstractC622560ObO abstractC622560ObO2 = this.LIZJ;
            this.LIZIZ = abstractC622560ObO2 != null ? abstractC622560ObO2.LJ() : null;
            String strLIZLLL = LIZLLL();
            C622160Oak.LIZIZ().storeInt(C622160Oak.LIZ(strLIZLLL), 0);
            C622160Oak.LIZIZ().storeLong(C622160Oak.LIZLLL(strLIZLLL), System.currentTimeMillis());
        }
    }

    @InterfaceC1294060jmO
    public final synchronized void LIZJ() {
        Context applicationContext;
        File databasePath;
        String strLIZLLL = LIZLLL();
        if (Intrinsics.LJFF(strLIZLLL, "null")) {
            return;
        }
        C622210Oap c622210Oap = new C622210Oap("db_delete", this.LIZ);
        IBulletinClientBridge iBulletinClientBridgeLIZIZ = this.LIZ.LIZIZ();
        if (iBulletinClientBridgeLIZIZ == null || (applicationContext = iBulletinClientBridgeLIZIZ.getApplicationContext()) == null || (databasePath = applicationContext.getDatabasePath(strLIZLLL)) == null || !databasePath.exists()) {
            c622210Oap.LIZ(EnumC622250Oat.DB_SCENE_FAIL, "", "delete_by_password");
        } else {
            SQLiteDatabase.LJIILLIIL(databasePath);
            this.LIZ.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("delete db file success: ");
            sbLIZ.append(databasePath.getAbsolutePath());
            C622290Oax.LJFF("BulletinDBHelper", C2188811AlT.LIZIZ(sbLIZ));
            c622210Oap.LIZ(EnumC622250Oat.DB_SCENE_SUCCESS, "", null);
        }
    }

    public final String LIZLLL() {
        String uid;
        IBulletinClientBridge iBulletinClientBridgeLIZIZ = this.LIZ.LIZIZ();
        if (iBulletinClientBridgeLIZIZ == null || (uid = iBulletinClientBridgeLIZIZ.getUid()) == null || uid.length() == 0 || Intrinsics.LJFF(uid, CardStruct.IStatusCode.DEFAULT)) {
            this.LIZ.LIZ();
            C622290Oax.LJFF("BulletinDBHelper", "getDBName, uid invalid");
            return "null";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uid);
        sbLIZ.append('_');
        sbLIZ.append("bulletin_board.db");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIIIIZZ() {
        AbstractC622560ObO abstractC622560ObO = this.LIZJ;
        if (abstractC622560ObO != null) {
            abstractC622560ObO.close();
        }
        this.LIZJ = null;
        this.LIZIZ = null;
        this.LIZJ = LIZIZ(this.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJI(SQLiteDatabase sQLiteDatabase) {
        String strLIZIZ;
        String strLJJJ = C13LQ.LJJJ(EnumC622090Oad.values(), null, null, null, AFwS240S0000000_9.get$arr$(0), 31);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CREATE TABLE IF NOT EXISTS bulletin_board_channel_base (");
        sbLIZ.append(strLJJJ);
        sbLIZ.append(')');
        sQLiteDatabase.LJJ(C2188811AlT.LIZIZ(sbLIZ), null);
        String strLJJJ2 = C13LQ.LJJJ(EnumC622110Oaf.values(), null, null, null, AFwS240S0000000_9.get$arr$(2), 31);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("CREATE TABLE IF NOT EXISTS bulletin_board_channel_ui (");
        sbLIZ2.append(strLJJJ2);
        sbLIZ2.append(",FOREIGN KEY (bulletin_board_id) REFERENCES bulletin_board_channel_base(bulletin_board_id) ON DELETE CASCADE)");
        sQLiteDatabase.LJJ(C2188811AlT.LIZIZ(sbLIZ2), null);
        String strLJJJ3 = C13LQ.LJJJ(EnumC622100Oae.values(), null, null, null, AFwS240S0000000_9.get$arr$(1), 31);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("CREATE TABLE IF NOT EXISTS bulletin_board_channel_setting (");
        sbLIZ3.append(strLJJJ3);
        sbLIZ3.append(",FOREIGN KEY (bulletin_board_id) REFERENCES bulletin_board_channel_base(bulletin_board_id) ON DELETE CASCADE)");
        sQLiteDatabase.LJJ(C2188811AlT.LIZIZ(sbLIZ3), null);
        String strLJJJ4 = C13LQ.LJJJ(EnumC621930OaN.values(), null, null, null, AFwS240S0000000_9.get$arr$(3), 31);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("CREATE TABLE IF NOT EXISTS bulletin_item_base (");
        sbLIZ4.append(strLJJJ4);
        sbLIZ4.append(",FOREIGN KEY (bulletin_board_id) REFERENCES bulletin_board(id) ON DELETE CASCADE)");
        sQLiteDatabase.LJJ(C2188811AlT.LIZIZ(sbLIZ4), null);
        String strLJJJ5 = C13LQ.LJJJ(EnumC621870OaH.values(), null, null, null, AFwS240S0000000_9.get$arr$(4), 31);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("CREATE TABLE IF NOT EXISTS bulletin_item_content (");
        sbLIZ5.append(strLJJJ5);
        sbLIZ5.append(",PRIMARY KEY (item_id, contentKey),FOREIGN KEY (item_id) REFERENCES bulletin_item_base(item_id) ON DELETE CASCADE)");
        sQLiteDatabase.LJJ(C2188811AlT.LIZIZ(sbLIZ5), null);
        String strLJJJ6 = C13LQ.LJJJ(EnumC621910OaL.values(), null, null, null, AFwS240S0000000_9.get$arr$(5), 31);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("CREATE TABLE IF NOT EXISTS bulletin_item_interaction (");
        sbLIZ6.append(strLJJJ6);
        sbLIZ6.append(",FOREIGN KEY (item_id) REFERENCES bulletin_item_base(item_id) ON DELETE CASCADE)");
        sQLiteDatabase.LJJ(C2188811AlT.LIZIZ(sbLIZ6), null);
        sQLiteDatabase.LJJ(C622240Oas.LIZ(), null);
        sQLiteDatabase.LJJ(C622230Oar.LIZ(), null);
        for (EnumC622130Oah enumC622130Oah : EnumC622130Oah.values()) {
            if (enumC622130Oah instanceof EnumC622130Oah) {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("CREATE INDEX ");
                sbLIZ7.append(enumC622130Oah.getIndexName());
                sbLIZ7.append(" ON ");
                sbLIZ7.append("bulletin_board_channel_base");
                sbLIZ7.append('(');
                sbLIZ7.append(enumC622130Oah.getColumns());
                sbLIZ7.append(')');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
            } else if (enumC622130Oah instanceof C0CA8) {
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("CREATE INDEX ");
                C0CA8 c0ca8 = (C0CA8) enumC622130Oah;
                sbLIZ8.append(c0ca8.getIndexName());
                sbLIZ8.append(" ON ");
                sbLIZ8.append("bulletin_board_channel_base");
                sbLIZ8.append('(');
                sbLIZ8.append(c0ca8.getColumns());
                sbLIZ8.append(')');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
            } else if (enumC622130Oah instanceof C0CAA) {
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("CREATE INDEX ");
                C0CAA c0caa = (C0CAA) enumC622130Oah;
                sbLIZ9.append(c0caa.getIndexName());
                sbLIZ9.append(" ON ");
                sbLIZ9.append("bulletin_board_channel_base");
                sbLIZ9.append('(');
                sbLIZ9.append(c0caa.getColumns());
                sbLIZ9.append(')');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ9);
            } else if (enumC622130Oah instanceof C0CA7) {
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("CREATE INDEX ");
                C0CA7 c0ca7 = (C0CA7) enumC622130Oah;
                sbLIZ10.append(c0ca7.getIndexName());
                sbLIZ10.append(" ON ");
                sbLIZ10.append("bulletin_board_channel_base");
                sbLIZ10.append('(');
                sbLIZ10.append(c0ca7.getColumns());
                sbLIZ10.append(')');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ10);
            } else {
                throw new IllegalArgumentException("Unsupported index type");
            }
            sQLiteDatabase.LJJ(strLIZIZ, null);
        }
    }

    public static boolean LJIIIZ(SQLiteDatabase sQLiteDatabase) throws Throwable {
        Throwable th = null;
        C908020Zjk c908020ZjkLJJLL = sQLiteDatabase.LJJLL("SELECT name FROM sqlite_master WHERE type='table' AND name=?", new String[]{"bulletin_item_content"}, null);
        try {
            boolean zMoveToPosition = c908020ZjkLJJLL.moveToPosition(0);
            C2107108Nh.LIZ(c908020ZjkLJJLL, null);
            return zMoveToPosition;
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
                try {
                    throw th2;
                } catch (Throwable th3) {
                    th = th3;
                    th = th2;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(c908020ZjkLJJLL, th);
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final synchronized C622300Oay LIZIZ(InterfaceC622260Oau interfaceC622260Oau) {
        C622300Oay c622300OayLIZ;
        String strLIZLLL = LIZLLL();
        int i = C622300Oay.LLJILJIL;
        c622300OayLIZ = C622310Oaz.LIZ(interfaceC622260Oau, strLIZLLL);
        this.LIZLLL = strLIZLLL;
        return c622300OayLIZ;
    }

    public static boolean LIZ(SQLiteDatabase sQLiteDatabase, String str, String str2) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PRAGMA table_info(");
        sbLIZ.append(str);
        sbLIZ.append(')');
        Throwable th = null;
        C908020Zjk c908020ZjkLJJLL = sQLiteDatabase.LJJLL(C2188811AlT.LIZIZ(sbLIZ), null, null);
        try {
            int columnIndex = c908020ZjkLJJLL.getColumnIndex("name");
            if (columnIndex == -1) {
                C2107108Nh.LIZ(c908020ZjkLJJLL, null);
                return false;
            }
            while (c908020ZjkLJJLL.moveToNext()) {
                if (Intrinsics.LJFF(c908020ZjkLJJLL.getString(columnIndex), str2)) {
                    C2107108Nh.LIZ(c908020ZjkLJJLL, null);
                    return true;
                }
            }
            C2107108Nh.LIZ(c908020ZjkLJJLL, null);
            return false;
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
                try {
                    throw th2;
                } catch (Throwable th3) {
                    th = th3;
                    th = th2;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(c908020ZjkLJJLL, th);
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final void LJII(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2) {
            if (i != i2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ALTER TABLE bulletin_item_base ADD COLUMN ");
                EnumC621930OaN enumC621930OaN = EnumC621930OaN.STYLE_ID;
                sbLIZ.append(enumC621930OaN.getKey());
                sbLIZ.append(' ');
                sbLIZ.append(enumC621930OaN.getType());
                sQLiteDatabase.LJJ(C2188811AlT.LIZIZ(sbLIZ), null);
                sQLiteDatabase.LJJ(C622240Oas.LIZ(), null);
            }
        } else if (i >= 3) {
            return;
        }
        if (i != i2) {
            this.LIZ.LIZ();
            C622290Oax.LJFF("BulletinDBHelper", "Start DB migration to v3 with idempotent checks and rollback support");
            sQLiteDatabase.LJI(true);
            try {
                try {
                    sQLiteDatabase.LJJ(C622230Oar.LIZ(), null);
                    EnumC621910OaL enumC621910OaL = EnumC621910OaL.VIEW_COUNT;
                    if (!LIZ(sQLiteDatabase, "bulletin_item_interaction", enumC621910OaL.getKey())) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("ALTER TABLE bulletin_item_interaction ADD COLUMN ");
                        sbLIZ2.append(enumC621910OaL.getKey());
                        sbLIZ2.append(' ');
                        sbLIZ2.append(enumC621910OaL.getType());
                        sQLiteDatabase.LJJ(C2188811AlT.LIZIZ(sbLIZ2), null);
                    } else {
                        this.LIZ.LIZ();
                        C622290Oax.LJFF("BulletinDBHelper", "skip add column viewCount: already exists");
                    }
                    EnumC621910OaL enumC621910OaL2 = EnumC621910OaL.BOTTOM_STRUCT;
                    if (!LIZ(sQLiteDatabase, "bulletin_item_interaction", enumC621910OaL2.getKey())) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("ALTER TABLE bulletin_item_interaction ADD COLUMN ");
                        sbLIZ3.append(enumC621910OaL2.getKey());
                        sbLIZ3.append(' ');
                        sbLIZ3.append(enumC621910OaL2.getType());
                        sQLiteDatabase.LJJ(C2188811AlT.LIZIZ(sbLIZ3), null);
                    } else {
                        this.LIZ.LIZ();
                        C622290Oax.LJFF("BulletinDBHelper", "skip add column bottomInfo: already exists");
                    }
                    EnumC621870OaH enumC621870OaH = EnumC621870OaH.CONTENT_KEY;
                    boolean zLIZ = LIZ(sQLiteDatabase, "bulletin_item_content", enumC621870OaH.getKey());
                    EnumC621870OaH enumC621870OaH2 = EnumC621870OaH.CONTENT_VALUE;
                    boolean zLIZ2 = LIZ(sQLiteDatabase, "bulletin_item_content", enumC621870OaH2.getKey());
                    if (zLIZ && zLIZ2) {
                        this.LIZ.LIZ();
                        C622290Oax.LJFF("BulletinDBHelper", "skip content table migration: columns already migrated");
                    } else {
                        if (LJIIIZ(sQLiteDatabase)) {
                            sQLiteDatabase.LJJ("CREATE TABLE IF NOT EXISTS bulletin_item_content_bak AS SELECT * FROM bulletin_item_content", null);
                            this.LIZ.LIZ();
                            C622290Oax.LJFF("BulletinDBHelper", "created backup table bulletin_item_content_bak");
                        } else {
                            this.LIZ.LIZ();
                            C622290Oax.LJFF("BulletinDBHelper", "skip content backup: bulletin_item_content not exists");
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("CREATE TABLE IF NOT EXISTS bulletin_item_content_new (");
                        EnumC621870OaH enumC621870OaH3 = EnumC621870OaH.ITEM_ID;
                        sbLIZ4.append(enumC621870OaH3.getKey());
                        sbLIZ4.append(" TEXT NOT NULL,");
                        sbLIZ4.append(enumC621870OaH.getKey());
                        sbLIZ4.append(" TEXT NOT NULL,");
                        sbLIZ4.append(enumC621870OaH2.getKey());
                        sbLIZ4.append(" TEXT,FOREIGN KEY (");
                        sbLIZ4.append(enumC621870OaH3.getKey());
                        sbLIZ4.append(") REFERENCES bulletin_item_base(");
                        sbLIZ4.append(EnumC621930OaN.ITEM_ID.getKey());
                        sbLIZ4.append(") ON DELETE CASCADE,PRIMARY KEY (");
                        sbLIZ4.append(enumC621870OaH3.getKey());
                        sbLIZ4.append(", ");
                        sbLIZ4.append(enumC621870OaH.getKey());
                        sbLIZ4.append("))");
                        sQLiteDatabase.LJJ(C2188811AlT.LIZIZ(sbLIZ4), null);
                        this.LIZ.LIZ();
                        C622290Oax.LJFF("BulletinDBHelper", "skip content backfill per new policy: clear-table rebuild with composite PK");
                        if (LJIIIZ(sQLiteDatabase)) {
                            sQLiteDatabase.LJJ("DROP TABLE IF EXISTS bulletin_item_content", null);
                        }
                        sQLiteDatabase.LJJ("ALTER TABLE bulletin_item_content_new RENAME TO bulletin_item_content", null);
                        this.LIZ.LIZ();
                        C622290Oax.LJFF("BulletinDBHelper", "content table migrated with composite PK (item_id, contentKey)");
                    }
                    sQLiteDatabase.LJJIIZ();
                    this.LIZ.LIZ();
                    C622290Oax.LJFF("BulletinDBHelper", "DB migration to v3 finished successfully");
                    sQLiteDatabase.LJJ("DROP TABLE IF EXISTS bulletin_item_content_bak", null);
                    sQLiteDatabase.LJJIIZI();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LIZ.LIZ();
                    C622290Oax.LIZJ("BulletinDBHelper", "DB migration to v3 failed, rollback triggered", e);
                    throw e;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                sQLiteDatabase.LJJ("DROP TABLE IF EXISTS bulletin_item_content_bak", null);
                sQLiteDatabase.LJJIIZI();
                throw th;
            }
        }
    }
}
