package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.054X, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C054X extends C09AY implements Function0<Map<String, ? extends EnumC12929054d>> {
    public C054X() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends EnumC12929054d> invoke() {
        EnumC12929054d[] enumC12929054dArrValues = EnumC12929054d.values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC12929054dArrValues.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (EnumC12929054d enumC12929054d : enumC12929054dArrValues) {
            linkedHashMap.put(enumC12929054d.getTag(), enumC12929054d);
        }
        return linkedHashMap;
    }
}
