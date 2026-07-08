package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13Tu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20017213Tu extends SQLiteOpenHelper {
    public static C20017213Tu LL;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final long LIZLLL() {
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = Long.MAX_VALUE;
        LIZIZ(null, null, "1", new AwS609S0100000_30(c238400w2, 246));
        return c238400w2.element;
    }

    public C20017213Tu(Context context) {
        super(context, "ec_product_add_button_show", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        ConcurrentHashMap<String, Object> concurrentHashMap = C1892170zL5.LIZ;
        C1892170zL5.LIZLLL("onCreate", new AwS431S0200000_30(this, sQLiteDatabase, 43));
    }

    public static void LIZ(SQLiteDatabase sQLiteDatabase, String str) {
        if (str != null && str.length() != 0) {
            try {
                sQLiteDatabase.execSQL(str);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static String LJFF(long j, long j2, boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UPDATE ec_product_add_button_show SET click_time = ");
            sbLIZ.append(j2);
            sbLIZ.append(", is_click = 1 WHERE video_id = ");
            sbLIZ.append(j);
            sbLIZ.append(';');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("REPLACE INTO ec_product_add_button_show (video_id, show_time, is_click) VALUES (");
        sbLIZ2.append(j);
        sbLIZ2.append(", ");
        sbLIZ2.append(j2);
        sbLIZ2.append(", 0);");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final void LIZIZ(String str, String[] strArr, String str2, Function1 function1) {
        try {
            Cursor cursorQuery = getReadableDatabase().query("ec_product_add_button_show", new String[]{"video_id", "show_time", "click_time", "is_click"}, str, strArr, null, null, "show_time DESC", str2);
            if (cursorQuery != null) {
                function1.invoke(cursorQuery);
                cursorQuery.close();
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
