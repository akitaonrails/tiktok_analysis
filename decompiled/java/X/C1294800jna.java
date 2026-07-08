package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294800jna {
    public static final C1296750jqj LIZ = C1296750jqj.LIZ("k");

    public static <T> void LIZIZ(List<? extends C1294810jnb<T>> list) {
        int i;
        T t;
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C1294810jnb c1294810jnb = (C1294810jnb) ListProtector.get(list, i2);
            i2++;
            C1294810jnb c1294810jnb2 = (C1294810jnb) ListProtector.get(list, i2);
            c1294810jnb.LJII = Float.valueOf(c1294810jnb2.LJI);
            if (c1294810jnb.LIZJ == null && (t = c1294810jnb2.LIZIZ) != null) {
                c1294810jnb.LIZJ = t;
                if (c1294810jnb instanceof C1294830jnd) {
                    ((C1294830jnd) c1294810jnb).LIZLLL();
                }
            }
        }
        C1294810jnb c1294810jnb3 = (C1294810jnb) ListProtector.get(list, i);
        if ((c1294810jnb3.LIZIZ == null || c1294810jnb3.LIZJ == null) && arrayList.size() > 1) {
            arrayList.remove(c1294810jnb3);
        }
    }

    public static <T> List<C1294810jnb<T>> LIZ(AbstractC1295900jpM abstractC1295900jpM, C1294720jnS c1294720jnS, float f, InterfaceC1295730jp5<T> interfaceC1295730jp5, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (abstractC1295900jpM.LJIJJLI() == EnumC1295540jom.STRING) {
            c1294720jnS.LIZ("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC1295900jpM.LIZIZ();
        while (abstractC1295900jpM.LJII()) {
            if (abstractC1295900jpM.LJJIL(LIZ) != 0) {
                abstractC1295900jpM.LJJJ();
            } else if (abstractC1295900jpM.LJIJJLI() == EnumC1295540jom.BEGIN_ARRAY) {
                abstractC1295900jpM.LIZ();
                if (abstractC1295900jpM.LJIJJLI() == EnumC1295540jom.NUMBER) {
                    arrayList.add(C1294790jnZ.LIZIZ(abstractC1295900jpM, c1294720jnS, f, interfaceC1295730jp5, false, z));
                } else {
                    while (abstractC1295900jpM.LJII()) {
                        arrayList.add(C1294790jnZ.LIZIZ(abstractC1295900jpM, c1294720jnS, f, interfaceC1295730jp5, true, z));
                    }
                }
                abstractC1295900jpM.LIZLLL();
            } else {
                arrayList.add(C1294790jnZ.LIZIZ(abstractC1295900jpM, c1294720jnS, f, interfaceC1295730jp5, false, z));
            }
        }
        abstractC1295900jpM.LJFF();
        LIZIZ(arrayList);
        return arrayList;
    }
}
