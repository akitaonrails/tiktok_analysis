package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.common.model.IMGiphyInfo;
import com.ss.android.ugc.aweme.im.common.model.IMTypingRecommendationImageInfo;
import com.ss.android.ugc.aweme.im.common.model.IMTypingRecommendationStickerInfo;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0HqV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453570HqV {
    public static final String LIZIZ(int i) {
        if (i == 1) {
            return "giphy";
        }
        if (i == 2) {
            return "tenor";
        }
        if (i == 3) {
            return "ai_sticker";
        }
        if (i != 4) {
            return null;
        }
        return "aimoji";
    }

    public static final Map<String, String> LIZ(IMGiphyInfo iMGiphyInfo) {
        String str;
        String string;
        Long l;
        int source = iMGiphyInfo.getSource();
        if (source != 0 && source != 1) {
            if (source != 2) {
                if (source != 3) {
                    if (source != 4) {
                        return null;
                    }
                    str = "aimoji";
                } else {
                    str = "ai_sticker";
                }
            } else {
                str = "tenor";
            }
        } else {
            str = "giphy";
        }
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("a:src", str));
        IMTypingRecommendationStickerInfo typingRecommendationStickerInfo = iMGiphyInfo.getTypingRecommendationStickerInfo();
        if (typingRecommendationStickerInfo == null || (l = typingRecommendationStickerInfo.stickerIdLong) == null || (string = l.toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        mapLJIIJ.put("a:int_sticker_id", string);
        return mapLJIIJ;
    }

    public static final IMGiphyInfo LIZJ(IMTypingRecommendationStickerInfo iMTypingRecommendationStickerInfo) {
        String str;
        Integer num;
        Integer num2;
        int iIntValue;
        String str2 = iMTypingRecommendationStickerInfo.stickerId;
        IMTypingRecommendationImageInfo iMTypingRecommendationImageInfo = iMTypingRecommendationStickerInfo.normalImage;
        String str3 = null;
        if (iMTypingRecommendationImageInfo != null) {
            str = iMTypingRecommendationImageInfo.url;
            num = iMTypingRecommendationImageInfo.width;
            num2 = iMTypingRecommendationImageInfo.height;
        } else {
            str = null;
            num = null;
            num2 = null;
        }
        String str4 = iMTypingRecommendationStickerInfo.title;
        if (iMTypingRecommendationImageInfo != null) {
            str3 = iMTypingRecommendationImageInfo.type;
        }
        Integer num3 = iMTypingRecommendationStickerInfo.stickerType;
        if (num3 != null) {
            iIntValue = num3.intValue();
        } else {
            iIntValue = 0;
        }
        return new IMGiphyInfo(str2, str, num, num2, str3, str4, false, iIntValue, iMTypingRecommendationStickerInfo);
    }
}
