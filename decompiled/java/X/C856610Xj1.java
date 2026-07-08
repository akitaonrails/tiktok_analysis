package X;

import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.tangram.TangramPersistenceModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xj1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856610Xj1 {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        String str2;
        List<String> customizedStatement;
        TangramPersistenceModel tangramPersistenceModel;
        Map<String, String> map;
        if (videoPublishEditModel == null) {
            return true;
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel == null || (tangramPersistenceModel = creativeModel.tangramPersistenceModel) == null || (map = tangramPersistenceModel.extraMap) == null || (str = map.get("videoType")) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (Intrinsics.LJFF(str, "1")) {
            return true;
        }
        Mission mission = videoPublishEditModel.creativeModel.commerceModel.getMission();
        if (mission != null && (customizedStatement = mission.getCustomizedStatement()) != null && C13LP.LJJJLL(customizedStatement) != null) {
            return true;
        }
        CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
        boolean z = false;
        if (creativeModel2.draftInfoModel.isDraft && ((str2 = creativeModel2.postPageModel.captionModel.markupText) == null || str2.length() == 0)) {
            z = true;
        }
        return !z;
    }
}
