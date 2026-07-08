package X;

import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JAS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JAS extends C09AY implements Function0<C0JAM> {
    public C0JAS() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0JAM invoke() {
        HashMap map = new HashMap();
        map.put("enter_from_merge", "personal_homepage");
        map.put("enter_method", "following_list");
        map.put("action_type", "click");
        return new C0JAM(map);
    }
}
