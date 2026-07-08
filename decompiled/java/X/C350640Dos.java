package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;

/* JADX INFO: renamed from: X.0Dos, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350640Dos {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        if (C351220Dpo.LLLIIIIL(nLETrackSlot)) {
            long duration = nLETrackSlot.getDuration();
            long startTime = nLETrackSlot2.getStartTime();
            C351510DqH.LIZ.getClass();
            nLETrackSlot.setEndTime(startTime + C351510DqH.LJJIIZI(nLETrackSlot2));
            nLETrackSlot.setStartTime(nLETrackSlot.getEndTime() - duration);
        }
    }

    public static void LIZLLL(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        if (C351220Dpo.LLLLIL(nLETrackSlot)) {
            C350700Doy.LJIIIZ(nLEModel, nLETrackSlot);
        }
    }

    public static void LIZIZ(NLEModel nLEModel, NLEEditor nLEEditor, C350650Dot c350650Dot, EnumC356070Dxd enumC356070Dxd) {
        NLETrack trackBySlot = nLEModel.getTrackBySlot(c350650Dot.LIZ);
        if (trackBySlot != null && trackBySlot.getMainTrack()) {
            NLETrackSlot nLETrackSlot = c350650Dot.LIZ;
            C351510DqH c351510DqH = C351510DqH.LIZ;
            String str = c350650Dot.LIZIZ;
            c351510DqH.getClass();
            NLEVideoAnimation nLEVideoAnimationLJIJ = C351510DqH.LJIJ(nLETrackSlot, str);
            if (nLEVideoAnimationLJIJ != null) {
                nLETrackSlot.removeVideoAnim(nLEVideoAnimationLJIJ);
            }
            C350700Doy.LIZIZ(nLEModel, nLETrackSlot, c350650Dot.LIZIZ);
            if (enumC356070Dxd != null) {
                int i = C350580Dom.LIZ[enumC356070Dxd.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new C1954807lC();
                        }
                        return;
                    } else {
                        if (nLEEditor != null) {
                            nLEEditor.done();
                            return;
                        }
                        return;
                    }
                }
                if (nLEEditor != null) {
                    nLEEditor.commit();
                }
            }
        }
    }

    public static void LIZJ(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, NLEModel nLEModel, NLEEditor nLEEditor) {
        if (C351220Dpo.LLLLIL(nLETrackSlot)) {
            C351510DqH.LIZ.getClass();
            C351510DqH.LJIIIIZZ(nLEModel);
            String str = "";
            C351510DqH.LJIIJJI(nLEModel, NLETrackType.EFFECT, "");
            String strLJIIZILJ = C351220Dpo.LJIIZILJ(nLETrackSlot);
            if (strLJIIZILJ != null) {
                str = strLJIIZILJ;
            }
            LIZIZ(nLEModel, nLEEditor, new C350650Dot(nLETrackSlot2, str), EnumC356070Dxd.COMMIT);
        }
    }
}
