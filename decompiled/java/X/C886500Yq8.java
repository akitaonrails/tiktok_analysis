package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C886500Yq8 {
    public static <VO extends InterfaceC884440Ymo, CONFIG extends InterfaceC886910Yqn> Map<InterfaceC887040Yr0<?>, Object> LIZ(InterfaceC886490Yq7<VO, CONFIG> interfaceC886490Yq7, C879540Yeu<?> c879540Yeu) {
        Object next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC887040Yr0<?> interfaceC887040Yr0 : interfaceC886490Yq7.LIZIZ().LIZ()) {
            Collection<C882270YjJ<?, ?>> collectionValues = c879540Yeu.LJ.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (Intrinsics.LJFF(((C882270YjJ) obj).LIZ.LIZIZ(), interfaceC887040Yr0)) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    float fLIZ = ((C882270YjJ) next).LIZ.LIZ();
                    do {
                        Object next2 = it2.next();
                        float fLIZ2 = ((C882270YjJ) next2).LIZ.LIZ();
                        if (Float.compare(fLIZ, fLIZ2) > 0) {
                            next = next2;
                            fLIZ = fLIZ2;
                        }
                    } while (it2.hasNext());
                }
            }
            C882270YjJ c882270YjJ = (C882270YjJ) next;
            if (c882270YjJ != null) {
                linkedHashMap.put(interfaceC887040Yr0, c882270YjJ.LIZIZ);
            }
        }
        return linkedHashMap;
    }
}
