package X;

import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JAT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JAT extends C09AY implements Function0<C0JAM> {
    public C0JAT() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0JAM invoke() {
        HashMap map = new HashMap();
        map.put("enter_from_merge", "push");
        map.put("enter_method", "push");
        map.put("action_type", "click");
        return new C0JAM(map);
    }
}
