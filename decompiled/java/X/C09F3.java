package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.ChunkPatch;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.09F3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09F3 {
    public static final C09F3 LIZ = new C09F3();

    public static boolean LIZIZ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Character) && !(obj instanceof Byte)) {
            return false;
        }
        return true;
    }

    public static void LIZ(Object obj, ChunkPatch chunkPatch) {
        String str;
        Class<?> cls;
        Object objFromJson;
        ArrayList<String> arrayList = chunkPatch.LIZIZ;
        if (arrayList != null && arrayList.size() != 0) {
            String str2 = chunkPatch.LIZJ;
            if (C09F0.LIZ() && (obj instanceof List)) {
                List list = (List) obj;
                if (list.size() <= 0 || (cls = ListProtector.get(list, 0).getClass()) == null) {
                    if ("add".equals(chunkPatch.op) && (str = chunkPatch.path) != null) {
                        String[] strArrSplit = str.trim().split("/");
                        if (strArrSplit.length == 3 && "data".equals(strArrSplit[1]) && TextUtils.isDigitsOnly(strArrSplit[2])) {
                            cls = SearchMixFeed.class;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                Object obj2 = chunkPatch.value;
                if (obj2 != null && obj2.getClass() == cls) {
                    objFromJson = chunkPatch.value;
                } else if (!(chunkPatch.value instanceof n)) {
                    return;
                } else {
                    objFromJson = GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), (k) chunkPatch.value, (Class<Object>) cls);
                }
                if (objFromJson != null) {
                    ListProtector.add(list, CastIntegerProtector.parseInt(str2), objFromJson);
                    return;
                }
                return;
            }
            if ((obj instanceof List) && (chunkPatch.value instanceof Map)) {
                String json = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), chunkPatch.value);
                int i = CastIntegerProtector.parseInt(str2);
                List list2 = (List) obj;
                if (list2.size() > 0) {
                    ListProtector.add(list2, i, GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), json, (Class) ListProtector.get(list2, 0).getClass()));
                    return;
                }
                return;
            }
            if (obj instanceof Map) {
                ((Map) obj).put(str2, chunkPatch.value);
                return;
            }
            Field fieldLIZIZ = C09F2.LIZIZ(obj, str2, chunkPatch.LIZLLL);
            if (fieldLIZIZ == null) {
                return;
            }
            Object obj3 = chunkPatch.value;
            if (obj3 instanceof Double) {
                C2333709Cl.LIZJ(obj, fieldLIZIZ, obj3);
            } else {
                C2333709Cl.LIZLLL(obj, fieldLIZIZ, obj3);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZJ(List list, Map map) {
        if (map != null) {
            ArrayList<ChunkPatch> arrayList = (ArrayList) list;
            if (arrayList.size() != 0) {
                for (ChunkPatch chunkPatch : arrayList) {
                    if (!TextUtils.isEmpty(chunkPatch.path)) {
                        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(chunkPatch.path.trim().split("/")));
                        if (arrayList2.size() != 0) {
                            chunkPatch.LIZIZ = arrayList2;
                            chunkPatch.LIZ = map;
                            Object objLIZJ = C09F2.LIZJ(map, chunkPatch);
                            if (objLIZJ != null && arrayList2.size() == 1) {
                                String str = (String) ListProtector.get(arrayList2, 0);
                                chunkPatch.LIZJ = str;
                                String str2 = chunkPatch.op;
                                str2.getClass();
                                switch (str2.hashCode()) {
                                    case -934610812:
                                        if (str2.equals("remove")) {
                                            if (objLIZJ instanceof ArrayList) {
                                                ListProtector.remove((ArrayList) objLIZJ, CastIntegerProtector.parseInt(str));
                                            } else if (objLIZJ instanceof Map) {
                                                Map map2 = (Map) objLIZJ;
                                                Object obj = map2.get(str);
                                                if (LIZIZ(objLIZJ)) {
                                                    map2.put(str, 0);
                                                } else if (obj instanceof Boolean) {
                                                    map2.put(str, Boolean.FALSE);
                                                } else {
                                                    map2.put(str, null);
                                                }
                                            }
                                        }
                                        break;
                                    case 96417:
                                        if (str2.equals("add")) {
                                            if (objLIZJ instanceof ArrayList) {
                                                ListProtector.add((ArrayList) objLIZJ, CastIntegerProtector.parseInt(str), chunkPatch.value);
                                            } else if (objLIZJ instanceof Map) {
                                                ((Map) objLIZJ).put(str, chunkPatch.value);
                                            }
                                        }
                                        break;
                                    case 106438728:
                                        if (str2.equals("patch") && (objLIZJ instanceof Map)) {
                                            Map map3 = (Map) objLIZJ;
                                            Object obj2 = map3.get(str);
                                            ArrayList arrayList3 = new ArrayList();
                                            Object obj3 = chunkPatch.value;
                                            if (obj3 instanceof ArrayList) {
                                                LJII((ArrayList) obj3, arrayList3);
                                                if (obj2 instanceof String) {
                                                    Map map4 = (Map) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), (String) obj2, Map.class);
                                                    LIZJ(arrayList3, map4);
                                                    map3.put(str, GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), map4));
                                                } else if (obj2 instanceof Map) {
                                                    LIZJ(arrayList3, (Map) obj2);
                                                }
                                            }
                                        }
                                        break;
                                    case 1093755131:
                                        if (str2.equals("reorder") && (objLIZJ instanceof Map)) {
                                            Map map5 = (Map) objLIZJ;
                                            Object obj4 = map5.get(str);
                                            if (obj4 instanceof ArrayList) {
                                                ArrayList arrayList4 = new ArrayList();
                                                Iterator it2 = ((ArrayList) chunkPatch.value).iterator();
                                                while (it2.hasNext()) {
                                                    arrayList4.add(ListProtector.get((ArrayList) obj4, ((Double) it2.next()).intValue()));
                                                }
                                                map5.put(str, arrayList4);
                                            }
                                        }
                                        break;
                                    case 1094496948:
                                        if (str2.equals("replace")) {
                                            if (objLIZJ instanceof ArrayList) {
                                                ListProtector.set((ArrayList) objLIZJ, CastIntegerProtector.parseInt(str), chunkPatch.value);
                                            } else if (objLIZJ instanceof Map) {
                                                ((Map) objLIZJ).put(str, chunkPatch.value);
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void LIZLLL(Object obj, ChunkPatch chunkPatch) {
        if (chunkPatch.LIZJ.equals("")) {
            return;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Object obj2 = map.get(chunkPatch.LIZJ);
            ArrayList arrayList = new ArrayList();
            Object obj3 = chunkPatch.value;
            if (obj3 instanceof ArrayList) {
                LJII((ArrayList) obj3, arrayList);
                if (obj2 instanceof String) {
                    Map map2 = (Map) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), (String) obj2, Map.class);
                    LIZJ(arrayList, map2);
                    map.put(chunkPatch.LIZJ, GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), map2));
                    return;
                }
                if (!(obj2 instanceof Map)) {
                    return;
                }
                LIZJ(arrayList, (Map) obj2);
                return;
            }
            return;
        }
        Field fieldLIZIZ = C09F2.LIZIZ(obj, chunkPatch.LIZJ, chunkPatch.LIZLLL);
        if (fieldLIZIZ == null) {
            return;
        }
        Object obj4 = fieldLIZIZ.get(obj);
        ArrayList arrayList2 = new ArrayList();
        if (obj4 instanceof String) {
            Map map3 = (Map) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), (String) obj4, Map.class);
            Object obj5 = chunkPatch.value;
            if (obj5 instanceof ArrayList) {
                LJII((ArrayList) obj5, arrayList2);
                LIZJ(arrayList2, map3);
                try {
                    fieldLIZIZ.set(obj, GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), map3));
                    return;
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
        }
        C09F4.LIZLLL.LIZ(obj4, arrayList2);
    }

    public static void LJ(Object obj, ChunkPatch chunkPatch) {
        ArrayList<String> arrayList = chunkPatch.LIZIZ;
        if (arrayList != null && arrayList.size() != 0) {
            String str = chunkPatch.LIZJ;
            if (obj instanceof List) {
                ListProtector.remove((List) obj, CastIntegerProtector.parseInt(str));
                return;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                Object obj2 = map.get(str);
                if (LIZIZ(obj)) {
                    map.put(str, 0);
                    return;
                } else if (obj2 instanceof Boolean) {
                    map.put(str, Boolean.FALSE);
                    return;
                } else {
                    map.put(str, null);
                    return;
                }
            }
            Field fieldLIZIZ = C09F2.LIZIZ(obj, str, chunkPatch.LIZLLL);
            if (fieldLIZIZ == null) {
                return;
            }
            Object obj3 = fieldLIZIZ.get(obj);
            if (LIZIZ(obj3)) {
                fieldLIZIZ.set(obj, 0);
            } else if (obj3 instanceof Boolean) {
                fieldLIZIZ.set(obj, Boolean.FALSE);
            } else {
                fieldLIZIZ.set(obj, null);
            }
        }
    }

    public static void LJFF(Object obj, ChunkPatch chunkPatch) {
        if (!chunkPatch.LIZJ.equals("")) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                Object obj2 = map.get(chunkPatch.LIZJ);
                if (obj2 instanceof ArrayList) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((ArrayList) chunkPatch.value).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(ListProtector.get((ArrayList) obj2, ((Double) it2.next()).intValue()));
                    }
                    map.put(chunkPatch.LIZJ, arrayList);
                    return;
                }
            }
            Field fieldLIZIZ = C09F2.LIZIZ(obj, chunkPatch.LIZJ, chunkPatch.LIZLLL);
            if (fieldLIZIZ == null) {
                return;
            }
            Object obj3 = fieldLIZIZ.get(obj);
            if (obj3 instanceof LinkedList) {
                LinkedList linkedList = new LinkedList();
                Iterator it3 = ((ArrayList) chunkPatch.value).iterator();
                while (it3.hasNext()) {
                    linkedList.add(((LinkedList) obj3).get(((Double) it3.next()).intValue()));
                }
                fieldLIZIZ.set(obj, linkedList);
                return;
            }
            if (obj3 instanceof ArrayList) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = ((ArrayList) chunkPatch.value).iterator();
                while (it4.hasNext()) {
                    arrayList2.add(ListProtector.get((ArrayList) obj3, ((Double) it4.next()).intValue()));
                }
                fieldLIZIZ.set(obj, arrayList2);
            }
        }
    }

    public static void LJI(Object obj, ChunkPatch chunkPatch) {
        ArrayList<String> arrayList = chunkPatch.LIZIZ;
        if (arrayList != null && arrayList.size() != 0) {
            String str = chunkPatch.LIZJ;
            if (obj instanceof List) {
                if (C09F0.LIZ() && (chunkPatch.value instanceof n)) {
                    int i = CastIntegerProtector.parseInt(str);
                    List list = (List) obj;
                    ListProtector.set(list, i, GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), (k) chunkPatch.value, (Class) ListProtector.get(list, i).getClass()));
                    return;
                }
                if (chunkPatch.value instanceof Map) {
                    List list2 = (List) obj;
                    ListProtector.set(list2, CastIntegerProtector.parseInt(str), GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), chunkPatch.value), (Class) ListProtector.get(list2, CastIntegerProtector.parseInt(str)).getClass()));
                    return;
                }
                ListProtector.set((List) obj, CastIntegerProtector.parseInt(str), chunkPatch.value);
                return;
            }
            if (obj instanceof Map) {
                ((Map) obj).put(str, chunkPatch.value);
                return;
            }
            Field fieldLIZIZ = C09F2.LIZIZ(obj, str, chunkPatch.LIZLLL);
            if (fieldLIZIZ == null) {
                return;
            }
            Object obj2 = chunkPatch.value;
            if (obj2 instanceof Double) {
                C2333709Cl.LIZJ(obj, fieldLIZIZ, obj2);
            } else {
                C2333709Cl.LIZLLL(obj, fieldLIZIZ, obj2);
            }
        }
    }

    public static void LJII(ArrayList arrayList, List list) {
        Object objFromJson;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = ListProtector.get(arrayList, i);
            if (obj instanceof ChunkPatch) {
                objFromJson = obj;
            } else {
                objFromJson = null;
            }
            if (obj instanceof Map) {
                objFromJson = GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), obj), (Class<Object>) ChunkPatch.class);
            }
            if (objFromJson != null) {
                ((ArrayList) list).add(objFromJson);
            }
        }
    }
}
