package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RH1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RH1 {
    public static boolean LIZ(C690870R8b c690870R8b) {
        String from;
        C2189821An6 c2189821An6;
        C0RJN c0rjnLIZIZ = c690870R8b.LIZIZ();
        if (c0rjnLIZIZ != null && (c2189821An6 = c0rjnLIZIZ.LIZJ) != null) {
            from = c2189821An6.getFrom();
        } else {
            from = null;
        }
        C728030Sh7.LIZ.getClass();
        if (!C728030Sh7.LIZ() || !Intrinsics.LJFF(from, "STORY_ENTRANCE_HIGHLIGHTS")) {
            if (C298520Bn0.LIZ() && Intrinsics.LJFF(from, "STORY_ENTRANCE_INBOX_TOP_LIST")) {
                return true;
            }
            return false;
        }
        return true;
    }
}
