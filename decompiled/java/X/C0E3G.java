package X;

import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0E3G, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E3G {
    public final C0E48 LIZ;
    public final C0E3E LIZIZ = new C0E3E();
    public C0E3H LIZJ = new C0E3H(0, 0, 0, 0, 31);

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.ies.nle.editor_jni.NLETrackSlot LIZIZ() {
        /*
            r7 = this;
            X.0E48 r0 = r7.LIZ
            r5 = 0
            if (r0 == 0) goto Laa
            com.bytedance.ies.nle.editor_jni.NLEModel r2 = X.C350870DpF.LJI(r0)
            if (r2 == 0) goto Laa
            com.bytedance.ies.nle.editor_jni.NLETrack r6 = X.C349930Dnj.LIZLLL(r2)
            if (r6 == 0) goto Laa
            X.0E1T r0 = com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider.Companion
            r0.getClass()
            com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider r0 = X.C0E1T.LIZIZ()
            if (r0 == 0) goto L8e
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r0.getEditModel()
        L20:
            r0 = 0
            boolean r0 = X.C349930Dnj.LIZ(r1, r2, r0)
            if (r0 == 0) goto L9d
            boolean r0 = X.C351220Dpo.LLLFF(r6)
            if (r0 == 0) goto L9d
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r6.getSlots()
            if (r0 == 0) goto L9d
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r6.getSlots()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L9d
            X.0E48 r2 = r7.LIZ
            if (r2 == 0) goto L90
            com.bytedance.ies.nle.editor_jni.NLETrack r1 = r2.Pt()
            boolean r0 = X.C351220Dpo.LLLFF(r1)
            if (r0 == 0) goto L70
            if (r1 == 0) goto L90
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r2.LLLLLLIL()
            int r0 = r1.getSlotIndex(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L5a:
            if (r0 == 0) goto L90
            r0.intValue()
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r1 = r6.getSortedSlots()
            if (r1 == 0) goto L6f
            int r0 = r0.intValue()
            java.lang.Object r5 = X.C13LP.LJJJLZIJ(r0, r1)
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r5 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r5
        L6f:
            return r5
        L70:
            com.bytedance.ies.nle.editor_jni.NLETrack r4 = X.C350890DpH.LIZLLL(r2)
            X.0E55 r0 = r2.getPlayer()
            long r2 = r0.Jh()
            if (r4 == 0) goto L90
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r4.getSlotByTime(r2)
            int r0 = r4.getSlotIndex(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L5a
        L8e:
            r1 = r5
            goto L20
        L90:
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r6.getSlots()
            if (r0 == 0) goto L9c
            java.lang.Object r5 = X.C13LP.LJJJLL(r0)
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r5 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r5
        L9c:
            return r5
        L9d:
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r6.getSlots()
            if (r0 == 0) goto La9
            java.lang.Object r5 = X.C13LP.LJJJLL(r0)
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r5 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r5
        La9:
            return r5
        Laa:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E3G.LIZIZ():com.bytedance.ies.nle.editor_jni.NLETrackSlot");
    }

    public C0E3G(C0E48 c0e48) {
        this.LIZ = c0e48;
    }

    public final void LIZJ(boolean z) {
        C0E48 c0e48;
        C0E55 player;
        NLETrackSlot nLETrackSlotLIZIZ = LIZIZ();
        if (nLETrackSlotLIZIZ != null && (c0e48 = this.LIZ) != null && (player = c0e48.getPlayer()) != null) {
            player.LJIIIIZZ(nLETrackSlotLIZIZ.getStartTime(), nLETrackSlotLIZIZ.getEndTime(), z);
        }
    }

    public static void LIZ(NLETrackSlot nLETrackSlot, C0E3H c0e3h) {
        long j = c0e3h.LIZ;
        long j2 = c0e3h.LIZIZ;
        long j3 = c0e3h.LIZJ;
        long j4 = c0e3h.LIZLLL;
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentAudioDynamicCast != null) {
            float absSpeed = j3 * nLESegmentAudioDynamicCast.getAbsSpeed();
            float absSpeed2 = j4 * nLESegmentAudioDynamicCast.getAbsSpeed();
            nLETrackSlot.setStartTime(j);
            nLETrackSlot.setEndTime(j2);
            nLESegmentAudioDynamicCast.setTimeClipStart((long) absSpeed);
            nLESegmentAudioDynamicCast.setTimeClipEnd((long) absSpeed2);
        }
    }
}
