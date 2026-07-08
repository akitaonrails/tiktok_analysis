package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.ies.cutsame.util.Size;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPoint;
import com.bytedance.ies.nle.editor_jni.NLESegmentEmojiSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentImageSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTemplate;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyClip;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0FEx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386890FEx {
    public static final float LJFF(float f) {
        if (!C1441980ncy.LIZ()) {
            return f;
        }
        double d = f;
        if (Math.abs(((float) Math.rint(d)) - f) < 1.0E-4f) {
            return (float) Math.rint(d);
        }
        return f;
    }

    public static boolean LIZLLL(float f, float f2) {
        if (C1441960ncw.LIZ() && f < f2) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(float f, float f2, NLETrackSlot nLETrackSlot) {
        nLETrackSlot.setTransformY(nLETrackSlot.getTransformY() * (f2 / f));
    }

    public static void LIZ(NLETrackSlot nLETrackSlot, float f, float f2, boolean z) {
        if (f2 >= f) {
            LIZIZ(f, f2, nLETrackSlot);
            if (z) {
                nLETrackSlot.setRelativeHeight(nLETrackSlot.getRelativeHeight() * (f2 / f));
                return;
            }
            return;
        }
        float f3 = f / f2;
        nLETrackSlot.setTransformX(nLETrackSlot.getTransformX() * f3);
        if (!z) {
            return;
        }
        nLETrackSlot.setRelativeWidth(nLETrackSlot.getRelativeWidth() * f3);
    }

    public static void LIZJ(float f, NLEModel nLEModel, C1463670oBx c1463670oBx, Size size, Size size2, boolean z) {
        RectF rectF;
        float scale;
        float f2;
        float scale2;
        boolean z2;
        boolean z3;
        Float fValueOf;
        float rotation;
        Float fValueOf2;
        Float fValueOf3;
        Boolean boolValueOf;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        boolean zBooleanValue;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        VecNLETrackSlotSPtr slots;
        float scale3;
        float transformX;
        float transformY;
        float f8;
        VecNLETrackSlotSPtr slots2;
        float scale4;
        VecNLETrackSlotSPtr slots3;
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("crop, targetRatio=");
        sbLIZ.append(f);
        sbLIZ.append(", surface_w*h=(");
        sbLIZ.append(size.width);
        sbLIZ.append('*');
        sbLIZ.append(size.height);
        sbLIZ.append("), image_w*h=(");
        sbLIZ.append(size2.width);
        sbLIZ.append('*');
        sbLIZ.append(size2.height);
        sbLIZ.append(')');
        c1437510nVlLJJLIIIJ.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ));
        NLETrack mainTrack = nLEModel.getMainTrack();
        NLETrackSlot nLETrackSlot = null;
        if (mainTrack != null && (slots3 = mainTrack.getSlots()) != null) {
            nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots3);
        }
        float f9 = size2.width / size2.height;
        float f10 = size.width / size.height;
        new RectF();
        if (f9 >= f10) {
            float f11 = size.width / f9;
            float f12 = (size.height - f11) / 2;
            rectF = new RectF(0.0f, f12, size.width, f11 + f12);
            if (nLETrackSlot != null) {
                scale4 = nLETrackSlot.getScale();
            } else {
                scale4 = 1.0f;
            }
            f2 = 1.0f / scale4;
        } else {
            float f13 = size.height * f9;
            float f14 = (size.width - f13) / 2;
            rectF = new RectF(f14, 0.0f, f13 + f14, size.height);
            if (LIZLLL(f, f10)) {
                if (nLETrackSlot != null) {
                    scale2 = nLETrackSlot.getScale();
                } else {
                    scale2 = 1.0f;
                }
                f2 = 1.0f / scale2;
            } else {
                if (nLETrackSlot != null) {
                    scale = nLETrackSlot.getScale();
                } else {
                    scale = 1.0f;
                }
                f2 = f10 / (f9 * scale);
            }
        }
        if (!C1441960ncw.LIZ() && (nLETrackSlot == null || Float.valueOf(nLETrackSlot.getRotation()) == null || nLETrackSlot.getRotation() % 360 == 0.0f)) {
            Matrix matrix = new Matrix();
            if (nLETrackSlot != null) {
                scale3 = nLETrackSlot.getScale();
            } else {
                scale3 = 1.0f;
            }
            matrix.postScale(scale3, scale3, rectF.centerX(), rectF.centerY());
            if (nLETrackSlot != null) {
                transformX = nLETrackSlot.getTransformX();
            } else {
                transformX = 0.0f;
            }
            float f15 = transformX * size.width;
            if (nLETrackSlot != null) {
                transformY = nLETrackSlot.getTransformY();
            } else {
                transformY = 0.0f;
            }
            matrix.postTranslate(f15, transformY * size.height);
            matrix.mapRect(rectF);
            float fAbs = Math.abs(rectF.left / rectF.width());
            float fHeight = (((size.height - (size.width / f)) / 2) - rectF.top) / rectF.height();
            float f16 = fHeight + ((size2.width * f2) / (size2.height * f));
            float f18 = f2 + fAbs;
            if (nLETrackSlot != null && nLETrackSlot.getMirror_X()) {
                float f19 = 1;
                fAbs = f19 - fAbs;
                f8 = f19 - f18;
            } else {
                f8 = f18;
            }
            if (C295670BiP.LIZ()) {
                NLETrack mainTrack2 = nLEModel.getMainTrack();
                if (mainTrack2 != null && (slots2 = mainTrack2.getSlots()) != null) {
                    Iterator<NLETrackSlot> it2 = slots2.iterator();
                    while (it2.hasNext()) {
                        LJ(it2.next(), fAbs, fHeight, f8, fHeight, f8, f16, fAbs, f16);
                    }
                }
                z2 = false;
                z3 = true;
            } else {
                z2 = false;
                z3 = true;
                LJ(nLETrackSlot, fAbs, fHeight, f8, fHeight, f8, f16, fAbs, f16);
            }
        } else {
            z2 = false;
            z3 = true;
            C386900FEy c386900FEy = new C386900FEy(new RectF(0.0f, 0.0f, rectF.width(), rectF.height()));
            C346940Diu c346940Diu = new C346940Diu();
            if (nLETrackSlot != null) {
                fValueOf = Float.valueOf(nLETrackSlot.getScale());
            } else {
                fValueOf = Float.valueOf(1.0f);
            }
            c346940Diu.LIZJ = fValueOf;
            if (nLETrackSlot != null) {
                rotation = nLETrackSlot.getRotation();
            } else {
                rotation = 0.0f;
            }
            c346940Diu.LJFF = Float.valueOf(360.0f - (rotation % 360.0f));
            if (nLETrackSlot != null) {
                fValueOf2 = Float.valueOf(nLETrackSlot.getTransformY());
            } else {
                fValueOf2 = Float.valueOf(0.0f);
            }
            c346940Diu.LJ = fValueOf2;
            if (nLETrackSlot != null) {
                fValueOf3 = Float.valueOf(nLETrackSlot.getTransformX());
            } else {
                fValueOf3 = Float.valueOf(0.0f);
            }
            c346940Diu.LIZLLL = fValueOf3;
            if (nLETrackSlot != null) {
                boolValueOf = Boolean.valueOf(nLETrackSlot.getMirror_X());
            } else {
                boolValueOf = Boolean.FALSE;
            }
            c346940Diu.LJI = boolValueOf;
            float f20 = size.height;
            float f21 = size.width;
            Float f22 = c346940Diu.LIZLLL;
            if (f22 != null) {
                fFloatValue = f22.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            c386900FEy.LJFF = fFloatValue * f21;
            Float f23 = c346940Diu.LJ;
            if (f23 != null) {
                fFloatValue2 = f23.floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
            c386900FEy.LJI = fFloatValue2 * f20;
            c386900FEy.LJ = c386900FEy.LIZ.centerY();
            c386900FEy.LIZLLL = c386900FEy.LIZ.centerX();
            Float f24 = c346940Diu.LIZJ;
            if (f24 != null) {
                fFloatValue3 = f24.floatValue();
            } else {
                fFloatValue3 = 1.0f;
            }
            c386900FEy.LIZJ = fFloatValue3;
            Float f25 = c346940Diu.LJFF;
            if (f25 != null) {
                fFloatValue4 = f25.floatValue();
            } else {
                fFloatValue4 = 0.0f;
            }
            c386900FEy.LIZIZ = fFloatValue4;
            Boolean bool = c346940Diu.LJI;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c386900FEy.LJII = zBooleanValue;
            if (LIZLLL(f, f10)) {
                f3 = size.height;
            } else {
                f3 = size.width / f;
            }
            if (LIZLLL(f, f10)) {
                f4 = size.height * f;
            } else {
                f4 = size.width;
            }
            if (LIZLLL(f, f10)) {
                f5 = (size.width - (size.height * f)) / 2;
            } else {
                f5 = 0.0f;
            }
            if (LIZLLL(f, f10)) {
                f6 = 0.0f;
            } else {
                f6 = (size.height - (size.width / f)) / 2;
            }
            float f26 = f5 - rectF.left;
            float f27 = rectF.top;
            RectF rectF2 = new RectF(f26, f6 - f27, f4 + f26, (f6 + f3) - f27);
            float f28 = rectF2.left;
            float f29 = rectF2.top;
            float f30 = rectF2.right;
            float f31 = rectF2.bottom;
            float[] fArr = {f28, f29, f30, f29, f30, f31, f28, f31};
            Matrix matrix2 = new Matrix();
            Matrix matrix3 = new Matrix();
            if (c386900FEy.LJII) {
                f7 = -c386900FEy.LIZJ;
            } else {
                f7 = c386900FEy.LIZJ;
            }
            matrix3.postScale(f7, c386900FEy.LIZJ, c386900FEy.LIZ.centerX(), c386900FEy.LIZ.centerY());
            matrix3.postRotate(c386900FEy.LIZIZ, c386900FEy.LIZLLL, c386900FEy.LJ);
            matrix3.postTranslate(c386900FEy.LJFF, c386900FEy.LJI);
            matrix3.invert(matrix2);
            matrix2.mapPoints(fArr);
            if (C295670BiP.LIZ()) {
                NLETrack mainTrack3 = nLEModel.getMainTrack();
                if (mainTrack3 != null && (slots = mainTrack3.getSlots()) != null) {
                    Iterator<NLETrackSlot> it3 = slots.iterator();
                    while (it3.hasNext()) {
                        LJ(it3.next(), fArr[0] / rectF.width(), fArr[1] / rectF.height(), fArr[2] / rectF.width(), fArr[3] / rectF.height(), fArr[4] / rectF.width(), fArr[5] / rectF.height(), fArr[6] / rectF.width(), fArr[7] / rectF.height());
                    }
                }
            } else {
                LJ(nLETrackSlot, fArr[0] / rectF.width(), fArr[1] / rectF.height(), fArr[2] / rectF.width(), fArr[3] / rectF.height(), fArr[4] / rectF.width(), fArr[5] / rectF.height(), fArr[6] / rectF.width(), fArr[7] / rectF.height());
            }
        }
        C0FWA c0fwaLIZJ = c1463670oBx.LIZLLL().LIZJ();
        C346940Diu c346940Diu2 = new C346940Diu();
        c346940Diu2.LIZJ = Float.valueOf(1.0f);
        c346940Diu2.LIZLLL = Float.valueOf(0.0f);
        c346940Diu2.LJ = Float.valueOf(0.0f);
        c346940Diu2.LJFF = Float.valueOf(0.0f);
        c346940Diu2.LJI = Boolean.FALSE;
        c0fwaLIZJ.LJIIZILJ(c346940Diu2);
        if (z) {
            return;
        }
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            if (nLETrack.getTrackType() == NLETrackType.STICKER) {
                for (NLETrackSlot nLETrackSlot2 : nLETrack.getSlots()) {
                    if (NLESegmentTemplate.dynamicCast(nLETrackSlot2.getMainSegment()) != null) {
                        if (C1441960ncw.LIZ()) {
                            if (f < f10) {
                                nLETrackSlot2.setScale(nLETrackSlot2.getScale() * (f10 / f));
                            }
                            LIZ(nLETrackSlot2, f10, f, z2);
                        } else {
                            LIZIZ(f10, f, nLETrackSlot2);
                        }
                    } else if (NLESegmentInfoSticker.dynamicCast((NLENode) nLETrackSlot2.getMainSegment()) != null) {
                        if (C1441960ncw.LIZ()) {
                            if (f < f10) {
                                nLETrackSlot2.setScale(nLETrackSlot2.getScale() * (f10 / f));
                            }
                            LIZ(nLETrackSlot2, f10, f, z2);
                        } else {
                            LIZIZ(f10, f, nLETrackSlot2);
                        }
                    } else if (NLESegmentTextTemplate.dynamicCast(nLETrackSlot2.getMainSegment()) != null) {
                        if (C1441960ncw.LIZ()) {
                            if (f < f10) {
                                nLETrackSlot2.setScale(nLETrackSlot2.getScale() * (f10 / f));
                            }
                            LIZ(nLETrackSlot2, f10, f, z2);
                        } else {
                            LIZIZ(f10, f, nLETrackSlot2);
                        }
                    } else if (NLESegmentImageSticker.dynamicCast((NLENode) nLETrackSlot2.getMainSegment()) != null) {
                        if (C1441960ncw.LIZ()) {
                            LIZ(nLETrackSlot2, f10, f, z3);
                        } else {
                            LIZIZ(f10, f, nLETrackSlot2);
                            nLETrackSlot2.setRelativeHeight(nLETrackSlot2.getRelativeHeight() * (f / f10));
                        }
                    } else if (NLESegmentEmojiSticker.dynamicCast((NLENode) nLETrackSlot2.getMainSegment()) != null) {
                        if (C1441960ncw.LIZ()) {
                            LIZ(nLETrackSlot2, f10, f, z2);
                        } else {
                            LIZIZ(f10, f, nLETrackSlot2);
                        }
                    } else if (NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot2.getMainSegment()) != null) {
                        if (C1441960ncw.LIZ()) {
                            LIZ(nLETrackSlot2, f10, f, z2);
                        } else {
                            LIZIZ(f10, f, nLETrackSlot2);
                        }
                    }
                }
            }
        }
    }

    public static void LJ(NLETrackSlot nLETrackSlot, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLESegmentVideo nLESegmentVideoDynamicCast2;
        if (nLETrackSlot != null && (nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
            nLESegmentVideoDynamicCast2.setIsWithEffect(true);
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f9 = 1.0f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        } else if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        if (f5 < 0.0f) {
            f5 = 0.0f;
        } else if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 < 0.0f) {
            f8 = 0.0f;
        } else {
            if (f8 <= 1.0f) {
            }
            if (nLETrackSlot == null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
                NLEStyClip nLEStyClip = new NLEStyClip();
                NLEPoint leftUpper = nLEStyClip.getLeftUpper();
                if (leftUpper != null) {
                    leftUpper.setX(LJFF(C363400EMo.LIZ(f)));
                }
                NLEPoint leftUpper2 = nLEStyClip.getLeftUpper();
                if (leftUpper2 != null) {
                    leftUpper2.setY(LJFF(C363400EMo.LIZIZ(f2)));
                }
                NLEPoint rightUpper = nLEStyClip.getRightUpper();
                if (rightUpper != null) {
                    rightUpper.setX(LJFF(C363400EMo.LIZ(f3)));
                }
                NLEPoint rightUpper2 = nLEStyClip.getRightUpper();
                if (rightUpper2 != null) {
                    rightUpper2.setY(LJFF(C363400EMo.LIZIZ(f4)));
                }
                NLEPoint rightLower = nLEStyClip.getRightLower();
                if (rightLower != null) {
                    rightLower.setX(LJFF(C363400EMo.LIZ(f5)));
                }
                NLEPoint rightLower2 = nLEStyClip.getRightLower();
                if (rightLower2 != null) {
                    rightLower2.setY(LJFF(C363400EMo.LIZIZ(f6)));
                }
                NLEPoint leftLower = nLEStyClip.getLeftLower();
                if (leftLower != null) {
                    leftLower.setX(LJFF(C363400EMo.LIZ(f7)));
                }
                NLEPoint leftLower2 = nLEStyClip.getLeftLower();
                if (leftLower2 != null) {
                    leftLower2.setY(LJFF(C363400EMo.LIZIZ(f9)));
                }
                nLESegmentVideoDynamicCast.setClip(nLEStyClip);
                return;
            }
        }
        f9 = f8;
        if (nLETrackSlot == null) {
        }
    }
}
