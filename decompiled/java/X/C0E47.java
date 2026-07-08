package X;

import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E47, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E47 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        C01GW<C365830EVx> c01gw = C365830EVx.LIZLLL;
        return C0E46.LIZ().LIZJ && C364210EPr.LIZIZ;
    }

    public static void LIZIZ(C0E48 c0e48, NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        String uuid;
        NLECommit head;
        String uuid2;
        NLECommit headPrev;
        NLEStyCanvas canvasStyle;
        if (c0e48 == null) {
            return;
        }
        long jJh = c0e48.getPlayer().Jh();
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            Iterator<NLETrackSlot> it2 = slots.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) it2.next().getMainSegment());
                if (nLESegmentVideoDynamicCast != null && (nLESegmentVideoDynamicCast.getCanvasStyle() == null || ((canvasStyle = nLESegmentVideoDynamicCast.getCanvasStyle()) != null && canvasStyle.hasExtra("extra_canvas_style_from")))) {
                    NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
                    nLEStyCanvas.setType(NLECanvasType.COLOR);
                    nLEStyCanvas.setColor(-16777216L);
                    nLESegmentVideoDynamicCast.setCanvasStyle(nLEStyCanvas);
                    z = true;
                }
            }
            if (z) {
                c0e48.getPlayer().pause(false);
                NLEEditor nLEEditorLJI = c0e48.LLFII().LJI();
                NLEBranch branch = nLEEditorLJI.getBranch();
                String str = "";
                if (branch == null || (headPrev = branch.getHeadPrev()) == null || (uuid = headPrev.getUUID()) == null) {
                    uuid = "";
                }
                nLEEditorLJI.commit();
                nLEEditorLJI.done();
                if (Intrinsics.LJFF(uuid, "")) {
                    nLEEditorLJI.trim(0L, 0L);
                } else {
                    NLEBranch branch2 = nLEEditorLJI.getBranch();
                    if (branch2 != null && (head = branch2.getHead()) != null && (uuid2 = head.getUUID()) != null) {
                        str = uuid2;
                    }
                    nLEEditorLJI.trimRange(uuid, str);
                }
                c0e48.getPlayer().LIZIZ(jJh);
            }
        }
    }
}
