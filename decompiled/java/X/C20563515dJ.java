package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.resultoperator.ThresholdAdaptionResultOperator;

/* JADX INFO: renamed from: X.15dJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20563515dJ {
    public static VideoAdaptionResult LIZIZ(int i, int i2, int i3, int i4, InterfaceC20567015ds interfaceC20567015ds) {
        int i5 = C20564315dR.LIZ[interfaceC20567015ds.getAlignType().ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new C1954807lC();
                }
            } else {
                i = (i3 * i2) / i4;
            }
        } else {
            i2 = (i4 * i) / i3;
        }
        return new VideoAdaptionResult(i, i2, Float.valueOf(0.0f), Float.valueOf(0.0f), interfaceC20567015ds);
    }

    public static ThresholdAdaptionResultOperator LIZ(float f, float f2, int i, int i2, int i3, int i4) {
        boolean z;
        float f3;
        EnumC20563615dK enumC20563615dK;
        EnumC20564215dQ enumC20564215dQ;
        int i5 = i2 * i3;
        int i6 = i4 * i;
        if (i5 > i6) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f3 = 1.0f - (i6 / i5);
            if (f3 > f) {
                enumC20563615dK = EnumC20563615dK.FIT;
                enumC20564215dQ = EnumC20564215dQ.WIDTH;
            } else {
                enumC20563615dK = EnumC20563615dK.CROP;
                enumC20564215dQ = EnumC20564215dQ.HEIGHT;
            }
        } else {
            f3 = 1.0f - (i5 / i6);
            if (f3 > f2) {
                enumC20563615dK = EnumC20563615dK.FIT;
                enumC20564215dQ = EnumC20564215dQ.HEIGHT;
            } else {
                enumC20563615dK = EnumC20563615dK.CROP;
                enumC20564215dQ = EnumC20564215dQ.WIDTH;
            }
        }
        return new ThresholdAdaptionResultOperator(enumC20563615dK, enumC20564215dQ, f3);
    }
}
