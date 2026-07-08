package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08Fk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2086608Fk {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1521));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1519));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1520));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    public static HashMap LIZ(Set set) {
        Iterable iterable;
        Object obj;
        Object obj2;
        ?? r1;
        long jLongValue;
        ?? r12;
        long jLongValue2;
        Number number;
        long jLongValue3;
        Number number2;
        long jLongValue4;
        if (Build.VERSION.SDK_INT < 36) {
            return new HashMap();
        }
        Method method = (Method) LIZIZ.getValue();
        if (method == null) {
            return new HashMap();
        }
        C2086708Fl c2086708Fl = (C2086708Fl) LIZJ.getValue();
        if (c2086708Fl == null) {
            return new HashMap();
        }
        int i = 0;
        HashMap mapLJI = C2097608Jq.LJI(new Pair("Bitmap", new C2086508Fj(0)), new Pair("HardwareBuffer", new C2086508Fj(0)), new Pair("Other", new C2086508Fj(0)));
        try {
            String[] strArr = null;
            Object objA0 = C2204961BRm.a0(method, null, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyJY1i1X88gd6XeEgrDr8p181E4kdK5paJtGYUrDTV0WnLKddigGdOXMESJWhB7YdwM", null));
            if (objA0 instanceof Iterable) {
                iterable = (Iterable) objA0;
            } else {
                iterable = null;
            }
            if (iterable == null) {
                return mapLJI;
            }
            for (Object obj3 : iterable) {
                if (obj3 != null) {
                    Object objA02 = C2204961BRm.a0(c2086708Fl.LIZ, obj3, new Object[i], new C0WZX("dzBzEgAjS8/YVFkiQFyJY1i1X88gd6XeEgrDr8p181E4kdK5paJtGYUrDTV0WnLKddigGdOXMESJWhB7YdwM", strArr));
                    if (objA02 instanceof String) {
                        obj = (String) objA02;
                    } else {
                        obj = strArr;
                    }
                    if (obj != null) {
                        if (Intrinsics.LJFF(obj, "android.graphics.Bitmap")) {
                            obj2 = "Bitmap";
                        } else if (Intrinsics.LJFF(obj, "android.hardware.HardwareBuffer")) {
                            obj2 = "HardwareBuffer";
                        } else {
                            obj2 = "Other";
                        }
                        C2086508Fj c2086508Fj = (C2086508Fj) mapLJI.get(obj2);
                        if (c2086508Fj != null) {
                            Object objA03 = C2204961BRm.a0(c2086708Fl.LIZIZ, obj3, new Object[i], new C0WZX("dzBzEgAjS8/YVFkiQFyJY1i1X88gd6XeEgrDr8p181E4kdK5paJtGYUrDTV0WnLKddigGdOXMESJWhB7YdwM", strArr));
                            if (objA03 instanceof Number) {
                                r1 = (Number) objA03;
                            } else {
                                r1 = strArr;
                            }
                            if (r1 == 0) {
                                jLongValue = 0;
                            } else {
                                jLongValue = r1.longValue();
                            }
                            Object objA04 = C2204961BRm.a0(c2086708Fl.LIZJ, obj3, new Object[i], new C0WZX("dzBzEgAjS8/YVFkiQFyJY1i1X88gd6XeEgrDr8p181E4kdK5paJtGYUrDTV0WnLKddigGdOXMESJWhB7YdwM", strArr));
                            if (objA04 instanceof Number) {
                                r12 = (Number) objA04;
                            } else {
                                r12 = strArr;
                            }
                            if (r12 == 0) {
                                jLongValue2 = 0;
                            } else {
                                jLongValue2 = r12.longValue();
                            }
                            Object objA05 = C2204961BRm.a0(c2086708Fl.LIZLLL, obj3, new Object[i], new C0WZX("dzBzEgAjS8/YVFkiQFyJY1i1X88gd6XeEgrDr8p181E4kdK5paJtGYUrDTV0WnLKddigGdOXMESJWhB7YdwM", null));
                            if (objA05 instanceof Number) {
                                number = (Number) objA05;
                            } else {
                                number = null;
                            }
                            if (number == null) {
                                jLongValue3 = 0;
                            } else {
                                jLongValue3 = number.longValue();
                            }
                            strArr = null;
                            Object objA06 = C2204961BRm.a0(c2086708Fl.LJ, obj3, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyJY1i1X88gd6XeEgrDr8p181E4kdK5paJtGYUrDTV0WnLKddigGdOXMESJWhB7YdwM", null));
                            if (objA06 instanceof Number) {
                                number2 = (Number) objA06;
                            } else {
                                number2 = null;
                            }
                            if (number2 == null) {
                                jLongValue4 = 0;
                            } else {
                                jLongValue4 = number2.longValue();
                            }
                            c2086508Fj.LIZ += jLongValue;
                            c2086508Fj.LIZIZ += jLongValue2;
                            c2086508Fj.LIZJ += jLongValue3;
                            c2086508Fj.LIZLLL += jLongValue4;
                        }
                    }
                }
                i = 0;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (set != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapLJI.entrySet()) {
                if (set.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap;
        }
        return mapLJI;
    }
}
