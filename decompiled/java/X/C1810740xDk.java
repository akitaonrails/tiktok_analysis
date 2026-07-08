package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.rank.LiveECommerceRankingStyleSetting;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810740xDk {
    public static C1143920fsE LIZ;

    public static final int LIZ(long j, RankTypeV2 rankTypeV2) {
        Integer numLIZJ;
        Integer numLIZJ2;
        Integer numLIZJ3;
        Integer numLIZJ4;
        int i = rankTypeV2.style;
        if (i == 1) {
            if (j == 1) {
                return C497740JfY.LJFF(R.color.aap);
            }
            if (j == 2) {
                return C497740JfY.LJFF(R.color.aaq);
            }
            if (j == 3) {
                return C497740JfY.LJFF(R.color.aar);
            }
            Context contextLJII = C497740JfY.LJII();
            if (contextLJII == null || (numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1p, contextLJII)) == null) {
                return 0;
            }
            return numLIZJ4.intValue();
        }
        if (i == 2) {
            if (j == 1) {
                return C497740JfY.LJFF(R.color.a_c);
            }
            if (j == 2) {
                return C497740JfY.LJFF(R.color.a_d);
            }
            if (j == 3) {
                return C497740JfY.LJFF(R.color.a_e);
            }
            Context contextLJII2 = C497740JfY.LJII();
            if (contextLJII2 == null || (numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1p, contextLJII2)) == null) {
                return 0;
            }
            return numLIZJ3.intValue();
        }
        if (i == 3) {
            RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
            RankTypeV2 rankTypeV23 = RankTypeV2.LIZLLL;
            if (!Intrinsics.LJFF(rankTypeV2, rankTypeV23) || (Intrinsics.LJFF(rankTypeV2, rankTypeV23) && LiveECommerceRankingStyleSetting.INSTANCE.isCreator())) {
                Context contextLJII3 = C497740JfY.LJII();
                if (contextLJII3 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.ezy, contextLJII3)) != null) {
                    return numLIZJ2.intValue();
                }
                return 1459617792;
            }
        }
        if (j == 1) {
            return C497740JfY.LJFF(R.color.a64);
        }
        if (j == 2) {
            return C497740JfY.LJFF(R.color.a65);
        }
        if (j == 3) {
            return C497740JfY.LJFF(R.color.a66);
        }
        Context contextLJII4 = C497740JfY.LJII();
        if (contextLJII4 == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, contextLJII4)) == null) {
            return 0;
        }
        return numLIZJ.intValue();
    }

    public static final void LIZIZ(C1324720kZq c1324720kZq, boolean z, boolean z2) {
        C1143920fsE c1143920fsE = LIZ;
        if (c1143920fsE == null) {
            C1143920fsE c1143920fsE2 = new C1143920fsE();
            c1143920fsE2.LIZ = c1324720kZq;
            if (z) {
                c1143920fsE2.LJFF = false;
            } else {
                c1143920fsE2.LJFF = true;
            }
            if (z2) {
                c1143920fsE2.LIZIZ = "tiktok_live_watch_resource_normal_1";
                c1143920fsE2.LIZJ = "live_skylight_icon_anim_small_size.webp";
                c1143920fsE2.LJI = Integer.MAX_VALUE;
            } else {
                c1143920fsE2.LIZIZ = C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_normal_1");
                c1143920fsE2.LIZJ = "ttlive_item_rank_top_on_going_hd.webp";
            }
            LIZ = c1143920fsE2;
        } else {
            c1143920fsE.LIZ = c1324720kZq;
        }
        C1143680frq.LJIIIIZZ(LIZ);
    }
}
