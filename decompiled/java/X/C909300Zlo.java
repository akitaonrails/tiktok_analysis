package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Zlo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909300Zlo extends C09AY implements Function0<Map<String, ? extends EnumC909380Zlw>> {
    public C909300Zlo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends EnumC909380Zlw> invoke() {
        EnumC909380Zlw[] enumC909380ZlwArrValues = EnumC909380Zlw.values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC909380ZlwArrValues.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (EnumC909380Zlw enumC909380Zlw : enumC909380ZlwArrValues) {
            linkedHashMap.put(enumC909380Zlw.getKey(), enumC909380Zlw);
        }
        return linkedHashMap;
    }
}
