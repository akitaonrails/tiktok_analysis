package X;

import android.graphics.PointF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0jnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294750jnV implements InterfaceC1295730jp5<C1293780jlw> {
    public static final C1294750jnV LIZ = new C1294750jnV();
    public static final C1296750jqj LIZIZ = C1296750jqj.LIZ("c", "v", "i", "o");

    @Override // X.InterfaceC1295730jp5
    public final C1293780jlw LIZ(AbstractC1295900jpM abstractC1295900jpM, float f) {
        if (abstractC1295900jpM.LJIJJLI() == EnumC1295540jom.BEGIN_ARRAY) {
            abstractC1295900jpM.LIZ();
        }
        abstractC1295900jpM.LIZIZ();
        List<PointF> listLIZJ = null;
        List<PointF> listLIZJ2 = null;
        List<PointF> listLIZJ3 = null;
        boolean zLJIILL = false;
        while (abstractC1295900jpM.LJII()) {
            int iLJJIL = abstractC1295900jpM.LJJIL(LIZIZ);
            if (iLJJIL != 0) {
                if (iLJJIL != 1) {
                    if (iLJJIL != 2) {
                        if (iLJJIL != 3) {
                            abstractC1295900jpM.LJJIZ();
                            abstractC1295900jpM.LJJJ();
                        } else {
                            listLIZJ3 = C1294770jnX.LIZJ(abstractC1295900jpM, f);
                        }
                    } else {
                        listLIZJ2 = C1294770jnX.LIZJ(abstractC1295900jpM, f);
                    }
                } else {
                    listLIZJ = C1294770jnX.LIZJ(abstractC1295900jpM, f);
                }
            } else {
                zLJIILL = abstractC1295900jpM.LJIILL();
            }
        }
        abstractC1295900jpM.LJFF();
        if (abstractC1295900jpM.LJIJJLI() == EnumC1295540jom.END_ARRAY) {
            abstractC1295900jpM.LIZLLL();
        }
        if (listLIZJ != null && listLIZJ2 != null && listLIZJ3 != null) {
            if (listLIZJ.isEmpty()) {
                return new C1293780jlw(new PointF(), false, Collections.emptyList());
            }
            int size = listLIZJ.size();
            PointF pointF = (PointF) ListProtector.get(listLIZJ, 0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) ListProtector.get(listLIZJ, i);
                int i2 = i - 1;
                arrayList.add(new C1294460jn2(C1295100jo4.LIZ((PointF) ListProtector.get(listLIZJ, i2), (PointF) ListProtector.get(listLIZJ3, i2)), C1295100jo4.LIZ(pointF2, (PointF) ListProtector.get(listLIZJ2, i)), pointF2));
            }
            if (zLJIILL) {
                PointF pointF3 = (PointF) ListProtector.get(listLIZJ, 0);
                int i3 = size - 1;
                arrayList.add(new C1294460jn2(C1295100jo4.LIZ((PointF) ListProtector.get(listLIZJ, i3), (PointF) ListProtector.get(listLIZJ3, i3)), C1295100jo4.LIZ(pointF3, (PointF) ListProtector.get(listLIZJ2, 0)), pointF3));
            }
            return new C1293780jlw(pointF, zLJIILL, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
