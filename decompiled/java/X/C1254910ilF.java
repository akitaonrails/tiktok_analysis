package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0ilF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254910ilF {
    public static final InterfaceC1255580imK LIZ(Integer num, HashMap<String, String> map) {
        int value = EnumC1254860ilA.SIGNUP.getValue();
        if (num != null && num.intValue() == value) {
            return new C1255590imL(map);
        }
        int value2 = EnumC1254860ilA.PROFILE.getValue();
        if (num != null && num.intValue() == value2) {
            return new C1255630imP();
        }
        return new C1255630imP();
    }
}
