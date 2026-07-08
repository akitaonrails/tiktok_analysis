package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.AwS108S1000000_24;
import kotlin.jvm.internal.AwS150S0110000_34;
import kotlin.jvm.internal.AwS435S0200000_34;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS98S1000000_13;

/* JADX INFO: renamed from: X.1ApH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191171ApH {
    public final C2191191ApJ LIZ;
    public final InterfaceC2191181ApI LIZIZ;
    public final InterfaceC1179804jU LIZJ;
    public volatile String LIZLLL;
    public final C1DEV LJ = C2191201ApK.LIZ();
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS578S0100000_34(this, 218));

    public final C2190771Aod LIZ() {
        return (C2190771Aod) this.LJFF.getValue();
    }

    public final void LIZIZ() {
        this.LIZ.LIZJ.LIZ("AppSession:packHistorySessionEvents", new AwS564S0100000_20(this, 62));
        C1309440kBC c1309440kBC = new C1309440kBC(this, this.LIZLLL, null);
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        C23250099c.LIZLLL(c054gLIZ, null, null, new C05RN(c1309440kBC, c054gLIZ, null), 3);
    }

    public final Unit LJ(C2190761Aoc c2190761Aoc) {
        SQLiteStatement sQLiteStatementCompileStatement;
        this.LIZ.LIZJ.LIZ("AppSession:trackTerminate", new AwS578S0100000_34(c2190761Aoc, 222));
        boolean zLIZ = this.LIZJ.LIZ("terminate", EnumC2191921AqU.Terminate.getType(), C452501pT.LIZIZ(new AwS435S0200000_34(c2190761Aoc, this, 34)));
        this.LIZ.LIZIZ.LJFF.monitorIncreaseStats("priority_collect_terminate", 1);
        this.LIZ.LIZJ.LIZ("AppSession:trackTerminate", new AwS150S0110000_34(c2190761Aoc, zLIZ, 1));
        if (zLIZ) {
            String str = c2190761Aoc.LIZ;
            this.LIZ.LIZJ.LIZ("AppSession:removeSessionTerminate", new AwS108S1000000_24(str, 13));
            SQLiteDatabase writableDatabase = LIZ().LIZIZ().getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("delete from ");
                sbLIZ.append("session_page");
                sbLIZ.append(" where ");
                sbLIZ.append("session_id");
                sbLIZ.append(" = ?");
                sQLiteStatementCompileStatement = writableDatabase.compileStatement(C2188811AlT.LIZIZ(sbLIZ));
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            try {
                sQLiteStatementCompileStatement.clearBindings();
                sQLiteStatementCompileStatement.bindString(1, str);
                sQLiteStatementCompileStatement.executeUpdateDelete();
                writableDatabase.setTransactionSuccessful();
                sQLiteStatementCompileStatement.close();
                C2191771AqF.LIZ(writableDatabase);
                this.LIZ.LIZJ.LIZ("AppSession:removeSessionTerminate", new AwS98S1000000_13(str, 25));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                sQLiteStatementCompileStatement.close();
                throw th2;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[Catch: all -> 0x00dc, TryCatch #2 {all -> 0x00dc, blocks: (B:32:0x00be, B:33:0x00c1, B:35:0x00c7, B:26:0x0088, B:28:0x008e, B:31:0x00a3, B:25:0x006c), top: B:50:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7 A[Catch: all -> 0x00dc, TryCatch #2 {all -> 0x00dc, blocks: (B:32:0x00be, B:33:0x00c1, B:35:0x00c7, B:26:0x0088, B:28:0x008e, B:31:0x00a3, B:25:0x006c), top: B:50:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2191171ApH.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    public final Object LIZLLL(C2190781Aoe c2190781Aoe, boolean z) {
        SQLiteStatement sQLiteStatementCompileStatement;
        this.LIZ.LIZJ.LIZ("AppSession:trackLaunch", new AwS578S0100000_34(c2190781Aoe, 221));
        boolean zLIZ = this.LIZJ.LIZ("launch", EnumC2191921AqU.Launch.getType(), C452501pT.LIZIZ(new AwS435S0200000_34(c2190781Aoe, this, 33)));
        this.LIZ.LIZIZ.LJFF.monitorIncreaseStats("priority_collect_launch", 1);
        this.LIZ.LIZJ.LIZ("AppSession:trackLaunch", new AwS150S0110000_34(c2190781Aoe, zLIZ, 0));
        if (zLIZ && z) {
            String str = c2190781Aoe.LIZ;
            this.LIZ.LIZJ.LIZ("AppSession:removeSessionLaunch", new AwS108S1000000_24(str, 12));
            SQLiteDatabase writableDatabase = LIZ().LIZIZ().getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("delete from ");
                sbLIZ.append("session_launch");
                sbLIZ.append(" where ");
                sbLIZ.append("session_id");
                sbLIZ.append(" = ?");
                sQLiteStatementCompileStatement = writableDatabase.compileStatement(C2188811AlT.LIZIZ(sbLIZ));
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            try {
                sQLiteStatementCompileStatement.clearBindings();
                sQLiteStatementCompileStatement.bindString(1, str);
                sQLiteStatementCompileStatement.executeUpdateDelete();
                writableDatabase.setTransactionSuccessful();
                sQLiteStatementCompileStatement.close();
                C2191771AqF.LIZ(writableDatabase);
                this.LIZ.LIZJ.LIZ("AppSession:removeSessionLaunch", new AwS98S1000000_13(str, 24));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                sQLiteStatementCompileStatement.close();
                throw th2;
            }
        }
        return Boolean.valueOf(zLIZ);
    }

    public C2191171ApH(C2191191ApJ c2191191ApJ, InterfaceC2191181ApI interfaceC2191181ApI, InterfaceC1179804jU interfaceC1179804jU) {
        this.LIZ = c2191191ApJ;
        this.LIZIZ = interfaceC2191181ApI;
        this.LIZJ = interfaceC1179804jU;
    }
}
