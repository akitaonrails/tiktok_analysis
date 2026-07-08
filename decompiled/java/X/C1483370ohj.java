package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;

/* JADX INFO: renamed from: X.0ohj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483370ohj {
    public static void LIZ(Aweme aweme) {
        C1478160oZK.LIZ().LIZ();
        C1483340ohg.LJIL(0, aweme);
        if (aweme != null && aweme.getVideo() != null) {
            aweme.getVideo().setSourceId(aweme.getAid());
            VideoUrlModel properPlayAddr = aweme.getVideo().getProperPlayAddr();
            if (properPlayAddr != null) {
                properPlayAddr.setSourceId(aweme.getAid());
            }
        }
    }
}
