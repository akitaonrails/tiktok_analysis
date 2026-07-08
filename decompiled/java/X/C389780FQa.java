package X;

import android.graphics.Matrix;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;

/* JADX INFO: renamed from: X.0FQa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389780FQa {
    public static final C21665819qi LIZ(NLETrackSlot nLETrackSlot) {
        String resourceFile;
        int iOrdinal;
        float fFloatValue;
        boolean zBooleanValue;
        float scale;
        float transformX;
        float transformY;
        float rotation;
        float fFloatValue2;
        NLEResourceNode resource;
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment == null || (resource = mainSegment.getResource()) == null || (resourceFile = resource.getResourceFile()) == null) {
            resourceFile = "";
        }
        EnumC375190EnN[] enumC375190EnNArrValues = EnumC375190EnN.values();
        Integer numLJJJLZIJ = C351220Dpo.LJJJLZIJ(nLETrackSlot, "ep_crop_mode", null);
        if (numLJJJLZIJ != null) {
            iOrdinal = numLJJJLZIJ.intValue();
        } else {
            iOrdinal = EnumC375190EnN.FREE.ordinal();
        }
        EnumC375190EnN enumC375190EnN = enumC375190EnNArrValues[iOrdinal];
        Float fLJJJJJL = C351220Dpo.LJJJJJL(nLETrackSlot, "ep_crop_ratio", null);
        Float fLJJJJJL2 = C351220Dpo.LJJJJJL(nLETrackSlot, "crop_slider_rotation", null);
        if (fLJJJJJL2 != null) {
            fFloatValue = fLJJJJJL2.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        Matrix matrixLIZ = C1449620npI.LIZ(nLETrackSlot);
        Boolean boolLJJII = C351220Dpo.LJJII(nLETrackSlot, "crop_mirror_x", null);
        int i = 0;
        if (boolLJJII != null) {
            zBooleanValue = boolLJJII.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (!Float.isNaN(nLETrackSlot.getScale()) && !Float.isInfinite(nLETrackSlot.getScale()) && nLETrackSlot.getScale() > 0.0f) {
            scale = nLETrackSlot.getScale();
        } else {
            scale = 1.0f;
        }
        if (!Float.isNaN(nLETrackSlot.getTransformX()) && !Float.isInfinite(nLETrackSlot.getTransformX())) {
            transformX = nLETrackSlot.getTransformX();
        } else {
            transformX = 0.0f;
        }
        if (!Float.isNaN(nLETrackSlot.getTransformY()) && !Float.isInfinite(nLETrackSlot.getTransformY())) {
            transformY = nLETrackSlot.getTransformY();
        } else {
            transformY = 0.0f;
        }
        if (!Float.isNaN(nLETrackSlot.getRotation()) && !Float.isInfinite(nLETrackSlot.getRotation())) {
            rotation = nLETrackSlot.getRotation();
        } else {
            rotation = 0.0f;
        }
        int i2 = C375120EnG.LIZ[enumC375190EnN.ordinal()];
        if (i2 != 1) {
            i = 3;
            if (i2 != 3) {
                if (i2 != 4) {
                    i = 6;
                    if (i2 != 5) {
                        if (i2 != 6) {
                            if (i2 != 7) {
                                i = 1;
                            } else {
                                i = 4;
                            }
                        } else {
                            i = 5;
                        }
                    }
                }
            } else {
                i = 2;
            }
        }
        Float fLJJJJJL3 = C351220Dpo.LJJJJJL(nLETrackSlot, "crop_button_rotation", null);
        if (fLJJJJJL3 != null) {
            fFloatValue2 = fLJJJJJL3.floatValue();
        } else {
            fFloatValue2 = 0.0f;
        }
        return new C21665819qi(resourceFile, i, fLJJJJJL, fFloatValue, matrixLIZ, fFloatValue2, zBooleanValue, scale, transformX, transformY, rotation);
    }

    public static final void LIZIZ(NLETrackSlot nLETrackSlot, SingleImageData singleImageData) {
        if (singleImageData.getEditImageInfo().getRatioMode() >= 0 && !nLETrackSlot.hasExtra("ep_crop_mode")) {
            nLETrackSlot.setExtra("ep_crop_mode", String.valueOf(C375130EnH.LIZ(singleImageData.getEditImageInfo().getRatioMode()).ordinal()));
        }
        if (nLETrackSlot.hasExtra("ep_crop_ratio") || singleImageData.getEditImageInfo().getScaleAfterCrop() == null || singleImageData.getEditImageInfo().getRatio() <= 0.0f) {
            return;
        }
        nLETrackSlot.setExtra("ep_crop_ratio", String.valueOf(singleImageData.getEditImageInfo().getRatio()));
    }
}
