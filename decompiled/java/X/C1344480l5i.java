package X;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344480l5i {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, boolean z) {
        String str3;
        if (str == null) {
            return;
        }
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("aweme_id", str));
        if (str2 != null) {
            mapLJIIJ.put("insert_ids", str2);
        }
        PowerPreloadServiceImpl.LIZIZ().LIZ("/aweme/v2/comment/list/", mapLJIIJ);
        Map mapSnapshot = ((LruCache) C1344490l5j.LIZ.getValue()).snapshot();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapSnapshot.entrySet()) {
            if (str2 == null) {
                if (Intrinsics.LJFF(((C1344500l5k) entry.getKey()).LIZ, str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } else if (Intrinsics.LJFF(((C1344500l5k) entry.getKey()).LIZ, str) && Intrinsics.LJFF(((C1344500l5k) entry.getKey()).LIZLLL, str2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        int i = 0;
        while (it2.hasNext()) {
            ((LruCache) C1344490l5j.LIZ.getValue()).remove(((Map.Entry) it2.next()).getKey());
            i++;
        }
        C1344030l4z.LIZJ("InboxCommentPreload", "remove cache by aid " + str + " cid " + str2 + ", remove count: " + i);
        synchronized (C1344320l5S.LIZ) {
            try {
                PthreadTimer pthreadTimer = C1344320l5S.LIZIZ;
                if (pthreadTimer != null) {
                    pthreadTimer.cancel();
                }
                C1344320l5S.LIZIZ = new PthreadTimer("CommentPreloadCacheTimer");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (C295800Bic.LIZ() && !z) {
            C1344470l5h.LIZ.getClass();
            C1344470l5h.LIZLLL();
            Map mapSnapshot2 = C1344470l5h.LIZ().snapshot();
            if (mapSnapshot2 != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : mapSnapshot2.entrySet()) {
                    C1344500l5k c1344500l5k = (C1344500l5k) entry2.getKey();
                    if (c1344500l5k != null) {
                        str3 = c1344500l5k.LIZ;
                    } else {
                        str3 = null;
                    }
                    if (Intrinsics.LJFF(str3, str)) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    C1344470l5h.LIZ.getClass();
                    C1344470l5h.LIZ().remove(entry3.getKey());
                }
            }
        }
        if ((C296030Biz.LIZ() || (C296030Biz.LIZIZ() & 2) > 0) && !z) {
            C1344220l5I.LIZ.getClass();
            C1344220l5I.LIZIZ(str);
        }
    }
}
