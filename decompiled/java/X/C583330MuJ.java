package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MuJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C583330MuJ {
    public static boolean LIZ(String str) {
        if (!Intrinsics.LJFF(str, "system_launch") && !Intrinsics.LJFF(str, "system_launch_startup_end_to_feed") && !Intrinsics.LJFF(str, "system_launch_feed_to_first_frame") && !Intrinsics.LJFF(str, "system_launch_after_first_frame") && !Intrinsics.LJFF(str, "system_launch_1_minute") && !Intrinsics.LJFF(str, "system_launch_1_minute_feed") && !Intrinsics.LJFF(str, "system_launch_1_to_2_minute") && !Intrinsics.LJFF(str, "system_launch_1_to_2_minute_feed") && !Intrinsics.LJFF(str, "system_launch_isolate_startup_to_first_frame") && !Intrinsics.LJFF(str, "system_launch_isolate_after_first_frame")) {
            return false;
        }
        return true;
    }
}
