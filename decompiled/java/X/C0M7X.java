package X;

import com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService;
import com.ss.android.ugc.aweme.airemix.AIRemixFcpButtonConfigProvider;
import com.ss.android.ugc.aweme.feed.model.AIRemixInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;

/* JADX INFO: renamed from: X.0M7X, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M7X implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final /* synthetic */ AIRemixFcpButtonConfigProvider LL;

    public C0M7X(AIRemixFcpButtonConfigProvider aIRemixFcpButtonConfigProvider) {
        this.LL = aIRemixFcpButtonConfigProvider;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        Aweme aweme;
        String firstGid;
        String gamePlay;
        String firstGid2;
        String gamePlay2;
        VideoItemParams videoItemParams2 = videoItemParams;
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null) {
            String str = videoItemParams2.mEventType;
            if (str == null) {
                str = "";
            }
            this.LL.getClass();
            boolean zLIZ = C0SP9.LIZ(aweme);
            IAIRemixEntranceMobService.LIZ.getClass();
            IAIRemixEntranceMobService iAIRemixEntranceMobServiceLIZ = C0M73.LIZ();
            C0M70 c0m70 = C0M70.REMIX_ORIGINAL_PAGE;
            String mobName = c0m70.getMobName();
            String aid = aweme.getAid();
            AIRemixInfo aIRemixInfo = aweme.aiRemixInfo;
            if (aIRemixInfo != null) {
                firstGid = aIRemixInfo.getFirstGid();
            } else {
                firstGid = null;
            }
            AIRemixInfo aIRemixInfo2 = aweme.aiRemixInfo;
            if (aIRemixInfo2 != null) {
                gamePlay = aIRemixInfo2.getGamePlay();
            } else {
                gamePlay = null;
            }
            aweme.getAwemeType();
            iAIRemixEntranceMobServiceLIZ.LJIIL(str, zLIZ, mobName, aid, firstGid, gamePlay, aweme);
            String mobName2 = c0m70.getMobName();
            String aid2 = aweme.getAid();
            AIRemixInfo aIRemixInfo3 = aweme.aiRemixInfo;
            if (aIRemixInfo3 != null) {
                firstGid2 = aIRemixInfo3.getFirstGid();
            } else {
                firstGid2 = null;
            }
            AIRemixInfo aIRemixInfo4 = aweme.aiRemixInfo;
            if (aIRemixInfo4 != null) {
                gamePlay2 = aIRemixInfo4.getGamePlay();
            } else {
                gamePlay2 = null;
            }
            aweme.getAwemeType();
            iAIRemixEntranceMobServiceLIZ.LJFF(str, zLIZ, mobName2, aid2, firstGid2, gamePlay2, aweme);
            return new C1387205bq(null);
        }
        return new C1387205bq(null);
    }
}
