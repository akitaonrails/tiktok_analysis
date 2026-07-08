package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cVY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014540cVY {
    public static AbstractC1014560cVa LIZ(String str) {
        C1014610cVf c1014610cVf = C1014610cVf.LIZIZ;
        if (!Intrinsics.LJFF(str, "from_left_to_right")) {
            C1014620cVg c1014620cVg = C1014620cVg.LIZIZ;
            if (!Intrinsics.LJFF(str, "from_right_to_left")) {
                C1014630cVh c1014630cVh = C1014630cVh.LIZIZ;
                if (!Intrinsics.LJFF(str, "from_top_to_bottom")) {
                    C1014600cVe c1014600cVe = C1014600cVe.LIZIZ;
                    if (!Intrinsics.LJFF(str, "from_bottom_to_top")) {
                        C1014580cVc c1014580cVc = C1014580cVc.LIZIZ;
                        if (!Intrinsics.LJFF(str, "resize")) {
                            C1014570cVb c1014570cVb = C1014570cVb.LIZIZ;
                            if (!Intrinsics.LJFF(str, "opacity")) {
                                C1014590cVd c1014590cVd = C1014590cVd.LIZIZ;
                                if (!Intrinsics.LJFF(str, "scale")) {
                                    return null;
                                }
                                return c1014590cVd;
                            }
                            return c1014570cVb;
                        }
                        return c1014580cVc;
                    }
                    return c1014600cVe;
                }
                return c1014630cVh;
            }
            return c1014620cVg;
        }
        return c1014610cVf;
    }
}
