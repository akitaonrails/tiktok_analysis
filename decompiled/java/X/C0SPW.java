package X;

import com.ss.android.ugc.aweme.aigc.IAIInfoPanelService;
import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SPW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SPW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoItemParams LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SPW(VideoItemParams videoItemParams) {
        super(0);
        this.LL = videoItemParams;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Map<String, String> c2PAMobParamFromAweme = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().parseC2PAMobParamFromAweme(this.LL.getAweme());
        IAIInfoPanelService iAIInfoPanelService = (IAIInfoPanelService) ServiceManager.get().getService(IAIInfoPanelService.class);
        VideoItemParams videoItemParams = this.LL;
        C720800SPe c720800SPeLIZIZ = iAIInfoPanelService.LIZIZ(videoItemParams != null ? videoItemParams.getAweme() : null);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LL.mEventType);
        c2344009Gk.LJII(c2PAMobParamFromAweme);
        AIGCInfo aIGCInfo = this.LL.getAweme().aigcInfo;
        c2344009Gk.LJ(aIGCInfo != null ? Integer.valueOf(aIGCInfo.getAIGCLabelType()) : null, "aigc_label_type");
        c2344009Gk.LJIIIIZZ("aigc_creation_channel", C0SD6.LIZ() ? c720800SPeLIZIZ != null ? c720800SPeLIZIZ.LJI : null : "");
        c2344009Gk.LJ(c720800SPeLIZIZ != null ? c720800SPeLIZIZ.LJII : null, "moderation_aigc_label_type");
        c2344009Gk.LJIIIIZZ("is_creator_overlabel", C0SD5.LIZLLL(this.LL.getAweme()) ? "1" : CardStruct.IStatusCode.DEFAULT);
        c2344009Gk.LJ(c720800SPeLIZIZ != null ? c720800SPeLIZIZ.LJIIIIZZ : null, "fingerprint_id");
        c2344009Gk.LJ(c720800SPeLIZIZ != null ? c720800SPeLIZIZ.LJIIIZ : null, "invisible_watermark");
        C20684815ws.LJIILLIIL("view_creator_label_aigc", c2344009Gk.LIZ);
        return Unit.LIZ;
    }
}
