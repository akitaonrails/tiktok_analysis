package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabaseCorruptException;
import com.tencent.wcdb.database.h;

/* JADX INFO: renamed from: X.0Zjh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907990Zjh extends h {
    public final int LJII() {
        LIZ();
        try {
            try {
                C908190Zk1 c908190Zk1LJJJJJ = this.LL.LJJJJJ();
                String str = this.LLILLJJLI;
                Object[] objArr = this.LLILZLL;
                SQLiteDatabase sQLiteDatabase = this.LL;
                boolean z = this.LLILLL;
                sQLiteDatabase.getClass();
                int iLIZLLL = c908190Zk1LJJJJJ.LIZLLL(str, objArr, SQLiteDatabase.LJJJJ(z));
                LIZLLL();
                return iLIZLLL;
            } catch (SQLiteDatabaseCorruptException e) {
                TryCatchGuardChecker.doCheck(e);
                LJI(e);
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL();
            throw th;
        }
    }

    public final long LJIL() {
        LIZ();
        try {
            try {
                C908190Zk1 c908190Zk1LJJJJJ = this.LL.LJJJJJ();
                String str = this.LLILLJJLI;
                Object[] objArr = this.LLILZLL;
                SQLiteDatabase sQLiteDatabase = this.LL;
                boolean z = this.LLILLL;
                sQLiteDatabase.getClass();
                long jLJFF = c908190Zk1LJJJJJ.LJFF(str, objArr, SQLiteDatabase.LJJJJ(z));
                LIZLLL();
                return jLJFF;
            } catch (SQLiteDatabaseCorruptException e) {
                TryCatchGuardChecker.doCheck(e);
                LJI(e);
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SQLiteProgram: ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C907990Zjh(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        super(sQLiteDatabase, str, objArr);
    }
}
