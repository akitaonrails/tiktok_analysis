package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ckC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023620ckC extends C09AY implements Function0<Map<String, Function1<? super C1196804mE, ? extends Object>>> {
    public final /* synthetic */ C1023640ckE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1023620ckC(C1023640ckE c1023640ckE) {
        super(0);
        this.LL = c1023640ckE;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, Function1<? super C1196804mE, ? extends Object>> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1023630ckD<?>[] internalLogics = this.LL.getInternalLogics();
        int iLIZIZ = C2097908Jt.LIZIZ(internalLogics.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
        for (C1023630ckD<?> c1023630ckD : internalLogics) {
            linkedHashMap2.put(c1023630ckD.LIZ.getName(), c1023630ckD);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap2.size()));
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry.getKey(), ((C1023630ckD) entry.getValue()).LIZIZ);
        }
        linkedHashMap.putAll(linkedHashMap3);
        return linkedHashMap;
    }
}
