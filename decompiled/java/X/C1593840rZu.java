package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0rZu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593840rZu {
    public static final C1593840rZu LIZ = new C1593840rZu();
    public static final ConcurrentHashMap<String, List<String>> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(List list) {
        Integer numValueOf;
        ConcurrentHashMap<String, List<String>> concurrentHashMap = LIZIZ;
        if (!concurrentHashMap.containsKey(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            concurrentHashMap.put(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), new ArrayList());
        }
        List<String> list2 = concurrentHashMap.get(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        if (list2 != null) {
            list2.addAll(list);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addRepostFeedAweme: cur size=");
        if (list2 != null) {
            numValueOf = Integer.valueOf(list2.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static List LIZJ(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (TextUtils.isDigitsOnly((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List LIZIZ(EnumC1360670lVp enumC1360670lVp, EnumC1603630rph enumC1603630rph) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<C0VNG> listLIZIZ = C0VRX.LIZIZ.LIZIZ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator<C0VNG> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        List listLIZJ = LIZJ(arrayList);
        C1593850rZv c1593850rZv = C1593850rZv.LIZ;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        int type = enumC1603630rph.getType();
        int value = enumC1360670lVp.getValue();
        c1593850rZv.getClass();
        C1593850rZv.LIZ(type, value, jCurrentTimeMillis2, "dislike_scene");
        return listLIZJ;
    }

    public static List LIZLLL(EnumC1360670lVp enumC1360670lVp, EnumC1603630rph enumC1603630rph) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<C0VNS> listLJI = C1593830rZt.LIZIZ.LJI();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJI, 10));
        Iterator<C0VNS> it2 = listLJI.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        List listLIZJ = LIZJ(arrayList);
        C1593850rZv c1593850rZv = C1593850rZv.LIZ;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        int type = enumC1603630rph.getType();
        int value = enumC1360670lVp.getValue();
        c1593850rZv.getClass();
        C1593850rZv.LIZ(type, value, jCurrentTimeMillis2, "all_scene");
        return listLIZJ;
    }

    public static List LJ(EnumC1360670lVp enumC1360670lVp, EnumC1603630rph enumC1603630rph) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<C0VNS> listLIZIZ = C1593830rZt.LIZIZ.LIZIZ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator<C0VNS> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        List listLIZJ = LIZJ(arrayList);
        C1593850rZv c1593850rZv = C1593850rZv.LIZ;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        int type = enumC1603630rph.getType();
        int value = enumC1360670lVp.getValue();
        c1593850rZv.getClass();
        C1593850rZv.LIZ(type, value, jCurrentTimeMillis2, "repost_scene");
        return listLIZJ;
    }
}
