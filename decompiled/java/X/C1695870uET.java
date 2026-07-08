package X;

import android.graphics.Typeface;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uET, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695870uET extends C0O2U {
    public final long LIZJ;
    public final C1680190tpB LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final int LJI;
    public boolean LJII;
    public Typeface LJIIIIZZ;

    @Override // X.C0NUU
    public final int LIZJ() {
        return this.LJFF == 0.0f ? 0 : 1;
    }

    public final int hashCode() {
        long j = this.LIZJ;
        C1682450tsp[] c1682450tspArr = C1682440tso.LIZIZ;
        return (((((((C786410Ut5.Y2(j) * 31) + this.LIZLLL.LL) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Font(fontSize=");
        sbLIZ.append((Object) C1682440tso.LJFF(this.LIZJ));
        sbLIZ.append(", weight=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", darkMode=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", slant=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0NUU
    public final C1680190tpB LIZ() {
        return this.LIZLLL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1695870uET)) {
            return false;
        }
        C1695870uET c1695870uET = (C1695870uET) obj;
        if (C1682440tso.LIZ(this.LIZJ, c1695870uET.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1695870uET.LIZLLL) && this.LJ == c1695870uET.LJ && this.LJFF == c1695870uET.LJFF && this.LJI == c1695870uET.LJI) {
            return true;
        }
        return false;
    }

    public C1695870uET(long j, C1680190tpB c1680190tpB, float f, float f2, int i) {
        final InterfaceC086400Uc[] interfaceC086400UcArr = new InterfaceC086400Uc[0];
        new Object(interfaceC086400UcArr) { // from class: X.00Ub
            public final List<InterfaceC086400Uc> LIZ;

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (InterfaceC086400Uc interfaceC086400Uc : interfaceC086400UcArr) {
                    String strLIZIZ = interfaceC086400Uc.LIZIZ();
                    Object arrayList = linkedHashMap.get(strLIZIZ);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(strLIZIZ, arrayList);
                    }
                    ((List) arrayList).add(interfaceC086400Uc);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list.size() == 1) {
                        C19719612Di.LJJI(list, arrayList2);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('\'');
                        sbLIZ.append(str);
                        sbLIZ.append("' must be unique. Actual [ [");
                        sbLIZ.append(C13LP.LJJLIIIJ(list, null, null, null, 0, null, null, 63));
                        sbLIZ.append(']');
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                        strLIZIZ2.toString();
                        throw new IllegalArgumentException(strLIZIZ2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                this.LIZ = arrayList3;
                int size = arrayList3.size();
                for (int i2 = 0; i2 < size && !((InterfaceC086400Uc) ListProtector.get(arrayList3, i2)).LIZ(); i2++) {
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C086300Ub) && Intrinsics.LJFF(this.LIZ, ((C086300Ub) obj).LIZ)) {
                    return true;
                }
                return false;
            }
        };
        this.LIZJ = j;
        this.LIZLLL = c1680190tpB;
        this.LJ = f;
        this.LJFF = f2;
        this.LJI = i;
    }
}
