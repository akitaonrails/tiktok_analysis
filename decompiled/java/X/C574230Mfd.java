package X;

import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;

/* JADX INFO: renamed from: X.0Mfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574230Mfd {
    public static VEImageTransformFilterParam LIZ(int i) {
        VEImageTransformFilterParam vEImageTransformFilterParam = new VEImageTransformFilterParam();
        if (i == VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN) {
            vEImageTransformFilterParam.beginScale = 1.0f;
            vEImageTransformFilterParam.endScale = 1.1f;
            return vEImageTransformFilterParam;
        }
        if (i == VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT) {
            vEImageTransformFilterParam.beginScale = 1.1f;
            vEImageTransformFilterParam.endScale = 1.0f;
            return vEImageTransformFilterParam;
        }
        return null;
    }
}
