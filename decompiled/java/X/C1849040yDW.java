package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yDW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849040yDW {
    public final C1304160k2g LIZ;
    public final InterfaceC2220701Bvo LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Keva LJ;
    public final Keva LJFF;

    public final C1849060yDY LIZ() {
        C0VSJ c0vsj = new C0VSJ(new C0VSJ(this.LIZ.LJIIIZ.LIZIZ.path), a0.LJJJJZ("/", a0.LJJJJZ(EnumC2221141BwW.USER.getDir(), this.LIZJ)));
        Map<String, Pair<String, String>> mapLJI = LJI();
        Iterator<T> it2 = mapLJI.values().iterator();
        long length = 0;
        while (it2.hasNext()) {
            length += (long) ((String) ((Pair) it2.next()).getFirst()).getBytes(Charsets.UTF_8).length;
        }
        String str = this.LIZJ;
        boolean zExists = c0vsj.exists();
        return new C1849060yDY(mapLJI.size(), c0vsj.lastModified(), c0vsj.length(), length, "legacy_fs", str, zExists);
    }

    public final C1849060yDY LIZIZ() {
        Object obj;
        long jIntValue = 0;
        int i = 0;
        for (String str : this.LJ.getAll().keySet()) {
            if (!u.LJJIIJZLJL(str, "\u0001__amg_storage__:", false)) {
                String string = this.LJ.getString(str, null);
                if (string != null) {
                    try {
                        Integer numValueOf = Integer.valueOf(new JSONObject(string).optInt("s", -1));
                        int iIntValue = numValueOf.intValue();
                        Integer num = numValueOf;
                        if (iIntValue < 0) {
                            num = null;
                        }
                        C189200o6.m2constructorimpl(num);
                        obj = num;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C098200Yq c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                        obj = c098200Yq;
                    }
                    Integer num2 = (Integer) (C189200o6.m7isFailureimpl(obj) ? null : obj);
                    jIntValue += (long) (num2 != null ? num2.intValue() : string.getBytes(Charsets.UTF_8).length);
                    i++;
                }
            }
        }
        String str2 = this.LIZLLL;
        return new C1849060yDY(i, 0L, jIntValue, jIntValue, str2, str2, i > 0);
    }

    public final Map<String, Pair<String, String>> LJI() {
        Object c098200Yq;
        JSONObject jSONObjectOptJSONObject;
        C2220231Bv3 c2220231Bv3 = this.LIZIZ.LJIIZILJ(0, -1, this.LIZJ, Charsets.UTF_8).LIZIZ;
        if (!c2220231Bv3.LIZ) {
            return C2097608Jq.LJ();
        }
        Map<String, Object> map = c2220231Bv3.LIZLLL;
        Object obj = map != null ? map.get("data") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            return C2097608Jq.LJ();
        }
        if (a0.LJJJIL(str)) {
            return C2097608Jq.LJ();
        }
        try {
            c098200Yq = new JSONObject(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        if (jSONObject == null) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = a0.LJLIIIL(next).toString();
            if (!a0.LJJJIL(string) && !u.LJJIIJZLJL(string, "\u0001__amg_storage__:", false) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(next)) != null) {
                Object objOpt = jSONObjectOptJSONObject.opt("first");
                String str2 = objOpt instanceof String ? (String) objOpt : null;
                if (!LJ(str2)) {
                    Object objOpt2 = jSONObjectOptJSONObject.opt("LL");
                    str2 = objOpt2 instanceof String ? (String) objOpt2 : null;
                    if (!LJ(str2)) {
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                        while (true) {
                            if (!itKeys2.hasNext()) {
                                str2 = null;
                                break;
                            }
                            Object objOpt3 = jSONObjectOptJSONObject.opt(itKeys2.next());
                            str2 = objOpt3 instanceof String ? (String) objOpt3 : null;
                            if (LJ(str2)) {
                                break;
                            }
                        }
                    }
                }
                if (str2 != null) {
                    Object objOpt4 = jSONObjectOptJSONObject.opt("second");
                    String strLJIIIZ = objOpt4 instanceof String ? (String) objOpt4 : null;
                    if (strLJIIIZ == null || !(!a0.LJJJIL(strLJIIIZ))) {
                        strLJIIIZ = null;
                    }
                    if (strLJIIIZ == null) {
                        Object objOpt5 = jSONObjectOptJSONObject.opt("LLJZIJLIL");
                        strLJIIIZ = objOpt5 instanceof String ? (String) objOpt5 : null;
                        if (strLJIIIZ == null || !(!a0.LJJJIL(strLJIIIZ))) {
                            strLJIIIZ = null;
                        }
                        if (strLJIIIZ == null) {
                            strLJIIIZ = LJIIIZ(str2);
                        }
                    }
                    linkedHashMap.put(string, new Pair(str2, strLJIIIZ));
                }
            }
        }
        return linkedHashMap;
    }

    public static int LIZJ(Object obj) {
        Pair pair;
        if (obj == null) {
            pair = new Pair(1, "");
        } else if (obj instanceof String) {
            pair = new Pair(2, obj);
        } else if (obj instanceof Number) {
            pair = new Pair(3, obj.toString());
        } else if (obj instanceof Boolean) {
            pair = new Pair(4, String.valueOf(((Boolean) obj).booleanValue()));
        } else if (obj instanceof JSONObject) {
            pair = new Pair(5, C786410Ut5.J3((JSONObject) obj));
        } else if (obj instanceof JSONArray) {
            pair = new Pair(6, ((JSONArray) obj).toString());
        } else if (obj instanceof Map) {
            pair = new Pair(5, C786410Ut5.J3(new JSONObject((Map) obj)));
        } else if (obj instanceof List) {
            pair = new Pair(6, new JSONArray((Collection) obj).toString());
        } else if (obj instanceof Date) {
            pair = new Pair(3, String.valueOf(((Date) obj).getTime()));
        } else {
            pair = new Pair(2, obj.toString());
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        return C786410Ut5.J3(new JSONObject().put("dataType", iIntValue).put("value", pair.getSecond())).getBytes(Charsets.UTF_8).length;
    }

    public static Pair LIZLLL(double d) {
        if (Double.isNaN(d)) {
            return new Pair(7, "NaN");
        }
        if (d == Double.POSITIVE_INFINITY) {
            return new Pair(7, "Infinity");
        }
        if (d == Double.NEGATIVE_INFINITY) {
            return new Pair(7, "-Infinity");
        }
        return new Pair(2, String.valueOf(d));
    }

    public static boolean LJ(String str) {
        Object c098200Yq;
        boolean z = true;
        if (str == null || a0.LJJJIL(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("dataType") || !jSONObject.has("value")) {
                z = false;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public static String LJIIIZ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(new JSONObject(str).optInt("dataType", EnumC1849020yDU.OTHER.getCode()));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Integer.valueOf(EnumC1849020yDU.OTHER.getCode());
        }
        int iIntValue = ((Number) c098200Yq).intValue();
        C1849030yDV c1849030yDV = EnumC1849020yDU.Companion;
        if (iIntValue != 7) {
            if (iIntValue == 8) {
                iIntValue = 6;
            }
        } else {
            iIntValue = 5;
        }
        c1849030yDV.getClass();
        EnumC1849020yDU enumC1849020yDU = EnumC1849020yDU.idx.get(Integer.valueOf(iIntValue));
        if (enumC1849020yDU == null) {
            enumC1849020yDU = EnumC1849020yDU.OTHER;
        }
        return enumC1849020yDU.name();
    }

    public static String LJFF(int i, String str) {
        return C786410Ut5.J3(new JSONObject().put("dataType", i).put("value", str));
    }

    public C1849040yDW(C1304160k2g c1304160k2g, InterfaceC2220701Bvo interfaceC2220701Bvo, String str) {
        this.LIZ = c1304160k2g;
        this.LIZIZ = interfaceC2220701Bvo;
        this.LIZJ = str;
        String str2 = "minigame_storage_" + C09KZ.LIZ(c1304160k2g);
        this.LIZLLL = str2;
        String str3 = "minigame_storage_meta_" + C09KZ.LIZ(c1304160k2g);
        this.LJ = Keva.getRepo(str2, 0);
        this.LJFF = Keva.getRepo(str3, 0);
    }

    public static boolean LJIIIIZZ(C1849050yDX c1849050yDX, String str, String str2, C1849060yDY c1849060yDY, C1849060yDY c1849060yDY2) {
        boolean z;
        C1849060yDY c1849060yDY3;
        if (c1849060yDY.LIZJ && c1849060yDY.LJFF > 0) {
            z = true;
        } else {
            z = false;
        }
        if (c1849050yDX == null) {
            return z;
        }
        if (!z) {
            C1849060yDY c1849060yDY4 = c1849050yDX.LIZLLL;
            if (c1849060yDY4 == null || c1849050yDX.LIZ != 2 || !Intrinsics.LJFF(c1849050yDX.LJI, "success") || Intrinsics.LJFF(c1849050yDX.LIZIZ, str) || Intrinsics.LJFF(c1849050yDX.LIZJ, str2) || !c1849060yDY4.LIZJ || c1849060yDY4.LJFF == 0 || !c1849060yDY2.LIZJ || c1849060yDY2.LJFF == 0) {
                return false;
            }
            return Intrinsics.LJFF(c1849060yDY4, c1849060yDY2);
        }
        if (c1849050yDX.LIZ != 2 || !Intrinsics.LJFF(c1849050yDX.LJI, "success") || !Intrinsics.LJFF(c1849050yDX.LIZIZ, str) || !Intrinsics.LJFF(c1849050yDX.LIZJ, str2) || !Intrinsics.LJFF(c1849050yDX.LIZLLL, c1849060yDY) || (c1849060yDY3 = c1849050yDX.LJ) == null) {
            return true;
        }
        return !Intrinsics.LJFF(c1849060yDY3, c1849060yDY2);
    }

    public final void LJII(String str, String str2, Function0<C1849060yDY> function0, Function0<C1849060yDY> function02, Function0<Unit> function03) {
        Object c098200Yq;
        try {
            C1849070yDZ c1849070yDZ = C1849050yDX.LJII;
            String string = this.LJFF.getString("__amg_storage__migration_meta_v2", null);
            c1849070yDZ.getClass();
            try {
                if (!LJIIIIZZ(C1849070yDZ.LIZ(string), str, str2, function0.invoke(), function02.invoke())) {
                    return;
                }
                function03.invoke();
                this.LJFF.storeString("__amg_storage__migration_meta_v2", C786410Ut5.J3(new C1849050yDX(2, str, str2, function0.invoke(), function02.invoke(), System.currentTimeMillis(), "success").LIZ()));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1849060yDY c1849060yDYInvoke = function0.invoke();
            C1849060yDY c1849060yDYInvoke2 = function02.invoke();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            this.LJFF.storeString("__amg_storage__migration_meta_v2", C786410Ut5.J3(new C1849050yDX(2, str, str2, c1849060yDYInvoke, c1849060yDYInvoke2, jCurrentTimeMillis, "failed:".concat(message)).LIZ()));
            thM5exceptionOrNullimpl.getMessage();
        }
    }
}
