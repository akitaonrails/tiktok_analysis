package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0a4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921190a4z {
    public static final void LIZ(Long l, Map map) {
        String strLIZIZ;
        if (l == null) {
            return;
        }
        InterfaceC921620a5g interfaceC921620a5gLIZJ = C921180a4y.LIZJ();
        if (interfaceC921620a5gLIZJ == null || (strLIZIZ = interfaceC921620a5gLIZJ.LIZIZ(l.longValue())) == null) {
            if (C921180a4y.LJIJ(l.longValue())) {
                strLIZIZ = "guest_apply_anchor";
            } else {
                strLIZIZ = "anchor_invite_guest";
            }
        }
        ((HashMap) map).put("guest_invite_type", strLIZIZ);
    }
}
