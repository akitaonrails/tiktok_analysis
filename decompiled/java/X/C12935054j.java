package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.054j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12935054j extends C09AY implements Function0<Map<String, ? extends EnumC12930054e>> {
    public C12935054j() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends EnumC12930054e> invoke() {
        EnumC12930054e[] enumC12930054eArrValues = EnumC12930054e.values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC12930054eArrValues.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (EnumC12930054e enumC12930054e : enumC12930054eArrValues) {
            linkedHashMap.put(enumC12930054e.getTag(), enumC12930054e);
        }
        return linkedHashMap;
    }
}
