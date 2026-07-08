package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS14S1001000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.065M, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C065M {
    public static final AbstractC2252651DEx LIZ;
    public static final AbstractC2252651DEx LIZIZ;
    public static final C054G LIZJ;
    public static final C01GW LIZLLL;
    public static String LJ;
    public static List<C065O> LJFF;
    public static List<C065O> LJI;
    public static int LJII;
    public static int LJIIIIZZ;
    public static AnonymousClass0956 LJIIIZ;
    public static AnonymousClass0956 LJIIJ;

    static {
        AbstractC2252651DEx abstractC2252651DExLimitedParallelism = C0PEM.LIZ.limitedParallelism(1);
        LIZ = abstractC2252651DExLimitedParallelism;
        LIZIZ = C0PEM.LIZJ.limitedParallelism(1);
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), new C1138320fjC("QuickShareRateStore")));
        LIZJ = c054gLIZ;
        LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(570));
        LJFF = new ArrayList();
        LJI = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init: saveDelay=");
        sbLIZ.append(LIZLLL());
        sbLIZ.append("ms");
        C2188811AlT.LIZIZ(sbLIZ);
        C23250099c.LIZLLL(c054gLIZ, abstractC2252651DExLimitedParallelism, null, new C065L(null), 2);
    }

    public static long LIZLLL() {
        return ((long) ((Number) C065P.LIZ.getValue()).intValue()) * 1000;
    }

    public static void LIZJ() {
        String strLIZIZ = C461720I8s.LIZIZ();
        if (strLIZIZ.length() == 0 || Intrinsics.LJFF(strLIZIZ, LJ)) {
            return;
        }
        LJ = strLIZIZ;
        int iLIZ = C065E.LIZ();
        Pair pair = (Pair) LJI(new AwS14S1001000_2(strLIZIZ, iLIZ, 2));
        if (pair != null) {
            List<C065O> list = (List) pair.getFirst();
            List<C065O> list2 = (List) pair.getSecond();
            LJFF = list;
            LJI = list2;
            LJII = list.size() % iLIZ;
            LJIIIIZZ = list2.size() % iLIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("switchToUser uid=");
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(", shareRateSize=");
            sbLIZ.append(list.size());
            sbLIZ.append(", rateScoreSize=");
            sbLIZ.append(list2.size());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static String LIZIZ(List list) {
        double dDoubleValue;
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C065O c065o = (C065O) it2.next();
                if (c065o.LIZ()) {
                    Double d = c065o.LIZIZ;
                    if (d != null) {
                        dDoubleValue = d.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    jSONArray.put(dDoubleValue);
                }
            }
            return jSONArray.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("encodeRatesToJson failed: ");
            sbLIZ.append(e);
            C1720006oQ.LIZIZ("QuickShareRateStore", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static Object LJFF(Function0 function0) throws Throwable {
        Object objLJ = null;
        try {
            objLJ = C23250099c.LJ(LIZ, new C065F(function0, null));
            return objLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("runOnMemoryDispatcher failed: ");
            sbLIZ.append(e);
            C1720006oQ.LIZIZ("QuickShareRateStore", C2188811AlT.LIZIZ(sbLIZ));
            return objLJ;
        }
    }

    public static Object LJI(Function0 function0) throws Throwable {
        Object objLJ = null;
        try {
            objLJ = C23250099c.LJ(LIZIZ, new C065G(function0, null));
            return objLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("runOnStorageDispatcher failed: ");
            sbLIZ.append(e);
            C1720006oQ.LIZIZ("QuickShareRateStore", C2188811AlT.LIZIZ(sbLIZ));
            return objLJ;
        }
    }

    public static List LJ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadRecords start: key=");
        sbLIZ.append(str);
        sbLIZ.append(", countLimit=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        String string = ((Keva) LIZLLL.getValue()).getString(str, null);
        if (string == null) {
            return new ArrayList();
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i2);
                String strOptString = jSONObject.optString("itemId", null);
                Double dValueOf = Double.valueOf(jSONObject.optDouble("rate", Double.NaN));
                boolean z = true;
                if (!(!Double.isNaN(dValueOf.doubleValue()))) {
                    dValueOf = null;
                }
                Long lValueOf = Long.valueOf(jSONObject.optLong("timestamp", Long.MIN_VALUE));
                if (lValueOf.longValue() == Long.MIN_VALUE) {
                    z = false;
                }
                if (!z) {
                    lValueOf = null;
                }
                C065O c065o = new C065O(strOptString, lValueOf, dValueOf);
                if (c065o.LIZ()) {
                    arrayList.add(c065o);
                }
            }
            if (arrayList.size() > i) {
                arrayList = new ArrayList(C13LP.LLD(i, arrayList));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadRecords key=");
            sbLIZ2.append(str);
            sbLIZ2.append(" count=");
            sbLIZ2.append(arrayList.size());
            C2188811AlT.LIZIZ(sbLIZ2);
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("loadRecords failed: ");
            sbLIZ3.append(e);
            C1720006oQ.LIZIZ("QuickShareRateStore", C2188811AlT.LIZIZ(sbLIZ3));
            return new ArrayList();
        }
    }

    public static void LJII(int i, String str, List list) {
        List<C065O> listLJLIL;
        double dDoubleValue;
        long jLongValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveRecords start: key=");
        sbLIZ.append(str);
        sbLIZ.append(", count=");
        sbLIZ.append(list.size());
        sbLIZ.append(", nextWriteIndex=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            JSONArray jSONArray = new JSONArray();
            if (list.size() < C065E.LIZ()) {
                listLJLIL = list;
            } else {
                listLJLIL = C13LP.LJLIL(list.subList(0, i), list.subList(i, list.size()));
            }
            for (C065O c065o : listLJLIL) {
                if (c065o.LIZ()) {
                    JSONObject jSONObject = new JSONObject();
                    String str2 = c065o.LIZ;
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put("itemId", str2);
                    Double d = c065o.LIZIZ;
                    if (d != null) {
                        dDoubleValue = d.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    jSONObject.put("rate", dDoubleValue);
                    Long l = c065o.LIZJ;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    jSONObject.put("timestamp", jLongValue);
                    jSONArray.put(jSONObject);
                }
            }
            ((Keva) LIZLLL.getValue()).storeString(str, jSONArray.toString());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("saveRecords key=");
            sbLIZ2.append(str);
            sbLIZ2.append(" count=");
            sbLIZ2.append(list.size());
            C2188811AlT.LIZIZ(sbLIZ2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("saveRecords failed: ");
            sbLIZ3.append(e);
            C1720006oQ.LIZIZ("QuickShareRateStore", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public static int LIZ(List list, int i, String str, double d) {
        if (d <= 0.0d) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addRecord: invalid rate=");
            sbLIZ.append(d);
            sbLIZ.append(" itemId=");
            sbLIZ.append(str);
            sbLIZ.append(", skip");
            C2188811AlT.LIZIZ(sbLIZ);
            return i;
        }
        int iLIZ = C065E.LIZ();
        C065O c065o = new C065O(str, Long.valueOf(System.currentTimeMillis()), Double.valueOf(d));
        if (!c065o.LIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("addRecord: invalid record=");
            sbLIZ2.append(c065o);
            sbLIZ2.append(", skip");
            C2188811AlT.LIZIZ(sbLIZ2);
            return i;
        }
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String str2 = ((C065O) it2.next()).LIZ;
            if (str2 == null) {
                str2 = "";
            }
            if (Intrinsics.LJFF(str2, str)) {
                if (i2 >= 0) {
                    ListProtector.set(list, i2, c065o);
                    return i;
                }
            } else {
                i2++;
            }
        }
        if (list.size() < iLIZ) {
            list.add(c065o);
        } else {
            ListProtector.set(list, i, c065o);
        }
        return (i + 1) % iLIZ;
    }
}
