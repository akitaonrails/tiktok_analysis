package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: X.0VOS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VOS extends SQLiteOpenHelper {
    public static C0VOS LL;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C0VOS(Context context) {
        super(C786410Ut5.N3(context), "fangqing.db", (SQLiteDatabase.CursorFactory) null, 1);
    }
}
