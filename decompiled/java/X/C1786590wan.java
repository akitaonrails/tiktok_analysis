package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wan, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1786590wan implements InterfaceC1786610wap {
    public final String LIZ;
    public final Map<String, String> LIZIZ;

    @Override // X.InterfaceC1786610wap
    public final Map<String, String> getParams() {
        return this.LIZIZ;
    }

    public C1786590wan(C1786600wao<InterfaceC1796690wr5> c1786600wao, Function1<InterfaceC1796690wr5, ? extends Map<String, String>> function1) {
        this.LIZ = c1786600wao.LIZ;
        Map<String, String> mapInvoke = function1.invoke(c1786600wao.LIZIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : mapInvoke.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.LIZIZ = linkedHashMap;
    }
}
