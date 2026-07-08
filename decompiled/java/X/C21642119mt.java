package X;

import android.content.Context;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.19mt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21642119mt {
    public static String LIZ(int i, Context context) {
        if (context == null) {
            return "";
        }
        if (i != 1) {
            if (i != 7) {
                switch (i) {
                    case BdTuring.TYPE_ECAF /* 9 */:
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        return context.getString(2131834691);
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        return context.getString(2131834690);
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        return context.getString(2131834688);
                    default:
                        return context.getString(2131830514);
                }
            }
            return context.getString(2131834689);
        }
        return context.getString(2131834687);
    }
}
