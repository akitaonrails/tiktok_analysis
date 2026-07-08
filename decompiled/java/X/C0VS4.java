package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* JADX INFO: renamed from: X.0VS4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VS4 implements InterfaceC870450YCt {
    public SQLiteDatabase LIZ = null;

    @Override // X.InterfaceC870450YCt
    public final void LJIIIIZZ() {
        this.LIZ.beginTransaction();
    }

    @Override // X.InterfaceC870450YCt
    public final void LJJII() {
        this.LIZ.beginTransactionNonExclusive();
    }

    @Override // X.InterfaceC870450YCt
    public final void LJJIIZ() {
        this.LIZ.setTransactionSuccessful();
    }

    @Override // X.InterfaceC870450YCt
    public final void LJJIIZI() {
        this.LIZ.endTransaction();
    }

    @Override // X.InterfaceC870450YCt
    public final boolean LJJIJIIJI() {
        return this.LIZ.inTransaction();
    }

    @Override // X.InterfaceC870450YCt
    public final long LJJIZ() {
        return DatabaseUtils.queryNumEntries(this.LIZ, "conversation_list");
    }

    @Override // X.InterfaceC870450YCt
    public final InterfaceC869960YAw LJIIJJI(String str) {
        final SQLiteStatement sQLiteStatementCompileStatement = this.LIZ.compileStatement(str);
        return new InterfaceC869960YAw(sQLiteStatementCompileStatement) { // from class: X.0VOO
            public final SQLiteStatement LIZ;

            @Override // X.InterfaceC869960YAw
            public final int LJIIL() {
                return this.LIZ.executeUpdateDelete();
            }

            @Override // X.InterfaceC869960YAw
            public final long LJIL() {
                return this.LIZ.executeInsert();
            }

            @Override // X.InterfaceC869960YAw
            public final void LJJIIZ() {
                this.LIZ.clearBindings();
            }

            @Override // X.InterfaceC869960YAw
            public final void close() {
                this.LIZ.close();
            }

            {
                this.LIZ = sQLiteStatementCompileStatement;
            }

            @Override // X.InterfaceC869960YAw
            public final void LJIILIIL(int i, String str2) {
                this.LIZ.bindString(i, str2);
            }

            @Override // X.InterfaceC869960YAw
            public final void LJIJ(int i, long j) {
                this.LIZ.bindLong(i, j);
            }

            @Override // X.InterfaceC869960YAw
            public final void LJJI(double d, int i) {
                this.LIZ.bindDouble(i, d);
            }

            @Override // X.InterfaceC869960YAw
            public final void LJJIIJZLJL(int i, byte[] bArr) {
                this.LIZ.bindBlob(i, bArr);
            }
        };
    }

    @Override // X.InterfaceC870450YCt
    public final void LJIILJJIL(String str) {
        this.LIZ.execSQL(str);
    }

    @Override // X.InterfaceC870450YCt
    public final long LJJIJIIJIL(String str, ContentValues contentValues) {
        return this.LIZ.insertOrThrow(str, null, contentValues);
    }

    @Override // X.InterfaceC870450YCt
    public final long LJJIJLIJ(String str, ContentValues contentValues) {
        return this.LIZ.replaceOrThrow(str, null, contentValues);
    }

    @Override // X.InterfaceC870450YCt
    public final long LJJIL(String str, ContentValues contentValues) {
        return this.LIZ.insertWithOnConflict(str, null, contentValues, 5);
    }

    @Override // X.InterfaceC870450YCt
    public final InterfaceC869470Y8z LJJJ(String str, String[] strArr) {
        final Cursor cursorRawQuery = this.LIZ.rawQuery(str, strArr);
        return new InterfaceC869470Y8z(cursorRawQuery) { // from class: X.0VS5
            public final Cursor LIZ;

            @Override // X.InterfaceC869470Y8z
            public final void close() {
                this.LIZ.close();
            }

            @Override // X.InterfaceC869470Y8z
            public final int getCount() {
                return this.LIZ.getCount();
            }

            @Override // X.InterfaceC869470Y8z
            public final boolean moveToFirst() {
                return this.LIZ.moveToFirst();
            }

            @Override // X.InterfaceC869470Y8z
            public final boolean moveToNext() {
                return this.LIZ.moveToNext();
            }

            {
                this.LIZ = cursorRawQuery;
            }

            @Override // X.InterfaceC869470Y8z
            public final byte[] getBlob(int i) {
                return this.LIZ.getBlob(i);
            }

            @Override // X.InterfaceC869470Y8z
            public final int getColumnIndex(String str2) {
                return this.LIZ.getColumnIndex(str2);
            }

            @Override // X.InterfaceC869470Y8z
            public final int getColumnIndexOrThrow(String str2) {
                return this.LIZ.getColumnIndexOrThrow(str2);
            }

            @Override // X.InterfaceC869470Y8z
            public final int getInt(int i) {
                return this.LIZ.getInt(i);
            }

            @Override // X.InterfaceC869470Y8z
            public final long getLong(int i) {
                return this.LIZ.getLong(i);
            }

            @Override // X.InterfaceC869470Y8z
            public final String getString(int i) {
                return this.LIZ.getString(i);
            }

            @Override // X.InterfaceC869470Y8z
            public final int getType(int i) {
                return this.LIZ.getType(i);
            }
        };
    }

    @Override // X.InterfaceC870450YCt
    public final long LJJJI(String str, ContentValues contentValues) {
        return this.LIZ.insertWithOnConflict(str, null, contentValues, 4);
    }

    @Override // X.InterfaceC870450YCt
    public final int LJJIJL(String str, String str2, String[] strArr) {
        return this.LIZ.delete(str, str2, strArr);
    }

    @Override // X.InterfaceC870450YCt
    public final int LJJIJIL(String str, ContentValues contentValues, String str2, String[] strArr) {
        return this.LIZ.update(str, contentValues, str2, strArr);
    }
}
