package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fLK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1123520fLK {
    public static volatile boolean LIZ;

    public static boolean LIZ(GiftGuideMessage giftGuideMessage) {
        if (!Intrinsics.LJFF(giftGuideMessage.guideType, EnumC1123470fLF.GIFT_GUIDE_ACTIVITY_EOY_VOTE_FIRST_TIME_BUBBLE.getValue()) && !Intrinsics.LJFF(giftGuideMessage.guideType, EnumC1123470fLF.GIFT_GUIDE_ACTIVITY_EOY_VOTE_ONCE_AGAIN_BUBBLE.getValue())) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(Gift gift) {
        Boolean boolValueOf;
        GiftLockInfo giftLockInfo = gift.giftSubInfo;
        if (giftLockInfo != null) {
            boolValueOf = Boolean.valueOf(giftLockInfo.mLock);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            return false;
        }
        C1124730fNH.LIZIZ();
        if (C500260Jjc.LJJJI(null) || !gift.isDisplayedOnPanel) {
            return false;
        }
        return true;
    }
}
