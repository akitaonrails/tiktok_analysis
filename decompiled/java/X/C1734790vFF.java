package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0vFF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734790vFF {
    public static final C1734790vFF LIZ = new C1734790vFF();

    public static String[] LIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 8) {
                                if (i != 21) {
                                    if (i != 22) {
                                        switch (i) {
                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                return new String[]{"postalAddress"};
                                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                return new String[]{"addressRegion"};
                                            case 14:
                                                return new String[]{"addressLocality"};
                                            case 15:
                                                return new String[]{"postalCode"};
                                            default:
                                                return null;
                                        }
                                    }
                                }
                            } else {
                                return new String[]{"countryName"};
                            }
                        }
                        return new String[]{"phone"};
                    }
                    return new String[]{"emailAddress"};
                }
                return new String[]{"name"};
            }
            return new String[]{"familyName"};
        }
        return new String[]{"givenName"};
    }
}
