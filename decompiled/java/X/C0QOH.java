package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0QOH, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.sug.core.cache.SugHistoryDbHelper$scheduleFlush$1", f = "SugHistoryDbHelper.kt", l = {134}, m = "invokeSuspend")
public final class C0QOH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C0QOH(InterfaceC1364105Vn<? super C0QOH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0QOH(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SugHistoryDbHelper@6fbb.scheduleFlush$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(30000L, this) == objLJFF) {
                C1C7U.LIZIZ("SugHistoryDbHelper@6fbb.scheduleFlush$1");
                return objLJFF;
            }
        }
        C0QOI c0qoi = C0QOI.LIZ;
        ArrayList<SearchSugEntity> arrayList = new ArrayList();
        while (true) {
            ConcurrentLinkedQueue<SearchSugEntity> concurrentLinkedQueue = C0QOI.LIZJ;
            if (!(!concurrentLinkedQueue.isEmpty())) {
                break;
            }
            SearchSugEntity searchSugEntityPoll = concurrentLinkedQueue.poll();
            if (searchSugEntityPoll != null) {
                arrayList.add(searchSugEntityPoll);
            }
        }
        if (!arrayList.isEmpty()) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C844470XAv.LIZ.getClass();
                SQLiteDatabase writableDatabase = c0qoi.LIZIZ(C844470XAv.LIZ()).getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (SearchSugEntity searchSugEntity : arrayList) {
                        searchSugEntity.sugExtraInfo = null;
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("content", searchSugEntity.content);
                        C0QOI c0qoi2 = C0QOI.LIZ;
                        contentValues.put("entity", ((Gson) C0QOI.LIZIZ.getValue()).LJIILL(searchSugEntity));
                        contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                        writableDatabase.insertWithOnConflict("sug_history", null, contentValues, 5);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("\n                    DELETE FROM sug_history \n                    WHERE id NOT IN (\n                        SELECT id FROM sug_history \n                        ORDER BY timestamp DESC \n                        LIMIT ");
                    sbLIZ.append(((Number) C284290BCh.LIZ.getValue()).intValue());
                    sbLIZ.append("\n                    )\n                ");
                    writableDatabase.execSQL(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("DB trimmed after flush, cost ");
                    sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SugHistoryDbHelper@6fbb.scheduleFlush$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0QOH(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
