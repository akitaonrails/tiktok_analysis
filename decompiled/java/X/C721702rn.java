package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.StandardButtonContainerStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.02rn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C721702rn extends C09AY implements Function0<ClientStandardModel> {
    public final /* synthetic */ InterfaceC700020Rd2<VideoItemParams> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C721702rn(C0RYN c0ryn) {
        super(0);
        this.LL = c0ryn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ClientStandardModel invoke() {
        Aweme aweme;
        StandardComponentInfo standardComponentInfo;
        StandardButtonContainerStruct standardButtonContainerStruct;
        VideoItemParams videoItemParamsLIZ = this.LL.LIZ();
        if (videoItemParamsLIZ == null || (aweme = videoItemParamsLIZ.getAweme()) == null || (standardComponentInfo = aweme.getStandardComponentInfo()) == null || (standardButtonContainerStruct = standardComponentInfo.buttonContainer) == null) {
            return null;
        }
        return C721202ri.LIZ(standardButtonContainerStruct.buttons);
    }
}
