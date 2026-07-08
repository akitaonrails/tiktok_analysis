package X;

import android.graphics.Color;
import com.bytedance.android.livesdk.model.ColorBackground;
import com.bytedance.android.livesdk.model.EdgeInsets;
import com.bytedance.android.livesdk.model.RichTextStyle;
import com.bytedance.android.livesdk.model.StrokeStyle;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Ge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C050200Ge {
    public static RichTextStyle LIZIZ(int i) {
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    return new RichTextStyle();
                }
            } else {
                RichTextStyle richTextStyle = new RichTextStyle();
                ColorBackground colorBackground = new ColorBackground();
                EdgeInsets edgeInsets = new EdgeInsets();
                edgeInsets.top = 10.0f;
                edgeInsets.bottom = 10.0f;
                edgeInsets.right = 14.0f;
                edgeInsets.left = 14.0f;
                colorBackground.padding = edgeInsets;
                colorBackground.radius = 25.0f;
                richTextStyle.inlineBackground = colorBackground;
                richTextStyle.lineSpacing = 10.0f;
                return richTextStyle;
            }
        }
        RichTextStyle richTextStyle2 = new RichTextStyle();
        StrokeStyle strokeStyle = new StrokeStyle();
        strokeStyle.width = 12.0f;
        if (i == 4) {
            strokeStyle.offsetY = 7.5f;
            strokeStyle.offsetX = 7.5f;
        }
        richTextStyle2.stroke = strokeStyle;
        return richTextStyle2;
    }

    public static RichTextStyle LIZ(int i, String str) {
        int iLIZIZ;
        if (str == null) {
            str = "#FFFFFFFF";
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        RichTextStyle richTextStyle = new RichTextStyle();
                        richTextStyle.color = str;
                        return richTextStyle;
                    }
                } else {
                    Pair pairLIZ = C202500qF.LIZ(ColorProtector.parseColor(str));
                    int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
                    int iIntValue2 = ((Number) pairLIZ.getSecond()).intValue();
                    RichTextStyle richTextStyle2 = new RichTextStyle();
                    richTextStyle2.color = C202500qF.LJ(iIntValue2);
                    ColorBackground colorBackground = new ColorBackground();
                    colorBackground.color = C202500qF.LJ(iIntValue);
                    colorBackground.radius = 25.0f;
                    EdgeInsets edgeInsets = new EdgeInsets();
                    edgeInsets.top = 10.0f;
                    edgeInsets.bottom = 10.0f;
                    edgeInsets.left = 14.0f;
                    edgeInsets.right = 14.0f;
                    colorBackground.padding = edgeInsets;
                    richTextStyle2.inlineBackground = colorBackground;
                    richTextStyle2.lineSpacing = 10.0f;
                    return richTextStyle2;
                }
            } else {
                Pair pairLIZ2 = C202500qF.LIZ(ColorProtector.parseColor(str));
                int iIntValue3 = ((Number) pairLIZ2.getFirst()).intValue();
                int iIntValue4 = ((Number) pairLIZ2.getSecond()).intValue();
                RichTextStyle richTextStyle3 = new RichTextStyle();
                richTextStyle3.color = C202500qF.LJ(iIntValue3);
                ColorBackground colorBackground2 = new ColorBackground();
                colorBackground2.color = C202500qF.LJ(iIntValue4);
                colorBackground2.radius = 25.0f;
                EdgeInsets edgeInsets2 = new EdgeInsets();
                edgeInsets2.top = 10.0f;
                edgeInsets2.bottom = 10.0f;
                edgeInsets2.left = 14.0f;
                edgeInsets2.right = 14.0f;
                colorBackground2.padding = edgeInsets2;
                richTextStyle3.inlineBackground = colorBackground2;
                richTextStyle3.lineSpacing = 13.0f;
                return richTextStyle3;
            }
        }
        int color = ColorProtector.parseColor(str);
        float[] fArr = new float[3];
        Color.colorToHSV(color, fArr);
        if (fArr[2] < 0.5f) {
            iLIZIZ = C202500qF.LIZIZ(color, -1);
        } else {
            iLIZIZ = C202500qF.LIZIZ(color, -16777216);
        }
        RichTextStyle richTextStyle4 = new RichTextStyle();
        richTextStyle4.color = str;
        StrokeStyle strokeStyle = new StrokeStyle();
        strokeStyle.color = C202500qF.LJ(iLIZIZ);
        richTextStyle4.stroke = strokeStyle;
        return richTextStyle4;
    }

    public static void LIZJ(RichTextStyle richTextStyle, RichTextStyle richTextStyle2) {
        StrokeStyle strokeStyle;
        float fFloatValue;
        ColorBackground colorBackground;
        ColorBackground colorBackground2;
        boolean z;
        float fFloatValue2;
        boolean z2;
        float fFloatValue3;
        boolean z3;
        float fFloatValue4;
        float fFloatValue5;
        boolean z4;
        float fFloatValue6;
        boolean z5;
        boolean z6;
        float fFloatValue7;
        boolean z7;
        boolean z8;
        float fFloatValue8;
        boolean z9;
        float fFloatValue9;
        boolean z10;
        float fFloatValue10;
        String str = richTextStyle2.fontFamily;
        EdgeInsets edgeInsets = null;
        if (!Boolean.valueOf(!Intrinsics.LJFF(str, "")).booleanValue() || str == null) {
            str = richTextStyle.fontFamily;
        }
        richTextStyle.fontFamily = str;
        String str2 = richTextStyle2.color;
        if (!Boolean.valueOf(!Intrinsics.LJFF(str2, "")).booleanValue() || str2 == null) {
            str2 = richTextStyle.color;
        }
        richTextStyle.color = str2;
        StrokeStyle strokeStyle2 = richTextStyle2.stroke;
        boolean z11 = false;
        if (strokeStyle2 != null) {
            strokeStyle = richTextStyle.stroke;
            if (strokeStyle == null) {
                strokeStyle = new StrokeStyle();
            }
            String str3 = strokeStyle2.color;
            if (str3.length() > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!Boolean.valueOf(z7).booleanValue()) {
                str3 = strokeStyle.color;
            }
            strokeStyle.color = str3;
            Float fValueOf = Float.valueOf(strokeStyle2.width);
            if (fValueOf.floatValue() == 0.0f) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (Boolean.valueOf(!z8).booleanValue()) {
                fFloatValue8 = fValueOf.floatValue();
            } else {
                fFloatValue8 = strokeStyle.width;
            }
            strokeStyle.width = fFloatValue8;
            Float fValueOf2 = Float.valueOf(strokeStyle2.offsetX);
            if (fValueOf2.floatValue() == 0.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (Boolean.valueOf(!z9).booleanValue()) {
                fFloatValue9 = fValueOf2.floatValue();
            } else {
                fFloatValue9 = strokeStyle.offsetX;
            }
            strokeStyle.offsetX = fFloatValue9;
            Float fValueOf3 = Float.valueOf(strokeStyle2.offsetY);
            if (fValueOf3.floatValue() == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (Boolean.valueOf(!z10).booleanValue()) {
                fFloatValue10 = fValueOf3.floatValue();
            } else {
                fFloatValue10 = strokeStyle.offsetY;
            }
            strokeStyle.offsetY = fFloatValue10;
        } else {
            strokeStyle = null;
        }
        richTextStyle.stroke = strokeStyle;
        Float fValueOf4 = Float.valueOf(richTextStyle2.lineSpacing);
        if (Boolean.valueOf(!Intrinsics.LIZLLL(fValueOf4, 0.0f)).booleanValue() && fValueOf4 != null) {
            fFloatValue = fValueOf4.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        richTextStyle.lineSpacing = fFloatValue;
        ColorBackground colorBackground3 = richTextStyle2.colorBackground;
        if (colorBackground3 != null) {
            colorBackground = richTextStyle.colorBackground;
            if (colorBackground == null) {
                colorBackground = new ColorBackground();
            }
            String str4 = colorBackground3.color;
            if (!Boolean.valueOf(!Intrinsics.LJFF(str4, "")).booleanValue() || str4 == null) {
                str4 = colorBackground.color;
            }
            colorBackground.color = str4;
            Float fValueOf5 = Float.valueOf(colorBackground3.radius);
            if (fValueOf5.floatValue() == 0.0f) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (Boolean.valueOf(!z6).booleanValue()) {
                fFloatValue7 = fValueOf5.floatValue();
            } else {
                fFloatValue7 = colorBackground.radius;
            }
            colorBackground.radius = fFloatValue7;
        } else {
            colorBackground = null;
        }
        richTextStyle.colorBackground = colorBackground;
        ColorBackground colorBackground4 = richTextStyle2.inlineBackground;
        if (colorBackground4 != null) {
            colorBackground2 = richTextStyle.inlineBackground;
            if (colorBackground2 == null) {
                colorBackground2 = new ColorBackground();
            }
            String str5 = colorBackground4.color;
            if (!Boolean.valueOf(!Intrinsics.LJFF(str5, "")).booleanValue() || str5 == null) {
                str5 = colorBackground2.color;
            }
            colorBackground2.color = str5;
            Float fValueOf6 = Float.valueOf(colorBackground4.radius);
            if (fValueOf6.floatValue() == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (Boolean.valueOf(!z4).booleanValue()) {
                fFloatValue6 = fValueOf6.floatValue();
            } else {
                fFloatValue6 = colorBackground2.radius;
            }
            colorBackground2.radius = fFloatValue6;
            EdgeInsets edgeInsets2 = colorBackground4.padding;
            if (edgeInsets2 != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!Boolean.valueOf(z5).booleanValue() || edgeInsets2 == null) {
                edgeInsets2 = colorBackground2.padding;
            }
            colorBackground2.padding = edgeInsets2;
        } else {
            colorBackground2 = null;
        }
        richTextStyle.inlineBackground = colorBackground2;
        EdgeInsets edgeInsets3 = richTextStyle2.padding;
        if (edgeInsets3 != null) {
            edgeInsets = richTextStyle.padding;
            if (edgeInsets == null) {
                edgeInsets = new EdgeInsets();
            }
            Float fValueOf7 = Float.valueOf(edgeInsets3.left);
            if (fValueOf7.floatValue() == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (Boolean.valueOf(!z).booleanValue()) {
                fFloatValue2 = fValueOf7.floatValue();
            } else {
                fFloatValue2 = edgeInsets.left;
            }
            edgeInsets.left = fFloatValue2;
            Float fValueOf8 = Float.valueOf(edgeInsets3.right);
            if (fValueOf8.floatValue() == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (Boolean.valueOf(!z2).booleanValue()) {
                fFloatValue3 = fValueOf8.floatValue();
            } else {
                fFloatValue3 = edgeInsets.right;
            }
            edgeInsets.right = fFloatValue3;
            Float fValueOf9 = Float.valueOf(edgeInsets3.top);
            if (fValueOf9.floatValue() == 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (Boolean.valueOf(!z3).booleanValue()) {
                fFloatValue4 = fValueOf9.floatValue();
            } else {
                fFloatValue4 = edgeInsets.top;
            }
            edgeInsets.top = fFloatValue4;
            Float fValueOf10 = Float.valueOf(edgeInsets3.bottom);
            if (fValueOf10.floatValue() == 0.0f) {
                z11 = true;
            }
            if (Boolean.valueOf(!z11).booleanValue()) {
                fFloatValue5 = fValueOf10.floatValue();
            } else {
                fFloatValue5 = edgeInsets.bottom;
            }
            edgeInsets.bottom = fFloatValue5;
        }
        richTextStyle.padding = edgeInsets;
    }
}
