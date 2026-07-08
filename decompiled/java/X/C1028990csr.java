package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0csr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028990csr {
    public final Map<String, Function1<C1028760csU, Object>> LIZ;

    public C1028990csr(InterfaceC1029020csu... interfaceC1029020csuArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC1029020csu interfaceC1029020csu : interfaceC1029020csuArr) {
            linkedHashMap.putAll(interfaceC1029020csu.getProvidedLogics());
        }
        this.LIZ = linkedHashMap;
    }
}
