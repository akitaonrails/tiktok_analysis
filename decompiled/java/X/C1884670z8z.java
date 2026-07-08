package X;

import com.bytedance.android.livesdk.game.model.GameDetailHeaderCTA;
import com.bytedance.android.livesdk.game.model.GameDetailHeaderInfo;

/* JADX INFO: renamed from: X.0z8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884670z8z {
    public static final String LIZ(GameDetailHeaderInfo gameDetailHeaderInfo) {
        int i = gameDetailHeaderInfo.headerImageType;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return "immersive_full_screen";
            }
            if (gameDetailHeaderInfo.headerId.length() != 0 && gameDetailHeaderInfo.headerImageUrl.length() != 0 && gameDetailHeaderInfo.headerImageThemeColor.length() != 0 && gameDetailHeaderInfo.activityTitle.length() != 0 && gameDetailHeaderInfo.activityStartTime > 0 && gameDetailHeaderInfo.activityEndTime > 0) {
                GameDetailHeaderCTA gameDetailHeaderCTA = gameDetailHeaderInfo.gameDetailHeaderCta;
                if (gameDetailHeaderCTA != null) {
                    if (gameDetailHeaderCTA.jumpLink.length() != 0 && gameDetailHeaderCTA.headerCtaText.length() != 0 && C13LQ.LJJIJIIJI(Integer.valueOf(gameDetailHeaderCTA.headerCtaType), new Integer[]{1, 0}) >= 0) {
                        return "interactive_full_screen";
                    }
                    return "immersive_full_screen";
                }
                return "interactive_full_screen";
            }
            return "immersive_full_screen";
        }
        return "full_screen";
    }
}
