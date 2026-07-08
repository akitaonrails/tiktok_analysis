package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.13cI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20047613cI {
    public static final List<List<InterfaceC1673370teB>> LIZ(InterfaceC1676350tiz interfaceC1676350tiz) {
        List<InterfaceC1673370teB> listLJJIIJ;
        C20053713dH c20053713dHLJJLIIIJL = ((InterfaceC20048313cP) interfaceC1676350tiz).LJJLIIIJL();
        boolean zLIZIZ = LIZIZ(c20053713dHLJJLIIIJL);
        List<C20053713dH> listLJJIIZ = c20053713dHLJJLIIIJL.LJJIIZ();
        ArrayList arrayList = new ArrayList(listLJJIIZ.size());
        int size = listLJJIIZ.size();
        for (int i = 0; i < size; i++) {
            C20053713dH c20053713dH = (C20053713dH) ListProtector.get(listLJJIIZ, i);
            if (zLIZIZ) {
                listLJJIIJ = c20053713dH.LJJIII();
            } else {
                listLJJIIJ = c20053713dH.LJJIIJ();
            }
            arrayList.add(listLJJIIJ);
        }
        return arrayList;
    }

    public static final boolean LIZIZ(C20053713dH c20053713dH) {
        int i = C20047713cJ.LIZ[c20053713dH.LLJLLL.LIZLLL.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            if (i == 5) {
                C20053713dH c20053713dHLJJIJIL = c20053713dH.LJJIJIL();
                if (c20053713dHLJJIJIL != null) {
                    return LIZIZ(c20053713dHLJJIJIL);
                }
                "no parent for idle node".toString();
                throw new IllegalArgumentException("no parent for idle node");
            }
            throw new C1954807lC();
        }
        return false;
    }
}
