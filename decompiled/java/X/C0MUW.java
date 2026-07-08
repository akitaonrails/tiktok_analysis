package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.CheckPointModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MUW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MUW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0MV0 LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MUW(C0MV0 c0mv0, VideoPublishEditModel videoPublishEditModel, String str, int i) {
        super(0);
        this.LL = c0mv0;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = str;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CreativeModel creativeModel;
        DraftInfoModel draftInfoModel;
        CreativeModel creativeModel2;
        CheckPointModel checkPointModel;
        C0MV0 c0mv0 = this.LL;
        VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
        String str = this.LLILLL;
        int i = this.LLILZ;
        c0mv0.getClass();
        if (!C0CHQ.LIZ().getAccountService().LIZ()) {
            ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("saveCheckPointForDraft creationId: ");
            sbLIZ.append(str);
            sbLIZ.append(" start.");
            C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (videoPublishEditModel == null || (creativeModel2 = videoPublishEditModel.creativeModel) == null || (checkPointModel = creativeModel2.checkPointModel) == null || checkPointModel.enableCheckPoint) {
                boolean z = !C0MUV.LIZIZ();
                boolean z2 = (videoPublishEditModel == null || c0mv0.LJIIIZ(videoPublishEditModel)) ? false : true;
                if (z || z2) {
                    C1439190nYT.LIZLLL(3);
                } else {
                    C1439190nYT.LIZLLL(i);
                    Keva.getRepo("publish").storeString("checkpoint_editing_draft_id", str);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("saveCheckPointForDraft: scene=");
                    sbLIZ2.append(C0MV0.LJIJJ(i));
                    sbLIZ2.append(", editingDraftId=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", modelCreationId=");
                    sbLIZ2.append(videoPublishEditModel != null ? videoPublishEditModel.getCreationId() : null);
                    sbLIZ2.append(", modelIsDraft=");
                    sbLIZ2.append((videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (draftInfoModel = creativeModel.draftInfoModel) == null) ? null : Boolean.valueOf(draftInfoModel.isDraft));
                    sbLIZ2.append(", modelPublishStage=");
                    sbLIZ2.append(videoPublishEditModel != null ? Integer.valueOf(videoPublishEditModel.getPublishStage()) : null);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        }
        return Unit.LIZ;
    }
}
