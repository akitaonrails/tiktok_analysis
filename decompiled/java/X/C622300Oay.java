package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bulletin.db.api.IBulletinClientBridge;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.repair.RepairKit;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Oay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C622300Oay extends AbstractC622560ObO {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final InterfaceC622260Oau LLJIJIL;

    @Override // X.AbstractC622560ObO
    public final void LJFF(SQLiteDatabase sQLiteDatabase) {
        Object c098200Yq;
        String str = "";
        this.LLJIJIL.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConfigure: db:");
        sbLIZ.append(sQLiteDatabase);
        C622290Oax.LJFF("BulletinSQLiteHelper", C2188811AlT.LIZIZ(sbLIZ));
        C622210Oap c622210Oap = new C622210Oap("enableWAL", this.LLJIJIL);
        try {
            C0CTA c0ctaLJ = this.LLJIJIL.LIZJ().LIZ.LJ();
            if (c0ctaLJ != null && c0ctaLJ.LIZ) {
                sQLiteDatabase.LJIJJLI();
            }
            c622210Oap.LIZ(EnumC622250Oat.DB_SCENE_SUCCESS, "", null);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            this.LLJIJIL.LIZ();
            C622290Oax.LJ(thM5exceptionOrNullimpl);
            EnumC622250Oat enumC622250Oat = EnumC622250Oat.DB_SCENE_FAIL;
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message != null) {
                str = message;
            }
            c622210Oap.LIZ(enumC622250Oat, str, null);
        }
    }

    @Override // X.AbstractC622560ObO
    public final void LJI(SQLiteDatabase sQLiteDatabase) {
        Object c098200Yq;
        String str = "";
        this.LLJIJIL.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate: dbPath:");
        sbLIZ.append(sQLiteDatabase.LJJJ());
        sbLIZ.append(", version:");
        sbLIZ.append(Integer.valueOf(sQLiteDatabase.LJJJLL()));
        C622290Oax.LJFF("BulletinSQLiteHelper", C2188811AlT.LIZIZ(sbLIZ));
        C622210Oap c622210Oap = new C622210Oap("db_create", this.LLJIJIL);
        try {
            this.LLJIJIL.LIZJ().getClass();
            C622070Oab.LJI(sQLiteDatabase);
            c622210Oap.LIZ(EnumC622250Oat.DB_SCENE_SUCCESS, "", null);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            this.LLJIJIL.LIZ();
            C622290Oax.LJ(thM5exceptionOrNullimpl);
            EnumC622250Oat enumC622250Oat = EnumC622250Oat.DB_SCENE_FAIL;
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message != null) {
                str = message;
            }
            c622210Oap.LIZ(enumC622250Oat, str, null);
        }
    }

    @Override // X.AbstractC622560ObO
    public final void LJIIIIZZ(SQLiteDatabase sQLiteDatabase) {
        this.LLJIJIL.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onOpen: dbPath:");
        sbLIZ.append(sQLiteDatabase.LJJJ());
        C622290Oax.LJFF("BulletinSQLiteHelper", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(sQLiteDatabase.LJJJ());
        sbLIZ2.append(" -mbackup");
        boolean zNativeSaveMaster = RepairKit.nativeSaveMaster(sQLiteDatabase.LJFF("backupMaster", true), C2188811AlT.LIZIZ(sbLIZ2), null);
        C908190Zk1 c908190Zk1LJJJJJ = sQLiteDatabase.LJJJJJ();
        SQLiteConnection sQLiteConnection = c908190Zk1LJJJJJ.LIZIZ;
        if (sQLiteConnection != null) {
            sQLiteConnection.LJ();
        }
        c908190Zk1LJJJJJ.LJIIIIZZ();
        this.LLJIJIL.LIZ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onOpen: isBackupSuccess: ");
        sbLIZ3.append(zNativeSaveMaster);
        C622290Oax.LJFF("BulletinSQLiteHelper", C2188811AlT.LIZIZ(sbLIZ3));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C622300Oay(InterfaceC622260Oau interfaceC622260Oau, String str, C622320Ob0 c622320Ob0) {
        Context applicationContext;
        IBulletinClientBridge iBulletinClientBridgeLIZIZ = interfaceC622260Oau.LIZIZ();
        if (iBulletinClientBridgeLIZIZ != null) {
            applicationContext = iBulletinClientBridgeLIZIZ.getApplicationContext();
        } else {
            applicationContext = null;
        }
        super(applicationContext, str, null, 3, c622320Ob0);
        this.LLJIJIL = interfaceC622260Oau;
    }

    @Override // X.AbstractC622560ObO
    public final void LJII(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C622210Oap c622210Oap = new C622210Oap("db_downgrade", this.LLJIJIL);
        this.LLJIJIL.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDowngrade: Can't downgrade database from version ");
        sbLIZ.append(i);
        sbLIZ.append(" to ");
        sbLIZ.append(i2);
        C622290Oax.LIZIZ("BulletinSQLiteHelper", C2188811AlT.LIZIZ(sbLIZ));
        c622210Oap.LIZ(EnumC622250Oat.DB_SCENE_FAIL, "downgrade_failed", null);
        this.LLJIJIL.LIZLLL("downgrade_failed");
    }

    @Override // X.AbstractC622560ObO
    public final void LJIIIZ(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Object c098200Yq;
        String str = "";
        this.LLJIJIL.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpgrade: dbPath:");
        sbLIZ.append(sQLiteDatabase.LJJJ());
        sbLIZ.append(", oldVersion:");
        sbLIZ.append(i);
        sbLIZ.append(", newVersion:");
        sbLIZ.append(i2);
        C622290Oax.LJFF("BulletinSQLiteHelper", C2188811AlT.LIZIZ(sbLIZ));
        C622210Oap c622210Oap = new C622210Oap("db_upgrade", this.LLJIJIL);
        try {
            this.LLJIJIL.LIZJ().LJII(sQLiteDatabase, i, i2);
            c622210Oap.LIZ(EnumC622250Oat.DB_SCENE_SUCCESS, "", null);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            this.LLJIJIL.LIZ();
            C622290Oax.LJ(thM5exceptionOrNullimpl);
            EnumC622250Oat enumC622250Oat = EnumC622250Oat.DB_SCENE_FAIL;
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message != null) {
                str = message;
            }
            c622210Oap.LIZ(enumC622250Oat, str, null);
            this.LLJIJIL.LIZLLL("upgrade_failed");
        }
    }
}
