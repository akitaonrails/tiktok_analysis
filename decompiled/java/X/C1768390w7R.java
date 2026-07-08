package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.VideoAnchorProduct;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.BcmStandardTrackData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0w7R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1768390w7R {
    public static final C1768390w7R LIZ = new C1768390w7R();

    public static BcmParams LIZ(List list) {
        boolean z;
        Set<String> setKeySet;
        Object obj;
        Map<String, Object> mapLIZ;
        BcmStandardTrackData bcmStandardTrackData;
        Map<String, Object> mapLIZ2;
        Set<String> setKeySet2;
        Object obj2;
        Map<String, Object> mapLIZ3;
        BcmStandardTrackData bcmStandardTrackData2;
        Map<String, Object> mapLIZ4;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        Unit unit = null;
        if (z) {
            return null;
        }
        BcmParams bcmParams = new BcmParams();
        if (C7879035x.LIZLLL()) {
            VideoAnchorProduct videoAnchorProduct = (VideoAnchorProduct) C13LP.LJJJLL(list);
            if (videoAnchorProduct != null && (bcmStandardTrackData2 = videoAnchorProduct.bcmStandardTrack) != null && (mapLIZ4 = C1768380w7Q.LIZ(bcmStandardTrackData2)) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : mapLIZ4.entrySet()) {
                    if (entry.getValue() instanceof String) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                setKeySet2 = linkedHashMap.keySet();
            } else {
                setKeySet2 = null;
            }
            if (setKeySet2 != null) {
                for (String str : setKeySet2) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        BcmStandardTrackData bcmStandardTrackData3 = ((VideoAnchorProduct) it2.next()).bcmStandardTrack;
                        if (bcmStandardTrackData3 == null || (mapLIZ3 = C1768380w7Q.LIZ(bcmStandardTrackData3)) == null || (obj2 = mapLIZ3.get(str)) == null) {
                            obj2 = "";
                        }
                        arrayList.add(obj2);
                    }
                    bcmParams.put(str, C13LP.LJJLIIIJ(arrayList, "|", null, null, 0, null, null, 62));
                }
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
            return bcmParams;
        }
        try {
            VideoAnchorProduct videoAnchorProduct2 = (VideoAnchorProduct) C13LP.LJJJLL(list);
            if (videoAnchorProduct2 != null && (bcmStandardTrackData = videoAnchorProduct2.bcmStandardTrack) != null && (mapLIZ2 = C1768380w7Q.LIZ(bcmStandardTrackData)) != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, Object> entry2 : mapLIZ2.entrySet()) {
                    if (entry2.getValue() instanceof String) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                setKeySet = linkedHashMap2.keySet();
            } else {
                setKeySet = null;
            }
            if (setKeySet != null) {
                for (String str2 : setKeySet) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        BcmStandardTrackData bcmStandardTrackData4 = ((VideoAnchorProduct) it3.next()).bcmStandardTrack;
                        if (bcmStandardTrackData4 == null || (mapLIZ = C1768380w7Q.LIZ(bcmStandardTrackData4)) == null || (obj = mapLIZ.get(str2)) == null) {
                            obj = "";
                        }
                        arrayList2.add(obj);
                    }
                    bcmParams.put(str2, C13LP.LJJLIIIJ(arrayList2, "|", null, null, 0, null, null, 62));
                }
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
            return bcmParams;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return bcmParams;
        }
    }

    public static Map LIZIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Unit unit = null;
        if (C7879035x.LIZLLL()) {
            C1227904rF.LIZ.getClass();
            Map<String, Object> mapLIZ = C1768380w7Q.LIZ((BcmStandardTrackData) C1227904rF.LIZIZ(str, BcmStandardTrackData.class));
            if (mapLIZ != null) {
                for (Map.Entry<String, Object> entry : mapLIZ.entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } else {
            try {
                C1227904rF.LIZ.getClass();
                Map<String, Object> mapLIZ2 = C1768380w7Q.LIZ((BcmStandardTrackData) C1227904rF.LIZIZ(str, BcmStandardTrackData.class));
                if (mapLIZ2 != null) {
                    for (Map.Entry<String, Object> entry2 : mapLIZ2.entrySet()) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return C2097608Jq.LJIIZILJ(linkedHashMap);
    }

    public static Map LIZJ(List list) {
        boolean z;
        Set<String> setKeySet;
        Object obj;
        Map<String, Object> mapLIZIZ;
        BcmStandardTrackData bcmStandardTrackData;
        Map<String, Object> mapLIZIZ2;
        Set setKeySet2;
        Object obj2;
        Map<String, Object> mapLIZIZ3;
        BcmStandardTrackData bcmStandardTrackData2;
        Map<String, Object> mapLIZIZ4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return linkedHashMap;
        }
        Unit unit = null;
        if (C7879035x.LIZLLL()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = ((VideoAnchorProduct) it2.next()).productId;
                if (str == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            linkedHashMap.put("product_id", C13LP.LJJLIIIJ(arrayList, "|", null, null, 0, null, null, 62));
            VideoAnchorProduct videoAnchorProduct = (VideoAnchorProduct) C13LP.LJJJLL(list);
            if (videoAnchorProduct != null && (bcmStandardTrackData2 = videoAnchorProduct.bcmStandardTrack) != null && (mapLIZIZ4 = C1768380w7Q.LIZIZ(bcmStandardTrackData2)) != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : mapLIZIZ4.entrySet()) {
                    if (entry.getValue() instanceof String) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                setKeySet2 = linkedHashMap2.keySet();
            } else {
                setKeySet2 = null;
            }
            if (setKeySet2 != null) {
                for (Object obj3 : setKeySet2) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        BcmStandardTrackData bcmStandardTrackData3 = ((VideoAnchorProduct) it3.next()).bcmStandardTrack;
                        if (bcmStandardTrackData3 == null || (mapLIZIZ3 = C1768380w7Q.LIZIZ(bcmStandardTrackData3)) == null || (obj2 = mapLIZIZ3.get(obj3)) == null) {
                            obj2 = "";
                        }
                        arrayList2.add(obj2);
                    }
                    linkedHashMap.put(obj3, C13LP.LJJLIIIJ(arrayList2, "|", null, null, 0, null, null, 62));
                }
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
            return linkedHashMap;
        }
        try {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                String str2 = ((VideoAnchorProduct) it4.next()).productId;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList3.add(str2);
            }
            linkedHashMap.put("product_id", C13LP.LJJLIIIJ(arrayList3, "|", null, null, 0, null, null, 62));
            VideoAnchorProduct videoAnchorProduct2 = (VideoAnchorProduct) C13LP.LJJJLL(list);
            if (videoAnchorProduct2 != null && (bcmStandardTrackData = videoAnchorProduct2.bcmStandardTrack) != null && (mapLIZIZ2 = C1768380w7Q.LIZIZ(bcmStandardTrackData)) != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry<String, Object> entry2 : mapLIZIZ2.entrySet()) {
                    if (entry2.getValue() instanceof String) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                }
                setKeySet = linkedHashMap3.keySet();
            } else {
                setKeySet = null;
            }
            if (setKeySet != null) {
                for (String str3 : setKeySet) {
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        BcmStandardTrackData bcmStandardTrackData4 = ((VideoAnchorProduct) it5.next()).bcmStandardTrack;
                        if (bcmStandardTrackData4 == null || (mapLIZIZ = C1768380w7Q.LIZIZ(bcmStandardTrackData4)) == null || (obj = mapLIZIZ.get(str3)) == null) {
                            obj = "";
                        }
                        arrayList4.add(obj);
                    }
                    linkedHashMap.put(str3, C13LP.LJJLIIIJ(arrayList4, "|", null, null, 0, null, null, 62));
                }
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
            return linkedHashMap;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return linkedHashMap;
        }
    }

    public static void LIZLLL(String str, Map map) {
        Unit unit = null;
        if (C7879035x.LIZLLL()) {
            C1227904rF.LIZ.getClass();
            Map<String, Object> mapLIZIZ = C1768380w7Q.LIZIZ((BcmStandardTrackData) C1227904rF.LIZIZ(str, BcmStandardTrackData.class));
            if (mapLIZIZ != null) {
                for (Map.Entry<String, Object> entry : mapLIZIZ.entrySet()) {
                    map.put(entry.getKey(), entry.getValue());
                }
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
            return;
        }
        try {
            C1227904rF.LIZ.getClass();
            Map<String, Object> mapLIZIZ2 = C1768380w7Q.LIZIZ((BcmStandardTrackData) C1227904rF.LIZIZ(str, BcmStandardTrackData.class));
            if (mapLIZIZ2 != null) {
                for (Map.Entry<String, Object> entry2 : mapLIZIZ2.entrySet()) {
                    map.put(entry2.getKey(), entry2.getValue());
                }
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
