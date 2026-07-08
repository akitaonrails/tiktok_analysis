package X;

import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Avc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C278380Avc {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5366));

    public static boolean LIZ(String str) {
        if ((!Intrinsics.LJFF(str, "others_homepage") && !Intrinsics.LJFF(str, "personal_homepage") && !Intrinsics.LJFF(str, "general_search")) || (((Number) LIZ.getValue()).intValue() & 1) != 1) {
            return false;
        }
        return true;
    }
}
