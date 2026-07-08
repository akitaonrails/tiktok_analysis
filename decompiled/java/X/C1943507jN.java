package X;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07jN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1943507jN {
    public static final C1943507jN LIZ = new C1943507jN();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1176));
    public static final ConcurrentHashMap<String, List<String>> LIZJ = new ConcurrentHashMap<>();

    public final synchronized void LIZLLL() {
        try {
            ((LruCache) LIZIZ.getValue()).evictAll();
            LIZJ.clear();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final synchronized void LIZ(String str) {
        try {
            List<String> list = LIZJ.get(str);
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    ((LruCache) LIZIZ.getValue()).remove(it2.next());
                }
            }
            ConcurrentHashMap<String, List<String>> concurrentHashMap = LIZJ;
            C19719512Dh.LIZJ(concurrentHashMap).remove(str);
            List<String> list2 = concurrentHashMap.get("");
            if (list2 != null) {
                Iterator<String> it3 = list2.iterator();
                while (it3.hasNext()) {
                    ((LruCache) LIZIZ.getValue()).remove(it3.next());
                }
            }
            LIZJ.remove("");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final synchronized Aweme LIZIZ(String str) {
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
        return (Aweme) ((LruCache) LIZIZ.getValue()).get(str);
    }

    public final synchronized void LIZJ(Aweme aweme, String str, String str2) {
        List<String> listPutIfAbsent;
        try {
            ((LruCache) LIZIZ.getValue()).put(str, aweme);
            ConcurrentHashMap<String, List<String>> concurrentHashMap = LIZJ;
            List<String> arrayList = concurrentHashMap.get(str2);
            if (arrayList == null && (listPutIfAbsent = concurrentHashMap.putIfAbsent(str2, (arrayList = new ArrayList<>()))) != null) {
                arrayList = listPutIfAbsent;
            }
            arrayList.add(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
