package X;

import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JAO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JAO extends C09AY implements Function0<C0JAM> {
    public C0JAO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0JAM invoke() {
        HashMap map = new HashMap();
        map.put("enter_from_merge", "others_homepage");
        map.put("enter_method", "others_photo");
        map.put("action_type", "click");
        return new C0JAM(map);
    }
}
