package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.services.external.IAILiveServiceKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694880RNm {
    public static boolean LIZ() {
        IAILiveService aILiveService;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        return (iExternalService == null || (aILiveService = iExternalService.getAILiveService()) == null || !aILiveService.isStoryAILiveEnable()) ? false : true;
    }

    public static boolean LIZIZ(VideoItemParams videoItemParams) {
        List<AnchorCommonStruct> anchors;
        String uid;
        IAILiveService aiLiveService;
        if (LIZ()) {
            Aweme aweme = videoItemParams.getAweme();
            if (LIZ() && (anchors = aweme.getAnchors()) != null) {
                Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next().getType() == 97) {
                        String uid2 = aweme.getAuthor().getUid();
                        User userLIZ = C10EU.LIZ();
                        if (userLIZ != null) {
                            uid = userLIZ.getUid();
                        } else {
                            uid = null;
                        }
                        if (Intrinsics.LJFF(uid2, uid) || !C729510SjV.LJJIJIL(aweme) || ((aiLiveService = IAILiveServiceKt.getAiLiveService()) != null && aiLiveService.forbidAnchor())) {
                            break;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
