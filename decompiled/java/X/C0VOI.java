package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.util.List;

/* JADX INFO: renamed from: X.0VOI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VOI implements C0VLF {
    public static final String[] LLILLJJLI = new String[0];
    public final SQLiteDatabase LL;

    public final List<Pair<String, String>> LIZ() {
        return this.LL.getAttachedDbs();
    }

    public final String LIZIZ() {
        return this.LL.getPath();
    }

    @Override // X.C0VLF
    public final void LJIIIIZZ() {
        this.LL.beginTransaction();
    }

    @Override // X.C0VLF
    public final void LJJII() {
        this.LL.beginTransactionNonExclusive();
    }

    @Override // X.C0VLF
    public final void LJJIIZ() {
        this.LL.setTransactionSuccessful();
    }

    @Override // X.C0VLF
    public final void LJJIIZI() {
        this.LL.endTransaction();
    }

    @Override // X.C0VLF
    public final boolean LJJIJIIJI() {
        return this.LL.inTransaction();
    }

    @Override // X.C0VLF
    public final boolean LLIIJLIL() {
        return this.LL.isWriteAheadLoggingEnabled();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LL.close();
    }

    @Override // X.C0VLF
    public final boolean isOpen() {
        return this.LL.isOpen();
    }

    public C0VOI(SQLiteDatabase sQLiteDatabase) {
        this.LL = sQLiteDatabase;
    }

    @Override // X.C0VLF
    public final InterfaceC796340VLs LJIIJJI(String str) {
        return new C0VOM(this.LL.compileStatement(str));
    }

    @Override // X.C0VLF
    public final void LJIILJJIL(String str) {
        this.LL.execSQL(str);
    }

    @Override // X.C0VLF
    public final Cursor LJLLLL(final C0VOJ c0voj) {
        return this.LL.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: X.0VOL
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                c0voj.LIZ(new C0VON(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, c0voj.LIZIZ(), LLILLJJLI, null);
    }

    @Override // X.C0VLF
    public final Cursor query(String str) {
        return LJLLLL(new C0VN1(str, null));
    }

    @Override // X.C0VLF
    public final void LJJJJIZL(String str, Object[] objArr) {
        this.LL.execSQL(str, objArr);
    }

    @Override // X.C0VLF
    public final Cursor LJLJJL(final C0VOJ c0voj, CancellationSignal cancellationSignal) {
        return this.LL.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: X.0VOK
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                c0voj.LIZ(new C0VON(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, c0voj.LIZIZ(), LLILLJJLI, null, cancellationSignal);
    }
}
