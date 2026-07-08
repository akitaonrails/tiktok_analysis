package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteGlobal;
import com.tencent.wcdb.support.Log;

/* JADX INFO: renamed from: X.0ObO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC622560ObO {
    public final Context LL;
    public final String LLILLJJLI;
    public final InterfaceC2186508hT LLILLL;
    public final int LLILZ;
    public SQLiteDatabase LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final InterfaceC875360YVq LLIZLLLIL;
    public final byte[] LLJ;
    public final SQLiteCipherSpec LLJI;

    public final SQLiteDatabase LJ() {
        SQLiteDatabase sQLiteDatabaseLIZJ;
        synchronized (this) {
            try {
                sQLiteDatabaseLIZJ = LIZJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return sQLiteDatabaseLIZJ;
    }

    public abstract void LJFF(SQLiteDatabase sQLiteDatabase);

    public abstract void LJI(SQLiteDatabase sQLiteDatabase);

    public void LJIIIIZZ(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void LJIIIZ(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public synchronized void close() {
        if (this.LLILZLL) {
            throw new IllegalStateException("Closed during initialization");
        }
        SQLiteDatabase sQLiteDatabase = this.LLILZIL;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.LLILZIL.LIZLLL();
            this.LLILZIL = null;
        }
    }

    public final SQLiteDatabase LIZJ() {
        SQLiteDatabase sQLiteDatabase = this.LLILZIL;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.LLILZIL = null;
            } else if (!this.LLILZIL.LJJL()) {
                return this.LLILZIL;
            }
        }
        if (this.LLILZLL) {
            throw new IllegalStateException("getDatabase called recursively");
        }
        SQLiteDatabase sQLiteDatabaseLIZ = this.LLILZIL;
        try {
            this.LLILZLL = true;
            if (sQLiteDatabaseLIZ == null) {
                String str = this.LLILLJJLI;
                if (str == null) {
                    sQLiteDatabaseLIZ = SQLiteDatabase.LJJLIIIJL(":memory:", null, null, null, 268435456, null);
                } else {
                    try {
                        sQLiteDatabaseLIZ = C2186408hS.LIZ(this.LL, str, this.LLJ, this.LLJI, this.LLIZ ? 8 : 0, this.LLILLL, this.LLIZLLLIL);
                    } catch (SQLiteException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    }
                }
            } else if (sQLiteDatabaseLIZ.LJJL()) {
                sQLiteDatabaseLIZ.LJJZ();
            }
            LIZLLL(sQLiteDatabaseLIZ);
            this.LLILZLL = false;
            if (sQLiteDatabaseLIZ != this.LLILZIL) {
                sQLiteDatabaseLIZ.LIZLLL();
            }
            return sQLiteDatabaseLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZLL = false;
            if (sQLiteDatabaseLIZ != null && sQLiteDatabaseLIZ != this.LLILZIL) {
                sQLiteDatabaseLIZ.LIZLLL();
            }
            throw th;
        }
    }

    static {
        SQLiteGlobal.loadLib();
    }

    public final void LIZLLL(SQLiteDatabase sQLiteDatabase) {
        LJFF(sQLiteDatabase);
        int iLJJJLL = sQLiteDatabase.LJJJLL();
        if (iLJJJLL != this.LLILZ) {
            if (!sQLiteDatabase.LJJL()) {
                sQLiteDatabase.LJI(true);
                try {
                    if (iLJJJLL == 0) {
                        LJI(sQLiteDatabase);
                    } else {
                        int i = this.LLILZ;
                        if (iLJJJLL > i) {
                            LJII(sQLiteDatabase, iLJJJLL, i);
                        } else {
                            LJIIIZ(sQLiteDatabase, iLJJJLL, i);
                        }
                    }
                    sQLiteDatabase.LJL(this.LLILZ);
                    sQLiteDatabase.LJJIIZ();
                    sQLiteDatabase.LJJIIZI();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    sQLiteDatabase.LJJIIZI();
                    throw th;
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Can't upgrade read-only database from version ");
                sbLIZ.append(sQLiteDatabase.LJJJLL());
                sbLIZ.append(" to ");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(": ");
                sbLIZ.append(this.LLILLJJLI);
                throw new SQLiteException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        LJIIIIZZ(sQLiteDatabase);
        if (sQLiteDatabase.LJJL()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Opened ");
            sbLIZ2.append(this.LLILLJJLI);
            sbLIZ2.append(" in read-only mode");
            Log.LJ("WCDB.SQLiteOpenHelper", C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LLILZIL = sQLiteDatabase;
    }

    public void LJIIJ(boolean z) {
        synchronized (this) {
            try {
                if (!this.LLIZ) {
                    SQLiteDatabase sQLiteDatabase = this.LLILZIL;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.LLILZIL.LJJL()) {
                        this.LLILZIL.LJIJJLI();
                    }
                    this.LLIZ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void LJII(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Can't downgrade database from version ");
        sbLIZ.append(i);
        sbLIZ.append(" to ");
        sbLIZ.append(i2);
        throw new SQLiteException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public AbstractC622560ObO(Context context, String str, byte[] bArr, int i, InterfaceC875360YVq interfaceC875360YVq) {
        if (i >= 1) {
            this.LL = context;
            this.LLILLJJLI = str;
            this.LLILLL = null;
            this.LLILZ = i;
            this.LLIZLLLIL = interfaceC875360YVq;
            this.LLJ = bArr;
            this.LLJI = null;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Version must be >= 1, was ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
