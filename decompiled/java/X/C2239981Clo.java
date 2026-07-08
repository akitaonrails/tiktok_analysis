package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import defpackage.n2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS152S0201000_35;
import kotlin.jvm.internal.AwS184S1100000_35;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Clo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239981Clo {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() - ((j - 1) * 86400000);
    }

    public static List LIZLLL(long j, List list) {
        Long lLJIILIIL;
        if (j <= 0) {
            return new ArrayList();
        }
        long jLIZ = LIZ(j);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Object obj2 = ((Map) obj).get("timestamp");
            if (obj2 instanceof String) {
                lLJIILIIL = C2095008Iq.LJIILIIL((String) obj2);
            } else if (obj2 instanceof Number) {
                lLJIILIIL = Long.valueOf(((Number) obj2).longValue());
            }
            if (lLJIILIIL != null && lLJIILIIL.longValue() >= jLIZ) {
                arrayList.add(obj);
            }
        }
        return new ArrayList(arrayList);
    }

    public static void LJ(C1DYW c1dyw, long j) {
        if (j <= 0) {
            c1dyw.clear();
            return;
        }
        long jLIZ = LIZ(j);
        for (int size = c1dyw.size() - 1; -1 < size; size--) {
            C1DYZ c1dyzLIZ = c1dyw.LIZ(size);
            if (c1dyzLIZ != null && c1dyzLIZ.LIZJ("timestamp", 0L) < jLIZ) {
                c1dyw.LIZIZ(size);
            }
        }
    }

    public static Object LJFF(List list, JSONObject jSONObject) {
        Object objOpt;
        List listLIZIZ;
        int iIntValue;
        if (jSONObject != null) {
            Object objOpt2 = jSONObject.opt("operation");
            if (objOpt2 != null) {
                Object objOpt3 = jSONObject.opt("matcher");
                boolean zLJFF = true;
                if (objOpt3 != null && (objOpt3 instanceof JSONObject)) {
                    JSONObject jSONObject2 = (JSONObject) objOpt3;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        Map map = (Map) obj;
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (true) {
                            if (itKeys.hasNext()) {
                                String next = itKeys.next();
                                if (!Intrinsics.LJFF(map.get(next), jSONObject2.opt(next))) {
                                    break;
                                }
                            } else {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                    listLIZIZ = new ArrayList(arrayList);
                } else {
                    listLIZIZ = list;
                }
                Object objOpt4 = jSONObject.opt("matcher_op");
                if (objOpt4 != null && (objOpt4 instanceof JSONObject)) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new HashMap((Map) it2.next()));
                    }
                    JSONObject jSONObject3 = (JSONObject) objOpt4;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        if (n2.LIZJ((HashMap) obj2, jSONObject3)) {
                            arrayList3.add(obj2);
                        }
                    }
                    listLIZIZ = C19719512Dh.LIZIZ(new ArrayList(arrayList3));
                }
                if (Intrinsics.LJFF(objOpt2, "count")) {
                    return Integer.valueOf(listLIZIZ.size());
                }
                if (!Intrinsics.LJFF(objOpt2, "sum") && !Intrinsics.LJFF(objOpt2, "avg") && !Intrinsics.LJFF(objOpt2, "max") && !Intrinsics.LJFF(objOpt2, "min")) {
                    zLJFF = Intrinsics.LJFF(objOpt2, "mid");
                }
                if (zLJFF) {
                    Object objOpt5 = jSONObject.opt("filed");
                    if (objOpt5 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = listLIZIZ.iterator();
                        while (it3.hasNext()) {
                            Object obj3 = ((Map) it3.next()).get(objOpt5);
                            if (obj3 != null) {
                                arrayList4.add(obj3);
                            }
                        }
                        InterfaceC1509660pO8 interfaceC1509660pO8 = (InterfaceC1509660pO8) ((Map) C1509670pO9.LIZ.getValue()).get(objOpt2);
                        if (interfaceC1509660pO8 != null) {
                            return Long.valueOf(interfaceC1509660pO8.LIZ(arrayList4));
                        }
                        return null;
                    }
                } else if (Intrinsics.LJFF(objOpt2, "select")) {
                    Object objOpt6 = jSONObject.opt("limit");
                    if (objOpt6 != null && (objOpt6 instanceof Number)) {
                        iIntValue = ((Number) objOpt6).intValue();
                    } else {
                        iIntValue = -1;
                    }
                    Object objOpt7 = jSONObject.opt("filed");
                    if (objOpt7 != null) {
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it4 = listLIZIZ.iterator();
                        while (it4.hasNext()) {
                            Object obj4 = ((Map) it4.next()).get(objOpt7);
                            if (obj4 != null) {
                                arrayList5.add(obj4);
                            }
                        }
                        if (iIntValue > 0) {
                            return C13LP.LL(arrayList5, iIntValue);
                        }
                        return arrayList5;
                    }
                    if (iIntValue > 0) {
                        return C13LP.LL(listLIZIZ, iIntValue);
                    }
                    return listLIZIZ;
                }
            }
            Object objOpt8 = jSONObject.opt("filter_key");
            if (objOpt8 != null && (objOpt = jSONObject.opt("filter_value")) != null) {
                ArrayList arrayList6 = new ArrayList();
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    Map map2 = (Map) it5.next();
                    if (Intrinsics.LJFF(map2.get(objOpt8), objOpt)) {
                        arrayList6.add(map2);
                    }
                }
                return arrayList6;
            }
        }
        return list;
    }

    public static List LJI(long j, List list) {
        Long lLJIILIIL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Object obj2 = ((Map) obj).get("timestamp");
            if (obj2 instanceof String) {
                lLJIILIIL = C2095008Iq.LJIILIIL((String) obj2);
            } else if (obj2 instanceof Number) {
                lLJIILIIL = Long.valueOf(((Number) obj2).longValue());
            }
            if (lLJIILIIL != null && jCurrentTimeMillis - lLJIILIIL.longValue() <= ((long) LSPassThroughRecordSizeConfig.DEFAULT) * j) {
                arrayList.add(obj);
            }
        }
        return new ArrayList(arrayList);
    }

    public static void LJII(C1DYW c1dyw, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (int size = c1dyw.size() - 1; -1 < size; size--) {
            C1DYZ c1dyzLIZ = c1dyw.LIZ(size);
            if (c1dyzLIZ != null && jCurrentTimeMillis - c1dyzLIZ.LIZJ("timestamp", 0L) > ((long) LSPassThroughRecordSizeConfig.DEFAULT) * j) {
                c1dyw.LIZIZ(size);
            }
        }
    }

    public static List LIZIZ(int i, String str, List list) {
        if (i <= 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Map map = (Map) it2.next();
            if (Intrinsics.LJFF(map.get("eventName"), str)) {
                arrayList.add(map);
            } else {
                arrayList2.add(map);
            }
        }
        int size = arrayList.size();
        List listLLD = arrayList;
        if (size > i) {
            listLLD = C13LP.LLD(i, arrayList);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + listLLD.size());
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(listLLD);
        return arrayList3;
    }

    public static void LIZJ(C1DYW c1dyw, String str, int i) {
        List<C1DYZ> listSubList;
        ArrayList<C1DYZ> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = c1dyw.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1DYZ c1dyzLIZ = c1dyw.LIZ(i2);
            if (c1dyzLIZ != null) {
                Object objTryCatch = c1dyzLIZ.tryCatch(new AwS184S1100000_35(c1dyzLIZ, "eventName", 2));
                if (objTryCatch == null) {
                    objTryCatch = "";
                }
                if (Intrinsics.LJFF(objTryCatch, str)) {
                    arrayList2.add(c1dyzLIZ);
                } else {
                    arrayList.add(c1dyzLIZ);
                }
            }
        }
        if (i > 0) {
            int size2 = arrayList2.size();
            listSubList = arrayList2;
            if (size2 > i) {
                listSubList = arrayList2.subList(arrayList2.size() - i, arrayList2.size());
            }
        } else {
            listSubList = C13BV.INSTANCE;
        }
        c1dyw.clear();
        for (C1DYZ c1dyz : arrayList) {
            int i3 = C1DYW.LIZ;
            c1dyw.tryCatch(new AwS152S0201000_35(c1dyw, Integer.MAX_VALUE, c1dyz, 3));
        }
        for (C1DYZ c1dyz2 : listSubList) {
            int i4 = C1DYW.LIZ;
            c1dyw.tryCatch(new AwS152S0201000_35(c1dyw, Integer.MAX_VALUE, c1dyz2, 3));
        }
    }
}
