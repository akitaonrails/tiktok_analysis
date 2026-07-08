package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04mF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1196904mF {
    public final Map<String, Function1<C1196804mE, Object>> LIZ;

    public C1196904mF(InterfaceC1126004ao... interfaceC1126004aoArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC1126004ao interfaceC1126004ao : interfaceC1126004aoArr) {
            linkedHashMap.putAll(interfaceC1126004ao.getProvidedLogics());
        }
        this.LIZ = linkedHashMap;
    }
}
