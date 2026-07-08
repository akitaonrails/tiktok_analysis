package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLEStyStickerAnim;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0DkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347970DkZ extends AbstractC348060Dki {
    public final C348440DlK LIZIZ;

    public C347970DkZ(C348440DlK c348440DlK) {
        this.LIZIZ = c348440DlK;
    }

    @Override // X.AbstractC348060Dki
    public final void LIZJ(NLEEditor nLEEditor) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" 1.executeNLE ");
        sbLIZ.append(this.LIZIZ);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
        NLETrackSlot nLETrackSlotLIZ = C14LJ.LIZ(nLEEditor.getModel(), this.LIZIZ.LIZIZ);
        if (nLETrackSlotLIZ != null) {
            LJII(nLETrackSlotLIZ);
        }
    }

    public final void LJII(NLETrackSlot nLETrackSlot) {
        int iIntValue;
        int layer = nLETrackSlot.getLayer();
        int i = this.LIZIZ.LIZJ;
        if (layer != i) {
            nLETrackSlot.setLayer(i);
        }
        nLETrackSlot.setStartTime(this.LIZIZ.LIZLLL * 1000);
        long j = this.LIZIZ.LJ;
        long j2 = -2;
        if (j != -2) {
            j2 = j * 1000;
        }
        nLETrackSlot.setEndTime(j2);
        float f = 2;
        nLETrackSlot.setTransformX((this.LIZIZ.LJFF - 0.5f) * f);
        nLETrackSlot.setTransformY((0.5f - this.LIZIZ.LJI) * f);
        nLETrackSlot.setRotation(this.LIZIZ.LJII);
        nLETrackSlot.setScale(this.LIZIZ.LJIIJ);
        NLESegmentSticker nLESegmentStickerDynamicCast = NLESegmentSticker.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentStickerDynamicCast != null) {
            C348440DlK c348440DlK = this.LIZIZ;
            int i2 = c348440DlK.LJIIIZ;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        nLESegmentStickerDynamicCast.setAlpha(0.3137255f);
                    }
                } else {
                    nLESegmentStickerDynamicCast.setAlpha(c348440DlK.LJIIIIZZ);
                }
            } else {
                nLESegmentStickerDynamicCast.setAlpha(1.0f);
            }
            C347990Dkb c347990Dkb = this.LIZIZ.LJIIJJI;
            if (c347990Dkb == null) {
                nLESegmentStickerDynamicCast.setAnimation(null);
                return;
            }
            if (nLESegmentStickerDynamicCast.getAnimation() == null) {
                nLESegmentStickerDynamicCast.setAnimation(new NLEStyStickerAnim());
            }
            NLEStyStickerAnim animation = nLESegmentStickerDynamicCast.getAnimation();
            Integer num = c347990Dkb.LIZJ;
            int iIntValue2 = 0;
            if (num != null) {
                iIntValue = (int) (((long) num.intValue()) * 1000);
            } else {
                iIntValue = 0;
            }
            animation.setInDuration(iIntValue);
            Integer num2 = c347990Dkb.LJ;
            if (num2 != null) {
                iIntValue2 = (int) (((long) num2.intValue()) * 1000);
            }
            animation.setOutDuration(iIntValue2);
            animation.setLoop(c347990Dkb.LIZ);
            String str = c347990Dkb.LIZIZ;
            if (str != null) {
                if (animation.getInAnim() == null) {
                    animation.setInAnim(new NLEResourceNode());
                }
                animation.getInAnim().setResourceFile(str);
            }
            String str2 = c347990Dkb.LIZLLL;
            if (str2 == null) {
                return;
            }
            if (animation.getOutAnim() == null) {
                animation.setOutAnim(new NLEResourceNode());
            }
            animation.getOutAnim().setResourceFile(str2);
        }
    }
}
