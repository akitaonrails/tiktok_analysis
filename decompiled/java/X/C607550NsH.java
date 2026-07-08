package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NsH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607550NsH extends C09AY implements Function0<Map<EnumC607570NsJ, Set<String>>> {
    public C607550NsH() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<EnumC607570NsJ, Set<String>> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EnumC607570NsJ.GLOBAL, Collections.synchronizedSet(new LinkedHashSet()));
        linkedHashMap.put(EnumC607570NsJ.ONLY_FOLLOW, Collections.synchronizedSet(new LinkedHashSet()));
        return linkedHashMap;
    }
}
