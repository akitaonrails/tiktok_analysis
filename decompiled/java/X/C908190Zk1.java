package X;

import android.database.sqlite.SQLiteTransactionListener;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.database.SQLiteConnection;

/* JADX INFO: renamed from: X.0Zk1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908190Zk1 {
    public final C908180Zk0 LIZ;
    public SQLiteConnection LIZIZ;
    public int LIZJ;
    public C908270Zk9 LIZLLL;
    public C908270Zk9 LJ;

    public final void LIZJ() {
        C908270Zk9 c908270Zk9 = this.LJ;
        if (c908270Zk9 == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
        boolean z = false;
        boolean z2 = c908270Zk9.LIZJ && !c908270Zk9.LIZLLL;
        SQLiteTransactionListener sQLiteTransactionListener = c908270Zk9.LIZIZ;
        if (sQLiteTransactionListener != null) {
            try {
                if (z2) {
                    sQLiteTransactionListener.onCommit();
                } else {
                    sQLiteTransactionListener.onRollback();
                }
                z = z2;
                e = null;
            } catch (RuntimeException e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            z = z2;
            e = null;
        }
        C908270Zk9 c908270Zk92 = c908270Zk9.LIZ;
        this.LJ = c908270Zk92;
        c908270Zk9.LIZ = this.LIZLLL;
        c908270Zk9.LIZIZ = null;
        this.LIZLLL = c908270Zk9;
        if (c908270Zk92 == null) {
            try {
                if (z) {
                    this.LIZIZ.LJFF("COMMIT;", null);
                } else {
                    this.LIZIZ.LJFF("ROLLBACK;", null);
                }
                LJIIIIZZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIIIIZZ();
                throw th;
            }
        } else if (!z) {
            c908270Zk92.LIZLLL = true;
        }
        if (e != null) {
            throw e;
        }
    }

    public final void LJIIIIZZ() {
        int i = this.LIZJ - 1;
        this.LIZJ = i;
        if (i == 0) {
            try {
                SQLiteConnection sQLiteConnection = this.LIZIZ;
                sQLiteConnection.LJIIIIZZ = 0;
                this.LIZ.LJJIZ(sQLiteConnection);
                this.LIZIZ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZIZ = null;
                throw th;
            }
        }
    }

    public C908190Zk1(C908180Zk0 c908180Zk0) {
        if (c908180Zk0 != null) {
            this.LIZ = c908180Zk0;
            return;
        }
        throw new IllegalArgumentException("connectionPool must not be null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00dc, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r16, int r17) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C908190Zk1.LIZ(java.lang.String, int):void");
    }

    public final void LIZIZ(int i, int i2) {
        C908270Zk9 c908270Zk9 = this.LJ;
        if (c908270Zk9 != null && c908270Zk9.LIZJ) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
        if (c908270Zk9 == null) {
            LIZ(null, i2);
        }
        try {
            if (this.LJ == null) {
                if (i != 1) {
                    if (i == 2) {
                        this.LIZIZ.LJFF("BEGIN EXCLUSIVE;", null);
                    } else {
                        this.LIZIZ.LJFF("BEGIN;", null);
                    }
                } else {
                    this.LIZIZ.LJFF("BEGIN IMMEDIATE;", null);
                }
            }
            C908270Zk9 c908270Zk92 = this.LIZLLL;
            if (c908270Zk92 != null) {
                this.LIZLLL = c908270Zk92.LIZ;
                c908270Zk92.LIZ = null;
                c908270Zk92.LIZJ = false;
                c908270Zk92.LIZLLL = false;
            } else {
                c908270Zk92 = new C908270Zk9();
            }
            c908270Zk92.LIZIZ = null;
            c908270Zk92.LIZ = this.LJ;
            this.LJ = c908270Zk92;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (this.LJ == null) {
                LJIIIIZZ();
            }
            throw th;
        }
    }

    public final boolean LJII(String str, int i) {
        int iLIZ = C908000Zji.LIZ(str);
        if (iLIZ != 4) {
            if (iLIZ != 5) {
                if (iLIZ != 6) {
                    return false;
                }
                LIZJ();
                return true;
            }
            C908270Zk9 c908270Zk9 = this.LJ;
            if (c908270Zk9 != null) {
                if (!c908270Zk9.LIZJ) {
                    c908270Zk9.LIZJ = true;
                    LIZJ();
                    return true;
                }
                throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
            }
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
        LIZIZ(2, i);
        return true;
    }

    public final int LIZLLL(String str, Object[] objArr, int i) {
        if (str != null) {
            if (LJII(str, i)) {
                return 0;
            }
            LIZ(str, i);
            try {
                int iLJI = this.LIZIZ.LJI(str, objArr);
                LJIIIIZZ();
                return iLJI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIIIIZZ();
                throw th;
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final long LJFF(String str, Object[] objArr, int i) {
        if (str != null) {
            if (LJII(str, i)) {
                return 0L;
            }
            LIZ(str, i);
            try {
                long jLJIIIIZZ = this.LIZIZ.LJIIIIZZ(str, objArr);
                LJIIIIZZ();
                return jLJIIIIZZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIIIIZZ();
                throw th;
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final long LJI(String str, Object[] objArr, int i) {
        if (str != null) {
            if (LJII(str, i)) {
                return 0L;
            }
            LIZ(str, i);
            try {
                long jLJIIIZ = this.LIZIZ.LJIIIZ(str, objArr);
                LJIIIIZZ();
                return jLJIIIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIIIIZZ();
                throw th;
            }
        }
        throw new IllegalArgumentException("sql must not be null.");
    }

    public final int LJ(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, int i3) {
        if (str != null) {
            if (cursorWindow != null) {
                if (LJII(str, i3)) {
                    cursorWindow.LJFF();
                    return 0;
                }
                LIZ(str, i3);
                try {
                    int iLJII = this.LIZIZ.LJII(str, objArr, cursorWindow, i, i2, z);
                    LJIIIIZZ();
                    return iLJII;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LJIIIIZZ();
                    throw th;
                }
            }
            throw new IllegalArgumentException("window must not be null.");
        }
        throw new IllegalArgumentException("sql must not be null.");
    }
}
