package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagContainerStruct;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.02w5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C748302w5 extends C09AY implements Function0<ClientStandardModel> {
    public final /* synthetic */ InterfaceC700020Rd2<VideoItemParams> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C748302w5(C0RYN c0ryn) {
        super(0);
        this.LL = c0ryn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ClientStandardModel invoke() {
        VideoItemParams videoItemParamsLIZ;
        Aweme aweme;
        StandardComponentInfo standardComponentInfo;
        StandardTagContainerStruct standardTagContainerStruct;
        if (!C748402w6.LIZ() || (videoItemParamsLIZ = this.LL.LIZ()) == null || (aweme = videoItemParamsLIZ.getAweme()) == null || (standardComponentInfo = aweme.getStandardComponentInfo()) == null || (standardTagContainerStruct = standardComponentInfo.highTag) == null) {
            return null;
        }
        return C721102rh.LIZ(standardTagContainerStruct);
    }
}
