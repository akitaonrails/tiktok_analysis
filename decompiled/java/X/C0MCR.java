package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AIAliveRestoreData;
import com.ss.android.ugc.aweme.creative.model.ailive.ProgressModel;
import com.ss.android.ugc.aweme.creative.model.ailive.TransitionModel;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.creative.model.album.AlbumModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.info.InfoStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.MemeSongTextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0MCR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MCR {
    public static final C0MCR LIZ = new C0MCR();

    public static NLETrackSlot LIZIZ(NLEModel nLEModel, CreativeModel creativeModel) {
        String str;
        Pair pairLJ = LJ(nLEModel, creativeModel);
        if (pairLJ != null && (str = (String) pairLJ.getFirst()) != null) {
            C0MCR c0mcr = LIZ;
            AIGCInfo aIGCInfo = (AIGCInfo) pairLJ.getSecond();
            c0mcr.getClass();
            return LIZJ(str, 0L, aIGCInfo);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x011c A[PHI: r5
      0x011c: PHI (r5v1 float) = (r5v0 float), (r5v2 float) binds: [B:62:0x0106, B:64:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.bytedance.ies.nle.editor_jni.NLETrackSlot r11, com.bytedance.ies.nle.editor_jni.NLETrackSlot r12) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MCR.LIZLLL(com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }

    public static Pair LJ(NLEModel nLEModel, CreativeModel creativeModel) {
        List<MultiEditVideoSegmentRecordData> list;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot nLETrackSlot;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLEResourceNode resource;
        String resourceFile;
        ImportVideoInfo importVideoInfo;
        String realImportPath;
        Object objLJJJLZIJ;
        MultiEditVideoSegmentRecordData next;
        MultiEditVideoRecordData multiEditVideoRecordData;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_fix_image_mode_path", true, true) && creativeModel.creationTypeModel.creationMode == 2 && (imageAlbumData = creativeModel.imageAlbumModel) != null && (imageList = imageAlbumData.getImageList()) != null && (singleImageData = (SingleImageData) C13LP.LJJJLL(imageList)) != null) {
            return new Pair(singleImageData.getSrcImageInfo().getPath(), singleImageData.getAigcInfo());
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = creativeModel.editModel.multiEditVideoStatusRecordData;
        if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null) {
            list = multiEditVideoRecordData.segmentDataList;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            Iterator<MultiEditVideoSegmentRecordData> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.videoPath != null) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = next;
            if (multiEditVideoSegmentRecordData == null) {
                return null;
            }
            return new Pair(multiEditVideoSegmentRecordData.videoPath, multiEditVideoSegmentRecordData.aigcInfo);
        }
        CanvasVideoData canvasVideoData = creativeModel.canvasVideoData;
        if (canvasVideoData != null) {
            List<String> list2 = canvasVideoData.sourceInfo;
            if (list2 == null || (objLJJJLZIJ = C13LP.LJJJLZIJ(0, list2)) == null) {
                return null;
            }
            return new Pair(objLJJJLZIJ, canvasVideoData.aigcInfo);
        }
        if (creativeModel.albumModel.importInfoList != null && (!r0.isEmpty())) {
            ArrayList<ImportVideoInfo> arrayList = creativeModel.albumModel.importInfoList;
            if (arrayList == null || (importVideoInfo = (ImportVideoInfo) C13LP.LJJJLL(arrayList)) == null || (realImportPath = importVideoInfo.getRealImportPath()) == null) {
                return null;
            }
            return new Pair(realImportPath, importVideoInfo.getAigcInfo());
        }
        if (nLEModel == null || (mainTrack = nLEModel.getMainTrack()) == null || (sortedSlots = mainTrack.getSortedSlots()) == null || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(sortedSlots)) == null || (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) == null || (resource = nLESegmentVideoDynamicCast.getResource()) == null || (resourceFile = resource.getResourceFile()) == null) {
            return null;
        }
        return new Pair(resourceFile, null);
    }

    public static String LJFF(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        String str;
        C0MCR c0mcr = LIZ;
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        c0mcr.getClass();
        Pair pairLJ = LJ(nLEModel, creativeModel);
        if (pairLJ == null || (str = (String) pairLJ.getFirst()) == null) {
            return "";
        }
        return str;
    }

    public static void LJII(NLEEditor nLEEditor, VideoPublishEditModel videoPublishEditModel) {
        AIGCInfo aigcInfo;
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        AudioRecorderParam veAudioRecorderParam;
        EditVideoSegment editVideoSegment2;
        ArrayList arrayList;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        AIAliveRestoreData aIAliveRestoreData = videoPublishEditModel.getAILivePhotoModel().restoreData;
        if (videoPublishEditModel.getCanvasVideoData() != null) {
            CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
            if (canvasVideoData != null) {
                aigcInfo = canvasVideoData.aigcInfo;
            } else {
                aigcInfo = null;
            }
            videoPublishEditModel.getAILivePhotoModel().originCanvasVideoData = videoPublishEditModel.getCanvasVideoData();
            videoPublishEditModel.setCanvasVideoData(null);
            C559010LwB.LIZIZ("AILiveDataHelper", "updateEditModelIfFinish: is canvas");
        } else {
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            if (previewInfo != null && (videoList = previewInfo.getVideoList()) != null && (editVideoSegment = (EditVideoSegment) C13LP.LJJJLL(videoList)) != null) {
                aigcInfo = editVideoSegment.getAigcInfo();
            } else {
                aigcInfo = null;
            }
        }
        if (aIAliveRestoreData.recordData == null && videoPublishEditModel.getMultiEditVideoRecordData() != null) {
            MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData2 != null && (multiEditVideoRecordData = multiEditVideoRecordData2.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<MultiEditVideoSegmentRecordData> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().videoPath);
                }
            } else {
                arrayList = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateEditModelIfFinish: ");
            sbLIZ.append(arrayList);
            C559010LwB.LIZIZ("AILiveDataHelper", C2188811AlT.LIZIZ(sbLIZ));
            new AwS587S0100000_8(videoPublishEditModel, 332).invoke(videoPublishEditModel.getAILivePhotoModel().restoreData);
        }
        if (aIAliveRestoreData.livePhotoModel == null && videoPublishEditModel.isLivePhotoEdit()) {
            new AwS587S0100000_8(videoPublishEditModel, 333).invoke(videoPublishEditModel.getAILivePhotoModel().restoreData);
            videoPublishEditModel.creativeModel.livePhotoModel = null;
        }
        videoPublishEditModel.creativeModel.importModel.isFastImport = true;
        videoPublishEditModel.getAvetParameter().setContentType("video");
        videoPublishEditModel.setCreationMode(1);
        LJIIIZ(nLEEditor, videoPublishEditModel.creativeModel, true);
        List<EditVideoSegment> videoList2 = videoPublishEditModel.getPreviewInfo().getVideoList();
        if (videoList2 != null && (editVideoSegment2 = (EditVideoSegment) C13LP.LJJJLL(videoList2)) != null) {
            editVideoSegment2.setAigcInfo(aigcInfo);
        }
        if (C290630BaH.LIZ() && (veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam()) != null) {
            veAudioRecorderParam.setHasOriginalSound(videoPublishEditModel.realHasOriginalSound());
        }
    }

    public static void LJIIIIZZ(NLEEditor nLEEditor, VideoPublishEditModel videoPublishEditModel) {
        ArrayList arrayList;
        MultiEditVideoRecordData multiEditVideoRecordData;
        int previewWidth;
        int previewHeight;
        String[] reverseAudioArray;
        String[] reverseVideoArray;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        List<MultiEditVideoSegmentRecordData> list;
        List<String> list2;
        String str;
        videoPublishEditModel.getAILivePhotoModel().progressModel = ProgressModel.LIZ(videoPublishEditModel.getAILivePhotoModel().LIZIZ(), UsageStatus.SUCCESS_CANCEL, 0, 0L, 16382);
        videoPublishEditModel.getAILivePhotoModel().lastStatus = null;
        AIAliveRestoreData aIAliveRestoreData = videoPublishEditModel.getAILivePhotoModel().restoreData;
        CanvasVideoData canvasVideoData = videoPublishEditModel.getAILivePhotoModel().originCanvasVideoData;
        if (canvasVideoData != null) {
            C559010LwB.LIZIZ("AILiveDataHelper", "updateEditModelIfRemove: originCanvasData != null");
            videoPublishEditModel.setCanvasVideoData(canvasVideoData);
            videoPublishEditModel.getAILivePhotoModel().originCanvasVideoData = null;
            videoPublishEditModel.getAvetParameter().setContentType("photo_canvas");
            videoPublishEditModel.setMultiEditVideoRecordData(null);
            CanvasVideoData canvasVideoData2 = videoPublishEditModel.getCanvasVideoData();
            if (canvasVideoData2 != null && (list2 = canvasVideoData2.sourceInfo) != null && (str = (String) C13LP.LJJJLZIJ(0, list2)) != null) {
                VideoFileInfo videoFileInfoLJIIJ = C571500MbE.LJIIJ(str);
                if (videoFileInfoLJIIJ.getWidth() <= 0 || videoFileInfoLJIIJ.getHeight() <= 0) {
                    videoFileInfoLJIIJ = videoFileInfoLJIIJ.copy(videoPublishEditModel.getPreviewInfo().getPreviewWidth(), videoPublishEditModel.getPreviewInfo().getPreviewHeight(), videoFileInfoLJIIJ.duration, videoFileInfoLJIIJ.fps, videoFileInfoLJIIJ.bitrate, videoFileInfoLJIIJ.codecType, videoFileInfoLJIIJ.keyFrameCount, videoFileInfoLJIIJ.gop, videoFileInfoLJIIJ.fpsFloat);
                }
                videoPublishEditModel.setPreviewInfo(new C538330L9j(videoPublishEditModel.getVideoCanvasWidth(), videoPublishEditModel.getVideoCanvasHeight(), 12).LIZ(new EditVideoSegment(str, null, videoFileInfoLJIIJ)));
            }
        }
        if (aIAliveRestoreData.recordData != null) {
            MultiEditVideoStatusRecordData multiEditVideoRecordData3 = videoPublishEditModel.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData3 != null && (multiEditVideoRecordData2 = multiEditVideoRecordData3.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData2.segmentDataList) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<MultiEditVideoSegmentRecordData> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().videoPath);
                }
            } else {
                arrayList = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateEditModelIfRemove: ");
            sbLIZ.append(arrayList);
            C559010LwB.LIZIZ("AILiveDataHelper", C2188811AlT.LIZIZ(sbLIZ));
            videoPublishEditModel.getAvetParameter().setContentType("video");
            videoPublishEditModel.setMultiEditVideoRecordData(aIAliveRestoreData.recordData);
            MultiEditVideoStatusRecordData multiEditVideoRecordData4 = videoPublishEditModel.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData4 != null && (multiEditVideoRecordData = multiEditVideoRecordData4.curMultiEditVideoRecordData) != null) {
                EditPreviewInfo editPreviewInfo = videoPublishEditModel.getEditPreviewInfo();
                if (editPreviewInfo != null) {
                    previewWidth = editPreviewInfo.getPreviewWidth();
                } else {
                    previewWidth = 0;
                }
                EditPreviewInfo editPreviewInfo2 = videoPublishEditModel.getEditPreviewInfo();
                if (editPreviewInfo2 != null) {
                    previewHeight = editPreviewInfo2.getPreviewHeight();
                } else {
                    previewHeight = 0;
                }
                EditPreviewInfo editPreviewInfo3 = videoPublishEditModel.getEditPreviewInfo();
                if (editPreviewInfo3 != null) {
                    reverseAudioArray = editPreviewInfo3.getReverseAudioArray();
                } else {
                    reverseAudioArray = null;
                }
                EditPreviewInfo editPreviewInfo4 = videoPublishEditModel.getEditPreviewInfo();
                if (editPreviewInfo4 != null) {
                    reverseVideoArray = editPreviewInfo4.getReverseVideoArray();
                } else {
                    reverseVideoArray = null;
                }
                videoPublishEditModel.setEditPreviewInfo(new C554830LpR(previewWidth, previewHeight, true, reverseAudioArray, reverseVideoArray, 140).LIZ(multiEditVideoRecordData));
            }
            aIAliveRestoreData.recordData = null;
        }
        LivePhotoModel livePhotoModel = aIAliveRestoreData.livePhotoModel;
        if (livePhotoModel != null) {
            videoPublishEditModel.creativeModel.livePhotoModel = livePhotoModel;
            aIAliveRestoreData.livePhotoModel = null;
        }
        AlbumModel albumModel = videoPublishEditModel.creativeModel.albumModel;
        C0MKJ c0mkj = C0MKJ.LIZ;
        String strLJFF = LJFF(videoPublishEditModel, nLEEditor.getModel());
        c0mkj.getClass();
        albumModel.importInfoList = C0MKJ.LJIIZILJ(strLJFF);
        videoPublishEditModel.setCreationMode(1);
        LJIIJ(nLEEditor, videoPublishEditModel.creativeModel);
        NLETrack mainTrack = nLEEditor.getModel().getMainTrack();
        if (mainTrack == null) {
            return;
        }
        videoPublishEditModel.setVideoLength(((int) mainTrack.getMaxEnd()) / LSPassThroughRecordSizeConfig.DEFAULT);
        if (C290630BaH.LIZ()) {
            videoPublishEditModel.setFastImport(false);
            AudioRecorderParam veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam();
            if (veAudioRecorderParam != null) {
                veAudioRecorderParam.setHasOriginalSound(videoPublishEditModel.realHasOriginalSound());
            }
        }
    }

    public static void LJIIJ(NLEEditor nLEEditor, CreativeModel creativeModel) {
        List<StickerItemModel> list;
        String uuid;
        for (StickerModel stickerModel : (ArrayList) C1466090oFr.LJFF(creativeModel.stickerModel)) {
            if (stickerModel instanceof TextStickerModel) {
                uuid = ((TextStickerModel) stickerModel).getUuid();
            } else if (stickerModel instanceof InfoStickerModel) {
                uuid = ((InfoStickerModel) stickerModel).getUuid();
            } else if (stickerModel instanceof MemeSongTextStickerModel) {
                uuid = ((MemeSongTextStickerModel) stickerModel).getUuid();
            } else {
                uuid = null;
            }
            NLETrackSlot nLETrackSlotLIZ = C346680DiU.LIZ(nLEEditor.getModel(), uuid);
            if (nLETrackSlotLIZ != null) {
                BaseStickerModel baseModel = stickerModel.getBaseModel();
                long startTime = nLETrackSlotLIZ.getStartTime();
                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                baseModel.setStartTime(startTime / j);
                stickerModel.getBaseModel().setEndTime(nLETrackSlotLIZ.getEndTime() / j);
                stickerModel.getBaseModel().setUiStartTime(nLETrackSlotLIZ.getStartTime() / j);
                stickerModel.getBaseModel().setUiEndTime(nLETrackSlotLIZ.getEndTime() / j);
            }
        }
        com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel infoStickerModel = creativeModel.infoStickerModel;
        if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
            for (StickerItemModel stickerItemModel : list) {
                NLETrackSlot nLETrackSlotLIZ2 = C346680DiU.LIZ(nLEEditor.getModel(), stickerItemModel.uuid);
                if (nLETrackSlotLIZ2 != null) {
                    long startTime2 = nLETrackSlotLIZ2.getStartTime();
                    long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                    stickerItemModel.startTime = (int) (startTime2 / j2);
                    int endTime = (int) (nLETrackSlotLIZ2.getEndTime() / j2);
                    stickerItemModel.endTime = endTime;
                    stickerItemModel.uiStartTime = stickerItemModel.startTime;
                    stickerItemModel.uiEndTime = endTime;
                }
            }
        }
        for (EffectPointModel effectPointModel : creativeModel.editEffectModel.effectList) {
            NLETrackSlot nLETrackSlotLIZ3 = C346680DiU.LIZ(nLEEditor.getModel(), effectPointModel.getUuid());
            if (nLETrackSlotLIZ3 != null) {
                long startTime3 = nLETrackSlotLIZ3.getStartTime();
                long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
                effectPointModel.setStartPoint((int) (startTime3 / j3));
                effectPointModel.setEndPoint((int) (nLETrackSlotLIZ3.getEndTime() / j3));
                effectPointModel.setUiStartPoint(effectPointModel.getStartPoint());
                effectPointModel.setUiEndPoint(effectPointModel.getEndPoint());
            }
        }
    }

    public static void LIZ(TransitionModel transitionModel, NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        String str;
        NLETrack mainTrack;
        if (transitionModel != null && (str = transitionModel.path) != null && str.length() != 0) {
            NLESegmentTransition nLESegmentTransition = new NLESegmentTransition();
            nLESegmentTransition.setTransitionDuration(((long) LSPassThroughRecordSizeConfig.DEFAULT) * 1000);
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceFile(transitionModel.path);
            nLESegmentTransition.setEffectSDKTransition(nLEResourceNode);
            nLESegmentTransition.setOverlap(transitionModel.isOverlap);
            nLETrackSlot.setEndTransition(nLESegmentTransition);
            if (nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null) {
                mainTrack.timeSort();
            }
        }
    }

    public static NLETrackSlot LIZJ(String str, long j, AIGCInfo aIGCInfo) {
        long j2;
        boolean z;
        C558340Lv6 c558340Lv6LIZLLL = C20137613qo.LIZ.LIZLLL(str);
        C533730KwV.LIZ.getClass();
        NLEResType nLEResTypeLJ = C533730KwV.LJ(str);
        NLEResType nLEResType = NLEResType.IMAGE;
        if (nLEResTypeLJ == nLEResType) {
            j2 = 10000000;
        } else {
            j2 = c558340Lv6LIZLLL.LJ * 1000;
        }
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceFile(str);
        nLEResourceAV.setResourceType(nLEResTypeLJ);
        nLEResourceAV.setDuration(j2);
        if (nLEResTypeLJ != nLEResType && !VEUtils.getAudioFileInfoForAllTracks(str).isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        nLEResourceAV.setHasAudio(z);
        int i = c558340Lv6LIZLLL.LIZLLL;
        if (i != 90 && i != 270) {
            nLEResourceAV.setHeight(c558340Lv6LIZLLL.LIZJ);
            nLEResourceAV.setWidth(c558340Lv6LIZLLL.LIZIZ);
        } else {
            nLEResourceAV.setHeight(c558340Lv6LIZLLL.LIZIZ);
            nLEResourceAV.setWidth(c558340Lv6LIZLLL.LIZJ);
        }
        nLESegmentVideo.setAVFile(nLEResourceAV);
        nLESegmentVideo.setTimeClipStart(0L);
        nLESegmentVideo.setTimeClipEnd(j2);
        nLESegmentVideo.setSpeed(1.0f);
        nLETrackSlot.setMainSegment(nLESegmentVideo);
        nLETrackSlot.setStartTime(j);
        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + nLETrackSlot.getDuration());
        if (aIGCInfo != null) {
            nLETrackSlot.setExtra("aigc_info", C140C.LIZJ(aIGCInfo));
        }
        return nLETrackSlot;
    }

    public static void LJI(NLEEditor nLEEditor, NLETrackSlot nLETrackSlot, int i) {
        NLEModel model;
        NLETrack mainTrack;
        if (i <= 1 || (model = nLEEditor.getModel()) == null || (mainTrack = model.getMainTrack()) == null) {
            return;
        }
        int i2 = 1;
        do {
            NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone(true));
            if (nLETrackSlotDynamicCast == null) {
                return;
            }
            NLESegment mainSegment = nLETrackSlotDynamicCast.getMainSegment();
            if (mainSegment != null) {
                nLETrackSlotDynamicCast.setStartTime(mainTrack.getMeasuredEndTime());
                nLETrackSlotDynamicCast.setEndTime(nLETrackSlotDynamicCast.getStartTime() + mainSegment.getDuration());
            }
            mainTrack.addSlot(nLETrackSlotDynamicCast);
            i2++;
        } while (i2 < i);
        mainTrack.timeSort();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(com.bytedance.ies.nle.editor_jni.NLEEditor r31, com.ss.android.ugc.aweme.creative.model.CreativeModel r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MCR.LJIIIZ(com.bytedance.ies.nle.editor_jni.NLEEditor, com.ss.android.ugc.aweme.creative.model.CreativeModel, boolean):void");
    }
}
