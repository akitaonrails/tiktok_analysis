package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fZW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132320fZW {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        if (!Intrinsics.LJFF(str, "beacon_bubble_task_page") && !Intrinsics.LJFF(str, "recharge_task_page") && !Intrinsics.LJFF(str, "live_income_task_page")) {
            return false;
        }
        return true;
    }
}
