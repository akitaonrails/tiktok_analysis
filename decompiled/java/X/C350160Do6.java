package X;

import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEMattingStroke;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEMattingStroke;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS288S0000000_5;

/* JADX INFO: renamed from: X.0Do6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350160Do6 extends AbstractC350210DoB implements InterfaceC350230DoD, InterfaceC350220DoC {
    public final C348760Dlq LLILLJJLI = C350200DoA.LIZ(this, AFwS288S0000000_5.get$arr$(4));

    @Override // X.InterfaceC350230DoD
    public final void LIZIZ(C348820Dlw c348820Dlw) {
        EditorProModel editorProModel;
        VecNLEMattingStroke strokes;
        NLEMattingStroke nLEMattingStroke;
        NLEResourceNode stroke;
        NLEAIMatting aIMatting;
        List<NLETrackSlot> list = this.LLILLJJLI.LIZJ;
        ArrayList<NLEResourceNode> arrayList = new ArrayList();
        for (NLETrackSlot nLETrackSlot : (ArrayList) list) {
            NLESegmentAIMatting segment = null;
            if (nLETrackSlot != null && (aIMatting = nLETrackSlot.getAIMatting()) != null) {
                segment = aIMatting.getSegment();
            }
            NLESegmentAIMatting nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(segment);
            if (nLESegmentAIMattingDynamicCast != null && (strokes = nLESegmentAIMattingDynamicCast.getStrokes()) != null && (nLEMattingStroke = (NLEMattingStroke) C13LP.LJJJLZIJ(0, strokes)) != null && (stroke = nLEMattingStroke.getStroke()) != null) {
                arrayList.add(stroke);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (NLEResourceNode nLEResourceNode : arrayList) {
            arrayList2.add(new EditorProEffectInfo(nLEResourceNode.getResourceId(), nLEResourceNode.getResourceName(), nLEResourceNode.getResourceFile()));
        }
        ArrayList arrayList3 = new ArrayList(C13LP.LLIIJI(arrayList2));
        VideoPublishEditModel videoPublishEditModel = c348820Dlw.LIZIZ;
        if (videoPublishEditModel != null && (editorProModel = videoPublishEditModel.getEditorProModel()) != null) {
            editorProModel.setCutoutStrokeEffects(arrayList3);
        }
    }

    @Override // X.InterfaceC350220DoC
    public final void LIZLLL(C0EMN c0emn) {
        VideoPublishEditModel videoPublishEditModel;
        VideoPublishEditModel videoPublishEditModel2 = c0emn.LIZJ;
        if (videoPublishEditModel2 == null || (videoPublishEditModel = c0emn.LIZIZ) == null) {
            return;
        }
        videoPublishEditModel2.getEditorProModel().setCutoutStrokeEffects(videoPublishEditModel.getEditorProModel().getCutoutStrokeEffects());
    }
}
