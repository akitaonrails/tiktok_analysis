package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.h;
import com.tencent.wcdb.support.Log;

/* JADX INFO: renamed from: X.0Zjg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907980Zjg extends h {
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SQLiteQuery: ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C907980Zjg(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr) {
        super(sQLiteDatabase, str, objArr);
    }

    public final int LJII(CursorWindow cursorWindow, int i, int i2, boolean z) {
        LIZ();
        try {
            cursorWindow.LIZ();
            try {
                try {
                    C908190Zk1 c908190Zk1LJJJJJ = this.LL.LJJJJJ();
                    String str = this.LLILLJJLI;
                    Object[] objArr = this.LLILZLL;
                    SQLiteDatabase sQLiteDatabase = this.LL;
                    boolean z2 = this.LLILLL;
                    sQLiteDatabase.getClass();
                    int iLJ = c908190Zk1LJJJJJ.LJ(str, objArr, cursorWindow, i, i2, z, SQLiteDatabase.LJJJJ(z2));
                    cursorWindow.LIZLLL();
                    LIZLLL();
                    return iLJ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    cursorWindow.LIZLLL();
                    throw th;
                }
            } catch (SQLiteException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("exception: ");
                sbLIZ.append(e.getMessage());
                sbLIZ.append("; query: ");
                sbLIZ.append(this.LLILLJJLI);
                Log.LIZ("WCDB.SQLiteQuery", C2188811AlT.LIZIZ(sbLIZ));
                LJI(e);
                throw e;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            LIZLLL();
            throw th2;
        }
    }
}
