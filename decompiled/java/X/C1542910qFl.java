package X;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542910qFl {
    public final String LIZ;
    public Map<String, List<C1543160qGA>> LIZIZ = new LinkedHashMap();
    public ConcurrentHashMap<String, JSONArray> LIZJ = new ConcurrentHashMap<>();
    public final Object LIZLLL = new Object();
    public final LruCache<String, C1543150qG9> LJ;
    public final boolean LJFF;

    public static String LIZIZ(String str) {
        String[] strArr;
        int length;
        if (str == null || (length = (strArr = (String[]) new Regex("[.]").split(str, 0).toArray(new String[0])).length) < 2) {
            return null;
        }
        if (length == 2) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strArr[length - 2]);
        sbLIZ.append('.');
        sbLIZ.append(strArr[length - 1]);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1543160qGA LIZLLL(org.json.JSONObject r8) {
        /*
            r3 = 0
            if (r8 == 0) goto L18
            java.lang.String r0 = "pattern"
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r8, r0)
            if (r0 == 0) goto L18
            java.util.regex.Pattern r7 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)     // Catch: java.lang.Throwable -> L15
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L1d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L1d
            goto L29
        L15:
            r1 = move-exception
            r7 = r3
            goto L1e
        L18:
            r7 = r3
            if (r8 != 0) goto L2c
            r0 = r3
            goto L32
        L1d:
            r1 = move-exception
        L1e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L29:
            X.C189200o6.m1boximpl(r0)
        L2c:
            java.lang.String r0 = "group"
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r8, r0)
        L32:
            X.0dma r6 = X.C1063550dmb.LIZ(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r8 == 0) goto L43
            java.lang.String r0 = "included_methods"
            org.json.JSONArray r3 = r8.optJSONArray(r0)
        L43:
            r4 = 0
            if (r3 == 0) goto L5b
            int r2 = r3.length()
            r1 = 0
        L4b:
            if (r1 >= r2) goto L5b
            if (r3 == 0) goto L58
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getString(r3, r1)
            if (r0 == 0) goto L58
            r5.add(r0)
        L58:
            int r1 = r1 + 1
            goto L4b
        L5b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r8 == 0) goto L7e
            java.lang.String r0 = "excluded_methods"
            org.json.JSONArray r2 = r8.optJSONArray(r0)
            if (r2 == 0) goto L7e
            int r1 = r2.length()
        L6e:
            if (r4 >= r1) goto L7e
            if (r2 == 0) goto L7b
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getString(r2, r4)
            if (r0 == 0) goto L7b
            r3.add(r0)
        L7b:
            int r4 = r4 + 1
            goto L6e
        L7e:
            X.0qGA r0 = new X.0qGA
            r0.<init>(r7, r6, r5, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1542910qFl.LIZLLL(org.json.JSONObject):X.0qGA");
    }

    public final List<C1543160qGA> LIZ(String str) {
        List<C1543160qGA> list = (List) ((LinkedHashMap) this.LIZIZ).get(str);
        if (list != null) {
            return list;
        }
        if (!this.LJFF) {
            return null;
        }
        List<C1543160qGA> list2 = (List) ((LinkedHashMap) this.LIZIZ).get(str);
        if (list2 != null) {
            return list2;
        }
        synchronized (this.LIZLLL) {
            try {
                List<C1543160qGA> list3 = (List) ((LinkedHashMap) this.LIZIZ).get(str);
                if (list3 != null) {
                    return list3;
                }
                JSONArray jSONArray = this.LIZJ.get(str);
                if (jSONArray == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(LIZLLL(jSONArray.optJSONObject(i)));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(this.LIZIZ);
                linkedHashMap.put(str, arrayList);
                this.LIZIZ = linkedHashMap;
                return arrayList;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        Iterator<String> itKeys;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        Iterator<String> itKeys2;
        if (this.LJFF) {
            ConcurrentHashMap<String, JSONArray> concurrentHashMap = new ConcurrentHashMap<>();
            if (jSONObject != null && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("content")) != null && (itKeys2 = jSONObjectOptJSONObject3.keys()) != null) {
                while (itKeys2.hasNext()) {
                    String next = itKeys2.next();
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        concurrentHashMap.put(next, jSONArrayOptJSONArray);
                    }
                }
            }
            synchronized (this.LIZLLL) {
                try {
                    this.LIZJ = concurrentHashMap;
                    this.LIZIZ = new LinkedHashMap();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("content")) != null && (itKeys = jSONObjectOptJSONObject.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next2 = itKeys.next();
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(next2);
                    ArrayList arrayList = new ArrayList();
                    if (jSONArrayOptJSONArray2 != null) {
                        int length = jSONArrayOptJSONArray2.length();
                        for (int i = 0; i < length; i++) {
                            if (jSONArrayOptJSONArray2 != null) {
                                jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i);
                            } else {
                                jSONObjectOptJSONObject2 = null;
                            }
                            arrayList.add(LIZLLL(jSONObjectOptJSONObject2));
                        }
                    }
                    linkedHashMap.put(next2, arrayList);
                }
            }
            this.LIZIZ = linkedHashMap;
        }
        LruCache<String, C1543150qG9> lruCache = this.LJ;
        if (lruCache != null) {
            lruCache.evictAll();
        }
    }

    public C1542910qFl(String str, JSONObject jSONObject) throws JSONException {
        this.LIZ = str;
        boolean z = C1544000qHW.LJIILL;
        this.LJFF = z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LJ = new LruCache<>(16);
        LIZJ(jSONObject);
        C1520360pfO c1520360pfO = new C1520360pfO("jsb_auth_config_event");
        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("jsb_auth_config_compile_time", System.currentTimeMillis() - jCurrentTimeMillis);
        jSONObject2.put("jsb_auth_config_optimize", z);
        c1520360pfO.LIZLLL = jSONObject2;
        C1538660q8u.LIZ(null, c1520360pfO.LIZ());
    }
}
