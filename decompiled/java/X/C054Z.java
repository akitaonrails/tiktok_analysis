package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.054Z, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C054Z extends C09AY implements Function0<Map<String, ? extends EnumC12926054a>> {
    public C054Z() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends EnumC12926054a> invoke() {
        EnumC12926054a[] enumC12926054aArrValues = EnumC12926054a.values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC12926054aArrValues.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (EnumC12926054a enumC12926054a : enumC12926054aArrValues) {
            linkedHashMap.put(enumC12926054a.getTag(), enumC12926054a);
        }
        return linkedHashMap;
    }
}
