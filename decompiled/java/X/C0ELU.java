package X;

import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0ELU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ELU {
    public static final C0ELV LIZIZ(NLETrackSlot nLETrackSlot) {
        float alpha;
        float transformX = nLETrackSlot.getTransformX();
        float transformY = nLETrackSlot.getTransformY();
        int transformZ = nLETrackSlot.getTransformZ();
        float scale = nLETrackSlot.getScale();
        float rotation = nLETrackSlot.getRotation();
        NLESegmentVideo nLESegmentVideoLIZ = C351170Dpj.LIZ(nLETrackSlot);
        if (nLESegmentVideoLIZ != null) {
            alpha = nLESegmentVideoLIZ.getAlpha();
        } else {
            alpha = 1.0f;
        }
        return new C0ELV(transformZ, transformX, transformY, scale, rotation, alpha);
    }

    public static final void LIZ(NLETrackSlot nLETrackSlot, C0ELV c0elv) {
        nLETrackSlot.setTransformX(c0elv.LIZ);
        nLETrackSlot.setTransformY(c0elv.LIZIZ);
        nLETrackSlot.setTransformZ(c0elv.LIZJ);
        nLETrackSlot.setScale(c0elv.LIZLLL);
        nLETrackSlot.setRotation(c0elv.LJ);
        NLESegmentVideo nLESegmentVideoLIZ = C351170Dpj.LIZ(nLETrackSlot);
        if (nLESegmentVideoLIZ != null) {
            nLESegmentVideoLIZ.setAlpha(c0elv.LJFF);
        }
    }
}
