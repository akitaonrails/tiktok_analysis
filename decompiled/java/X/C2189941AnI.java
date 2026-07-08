package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1AnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2189941AnI {
    public final SQLiteDatabase LIZ;
    public final String LIZIZ;
    public final String[] LIZJ;
    public final String[] LIZLLL;
    public SQLiteStatement LJ;
    public SQLiteStatement LJFF;
    public SQLiteStatement LJI;
    public SQLiteStatement LJII;

    public final SQLiteStatement LIZ() {
        if (this.LJI == null) {
            String str = this.LIZIZ;
            String[] strArr = this.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\"');
            sbLIZ.append(str);
            sbLIZ.append('\"');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sb = new StringBuilder("DELETE FROM ");
            sb.append(strLIZIZ);
            if (strArr != null && strArr.length > 0) {
                sb.append(" WHERE ");
                C2189921AnG.LIZIZ(sb, strLIZIZ, strArr);
            }
            SQLiteStatement sQLiteStatementCompileStatement = this.LIZ.compileStatement(sb.toString());
            synchronized (this) {
                try {
                    if (this.LJI == null) {
                        this.LJI = sQLiteStatementCompileStatement;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (this.LJI != sQLiteStatementCompileStatement) {
                sQLiteStatementCompileStatement.close();
            }
        }
        return this.LJI;
    }

    public final SQLiteStatement LIZIZ() {
        if (this.LJII == null) {
            String str = this.LIZIZ;
            String[] strArr = this.LIZJ;
            StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO ");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\"');
            sbLIZ.append(str);
            sbLIZ.append('\"');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            sb.append(" (");
            C2189921AnG.LIZ(sb, strArr);
            sb.append(") VALUES (");
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (i < length - 1) {
                    sb.append("?,");
                } else {
                    sb.append('?');
                }
            }
            sb.append(')');
            SQLiteStatement sQLiteStatementCompileStatement = this.LIZ.compileStatement(sb.toString());
            synchronized (this) {
                try {
                    if (this.LJII == null) {
                        this.LJII = sQLiteStatementCompileStatement;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (this.LJII != sQLiteStatementCompileStatement) {
                sQLiteStatementCompileStatement.close();
            }
        }
        return this.LJII;
    }

    public final SQLiteStatement LIZJ() {
        if (this.LJ == null) {
            String str = this.LIZIZ;
            String[] strArr = this.LIZJ;
            StringBuilder sb = new StringBuilder("INSERT INTO ");
            sb.append('\"');
            sb.append(str);
            sb.append("\" (");
            C2189921AnG.LIZ(sb, strArr);
            sb.append(") VALUES (");
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (i < length - 1) {
                    sb.append("?,");
                } else {
                    sb.append('?');
                }
            }
            sb.append(')');
            SQLiteStatement sQLiteStatementCompileStatement = this.LIZ.compileStatement(sb.toString());
            synchronized (this) {
                try {
                    if (this.LJ == null) {
                        this.LJ = sQLiteStatementCompileStatement;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (this.LJ != sQLiteStatementCompileStatement) {
                sQLiteStatementCompileStatement.close();
            }
        }
        return this.LJ;
    }

    public final SQLiteStatement LIZLLL() {
        if (this.LJFF == null) {
            String str = this.LIZIZ;
            String[] strArr = this.LIZJ;
            String[] strArr2 = this.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\"');
            sbLIZ.append(str);
            sbLIZ.append('\"');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sb = new StringBuilder("UPDATE ");
            sb.append(strLIZIZ);
            sb.append(" SET ");
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                sb.append('\"');
                sb.append(str2);
                sb.append("\"=?");
                if (i < strArr.length - 1) {
                    sb.append(',');
                }
            }
            if (strArr2 != null && strArr2.length > 0) {
                sb.append(" WHERE ");
                C2189921AnG.LIZIZ(sb, strLIZIZ, strArr2);
            }
            SQLiteStatement sQLiteStatementCompileStatement = this.LIZ.compileStatement(sb.toString());
            synchronized (this) {
                try {
                    if (this.LJFF == null) {
                        this.LJFF = sQLiteStatementCompileStatement;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (this.LJFF != sQLiteStatementCompileStatement) {
                sQLiteStatementCompileStatement.close();
            }
        }
        return this.LJFF;
    }

    public C2189941AnI(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2) {
        this.LIZ = sQLiteDatabase;
        this.LIZIZ = str;
        this.LIZJ = strArr;
        this.LIZLLL = strArr2;
    }
}
