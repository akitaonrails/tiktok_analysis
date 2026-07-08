package X;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461450I7r {
    public static boolean LIZ(InterfaceC461380I7k interfaceC461380I7k, InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!C13LE.LIZ(interfaceC1891350zJl.getClass()).LIZIZ(interfaceC461380I7k) || !(interfaceC1891350zJl instanceof InterfaceC461380I7k)) {
            return false;
        }
        return Intrinsics.LJFF(interfaceC461380I7k.LLILII().LIZ.LIZ.getUuid(), ((InterfaceC461380I7k) interfaceC1891350zJl).LLILII().LIZ.LIZ.getUuid());
    }

    public static C461530I7z LIZIZ(InterfaceC461380I7k interfaceC461380I7k, InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof InterfaceC461380I7k)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map<C14IR, C461020I6a<? extends Object>> map = interfaceC461380I7k.LLILII().LIZJ;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<C14IR, C461020I6a<? extends Object>> entry : map.entrySet()) {
            C14IR key = entry.getKey();
            if (Intrinsics.LJFF(((InterfaceC461380I7k) interfaceC1891350zJl).LLILII().LIZJ.get(key), entry.getValue())) {
                linkedHashSet.add(key);
            }
            arrayList.add(Unit.LIZ);
        }
        return new C461530I7z(linkedHashSet);
    }
}
