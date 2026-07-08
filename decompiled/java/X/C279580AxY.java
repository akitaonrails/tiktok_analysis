package X;

import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0AxY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C279580AxY {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4702));

    public static final boolean LIZ(String str) {
        C01GW c01gw = LIZ;
        if (((Number) c01gw.getValue()).intValue() != 2) {
            if (((Number) c01gw.getValue()).intValue() == 1) {
                if (!Intrinsics.LJFF(str, "notification_page") && !Intrinsics.LJFF(str, "message")) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
