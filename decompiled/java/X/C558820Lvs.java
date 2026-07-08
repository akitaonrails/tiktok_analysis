package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.ailive.ProgressModel;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.creative.model.edit.EditModel;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Lvs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558820Lvs extends C0MC8 {
    public static final int LLJ = 8;
    public final NLEEditor LLILZLL;
    public final AwemeDraft LLIZ;
    public final String LLIZLLLIL;

    @Override // X.C0MC8, X.InterfaceC558740Lvk
    public String getTag() {
        return this.LLIZLLLIL;
    }

    private final boolean LJI(C0LSZ c0lsz) {
        AIGCInfo aigcInfo;
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        List<EditVideoSegment> videoList2;
        EditVideoSegment editVideoSegment2;
        AILivePhotoModel aILivePhotoModel = this.LLIZ.LIZ.aiLivePhotoModel;
        aILivePhotoModel.lastFailProgressModel = null;
        aILivePhotoModel.progressModel = C545800Las.LIZ(aILivePhotoModel, UsageStatus.SUCCESS_APPLY, c0lsz);
        AwemeDraft awemeDraft = this.LLIZ;
        CreativeModel creativeModel = awemeDraft.LIZ;
        AILivePhotoModel aILivePhotoModel2 = creativeModel.aiLivePhotoModel;
        aILivePhotoModel2.lastStatus = null;
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJIZL;
        CanvasVideoData canvasVideoData = aVDraftExtras.canvasVideoData;
        if (canvasVideoData != null) {
            aigcInfo = canvasVideoData.aigcInfo;
            aILivePhotoModel2.originCanvasVideoData = canvasVideoData;
            creativeModel.canvasVideoData = null;
            aVDraftExtras.canvasVideoData = null;
        } else {
            EditPreviewInfo editPreviewInfo = creativeModel.editModel.editPreviewInfo;
            if (editPreviewInfo != null && (videoList = editPreviewInfo.getVideoList()) != null && (editVideoSegment = (EditVideoSegment) C13LP.LJJJLL(videoList)) != null) {
                aigcInfo = editVideoSegment.getAigcInfo();
            } else {
                aigcInfo = null;
            }
        }
        CreativeModel creativeModel2 = this.LLIZ.LIZ;
        if (creativeModel2.livePhotoModel != null) {
            new AwS587S0100000_8(this, 334).invoke(creativeModel2.aiLivePhotoModel.restoreData);
            this.LLIZ.LIZ.livePhotoModel = null;
        }
        AwemeDraft awemeDraft2 = this.LLIZ;
        CreativeModel creativeModel3 = awemeDraft2.LIZ;
        creativeModel3.importModel.isFastImport = true;
        AVDraftExtras aVDraftExtras2 = awemeDraft2.LJJJJIZL;
        aVDraftExtras2.isFastImport = true;
        aVDraftExtras2.creationMode = 1;
        C0MCR c0mcr = C0MCR.LIZ;
        NLEEditor nLEEditor = this.LLILZLL;
        c0mcr.getClass();
        C0MCR.LJIIIZ(nLEEditor, creativeModel3, true);
        EditPreviewInfo editPreviewInfo2 = this.LLIZ.LIZ.editModel.editPreviewInfo;
        if (editPreviewInfo2 != null && (videoList2 = editPreviewInfo2.getVideoList()) != null && (editVideoSegment2 = (EditVideoSegment) C13LP.LJJJLL(videoList2)) != null) {
            editVideoSegment2.setAigcInfo(aigcInfo);
        }
        C0MCR.LJIIJ(this.LLILZLL, this.LLIZ.LIZ);
        NLETrack mainTrack = this.LLILZLL.getModel().getMainTrack();
        if (mainTrack == null) {
            return false;
        }
        EditPreviewInfo editPreviewInfo3 = this.LLIZ.LIZ.editModel.editPreviewInfo;
        if (editPreviewInfo3 != null) {
            editPreviewInfo3.setPreviewVideoLength(((int) mainTrack.getMaxEnd()) / LSPassThroughRecordSizeConfig.DEFAULT);
        }
        AwemeDraft awemeDraft3 = this.LLIZ;
        EditModel editModel = awemeDraft3.LIZ.editModel;
        EditPreviewInfo editPreviewInfo4 = editModel.editPreviewInfo;
        AVDraftExtras aVDraftExtras3 = awemeDraft3.LJJJJIZL;
        aVDraftExtras3.previewInfo = editPreviewInfo4;
        aVDraftExtras3.multiEditVideoData = editModel.multiEditVideoStatusRecordData;
        return true;
    }

    public final void LJII(C0LSZ c0lsz) {
        ew1(getTag(), false);
        F30(this.LLIZ.LIZ, c0lsz);
        LJI(c0lsz);
        C559010LwB.LIZIZ(getTag(), "updateFinish");
        Qy(true, null, getTag(), false);
    }

    public C558820Lvs(NLEEditor nLEEditor, AwemeDraft awemeDraft) {
        super(nLEEditor);
        this.LLILZLL = nLEEditor;
        this.LLIZ = awemeDraft;
        this.LLIZLLLIL = "AILiveDataManagerForDraft";
    }

    public final void LJIIIIZZ(CreativeModel creativeModel, C0LSZ c0lsz) {
        AILivePhotoModel aILivePhotoModel = creativeModel.aiLivePhotoModel;
        long j = aILivePhotoModel.LIZIZ().remainTime;
        long jLIZIZ = C545800Las.LIZIZ(c0lsz.LJII, c0lsz.LJIL, "STARTED");
        if (jLIZIZ > 0 && (j == 0 || j >= jLIZIZ)) {
            j = jLIZIZ;
        }
        aILivePhotoModel.progressModel = ProgressModel.LIZ(aILivePhotoModel.LIZIZ(), null, c0lsz.LJII, j, 15295);
    }
}
