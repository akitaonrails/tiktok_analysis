package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.EcosystemPerceptionInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0cJe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1007160cJe {
    public static final boolean LIZ(Aweme aweme) {
        List<EcosystemPerceptionInfo> ecosystemPerceptionInfos;
        if (aweme == null || (ecosystemPerceptionInfos = aweme.getEcosystemPerceptionInfos()) == null || ecosystemPerceptionInfos.isEmpty()) {
            return false;
        }
        for (EcosystemPerceptionInfo ecosystemPerceptionInfo : ecosystemPerceptionInfos) {
            EcosystemPerceptionInfo.PenaltySourceEnum penaltySource = ecosystemPerceptionInfo.getPenaltySource();
            EcosystemPerceptionInfo.PenaltyResultEnum penaltyResult = ecosystemPerceptionInfo.getPenaltyResult();
            if (penaltySource == EcosystemPerceptionInfo.PenaltySourceEnum.TNS || penaltySource == EcosystemPerceptionInfo.PenaltySourceEnum.FQ) {
                if (penaltyResult == EcosystemPerceptionInfo.PenaltyResultEnum.NOT_FOR_FEED || penaltyResult == EcosystemPerceptionInfo.PenaltyResultEnum.NOT_RECOMMENDED) {
                    return true;
                }
            }
        }
        return false;
    }
}
