package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.share.shareprop.SharePropCacheItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0m9K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385160m9K {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(623));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(622));
    public static final List<SharePropCacheItem> LIZJ = new ArrayList();
    public static boolean LIZLLL;

    public static List LIZ() {
        if (LIZLLL) {
            return LIZJ;
        }
        String string = ((Keva) LIZ.getValue()).getString("share_prop_cache_list", "");
        if (string.length() > 0) {
            try {
                List list = (List) ((Gson) LIZIZ.getValue()).LJIIIIZZ(string, new TypeToken<List<? extends SharePropCacheItem>>() { // from class: X.0m9L
                }.getType());
                if (list != null) {
                    List<SharePropCacheItem> list2 = LIZJ;
                    List listLJJJJLI = C13LP.LJJJJLI(list);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (ArrayList) listLJJJJLI) {
                        SharePropCacheItem sharePropCacheItem = (SharePropCacheItem) obj;
                        if ((sharePropCacheItem.itemId == null || sharePropCacheItem.spRootD == null || sharePropCacheItem.spLevel == null) ? false : true) {
                            arrayList.add(obj);
                        }
                    }
                    ((ArrayList) list2).addAll(arrayList);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LIZLLL = true;
        return LIZJ;
    }

    public static int LIZIZ(long j) {
        ArrayList arrayList = (ArrayList) LIZ();
        int i = 0;
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size();
        while (true) {
            if (i >= size) {
                break;
            }
            if (((SharePropCacheItem) ListProtector.get(arrayList, i)).timestamp < j) {
                if (i != -1) {
                    arrayList.subList(i, arrayList.size()).clear();
                    LIZJ(arrayList);
                }
            } else {
                i++;
            }
        }
        return arrayList.size();
    }

    public static void LIZJ(List list) {
        try {
            ((Keva) LIZ.getValue()).storeString("share_prop_cache_list", ((Gson) LIZIZ.getValue()).LJIILL(list));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
