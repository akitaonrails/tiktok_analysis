package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.ies.cutsame.util.Size;
import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.StoryMultiImageParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450170nqB {
    public static final NLEModel LIZ(C1450180nqC c1450180nqC) {
        int i;
        NLEModel nLEModelLIZ;
        if (C0EM4.LIZ()) {
            i = c1450180nqC.LIZLLL;
        } else {
            i = -1;
        }
        int surfaceViewWidth = c1450180nqC.LIZIZ.getSurfaceData().getSurfaceViewWidth();
        int surfaceViewHeight = c1450180nqC.LIZIZ.getSurfaceData().getSurfaceViewHeight();
        if (c1450180nqC.LJFF == null) {
            InterfaceC1452170ntP interfaceC1452170ntP = c1450180nqC.LJ;
            if (interfaceC1452170ntP != null) {
                nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP);
            } else {
                nLEModelLIZ = null;
            }
            NLEModel nLEModelDynamicCast = NLEModel.dynamicCast((NLENode) nLEModelLIZ);
            if (nLEModelDynamicCast == null || nLEModelDynamicCast.getMainTrack() == null) {
                Pair pairLJIIIIZZ = C1450870nrJ.LJIIIIZZ(surfaceViewWidth, surfaceViewHeight);
                int iIntValue = ((Number) pairLJIIIIZZ.getFirst()).intValue();
                int iIntValue2 = ((Number) pairLJIIIIZZ.getSecond()).intValue();
                C1450090nq3 c1450090nq3 = new C1450090nq3(null);
                String id = c1450180nqC.LIZ.getId();
                if (id != null) {
                    nLEModelDynamicCast = NLEModel.dynamicCast(c1450090nq3.LIZIZ(id, null, c1450180nqC.LIZ, new Size(iIntValue, iIntValue2), true, -1).deepClone(true));
                    InterfaceC1452170ntP interfaceC1452170ntP2 = c1450180nqC.LJ;
                    if (interfaceC1452170ntP2 != null) {
                        interfaceC1452170ntP2.yc(nLEModelDynamicCast);
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            return nLEModelDynamicCast;
        }
        Pair pairLJIIIIZZ2 = C1450870nrJ.LJIIIIZZ(surfaceViewWidth, surfaceViewHeight);
        int iIntValue3 = ((Number) pairLJIIIIZZ2.getFirst()).intValue();
        int iIntValue4 = ((Number) pairLJIIIIZZ2.getSecond()).intValue();
        String id2 = c1450180nqC.LIZ.getId();
        if (id2 != null) {
            C1450090nq3 c1450090nq32 = c1450180nqC.LJFF;
            if (c1450090nq32 != null) {
                return c1450090nq32.LIZIZ(id2, c1450090nq32.LIZ(id2), c1450180nqC.LIZ, new Size(iIntValue3, iIntValue4), c1450180nqC.LIZJ.imageEditModel.enterFromPhotoTemplateApplied, i);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final NLETrackSlot LIZIZ(SrcLiveVideoInfo srcLiveVideoInfo) {
        NLESegmentVideo nLESegmentVideo;
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        if (srcLiveVideoInfo.getSrcDuration() <= 0) {
            int i = C20137413qm.LIZ.LIZ(srcLiveVideoInfo.getPath()).LIZJ;
            if (i > 0 && i <= 3000) {
                srcLiveVideoInfo.setSrcDuration(i);
            } else {
                srcLiveVideoInfo.setSrcDuration(LivePreCreateNextRoomPlayer.ENABLE);
            }
        }
        long srcDuration = srcLiveVideoInfo.getSrcDuration();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" videoDuration = ");
        sbLIZ.append(srcDuration);
        C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (!(mainSegment instanceof NLESegmentVideo) || (nLESegmentVideo = (NLESegmentVideo) mainSegment) == null) {
            nLESegmentVideo = new NLESegmentVideo();
        }
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceFile(srcLiveVideoInfo.getPath());
        long j = srcDuration * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        nLEResourceAV.setDuration(j);
        nLESegmentVideo.setTimeClipStart(0L);
        nLESegmentVideo.setSpeed(1.0f);
        nLESegmentVideo.setTimeClipEnd(j);
        nLEResourceAV.setHasAudio(false);
        C533730KwV c533730KwV = C533730KwV.LIZ;
        String path = srcLiveVideoInfo.getPath();
        c533730KwV.getClass();
        nLEResourceAV.setResourceType(C533730KwV.LJ(path));
        nLESegmentVideo.setAVFile(nLEResourceAV);
        nLESegmentVideo.setEnableAudio(false);
        NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
        C348350DlB.LJIILIIL(nLEStyCanvas, true);
        nLESegmentVideo.setCanvasStyle(nLEStyCanvas);
        nLETrackSlot.setMainSegment(nLESegmentVideo);
        nLETrackSlot.setStartTime(0L);
        return nLETrackSlot;
    }

    public static NLETrackSlot LIZJ(SrcImageInfo srcImageInfo, long j, StoryMultiImageParams storyMultiImageParams, int i) {
        NLESegmentVideo nLESegmentVideo;
        if ((i & 8) != 0) {
            storyMultiImageParams = null;
        }
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        nLETrackSlot.setStartTime(j);
        C348350DlB.LJIIL(nLETrackSlot);
        nLETrackSlot.setTransformZ(0);
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (!(mainSegment instanceof NLESegmentVideo) || (nLESegmentVideo = (NLESegmentVideo) mainSegment) == null) {
            nLESegmentVideo = new NLESegmentVideo();
        }
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceFile(srcImageInfo.getPath());
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        nLEResourceAV.setDuration(500 * j2);
        nLESegmentVideo.setTimeClipStart(0L);
        nLESegmentVideo.setSpeed(1.0f);
        nLESegmentVideo.setTimeClipEnd(500 * j2);
        nLEResourceAV.setHasAudio(false);
        nLESegmentVideo.setVolume(0.0f);
        C533730KwV c533730KwV = C533730KwV.LIZ;
        String path = srcImageInfo.getPath();
        c533730KwV.getClass();
        nLEResourceAV.setResourceType(C533730KwV.LJ(path));
        nLESegmentVideo.setAVFile(nLEResourceAV);
        nLESegmentVideo.setEnableAudio(false);
        NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
        C348350DlB.LJIILIIL(nLEStyCanvas, true);
        if (storyMultiImageParams != null) {
            Integer bgColorStart = storyMultiImageParams.getBgColorStart();
            Integer bgColorEnd = storyMultiImageParams.getBgColorEnd();
            if (bgColorStart != null && bgColorEnd != null) {
                if (Intrinsics.LJFF(bgColorStart, bgColorEnd)) {
                    nLEStyCanvas.setType(NLECanvasType.COLOR);
                    nLEStyCanvas.setColor(bgColorStart.intValue());
                } else {
                    nLEStyCanvas.setType(NLECanvasType.GRADIENT_COLOR);
                    nLEStyCanvas.setStartColor(bgColorStart.intValue());
                    nLEStyCanvas.setEndColor(bgColorEnd.intValue());
                }
                nLEStyCanvas.setAntialiasing(true);
            }
        }
        nLESegmentVideo.setCanvasStyle(nLEStyCanvas);
        nLETrackSlot.setMainSegment(nLESegmentVideo);
        return nLETrackSlot;
    }
}
