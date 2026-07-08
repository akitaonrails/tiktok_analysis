package X;

import android.graphics.Matrix;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0nqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450420nqa {
    public static final C1450430nqb LIZ(NLETrackSlot nLETrackSlot) {
        float fFloatValue;
        boolean zBooleanValue;
        if (nLETrackSlot == null) {
            return null;
        }
        Integer numLJJJLZIJ = C351220Dpo.LJJJLZIJ(nLETrackSlot, "ep_crop_mode", null);
        Float fLJJJJJL = C351220Dpo.LJJJJJL(nLETrackSlot, "ep_crop_ratio", null);
        Float fLJJJJJL2 = C351220Dpo.LJJJJJL(nLETrackSlot, "crop_slider_rotation", null);
        float fFloatValue2 = 0.0f;
        if (fLJJJJJL2 != null) {
            fFloatValue = fLJJJJJL2.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        Float fValueOf = Float.valueOf(fFloatValue);
        Matrix matrixLIZ = C1449620npI.LIZ(nLETrackSlot);
        Boolean boolLJJII = C351220Dpo.LJJII(nLETrackSlot, "crop_mirror_x", null);
        if (boolLJJII != null) {
            zBooleanValue = boolLJJII.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        Float fLJJJJJL3 = C351220Dpo.LJJJJJL(nLETrackSlot, "crop_button_rotation", null);
        if (fLJJJJJL3 != null) {
            fFloatValue2 = fLJJJJJL3.floatValue();
        }
        return new C1450430nqb(numLJJJLZIJ, fLJJJJJL, fValueOf, matrixLIZ, boolValueOf, Float.valueOf(fFloatValue2), nLETrackSlot.getExtra("ep_crop_scale"), nLETrackSlot.getExtra("ep_crop_transX"), nLETrackSlot.getExtra("ep_crop_transY"), C351220Dpo.LJJII(nLETrackSlot, "crop_is_photo_cropped", null));
    }

    public static final void LIZIZ(NLETrackSlot nLETrackSlot, C1450430nqb c1450430nqb) {
        if (c1450430nqb != null && nLETrackSlot != null) {
            Integer num = c1450430nqb.LIZ;
            if (num != null) {
                nLETrackSlot.setExtra("ep_crop_mode", String.valueOf(num.intValue()));
            }
            Float f = c1450430nqb.LIZIZ;
            if (f != null) {
                nLETrackSlot.setExtra("ep_crop_ratio", String.valueOf(f.floatValue()));
            }
            Float f2 = c1450430nqb.LIZJ;
            if (f2 != null) {
                nLETrackSlot.setExtra("crop_slider_rotation", String.valueOf(f2.floatValue()));
            }
            Matrix matrix = c1450430nqb.LIZLLL;
            if (matrix != null) {
                nLETrackSlot.setExtra("crop_matrix", C1449620npI.LIZJ(matrix));
            }
            nLETrackSlot.setExtra("crop_mirror_x", String.valueOf(c1450430nqb.LJ));
            nLETrackSlot.setExtra("crop_button_rotation", String.valueOf(c1450430nqb.LJFF));
            nLETrackSlot.setExtra("crop_is_photo_cropped", String.valueOf(c1450430nqb.LJIIIZ));
            String str = c1450430nqb.LJI;
            if (str != null) {
                nLETrackSlot.setExtra("ep_crop_scale", str);
            }
            String str2 = c1450430nqb.LJII;
            if (str2 != null) {
                nLETrackSlot.setExtra("ep_crop_transX", str2);
            }
            String str3 = c1450430nqb.LJIIIIZZ;
            if (str3 != null) {
                nLETrackSlot.setExtra("ep_crop_transY", str3);
            }
        }
    }
}
