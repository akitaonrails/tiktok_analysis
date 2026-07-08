package X;

import Y.AObjectS299S0200000_30;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Ik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19987613Ik {
    public static final C13JE<Map<String, Integer>> LIZ = new Object() { // from class: X.13JE
    };

    public static final boolean LIZLLL(InterfaceC19983313Gt interfaceC19983313Gt, AbstractC19987213Ig abstractC19987213Ig) {
        if (abstractC19987213Ig.LIZ.LIZIZ) {
            return true;
        }
        List<Annotation> annotations = interfaceC19983313Gt.getAnnotations();
        if (!(annotations instanceof Collection) || !annotations.isEmpty()) {
            Iterator<Annotation> it2 = annotations.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof C13JS) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void LJ(InterfaceC19983313Gt interfaceC19983313Gt, AbstractC19987213Ig abstractC19987213Ig) {
        if (Intrinsics.LJFF(interfaceC19983313Gt.LIZIZ(), C19982513Gl.LIZ)) {
            abstractC19987213Ig.LIZ.getClass();
        }
    }

    public static final int LIZIZ(InterfaceC19983313Gt interfaceC19983313Gt, AbstractC19987213Ig abstractC19987213Ig, String str) {
        boolean z;
        Object objInvoke;
        Object objInvoke2;
        if (abstractC19987213Ig.LIZ.LJIIL && Intrinsics.LJFF(interfaceC19983313Gt.LIZIZ(), C13GS.LIZ)) {
            z = true;
        } else {
            z = false;
        }
        C13JE<Map<String, Integer>> c13je = LIZ;
        if (z) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C13J8 c13j8 = abstractC19987213Ig.LIZJ;
            AObjectS299S0200000_30 aObjectS299S0200000_30 = new AObjectS299S0200000_30(interfaceC19983313Gt, abstractC19987213Ig, 1);
            Map map = (Map) ((ConcurrentHashMap) c13j8.LIZ).get(interfaceC19983313Gt);
            if (map == null || (objInvoke2 = map.get(c13je)) == null) {
                objInvoke2 = aObjectS299S0200000_30.invoke();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c13j8.LIZ;
                Object concurrentHashMap2 = concurrentHashMap.get(interfaceC19983313Gt);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(interfaceC19983313Gt, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(c13je, objInvoke2);
            }
            Integer num = (Integer) ((Map) objInvoke2).get(lowerCase);
            if (num == null) {
                return -3;
            }
            return num.intValue();
        }
        LJ(interfaceC19983313Gt, abstractC19987213Ig);
        int iLJII = interfaceC19983313Gt.LJII(str);
        if (iLJII != -3 || !abstractC19987213Ig.LIZ.LJIIJJI) {
            return iLJII;
        }
        C13J8 c13j82 = abstractC19987213Ig.LIZJ;
        AObjectS299S0200000_30 aObjectS299S0200000_302 = new AObjectS299S0200000_30(interfaceC19983313Gt, abstractC19987213Ig, 1);
        Map map2 = (Map) ((ConcurrentHashMap) c13j82.LIZ).get(interfaceC19983313Gt);
        if (map2 == null || (objInvoke = map2.get(c13je)) == null) {
            objInvoke = aObjectS299S0200000_302.invoke();
            ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) c13j82.LIZ;
            Object concurrentHashMap4 = concurrentHashMap3.get(interfaceC19983313Gt);
            if (concurrentHashMap4 == null) {
                concurrentHashMap4 = new ConcurrentHashMap(2);
                concurrentHashMap3.put(interfaceC19983313Gt, concurrentHashMap4);
            }
            ((Map) concurrentHashMap4).put(c13je, objInvoke);
        }
        Integer num2 = (Integer) ((Map) objInvoke).get(str);
        if (num2 == null) {
            return -3;
        }
        return num2.intValue();
    }

    public static final void LIZ(Map<String, Integer> map, InterfaceC19983313Gt interfaceC19983313Gt, String str, int i) {
        String str2;
        if (Intrinsics.LJFF(interfaceC19983313Gt.LIZIZ(), C13GS.LIZ)) {
            str2 = "enum value";
        } else {
            str2 = "property";
        }
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The suggested name '");
        sbLIZ.append(str);
        sbLIZ.append("' for ");
        sbLIZ.append(str2);
        sbLIZ.append(' ');
        sbLIZ.append(interfaceC19983313Gt.LIZJ(i));
        sbLIZ.append(" is already one of the names for ");
        sbLIZ.append(str2);
        sbLIZ.append(' ');
        sbLIZ.append(interfaceC19983313Gt.LIZJ(((Number) C2097608Jq.LJFF(str, map)).intValue()));
        sbLIZ.append(" in ");
        sbLIZ.append(interfaceC19983313Gt);
        throw new C13JK(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final int LIZJ(InterfaceC19983313Gt interfaceC19983313Gt, AbstractC19987213Ig abstractC19987213Ig, String str, String str2) {
        int iLIZIZ = LIZIZ(interfaceC19983313Gt, abstractC19987213Ig, str);
        if (iLIZIZ != -3) {
            return iLIZIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC19983313Gt.LJI());
        sbLIZ.append(" does not contain element with name '");
        sbLIZ.append(str);
        sbLIZ.append('\'');
        sbLIZ.append(str2);
        throw new C19981113Fx(C2188811AlT.LIZIZ(sbLIZ));
    }
}
