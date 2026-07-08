package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.im.AwemeMixStickerElement;
import com.ss.android.ugc.aweme.feed.model.im.MixStickerInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453800Hqs {
    public static final boolean LIZ(Aweme aweme) {
        if (aweme != null && LIZIZ(aweme) && C441280HSc.LIZ() && !Intrinsics.LJFF(AwemeExtKt.getAuthorUid(aweme), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            if (aweme.getIsTikTokStory() || aweme.getAwemeType() == 40) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        MixStickerInfo mixStickerInfo;
        List<String> stickerUrls;
        Integer num;
        Integer num2;
        if (aweme == null || (mixStickerInfo = aweme.mixStickerInfo) == null) {
            return false;
        }
        AwemeMixStickerElement awemeMixStickerElement = (AwemeMixStickerElement) C13LP.LJJJLL(mixStickerInfo.getElements());
        if ((awemeMixStickerElement != null && (num2 = awemeMixStickerElement.type) != null && num2.intValue() == 4) || (awemeMixStickerElement != null && (num = awemeMixStickerElement.type) != null && num.intValue() == 5)) {
            if (mixStickerInfo.getStickerUrls() == null || !(!r0.isEmpty()) || awemeMixStickerElement.data == null || awemeMixStickerElement.url == null || awemeMixStickerElement.id == null) {
                return false;
            }
        } else {
            Integer type = mixStickerInfo.getType();
            if (type != null && type.intValue() == 0) {
                return false;
            }
            Integer type2 = mixStickerInfo.getType();
            if (type2 != null && type2.intValue() == 4) {
                return false;
            }
            Integer type3 = mixStickerInfo.getType();
            if ((type3 != null && type3.intValue() == 5) || mixStickerInfo.getData() == null || (stickerUrls = mixStickerInfo.getStickerUrls()) == null || !(!stickerUrls.isEmpty())) {
                return false;
            }
        }
        return true;
    }
}
