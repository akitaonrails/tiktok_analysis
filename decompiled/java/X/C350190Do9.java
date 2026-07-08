package X;

import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS288S0000000_5;

/* JADX INFO: renamed from: X.0Do9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350190Do9 extends AbstractC350210DoB implements InterfaceC350230DoD, InterfaceC350220DoC {
    public final C348760Dlq LLILLJJLI = C350200DoA.LIZ(this, AFwS288S0000000_5.get$arr$(3));

    @Override // X.InterfaceC350230DoD
    public final void LIZIZ(C348820Dlw c348820Dlw) {
        EditorProEffectInfo editorProEffectInfo;
        EditorProEffectInfo editorProEffectInfo2;
        EditorProModel editorProModel;
        EditorProModel editorProModel2;
        NLESegmentAIMatting segment;
        NLEResourceNode blendMask;
        NLEAIMatting aIMatting;
        NLESegmentAIMatting segment2;
        NLEResourceNode blendCutout;
        NLEAIMatting aIMatting2;
        Iterator it2 = ((ArrayList) this.LLILLJJLI.LIZJ).iterator();
        while (true) {
            editorProEffectInfo = null;
            if (it2.hasNext()) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) it2.next();
                if (nLETrackSlot != null && (aIMatting2 = nLETrackSlot.getAIMatting()) != null) {
                    segment2 = aIMatting2.getSegment();
                } else {
                    segment2 = null;
                }
                NLESegmentAIMatting nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(segment2);
                if (nLESegmentAIMattingDynamicCast != null && (blendCutout = nLESegmentAIMattingDynamicCast.getBlendCutout()) != null) {
                    editorProEffectInfo2 = new EditorProEffectInfo(blendCutout.getResourceId(), blendCutout.getResourceName(), blendCutout.getResourceFile());
                    break;
                }
            } else {
                editorProEffectInfo2 = null;
                break;
            }
        }
        Iterator it3 = ((ArrayList) this.LLILLJJLI.LIZJ).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) it3.next();
            if (nLETrackSlot2 != null && (aIMatting = nLETrackSlot2.getAIMatting()) != null) {
                segment = aIMatting.getSegment();
            } else {
                segment = null;
            }
            NLESegmentAIMatting nLESegmentAIMattingDynamicCast2 = NLESegmentAIMatting.dynamicCast(segment);
            if (nLESegmentAIMattingDynamicCast2 != null && (blendMask = nLESegmentAIMattingDynamicCast2.getBlendMask()) != null) {
                editorProEffectInfo = new EditorProEffectInfo(blendMask.getResourceId(), blendMask.getResourceName(), blendMask.getResourceFile());
                break;
            }
        }
        VideoPublishEditModel videoPublishEditModel = c348820Dlw.LIZIZ;
        if (videoPublishEditModel != null && (editorProModel2 = videoPublishEditModel.getEditorProModel()) != null) {
            editorProModel2.setBlendCutoutEffect(editorProEffectInfo2);
        }
        VideoPublishEditModel videoPublishEditModel2 = c348820Dlw.LIZIZ;
        if (videoPublishEditModel2 != null && (editorProModel = videoPublishEditModel2.getEditorProModel()) != null) {
            editorProModel.setBlendMaskEffect(editorProEffectInfo);
        }
    }

    @Override // X.InterfaceC350220DoC
    public final void LIZLLL(C0EMN c0emn) {
        VideoPublishEditModel videoPublishEditModel;
        VideoPublishEditModel videoPublishEditModel2 = c0emn.LIZJ;
        if (videoPublishEditModel2 == null || (videoPublishEditModel = c0emn.LIZIZ) == null) {
            return;
        }
        videoPublishEditModel2.getEditorProModel().setBlendCutoutEffect(videoPublishEditModel.getEditorProModel().getBlendCutoutEffect());
        videoPublishEditModel2.getEditorProModel().setBlendMaskEffect(videoPublishEditModel.getEditorProModel().getBlendMaskEffect());
    }
}
