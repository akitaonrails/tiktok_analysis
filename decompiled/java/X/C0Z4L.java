package X;

import com.ss.android.ugc.aweme.im.common.experiment.RecentActivitySticker;
import com.ss.android.ugc.aweme.im.common.experiment.RecentActivityStickerConfig;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0Z4L, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z4L {
    public static final RecentActivityStickerConfig LIZ = new RecentActivityStickerConfig(null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(482));

    public static RecentActivityStickerConfig LIZ() {
        return (RecentActivityStickerConfig) LIZIZ.getValue();
    }

    public static long LIZIZ(EnumC461080I6g enumC461080I6g) {
        int i = C892490Yzn.LIZ[enumC461080I6g.ordinal()];
        if (i != 1) {
            if (i == 2) {
                RecentActivitySticker recentActivitySticker = LIZ().repost;
                if (recentActivitySticker == null) {
                    recentActivitySticker = new RecentActivitySticker("❤️", 44538807299L, 44142529795L, 2, "", 7176841825176847366L);
                }
                return recentActivitySticker.stickerId;
            }
            throw new C1954807lC();
        }
        RecentActivitySticker recentActivitySticker2 = LIZ().post;
        if (recentActivitySticker2 == null) {
            recentActivitySticker2 = new RecentActivitySticker("❤️", 44538807299L, 44142529795L, 2, "", 7176841825176847366L);
        }
        return recentActivitySticker2.stickerId;
    }
}
