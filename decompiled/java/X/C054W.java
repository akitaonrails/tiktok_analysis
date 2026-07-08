package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.054W, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C054W extends C09AY implements Function0<Map<String, ? extends EnumC12928054c>> {
    public C054W() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends EnumC12928054c> invoke() {
        EnumC12928054c[] enumC12928054cArrValues = EnumC12928054c.values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC12928054cArrValues.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (EnumC12928054c enumC12928054c : enumC12928054cArrValues) {
            linkedHashMap.put(enumC12928054c.getTag(), enumC12928054c);
        }
        return linkedHashMap;
    }
}
