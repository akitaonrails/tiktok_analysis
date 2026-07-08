package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.vesdk.LoudnessDetectResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mjD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1407410mjD extends AbstractC1407390mjB {
    public final InterfaceC1452170ntP LIZIZ;

    @Override // X.AbstractC1407390mjB
    public final List<C1407400mjC> LIZ() {
        String videoPath;
        NLEModel model;
        NLETrack mainTrack;
        String uuid;
        List<String> list;
        CanvasVideoData canvasVideoData;
        CanvasExtra canvasExtra;
        ForwardCanvasExtra forwardCanvasExtra;
        NLEModel model2;
        VecNLETrackSPtr tracks;
        NLETrack next;
        NLEModel model3;
        NLETrack mainTrack2;
        String uuid2;
        NLEModel model4;
        VecNLETrackSPtr tracks2;
        ArrayList arrayList = new ArrayList();
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LIZIZ);
        if (c348100DkmLIZIZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C347650Dk3 c347650Dk3LJJJJIZL = c348100DkmLIZIZ.LJFF().LJJJJIZL(EnumC355960DxS.ORIGIN_VOICE_CONVERSION);
        NLETrack nLETrack = null;
        if (c347650Dk3LJJJJIZL != null) {
            C1407400mjC c1407400mjC = new C1407400mjC();
            c1407400mjC.LIZ = c347650Dk3LJJJJIZL.LIZIZ;
            c1407400mjC.LIZIZ = (int) c347650Dk3LJJJJIZL.LJFF;
            c1407400mjC.LIZJ = (int) c347650Dk3LJJJJIZL.LJI;
            c1407400mjC.LIZLLL = -12.0d;
            NLEEditor nLEEditor = c348100DkmLIZIZ.LIZ;
            if (nLEEditor != null && (model4 = nLEEditor.getModel()) != null && (tracks2 = model4.getTracks()) != null) {
                Iterator<NLETrack> it2 = tracks2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    NLETrack next2 = it2.next();
                    if (Intrinsics.LJFF(next2.getExtra("AudioTrackType"), "ORIGIN_VOICE_CONVERSION")) {
                        nLETrack = next2;
                        break;
                    }
                }
                NLETrack nLETrack2 = nLETrack;
                if (nLETrack2 != null) {
                    c1407400mjC.LJFF = nLETrack2.getUUID();
                }
            }
            c1407400mjC.LJI = 0;
            if (c1407400mjC.LIZ != null && c1407400mjC.LJFF.length() > 0) {
                arrayList.add(c1407400mjC);
            }
        } else {
            int i = 0;
            for (EditVideoSegment editVideoSegment : this.LIZ.getPreviewInfo().getVideoList()) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                EditVideoSegment editVideoSegment2 = editVideoSegment;
                C1407400mjC c1407400mjC2 = new C1407400mjC();
                String str = "";
                if (this.LIZ.realHasOriginalSound()) {
                    c1407400mjC2.LIZ = editVideoSegment2.getAudioPath();
                    c1407400mjC2.LIZIZ = 0;
                    c1407400mjC2.LIZJ = this.LIZIZ.getDuration();
                    c1407400mjC2.LIZLLL = -12.0d;
                    if (this.LIZ.isStitchMode()) {
                        NLEEditor nLEEditor2 = c348100DkmLIZIZ.LIZ;
                        if (nLEEditor2 != null && (model3 = nLEEditor2.getModel()) != null && (mainTrack2 = model3.getMainTrack()) != null && (uuid2 = mainTrack2.getUUID()) != null) {
                            str = uuid2;
                        }
                        c1407400mjC2.LJFF = str;
                    } else {
                        NLEEditor nLEEditor3 = c348100DkmLIZIZ.LIZ;
                        if (nLEEditor3 != null && (model2 = nLEEditor3.getModel()) != null && (tracks = model2.getTracks()) != null) {
                            Iterator<NLETrack> it3 = tracks.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "ORIGIN")) {
                                    break;
                                }
                            }
                            NLETrack nLETrack3 = next;
                            if (nLETrack3 != null) {
                                c1407400mjC2.LJFF = nLETrack3.getUUID();
                                VecNLETrackSlotSPtr slots = nLETrack3.getSlots();
                                if (slots != null) {
                                    NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLZIJ(i, slots);
                                    c1407400mjC2.LJIIIIZZ = nLETimeSpaceNode != null ? nLETimeSpaceNode.getStartTime() : 0L;
                                    c1407400mjC2.LJIIIZ = nLETimeSpaceNode != null ? nLETimeSpaceNode.getEndTime() : 0L;
                                }
                            }
                        }
                    }
                } else {
                    if (C1428470nHB.LJJJJZ(this.LIZ)) {
                        CanvasVideoData canvasVideoData2 = this.LIZ.getCanvasVideoData();
                        videoPath = (canvasVideoData2 == null || (list = canvasVideoData2.sourceInfo) == null) ? null : (String) C13LP.LJJJLL(list);
                    } else {
                        videoPath = editVideoSegment2.getVideoPath();
                    }
                    c1407400mjC2.LIZ = videoPath;
                    c1407400mjC2.LIZIZ = 0;
                    c1407400mjC2.LIZJ = this.LIZIZ.getDuration();
                    c1407400mjC2.LIZLLL = -12.0d;
                    NLEEditor nLEEditor4 = c348100DkmLIZIZ.LIZ;
                    if (nLEEditor4 != null && (model = nLEEditor4.getModel()) != null && (mainTrack = model.getMainTrack()) != null && (uuid = mainTrack.getUUID()) != null) {
                        str = uuid;
                    }
                    c1407400mjC2.LJFF = str;
                }
                if (C1444940nhk.LJI(this.LIZ.getCanvasVideoData()) && (canvasVideoData = this.LIZ.getCanvasVideoData()) != null && (canvasExtra = canvasVideoData.extra) != null && (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) != null) {
                    c1407400mjC2.LIZLLL = forwardCanvasExtra.targetVolumeLoud;
                }
                c1407400mjC2.LJI = 0;
                if (c1407400mjC2.LIZ != null && c1407400mjC2.LJFF.length() > 0) {
                    arrayList.add(c1407400mjC2);
                }
                i = i2;
            }
        }
        return arrayList;
    }

    @Override // X.AbstractC1407390mjB
    public final LoudnessDetectResult LIZIZ(C1407400mjC c1407400mjC) {
        if (C1444940nhk.LIZ(this.LIZ.getCanvasVideoData()) != null) {
            return C1444940nhk.LIZ(this.LIZ.getCanvasVideoData());
        }
        com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult loudnessDetectResult = this.LIZ.creativeModel.loudnessBalanceModel.loudnessMap.get(c1407400mjC.LIZ);
        if (loudnessDetectResult != null && loudnessDetectResult.result == 0) {
            LoudnessDetectResult loudnessDetectResult2 = new LoudnessDetectResult();
            loudnessDetectResult2.result = 0;
            loudnessDetectResult2.avgLoudness = loudnessDetectResult.avgLoudness;
            loudnessDetectResult2.peakLoudness = loudnessDetectResult.peakLoudness;
            return loudnessDetectResult2;
        }
        return null;
    }

    public C1407410mjD(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel);
        this.LIZIZ = interfaceC1452170ntP;
    }
}
