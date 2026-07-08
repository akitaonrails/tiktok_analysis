package X;

import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.0uHE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697580uHE {
    public static final Typeface LIZ(int i, float f, float f2, Float f3) {
        return LIZIZ(0.0f, i, f, f2, f3, 0.0f, 0, null, 224);
    }

    public static Typeface LIZIZ(float f, int i, float f2, float f3, Float f4, float f5, int i2, Map map, int i3) {
        String str;
        int i4 = i2;
        float f6 = f5;
        if ((i3 & 1) != 0) {
            f = 0.0f;
        }
        if ((i3 & 2) != 0) {
            i = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        }
        if ((i3 & 4) != 0) {
            f2 = 28.0f;
        }
        if ((i3 & 8) != 0) {
            f3 = 0.0f;
        }
        Map map2 = null;
        if ((i3 & 16) != 0) {
            f4 = null;
        }
        if ((i3 & 32) != 0) {
            f6 = 0.0f;
        }
        if ((i3 & 64) != 0) {
            i4 = 100;
        }
        if ((i3 & 128) == 0) {
            map2 = map;
        }
        int i5 = 0;
        boolean z = true;
        if (f6 == 0.0f) {
            if (f3 == 0.0f) {
                f6 = 0.0f;
            } else {
                f6 = (-6) * f3;
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (C1697120uGU.LIZIZ) {
                FontVariationAxis[] fontVariationAxisArr = {C1697120uGU.LIZ(f, "DRKM"), C1697120uGU.LIZ(i, "wght"), C1697120uGU.LIZ(f2, "opsz"), C1697120uGU.LIZ(f6, "slnt"), C1697120uGU.LIZ(i4, "wdth")};
                if (f3 <= 0.0f) {
                    z = false;
                }
                Typeface typefaceLIZLLL = C1301050jxf.LIZ().LIZLLL(fontVariationAxisArr, i, z);
                if (map2 != null) {
                    do {
                        FontVariationAxis fontVariationAxis = fontVariationAxisArr[i5];
                        map2.put(fontVariationAxis.getTag(), Float.valueOf(fontVariationAxis.getStyleValue()));
                        i5++;
                    } while (i5 < 5);
                    return typefaceLIZLLL;
                }
                return typefaceLIZLLL;
            }
            FontVariationAxis[] fontVariationAxisArr2 = {new FontVariationAxis("DRKM", f), new FontVariationAxis("wght", i), new FontVariationAxis("opsz", f2), new FontVariationAxis("slnt", f6), new FontVariationAxis("wdth", i4)};
            if (f3 <= 0.0f) {
                z = false;
            }
            Typeface typefaceLIZLLL2 = C1301050jxf.LIZ().LIZLLL(fontVariationAxisArr2, i, z);
            if (map2 != null) {
                do {
                    FontVariationAxis fontVariationAxis2 = fontVariationAxisArr2[i5];
                    map2.put(fontVariationAxis2.getTag(), Float.valueOf(fontVariationAxis2.getStyleValue()));
                    i5++;
                } while (i5 < 5);
                return typefaceLIZLLL2;
            }
            return typefaceLIZLLL2;
        }
        if (f4 != null) {
            f2 = f4.floatValue();
        }
        if (f2 > 17.0f) {
            if (i < 450) {
                str = "font/TikTok-Display-Regular.otf";
            } else if (i > 600) {
                str = "font/TikTok-Display-Bold.otf";
            } else {
                str = "font/TikTok-Display-Medium.otf";
            }
        } else if (i < 450) {
            str = "font/TikTok-Text-Regular.otf";
        } else if (i > 600) {
            str = "font/TikTok-Text-Bold.otf";
        } else {
            str = "font/TikTok-Text-Medium.otf";
        }
        return C1301050jxf.LIZ().LIZ(str);
    }
}
