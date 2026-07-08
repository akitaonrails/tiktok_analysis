package X;

import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterAiPdpActionModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterAiPdpJumpDataModel;
import com.ss.android.ugc.aweme.feed.model.ad.AiPdpActionModel;
import com.ss.android.ugc.aweme.feed.model.ad.AiPdpJumpDataModel;
import java.util.List;

/* JADX INFO: renamed from: X.0cnJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025550cnJ {
    public static final CRouterAiPdpActionModel LIZ(AiPdpActionModel aiPdpActionModel) {
        String lynxSchema;
        List<String> geckoChannel;
        AiPdpJumpDataModel jumpData = aiPdpActionModel.getJumpData();
        Object frontendData = null;
        if (jumpData != null) {
            lynxSchema = jumpData.getLynxSchema();
        } else {
            lynxSchema = null;
        }
        AiPdpJumpDataModel jumpData2 = aiPdpActionModel.getJumpData();
        if (jumpData2 != null) {
            geckoChannel = jumpData2.getGeckoChannel();
        } else {
            geckoChannel = null;
        }
        AiPdpJumpDataModel jumpData3 = aiPdpActionModel.getJumpData();
        if (jumpData3 != null) {
            frontendData = jumpData3.getFrontendData();
        }
        return new CRouterAiPdpActionModel(new CRouterAiPdpJumpDataModel(lynxSchema, geckoChannel, frontendData));
    }
}
