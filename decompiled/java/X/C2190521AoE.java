package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1AoE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190521AoE extends SQLiteOpenHelper {
    public final InterfaceC2190561AoI LL;
    public final String LLILLJJLI;
    public final List<String> LLILLL;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            for (String str : this.LLILLL) {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.execSQL(str);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LL.LIZIZ("SqliteDbHelper:onCreate", th, new AwS578S0100000_34(this, 216));
        }
    }

    public C2190521AoE(InterfaceC2190561AoI interfaceC2190561AoI, Context context, String str, int i, List list, AbstractC2190531AoF abstractC2190531AoF) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.LL = interfaceC2190561AoI;
        this.LLILLJJLI = str;
        this.LLILLL = list;
    }
}
