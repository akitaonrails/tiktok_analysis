package X;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TextEndIcon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0znX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909810znX {
    public static final Map<String, InterfaceC332330D1b> LIZ = C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair("tuxIcon", new AbstractC1909870znd() { // from class: X.0znT
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            String str;
            Object objLJJJLZIJ2;
            String str2;
            Object objLJJJLZIJ3;
            Object objLJJJLZIJ4;
            Object objLIZIZ;
            String str3;
            int i;
            Integer num = null;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            if (objLJJJLZIJ instanceof String) {
                str = (String) objLJJJLZIJ;
            } else {
                str = null;
            }
            if (list != null) {
                objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            } else {
                objLJJJLZIJ2 = null;
            }
            if (objLJJJLZIJ2 instanceof String) {
                str2 = (String) objLJJJLZIJ2;
            } else {
                str2 = null;
            }
            if (list != null) {
                objLJJJLZIJ3 = C13LP.LJJJLZIJ(2, list);
            } else {
                objLJJJLZIJ3 = null;
            }
            Float fLIZIZ = C20252814Mk.LIZIZ(objLJJJLZIJ3);
            if (list != null) {
                objLJJJLZIJ4 = C13LP.LJJJLZIJ(3, list);
            } else {
                objLJJJLZIJ4 = null;
            }
            Float fLIZIZ2 = C20252814Mk.LIZIZ(objLJJJLZIJ4);
            if (interfaceC1488400opq != null) {
                objLIZIZ = interfaceC1488400opq.LIZIZ("theme");
            } else {
                objLIZIZ = null;
            }
            if (objLIZIZ instanceof String) {
                str3 = (String) objLIZIZ;
            } else {
                str3 = null;
            }
            C698190Ra5 c698190Ra5LIZJ = C20741716El.LIZJ(str, str2, str3);
            if (c698190Ra5LIZJ != null) {
                i = c698190Ra5LIZJ.LIZ;
            } else {
                i = -1;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            if (C1533950q1J.LJ(str2)) {
                if (c698190Ra5LIZJ != null) {
                    num = c698190Ra5LIZJ.LIZIZ;
                }
                c419910GdJ.LIZLLL = num;
            }
            if (fLIZIZ != null) {
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fLIZIZ));
            }
            if (fLIZIZ2 != null) {
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fLIZIZ2));
            }
            return c419910GdJ;
        }
    }), new Pair("tuxColor", new AbstractC1909870znd() { // from class: X.0znV
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            String str;
            Object objLIZIZ;
            String str2 = null;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            if (objLJJJLZIJ instanceof String) {
                str = (String) objLJJJLZIJ;
            } else {
                str = null;
            }
            if (interfaceC1488400opq != null) {
                objLIZIZ = interfaceC1488400opq.LIZIZ("theme");
            } else {
                objLIZIZ = null;
            }
            if (objLIZIZ instanceof String) {
                str2 = (String) objLIZIZ;
            }
            return C20741716El.LIZ(str, str2);
        }
    }), new Pair("truncateIcon", new AbstractC1909870znd() { // from class: X.0znU
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            Object objLJJJLZIJ2;
            Object objLJJJLZIJ3;
            String str;
            Object objLJJJLZIJ4;
            String str2;
            Object objLJJJLZIJ5;
            Object objLJJJLZIJ6;
            Object objLIZIZ;
            String str3;
            Integer numValueOf;
            Float fValueOf;
            Integer numValueOf2;
            Integer numValueOf3 = null;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            Integer numLIZJ = C20252814Mk.LIZJ(objLJJJLZIJ);
            if (list != null) {
                objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            } else {
                objLJJJLZIJ2 = null;
            }
            Integer numLIZJ2 = C20252814Mk.LIZJ(objLJJJLZIJ2);
            if (list != null) {
                objLJJJLZIJ3 = C13LP.LJJJLZIJ(2, list);
            } else {
                objLJJJLZIJ3 = null;
            }
            if (objLJJJLZIJ3 instanceof String) {
                str = (String) objLJJJLZIJ3;
            } else {
                str = null;
            }
            if (list != null) {
                objLJJJLZIJ4 = C13LP.LJJJLZIJ(3, list);
            } else {
                objLJJJLZIJ4 = null;
            }
            if (objLJJJLZIJ4 instanceof String) {
                str2 = (String) objLJJJLZIJ4;
            } else {
                str2 = null;
            }
            if (list != null) {
                objLJJJLZIJ5 = C13LP.LJJJLZIJ(4, list);
            } else {
                objLJJJLZIJ5 = null;
            }
            Integer numLIZJ3 = C20252814Mk.LIZJ(objLJJJLZIJ5);
            if (list != null) {
                objLJJJLZIJ6 = C13LP.LJJJLZIJ(5, list);
            } else {
                objLJJJLZIJ6 = null;
            }
            Integer numLIZJ4 = C20252814Mk.LIZJ(objLJJJLZIJ6);
            if (interfaceC1488400opq != null) {
                objLIZIZ = interfaceC1488400opq.LIZIZ("theme");
            } else {
                objLIZIZ = null;
            }
            if (objLIZIZ instanceof String) {
                str3 = (String) objLIZIZ;
            } else {
                str3 = null;
            }
            C698190Ra5 c698190Ra5LIZJ = C20741716El.LIZJ(str2, str, str3);
            if (numLIZJ != null) {
                numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLIZJ)));
            } else {
                numValueOf = null;
            }
            if (numLIZJ2 != null) {
                fValueOf = Float.valueOf(C418440Gaw.LIZIZ(numLIZJ2));
            } else {
                fValueOf = null;
            }
            if (numLIZJ3 != null) {
                numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLIZJ3)));
            } else {
                numValueOf2 = null;
            }
            if (numLIZJ4 != null) {
                numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLIZJ4)));
            }
            return new TextEndIcon(numValueOf, fValueOf, numValueOf2, numValueOf3, C20741716El.LIZ(str, str3), c698190Ra5LIZJ);
        }
    }), new Pair("tuxFont", new AbstractC1909870znd() { // from class: X.16Em
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
        @Override // X.AbstractC1909870znd
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object LIZIZ(X.InterfaceC1488400opq r5, java.util.List<? extends java.lang.Object> r6) {
            /*
                Method dump skipped, instruction units count: 586
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C20741816Em.LIZIZ(X.0opq, java.util.List):java.lang.Object");
        }
    }), new Pair("isEmpty", new AbstractC1909870znd() { // from class: X.0znb
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            return Boolean.valueOf(C122900dP.LIZ(objLJJJLZIJ));
        }
    }), new Pair("isNotEmpty", new AbstractC1909870znd() { // from class: X.0znc
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            return Boolean.valueOf(!C122900dP.LIZ(objLJJJLZIJ));
        }
    }), new Pair("i18nDisplayCount", new AbstractC1909870znd() { // from class: X.0zna
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            long jLongValue;
            Object objLJJJLZIJ;
            Long lLIZLLL;
            if (list != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, list)) != null && (lLIZLLL = C20252814Mk.LIZLLL(objLJJJLZIJ)) != null) {
                jLongValue = lLIZLLL.longValue();
            } else {
                jLongValue = 0;
            }
            return C1843500y4a.LIZIZ(jLongValue);
        }
    }), new Pair("i18nTranslate", new AbstractC1909870znd() { // from class: X.0znS
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r3v4, types: [java.util.HashMap, java.util.LinkedHashMap] */
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLIZIZ;
            Map map;
            Object objLJJJLZIJ;
            String str;
            Object objLJJJLZIJ2;
            Map map2;
            String strLIZLLL;
            Object obj;
            Object obj2;
            ArrayList arrayList;
            Object obj3;
            boolean z;
            ?? LJ;
            boolean z2;
            boolean z3;
            boolean z4;
            String str2 = null;
            if (interfaceC1488400opq != null) {
                objLIZIZ = interfaceC1488400opq.LIZIZ("starlingData");
            } else {
                objLIZIZ = null;
            }
            if (objLIZIZ instanceof Map) {
                map = (Map) objLIZIZ;
            } else {
                map = null;
            }
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            if (objLJJJLZIJ instanceof String) {
                str = (String) objLJJJLZIJ;
            } else {
                str = null;
            }
            if (list != null) {
                objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            } else {
                objLJJJLZIJ2 = null;
            }
            if (objLJJJLZIJ2 instanceof Map) {
                map2 = (Map) objLJJJLZIJ2;
            } else {
                map2 = null;
            }
            if (str == null) {
                return "";
            }
            if (map2 == null) {
                obj = null;
            } else {
                try {
                    obj = map2.get("numberKey");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    ExecutorService executorService = C1909880zne.LIZ;
                    C1909880zne.LJ(new C020Q(str, e, 7));
                    strLIZLLL = C20741716El.LIZLLL(str, C13BV.INSTANCE);
                    if (strLIZLLL == null) {
                        return str;
                    }
                }
            }
            String strValueOf = String.valueOf(obj);
            if (map2 != null) {
                obj2 = map2.get(strValueOf);
            } else {
                obj2 = null;
            }
            Integer numLIZJ = C20252814Mk.LIZJ(obj2);
            if (map2 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    if (Intrinsics.LJFF(key, "numberKey") || Intrinsics.LJFF(key, strValueOf)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (entry2.getValue() == null) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                Iterator it2 = linkedHashMap2.entrySet().iterator();
                while (it2.hasNext()) {
                    Object value = ((Map.Entry) it2.next()).getValue();
                    if (value == null) {
                        value = "";
                    }
                    arrayList2.add(value);
                }
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = null;
            }
            if (numLIZJ != null) {
                numLIZJ.intValue();
                if (arrayList != null) {
                    arrayList.add(0, numLIZJ);
                }
            }
            if (map == null) {
                obj3 = null;
            } else {
                obj3 = map.get(str);
            }
            if (obj3 instanceof String) {
                str2 = (String) obj3;
            }
            if (str2 == null) {
                strLIZLLL = C20741716El.LIZLLL(str, arrayList);
                if (strLIZLLL == null) {
                    return str;
                }
                return strLIZLLL;
            }
            if (C1909730znP.LIZ.matches(str2) && numLIZJ != null) {
                z = true;
            } else {
                z = false;
            }
            C1909740znQ c1909740znQ = new C1909740znQ();
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\\{");
                sbLIZ.append(strValueOf);
                sbLIZ.append("\\}");
                c1909740znQ.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
                c1909740znQ.LIZLLL = Boolean.TRUE;
                c1909740znQ.LIZ = numLIZJ;
            }
            ArrayList arrayList3 = new ArrayList();
            if (map2 != null) {
                LJ = new LinkedHashMap();
                for (Map.Entry entry3 : map2.entrySet()) {
                    Object key2 = entry3.getKey();
                    if (Intrinsics.LJFF(key2, "numberKey") || Intrinsics.LJFF(key2, strValueOf)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        LJ.put(entry3.getKey(), entry3.getValue());
                    }
                }
            } else {
                LJ = C2097608Jq.LJ();
            }
            for (Map.Entry entry4 : LJ.entrySet()) {
                arrayList3.add(new C1909750znR(String.valueOf(entry4.getKey()), String.valueOf(entry4.getValue())));
            }
            c1909740znQ.LJ = (C1909750znR[]) arrayList3.toArray(new C1909750znR[0]);
            return C1909730znP.LIZIZ(str2, c1909740znQ, str);
        }
    }), new Pair("linearGradient", new AbstractC1909870znd() { // from class: X.0znW
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            GradientDrawable.Orientation orientation;
            Object obj;
            if (list == null) {
                return null;
            }
            int i = 0;
            Float fLIZIZ = C20252814Mk.LIZIZ(C13LP.LJJJLZIJ(0, list));
            if (fLIZIZ == null) {
                return null;
            }
            float fFloatValue = fLIZIZ.floatValue();
            float f = 360;
            float f2 = ((fFloatValue % f) + f) % f;
            if (f2 < 337.5f && f2 > 22.5f) {
                if (22.5f <= f2 && f2 <= 67.5f) {
                    orientation = GradientDrawable.Orientation.BL_TR;
                } else if (67.5f <= f2 && f2 <= 112.5f) {
                    orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                } else if (112.5f <= f2 && f2 <= 157.5f) {
                    orientation = GradientDrawable.Orientation.BR_TL;
                } else if (157.5f <= f2 && f2 <= 202.5f) {
                    orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                } else if (202.5f <= f2 && f2 <= 247.5f) {
                    orientation = GradientDrawable.Orientation.TR_BL;
                } else if (247.5f <= f2 && f2 <= 292.5f) {
                    orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                } else if (292.5f <= f2 && f2 <= 337.5f) {
                    orientation = GradientDrawable.Orientation.TL_BR;
                } else {
                    orientation = null;
                }
            } else {
                orientation = GradientDrawable.Orientation.BOTTOM_TOP;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (i != 0) {
                        if (obj2 instanceof Integer) {
                            obj = obj2;
                        } else {
                            obj = null;
                        }
                        if (!(obj2 instanceof Float)) {
                            obj2 = null;
                        }
                        if (obj != null) {
                            arrayList.add(obj);
                        }
                        if (obj2 != null) {
                            arrayList2.add(obj2);
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (orientation == null || arrayList.size() < 2) {
                return null;
            }
            return new C1201490hN5(orientation, C13LP.LLII(arrayList), C13LP.LLI(arrayList2));
        }
    }), new Pair("rgba", new AbstractC1909870znd() { // from class: X.0DJw
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            float fFloatValue;
            Object objLJJJLZIJ2;
            Integer numValueOf;
            Object objLJJJLZIJ3;
            Integer numValueOf2;
            Object objLJJJLZIJ4;
            int iIntValue;
            int iIntValue2;
            Integer numValueOf3 = null;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(3, list);
            } else {
                objLJJJLZIJ = null;
            }
            Float fLIZIZ = C20252814Mk.LIZIZ(objLJJJLZIJ);
            if (fLIZIZ != null) {
                fFloatValue = fLIZIZ.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            int iIntValue3 = 0;
            int iLJ = C13LZ.LJ(C814420VxA.LIZIZ(fFloatValue * 255), 0, 255);
            if (list != null) {
                objLJJJLZIJ2 = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ2 = null;
            }
            Integer numLIZJ = C20252814Mk.LIZJ(objLJJJLZIJ2);
            if (numLIZJ != null) {
                numValueOf = Integer.valueOf(C13LZ.LJ(numLIZJ.intValue(), 0, 255));
            } else {
                numValueOf = null;
            }
            if (list != null) {
                objLJJJLZIJ3 = C13LP.LJJJLZIJ(1, list);
            } else {
                objLJJJLZIJ3 = null;
            }
            Integer numLIZJ2 = C20252814Mk.LIZJ(objLJJJLZIJ3);
            if (numLIZJ2 != null) {
                numValueOf2 = Integer.valueOf(C13LZ.LJ(numLIZJ2.intValue(), 0, 255));
            } else {
                numValueOf2 = null;
            }
            if (list != null) {
                objLJJJLZIJ4 = C13LP.LJJJLZIJ(2, list);
            } else {
                objLJJJLZIJ4 = null;
            }
            Integer numLIZJ3 = C20252814Mk.LIZJ(objLJJJLZIJ4);
            if (numLIZJ3 != null) {
                numValueOf3 = Integer.valueOf(C13LZ.LJ(numLIZJ3.intValue(), 0, 255));
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            if (numValueOf2 != null) {
                iIntValue2 = numValueOf2.intValue();
            } else {
                iIntValue2 = 0;
            }
            if (numValueOf3 != null) {
                iIntValue3 = numValueOf3.intValue();
            }
            return Integer.valueOf(Color.argb(iLJ, iIntValue, iIntValue2, iIntValue3));
        }
    }), new Pair("isDarkMode", new AbstractC1909870znd() { // from class: X.0znY
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLIZIZ;
            String str = null;
            if (interfaceC1488400opq != null) {
                objLIZIZ = interfaceC1488400opq.LIZIZ("theme");
            } else {
                objLIZIZ = null;
            }
            if (objLIZIZ instanceof String) {
                str = (String) objLIZIZ;
            }
            return Boolean.valueOf(Intrinsics.LJFF(C20741716El.LIZIZ(str), "Dark"));
        }
    }), new Pair("slice", new AbstractC1909870znd() { // from class: X.0D1a
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            List list2;
            int size;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            if (!(objLJJJLZIJ instanceof List) || (list2 = (List) objLJJJLZIJ) == null) {
                return null;
            }
            Integer numLIZJ = C20252814Mk.LIZJ(C13LP.LJJJLZIJ(1, list));
            Integer numLIZJ2 = C20252814Mk.LIZJ(C13LP.LJJJLZIJ(2, list));
            if (numLIZJ2 != null) {
                size = numLIZJ2.intValue();
            } else {
                size = list2.size();
            }
            if (numLIZJ != null && (numLIZJ.intValue() + size) - 1 < list2.size() && numLIZJ.intValue() >= 0) {
                return list2.subList(numLIZJ.intValue(), numLIZJ.intValue() + size);
            }
            return list2;
        }
    }), new Pair("filterList", new AbstractC1909870znd() { // from class: X.0D1Z
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            List list2;
            String str;
            char c = 0;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            if (!(objLJJJLZIJ instanceof List) || (list2 = (List) objLJJJLZIJ) == null) {
                return null;
            }
            Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            if ((objLJJJLZIJ2 instanceof String) && (str = (String) objLJJJLZIJ2) != null) {
                Object objLJJJLZIJ3 = C13LP.LJJJLZIJ(2, list);
                if ((objLJJJLZIJ3 instanceof String) && objLJJJLZIJ3 != null) {
                    Object objLJJJLZIJ4 = C13LP.LJJJLZIJ(3, list);
                    if (!(objLJJJLZIJ4 instanceof String) || objLJJJLZIJ4 == null) {
                        objLJJJLZIJ4 = "";
                    }
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    for (Object obj : list2) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            C14NH.LIZ.getClass();
                            C21328418dO c21328418dOLJIIJJI = C14NH.LJIIJJI();
                            Pair[] pairArr = new Pair[3];
                            pairArr[c] = new Pair(objLJJJLZIJ3, obj);
                            pairArr[1] = new Pair(objLJJJLZIJ4, Integer.valueOf(i));
                            pairArr[2] = new Pair("global", C14NH.LJFF);
                            Object objLIZ = c21328418dOLJIIJJI.LIZ(str, C2097608Jq.LJIIIIZZ(pairArr), null, C20252814Mk.LIZ);
                            if (!(objLIZ instanceof Boolean)) {
                                objLIZ = null;
                            }
                            if (!Intrinsics.LJFF(objLIZ, Boolean.TRUE)) {
                                arrayList.add(obj);
                            }
                            i = i2;
                            c = 0;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    return arrayList;
                }
                return list2;
            }
            return list2;
        }
    }), new Pair("filterMap", new AbstractC1909870znd() { // from class: X.0D1Y
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            Map map;
            String str;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            if (!(objLJJJLZIJ instanceof Map) || (map = (Map) objLJJJLZIJ) == null) {
                return null;
            }
            Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            if ((objLJJJLZIJ2 instanceof String) && (str = (String) objLJJJLZIJ2) != null) {
                Object objLJJJLZIJ3 = C13LP.LJJJLZIJ(2, list);
                if ((objLJJJLZIJ3 instanceof String) && objLJJJLZIJ3 != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        C14NH.LIZ.getClass();
                        Object objLIZ = C14NH.LJIIJJI().LIZ(str, C2097608Jq.LJIIIIZZ(new Pair(objLJJJLZIJ3, C2097608Jq.LJIIIIZZ(new Pair("value", value), new Pair("key", key))), new Pair("global", C14NH.LJFF)), null, C20252814Mk.LIZ);
                        if (!(objLIZ instanceof Boolean)) {
                            objLIZ = null;
                        }
                        if (!Intrinsics.LJFF(objLIZ, Boolean.TRUE)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    return linkedHashMap;
                }
                return map;
            }
            return map;
        }
    }), new Pair("timeDes", new AbstractC1909870znd() { // from class: X.0znZ
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            long jLongValue;
            Object objLJJJLZIJ;
            Long lLIZLLL;
            if (list != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, list)) != null && (lLIZLLL = C20252814Mk.LIZLLL(objLJJJLZIJ)) != null) {
                jLongValue = lLIZLLL.longValue();
            } else {
                jLongValue = 0;
            }
            return C1356610lPH.LJII(jLongValue, C14P7.LIZ);
        }
    })), C0D1W.LIZ);
    public static final Map<String, InterfaceC332330D1b> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("tuxIcon", new AbstractC1909870znd() { // from class: X.0znT
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            String str;
            Object objLJJJLZIJ2;
            String str2;
            Object objLJJJLZIJ3;
            Object objLJJJLZIJ4;
            Object objLIZIZ;
            String str3;
            int i;
            Integer num = null;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            if (objLJJJLZIJ instanceof String) {
                str = (String) objLJJJLZIJ;
            } else {
                str = null;
            }
            if (list != null) {
                objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            } else {
                objLJJJLZIJ2 = null;
            }
            if (objLJJJLZIJ2 instanceof String) {
                str2 = (String) objLJJJLZIJ2;
            } else {
                str2 = null;
            }
            if (list != null) {
                objLJJJLZIJ3 = C13LP.LJJJLZIJ(2, list);
            } else {
                objLJJJLZIJ3 = null;
            }
            Float fLIZIZ = C20252814Mk.LIZIZ(objLJJJLZIJ3);
            if (list != null) {
                objLJJJLZIJ4 = C13LP.LJJJLZIJ(3, list);
            } else {
                objLJJJLZIJ4 = null;
            }
            Float fLIZIZ2 = C20252814Mk.LIZIZ(objLJJJLZIJ4);
            if (interfaceC1488400opq != null) {
                objLIZIZ = interfaceC1488400opq.LIZIZ("theme");
            } else {
                objLIZIZ = null;
            }
            if (objLIZIZ instanceof String) {
                str3 = (String) objLIZIZ;
            } else {
                str3 = null;
            }
            C698190Ra5 c698190Ra5LIZJ = C20741716El.LIZJ(str, str2, str3);
            if (c698190Ra5LIZJ != null) {
                i = c698190Ra5LIZJ.LIZ;
            } else {
                i = -1;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            if (C1533950q1J.LJ(str2)) {
                if (c698190Ra5LIZJ != null) {
                    num = c698190Ra5LIZJ.LIZIZ;
                }
                c419910GdJ.LIZLLL = num;
            }
            if (fLIZIZ != null) {
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fLIZIZ));
            }
            if (fLIZIZ2 != null) {
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fLIZIZ2));
            }
            return c419910GdJ;
        }
    }), new Pair("tuxColor", new AbstractC1909870znd() { // from class: X.0znV
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            String str;
            Object objLIZIZ;
            String str2 = null;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            if (objLJJJLZIJ instanceof String) {
                str = (String) objLJJJLZIJ;
            } else {
                str = null;
            }
            if (interfaceC1488400opq != null) {
                objLIZIZ = interfaceC1488400opq.LIZIZ("theme");
            } else {
                objLIZIZ = null;
            }
            if (objLIZIZ instanceof String) {
                str2 = (String) objLIZIZ;
            }
            return C20741716El.LIZ(str, str2);
        }
    }), new Pair("truncateIcon", new AbstractC1909870znd() { // from class: X.0znU
        @Override // X.AbstractC1909870znd
        public final Object LIZIZ(InterfaceC1488400opq interfaceC1488400opq, List<? extends Object> list) {
            Object objLJJJLZIJ;
            Object objLJJJLZIJ2;
            Object objLJJJLZIJ3;
            String str;
            Object objLJJJLZIJ4;
            String str2;
            Object objLJJJLZIJ5;
            Object objLJJJLZIJ6;
            Object objLIZIZ;
            String str3;
            Integer numValueOf;
            Float fValueOf;
            Integer numValueOf2;
            Integer numValueOf3 = null;
            if (list != null) {
                objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
            } else {
                objLJJJLZIJ = null;
            }
            Integer numLIZJ = C20252814Mk.LIZJ(objLJJJLZIJ);
            if (list != null) {
                objLJJJLZIJ2 = C13LP.LJJJLZIJ(1, list);
            } else {
                objLJJJLZIJ2 = null;
            }
            Integer numLIZJ2 = C20252814Mk.LIZJ(objLJJJLZIJ2);
            if (list != null) {
                objLJJJLZIJ3 = C13LP.LJJJLZIJ(2, list);
            } else {
                objLJJJLZIJ3 = null;
            }
            if (objLJJJLZIJ3 instanceof String) {
                str = (String) objLJJJLZIJ3;
            } else {
                str = null;
            }
            if (list != null) {
                objLJJJLZIJ4 = C13LP.LJJJLZIJ(3, list);
            } else {
                objLJJJLZIJ4 = null;
            }
            if (objLJJJLZIJ4 instanceof String) {
                str2 = (String) objLJJJLZIJ4;
            } else {
                str2 = null;
            }
            if (list != null) {
                objLJJJLZIJ5 = C13LP.LJJJLZIJ(4, list);
            } else {
                objLJJJLZIJ5 = null;
            }
            Integer numLIZJ3 = C20252814Mk.LIZJ(objLJJJLZIJ5);
            if (list != null) {
                objLJJJLZIJ6 = C13LP.LJJJLZIJ(5, list);
            } else {
                objLJJJLZIJ6 = null;
            }
            Integer numLIZJ4 = C20252814Mk.LIZJ(objLJJJLZIJ6);
            if (interfaceC1488400opq != null) {
                objLIZIZ = interfaceC1488400opq.LIZIZ("theme");
            } else {
                objLIZIZ = null;
            }
            if (objLIZIZ instanceof String) {
                str3 = (String) objLIZIZ;
            } else {
                str3 = null;
            }
            C698190Ra5 c698190Ra5LIZJ = C20741716El.LIZJ(str2, str, str3);
            if (numLIZJ != null) {
                numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLIZJ)));
            } else {
                numValueOf = null;
            }
            if (numLIZJ2 != null) {
                fValueOf = Float.valueOf(C418440Gaw.LIZIZ(numLIZJ2));
            } else {
                fValueOf = null;
            }
            if (numLIZJ3 != null) {
                numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLIZJ3)));
            } else {
                numValueOf2 = null;
            }
            if (numLIZJ4 != null) {
                numValueOf3 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(numLIZJ4)));
            }
            return new TextEndIcon(numValueOf, fValueOf, numValueOf2, numValueOf3, C20741716El.LIZ(str, str3), c698190Ra5LIZJ);
        }
    }));
}
