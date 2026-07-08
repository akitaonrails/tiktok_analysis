package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2268531Dql {
    public static final InterfaceC2268711Dr3 LIZ(String str) {
        if (!Intrinsics.LJFF(str, "receive") && !Intrinsics.LJFF(str, C1018060cbE.LJIILIIL.LJI.getSecond())) {
            if (Intrinsics.LJFF(str, "show")) {
                return C2268581Dqq.LIZ;
            }
            if (Intrinsics.LJFF(str, "break")) {
                return C2268591Dqr.LIZ;
            }
            if (!Intrinsics.LJFF(str, "play") && !Intrinsics.LJFF(str, "replay") && !Intrinsics.LJFF(str, "auto_play")) {
                if (Intrinsics.LJFF(str, "over")) {
                    return C2268651Dqx.LIZ;
                }
                if (C1022540ciS.LIZ.contains(str)) {
                    return C2268601Dqs.LIZ;
                }
                if (Intrinsics.LJFF(str, "otherclick")) {
                    return C2268601Dqs.LIZ;
                }
                if (Intrinsics.LJFF(str, "resume")) {
                    return C2268681Dr0.LIZ;
                }
                if (Intrinsics.LJFF(str, "landing_page_open")) {
                    return C2268631Dqv.LIZ;
                }
                if (Intrinsics.LJFF(str, "search_detail_open")) {
                    return C2268561Dqo.LIZ;
                }
                if (Intrinsics.LJFF(str, "search_return")) {
                    return C2268571Dqp.LIZ;
                }
                if (Intrinsics.LJFF(str, "close")) {
                    return C2268611Dqt.LIZ;
                }
                if (Intrinsics.LJFF(str, "landing_page_exposure")) {
                    return C2268701Dr2.LIZ;
                }
                if (Intrinsics.LJFF(str, "load_finish")) {
                    return C2268691Dr1.LIZ;
                }
                if (Intrinsics.LJFF(str, "container_close")) {
                    return C2268671Dqz.LIZ;
                }
                return C2268641Dqw.LIZ;
            }
            return C2268661Dqy.LIZ;
        }
        return C2268621Dqu.LIZ;
    }
}
