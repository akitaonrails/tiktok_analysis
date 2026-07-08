package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.054V, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C054V extends C09AY implements Function0<Map<String, ? extends EnumC12927054b>> {
    public C054V() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends EnumC12927054b> invoke() {
        EnumC12927054b[] enumC12927054bArrValues = EnumC12927054b.values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC12927054bArrValues.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (EnumC12927054b enumC12927054b : enumC12927054bArrValues) {
            linkedHashMap.put(enumC12927054b.getTag(), enumC12927054b);
        }
        return linkedHashMap;
    }
}
