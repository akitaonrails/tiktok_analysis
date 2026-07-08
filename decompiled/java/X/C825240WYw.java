package X;

import Y.ARunnableS5S1400000_13;
import com.bytedance.pumbaa.apicalling.core.api.ProcessorConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825240WYw {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(230));

    public static Object LIZJ(Object obj) {
        Object obj2;
        Object objLIZJ;
        Object objLIZJ2;
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return "1";
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        if (obj instanceof Collection) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
            for (Object obj3 : iterable) {
                if (obj3 == null) {
                    objLIZJ2 = JSONObject.NULL;
                } else {
                    objLIZJ2 = LIZJ(obj3);
                }
                arrayList.add(objLIZJ2);
            }
            return new JSONArray((Collection) arrayList);
        }
        int i = 0;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            ArrayList arrayList2 = new ArrayList(objArr.length);
            int length = objArr.length;
            while (i < length) {
                Object obj4 = objArr[i];
                if (obj4 == null) {
                    objLIZJ = JSONObject.NULL;
                } else {
                    objLIZJ = LIZJ(obj4);
                }
                arrayList2.add(objLIZJ);
                i++;
            }
            return new JSONArray((Collection) arrayList2);
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList3 = new ArrayList(zArr.length);
            int length2 = zArr.length;
            while (i < length2) {
                if (zArr[i]) {
                    obj2 = "1";
                } else {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                arrayList3.add(obj2);
                i++;
            }
            return new JSONArray((Collection) arrayList3);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList4 = new ArrayList(iArr.length);
            int length3 = iArr.length;
            while (i < length3) {
                arrayList4.add(String.valueOf(iArr[i]));
                i++;
            }
            return new JSONArray((Collection) arrayList4);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList5 = new ArrayList(jArr.length);
            int length4 = jArr.length;
            while (i < length4) {
                arrayList5.add(String.valueOf(jArr[i]));
                i++;
            }
            return new JSONArray((Collection) arrayList5);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList6 = new ArrayList(dArr.length);
            int length5 = dArr.length;
            while (i < length5) {
                arrayList6.add(String.valueOf(dArr[i]));
                i++;
            }
            return new JSONArray((Collection) arrayList6);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length6 = fArr.length;
            while (i < length6) {
                arrayList7.add(String.valueOf(fArr[i]));
                i++;
            }
            return new JSONArray((Collection) arrayList7);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList8 = new ArrayList(sArr.length);
            int length7 = sArr.length;
            while (i < length7) {
                arrayList8.add(String.valueOf((int) sArr[i]));
                i++;
            }
            return new JSONArray((Collection) arrayList8);
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList9 = new ArrayList(bArr.length);
            int length8 = bArr.length;
            while (i < length8) {
                arrayList9.add(String.valueOf((int) bArr[i]));
                i++;
            }
            return new JSONArray((Collection) arrayList9);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList10 = new ArrayList(cArr.length);
            int length9 = cArr.length;
            while (i < length9) {
                arrayList10.add(String.valueOf(cArr[i]));
                i++;
            }
            return new JSONArray((Collection) arrayList10);
        }
        return obj.toString();
    }

    public static final void LIZIZ(ProcessorConfig.GuardFields guardFields, C825210WYt c825210WYt, String str) {
        Map mapLIZJ;
        JSONObject jSONObjectPut = null;
        if (str != null) {
            mapLIZJ = C2097908Jt.LIZJ(new Pair("report_category", str));
        } else {
            mapLIZJ = null;
        }
        try {
            C0WZC c0wzc = C825230WYv.LIZIZ;
            if (c0wzc != null) {
                Map<String, Object> map = c825210WYt.LJIIIIZZ;
                InterfaceC825130WYl interfaceC825130WYl = (InterfaceC825130WYl) c825210WYt.LJIIIZ.getValue();
                C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS189S0000000_3.get$arr$(1017));
                JSONObject jSONObjectLIZ = LIZ(guardFields.category, map, interfaceC825130WYl, mapLIZJ, c01gwLIZ);
                JSONObject jSONObjectLIZ2 = LIZ(guardFields.metric, map, interfaceC825130WYl, mapLIZJ, c01gwLIZ);
                JSONObject jSONObjectLIZ3 = LIZ(guardFields.extra, map, interfaceC825130WYl, mapLIZJ, c01gwLIZ);
                if (jSONObjectLIZ3 != null) {
                    jSONObjectPut = new JSONObject().put("extra", jSONObjectLIZ3);
                }
                ((ExecutorService) LIZ.getValue()).execute(new ARunnableS5S1400000_13(c0wzc, jSONObjectLIZ, jSONObjectLIZ2, jSONObjectPut, 3));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static JSONObject LIZ(List list, Map map, InterfaceC825130WYl interfaceC825130WYl, Map map2, C01GW c01gw) throws JSONException {
        boolean z;
        Object value;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject = null;
        if (z) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if ((map2 == null || (value = map2.get(str)) == null) && ((map == null || (value = map.get(str)) == null) && (interfaceC825130WYl == null || (value = interfaceC825130WYl.getValue(str)) == null))) {
                if (Intrinsics.LJFF(str, "stack")) {
                    value = c01gw.getValue();
                }
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put(str, LIZJ(value));
        }
        return jSONObject;
    }
}
