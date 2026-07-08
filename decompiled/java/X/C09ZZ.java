package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.09ZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09ZZ {
    public static final Regex LIZ = new Regex("(\\w+)(?:\\[(.*?)\\])?");

    public static List LIZJ(List list) {
        List listLIZJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof List) {
                List list2 = (List) obj;
                if (list2 != null && (listLIZJ = LIZJ(list2)) != null) {
                    arrayList.addAll(listLIZJ);
                }
            } else {
                if (!(obj instanceof JSONArray)) {
                    return null;
                }
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(jSONArray.get(i));
                }
            }
        }
        return arrayList;
    }

    public static List LJFF(String str) {
        Object obj;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            try {
                C2392409Za c2392409ZaLIZLLL = LIZLLL((String) it2.next(), z);
                if (!c2392409ZaLIZLLL.LIZJ) {
                    z = true;
                } else {
                    z = false;
                }
                C189200o6.m2constructorimpl(c2392409ZaLIZLLL);
                obj = c2392409ZaLIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
            boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
            Object obj2 = obj;
            if (zM7isFailureimpl) {
                obj2 = null;
            }
            if (obj2 == null) {
                return null;
            }
            arrayList.add(obj2);
        }
        return arrayList;
    }

    public static List LIZ(String str, List list) {
        List listLIZJ;
        Object obj;
        List listLJFF = LJFF(str);
        if (listLJFF == null) {
            return null;
        }
        int i = 0;
        for (Object obj2 : (ArrayList) listLJFF) {
            int i2 = i + 1;
            if (i >= 0) {
                C2392409Za c2392409Za = (C2392409Za) obj2;
                if (list == null) {
                    return null;
                }
                int i3 = c2392409Za.LIZIZ;
                if (i3 == -2) {
                    list = LJ(list, new AwS582S0100000_3(c2392409Za, 81));
                } else if (i3 == -1) {
                    list = LJ(list, new AwS582S0100000_3(c2392409Za, 82));
                } else {
                    if (i3 >= 0) {
                        if (!c2392409Za.LIZJ) {
                            list = LJ(list, new AwS582S0100000_3(c2392409Za, 83));
                        } else {
                            List listLJ = LJ(list, new AwS582S0100000_3(c2392409Za, 84));
                            if (listLJ != null && (listLIZJ = LIZJ(listLJ)) != null && (obj = ListProtector.get(listLIZJ, c2392409Za.LIZIZ)) != null) {
                                list = Collections.singletonList(obj);
                            }
                        }
                    }
                    return null;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.util.ArrayList] */
    public static List LIZIZ(String str, JSONObject jSONObject) throws JSONException {
        Object obj;
        JSONArray jSONArray;
        Object obj2;
        JSONObject jSONObject2;
        Object obj3;
        ArrayList arrayList;
        JSONArray jSONArray2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        Object obj4;
        List listLJFF = LJFF(str);
        if (listLJFF == null) {
            return null;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = Collections.singletonList(jSONObject);
        int i = 0;
        for (Object obj5 : (ArrayList) listLJFF) {
            int i2 = i + 1;
            if (i >= 0) {
                C2392409Za c2392409Za = (C2392409Za) obj5;
                List list = (List) c259800zU.element;
                if (list == null) {
                    return null;
                }
                int i3 = c2392409Za.LIZIZ;
                if (i3 == -2) {
                    ?? arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (Object obj6 : list) {
                        if (!(obj6 instanceof JSONObject) || (jSONObject4 = (JSONObject) obj6) == null || (obj4 = jSONObject4.get(c2392409Za.LIZ)) == null) {
                            return null;
                        }
                        arrayList2.add(obj4);
                    }
                    c259800zU.element = arrayList2;
                } else if (i3 == -1) {
                    ?? arrayList3 = new ArrayList();
                    List list2 = (List) c259800zU.element;
                    if (list2 == null) {
                        return null;
                    }
                    ArrayList<List> arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    for (Object obj7 : list2) {
                        if ((obj7 instanceof JSONObject) && (jSONObject3 = (JSONObject) obj7) != null) {
                            obj3 = jSONObject3.get(c2392409Za.LIZ);
                        } else {
                            obj3 = null;
                        }
                        if ((obj3 instanceof JSONArray) && (jSONArray2 = (JSONArray) obj3) != null) {
                            int length = jSONArray2.length();
                            arrayList = new ArrayList();
                            for (int i4 = 0; i4 < length; i4++) {
                                arrayList.add(JSONArrayProtectorUtils.getJSONObject(jSONArray2, i4));
                            }
                        } else {
                            arrayList = null;
                        }
                        arrayList4.add(arrayList);
                    }
                    for (List list3 : arrayList4) {
                        if (list3 != null) {
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(it2.next());
                            }
                        }
                    }
                    c259800zU.element = arrayList3;
                } else {
                    if (i3 < 0) {
                        return null;
                    }
                    ?? arrayList5 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (Object obj8 : list) {
                        if ((obj8 instanceof JSONObject) && (jSONObject2 = (JSONObject) obj8) != null) {
                            obj = jSONObject2.get(c2392409Za.LIZ);
                        } else {
                            obj = null;
                        }
                        if (!(obj instanceof JSONArray) || (jSONArray = (JSONArray) obj) == null || (obj2 = jSONArray.get(c2392409Za.LIZIZ)) == null) {
                            return null;
                        }
                        arrayList5.add(obj2);
                    }
                    c259800zU.element = arrayList5;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        List list4 = (List) c259800zU.element;
        if (list4 == null) {
            return null;
        }
        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList6.add(it3.next().toString());
        }
        return C13LP.LLIIII(new HashSet(arrayList6));
    }

    public static C2392409Za LIZLLL(String str, boolean z) throws Exception {
        int iIntValue;
        MatchResult matchResultFind$default = Regex.find$default(LIZ, str, 0, 2, null);
        if (matchResultFind$default != null) {
            String str2 = (String) ListProtector.get(matchResultFind$default.LIZ(), 1);
            String str3 = (String) C13LP.LJJJLZIJ(2, matchResultFind$default.LIZ());
            if (str3 != null && str3.length() != 0) {
                if (Intrinsics.LJFF(str3, "*")) {
                    return new C2392409Za(str2, -1, z);
                }
                String strLJJIFFI = u.LJJIFFI(str3, " ", "", false);
                if (new Regex("\\d+").matches(strLJJIFFI)) {
                    iIntValue = CastIntegerProtector.parseInt(strLJJIFFI);
                } else {
                    List<String> listSplit = new Regex("[+-]").split(strLJJIFFI, 0);
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSplit, 10));
                    Iterator<String> it2 = listSplit.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt(it2.next())));
                    }
                    StringBuilder sb = new StringBuilder();
                    int length = strLJJIFFI.length();
                    for (int i = 0; i < length; i++) {
                        char cCharAt = strLJJIFFI.charAt(i);
                        if (cCharAt == '+' || cCharAt == '-') {
                            sb.append(cCharAt);
                        }
                    }
                    String string = sb.toString();
                    iIntValue = ((Number) ListProtector.get(arrayList, 0)).intValue();
                    int length2 = string.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char cCharAt2 = string.charAt(i2);
                        if (cCharAt2 != '+') {
                            if (cCharAt2 == '-') {
                                iIntValue -= ((Number) ListProtector.get(arrayList, i2 + 1)).intValue();
                            }
                        } else {
                            iIntValue += ((Number) ListProtector.get(arrayList, i2 + 1)).intValue();
                        }
                    }
                }
                return new C2392409Za(str2, iIntValue, z);
            }
            return new C2392409Za(str2, -2, false);
        }
        throw new Exception("Invalid path");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0009 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJ(java.util.List r5, kotlin.jvm.functions.Function1 r6) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r5.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r1 = r3.next()
            boolean r0 = r1 instanceof java.util.List
            r2 = 0
            if (r0 == 0) goto L23
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L22
            java.util.List r1 = LJ(r1, r6)
            if (r1 != 0) goto L6d
        L22:
            return r2
        L23:
            boolean r0 = r1 instanceof org.json.JSONObject
            if (r0 == 0) goto L42
            java.lang.Object r1 = r6.invoke(r1)     // Catch: java.lang.Throwable -> L2f
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L2f
            goto L3b
        L2f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L3b:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L6d
            goto L67
        L42:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L67
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L55
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r1 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L55
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L55
            goto L61
        L55:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L61:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L6d
        L67:
            if (r2 == 0) goto L9
            r4.add(r2)
            goto L9
        L6d:
            r2 = r1
            goto L67
        L6f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09ZZ.LJ(java.util.List, kotlin.jvm.functions.Function1):java.util.List");
    }
}
