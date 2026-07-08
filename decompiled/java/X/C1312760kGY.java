package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.lynx.base.log.LynxLog;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0kGY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312760kGY {
    public static void LIZJ(Canvas canvas, Paint paint, Rect rect, int[] iArr, int[] iArr2, EnumC1313350kHV[] enumC1313350kHVArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        EnumC1313350kHV enumC1313350kHV;
        EnumC1313350kHV enumC1313350kHV2;
        EnumC1313350kHV enumC1313350kHV3;
        if (iArr.length == 4 && iArr2 != null && iArr2.length == 4 && enumC1313350kHVArr.length == 4) {
            int i8 = iArr[0];
            int i9 = iArr[1];
            int i10 = iArr[2];
            int i11 = iArr[3];
            Paint paint2 = paint;
            if (i8 > 0 || i10 > 0 || i9 > 0 || i11 > 0) {
                int i12 = iArr2[0];
                int i13 = iArr2[1];
                int i14 = iArr2[2];
                int i15 = iArr2[3];
                int i16 = rect.left;
                int i17 = rect.top;
                paint2.setAntiAlias(false);
                paint2.setStyle(Paint.Style.STROKE);
                int i18 = -1;
                if (i8 > 0) {
                    i = i12;
                } else {
                    i = -1;
                }
                if (i9 > 0) {
                    i2 = i13;
                } else {
                    i2 = -1;
                }
                int i19 = i & i2;
                if (i10 > 0) {
                    i3 = i14;
                } else {
                    i3 = -1;
                }
                int i20 = i19 & i3;
                if (i11 > 0) {
                    i18 = i15;
                }
                int i21 = i18 & i20;
                if (i8 > 0) {
                    i4 = i12;
                } else {
                    i4 = 0;
                }
                if (i9 > 0) {
                    i5 = i13;
                } else {
                    i5 = 0;
                }
                int i22 = i4 | i5;
                if (i10 > 0) {
                    i6 = i14;
                } else {
                    i6 = 0;
                }
                int i23 = i22 | i6;
                if (i11 > 0) {
                    i7 = i15;
                } else {
                    i7 = 0;
                }
                if (i21 != (i23 | i7)) {
                    i21 = 0;
                }
                if (i21 != 0 && (enumC1313350kHV = enumC1313350kHVArr[0]) == (enumC1313350kHV2 = enumC1313350kHVArr[1]) && enumC1313350kHV2 == (enumC1313350kHV3 = enumC1313350kHVArr[2]) && enumC1313350kHV3 == enumC1313350kHVArr[3] && enumC1313350kHV.isSolidDashedOrDotted()) {
                    if (Color.alpha(i21) != 0) {
                        int i24 = rect.right;
                        int i25 = rect.bottom;
                        EnumC1313350kHV enumC1313350kHV4 = enumC1313350kHVArr[1];
                        if (i8 == i9 && i9 == i10 && i10 == i11 && enumC1313350kHV4 == EnumC1313350kHV.SOLID) {
                            paint2.setStyle(Paint.Style.STROKE);
                            float f = i8;
                            paint2.setStrokeWidth(f);
                            paint2.setColor(i21);
                            float f2 = f * 0.5f;
                            canvas.drawRect(new RectF(i16 + f2, i17 + f2, i24 - f2, i25 - f2), paint2);
                        } else {
                            if (i9 > 0) {
                                float f3 = i9;
                                float f4 = i17 + (f3 * 0.5f);
                                enumC1313350kHV4.strokeBorderLine(canvas, paint2, 1, f3, i21, i16, f4, i24 - Math.max(i10, 0), f4, i24 - i16, f3);
                            }
                            if (i10 > 0) {
                                float f5 = i10;
                                float f6 = i24 - (f5 * 0.5f);
                                enumC1313350kHV4.strokeBorderLine(canvas, paint2, 2, f5, i21, f6, i17, f6, i25 - Math.max(i11, 0), i25 - i17, f5);
                            }
                            if (i11 > 0) {
                                float f7 = i11;
                                float f8 = i25 - (f7 * 0.5f);
                                enumC1313350kHV4.strokeBorderLine(canvas, paint2, 3, f7, i21, i24, f8, Math.max(i8, 0) + i16, f8, i24 - i16, f7);
                            }
                            if (i8 > 0) {
                                float f9 = i8;
                                float f10 = i16 + (0.5f * f9);
                                paint2 = paint2;
                                enumC1313350kHV4.strokeBorderLine(canvas, paint2, 0, f9, i21, f10, i25, f10, Math.max(i9, 0) + i17, i25 - i17, f9);
                            }
                        }
                    }
                } else {
                    int iWidth = rect.width();
                    int iHeight = rect.height();
                    if (i9 > 0 && Color.alpha(i13) != 0) {
                        float f11 = i17 + i9;
                        int i26 = i16 + iWidth;
                        float f12 = i26 - i10;
                        float f13 = i26;
                        float f14 = i17;
                        float f15 = i9;
                        float f16 = f14 + (f15 * 0.5f);
                        canvas.save();
                        float f18 = i16;
                        LIZ(canvas, f18, f14, i16 + i8, f11, f12, f11, f13, f14);
                        enumC1313350kHVArr[1].strokeBorderLine(canvas, paint2, 1, f15, i13, f18, f16, f13, f16, iWidth, f15);
                        canvas.restore();
                    }
                    if (i10 > 0 && Color.alpha(i14) != 0) {
                        int i27 = i16 + iWidth;
                        float f19 = i27;
                        float f20 = i17 + iHeight;
                        float f21 = i27 - i10;
                        float f22 = i10;
                        float f23 = f19 - (f22 * 0.5f);
                        canvas.save();
                        float f24 = i17;
                        LIZ(canvas, f19, f24, f19, f20, f21, r10 - i11, f21, i17 + i9);
                        enumC1313350kHVArr[2].strokeBorderLine(canvas, paint2, 2, f22, i14, f23, f24, f23, f20, iHeight, f22);
                        canvas.restore();
                    }
                    if (i11 > 0 && Color.alpha(i15) != 0) {
                        int i28 = i17 + iHeight;
                        float f25 = i28;
                        int i29 = i16 + iWidth;
                        float f26 = i29;
                        float f27 = i29 - i10;
                        float f28 = i28 - i11;
                        float f29 = i11;
                        float f30 = f25 - (f29 * 0.5f);
                        canvas.save();
                        float f31 = i16;
                        LIZ(canvas, f31, f25, f26, f25, f27, f28, i16 + i8, f28);
                        enumC1313350kHVArr[3].strokeBorderLine(canvas, paint2, 3, f29, i15, f26, f30, f31, f30, iWidth, f29);
                        canvas.restore();
                    }
                    if (i8 > 0 && Color.alpha(i12) != 0) {
                        float f32 = i16 + i8;
                        float f33 = i9 + i17;
                        int i30 = i17 + iHeight;
                        float f34 = i30 - i11;
                        float f35 = i30;
                        float f36 = i16;
                        float f37 = i8;
                        float f38 = f36 + (0.5f * f37);
                        canvas.save();
                        float f39 = i17;
                        LIZ(canvas, f36, f39, f32, f33, f32, f34, f36, f35);
                        enumC1313350kHVArr[0].strokeBorderLine(canvas, paint2, 0, f37, i12, f38, f35, f38, f39, iHeight, f37);
                        canvas.restore();
                    }
                }
            }
            paint2.setAntiAlias(true);
        }
    }

    public static void LIZ(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        Path path = new Path();
        path.reset();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        path.lineTo(f5, f6);
        path.lineTo(f7, f8);
        path.lineTo(f, f2);
        canvas.clipPath(path);
    }

    public static void LIZLLL(Canvas canvas, Paint paint, EnumC1313350kHV enumC1313350kHV, int i, int i2, float f, float f2, C1312720kGU c1312720kGU, C1312720kGU c1312720kGU2) {
        PathEffect pathEffect;
        int iDarkenColor = i2;
        switch (C1313460kHg.LIZ[enumC1313350kHV.ordinal()]) {
            case 1:
            case 2:
                return;
            case 3:
            case 4:
                pathEffect = enumC1313350kHV.getPathEffect(f);
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(C1312780kGa.LIZ(iDarkenColor, 255));
                paint.setStrokeWidth(f2);
                paint.setPathEffect(pathEffect);
                paint.setAntiAlias(true);
                new C1312750kGX(c1312720kGU, c1312720kGU2, EnumC1312770kGZ.CENTER).LIZIZ(canvas, paint);
                paint.setPathEffect(null);
            case 5:
                break;
            case 6:
                if (i == 1 || i == 0) {
                    iDarkenColor = EnumC1313350kHV.darkenColor(iDarkenColor);
                }
                break;
            case 7:
                if (i == 3 || i == 2) {
                    iDarkenColor = EnumC1313350kHV.darkenColor(iDarkenColor);
                }
                break;
            case 8:
                LJ(canvas, paint, i, f / 3.0f, iDarkenColor, iDarkenColor, true, c1312720kGU, c1312720kGU2);
                return;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJ(canvas, paint, i, f / 2.0f, iDarkenColor, EnumC1313350kHV.darkenColor(iDarkenColor), false, c1312720kGU, c1312720kGU2);
                return;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJ(canvas, paint, i, f / 2.0f, EnumC1313350kHV.darkenColor(iDarkenColor), iDarkenColor, false, c1312720kGU, c1312720kGU2);
                return;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unsupported border style: ");
                sbLIZ.append(enumC1313350kHV);
                LynxLog.e("BorderDrawingUtil", C2188811AlT.LIZIZ(sbLIZ));
                break;
        }
        pathEffect = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(C1312780kGa.LIZ(iDarkenColor, 255));
        paint.setStrokeWidth(f2);
        paint.setPathEffect(pathEffect);
        paint.setAntiAlias(true);
        new C1312750kGX(c1312720kGU, c1312720kGU2, EnumC1312770kGZ.CENTER).LIZIZ(canvas, paint);
        paint.setPathEffect(null);
    }

    public static void LJ(Canvas canvas, Paint paint, int i, float f, int i2, int i3, boolean z, C1312720kGU c1312720kGU, C1312720kGU c1312720kGU2) {
        int i4;
        EnumC1312770kGZ enumC1312770kGZ;
        EnumC1312770kGZ enumC1312770kGZ2;
        paint.setPathEffect(null);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        boolean z2 = true;
        if (i != 1 && i != 0) {
            z2 = false;
            i4 = i2;
        } else {
            i4 = i3;
        }
        paint.setColor(C1312780kGa.LIZ(i4, 255));
        if (z) {
            enumC1312770kGZ = EnumC1312770kGZ.OUTER3;
        } else {
            enumC1312770kGZ = EnumC1312770kGZ.OUTER2;
        }
        new C1312750kGX(c1312720kGU, c1312720kGU2, enumC1312770kGZ).LIZIZ(canvas, paint);
        if (!z2) {
            i2 = i3;
        }
        paint.setColor(C1312780kGa.LIZ(i2, 255));
        if (z) {
            enumC1312770kGZ2 = EnumC1312770kGZ.INNER3;
        } else {
            enumC1312770kGZ2 = EnumC1312770kGZ.INNER2;
        }
        new C1312750kGX(c1312720kGU, c1312720kGU2, enumC1312770kGZ2).LIZIZ(canvas, paint);
    }

    public static void LIZIZ(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, C1312720kGU c1312720kGU, C1312720kGU c1312720kGU2) {
        if (z) {
            Path path = new Path();
            path.addRoundRect(c1312720kGU.LIZ, c1312720kGU.LIZIZ, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.INTERSECT);
            Path path2 = new Path();
            path2.addRoundRect(c1312720kGU2.LIZ, c1312720kGU2.LIZIZ, Path.Direction.CW);
            canvas.clipPath(path2, Region.Op.DIFFERENCE);
        }
        LIZ(canvas, f, f2, f3, f4, f5, f6, f7, f8);
    }
}
