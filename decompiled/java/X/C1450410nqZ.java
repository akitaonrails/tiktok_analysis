package X;

import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.vesdk.filterparam.VEAudioVolumeFilterParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoCropFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0nqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450410nqZ {
    public static void LIZ(NLEStyCanvas nLEStyCanvas, CanvasBackground canvasBackground) {
        int type = canvasBackground.getType();
        if (type != 2) {
            if (type != 3) {
                nLEStyCanvas.setType(NLECanvasType.COLOR);
                nLEStyCanvas.setColor(canvasBackground.getStartColor());
            } else {
                nLEStyCanvas.setType(NLECanvasType.IMAGE);
                NLEResourceNode nLEResourceNode = new NLEResourceNode();
                nLEResourceNode.setResourceType(NLEResType.IMAGE);
                nLEResourceNode.setResourceFile(canvasBackground.getFilePath());
                nLEStyCanvas.setImage(nLEResourceNode);
            }
        } else {
            nLEStyCanvas.setType(NLECanvasType.GRADIENT_COLOR);
            nLEStyCanvas.setStartColor(canvasBackground.getStartColor());
            nLEStyCanvas.setEndColor(canvasBackground.getEndColor());
        }
        nLEStyCanvas.setAntialiasing(true);
    }

    public static void LIZIZ(NLETrackSlot nLETrackSlot, NLEStyCanvas nLEStyCanvas, VEBaseFilterParam vEBaseFilterParam) {
        NLESegmentVideo nLESegmentVideoLIZ;
        String str;
        if (vEBaseFilterParam instanceof VEVideoTransformFilterParam) {
            VEVideoTransformFilterParam vEVideoTransformFilterParam = (VEVideoTransformFilterParam) vEBaseFilterParam;
            nLETrackSlot.setScale(vEVideoTransformFilterParam.scaleFactor);
            nLETrackSlot.setTransformX(vEVideoTransformFilterParam.transX);
            nLETrackSlot.setTransformY(vEVideoTransformFilterParam.transY);
            float f = 360;
            nLETrackSlot.setRotation(f - (vEVideoTransformFilterParam.degree % f));
            int i = vEVideoTransformFilterParam.borderWidth;
            if (i > 0) {
                nLEStyCanvas.setBorderWidth(i);
                nLEStyCanvas.setBorderColor(vEVideoTransformFilterParam.borderColor);
            }
            String str2 = vEVideoTransformFilterParam.animPath;
            if ((str2 == null || str2.length() == 0) && ((str = vEVideoTransformFilterParam.animJsonParam) == null || str.length() == 0)) {
                return;
            }
            NLESegmentVideoAnimation nLESegmentVideoAnimation = new NLESegmentVideoAnimation();
            nLESegmentVideoAnimation.setAnimJsonParam(vEVideoTransformFilterParam.animJsonParam);
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceFile(vEVideoTransformFilterParam.animPath);
            nLESegmentVideoAnimation.setEffectSDKVideoAnimation(nLEResourceNode);
            NLEVideoAnimation nLEVideoAnimation = new NLEVideoAnimation();
            nLEVideoAnimation.setSegment(nLESegmentVideoAnimation);
            nLEVideoAnimation.setStartTime(nLETrackSlot.getStartTime());
            nLEVideoAnimation.setEndTime(nLETrackSlot.getEndTime());
            nLEVideoAnimation.setDuration(nLETrackSlot.getDuration());
            nLETrackSlot.addVideoAnim(nLEVideoAnimation);
            return;
        }
        if (vEBaseFilterParam instanceof VEVideoCropFilterParam) {
            NLESegmentVideo nLESegmentVideoLIZ2 = C351170Dpj.LIZ(nLETrackSlot);
            if (nLESegmentVideoLIZ2 == null) {
                return;
            }
            NLEStyCrop nLEStyCrop = new NLEStyCrop();
            VEVideoCropFilterParam vEVideoCropFilterParam = (VEVideoCropFilterParam) vEBaseFilterParam;
            Pair pair = new Pair(Float.valueOf(vEVideoCropFilterParam.cropNodesCoord[0]), Float.valueOf(vEVideoCropFilterParam.cropNodesCoord[1]));
            Pair pair2 = new Pair(Float.valueOf(vEVideoCropFilterParam.cropNodesCoord[2]), Float.valueOf(vEVideoCropFilterParam.cropNodesCoord[3]));
            Pair pair3 = new Pair(Float.valueOf(vEVideoCropFilterParam.cropNodesCoord[4]), Float.valueOf(vEVideoCropFilterParam.cropNodesCoord[5]));
            Pair pair4 = new Pair(Float.valueOf(vEVideoCropFilterParam.cropNodesCoord[6]), Float.valueOf(vEVideoCropFilterParam.cropNodesCoord[7]));
            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NLEStyCrop -> crop: \n");
            sbLIZ.append(pair);
            sbLIZ.append("---");
            sbLIZ.append(pair2);
            sbLIZ.append('\n');
            sbLIZ.append(pair3);
            sbLIZ.append("---");
            sbLIZ.append(pair4);
            interfaceC1463990oCTLIZLLL.d(C2188811AlT.LIZIZ(sbLIZ));
            nLEStyCrop.setXLeftUpper(((Number) pair.getFirst()).floatValue());
            nLEStyCrop.setYLeftUpper(((Number) pair.getSecond()).floatValue());
            nLEStyCrop.setXRightUpper(((Number) pair2.getFirst()).floatValue());
            nLEStyCrop.setYRightUpper(((Number) pair2.getSecond()).floatValue());
            nLEStyCrop.setXLeftLower(((Number) pair3.getFirst()).floatValue());
            nLEStyCrop.setYLeftLower(((Number) pair3.getSecond()).floatValue());
            nLEStyCrop.setXRightLower(((Number) pair4.getFirst()).floatValue());
            nLEStyCrop.setYRightLower(((Number) pair4.getSecond()).floatValue());
            nLESegmentVideoLIZ2.setCrop(nLEStyCrop);
            return;
        }
        if (!(vEBaseFilterParam instanceof VEAudioVolumeFilterParam) || (nLESegmentVideoLIZ = C351170Dpj.LIZ(nLETrackSlot)) == null) {
            return;
        }
        nLESegmentVideoLIZ.setEnableAudio(true);
        nLESegmentVideoLIZ.setVolume(((VEAudioVolumeFilterParam) vEBaseFilterParam).volume);
    }
}
