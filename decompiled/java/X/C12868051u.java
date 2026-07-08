package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.051u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12868051u {
    public static final AFwS285S0000000_2 LIZ = AFwS285S0000000_2.get$arr$(31);
    public static final AFwS285S0000000_2 LIZIZ = AFwS285S0000000_2.get$arr$(32);
    public static final AFwS285S0000000_2 LIZJ = AFwS285S0000000_2.get$arr$(30);

    public static Object LIZJ(JSONObject jSONObject, String str) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt == null) {
            return null;
        }
        return objOpt;
    }

    public static final void LIZLLL(String str, JSONObject jSONObject) {
        try {
            C189200o6.m2constructorimpl(jSONObject.put(str, jSONObject.optLong(str, 0L) + 1));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final JSONObject LJ(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt instanceof JSONObject) {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject != null) {
                        jSONObject3 = jSONObjectOptJSONObject;
                    }
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject(next);
                    if (jSONObjectOptJSONObject2 != null) {
                        jSONObject4 = jSONObjectOptJSONObject2;
                    }
                    LJ(jSONObject3, jSONObject4);
                    LJI(jSONObject2, next, jSONObject4);
                } else {
                    LJI(jSONObject2, next, objOpt);
                }
            }
            C189200o6.m2constructorimpl(jSONObject2);
            return jSONObject2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return jSONObject2;
        }
    }

    public static final void LJFF(JSONObject jSONObject, Object... objArr) {
        for (Object obj : objArr) {
            if (obj != null && (obj instanceof JSONObject)) {
                LJ((JSONObject) obj, jSONObject);
            }
        }
    }

    public static final JSONObject LJIIIZ(JSONObject jSONObject, Function2<? super JSONObject, ? super String, ? extends Object>... function2Arr) {
        try {
            int length = function2Arr.length;
            int i = 0;
            while (i < length) {
                Function2<? super JSONObject, ? super String, ? extends Object> function2 = function2Arr[i];
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    LJI(jSONObject2, next, function2.invoke(jSONObject, next));
                }
                i++;
                jSONObject = jSONObject2;
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return jSONObject;
        }
    }

    public static final Long LIZ(Long l, Object obj, Object obj2) {
        if (obj != null && obj2 != null && (obj instanceof Number) && (obj2 instanceof Number)) {
            return Long.valueOf(((Number) obj).longValue() - ((Number) obj2).longValue());
        }
        return l;
    }

    public static Long LIZIZ(JSONObject jSONObject, String str, String str2) {
        Object objOpt = jSONObject.opt(str);
        Object obj = null;
        if (objOpt == null) {
            objOpt = null;
        }
        Object objOpt2 = jSONObject.opt(str2);
        if (objOpt2 != null) {
            obj = objOpt2;
        }
        return LIZ(0L, objOpt, obj);
    }

    public static final void LJI(JSONObject jSONObject, String str, Object obj) {
        try {
            C189200o6.m2constructorimpl(jSONObject.put(str, obj));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void LJII(JSONObject jSONObject, String str, Object obj) {
        if (obj != null) {
            LJI(jSONObject, str, obj);
        }
    }

    public static final void LJIIIIZZ(JSONObject jSONObject, String str, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            C189200o6.m2constructorimpl(jSONObject.put(str, obj));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
