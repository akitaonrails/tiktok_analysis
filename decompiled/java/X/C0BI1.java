package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BI1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BI1 extends C09AY implements Function0<Map<String, ? extends Boolean>> {
    public C0BI1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Boolean>] */
    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends Boolean> invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        HashMap<String, Boolean> map = C0BI2.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(HashMap.class, map, "fcp_migrate_standard_button", true);
        return LJJII != 0 ? LJJII : map;
    }
}
