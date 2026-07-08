package X;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: renamed from: X.0VOM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VOM extends C0VON implements InterfaceC796340VLs {
    public final SQLiteStatement LLILLJJLI;

    @Override // X.InterfaceC796340VLs
    public final int LJIIL() {
        return this.LLILLJJLI.executeUpdateDelete();
    }

    @Override // X.InterfaceC796340VLs
    public final long LJIL() {
        return this.LLILLJJLI.executeInsert();
    }

    public C0VOM(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.LLILLJJLI = sQLiteStatement;
    }
}
