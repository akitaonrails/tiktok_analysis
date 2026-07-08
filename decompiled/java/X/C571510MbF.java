package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditorModel;
import dmt.av.video.VEPreviewParams;

/* JADX INFO: renamed from: X.0MbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571510MbF {
    public static final VEPreviewParams LIZ(C1DRG c1drg, VideoPublishEditModel videoPublishEditModel) {
        int iLIZIZ;
        VEEditorModel vEEditorModel;
        boolean z;
        VEEditorModel vEEditorModel2;
        int iLIZ = -1;
        if (((Boolean) C0ANH.LIZ.getValue()).booleanValue()) {
            iLIZIZ = -1;
        } else if (videoPublishEditModel.isUploadVideo()) {
            iLIZIZ = C310640CFq.LIZIZ(videoPublishEditModel.videoFps(false));
        } else {
            iLIZIZ = 30;
        }
        if (videoPublishEditModel.getCanvasVideoData() != null) {
            iLIZ = C571520MbG.LIZ(videoPublishEditModel.getCanvasVideoData());
        }
        VEPreviewParams vEPreviewParamsLJI = C571500MbE.LJI(videoPublishEditModel, 1, iLIZIZ, iLIZ);
        Activity activity = (Activity) c1drg.LJII(C19EG.class, null);
        if (C20622515mp.LJ((Scene) c1drg.LJII(AbstractC214814194y.class, null)) != null) {
            Bundle argumentsSafely = ((AbstractC1447660nm8) c1drg.LJII(AbstractC214814194y.class, null)).getArgumentsSafely();
            if (argumentsSafely != null) {
                vEEditorModel2 = (VEEditorModel) argumentsSafely.getParcelable("extra_editor_model");
            } else {
                vEEditorModel2 = null;
            }
            vEPreviewParamsLJI.setEditorModel(vEEditorModel2);
        } else {
            Intent intent = activity.getIntent();
            if (intent != null) {
                vEEditorModel = (VEEditorModel) intent.getParcelableExtra("extra_editor_model");
            } else {
                vEEditorModel = null;
            }
            vEPreviewParamsLJI.setEditorModel(vEEditorModel);
        }
        vEPreviewParamsLJI.setEditorHandler(-1L);
        AbstractC1437870nWL abstractC1437870nWLLIZ = C1439360nYk.LIZ(videoPublishEditModel);
        vEPreviewParamsLJI.mCanvasWidth = abstractC1437870nWLLIZ.LJFF();
        vEPreviewParamsLJI.mCanvasHeight = abstractC1437870nWLLIZ.LIZJ();
        vEPreviewParamsLJI.setVeAudioRecordParam(videoPublishEditModel.getVeAudioRecorderParam());
        if (videoPublishEditModel.getVeAudioEffectParam() != null) {
            vEPreviewParamsLJI.setVeAudioEffectParam(videoPublishEditModel.getVeAudioEffectParam());
        }
        if (videoPublishEditModel.isLivePhotoEdit() && !videoPublishEditModel.creativeModel.draftInfoModel.isDraft) {
            vEPreviewParamsLJI.mVolume = 0.0f;
        }
        C1447390nlh.LIZ(vEPreviewParamsLJI);
        vEPreviewParamsLJI.mPageMode = 100;
        vEPreviewParamsLJI.isFormRecord = !videoPublishEditModel.isUploadVideo();
        if (c1drg.LJIIL(null, InterfaceC1452360nti.class) != null && c1drg.LJIIL(null, VideoEditContainerScene.class) != null) {
            z = true;
        } else {
            z = false;
        }
        vEPreviewParamsLJI.setReuseSurfaceView(z);
        C01GW c01gw = C0ANI.LIZ;
        if (((Number) c01gw.getValue()).intValue() > 0) {
            vEPreviewParamsLJI.mPreviewMaxFPS = ((Number) c01gw.getValue()).intValue();
        }
        return vEPreviewParamsLJI;
    }
}
