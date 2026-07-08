package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0waX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786430waX extends C09AY implements Function1<Pair<? extends C1786460waa, ? extends List<? extends InterfaceC1780600wR8>>, Map<String, ? extends InterfaceC1780600wR8>> {
    public C1786430waX() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<String, ? extends InterfaceC1780600wR8> invoke(Pair<? extends C1786460waa, ? extends List<? extends InterfaceC1780600wR8>> pair) {
        C1786470wab next;
        String str;
        Pair<? extends C1786460waa, ? extends List<? extends InterfaceC1780600wR8>> pair2 = pair;
        C1786460waa first = pair2.getFirst();
        List<? extends InterfaceC1780600wR8> second = pair2.getSecond();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(second, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (InterfaceC1780600wR8 interfaceC1780600wR8 : second) {
            InterfaceC1780600wR8 interfaceC1780600wR82 = interfaceC1780600wR8;
            Iterator<C1786470wab> it2 = first.LIZJ.iterator();
            do {
                next = null;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.LJFF(next.LIZIZ, interfaceC1780600wR82.getProductId()));
            C1786470wab c1786470wab = next;
            if (c1786470wab == null || (str = c1786470wab.LIZ) == null) {
                str = "";
            }
            linkedHashMap.put(str, interfaceC1780600wR8);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((String) entry.getKey()).length() > 0) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }
}
