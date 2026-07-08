package X;

import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161090gJv {
    public final Map<String, C1161060gJs> LIZ;
    public final Map<String, List<C1161140gK0>> LIZIZ;
    public final List<C1161100gJw> LIZJ;

    public final List<C1161140gK0> LIZ() {
        return this.LIZIZ.get("body");
    }

    public final List<C1161100gJw> LIZIZ(List<? extends BaseComponentData> list) {
        int i;
        String str;
        if (this.LIZJ.isEmpty()) {
            return C13BV.INSTANCE;
        }
        List<C1161100gJw> list2 = this.LIZJ;
        ArrayList<C1161100gJw> arrayList = new ArrayList();
        Iterator<C1161100gJw> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1161100gJw next = it2.next();
            C1161100gJw c1161100gJw = next;
            if (!list.isEmpty()) {
                Iterator<? extends BaseComponentData> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    BaseComponentData next2 = it3.next();
                    if (next2 != null) {
                        str = next2.instanceId;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, c1161100gJw.LIZLLL)) {
                        arrayList.add(next);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (C1161100gJw c1161100gJw2 : arrayList) {
            int i3 = (c1161100gJw2.LIZIZ - c1161100gJw2.LIZ) + i2;
            arrayList2.add(C1161100gJw.LIZ(c1161100gJw2, i2, i3, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 4092));
            i2 = i3;
        }
        if (arrayList2.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList3 = new ArrayList();
        C1161100gJw c1161100gJwLIZ = (C1161100gJw) ListProtector.get(arrayList2, 0);
        int size = arrayList2.size();
        C1161100gJw c1161100gJw3 = c1161100gJwLIZ;
        for (i = 1; i < size; i++) {
            c1161100gJwLIZ = (C1161100gJw) ListProtector.get(arrayList2, i);
            if (c1161100gJw3.LIZJ == c1161100gJwLIZ.LIZJ && c1161100gJw3.LJ == c1161100gJwLIZ.LJ && c1161100gJw3.LJFF == c1161100gJwLIZ.LJFF && c1161100gJw3.LJI == c1161100gJwLIZ.LJI && c1161100gJw3.LJII == c1161100gJwLIZ.LJII && c1161100gJw3.LJIIIIZZ == c1161100gJwLIZ.LJIIIIZZ && c1161100gJw3.LJIIIZ == c1161100gJwLIZ.LJIIIZ && c1161100gJw3.LJIIJ == c1161100gJwLIZ.LJIIJ && c1161100gJw3.LJIIJJI == c1161100gJwLIZ.LJIIJJI) {
                int i4 = c1161100gJwLIZ.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1161100gJw3.LIZLLL);
                sbLIZ.append(", ");
                sbLIZ.append(c1161100gJwLIZ.LIZLLL);
                c1161100gJwLIZ = C1161100gJw.LIZ(c1161100gJw3, 0, i4, null, C2188811AlT.LIZIZ(sbLIZ), 0, 0, 0, 0, 0, 0, 0, 0, 4085);
            } else {
                arrayList3.add(c1161100gJw3);
            }
            c1161100gJw3 = c1161100gJwLIZ;
        }
        arrayList3.add(c1161100gJwLIZ);
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1161090gJv(Map<String, C1161060gJs> map, Map<String, ? extends List<C1161140gK0>> map2, List<C1161100gJw> list) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = list;
    }
}
