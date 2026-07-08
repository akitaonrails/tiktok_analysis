package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669390QNl {
    public static final C669390QNl LIZ = new C669390QNl();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(16));
    public static volatile C687420Qxo LIZJ;

    public final void LIZ(List<? extends SearchSugEntity> list) {
        if (list.isEmpty()) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            C687420Qxo c687420Qxo = LIZJ;
            if (c687420Qxo == null) {
                synchronized (this) {
                    try {
                        c687420Qxo = LIZJ;
                        if (c687420Qxo == null) {
                            c687420Qxo = new C687420Qxo(contextLIZ);
                            LIZJ = c687420Qxo;
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            SQLiteDatabase writableDatabase = c687420Qxo.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                writableDatabase.delete("server_sug_cache", null, null);
                for (SearchSugEntity searchSugEntity : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("content", searchSugEntity.content);
                    contentValues.put("entity", ((Gson) LIZIZ.getValue()).LJIILL(searchSugEntity));
                    contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                    writableDatabase.insertWithOnConflict("server_sug_cache", null, contentValues, 5);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(list.size());
                sbLIZ.append(" server sug items saved to DB cost: ");
                sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                sbLIZ.append("ms");
                C2188811AlT.LIZIZ(sbLIZ);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (Exception th2) {
        }
    }
}
