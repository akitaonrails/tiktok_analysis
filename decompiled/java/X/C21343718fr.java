package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.18fr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21343718fr {
    public static int LIZIZ(int i) {
        switch (i) {
            case 3:
            case 4:
                return 120;
            case 5:
            case 6:
            case 7:
                return 130;
            case 8:
                return 140;
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return 100;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
                return 90;
            case 15:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case 23:
            case 25:
            default:
                return 0;
            case 16:
                return 50;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return 40;
            case 19:
                return 80;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return 60;
            case 21:
                return 70;
            case 22:
            case 26:
                return 180;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return 190;
        }
    }

    public static C1488350opl LIZ(String str, C21328818dS c21328818dS) {
        C21343818fs c21343818fs = new C21343818fs(new C21343918ft(str), c21328818dS);
        c21343818fs.LIZ();
        LIZJ(c21343818fs, 0);
        if (c21343818fs.LIZLLL.LIZ == 32) {
            return new C1488350opl(c21343818fs.LJ, c21343818fs.LJFF);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invalid token: ");
        sbLIZ.append(c21343818fs.LIZLLL);
        throw new C1488370opn("parser_needless_token", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C21343818fs r17, int r18) {
        /*
            Method dump skipped, instruction units count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21343718fr.LIZJ(X.18fs, int):void");
    }
}
