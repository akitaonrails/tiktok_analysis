package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS288S0000000_5;

/* JADX INFO: renamed from: X.0Do8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350180Do8 extends AbstractC350210DoB implements InterfaceC350230DoD, InterfaceC350220DoC {
    public final C348760Dlq LLILLJJLI = C350200DoA.LIZ(this, AFwS288S0000000_5.get$arr$(5));

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    @Override // X.InterfaceC350230DoD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C348820Dlw r8) {
        /*
            r7 = this;
            X.0Dlq r0 = r7.LLILLJJLI
            java.util.List<com.bytedance.ies.nle.editor_jni.NLETrackSlot> r0 = r0.LIZJ
            if (r0 == 0) goto L9e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L11:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
            com.bytedance.ies.nle.editor_jni.VecNLEChromaChannelSPtr r0 = r0.getChromaChannels()
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
            com.bytedance.ies.nle.editor_jni.NLEChromaChannel r0 = (com.bytedance.ies.nle.editor_jni.NLEChromaChannel) r0
            if (r0 == 0) goto L32
            com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel r0 = r0.getSegment()
            if (r0 == 0) goto L32
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = r0.getEffectSDKChroma()
            if (r0 == 0) goto L32
            r2.add(r0)
            goto L32
        L50:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r2.iterator()
        L59:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r4 = r5.next()
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r4 = (com.bytedance.ies.nle.editor_jni.NLEResourceNode) r4
            java.lang.String r0 = r4.getResourceId()
            if (r0 == 0) goto L59
            int r0 = r0.length()
            if (r0 == 0) goto L59
            java.lang.String r0 = r4.getResourceFile()
            if (r0 == 0) goto L59
            int r0 = r0.length()
            if (r0 == 0) goto L59
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo r3 = new com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo
            java.lang.String r2 = r4.getResourceId()
            java.lang.String r1 = r4.getResourceName()
            java.lang.String r0 = r4.getResourceFile()
            r3.<init>(r2, r1, r0)
            r6.add(r3)
            goto L59
        L92:
            java.util.Set r0 = X.C13LP.LLIIJI(r6)
            if (r0 == 0) goto L9e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto La3
        L9e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        La3:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.LIZIZ
            if (r0 == 0) goto Lb0
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r0 = r0.getEditorProModel()
            if (r0 == 0) goto Lb0
            r0.setChromaEffects(r1)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350180Do8.LIZIZ(X.0Dlw):void");
    }

    @Override // X.InterfaceC350220DoC
    public final void LIZLLL(C0EMN c0emn) {
        VideoPublishEditModel videoPublishEditModel;
        VideoPublishEditModel videoPublishEditModel2 = c0emn.LIZJ;
        if (videoPublishEditModel2 == null || (videoPublishEditModel = c0emn.LIZIZ) == null) {
            return;
        }
        videoPublishEditModel2.getEditorProModel().setChromaEffects(videoPublishEditModel.getEditorProModel().getChromaEffects());
    }
}
