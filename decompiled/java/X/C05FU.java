package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.05FU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05FU {
    public static final C05FU LIZ = new C05FU();
    public static final Map<String, List<C05FY>> LIZIZ = new LinkedHashMap();
    public static final Map<String, Set<C05FV>> LIZJ = new LinkedHashMap();
    public static final Map<String, C09AE> LIZLLL = new LinkedHashMap();
    public static final C054G LJ;

    static {
        C1DFH c1dfh = C0PEM.LIZ;
        LJ = C2296808zG.LIZ(C2107308Nj.LIZ);
    }

    public static void LIZIZ(String str) {
        long j;
        Map<String, C09AE> map = LIZLLL;
        C09AE c09ae = (C09AE) ((LinkedHashMap) map).get(str);
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        map.remove(str);
        List<C05FY> listRemove = LIZIZ.remove(str);
        if (listRemove != null) {
            LIZ.getClass();
            Set<C05FV> set = (Set) ((LinkedHashMap) LIZJ).get(str);
            if (set != null) {
                for (C05FV c05fv : set) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String str2 = c05fv.LIZ;
                    List<String> list = c05fv.LIZIZ;
                    C05FX c05fx = c05fv.LIZJ;
                    ArrayList arrayList = new ArrayList();
                    for (C05FY c05fy : listRemove) {
                        if (list.contains(c05fy.LIZ)) {
                            arrayList.add(c05fy);
                        }
                    }
                    int i = 1;
                    if (!arrayList.isEmpty()) {
                        if (arrayList.size() < list.size()) {
                            ArrayList arrayList2 = new ArrayList();
                            for (String str3 : list) {
                                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(((C05FY) it2.next()).LIZ);
                                }
                                if (!arrayList3.contains(str3)) {
                                    arrayList2.add(str3);
                                }
                            }
                            linkedHashMap.put("missing_stages", C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62));
                        }
                        int i2 = 0;
                        long j2 = ((C05FY) ListProtector.get(arrayList, 0)).LIZIZ;
                        int size = arrayList.size();
                        while (i2 < size) {
                            C05FY c05fy2 = (C05FY) ListProtector.get(arrayList, i2);
                            Map<String, String> map2 = c05fy2.LIZJ;
                            if (map2 != null) {
                                linkedHashMap.putAll(map2);
                            }
                            if (i2 == 0) {
                                linkedHashMap.put(c05fy2.LIZ, CardStruct.IStatusCode.DEFAULT);
                            } else {
                                if (i2 == arrayList.size() - i) {
                                    linkedHashMap.put("duration_ms", String.valueOf(c05fy2.LIZIZ - j2));
                                }
                                int i3 = C05FW.LIZ[c05fx.ordinal()];
                                if (i3 != i) {
                                    if (i3 == 2) {
                                        j = c05fy2.LIZIZ - j2;
                                    } else {
                                        throw new C1954807lC();
                                    }
                                } else {
                                    j = c05fy2.LIZIZ - ((C05FY) ListProtector.get(arrayList, i2 - 1)).LIZIZ;
                                }
                                if (!linkedHashMap.containsKey(c05fy2.LIZ)) {
                                    linkedHashMap.put(c05fy2.LIZ, String.valueOf(j));
                                }
                            }
                            i2++;
                            i = 1;
                        }
                    }
                    C20684815ws.LJIILLIIL(str2, linkedHashMap);
                }
            }
        }
    }

    public static void LIZJ(String str, C05FV... c05fvArr) {
        Map<String, Set<C05FV>> map = LIZJ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        if (linkedHashMap.get(str) == null) {
            map.put(str, new LinkedHashSet());
        }
        Set set = (Set) linkedHashMap.get(str);
        if (set != null) {
            C19719612Di.LJJII(set, c05fvArr);
        }
    }

    public static void LIZLLL(Long l, String str) {
        Map<String, List<C05FY>> map = LIZIZ;
        if (((LinkedHashMap) map).get(str) != null) {
            LIZIZ(str);
        }
        map.put(str, new ArrayList());
        if (l != null) {
            LIZLLL.put(str, C23250099c.LIZLLL(LJ, null, null, new C05FT(l.longValue(), str, null), 3));
        }
    }

    public static void LIZ(C05FU c05fu, String str, String str2) {
        c05fu.getClass();
        C05FY c05fy = new C05FY(System.currentTimeMillis(), str2, null);
        List list = (List) ((LinkedHashMap) LIZIZ).get(str);
        if (list != null) {
            list.add(c05fy);
        }
    }
}
