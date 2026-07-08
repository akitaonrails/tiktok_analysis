package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.portrait.model.RefImageType;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService;
import com.ss.android.ugc.aweme.portrait.service.AIPortraitGeneration;
import com.ss.android.ugc.aweme.portrait.service.AIPortraitProfileParam;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Li5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550270Li5 implements AIPortraitEventService {
    public static final C550270Li5 LIZ = new C550270Li5();

    @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
    public final void reportEditProfileEntranceClick(AIPortraitProfileParam aIPortraitProfileParam) {
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
    public final void reportEditProfileEntranceShow(AIPortraitProfileParam aIPortraitProfileParam) {
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
    public final void reportEntranceClick(AIPortraitEnterParams aIPortraitEnterParams) {
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
    public final void reportEntranceShow(AIPortraitEnterParams aIPortraitEnterParams) {
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
    public final void reportShoot(String str, AIGCEntranceInfo aIGCEntranceInfo) {
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
    public final void reportTTCrtAIGenerationStart(AIPortraitGeneration aIPortraitGeneration) {
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
    public final void reportTTCrtCreateVideoPage(AIPortraitGeneration aIPortraitGeneration) {
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
    public final void reportTemplateDetailPageEnter(AIGCEntranceInfo aIGCEntranceInfo, String str, String str2, EnumC1419230n2H enumC1419230n2H, EnumC570120MXq enumC570120MXq, EnumC570120MXq enumC570120MXq2, RefImageType refImageType, EnumC550430LiL enumC550430LiL, Integer num, String str3) {
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.AIPortraitEventService
    public final Pair<String, Map<String, String>> buildGenerationStartMob(AIPortraitGeneration aIPortraitGeneration) {
        return new Pair<>("", C2097608Jq.LJ());
    }
}
