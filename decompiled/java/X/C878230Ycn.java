package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.database.SQLiteDatabase;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0Ycn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878230Ycn extends AbstractC622560ObO {
    public static boolean LLJILJIL;
    public final C01GW LLJIJIL;

    @Override // X.AbstractC622560ObO
    public final void LJIIIZ(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // X.AbstractC622560ObO
    public final void LJFF(SQLiteDatabase sQLiteDatabase) {
        if (C907870ZjV.LIZIZ.enableWal) {
            sQLiteDatabase.LJIJJLI();
        }
    }

    @Override // X.AbstractC622560ObO
    public final void LJI(SQLiteDatabase sQLiteDatabase) {
        Object c098200Yq;
        try {
            sQLiteDatabase.LJJ("CREATE VIRTUAL TABLE IF NOT EXISTS im_search_index_new USING fts4(business_type INTEGER, business_id TEXT,content_type INTEGER, search_content TEXT, update_time INTEGER, grouping_type INTEGER, grouping_id TEXT, filter TEXT, ext TEXT, notindexed=business_type, notindexed=business_id, notindexed=content_type, notindexed=update_time, notindexed=grouping_type, notindexed=grouping_id, notindexed=filter, notindexed=ext, tokenize=mmicu);", null);
            sQLiteDatabase.LJJ("CREATE VIRTUAL TABLE IF NOT EXISTS im_search_token_new USING fts3tokenize(mmicu);", null);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            ((C907860ZjU) this.LLJIJIL.getValue()).LIZ(thM5exceptionOrNullimpl);
        }
    }

    public C878230Ycn(Context context, String str) {
        super(context, str, null, 1, null);
        if (C907870ZjV.LIZIZ.enableWal) {
            LJIIJ(true);
        }
        this.LLJIJIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(622));
    }
}
