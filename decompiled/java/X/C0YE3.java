package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: X.0YE3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YE3 extends SQLiteOpenHelper implements C0YBX {
    public final C0VS4 LL;
    public final C0YEM LLILLJJLI;
    public final InterfaceC864790XwD LLILLL;
    public final C0Y5R LLILZ;

    @Override // X.C0YBX
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.C0YBX
    public final InterfaceC870450YCt LIZ() {
        C0VS4 c0vs4 = this.LL;
        c0vs4.LIZ = getWritableDatabase();
        return c0vs4;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable, X.C0YBX
    public final void close() {
        this.LLILLJJLI.LIZLLL().LJIIJJI("LocalSQLiteOpenHelper close");
        super.close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.LLILLJJLI.LIZLLL().LJIIJJI("LocalSQLiteOpenHelper onConfigure");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.LLILLJJLI.LIZLLL().LJIIJJI("LocalSQLiteOpenHelper onCreate");
        C869650Y9r c869650Y9rLIZ = this.LLILZ.LIZ();
        C0VS4 c0vs4 = this.LL;
        c0vs4.LIZ = sQLiteDatabase;
        c869650Y9rLIZ.LJIIJJI(c0vs4);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        this.LLILLJJLI.LIZLLL().LJIIJJI("LocalSQLiteOpenHelper onOpen");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z) {
        super.setWriteAheadLoggingEnabled(z);
    }

    public C0YE3(C0YEM c0yem, String str) {
        super(c0yem.LJ().LJ().getApplicationContext(), str, (SQLiteDatabase.CursorFactory) null, 80);
        this.LL = new C0VS4();
        this.LLILLJJLI = c0yem;
        InterfaceC864790XwD interfaceC864790XwDLJIIZILJ = c0yem.LJIIZILJ();
        this.LLILLL = interfaceC864790XwDLJIIZILJ;
        this.LLILZ = interfaceC864790XwDLJIIZILJ.LIZIZ();
        c0yem.LIZLLL().LJIIJJI("LocalSQLiteOpenHelper constructor");
        if (c0yem.LJIIIZ().LJJIII) {
            super.setWriteAheadLoggingEnabled(true);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.LLILLJJLI.LIZLLL().LJIIJJI("LocalSQLiteOpenHelper onDowngrade");
        C869650Y9r c869650Y9rLIZ = this.LLILZ.LIZ();
        this.LL.LIZ = sQLiteDatabase;
        c869650Y9rLIZ.LJIIL(i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.LLILLJJLI.LIZLLL().LJIIJJI("LocalSQLiteOpenHelper onUpgrade");
        C869650Y9r c869650Y9rLIZ = this.LLILZ.LIZ();
        C0VS4 c0vs4 = this.LL;
        c0vs4.LIZ = sQLiteDatabase;
        c869650Y9rLIZ.LJIILIIL(c0vs4, i, i2);
    }
}
