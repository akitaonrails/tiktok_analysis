package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04m3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1195704m3 {
    public static final Map<Object, C955590ayT> LIZ(List<?> list, Function1<Object, Boolean> function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            if ((obj instanceof C955590ayT) && function1.invoke(obj).booleanValue()) {
                linkedHashMap.put(obj, null);
            }
        }
        return linkedHashMap;
    }
}
