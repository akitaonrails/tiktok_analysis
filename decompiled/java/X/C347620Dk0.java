package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0Dk0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347620Dk0 extends AbstractC348060Dki {
    public final C347650Dk3 LIZIZ;

    public C347620Dk0(C347650Dk3 c347650Dk3) {
        this.LIZIZ = c347650Dk3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" 0.init ");
        sbLIZ.append(c347650Dk3);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC348060Dki
    public final void LIZJ(NLEEditor nLEEditor) {
        NLETrackSlot nLETrackSlotLIZ = C14LJ.LIZ(nLEEditor.getModel(), this.LIZIZ.LIZJ);
        if (nLETrackSlotLIZ != null) {
            LJII(nLETrackSlotLIZ, this.LIZIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(com.bytedance.ies.nle.editor_jni.NLETrackSlot r21, X.C347650Dk3 r22) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C347620Dk0.LJII(com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.0Dk3):void");
    }
}
