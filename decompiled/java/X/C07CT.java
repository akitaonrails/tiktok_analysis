package X;

import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07CT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07CT {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(751));

    public static boolean LIZ(C2189821An6 c2189821An6) {
        String eventType;
        if (c2189821An6 != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        if (!((Boolean) LIZ.getValue()).booleanValue() || !Intrinsics.LJFF(eventType, "homepage_hot")) {
            return false;
        }
        return true;
    }
}
