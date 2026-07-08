package X;

import com.tencent.wcdb.database.SQLiteDatabase;

/* JADX INFO: renamed from: X.0Zjj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C908010Zjj implements InterfaceC908110Zjt {
    public static final C908100Zjs LIZLLL = C908020Zjk.LLJJIJIIJIL;
    public final SQLiteDatabase LIZ;
    public final String LIZIZ;
    public C907980Zjg LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SQLiteDirectCursorDriver: ");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C908010Zjj(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        this.LIZ = sQLiteDatabase;
        this.LIZIZ = str;
    }
}
