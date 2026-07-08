package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969550bKz {
    public static final ConcurrentHashMap<Class<?>, List<Function1<C917110ZyP<?>, Unit>>> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(Class cls, Function1 function1) {
        List<Function1<C917110ZyP<?>, Unit>> list;
        ConcurrentHashMap<Class<?>, List<Function1<C917110ZyP<?>, Unit>>> concurrentHashMap = LIZ;
        if (!concurrentHashMap.containsKey(cls)) {
            concurrentHashMap.put(cls, new ArrayList());
        }
        if (C19719512Dh.LJFF(1, function1) && function1 != null) {
            List<Function1<C917110ZyP<?>, Unit>> list2 = concurrentHashMap.get(cls);
            if ((list2 != null && list2.contains(function1)) || (list = concurrentHashMap.get(cls)) == null) {
                return;
            }
            list.add(function1);
        }
    }

    public static void LIZIZ(Class cls, Function1 function1) {
        List<Function1<C917110ZyP<?>, Unit>> list = LIZ.get(cls);
        if (list != null) {
            C19719512Dh.LIZ(list).remove(function1);
        }
    }
}
