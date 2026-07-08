package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Lfu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C548920Lfu {
    public static final Map<Class<?>, Function1<Object, InterfaceC548750Lfd>> LIZ = new LinkedHashMap();

    public static void LIZ(Class cls, Function1 function1) {
        Map<Class<?>, Function1<Object, InterfaceC548750Lfd>> map = LIZ;
        if (map.containsKey(cls)) {
            return;
        }
        C19719512Dh.LJ(1, function1);
        map.put(cls, function1);
    }
}
