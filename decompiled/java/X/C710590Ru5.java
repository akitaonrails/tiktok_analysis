package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.CustomBizInfo;
import com.ss.android.ugc.aweme.feed.model.HighQualityBoostInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ru5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710590Ru5 {
    public static final boolean LIZ(Aweme aweme) {
        ContentModel contentModel;
        CustomBizInfo customBizInfo;
        HighQualityBoostInfo highQualityBoostInfo;
        String str;
        String str2;
        String aid = aweme.getAid();
        if (aid == null) {
            return false;
        }
        Keva keva = C710620Ru8.LIZIZ.getValue().LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("feed_bottom_banner_enable_show_");
        sbLIZ.append(aid);
        boolean z = keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "photo_mode_enable_high_quality_feed_bottom_banner", true, false) || !C729980SkG.LJIIIIZZ(aweme) || !AwemeExtKt.isPhotoMode(aweme) || !z || (contentModel = aweme.getContentModel()) == null || (customBizInfo = contentModel.customBizInfo) == null || (highQualityBoostInfo = customBizInfo.highQualityBoostInfo) == null || Intrinsics.LJFF(highQualityBoostInfo.isHighQualityPost(), Boolean.FALSE) || (str = highQualityBoostInfo.description) == null || str.length() == 0 || (str2 = highQualityBoostInfo.link) == null || str2.length() == 0) {
            return false;
        }
        return true;
    }
}
