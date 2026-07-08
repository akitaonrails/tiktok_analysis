package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgPromotionLabel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18Q5, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18Q5 {
    public static C341650DaN LIZ(Context context, EcUgPromotionLabel ecUgPromotionLabel) {
        EcUgPromotionLabel.Text text;
        String str;
        List<String> urls;
        List<String> urls2;
        C03IT imageUrlModel;
        int iIntValue;
        int iIntValue2;
        C341650DaN c341650DaN = new C341650DaN(context);
        Integer num = ecUgPromotionLabel.style;
        if (num != null) {
            if (num.intValue() == 1) {
                Image image = ecUgPromotionLabel.image;
                if (image != null && (imageUrlModel = image.toImageUrlModel()) != null) {
                    Integer width = ecUgPromotionLabel.image.getWidth();
                    if (width != null) {
                        iIntValue = width.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Integer height = ecUgPromotionLabel.image.getHeight();
                    if (height != null) {
                        iIntValue2 = height.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (iIntValue > 0 && iIntValue2 > 0) {
                        C786410Ut5.LLFF(0, c341650DaN.getIvPromotionImageFromXml());
                        C786410Ut5.G6(c341650DaN.getIvPromotionImageFromXml(), new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(16 * (iIntValue / iIntValue2)))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
                        Drawable drawableLJ = C1308910kAL.LJ(R.attr.bv, c341650DaN.getContext());
                        C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(imageUrlModel);
                        c1331670kl3LJIIJ.LJJIIZI(drawableLJ);
                        c1331670kl3LJIIJ.LJIL(drawableLJ);
                        c1331670kl3LJIIJ.LJJ = EnumC1338240kve.CENTER_CROP;
                        c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.HIGH;
                        c1331670kl3LJIIJ.LIZLLL("ec_ug_vsa");
                        c1331670kl3LJIIJ.LJJ(c341650DaN.getIvPromotionImageFromXml());
                        C786410Ut5.h3(c1331670kl3LJIIJ);
                        return c341650DaN;
                    }
                }
            } else if (num.intValue() == 2 && (text = ecUgPromotionLabel.text) != null && (str = text.content) != null && !a0.LJJJIL(str)) {
                C426750GoL.LJIIL(c341650DaN, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 16);
                Image image2 = ecUgPromotionLabel.icon;
                if (image2 != null && (urls = image2.getUrls()) != null && !urls.isEmpty()) {
                    C786410Ut5.LLFF(0, c341650DaN.getIvPromotionIconFromXml());
                    Image image3 = ecUgPromotionLabel.icon;
                    if (image3 != null) {
                        urls2 = image3.getUrls();
                    } else {
                        urls2 = null;
                    }
                    C1331670kl3 c1331670kl3LJIIJ2 = C1331660kl2.LJIIJ(new C03IT(urls2));
                    c1331670kl3LJIIJ2.LJJ = EnumC1338240kve.FIT_CENTER;
                    c1331670kl3LJIIJ2.LJJIII = EnumC1334360kpO.HIGH;
                    c1331670kl3LJIIJ2.LIZLLL("ec_ug_vsa");
                    c1331670kl3LJIIJ2.LJJ(c341650DaN.getIvPromotionIconFromXml());
                    C786410Ut5.h3(c1331670kl3LJIIJ2);
                } else {
                    C786410Ut5.LLFF(8, c341650DaN.getIvPromotionIconFromXml());
                }
                EcUgPromotionLabel.Text text2 = ecUgPromotionLabel.text;
                if (text2 != null) {
                    C786410Ut5.LLLLZLL(c341650DaN.getTvPromotionFromXml(), 0);
                    c341650DaN.getTvPromotionFromXml().setText(text2.content);
                    String str2 = text2.color;
                    if (str2 != null) {
                        TuxTextView tvPromotionFromXml = c341650DaN.getTvPromotionFromXml();
                        Integer numLIZ = C200600pw.LIZ(tvPromotionFromXml.getContext(), null, C200600pw.LIZIZ(str2), "#FFFFFFFF");
                        if (numLIZ != null) {
                            tvPromotionFromXml.setTextColor(numLIZ.intValue());
                        }
                    }
                }
                EcUgPromotionLabel.BackgroundColor backgroundColor = ecUgPromotionLabel.backGroundColor;
                if (backgroundColor != null) {
                    C426750GoL.LJIIL(c341650DaN, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 16);
                    EcUgPromotionLabel.BackgroundColor.LinearGradientColor linearGradientColor = backgroundColor.linearGradientColor;
                    if (linearGradientColor != null) {
                        C341640DaM.LIZ(c341650DaN, C200600pw.LIZIZ(linearGradientColor.leftColor), C200600pw.LIZIZ(linearGradientColor.rightColor), null, null, 4, 26);
                        return c341650DaN;
                    }
                    String str3 = backgroundColor.solidColor;
                    if (str3 != null) {
                        String strLIZIZ = C200600pw.LIZIZ(str3);
                        C341640DaM.LIZ(c341650DaN, strLIZIZ, strLIZIZ, null, null, 4, 2);
                        return c341650DaN;
                    }
                }
                return c341650DaN;
            }
        }
        return null;
    }
}
