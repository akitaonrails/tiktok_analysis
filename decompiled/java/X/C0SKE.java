package X;

import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0SKE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SKE {
    public static final boolean LIZ(PostModeDetailParams postModeDetailParams) {
        PostModeEntranceMechanism postModeEntranceMechanism;
        if (postModeDetailParams == null || (postModeEntranceMechanism = postModeDetailParams.postModeEntranceMechanism) == null) {
            return false;
        }
        switch (C0SKC.LIZ[postModeEntranceMechanism.ordinal()]) {
            case -1:
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return false;
            case 0:
            default:
                throw new C1954807lC();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
        }
    }
}
