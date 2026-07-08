package X;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.consume.model.SearchConsumeModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.0PQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644770PQt {
    public static boolean LIZIZ;
    public static final C644770PQt LIZ = new C644770PQt();
    public static String LIZJ = "";
    public static final LruCache<String, String> LIZLLL = new LruCache<>(200);

    public static String LIZIZ() {
        ArrayList arrayList;
        k kVarLJIL;
        C2252051DCp c2252051DCp = C2252051DCp.LIZ;
        Map<String, String> mapSnapshot = LIZLLL.snapshot();
        c2252051DCp.getClass();
        C1D36 c1d36LIZIZ = C2252051DCp.LIZJ.LIZIZ(C2252051DCp.LJ, "general_search");
        if (c1d36LIZIZ == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator<Map.Entry<String, String>> it2 = mapSnapshot.entrySet().iterator();
            while (it2.hasNext()) {
                C2252061DCq c2252061DCqLIZ = c1d36LIZIZ.LIZJ.LIZ(it2.next().getKey());
                if (c2252061DCqLIZ != null) {
                    arrayList.add(c2252061DCqLIZ);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            SearchConsumeModel searchConsumeModelLIZ = C2252081DCs.LIZ((C2252061DCq) it3.next());
            if (searchConsumeModelLIZ != null) {
                arrayList2.add(searchConsumeModelLIZ);
            }
        }
        Collections.reverse(arrayList2);
        try {
            try {
                kVarLJIL = new Gson().LJIL(arrayList2, new TypeToken<List<? extends SearchConsumeModel>>() { // from class: X.0PQD
                }.getType());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                kVarLJIL = null;
            }
            return (kVarLJIL != null ? kVarLJIL.LJIIL() : new h()).toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static ArrayList LIZJ() {
        ArrayList arrayList = new ArrayList();
        C2252051DCp.LIZ.getClass();
        ArrayList arrayListLIZLLL = C2252051DCp.LIZLLL(20);
        if (arrayListLIZLLL != null && (!arrayListLIZLLL.isEmpty())) {
            Iterator it2 = arrayListLIZLLL.iterator();
            while (it2.hasNext()) {
                SearchConsumeModel searchConsumeModelLIZ = C2252081DCs.LIZ((C2252061DCq) it2.next());
                if (searchConsumeModelLIZ != null) {
                    arrayList.add(GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), searchConsumeModelLIZ));
                }
            }
        }
        return arrayList;
    }

    public static void LIZ(String str, String str2) {
        if (!TextUtils.equals(str, LIZJ)) {
            LIZLLL.evictAll();
            C2252051DCp.LIZ.getClass();
            C2252051DCp.LIZ("general_search");
        }
        LIZJ = str.toUpperCase(Locale.ROOT);
        LIZLLL.put(str2, str2);
    }
}
