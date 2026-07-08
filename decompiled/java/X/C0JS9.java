package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JS9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JS9 extends C09AY implements Function0<Map<String, Boolean>> {
    public C0JS9() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, Boolean> invoke() {
        Map<String, Boolean> mapLIZIZ = C0KPJ.af.LIZIZ();
        return mapLIZIZ == null ? new HashMap() : mapLIZIZ;
    }
}
