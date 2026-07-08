package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Avd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C278390Avd {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C278370Avb());

    public static boolean LIZ(String str) {
        if ((!Intrinsics.LJFF(str, "others_homepage") && !Intrinsics.LJFF(str, "personal_homepage") && !Intrinsics.LJFF(str, "general_search") && !Intrinsics.LJFF(str, "single_song")) || (((Number) LIZ.getValue()).intValue() & 1) != 1) {
            return false;
        }
        return true;
    }
}
