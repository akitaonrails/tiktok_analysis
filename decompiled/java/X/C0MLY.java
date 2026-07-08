package X;

import Y.AfS174S0100000_5;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MLY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MLY {
    public final VideoPublishEditModel LIZ;

    public C0MLY(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }

    public final void LIZ(final String str, String str2, final Function1<? super Boolean, Unit> function1) {
        C11O8 c11o8LIZ;
        if (C433810Gzj.LIZ()) {
            c11o8LIZ = C11NZ.LJJJJI(new CallableC567830MOv(new C567820MOu(this.LIZ.getCreativeInfo(), false), str, str2, null)).LJJJLZIJ(C11S5.LIZ());
        } else {
            c11o8LIZ = C0MP1.LIZ(new C0MP1(this.LIZ.getCreativeInfo(), new C0MOJ(false, false, 3)), str, false, str2, false, 52);
        }
        c11o8LIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0F3N
            @Override // X.C09JN
            public final void accept(Object obj) {
                NLESegment mainSegment;
                NLESegmentVideo nLESegmentVideoDynamicCast;
                C1C7U.LIZ("AvatarCreateCanvasData@a4a2.createNewCanvas$1");
                C0MOZ c0moz = (C0MOZ) obj;
                String str3 = str;
                c0moz.LIZ = str3;
                CanvasVideoData canvasVideoDataLIZJ = C0MOA.LIZJ(c0moz, Collections.singletonList(str3));
                NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                nLEEditorLIZ.restore(this.LIZ.getNleData());
                NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLEEditorLIZ.getModel().getMainTrack().getSlots());
                if (nLETrackSlot != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment)) != null) {
                    NLEResourceAV aVFile = nLESegmentVideoDynamicCast.getAVFile();
                    if (aVFile != null) {
                        aVFile.setResourceFile(c0moz.LIZ);
                    }
                    NLEStyCanvas canvasStyle = nLESegmentVideoDynamicCast.getCanvasStyle();
                    if (canvasStyle != null) {
                        canvasStyle.setStartColor(c0moz.LIZIZ.getFirst().intValue());
                    }
                    NLEStyCanvas canvasStyle2 = nLESegmentVideoDynamicCast.getCanvasStyle();
                    if (canvasStyle2 != null) {
                        canvasStyle2.setEndColor(c0moz.LIZIZ.getSecond().intValue());
                    }
                }
                nLEEditorLIZ.commit();
                nLEEditorLIZ.done();
                this.LIZ.setNleData(nLEEditorLIZ.store());
                this.LIZ.setCanvasVideoData(canvasVideoDataLIZJ);
                function1.invoke(Boolean.TRUE);
                C1C7U.LIZIZ("AvatarCreateCanvasData@a4a2.createNewCanvas$1");
            }
        }, new AfS174S0100000_5(function1, 8));
    }
}
