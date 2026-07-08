package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Unit;

/* JADX INFO: renamed from: X.05as, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1381205as {
    public static final Object LIZ(Map map, float f, boolean z) {
        float f2;
        float f3;
        if (!map.isEmpty()) {
            Iterator it2 = map.entrySet().iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                    if (z) {
                        f2 = fFloatValue - f;
                    } else {
                        f2 = f - fFloatValue;
                    }
                    if (f2 < 0.0f) {
                        f2 = Float.POSITIVE_INFINITY;
                    }
                    do {
                        Object next2 = it2.next();
                        float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                        if (z) {
                            f3 = fFloatValue2 - f;
                        } else {
                            f3 = f - fFloatValue2;
                        }
                        if (f3 < 0.0f) {
                            f3 = Float.POSITIVE_INFINITY;
                        }
                        if (Float.compare(f2, f3) > 0) {
                            next = next2;
                            f2 = f3;
                        }
                    } while (it2.hasNext());
                }
                return ((Map.Entry) next).getKey();
            }
            throw new NoSuchElementException();
        }
        "The anchors were empty when trying to find the closest anchor".toString();
        throw new IllegalArgumentException("The anchors were empty when trying to find the closest anchor");
    }

    public static final Object LIZJ(float f, C1381605aw c1381605aw, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1369805Xs c1369805Xs = new C1369805Xs(f, c1381605aw, obj, null);
        EnumC1384205bM enumC1384205bM = EnumC1384205bM.Default;
        c1381605aw.getClass();
        Object objLJ = C2296808zG.LJ(new C1381505av(obj, c1381605aw, enumC1384205bM, c1369805Xs, null), interfaceC1364105Vn);
        if (objLJ != C099R.LJFF()) {
            objLJ = Unit.LIZ;
        }
        if (objLJ != C099R.LJFF()) {
            objLJ = Unit.LIZ;
        }
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }

    public static InterfaceC1685750ty9 LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, C1381605aw c1381605aw, EnumC1684030tvN enumC1684030tvN, boolean z, boolean z2, int i) {
        boolean z3;
        boolean z4 = z2;
        boolean z5 = z;
        if ((i & 4) != 0) {
            z5 = true;
        }
        if ((i & 8) != 0) {
            z4 = false;
        }
        C1380705an c1380705an = c1381605aw.LJFF;
        if (((C13FE) c1381605aw.LJIILIIL).getValue() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        return C1380805ao.LIZ(interfaceC1685750ty9, c1380705an, enumC1684030tvN, z5, null, z3, new C1369905Xt(c1381605aw, null), z4, 32);
    }
}
