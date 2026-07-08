package X;

import android.graphics.PointF;
import com.ss.ugc.android.editor.core.api.params.MaskParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ENT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ENT {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final AbstractC363520ENa LIZ(MaskParam maskParam) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        float fFloatValue5;
        float fFloatValue6;
        float fFloatValue7;
        float fFloatValue8;
        if (maskParam == null) {
            return null;
        }
        Float f = maskParam.maskCenterX;
        float fFloatValue9 = 0.0f;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        Float f2 = maskParam.maskCenterY;
        if (f2 != null) {
            fFloatValue2 = f2.floatValue();
        } else {
            fFloatValue2 = 0.0f;
        }
        PointF pointF = new PointF(fFloatValue, fFloatValue2);
        Float f3 = maskParam.maskRotate;
        if (f3 != null) {
            fFloatValue3 = f3.floatValue();
        } else {
            fFloatValue3 = 0.0f;
        }
        Float f4 = maskParam.maskFeather;
        if (f4 != null) {
            fFloatValue4 = f4.floatValue();
        } else {
            fFloatValue4 = 0.0f;
        }
        C0ENU c0enu = new C0ENU(pointF, fFloatValue3, fFloatValue4, Intrinsics.LJFF(maskParam.invert, Boolean.TRUE), maskParam.LIZ, maskParam.resourceId);
        String str = maskParam.maskType;
        switch (str.hashCode()) {
            case -1360216880:
                if (str.equals("circle")) {
                    Float f5 = maskParam.maskWidth;
                    if (f5 != null) {
                        fFloatValue8 = f5.floatValue();
                    } else {
                        fFloatValue8 = 0.0f;
                    }
                    Float f6 = maskParam.maskHeight;
                    if (f6 != null) {
                        fFloatValue9 = f6.floatValue();
                    }
                    return new C0ENV(c0enu, fFloatValue8, fFloatValue9);
                }
                return null;
            case -1073910849:
                if (str.equals("mirror")) {
                    Float f7 = maskParam.maskHeight;
                    if (f7 != null) {
                        fFloatValue9 = f7.floatValue();
                    }
                    return new C0ENY(c0enu, fFloatValue9);
                }
                return null;
            case 3321844:
                if (str.equals("line")) {
                    return new C0ENZ(c0enu);
                }
                return null;
            case 3556653:
                if (str.equals("text")) {
                    String str2 = maskParam.text;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Float f8 = maskParam.textScaleX;
                    if (f8 != null) {
                        fFloatValue7 = f8.floatValue();
                    } else {
                        fFloatValue7 = 1.0f;
                    }
                    return new C0ENW(c0enu, str2, fFloatValue7, null, null);
                }
                return null;
            case 1121299823:
                if (str.equals("rectangle")) {
                    Float f9 = maskParam.maskWidth;
                    if (f9 != null) {
                        fFloatValue5 = f9.floatValue();
                    } else {
                        fFloatValue5 = 0.0f;
                    }
                    Float f10 = maskParam.maskHeight;
                    if (f10 != null) {
                        fFloatValue6 = f10.floatValue();
                    } else {
                        fFloatValue6 = 0.0f;
                    }
                    Float f11 = maskParam.maskRoundCorner;
                    if (f11 != null) {
                        fFloatValue9 = f11.floatValue();
                    }
                    return new C0ENX(c0enu, fFloatValue5, fFloatValue6, fFloatValue9);
                }
                return null;
            default:
                return null;
        }
    }

    public static final MaskParam LIZIZ(AbstractC363520ENa abstractC363520ENa) {
        String str;
        MaskParam maskParam;
        if (abstractC363520ENa == null) {
            return null;
        }
        C0ENU c0enuLIZ = abstractC363520ENa.LIZ();
        if (abstractC363520ENa instanceof C0ENY) {
            str = null;
            maskParam = new MaskParam(null, Float.valueOf(((C0ENY) abstractC363520ENa).LIZIZ), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), null, null, null, null, Boolean.FALSE, Float.valueOf(0.0f), "mirror", "", "");
        } else if (abstractC363520ENa instanceof C0ENZ) {
            str = null;
            maskParam = new MaskParam(null, null, Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), null, null, null, null, Boolean.FALSE, Float.valueOf(0.0f), "line", "", "");
        } else if (abstractC363520ENa instanceof C0ENV) {
            C0ENV c0env = (C0ENV) abstractC363520ENa;
            str = null;
            maskParam = new MaskParam(Float.valueOf(c0env.LIZIZ), Float.valueOf(c0env.LIZJ), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), null, null, null, null, Boolean.FALSE, Float.valueOf(0.0f), "circle", "", "");
        } else if (abstractC363520ENa instanceof C0ENX) {
            C0ENX c0enx = (C0ENX) abstractC363520ENa;
            float f = c0enx.LIZIZ;
            float f2 = c0enx.LIZJ;
            float f3 = c0enx.LIZLLL;
            str = null;
            maskParam = new MaskParam(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(f3), null, null, null, Boolean.FALSE, Float.valueOf(0.0f), "rectangle", "", "");
        } else {
            if (!(abstractC363520ENa instanceof C0ENW)) {
                return null;
            }
            C0ENW c0enw = (C0ENW) abstractC363520ENa;
            String str2 = c0enw.LIZIZ;
            float f4 = c0enw.LIZJ;
            str = null;
            maskParam = new MaskParam(null, null, Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), null, str2, Float.valueOf(f4), Float.valueOf(f4), Boolean.FALSE, Float.valueOf(0.0f), "text", "", "");
        }
        PointF pointF = c0enuLIZ.LIZ;
        float f5 = pointF.x;
        float f6 = pointF.y;
        float f7 = c0enuLIZ.LIZIZ;
        float f8 = c0enuLIZ.LIZJ;
        boolean z = c0enuLIZ.LIZLLL;
        String str3 = c0enuLIZ.LJ;
        return MaskParam.LIZ(maskParam, Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), str, Boolean.valueOf(z), Float.valueOf(f8), c0enuLIZ.LJFF, str3, 2531);
    }
}
