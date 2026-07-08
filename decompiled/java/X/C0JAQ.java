package X;

import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JAQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JAQ extends C09AY implements Function0<C0JAM> {
    public C0JAQ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0JAM invoke() {
        HashMap map = new HashMap();
        map.put("enter_from_merge", "live_merge");
        map.put("enter_method", "live_cover");
        map.put("action_type", "click");
        return new C0JAM(map);
    }
}
