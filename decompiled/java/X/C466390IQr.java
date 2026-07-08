package X;

import com.bytedance.android.livesdk.livesetting.feed.LivePreviewAutoSkipTypeSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466390IQr {
    public static Pair<Integer, Boolean> LIZ;

    public static final void LIZ(int i, EnterRoomConfig enterRoomConfig) {
        int i2;
        C466650IRr c466650IRr;
        if (!Intrinsics.LJFF(enterRoomConfig.mRoomsData.enterFromMerge, "homepage_hot") || !Intrinsics.LJFF(enterRoomConfig.mRoomsData.enterMethod, "live_cell") || LivePreviewAutoSkipTypeSetting.INSTANCE.getValue() != 2) {
            return;
        }
        C466640IRq c466640IRqLIZJ = C466640IRq.LIZJ();
        if (c466640IRqLIZJ.LIZ && (c466650IRr = c466640IRqLIZJ.LIZLLL) != null) {
            i2 = c466650IRr.LJIIIIZZ;
        } else {
            i2 = -1;
        }
        if (i != i2) {
            return;
        }
        Pair<Integer, Boolean> pair = LIZ;
        if (pair == null || pair.getFirst().intValue() != i) {
            LIZ = new Pair<>(Integer.valueOf(i), Boolean.FALSE);
        }
        Pair<Integer, Boolean> pair2 = LIZ;
        if (pair2 != null && pair2.getSecond().booleanValue()) {
            return;
        }
        LIZ = new Pair<>(Integer.valueOf(i), Boolean.TRUE);
        C486790J7d.LIZJ(new Runnable() { // from class: X.0IQt
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveExitAutoScrollHelper@e09f.onPageSelected$1");
                try {
                    C1440005kM.LIZ(new C466430IQv(C00Y7.FYP_INNER_DRAW_EXP));
                    C20441214yg.LIZIZ("LiveExitAutoScrollHelper", "onPageSelected: POST FeedSwipeToNextEvent");
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveExitAutoScrollHelper@e09f.onPageSelected$1");
            }
        });
    }
}
