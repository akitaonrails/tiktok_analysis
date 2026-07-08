package X;

import com.tencent.wcdb.database.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YLO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.db.base.DBUtil$reportDBInfo$1", f = "DBUtil.kt", l = {}, m = "invokeSuspend")
public final class C0YLO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YEM LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ SQLiteDatabase LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YLO(C0YEM c0yem, String str, SQLiteDatabase sQLiteDatabase, InterfaceC1364105Vn<? super C0YLO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0yem;
        this.LLILLJJLI = str;
        this.LLILLL = sQLiteDatabase;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YLO(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "DBUtil@6044.reportDBInfo$1"
            X.C1C7U.LIZ(r5)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r7)
            X.0YEM r4 = r6.LL
            java.lang.String r1 = r6.LLILLJJLI
            if (r1 == 0) goto L53
            X.0YDx r0 = r4.LJ()     // Catch: java.lang.Exception -> L37
            X.0YEb r0 = r0.LJ()     // Catch: java.lang.Exception -> L37
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Exception -> L37
            java.io.File r1 = r0.getDatabasePath(r1)     // Catch: java.lang.Exception -> L37
            if (r1 == 0) goto L53
            boolean r0 = r1.exists()     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L53
            boolean r0 = r1.isFile()     // Catch: java.lang.Exception -> L37
            if (r0 == 0) goto L53
            long r2 = r1.length()     // Catch: java.lang.Exception -> L37
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 / r0
            goto L55
        L37:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0Y6i r1 = r4.LIZLLL()
            java.lang.String r0 = "DBUtil getDBSize"
            r1.LJIIIZ(r0, r2)
            X.0XwD r0 = r4.LJIIZILJ()
            X.0Y8y r0 = r0.LJFF()
            X.0YLL r0 = r0.getEventTracker()
            r0.LJ(r2)
        L53:
            r2 = -1
        L55:
            X.0YEM r0 = r6.LL
            X.0YJ9 r4 = new X.0YJ9
            r4.<init>(r0)
            java.lang.String r0 = "im_sdk_db_info"
            r4.LIZJ(r0)
            java.lang.String r1 = "db_name"
            java.lang.String r0 = r6.LLILLJJLI
            r4.LIZ(r0, r1)
            com.tencent.wcdb.database.SQLiteDatabase r0 = r6.LLILLL
            int r0 = r0.LJJJLL()
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            java.lang.String r0 = "version"
            r4.LIZ(r1, r0)
            java.lang.String r1 = "db_size"
            java.lang.Long r0 = X.C2286608xc.LJFF(r2)
            r4.LIZ(r0, r1)
            r4.LIZLLL()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YLO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
