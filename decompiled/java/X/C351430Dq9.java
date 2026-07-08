package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0Dq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351430Dq9 {
    public static final EnumC355980DxU LIZ(EnumC355990DxV enumC355990DxV) {
        switch (C351440DqA.LIZ[enumC355990DxV.ordinal()]) {
            case 1:
                return EnumC355980DxU.OVERLAY;
            case 2:
                return EnumC355980DxU.STICKER;
            case 3:
                return EnumC355980DxU.FILTER;
            case 4:
                return EnumC355980DxU.EFFECT;
            case 5:
                return EnumC355980DxU.ADJUST;
            case 6:
            case 7:
                return EnumC355980DxU.TEXT;
            default:
                throw new C1954807lC();
        }
    }

    public static final EnumC355980DxU LIZIZ(NLETrackSlot nLETrackSlot) {
        for (EnumC355980DxU enumC355980DxU : EnumC355980DxU.values()) {
            IntRange layerRange = enumC355980DxU.getLayerRange();
            int i = layerRange.LL;
            int i2 = layerRange.LLILLJJLI;
            int transformZ = nLETrackSlot.getTransformZ();
            if (i <= transformZ && transformZ <= i2) {
                return enumC355980DxU;
            }
        }
        return null;
    }
}
