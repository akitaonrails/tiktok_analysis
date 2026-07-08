package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1026350cob {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final String LIZ(int i) {
        if (i == 8) {
            return "button";
        }
        if (i == 48) {
            return "popupmask";
        }
        if (i != 50) {
            if (i != 76) {
                if (i == 92) {
                    return "endlayer_screenshot";
                }
                if (i != 35 && i != 36) {
                    if (i != 39) {
                        if (i == 40) {
                            return "slide";
                        }
                        switch (i) {
                            case 1:
                            case 4:
                            case 5:
                                break;
                            case 2:
                            case 3:
                            case 6:
                                return "button";
                            default:
                                switch (i) {
                                    case BdTuring.TYPE_EMAIL /* 11 */:
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                        break;
                                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                    case 15:
                                        return "hot_region";
                                    case 14:
                                        break;
                                    default:
                                        switch (i) {
                                            case 19:
                                                return "image";
                                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                                break;
                                            case 21:
                                                return "hot_region";
                                            default:
                                                switch (i) {
                                                    case 53:
                                                    case 54:
                                                        return "button";
                                                    case 55:
                                                        break;
                                                    case 56:
                                                        return "source";
                                                    case 57:
                                                        return "like";
                                                    case 58:
                                                        return "anchor";
                                                    default:
                                                        switch (i) {
                                                            case 61:
                                                                return "takeover";
                                                            case BaseNotice.CREATOR /* 62 */:
                                                                break;
                                                            case 63:
                                                            case 64:
                                                                break;
                                                            case 65:
                                                                return "popupbadge";
                                                            case 66:
                                                                return "badge";
                                                            case 67:
                                                                return "popupbadgetext";
                                                            case 68:
                                                            case 70:
                                                                return "button";
                                                            case 69:
                                                                return "product_link_anchor";
                                                            default:
                                                                switch (i) {
                                                                    case 78:
                                                                        return "halfscreen_page";
                                                                    case 79:
                                                                        return "full_screen_landing_page";
                                                                    case 80:
                                                                        return "video";
                                                                    default:
                                                                        return "";
                                                                }
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    }
                    return "name";
                }
            }
            return "title";
        }
        return "photo";
    }

    public static final String LIZIZ(int i) {
        if (i == 50) {
            return "homepage_ad";
        }
        if (i == 92) {
            return "background_ad";
        }
        if (i == 62 || i == 63) {
            return "comment_first_ad";
        }
        switch (i) {
            case 3:
                return "background_ad";
            case 4:
                return "comment_first_ad";
            case 5:
            case 6:
                return "comment_end_ad";
            case 7:
            case 8:
                return "homepage_ad";
            default:
                switch (i) {
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    case 14:
                    case 15:
                        return "background_ad";
                    default:
                        switch (i) {
                            case 19:
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            case 21:
                                return "background_ad";
                            default:
                                switch (i) {
                                    case 35:
                                        return "comment_first_ad";
                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                        return "comment_end_ad";
                                    case 37:
                                        return "homepage_ad";
                                    default:
                                        switch (i) {
                                            case 53:
                                            case 55:
                                            case 56:
                                            case 57:
                                                return "result_ad";
                                            case 54:
                                                return "result_ad_bg";
                                            default:
                                                return "draw_ad";
                                        }
                                }
                        }
                }
        }
    }

    public static final boolean LIZJ(String str) {
        if (str == null) {
            return false;
        }
        if (!Intrinsics.LJFF(str, "draw_ad_photo") && !Intrinsics.LJFF(str, "draw_ad_name") && !Intrinsics.LJFF(str, "draw_ad_slide")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x01b2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZLLL(java.lang.Integer r4) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1026350cob.LIZLLL(java.lang.Integer):java.lang.String");
    }

    public static final void LJ(String str) {
        Intrinsics.LJFF(str, "homepage_hot");
    }
}
