package X;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Nj4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C601840Nj4 {
    public static final Map<String, Map<String, Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<Object, Object, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>>>> LIZ = new LinkedHashMap();

    public static void LIZ(String str, String str2, Function1 function1) {
        Map<String, Map<String, Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<Object, Object, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>>>> map = LIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        if (linkedHashMap.get(str) == null) {
            map.put(str, new LinkedHashMap());
        }
        Map map2 = (Map) linkedHashMap.get(str);
        if (map2 != null) {
            map2.put(str2, function1);
        }
    }
}
