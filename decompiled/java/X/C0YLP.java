package X;

import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.repair.RepairKit;

/* JADX INFO: renamed from: X.0YLP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YLP extends AbstractC622560ObO implements C0YBX {
    public final C875320YVm LLJIJIL;
    public final String LLJILJIL;
    public final boolean LLJILJILJ;
    public final C0YEM LLJILLL;
    public final InterfaceC864790XwD LLJJ;
    public final C0Y5R LLJJI;

    @Override // X.AbstractC622560ObO
    public final void LJIIJ(boolean z) {
        throw null;
    }

    @Override // X.C0YBX
    public final InterfaceC870450YCt LIZ() {
        C875320YVm c875320YVm = this.LLJIJIL;
        c875320YVm.LIZ = LJ();
        return c875320YVm;
    }

    @Override // X.AbstractC622560ObO, X.C0YBX, java.lang.AutoCloseable
    public final void close() {
        this.LLJILLL.LIZLLL().LJIIJJI("LocalWcdbOpenHelper close");
        super.close();
    }

    @Override // X.C0YBX
    public final boolean LIZIZ() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC622560ObO
    public final void LJFF(SQLiteDatabase sQLiteDatabase) {
        this.LLJILLL.LIZLLL().LJIIJJI("LocalWcdbOpenHelper onConfigure");
        if (this.LLJILLL.LJIIIZ().LJJIII) {
            sQLiteDatabase.LJIJJLI();
        }
    }

    @Override // X.AbstractC622560ObO
    public final void LJI(SQLiteDatabase sQLiteDatabase) {
        C868780Y6i c868780Y6iLIZLLL = this.LLJILLL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalWcdbOpenHelper onCreate, mEncrypted:");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(", mOldDatabaseName:");
        sbLIZ.append(this.LLJILJIL);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        C875320YVm c875320YVm = this.LLJIJIL;
        c875320YVm.LIZ = sQLiteDatabase;
        c875320YVm.LIZIZ = new C0YLQ(this);
        this.LLJJI.LIZ().LJIIJJI(this.LLJIJIL);
    }

    @Override // X.AbstractC622560ObO
    public final void LJIIIIZZ(SQLiteDatabase sQLiteDatabase) {
        this.LLJILLL.LIZLLL().LJIIJJI("LocalWcdbOpenHelper onOpen");
        long jUptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(sQLiteDatabase.LJJJ());
        sbLIZ.append("-mbak");
        boolean zNativeSaveMaster = RepairKit.nativeSaveMaster(sQLiteDatabase.LJFF("backupMaster", true), C2188811AlT.LIZIZ(sbLIZ), null);
        C908190Zk1 c908190Zk1LJJJJJ = sQLiteDatabase.LJJJJJ();
        SQLiteConnection sQLiteConnection = c908190Zk1LJJJJJ.LIZIZ;
        if (sQLiteConnection != null) {
            sQLiteConnection.LJ();
        }
        c908190Zk1LJJJJJ.LJIIIIZZ();
        C0YJ9 c0yj9 = new C0YJ9(this.LLJILLL);
        c0yj9.LIZJ("imsdk_db_backup");
        c0yj9.LIZ(Integer.valueOf(!zNativeSaveMaster ? 1 : 0), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0yj9.LIZ(Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis), "duration");
        c0yj9.LJ(0.001f);
        C0YEM c0yem = this.LLJILLL;
        String str = this.LLILLJJLI;
        if (c0yem.LJIIIZ().LIZIZ || AbstractC19994813Le.Default.nextInt(100) == 1) {
            C23250099c.LIZLLL(c0yem.LIZJ(), null, null, new C0YLO(c0yem, str, sQLiteDatabase, null), 3);
        }
    }

    public C0YLP(final C0YEM c0yem, String str) {
        Context applicationContext = c0yem.LJ().LJ().getApplicationContext();
        final byte[] bArr = null;
        final C0YLR c0ylr = new C0YLR();
        super(applicationContext, str, null, 80, new C875340YVo(c0yem) { // from class: X.0YQH
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:67:0x01ae A[Catch: SQLiteException -> 0x0219, all -> 0x0260, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0260, blocks: (B:67:0x01ae, B:90:0x021d), top: B:122:0x019f }] */
            /* JADX WARN: Removed duplicated region for block: B:92:0x022b A[Catch: all -> 0x026d, TRY_ENTER, TRY_LEAVE, TryCatch #5 {, blocks: (B:12:0x0036, B:16:0x004b, B:55:0x013a, B:57:0x0140, B:58:0x0143, B:60:0x0188, B:92:0x022b, B:117:0x0269, B:118:0x026c, B:62:0x0192, B:15:0x0047), top: B:129:0x0036, inners: #7 }] */
            @Override // X.InterfaceC875360YVq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.tencent.wcdb.database.SQLiteDatabase r21) {
                /*
                    Method dump skipped, instruction units count: 624
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0YQH.LIZ(com.tencent.wcdb.database.SQLiteDatabase):void");
            }
        });
        this.LLJIJIL = new C875320YVm();
        this.LLJILJILJ = false;
        this.LLJILLL = c0yem;
        InterfaceC864790XwD interfaceC864790XwDLJIIZILJ = c0yem.LJIIZILJ();
        this.LLJJ = interfaceC864790XwDLJIIZILJ;
        this.LLJJI = interfaceC864790XwDLJIIZILJ.LIZIZ();
        this.LLJILJIL = str;
        if (c0yem.LJIIIZ().LJJIII) {
            super.LJIIJ(true);
            c0yem.LIZLLL().LJIIJJI("LocalWcdbOpenHelper constructor, has not password, enable WAL");
        } else {
            c0yem.LIZLLL().LJIIJJI("LocalWcdbOpenHelper constructor, has not password");
        }
    }

    public C0YLP(final C0YEM c0yem, String str, final byte[] bArr) {
        Context applicationContext = c0yem.LJ().LJ().getApplicationContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("encrypted_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        final C0YLR c0ylr = new C0YLR();
        super(applicationContext, strLIZIZ, bArr, 80, new C875340YVo(c0yem) { // from class: X.0YQH
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:67:0x01ae A[Catch: SQLiteException -> 0x0219, all -> 0x0260, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0260, blocks: (B:67:0x01ae, B:90:0x021d), top: B:122:0x019f }] */
            /* JADX WARN: Removed duplicated region for block: B:92:0x022b A[Catch: all -> 0x026d, TRY_ENTER, TRY_LEAVE, TryCatch #5 {, blocks: (B:12:0x0036, B:16:0x004b, B:55:0x013a, B:57:0x0140, B:58:0x0143, B:60:0x0188, B:92:0x022b, B:117:0x0269, B:118:0x026c, B:62:0x0192, B:15:0x0047), top: B:129:0x0036, inners: #7 }] */
            @Override // X.InterfaceC875360YVq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.tencent.wcdb.database.SQLiteDatabase r21) {
                /*
                    Method dump skipped, instruction units count: 624
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0YQH.LIZ(com.tencent.wcdb.database.SQLiteDatabase):void");
            }
        });
        this.LLJIJIL = new C875320YVm();
        this.LLJILJILJ = false;
        this.LLJILLL = c0yem;
        InterfaceC864790XwD interfaceC864790XwDLJIIZILJ = c0yem.LJIIZILJ();
        this.LLJJ = interfaceC864790XwDLJIIZILJ;
        this.LLJJI = interfaceC864790XwDLJIIZILJ.LIZIZ();
        this.LLJILJIL = str;
        this.LLJILJILJ = true;
        if (c0yem.LJIIIZ().LJJIII) {
            c0yem.LIZLLL().LJIIJJI("LocalWcdbOpenHelper constructor, has password, enable WAL");
            super.LJIIJ(true);
        } else {
            c0yem.LIZLLL().LJIIJJI("LocalWcdbOpenHelper constructor, has password");
        }
    }

    @Override // X.AbstractC622560ObO
    public final void LJII(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.LLJILLL.LIZLLL().LJI("LocalWcdbOpenHelper onDowngrade");
        C869650Y9r c869650Y9rLIZ = this.LLJJI.LIZ();
        this.LLJIJIL.LIZ = sQLiteDatabase;
        c869650Y9rLIZ.LJIIL(i, i2);
    }

    @Override // X.AbstractC622560ObO
    public final void LJIIIZ(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.LLJILLL.LIZLLL().LJIIJJI("LocalWcdbOpenHelper onUpgrade");
        C869650Y9r c869650Y9rLIZ = this.LLJJI.LIZ();
        C875320YVm c875320YVm = this.LLJIJIL;
        c875320YVm.LIZ = sQLiteDatabase;
        c869650Y9rLIZ.LJIILIIL(c875320YVm, i, i2);
    }
}
