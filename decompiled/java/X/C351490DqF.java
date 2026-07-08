package X;

import android.util.Size;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.NLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframePropertyType;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLEMask;
import com.bytedance.ies.nle.editor_jni.NLESegmentMask;
import com.bytedance.ies.nle.editor_jni.NLESwingKeyframeUtil;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecDouble;
import com.bytedance.ies.nle.editor_jni.VecNLECommonKeyframe;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DqF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351490DqF {
    public static final C0EO0 LIZIZ(NLETrackSlot nLETrackSlot, InterfaceC361710EGb interfaceC361710EGb) {
        LiveState<Size> canvasSize;
        int width;
        int height;
        int width2;
        Size sizeLIZJ;
        Size sizeLIZJ2;
        Size sizeLIZJ3;
        Size sizeLIZJ4;
        if (interfaceC361710EGb == null || nLETrackSlot == null || (canvasSize = interfaceC361710EGb.getCanvasSize()) == null || canvasSize.LIZJ() == null) {
            return null;
        }
        LiveState<Size> canvasSize2 = interfaceC361710EGb.getCanvasSize();
        int height2 = 0;
        if (canvasSize2 != null && (sizeLIZJ4 = canvasSize2.LIZJ()) != null) {
            width = sizeLIZJ4.getWidth();
        } else {
            width = 0;
        }
        LiveState<Size> canvasSize3 = interfaceC361710EGb.getCanvasSize();
        if (canvasSize3 != null && (sizeLIZJ3 = canvasSize3.LIZJ()) != null) {
            height = sizeLIZJ3.getHeight();
        } else {
            height = 0;
        }
        Size size = new Size(width, height);
        LiveState<Size> liveStateUc2 = interfaceC361710EGb.uc2();
        if (liveStateUc2 != null && (sizeLIZJ2 = liveStateUc2.LIZJ()) != null) {
            width2 = sizeLIZJ2.getWidth();
        } else {
            width2 = 0;
        }
        LiveState<Size> liveStateUc22 = interfaceC361710EGb.uc2();
        if (liveStateUc22 != null && (sizeLIZJ = liveStateUc22.LIZJ()) != null) {
            height2 = sizeLIZJ.getHeight();
        }
        return C363770ENz.LIZIZ(nLETrackSlot, size, new Size(width2, height2));
    }

    public static final void LIZ(NLETrackSlot nLETrackSlot, C0EO0 c0eo0, C0EO0 c0eo02) {
        NLESegmentMask segment;
        float f;
        double dDoubleValue;
        NLEMask nLEMask = (NLEMask) C13LP.LJJJLL(nLETrackSlot.getMasks());
        if (nLEMask != null && (segment = nLEMask.getSegment()) != null && c0eo02 != null && c0eo0 != null) {
            float width = segment.getWidth() * c0eo02.LIZ;
            float height = segment.getHeight() * c0eo02.LIZIZ;
            float f2 = 2;
            float centerX = c0eo02.LIZJ + ((c0eo02.LIZ / f2) * segment.getCenterX());
            float centerY = c0eo02.LIZLLL - ((c0eo02.LIZIZ / f2) * segment.getCenterY());
            float f3 = c0eo02.LIZIZ;
            float f4 = c0eo02.LIZ;
            float f5 = f3 / f4;
            float f6 = c0eo0.LIZIZ;
            float f7 = c0eo0.LIZ;
            if (f5 > f6 / f7) {
                f = f3 / f6;
            } else {
                f = f4 / f7;
            }
            NLEKeyframeType nLEKeyframeType = NLEKeyframeType.Video;
            if (nLETrackSlot.swingKeyframesOfType(nLEKeyframeType).isEmpty()) {
                nLETrackSlot.setScale(nLETrackSlot.getScale() * f);
            } else {
                for (Map.Entry<String, NLEKeyframe> entry : nLETrackSlot.swingKeyframesOfType(nLEKeyframeType).entrySet()) {
                    if (Intrinsics.LJFF(entry.getKey(), NLESwingKeyframeUtil.keyframePropertyNameForType(NLEKeyframePropertyType.KeyframePropertyVideoScaleX)) || Intrinsics.LJFF(entry.getKey(), NLESwingKeyframeUtil.keyframePropertyNameForType(NLEKeyframePropertyType.KeyframePropertyVideoScaleY))) {
                        VecNLECommonKeyframe keyframes = entry.getValue().getKeyframes();
                        if (keyframes != null) {
                            for (NLECommonKeyframe nLECommonKeyframe : keyframes) {
                                Double d = (Double) C13LP.LJJJLL(nLECommonKeyframe.getValue());
                                if (d != null) {
                                    dDoubleValue = d.doubleValue();
                                } else {
                                    dDoubleValue = 1.0d;
                                }
                                nLECommonKeyframe.getValue().clear();
                                VecDouble vecDouble = new VecDouble();
                                vecDouble.add(Double.valueOf(dDoubleValue * ((double) f)));
                                nLECommonKeyframe.setValue(vecDouble);
                            }
                        }
                    }
                }
                nLETrackSlot.setScale(nLETrackSlot.getScale() * f);
            }
            float f8 = c0eo0.LIZIZ * f;
            float f9 = c0eo0.LIZ * f;
            segment.setWidth(width / f9);
            segment.setHeight(height / f8);
            segment.setCenterX((centerX - c0eo02.LIZJ) / (f9 / f2));
            segment.setCenterY((c0eo02.LIZLLL - centerY) / (f8 / f2));
        }
    }
}
