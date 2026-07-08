package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gN5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1163050gN5 extends C09AY implements Function0<Boolean> {
    public C1163050gN5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Boolean bool;
        Map<String, Object> mapLJIIIZ;
        C1168270gVV.LIZ.getClass();
        InterfaceC1168280gVW interfaceC1168280gVW = C1168270gVV.LIZJ;
        Object obj = null;
        if (interfaceC1168280gVW != null && (mapLJIIIZ = interfaceC1168280gVW.LJIIIZ()) != null) {
            obj = mapLJIIIZ.get("enable_leaf_flatten");
        }
        return Boolean.valueOf((!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) ? false : bool.booleanValue());
    }
}
