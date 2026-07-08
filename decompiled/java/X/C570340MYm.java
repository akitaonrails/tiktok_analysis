package X;

import Y.ACallableS411S0100000_3;
import Y.ACallableS415S0100000_8;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0MYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570340MYm {
    public static final void LIZIZ(C570330MYl c570330MYl) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftDeleteOp, deleteCreativeDraftFile creativeInfo : ");
        sbLIZ.append(c570330MYl.LIZ.LIZIZ());
        sbLIZ.append(" , extraInfo : ");
        sbLIZ.append(c570330MYl.LIZIZ);
        sbLIZ.append('}');
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        CreativeInfo creativeInfoLIZIZ = c570330MYl.LIZ.LIZIZ();
        boolean z = c570330MYl.LIZJ;
        boolean z2 = c570330MYl.LIZLLL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("deleteFiles , creativeInfo : ");
        sbLIZ2.append(creativeInfoLIZIZ);
        sbLIZ2.append(" trace : ");
        sbLIZ2.append(Log.getStackTraceString(new RuntimeException()));
        C0M7L.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        try {
            C08QA.LJIIZILJ(new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZIZ(creativeInfoLIZIZ.copy(creativeInfoLIZIZ.creationId, -1, creativeInfoLIZIZ.sessionId))));
            if (z) {
                C08QA.LJIIZILJ(new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJII(creativeInfoLIZIZ)));
            }
            if (z2) {
                C08QA.LJIIZILJ(new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZLLL(creativeInfoLIZIZ)));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void LIZJ(C570330MYl c570330MYl) {
        BackgroundVideo backgroundVideo;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        String audioUrl;
        String draftDir;
        boolean zLJJIIZI;
        String draftDir2;
        String draftDir3;
        File externalCacheDir;
        List<EditVideoSegment> videoList;
        boolean z;
        String audioPath;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftDeleteOp, deleteOldDraftFile creativeInfo : ");
        sbLIZ.append(c570330MYl.LIZ.LIZIZ());
        sbLIZ.append(" , extraInfo : ");
        sbLIZ.append(c570330MYl.LIZIZ);
        sbLIZ.append('}');
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        AwemeDraft awemeDraft = c570330MYl.LIZ;
        String audioUrl2 = null;
        if (!awemeDraft.LIZIZ) {
            VideoPublishEditModel videoPublishEditModelLIZLLL = C0CHQ.LIZ().LJII().LIZLLL(awemeDraft, new C0M2T(false, "removeRelatedFilesV1", null, 0, false, 30));
            if (!videoPublishEditModelLIZLLL.isFastImport()) {
                String persistentRoot = C0CHQ.LIZ().LJJIIJZLJL().getPathService().getPersistentRoot();
                EditPreviewInfo previewInfo = videoPublishEditModelLIZLLL.getPreviewInfo();
                if (previewInfo != null && (videoList = previewInfo.getVideoList()) != null) {
                    for (EditVideoSegment editVideoSegment : videoList) {
                        String videoPath = editVideoSegment.getVideoPath();
                        if (videoPath != null && !a0.LJJJIL(videoPath)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z && !a0.LJJIIZI(editVideoSegment.getVideoPath(), persistentRoot, false)) {
                            C2286708xd.LJIJ(editVideoSegment.getVideoPath());
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("[removePreviewRelatedFiles] removeFile = ");
                            sbLIZ2.append(editVideoSegment.getVideoPath());
                            C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        String audioPath2 = editVideoSegment.getAudioPath();
                        if (audioPath2 != null && !a0.LJJJIL(audioPath2) && ((audioPath = editVideoSegment.getAudioPath()) == null || !a0.LJJIIZI(audioPath, persistentRoot, false))) {
                            C2286708xd.LJIJ(editVideoSegment.getAudioPath());
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("[removePreviewRelatedFiles] removeFile = ");
                            sbLIZ3.append(editVideoSegment.getAudioPath());
                            C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("[removePreviewRelatedFiles] removeDir = ");
                sbLIZ4.append(videoPublishEditModelLIZLLL.draftDir());
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                C2286708xd.LJIILLIIL(new C0VSJ(videoPublishEditModelLIZLLL.draftDir()));
            }
            EditPreviewInfo previewInfo2 = videoPublishEditModelLIZLLL.getPreviewInfo();
            if (previewInfo2 != null && (draftDir = previewInfo2.getDraftDir()) != null) {
                try {
                    externalCacheDir = C0CHQ.LIZ.getExternalCacheDir();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (externalCacheDir != null) {
                    zLJJIIZI = a0.LJJIIZI(externalCacheDir.getAbsolutePath(), draftDir, false);
                } else {
                    zLJJIIZI = false;
                }
                if (a0.LJJIIZI(draftDir, C1449640npK.LIZ, false) || zLJJIIZI) {
                    EditPreviewInfo previewInfo3 = videoPublishEditModelLIZLLL.getPreviewInfo();
                    if (previewInfo3 != null) {
                        draftDir2 = previewInfo3.getDraftDir();
                    } else {
                        draftDir2 = null;
                    }
                    C2286708xd.LJIILLIIL(new C0VSJ(draftDir2));
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("[removePreviewRelatedFiles] removeDir fast import draftDir = ");
                    EditPreviewInfo previewInfo4 = videoPublishEditModelLIZLLL.getPreviewInfo();
                    if (previewInfo4 != null) {
                        draftDir3 = previewInfo4.getDraftDir();
                    } else {
                        draftDir3 = null;
                    }
                    sbLIZ5.append(draftDir3);
                    C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
                }
            }
            EditPreviewInfo previewInfo5 = videoPublishEditModelLIZLLL.getPreviewInfo();
            if (previewInfo5 != null) {
                String[] reverseVideoArray = previewInfo5.getReverseVideoArray();
                if (reverseVideoArray != null) {
                    for (String str : reverseVideoArray) {
                        C2286708xd.LJIJ(str);
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("[removeRelatedFiles] reverseVideoArray removeFile = ");
                        sbLIZ6.append(str);
                        C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
                    }
                }
                String[] reverseAudioArray = previewInfo5.getReverseAudioArray();
                if (reverseAudioArray != null) {
                    for (String str2 : reverseAudioArray) {
                        C2286708xd.LJIJ(str2);
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("[removeRelatedFiles] reverseAudioArray removeFile = ");
                        sbLIZ7.append(str2);
                        C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ7));
                    }
                }
                String[] tempVideoArray = previewInfo5.getTempVideoArray();
                if (tempVideoArray != null) {
                    for (String str3 : tempVideoArray) {
                        C2286708xd.LJIJ(str3);
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("[removeRelatedFiles] tempVideoArray removeFile = ");
                        sbLIZ8.append(str3);
                        C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ8));
                    }
                }
            }
            List<EditVideoSegment> listLJFF = C0MZ9.LJFF(awemeDraft);
            if (listLJFF != null && !listLJFF.isEmpty()) {
                for (EditVideoSegment editVideoSegment2 : listLJFF) {
                    C2286708xd.LJIJ(editVideoSegment2.getVideoPath());
                    C2286708xd.LJIJ(editVideoSegment2.getAudioPath());
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("[removeRelatedFiles]: segment.videoPath = ");
                    sbLIZ9.append(editVideoSegment2.getVideoPath());
                    C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ9));
                }
            }
        }
        AudioRecorderParam audioRecorderParam = awemeDraft.LJJJJIZL.audioRecorderParam;
        if (audioRecorderParam != null && !TextUtils.isEmpty(audioRecorderParam.getAudioUrl())) {
            AudioRecorderParam audioRecorderParam2 = awemeDraft.LJJJJIZL.audioRecorderParam;
            if (audioRecorderParam2 != null) {
                audioUrl = audioRecorderParam2.getAudioUrl();
            } else {
                audioUrl = null;
            }
            C2286708xd.LJIJ(audioUrl);
            AudioRecorderParam audioRecorderParam3 = awemeDraft.LJJJJIZL.audioRecorderParam;
            if (audioRecorderParam3 != null) {
                audioUrl2 = audioRecorderParam3.getAudioUrl();
            }
            C2286708xd.LJIJ(audioUrl2);
        }
        InfoStickerModel infoStickerModelLJFF = awemeDraft.LJFF();
        if (infoStickerModelLJFF != null && !C086I.LIZIZ(infoStickerModelLJFF.stickers)) {
            for (StickerItemModel stickerItemModel : infoStickerModelLJFF.stickers) {
                if (stickerItemModel != null && stickerItemModel.isPin) {
                    C2286708xd.LJIJ(stickerItemModel.pinAlgorithmFile);
                }
            }
        }
        if (!TextUtils.isEmpty(awemeDraft.LJJIZ)) {
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append(C1449640npK.LIZJ);
            sbLIZ10.append("duet/");
            sbLIZ10.append(awemeDraft.LIZ());
            C2286708xd.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ10));
        }
        C1403010mc7.LIZ.LJIIIIZZ().LIZ().LIZJ(c570330MYl.LIZ);
        C15O7.LIZJ(new ACallableS411S0100000_3(c570330MYl.LIZ.LIZIZ(), 30));
        C15O7.LIZJ(new ACallableS415S0100000_8(c570330MYl.LIZ, 17));
        AwemeDraft awemeDraft2 = c570330MYl.LIZ;
        if (awemeDraft2 != null && awemeDraft2.LJIILLIIL()) {
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = awemeDraft2.LJJJJIZL.multiEditVideoData;
            if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
                Iterator<MultiEditVideoSegmentRecordData> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().videoPath, awemeDraft2.LJI())) {
                        break;
                    }
                }
                C15O7.LIZJ(new ACallableS411S0100000_3(awemeDraft2, 0));
            } else {
                C15O7.LIZJ(new ACallableS411S0100000_3(awemeDraft2, 0));
            }
        }
        C0MVS.LIZ(C0MVS.LIZIZ(c570330MYl.LIZ.LIZIZ()));
        for (TimeSpeedModelExtension timeSpeedModelExtension : CameraComponentModel.LJIIIIZZ(c570330MYl.LIZ.LJII())) {
            if (timeSpeedModelExtension != null && (backgroundVideo = timeSpeedModelExtension.getBackgroundVideo()) != null) {
                C0MZ5.LIZ(backgroundVideo.getVideoPath(), backgroundVideo.getAudioPath());
            }
        }
        String strLIZ = c570330MYl.LIZ.LIZ();
        ((Keva) C879460Yem.LIZIZ.getValue()).erase(strLIZ);
        ((Keva) C879460Yem.LIZ.getValue()).erase(strLIZ);
        if (!TextUtils.isEmpty(c570330MYl.LIZ.LJJIZ)) {
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append(C1449640npK.LIZJ);
            sbLIZ11.append("duet/");
            sbLIZ11.append(c570330MYl.LIZ.LIZ());
            C2286708xd.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ11));
        }
    }

    public static final Object LIZ(C570330MYl c570330MYl, InterfaceC1364105Vn<? super C545650Lad> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C570270MYf(c570330MYl, C0CHQ.LIZ().LJI().LIZJ().LJI(15), null));
    }
}
