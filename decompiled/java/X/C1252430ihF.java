package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ihF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252430ihF {
    public static final C1252430ihF LIZ = new C1252430ihF();

    public static void LIZ(C1252380ihA c1252380ihA, FollowStatus followStatus, boolean z) {
        Aweme aweme;
        if (z) {
            Aweme aweme2 = c1252380ihA.LJIIIIZZ;
            if (aweme2 != null) {
                C1252430ihF c1252430ihF = LIZ;
                int i = c1252380ihA.LIZLLL;
                String str = c1252380ihA.LJIIIZ;
                c1252430ihF.getClass();
                LIZJ(i, aweme2, str, followStatus);
                return;
            }
            return;
        }
        if (followStatus.status_code != 2149 || (aweme = c1252380ihA.LJIIIIZZ) == null) {
            return;
        }
        C1252430ihF c1252430ihF2 = LIZ;
        int i2 = c1252380ihA.LIZLLL;
        String str2 = c1252380ihA.LJIIIZ;
        c1252430ihF2.getClass();
        LIZJ(i2, aweme, str2, followStatus);
    }

    public static int LIZIZ(int i, int i2, boolean z) {
        C0SY7 c0sy7 = C0SY7.FOLLOWED;
        if (i == c0sy7.getValue()) {
            if (z) {
                return C0SY7.FOLLOW_REQUESTED.getValue();
            }
            if (i2 == c0sy7.getValue()) {
                return C0SY7.FOLLOW_MUTUAL.getValue();
            }
            return c0sy7.getValue();
        }
        return C0SY7.UNFOLLOW.getValue();
    }

    public static void LIZJ(int i, Aweme aweme, String str, FollowStatus followStatus) {
        if (str != null) {
            int i2 = 1;
            if (i == 1 && C1017070cZd.LLF(aweme)) {
                if (Intrinsics.LJFF(str, "feed")) {
                    InterfaceC1035050d2d interfaceC1035050d2dLIZLLL = C1029590ctp.LIZLLL();
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    String userId = followStatus.getUserId();
                    Integer numValueOf = Integer.valueOf(followStatus.getFollowStatus());
                    if (numValueOf != null) {
                        interfaceC1035050d2dLIZLLL.LJJ(contextLIZ, aweme, new FollowStatus(userId, numValueOf.intValue()));
                        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "follow", aweme.getAwemeRawAd());
                        if (!followStatus.isCheating()) {
                            i2 = 0;
                        }
                        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i2), "is_cheated_follow");
                        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(followStatus.getFollowStatus()), "follow_status");
                        c1022820ciuLIZLLL.LJIIIIZZ();
                        return;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (!Intrinsics.LJFF(str, "homepage")) {
                    return;
                }
                InterfaceC1035050d2d interfaceC1035050d2dLIZLLL2 = C1029590ctp.LIZLLL();
                C844470XAv.LIZ.getClass();
                Context contextLIZ2 = C844470XAv.LIZ();
                String userId2 = followStatus.getUserId();
                Integer numValueOf2 = Integer.valueOf(followStatus.getFollowStatus());
                if (numValueOf2 != null) {
                    interfaceC1035050d2dLIZLLL2.LIZIZ(contextLIZ2, aweme, new FollowStatus(userId2, numValueOf2.intValue()));
                    C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("homepage_ad", "follow", aweme.getAwemeRawAd());
                    if (!followStatus.isCheating()) {
                        i2 = 0;
                    }
                    c1022820ciuLIZLLL2.LIZIZ(Integer.valueOf(i2), "is_cheated_follow");
                    c1022820ciuLIZLLL2.LIZIZ(Integer.valueOf(followStatus.getFollowStatus()), "follow_status");
                    c1022820ciuLIZLLL2.LJIIIIZZ();
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }
}
