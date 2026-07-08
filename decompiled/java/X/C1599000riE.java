package X;

import com.ss.android.ugc.aweme.experiment.SkylightLocalRerankExpData;

/* JADX INFO: renamed from: X.0riE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599000riE {
    public static final SkylightLocalRerankExpData LIZ;

    static {
        SkylightLocalRerankExpData skylightLocalRerankExpData = new SkylightLocalRerankExpData(false, 50L, false, false, false, false, false, false);
        SkylightLocalRerankExpData skylightLocalRerankExpData2 = (SkylightLocalRerankExpData) C0C64.LJIILLIIL().LJJII(SkylightLocalRerankExpData.class, skylightLocalRerankExpData, "tt_story_skylight_rerank_config", true);
        if (skylightLocalRerankExpData2 != null) {
            skylightLocalRerankExpData = skylightLocalRerankExpData2;
        }
        LIZ = skylightLocalRerankExpData;
    }

    public static boolean LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    return LIZ.inboxEnableReorder;
                }
                return LIZ.followingEnableReorder;
            }
            return LIZ.fypEnableReorder;
        }
        return LIZ.friendsEnableReorder;
    }
}
