package X;

import Y.ARunnableS122S0100000_22;
import Y.ARunnableS91S0200000_22;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.service.IStoryAlbumEnterEditTimingService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450450nqd implements InterfaceC578090Mlr {
    public final LifecycleOwner LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final InterfaceC1455860nzM LIZJ;
    public final String LIZLLL;
    public volatile CanvasVideoData LJ;
    public volatile boolean LJFF;

    public final void LIZJ() {
        CanvasVideoData canvasVideoData;
        C1463670oBx c1463670oBx;
        List<String> list;
        String str;
        C0E9H c0e9h;
        NLEModel model;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot nLETrackSlot;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        CanvasFilterParam canvasFilterParam;
        if (this.LJFF || (canvasVideoData = this.LJ) == null) {
            return;
        }
        InterfaceC1452170ntP value = this.LIZJ.g().getValue();
        if (!(value instanceof C1463670oBx) || (c1463670oBx = (C1463670oBx) value) == null || (list = canvasVideoData.sourceInfo) == null || (str = (String) C13LP.LJJJLL(list)) == null || (model = (c0e9h = c1463670oBx.LJ).getModel()) == null || (mainTrack = model.getMainTrack()) == null || (sortedSlots = mainTrack.getSortedSlots()) == null || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(sortedSlots)) == null || (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) == null) {
            return;
        }
        NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
        List<CanvasVideoData> list2 = canvasVideoData.externalTracks;
        if (list2 == null || list2.isEmpty()) {
            nLEStyCanvas.setExtra("IS_SCENE_CANVAS_DMT", "true");
        }
        CanvasBackground canvasBackground = canvasVideoData.background;
        int type = canvasBackground.getType();
        if (type == 2) {
            nLEStyCanvas.setType(NLECanvasType.GRADIENT_COLOR);
            nLEStyCanvas.setStartColor(canvasBackground.getStartColor());
            nLEStyCanvas.setEndColor(canvasBackground.getEndColor());
        } else if (type != 3) {
            nLEStyCanvas.setType(NLECanvasType.COLOR);
            nLEStyCanvas.setColor(canvasBackground.getStartColor());
        } else {
            nLEStyCanvas.setType(NLECanvasType.IMAGE);
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceType(NLEResType.IMAGE);
            nLEResourceNode.setResourceFile(canvasBackground.getFilePath());
            nLEStyCanvas.setImage(nLEResourceNode);
        }
        nLEStyCanvas.setAntialiasing(true);
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceFile(str);
        nLEResourceAV.setResourceType(NLEResType.IMAGE);
        nLEResourceAV.setHasAudio(false);
        nLESegmentVideoDynamicCast.setAVFile(nLEResourceAV);
        nLESegmentVideoDynamicCast.setCanvasStyle(nLEStyCanvas);
        List<CanvasFilterParam> transformList = canvasVideoData.getTransformList();
        if (transformList != null && (canvasFilterParam = (CanvasFilterParam) C13LP.LJJJLL(transformList)) != null) {
            Iterator it2 = ((ArrayList) C1444940nhk.LJIJI(canvasFilterParam)).iterator();
            while (it2.hasNext()) {
                C1450410nqZ.LIZIZ(nLETrackSlot, nLEStyCanvas, (VEBaseFilterParam) it2.next());
            }
        }
        AIGCInfo aIGCInfo = canvasVideoData.aigcInfo;
        if (aIGCInfo != null) {
            nLETrackSlot.setExtra("aigc_info", C140C.LIZJ(aIGCInfo));
        }
        this.LIZIZ.setCanvasVideoData(canvasVideoData);
        c1463670oBx.LJFF = true;
        C1450460nqe.LIZ.getClass();
        C01GW c01gw = C1450460nqe.LIZJ;
        IStoryAlbumEnterEditTimingService iStoryAlbumEnterEditTimingService = (IStoryAlbumEnterEditTimingService) c01gw.getValue();
        if (iStoryAlbumEnterEditTimingService != null) {
            iStoryAlbumEnterEditTimingService.LIZ();
        }
        c0e9h.commit();
        IStoryAlbumEnterEditTimingService iStoryAlbumEnterEditTimingService2 = (IStoryAlbumEnterEditTimingService) c01gw.getValue();
        if (iStoryAlbumEnterEditTimingService2 != null) {
            iStoryAlbumEnterEditTimingService2.LIZ();
        }
        this.LJFF = true;
        C1450480nqg.LIZ(this.LIZLLL);
        C201955140j.LJIILJJIL(C1662160tM6.LIZIZ, "PendingPhotoCanvasInject real canvas injected, creationId=" + this.LIZLLL);
    }

    @Override // X.InterfaceC578090Mlr
    public final void LIZ(Throwable th) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PendingPhotoCanvasInject real canvas failed: ");
            sbLIZ.append(th.getMessage());
            C201955140j.LJII(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
            C1450480nqg.LIZ(this.LIZLLL);
            return;
        }
        C1450460nqe.LIZ.getClass();
        C786410Ut5.LJJZZIII((Handler) C1450460nqe.LIZIZ.getValue(), new ARunnableS91S0200000_22(th, this, 13));
    }

    @Override // X.InterfaceC578090Mlr
    public final void LIZIZ(CanvasVideoData canvasVideoData) {
        this.LJ = canvasVideoData;
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            LIZJ();
        } else {
            C1450460nqe.LIZ.getClass();
            C786410Ut5.LJJZZIII((Handler) C1450460nqe.LIZIZ.getValue(), new ARunnableS122S0100000_22(this, 46));
        }
    }

    public C1450450nqd(LifecycleOwner lifecycleOwner, VideoPublishEditModel videoPublishEditModel, InterfaceC1446740nke interfaceC1446740nke, String str) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = interfaceC1446740nke;
        this.LIZLLL = str;
    }
}
