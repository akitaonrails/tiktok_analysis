package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.database.SQLiteDebug;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0VUD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VUD {
    public static final Map<C0VUC, C0VUG> LIZ = C2097608Jq.LJIIIIZZ(new Pair(C0VUC.SYSTEM, C0VUF.LJFF), new Pair(C0VUC.WCDB, new C0VUG() { // from class: X.0VUK
        @Override // X.C0VUG
        public final C0VUA LIZIZ() {
            try {
                return LIZJ(SQLiteDebug.LIZJ());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return C0VUA.LJFF;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [X.13BV] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
        public static C0VUA LIZJ(SQLiteDebug.PagerStats pagerStats) {
            ?? arrayList;
            List listLJJLIIIJ;
            int iIntValue;
            int iIntValue2;
            String string;
            Integer numLJIIJJI;
            String string2;
            Integer numLJIIJJI2;
            String string3;
            Integer numLJIIJJI3;
            ArrayList<SQLiteDebug.DbStats> arrayList2 = pagerStats.dbStats;
            if (arrayList2 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                for (SQLiteDebug.DbStats dbStats : arrayList2) {
                    String str = dbStats.cache;
                    int iIntValue3 = 0;
                    if (str == null || (listLJJLIIIJ = a0.LJJLIIIJ(str, new char[]{'/'}, false, 0, 6)) == null) {
                        listLJJLIIIJ = C13BV.INSTANCE;
                    }
                    String str2 = dbStats.dbName;
                    long j = dbStats.pageSize;
                    long j2 = dbStats.dbSize;
                    int i = dbStats.lookaside;
                    String str3 = (String) C13LP.LJJJLZIJ(0, listLJJLIIIJ);
                    if (str3 != null && (string3 = a0.LJLIIIL(str3).toString()) != null && (numLJIIJJI3 = C2095008Iq.LJIIJJI(string3)) != null) {
                        iIntValue = numLJIIJJI3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    String str4 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJ);
                    if (str4 != null && (string2 = a0.LJLIIIL(str4).toString()) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(string2)) != null) {
                        iIntValue2 = numLJIIJJI2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    String str5 = (String) C13LP.LJJJLZIJ(2, listLJJLIIIJ);
                    if (str5 != null && (string = a0.LJLIIIL(str5).toString()) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(string)) != null) {
                        iIntValue3 = numLJIIJJI.intValue();
                    }
                    arrayList.add(new C0VUH(str2, j, j2, i, iIntValue, iIntValue2, iIntValue3));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            return new C0VUA(pagerStats.memoryUsed, pagerStats.pageCacheOverflow, pagerStats.largestMemAlloc, arrayList);
        }
    }));
}
