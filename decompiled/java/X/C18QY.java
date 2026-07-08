package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.LabelIcon;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.IconSize;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.LabelColor;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionLabelSingleConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18QY, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18QY {
    public static final C212337187r LIZ(PromotionLabel promotionLabel, Context context, PromotionLabelSingleConfig promotionLabelSingleConfig) {
        Image image;
        String str;
        String str2;
        String str3;
        String str4;
        int iIntValue;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        float fFloatValue;
        Image image2;
        Image image3;
        String str11;
        String str12;
        Integer numLIZJ;
        Integer numLIZJ2;
        Integer numLIZJ3;
        Integer numLIZJ4;
        Integer numLIZJ5;
        Integer numLIZJ6;
        Image image4;
        C212339187t c212339187t;
        PromotionLabelSingleConfig promotionLabelSingleConfig2 = promotionLabel.promotionLabelSingleConfig;
        if (promotionLabelSingleConfig2 == null) {
            promotionLabelSingleConfig2 = promotionLabelSingleConfig;
        }
        if (promotionLabelSingleConfig2 != null) {
            C18QZ c18qz = new C18QZ();
            String str13 = promotionLabel.text;
            if (str13 == null) {
                str13 = "";
            }
            c18qz.LJIILIIL = str13;
            Integer numValueOf = Integer.valueOf(promotionLabelSingleConfig2.textFont);
            LabelColor labelColor = promotionLabelSingleConfig2.textColor;
            if (labelColor != null) {
                str = labelColor.light;
                str2 = labelColor.dark;
            } else {
                str = null;
                str2 = null;
            }
            c18qz.LJIILJJIL = numValueOf;
            c18qz.LJIILL = str;
            c18qz.LJIILLIIL = str2;
            c18qz.LJIIZILJ = promotionLabel.extraText;
            Integer num = promotionLabelSingleConfig2.extraFont;
            LabelColor labelColor2 = promotionLabelSingleConfig2.extraColor;
            if (labelColor2 != null) {
                str3 = labelColor2.light;
                str4 = labelColor2.dark;
            } else {
                str3 = null;
                str4 = null;
            }
            Integer numValueOf2 = Integer.valueOf(promotionLabelSingleConfig2.extraPosition);
            c18qz.LJIJ = num;
            c18qz.LJIJI = str3;
            c18qz.LJIJJ = str4;
            if (numValueOf2 != null) {
                iIntValue = numValueOf2.intValue();
            } else {
                iIntValue = 0;
            }
            c18qz.LJIJJLI = iIntValue;
            LabelColor labelColor3 = promotionLabelSingleConfig2.bgColor;
            if (labelColor3 != null) {
                str5 = labelColor3.light;
                str6 = labelColor3.dark;
            } else {
                str5 = null;
                str6 = null;
            }
            c18qz.LJIIJJI = str5;
            c18qz.LJIIL = str6;
            LabelColor labelColor4 = promotionLabelSingleConfig2.countdownBgColor;
            if (labelColor4 != null) {
                str7 = labelColor4.light;
                str8 = labelColor4.dark;
            } else {
                str7 = null;
                str8 = null;
            }
            c18qz.LJJIFFI = str7;
            c18qz.LJJII = str8;
            c18qz.LJIIJ = promotionLabelSingleConfig2.radius;
            LabelColor labelColor5 = promotionLabelSingleConfig2.borderColor;
            if (labelColor5 != null) {
                str9 = labelColor5.light;
                str10 = labelColor5.dark;
            } else {
                str9 = null;
                str10 = null;
            }
            Float f = promotionLabelSingleConfig2.borderWidth;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            c18qz.LJJIII = str9;
            c18qz.LJJIIJ = str10;
            c18qz.LJJIIJZLJL = fFloatValue;
            LabelIcon labelIcon = promotionLabel.icon;
            if (labelIcon != null) {
                image2 = labelIcon.lightIcon;
                image3 = labelIcon.darkIcon;
            } else {
                image2 = null;
                image3 = null;
            }
            c18qz.LIZ = image2;
            c18qz.LIZIZ = image3;
            c18qz.LJFF = promotionLabelSingleConfig2.LIZ;
            c18qz.LIZJ = promotionLabelSingleConfig2.iconSize;
            c18qz.LIZLLL = promotionLabelSingleConfig2.ignoreIcon;
            c18qz.LJ = promotionLabelSingleConfig2.rtlIcon;
            c18qz.LJIIIZ = promotionLabelSingleConfig2.gap;
            c18qz.LJI = promotionLabelSingleConfig2.padding;
            Integer num2 = promotionLabelSingleConfig2.paddingLeft;
            Integer num3 = promotionLabelSingleConfig2.paddingRight;
            c18qz.LJII = num2;
            c18qz.LJIIIIZZ = num3;
            c18qz.LJJIIZ = promotionLabelSingleConfig2.hideTextWhenCountDown;
            Integer num4 = promotionLabelSingleConfig2.countdownFont;
            LabelColor labelColor6 = promotionLabelSingleConfig2.countdownColor;
            if (labelColor6 != null) {
                str11 = labelColor6.light;
                str12 = labelColor6.dark;
            } else {
                str11 = null;
                str12 = null;
            }
            c18qz.LJIL = num4;
            c18qz.LJJ = str11;
            c18qz.LJJI = str12;
            if (!C960203pA.LIZIZ(context) || (numLIZJ = C18QZ.LIZJ(c18qz.LJIILLIIL)) == null) {
                numLIZJ = C18QZ.LIZJ(c18qz.LJIILL);
                if (numLIZJ == null) {
                    numLIZJ = C1308910kAL.LIZJ(R.attr.wf, context);
                }
            }
            if (!C960203pA.LIZIZ(context) || (numLIZJ2 = C18QZ.LIZJ(c18qz.LJIJJ)) == null) {
                numLIZJ2 = C18QZ.LIZJ(c18qz.LJIJI);
                if (numLIZJ2 == null) {
                    numLIZJ2 = numLIZJ;
                }
            }
            if (!C960203pA.LIZIZ(context) || (numLIZJ3 = C18QZ.LIZJ(c18qz.LJJI)) == null) {
                numLIZJ3 = C18QZ.LIZJ(c18qz.LJJ);
                if (numLIZJ3 == null) {
                    numLIZJ3 = numLIZJ;
                }
            }
            if (!C960203pA.LIZIZ(context) || (numLIZJ4 = C18QZ.LIZJ(c18qz.LJIIL)) == null) {
                numLIZJ4 = C18QZ.LIZJ(c18qz.LJIIJJI);
            }
            if (!C960203pA.LIZIZ(context) || (numLIZJ5 = C18QZ.LIZJ(c18qz.LJJII)) == null) {
                numLIZJ5 = C18QZ.LIZJ(c18qz.LJJIFFI);
            }
            if (C960203pA.LIZIZ(context)) {
                numLIZJ6 = C18QZ.LIZJ(c18qz.LJJIII);
                if (numLIZJ6 == null) {
                    numLIZJ6 = C18QZ.LIZJ(c18qz.LJJIIJ);
                }
            } else {
                numLIZJ6 = C18QZ.LIZJ(c18qz.LJJIII);
            }
            if (!C960203pA.LIZIZ(context) || (image4 = c18qz.LIZIZ) == null) {
                image4 = c18qz.LIZ;
            }
            IconSize iconSize = c18qz.LIZJ;
            boolean z = c18qz.LIZLLL;
            boolean z2 = c18qz.LJ;
            int i = c18qz.LJI;
            Integer num5 = c18qz.LJII;
            Integer num6 = c18qz.LJIIIIZZ;
            int i2 = c18qz.LJIIIZ;
            C212339187t c212339187tLIZIZ = C18QZ.LIZIZ(c18qz.LJIILJJIL, numLIZJ, c18qz.LJIILIIL);
            String str14 = c18qz.LJIIZILJ;
            Integer num7 = c18qz.LJIJ;
            if (num7 == null) {
                num7 = c18qz.LJIILJJIL;
            }
            C212339187t c212339187tLIZIZ2 = C18QZ.LIZIZ(num7, numLIZJ2, str14);
            Integer num8 = c18qz.LJIL;
            if (num8 != null && numLIZJ3 != null) {
                C1003920cEQ c1003920cEQ = InterfaceC1003930cER.LJIILIIL;
                int iIntValue2 = num8.intValue();
                c1003920cEQ.getClass();
                c212339187t = new C212339187t("", C1003920cEQ.LIZ(iIntValue2), numLIZJ3.intValue());
            } else {
                c212339187t = null;
            }
            return new C212337187r(image4, iconSize, z, z2, i, num5, num6, i2, c212339187tLIZIZ, c212339187tLIZIZ2, c212339187t, C18QZ.LIZ(c18qz.LJJIIJZLJL, c18qz.LJIIJ, numLIZJ5, numLIZJ6), c18qz.LJIJJLI, C18QZ.LIZ(c18qz.LJJIIJZLJL, c18qz.LJIIJ, numLIZJ4, numLIZJ6), c18qz.LJFF, c18qz.LJJIIZ);
        }
        C18QZ c18qz2 = new C18QZ();
        if (!C960203pA.LIZIZ(context) || (image = c18qz2.LIZIZ) == null) {
            image = c18qz2.LIZ;
        }
        IconSize iconSize2 = new IconSize(12, 12);
        new IconSize(12, 12);
        return new C212337187r(image, iconSize2, false, false, 4, 4, 4, 3, C18QZ.LIZIZ(83, C1308910kAL.LIZJ(R.attr.wf, context), c18qz2.LJIILIIL), C18QZ.LIZIZ(83, C1308910kAL.LIZJ(R.attr.wf, context), c18qz2.LJIIZILJ), C18QZ.LIZIZ(83, C1308910kAL.LIZJ(R.attr.wf, context), null), C18QZ.LIZ(0.5f, 4, C1308910kAL.LIZJ(R.attr.wy, context), C1308910kAL.LIZJ(R.attr.x1, context)), 0, C18QZ.LIZ(0.5f, 4, C1308910kAL.LIZJ(R.attr.wy, context), C1308910kAL.LIZJ(R.attr.x1, context)), 16, false);
    }
}
