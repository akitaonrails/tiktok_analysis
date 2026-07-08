package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import webcast.data.oec_msg.ExtendAuctionCfg;

/* JADX INFO: renamed from: X.11yC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19673811yC {
    public static final String LIZ(int i) {
        if (i == 1) {
            return "live_auction_not_start";
        }
        if (i == 10) {
            return "live_auction_going";
        }
        if (i == 20) {
            return "live_auction_end";
        }
        switch (i) {
            case 30:
            case 31:
            case 32:
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return "live_auction_end";
            default:
                return "unknown";
        }
    }

    public static final String LIZIZ(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "unknown" : "live_temporary_listing" : "live_surprise_set_auction" : "live_normal_auction";
    }

    public static final String LIZJ(ExtendAuctionCfg extendAuctionCfg) {
        if (extendAuctionCfg != null && extendAuctionCfg.isExtendAuctionSupported) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }
}
