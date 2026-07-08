package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import defpackage.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NDH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NDH {
    public static volatile boolean LIZJ;
    public static final ConcurrentHashMap<String, C0NDK> LIZ = new ConcurrentHashMap<>();
    public static final Map<String, Long> LIZIZ = Collections.synchronizedMap(new LinkedHashMap<String, Long>() { // from class: X.0840
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, Long>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<String, Long>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<Long> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<Long> values() {
            return getValues();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return containsValue((Long) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Long get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Long remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            if (size() > 25) {
                return true;
            }
            return false;
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public /* bridge */ boolean containsValue(Long l) {
            return super.containsValue((Object) l);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        public /* bridge */ Long get(String str) {
            return (Long) super.get((Object) str);
        }

        public /* bridge */ Long remove(String str) {
            return (Long) super.remove((Object) str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return getOrDefault((String) obj, (Long) obj2);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String) || !(obj2 instanceof Long)) {
                return false;
            }
            return remove((String) obj, (Long) obj2);
        }

        public final /* bridge */ Long getOrDefault(Object obj, Long l) {
            if (!(obj instanceof String)) {
                return l;
            }
            return getOrDefault((String) obj, l);
        }

        public /* bridge */ boolean remove(String str, Long l) {
            return super.remove((Object) str, (Object) l);
        }

        public /* bridge */ Long getOrDefault(String str, Long l) {
            return (Long) super.getOrDefault((Object) str, l);
        }
    });
    public static volatile C0NDJ LIZLLL = new C0NER() { // from class: X.0NDJ
        @Override // X.C0NER
        public final /* synthetic */ void LLLLZLLIL(String str) {
        }

        @Override // X.C0NER
        public final void LLLLZLLLI(Long l, String str, Long l2, String str2) {
            C0NDK c0ndk;
            final Aweme aweme;
            if (C590380NDo.LIZJ() && str != null && str.length() != 0) {
                long jLongValue = 0;
                if (l2 != null && l2.longValue() > 0) {
                    Map<String, Long> map = C0NDH.LIZIZ;
                    if (!map.containsKey(str)) {
                        if (l2 != null) {
                            jLongValue = l2.longValue();
                        }
                        map.put(str, Long.valueOf(jLongValue));
                    }
                }
            }
            if (((Boolean) C590380NDo.LJIJ.getValue()).booleanValue() && str != null && str.length() != 0 && Intrinsics.LJFF(l2, l)) {
                ConcurrentHashMap<String, C0NDK> concurrentHashMap = C0NDH.LIZ;
                if (concurrentHashMap.get(str) != null && (c0ndk = concurrentHashMap.get(str)) != null && c0ndk.LIZIZ) {
                    C0NDK c0ndk2 = concurrentHashMap.get(str);
                    if (c0ndk2 != null) {
                        c0ndk2.LIZIZ = false;
                    }
                    C0NDK c0ndk3 = concurrentHashMap.get(str);
                    if (c0ndk3 != null && (aweme = c0ndk3.LIZ) != null) {
                        C1483340ohg.LJIIJJI(aweme, C0NFP.LIZJ(str), true, false, new InterfaceC1475840oVa() { // from class: X.0NDL
                            @Override // X.InterfaceC1475840oVa
                            public final /* synthetic */ void LIZ(long j, long j2) {
                            }

                            @Override // X.InterfaceC1475840oVa
                            public final void LIZIZ(int i) {
                            }

                            @Override // X.InterfaceC1475840oVa
                            public final void onCopyComplete(boolean z, int i, String str3) {
                                C590420NDs c590420NDs = C590420NDs.LIZ;
                                x0 x0Var = x0.LIZ;
                                c590420NDs.getClass();
                                String strLIZ = C590420NDs.LIZ();
                                String aid = aweme.getAid();
                                x0Var.getClass();
                                C590420NDs.LJI().storeString("aid_and_filekey_mapping_unconsumer", x0.LJI(strLIZ, aid));
                            }
                        });
                    }
                }
            }
        }
    };

    public static void LIZ() {
        if (LIZJ || !C1478160oZK.LIZ().LJJLIIIJILLIZJL()) {
            return;
        }
        C582130MsN.LIZ().LJ().getClass();
        C0NEO.LJFF().LIZ(LIZLLL);
        LIZJ = true;
    }

    public static FeedItemList LIZIZ() {
        String strLJI;
        C0NDI c0ndi;
        String str;
        FeedItemList feedItemList = (FeedItemList) (C590380NDo.LIZIZ() ? AFwS195S0000000_9.get$arr$(642).invoke() : null);
        if (feedItemList != null) {
            return feedItemList;
        }
        if (((Boolean) C590380NDo.LJIJI.getValue()).booleanValue()) {
            C590420NDs.LIZ.getClass();
            String strLJIILJJIL = C590420NDs.LJIILJJIL();
            if (strLJIILJJIL.length() == 0) {
                strLJI = "";
            } else {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJIILJJIL, new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLJJLIIIJILLIZJL) {
                    if (!a0.LJJJIL((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                strLJI = C13LP.LJJLIIIJ(C13LP.LL(arrayList, 2), ",", null, null, 0, null, null, 62);
            }
        } else {
            C590420NDs.LIZ.getClass();
            strLJI = C590440NDu.LJI(C590420NDs.LJIILJJIL());
        }
        FeedItemList feedItemListLIZ = C590240NDa.LIZ(strLJI);
        if (feedItemListLIZ == null) {
            C590420NDs c590420NDs = C590420NDs.LIZ;
            x0 x0Var = x0.LIZ;
            c590420NDs.getClass();
            String strLJIILJJIL2 = C590420NDs.LJIILJJIL();
            x0Var.getClass();
            C590420NDs.LJIJI(x0.LIZJ(strLJIILJJIL2, strLJI));
            return feedItemListLIZ;
        }
        if (((Boolean) C590380NDo.LJIILL.getValue()).booleanValue()) {
            ArrayList arrayList2 = new ArrayList();
            List<Aweme> items = feedItemListLIZ.getItems();
            if (items != null) {
                for (Aweme aweme : items) {
                    try {
                        C0NDV c0ndv = C0NDV.LIZ;
                        String aid = aweme.getAid();
                        c0ndv.getClass();
                        if (aid != null && aid.length() != 0) {
                            Map<String, C0NDI> map = C0NDV.LJFF;
                            if (map.containsKey(aid) && (c0ndi = (C0NDI) ((LinkedHashMap) map).get(aid)) != null && (str = c0ndi.LIZ) != null && str.length() != 0 && !C590370NDn.LIZ(aweme.getAid(), str)) {
                                List<Function0<Unit>> list = C0N4C.LIZ;
                                C0N4C.LIZJ(aweme.getAid(), C0N4E.VIDEO_INVALID_IN_USED);
                                C590420NDs c590420NDs2 = C590420NDs.LIZ;
                                x0 x0Var2 = x0.LIZ;
                                c590420NDs2.getClass();
                                String strLJIILJJIL3 = C590420NDs.LJIILJJIL();
                                String aid2 = aweme.getAid();
                                if (aid2 == null) {
                                    aid2 = "";
                                }
                                x0Var2.getClass();
                                C590420NDs.LJIJI(x0.LIZJ(strLJIILJJIL3, aid2));
                                arrayList2.add(aweme);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                List<Aweme> items2 = feedItemListLIZ.getItems();
                if (items2 != null) {
                    items2.removeAll(arrayList2);
                }
                C797930VRv.LIZ();
            }
        }
        if (C590240NDa.LIZIZ(strLJI, C0NDM.UNCONSUMED_CACHE)) {
            List<Aweme> items3 = feedItemListLIZ.getItems();
            if (items3 != null) {
                items3.clear();
            }
            C590420NDs c590420NDs3 = C590420NDs.LIZ;
            x0 x0Var3 = x0.LIZ;
            c590420NDs3.getClass();
            String strLJIILJJIL4 = C590420NDs.LJIILJJIL();
            x0Var3.getClass();
            C590420NDs.LJIJI(x0.LIZJ(strLJIILJJIL4, strLJI));
        }
        if (feedItemListLIZ.getItems() != null && (!r0.isEmpty())) {
            C0N1B.LIZJ = feedItemListLIZ;
        }
        if (C797930VRv.LIZ()) {
            Aweme aweme2 = (Aweme) C13LP.LJJJJZI(feedItemListLIZ.getItems());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getColdCacheDB: cacheSize: ");
            sbLIZ.append(C1483340ohg.LJIIIIZZ(aweme2));
            sbLIZ.append(", des ");
            sbLIZ.append(aweme2.getDesc());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return feedItemListLIZ;
    }
}
