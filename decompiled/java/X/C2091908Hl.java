package X;

import java.util.Collections;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08Hl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2091908Hl extends C09AY implements Function0<Map<Object, InterfaceC1618170sD9<Object>>> {
    public C2091908Hl() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<Object, InterfaceC1618170sD9<Object>> invoke() {
        return Collections.synchronizedMap(new C2091608Hi(100));
    }
}
