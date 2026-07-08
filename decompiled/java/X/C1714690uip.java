package X;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714690uip {
    public static final boolean LIZ(HashMap<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("user_register_optimize");
        if (!Intrinsics.LJFF(str, "flow_and_text_benefit_group") && !Intrinsics.LJFF(str, "flow_benefit_group")) {
            return false;
        }
        return true;
    }
}
