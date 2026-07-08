package X;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VOC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VOC extends SQLiteOpenHelper {
    public final C0VOI[] LL;
    public final C0VOE LLILLJJLI;
    public boolean LLILLL;

    public final synchronized C0VLF LIZIZ() {
        this.LLILLL = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.LLILLL) {
            return LIZ(writableDatabase);
        }
        close();
        return LIZIZ();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.LL[0] = null;
    }

    public final C0VOI LIZ(SQLiteDatabase sQLiteDatabase) {
        C0VOI[] c0voiArr = this.LL;
        C0VOI c0voi = c0voiArr[0];
        if (c0voi == null || c0voi.LL != sQLiteDatabase) {
            c0voiArr[0] = new C0VOI(sQLiteDatabase);
        }
        return c0voiArr[0];
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        C0VOE c0voe = this.LLILLJJLI;
        LIZ(sQLiteDatabase);
        c0voe.LIZIZ();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.LLILLJJLI.LIZJ(LIZ(sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.LLILLL) {
            this.LLILLJJLI.LJ(LIZ(sQLiteDatabase));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.LLILLL = true;
        this.LLILLJJLI.LIZLLL(LIZ(sQLiteDatabase), i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.LLILLL = true;
        this.LLILLJJLI.LJFF(LIZ(sQLiteDatabase), i, i2);
    }

    public C0VOC(Context context, String str, final C0VOI[] c0voiArr, final C0VOE c0voe) {
        super(context, str, null, c0voe.LIZ, new DatabaseErrorHandler() { // from class: X.0VOD
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                C0VOE c0voe2 = c0voe;
                C0VOI[] c0voiArr2 = c0voiArr;
                C0VOI c0voi = c0voiArr2[0];
                if (c0voi == null || c0voi.LL != sQLiteDatabase) {
                    c0voiArr2[0] = new C0VOI(sQLiteDatabase);
                }
                C0VOI c0voi2 = c0voiArr2[0];
                c0voe2.getClass();
                if (!c0voi2.isOpen()) {
                    C0VOE.LIZ(c0voi2.LIZIZ());
                    return;
                }
                List<Pair<String, String>> listLIZ = null;
                try {
                    try {
                        listLIZ = c0voi2.LIZ();
                    } catch (SQLiteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    try {
                        c0voi2.close();
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    if (listLIZ != null) {
                        Iterator<Pair<String, String>> it2 = listLIZ.iterator();
                        while (it2.hasNext()) {
                            C0VOE.LIZ((String) it2.next().second);
                        }
                        return;
                    }
                    C0VOE.LIZ(c0voi2.LIZIZ());
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (listLIZ != null) {
                        Iterator<Pair<String, String>> it3 = listLIZ.iterator();
                        while (it3.hasNext()) {
                            C0VOE.LIZ((String) it3.next().second);
                        }
                    } else {
                        C0VOE.LIZ(c0voi2.LIZIZ());
                    }
                    throw th;
                }
            }
        });
        this.LLILLJJLI = c0voe;
        this.LL = c0voiArr;
    }
}
