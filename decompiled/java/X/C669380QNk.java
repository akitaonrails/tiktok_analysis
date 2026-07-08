package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0QNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.sug.core.cache.SugHotSearchDbHelper$scheduleFlush$1", f = "SugHotSearchDbHelper.kt", l = {110}, m = "invokeSuspend")
public final class C669380QNk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C669380QNk(InterfaceC1364105Vn<? super C669380QNk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C669380QNk(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SugHotSearchDbHelper@3d16.scheduleFlush$1");
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
                C1C7U.LIZIZ("SugHotSearchDbHelper@3d16.scheduleFlush$1");
                return objLJFF;
            }
        }
        C0QIN c0qin = C0QIN.LIZ;
        ArrayList<SearchSugEntity> arrayList = new ArrayList();
        while (true) {
            ConcurrentLinkedQueue<Word> concurrentLinkedQueue = C0QIN.LIZJ;
            if (!(!concurrentLinkedQueue.isEmpty())) {
                break;
            }
            Word wordPoll = concurrentLinkedQueue.poll();
            if (wordPoll != null) {
                SearchSugEntity searchSugEntity = new SearchSugEntity();
                searchSugEntity.content = wordPoll.getWord();
                arrayList.add(searchSugEntity);
            }
        }
        if (!arrayList.isEmpty()) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C844470XAv.LIZ.getClass();
                SQLiteDatabase writableDatabase = c0qin.LIZ(C844470XAv.LIZ()).getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (SearchSugEntity searchSugEntity2 : arrayList) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("content", searchSugEntity2.content);
                        C0QIN c0qin2 = C0QIN.LIZ;
                        contentValues.put("entity", ((Gson) C0QIN.LIZIZ.getValue()).LJIILL(searchSugEntity2));
                        contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                        writableDatabase.insertWithOnConflict("sug_hot_search", null, contentValues, 5);
                    }
                    writableDatabase.execSQL("DELETE FROM sug_hot_search \nWHERE id NOT IN (\n    SELECT id FROM sug_hot_search \n    ORDER BY timestamp DESC \n    LIMIT ?\n)", new String[]{String.valueOf(((Number) C272020AlM.LIZ.getValue()).intValue())});
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Hot Sug DB flushed and trimmed, cost ");
                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbLIZ.append("ms");
                    C2188811AlT.LIZIZ(sbLIZ);
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
        C1C7U.LIZIZ("SugHotSearchDbHelper@3d16.scheduleFlush$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C669380QNk(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
