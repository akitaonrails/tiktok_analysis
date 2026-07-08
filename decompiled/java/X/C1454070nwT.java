package X;

import com.bytedance.ies.cutsame.util.Size;
import com.bytedance.ies.nle.editor_jni.NLESegmentMask;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;

/* JADX INFO: renamed from: X.0nwT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454070nwT {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Size LIZ;
    public final float LIZIZ = 0.75f;
    public final float LIZJ;

    public C1454070nwT(Size size) {
        this.LIZ = size;
        this.LIZJ = size.width / size.height;
    }

    public final void LIZ(NLETrackSlot nLETrackSlot, NLESegmentMask nLESegmentMask, SrcImageInfo srcImageInfo) {
        float fMax;
        float width = nLESegmentMask.getWidth();
        float height = nLESegmentMask.getHeight();
        float imageRatio = srcImageInfo.getImageRatio();
        float f = this.LIZJ;
        if (imageRatio >= f) {
            fMax = Math.max(width / 1.0f, height / (f / imageRatio));
        } else {
            fMax = Math.max(width / (imageRatio / f), height / 1.0f);
        }
        nLETrackSlot.setScale(fMax);
        nLETrackSlot.setTransformX(nLESegmentMask.getCenterX() / 2.0f);
        nLETrackSlot.setTransformY((-nLESegmentMask.getCenterY()) / 2.0f);
        nLETrackSlot.setRotation(0.0f);
        nLETrackSlot.setExtra("collage_max_scale", String.valueOf(3.0f * fMax));
        nLETrackSlot.setExtra("collage_min_scale", String.valueOf(fMax * 0.6f));
    }
}
