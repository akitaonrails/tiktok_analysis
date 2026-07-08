package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.054Y, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C054Y extends C09AY implements Function0<Map<String, ? extends EnumC1502105uN>> {
    public C054Y() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends EnumC1502105uN> invoke() {
        EnumC1502105uN[] enumC1502105uNArrValues = EnumC1502105uN.values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC1502105uNArrValues.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (EnumC1502105uN enumC1502105uN : enumC1502105uNArrValues) {
            linkedHashMap.put(enumC1502105uN.getTag(), enumC1502105uN);
        }
        return linkedHashMap;
    }
}
