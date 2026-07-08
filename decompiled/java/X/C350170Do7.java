package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS288S0000000_5;

/* JADX INFO: renamed from: X.0Do7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350170Do7 extends AbstractC350210DoB implements InterfaceC350230DoD, InterfaceC350220DoC {
    public final C348760Dlq LLILLJJLI = C350200DoA.LIZ(this, AFwS288S0000000_5.get$arr$(6));

    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    @Override // X.InterfaceC350230DoD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C348820Dlw r7) {
        /*
            r6 = this;
            X.0Dlq r0 = r6.LLILLJJLI
            java.util.List<com.bytedance.ies.nle.editor_jni.NLETrackSlot> r0 = r0.LIZJ
            if (r0 == 0) goto L8c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L11:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
            com.bytedance.ies.nle.editor_jni.VecNLEMaskSPtr r0 = r0.getMasks()
            if (r0 != 0) goto L25
            X.13BV r0 = X.C13BV.INSTANCE
        L25:
            X.C19719612Di.LJJI(r0, r3)
            goto L11
        L29:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r3.iterator()
        L32:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.nle.editor_jni.NLEMask r0 = (com.bytedance.ies.nle.editor_jni.NLEMask) r0
            if (r0 == 0) goto L32
            com.bytedance.ies.nle.editor_jni.NLESegmentMask r0 = r0.getSegment()
            if (r0 == 0) goto L32
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = r0.getEffectSDKMask()
            if (r0 == 0) goto L32
            r2.add(r0)
            goto L32
        L50:
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r2, r0)
            r5.<init>(r0)
            java.util.Iterator r4 = r2.iterator()
        L5f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r4.next()
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = (com.bytedance.ies.nle.editor_jni.NLEResourceNode) r0
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo r3 = new com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo
            java.lang.String r2 = r0.getResourceId()
            java.lang.String r1 = r0.getResourceName()
            java.lang.String r0 = r0.getResourceFile()
            r3.<init>(r2, r1, r0)
            r5.add(r3)
            goto L5f
        L80:
            java.util.Set r0 = X.C13LP.LLIIJI(r5)
            if (r0 == 0) goto L8c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto L91
        L8c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L91:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r7.LIZIZ
            if (r0 == 0) goto L9e
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r0 = r0.getEditorProModel()
            if (r0 == 0) goto L9e
            r0.setMaskEffects(r1)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350170Do7.LIZIZ(X.0Dlw):void");
    }

    @Override // X.InterfaceC350220DoC
    public final void LIZLLL(C0EMN c0emn) {
        VideoPublishEditModel videoPublishEditModel;
        VideoPublishEditModel videoPublishEditModel2 = c0emn.LIZJ;
        if (videoPublishEditModel2 == null || (videoPublishEditModel = c0emn.LIZIZ) == null) {
            return;
        }
        videoPublishEditModel2.getEditorProModel().setMaskEffects(videoPublishEditModel.getEditorProModel().getMaskEffects());
    }
}
