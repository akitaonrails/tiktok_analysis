package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0miH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406830miH {
    public static final C1406830miH LIZ = new C1406830miH();

    public static final void LIZ(long j, String str, boolean z) {
        int i;
        if (!Intrinsics.LJFF(str, "mission_duet")) {
            return;
        }
        C11BY c11by = new C11BY();
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        Pair<String, ? extends Object>[] pairArr = new Pair[2];
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        pairArr[0] = new Pair<>("is_success", Integer.valueOf(i));
        pairArr[1] = new Pair<>("duration", Long.valueOf(jCurrentTimeMillis));
        c11by.LJI("mission_duet_video_split_finish", pairArr);
    }
}
