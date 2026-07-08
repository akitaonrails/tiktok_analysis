package X;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: renamed from: X.0VON, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VON implements InterfaceC590330NDj {
    public final SQLiteProgram LL;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LL.close();
    }

    public C0VON(SQLiteProgram sQLiteProgram) {
        this.LL = sQLiteProgram;
    }

    @Override // X.InterfaceC590330NDj
    public final void LLD(int i) {
        this.LL.bindNull(i);
    }

    @Override // X.InterfaceC590330NDj
    public final void LJIILIIL(int i, String str) {
        this.LL.bindString(i, str);
    }

    @Override // X.InterfaceC590330NDj
    public final void LJIJ(int i, long j) {
        this.LL.bindLong(i, j);
    }

    @Override // X.InterfaceC590330NDj
    public final void LJJI(double d, int i) {
        this.LL.bindDouble(i, d);
    }

    @Override // X.InterfaceC590330NDj
    public final void LJJIIJZLJL(int i, byte[] bArr) {
        this.LL.bindBlob(i, bArr);
    }
}
