package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.00sK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C215400sK implements InterfaceC215300sJ {
    public static final C215400sK LIZ = new C215400sK();
    public static final Map<EnumC215200sI, List<Map<String, ?>>> LIZIZ = new LinkedHashMap();

    @Override // X.InterfaceC215300sJ
    public final List<Map<String, Object>> LIZIZ(EnumC215200sI enumC215200sI) {
        return (List) ((LinkedHashMap) LIZIZ).get(enumC215200sI);
    }

    @Override // X.InterfaceC215300sJ
    public final void LIZ(EnumC215200sI enumC215200sI, List<? extends Map<String, ? extends Object>> list) {
        LIZIZ.put(enumC215200sI, new ArrayList(list));
    }
}
