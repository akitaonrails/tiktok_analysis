package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.09Ia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2348209Ia {
    public static final List<String> LIZ = C1697810uHb.LJIILJJIL("java.", "androidx.", "android.", "com.android.", "dalvik.", "io.reactivex.", "com.google.gson.", "kotlin.", "kotlinx.", "com.bytedance.helios.binder", "com.bytedance.pumbaa");

    public static final String LIZ(View view) {
        Context context = view.getContext();
        if (context instanceof Activity) {
            return context.getClass().getCanonicalName();
        }
        String strLIZLLL = C0VZT.LIZLLL();
        if (strLIZLLL != null) {
            return strLIZLLL;
        }
        return context.getClass().getCanonicalName();
    }

    public static C443120HZe LIZIZ(View view) {
        Object parent;
        View view2;
        Object tag;
        String string;
        if (view == null || (parent = view.getParent()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (parent instanceof View) {
            View view3 = (View) parent;
            if (view3 != null && (tag = view3.getTag(R.id.web_client_security)) != null && (string = tag.toString()) != null && (u.LJJIIJZLJL(string, "Fragment#", false) || u.LJJIIJZLJL(string, "Dialog#", false))) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{"#"}, 0, 6);
                if (listLJJLIIIJILLIZJL.size() > 1) {
                    return new C443120HZe(ListProtector.get(listLJJLIIIJILLIZJL, 0), ListProtector.get(listLJJLIIIJILLIZJL, 1), arrayList);
                }
            }
            arrayList.add(parent.getClass().getCanonicalName());
            if ((parent instanceof View) && (view2 = (View) parent) != null) {
                parent = view2.getParent();
            } else {
                parent = null;
            }
            i++;
            if (i >= 10) {
                break;
            }
        }
        return new C443120HZe(null, null, arrayList);
    }

    public static final List<Object> LIZLLL(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof Long) {
                arrayList.add(Long.valueOf(jSONArray.optLong(i)));
            } else if (objOpt instanceof Double) {
                arrayList.add(Double.valueOf(jSONArray.optDouble(i)));
            } else if (objOpt instanceof Integer) {
                arrayList.add(Integer.valueOf(JSONArrayProtectorUtils.getInt(jSONArray, i)));
            } else if (objOpt instanceof String) {
                arrayList.add(jSONArray.optString(i));
            } else if (objOpt instanceof JSONObject) {
                arrayList.add(LJ(jSONArray.optJSONObject(i)));
            } else if (objOpt instanceof JSONArray) {
                arrayList.add(LIZLLL(jSONArray.optJSONArray(i)));
            } else if (objOpt instanceof Boolean) {
                arrayList.add(Boolean.valueOf(jSONArray.optBoolean(i)));
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public static final Map<String, Object> LJ(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof Long) {
                linkedHashMap.put(next, Long.valueOf(jSONObject.optLong(next)));
            } else if (objOpt instanceof Double) {
                linkedHashMap.put(next, Double.valueOf(jSONObject.optDouble(next)));
            } else if (objOpt instanceof Integer) {
                linkedHashMap.put(next, Integer.valueOf(jSONObject.optInt(next)));
            } else if (objOpt instanceof String) {
                linkedHashMap.put(next, jSONObject.optString(next));
            } else if (objOpt instanceof JSONObject) {
                linkedHashMap.put(next, LJ(jSONObject.optJSONObject(next)));
            } else if (objOpt instanceof JSONArray) {
                linkedHashMap.put(next, LIZLLL(jSONObject.optJSONArray(next)));
            } else if (objOpt instanceof Boolean) {
                linkedHashMap.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
            } else {
                linkedHashMap.put(next, null);
            }
        }
        return linkedHashMap;
    }

    public static final JSONObject LJFF(List<? extends Object> list) throws JSONException {
        Object c098200Yq;
        Object objLJJJJZI;
        Map map;
        if (list.size() == 1 && (objLJJJJZI = C13LP.LJJJJZI(list)) != null && Intrinsics.LJFF(objLJJJJZI.getClass().getName(), "com.lynx.react.bridge.ReadableMap")) {
            try {
                Object objInvoke = objLJJJJZI.getClass().getMethod("toHashMap", new Class[0]).invoke(objLJJJJZI, new Object[0]);
                if (objInvoke instanceof Map) {
                    map = (Map) objInvoke;
                } else {
                    map = null;
                }
                if (map != null) {
                    return new JSONObject(map);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                if (obj instanceof String) {
                    try {
                        if (u.LJJIIJZLJL((String) obj, "{", false) && u.LJIIZILJ((String) obj, "}", false)) {
                            c098200Yq = new JSONObject((String) obj);
                        } else if (u.LJJIIJZLJL((String) obj, e3.e, false) && u.LJIIZILJ((String) obj, e3.f, false)) {
                            c098200Yq = new JSONArray((String) obj);
                        } else {
                            c098200Yq = obj;
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    String strValueOf = String.valueOf(i);
                    if (c098200Yq != null) {
                        obj = c098200Yq;
                    }
                    jSONObject.put(strValueOf, obj);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("at ");
        r1.append(r9);
        r1.append('\n');
        r7.append(X.C2188811AlT.LIZIZ(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZJ(java.lang.Throwable r9, boolean r10) {
        /*
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StackTraceElement[] r6 = r9.getStackTrace()
            if (r6 == 0) goto L53
            int r5 = r6.length
            r4 = 0
            r3 = 0
        Le:
            if (r3 >= r5) goto L53
            r9 = r6[r3]
            if (r10 == 0) goto L50
            java.util.List<java.lang.String> r0 = X.C2348209Ia.LIZ
            java.util.Iterator r8 = r0.iterator()
        L1a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r2 = r8.next()
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            if (r9 == 0) goto L1a
            java.lang.String r0 = r9.getClassName()
            if (r0 == 0) goto L1a
            boolean r1 = kotlin.text.u.LJJIIJZLJL(r0, r1, r4)
            r0 = 1
            if (r1 != r0) goto L1a
            if (r2 != 0) goto L50
        L38:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "at "
            r1.append(r0)
            r1.append(r9)
            r0 = 10
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r7.append(r0)
        L50:
            int r3 = r3 + 1
            goto Le
        L53:
            java.lang.String r0 = r7.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2348209Ia.LIZJ(java.lang.Throwable, boolean):java.lang.String");
    }
}
