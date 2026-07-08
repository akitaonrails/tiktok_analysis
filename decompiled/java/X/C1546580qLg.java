package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546580qLg extends C09AY implements Function0<Map<String, C1546510qLZ>> {
    public C1546580qLg() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, C1546510qLZ> invoke() {
        return Collections.synchronizedMap(new LinkedHashMap());
    }
}
