package X;

import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.BeatTrackingData;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.Material;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0gJC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160640gJC {
    public static final C1160640gJC LIZ = new C1160640gJC();
    public static final List<Material> LIZIZ;
    public static final List<Material> LIZJ;
    public static final List<Material> LIZLLL;

    static {
        C7740030o.LIZ().getGson();
        EnumC2005707tP enumC2005707tP = EnumC2005707tP.IMAGE;
        EnumC2005707tP enumC2005707tP2 = EnumC2005707tP.VIDEO;
        LIZIZ = C1697810uHb.LJIIJJI(new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 15.0d), new Material(enumC2005707tP2, 40.0d), new Material(enumC2005707tP2, 1.0d));
        LIZJ = C1697810uHb.LJIIJJI(new Material(enumC2005707tP2, 15.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 1.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 40.0d));
        LIZLLL = C1697810uHb.LJIIJJI(new Material(enumC2005707tP2, 40.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 5.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP, 0.0d), new Material(enumC2005707tP2, 20.0d));
    }

    public static BeatTrackingData LIZ(Map map, int i, List list, List list2, List list3, List list4) {
        Object objLJJJLZIJ;
        Object objLJJJLZIJ2;
        Object objLJJJLZIJ3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) ((LinkedHashMap) map).get(Double.valueOf(((Number) it2.next()).doubleValue()));
            if (num != null && (objLJJJLZIJ3 = C13LP.LJJJLZIJ(num.intValue(), list2)) != null) {
                arrayList.add(objLJJJLZIJ3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Integer num2 = (Integer) ((LinkedHashMap) map).get(Double.valueOf(((Number) it3.next()).doubleValue()));
            if (num2 != null && (objLJJJLZIJ2 = C13LP.LJJJLZIJ(num2.intValue(), list3)) != null) {
                arrayList3.add(objLJJJLZIJ2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Integer num3 = (Integer) ((LinkedHashMap) map).get(Double.valueOf(((Number) it4.next()).doubleValue()));
            if (num3 != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(num3.intValue(), list4)) != null) {
                arrayList4.add(objLJJJLZIJ);
            }
        }
        return new BeatTrackingData(i, arrayList, arrayList3, arrayList4);
    }
}
