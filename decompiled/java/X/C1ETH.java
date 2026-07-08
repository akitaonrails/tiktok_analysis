package X;

import android.database.Cursor;

/* JADX INFO: renamed from: X.1ETH, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public interface C1ETH extends Cursor {
    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // android.database.Cursor
    byte[] getBlob(int i);

    @Override // android.database.Cursor
    int getColumnIndex(String str);

    @Override // android.database.Cursor
    int getColumnIndexOrThrow(String str);

    @Override // android.database.Cursor
    int getCount();

    @Override // android.database.Cursor
    int getInt(int i);

    @Override // android.database.Cursor
    long getLong(int i);

    @Override // android.database.Cursor
    String getString(int i);

    @Override // android.database.Cursor
    int getType(int i);

    @Override // android.database.Cursor
    boolean moveToFirst();

    @Override // android.database.Cursor
    boolean moveToNext();
}
