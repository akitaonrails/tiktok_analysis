package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;

/* JADX INFO: renamed from: X.0Dii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346820Dii {
    public static final void LIZ(InterfaceC1452170ntP interfaceC1452170ntP, boolean z) {
        NLEEditor nLEEditor;
        float f;
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
        if (c348100DkmLIZIZ != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
            nLEEditor.getModel().getTracks();
            for (NLETrack nLETrack : nLEEditor.getModel().getTracks()) {
                if (nLETrack.getTrackType() == NLETrackType.STICKER) {
                    for (NLETrackSlot nLETrackSlot : nLETrack.getSlots()) {
                        NLESegmentInfoSticker nLESegmentInfoStickerDynamicCast = NLESegmentInfoSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                        if (nLESegmentInfoStickerDynamicCast != null) {
                            if (z) {
                                f = 1.0f;
                            } else {
                                f = 0.0f;
                            }
                            nLESegmentInfoStickerDynamicCast.setAlpha(f);
                        }
                        if (NLESegmentTextTemplate.dynamicCast(nLETrackSlot.getMainSegment()) != null) {
                            nLETrackSlot.setEnable(z);
                        }
                    }
                }
            }
            nLEEditor.commit();
            nLEEditor.done();
        }
    }
}
