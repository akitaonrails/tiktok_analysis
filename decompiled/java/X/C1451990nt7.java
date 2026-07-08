package X;

import com.ss.android.ugc.aweme.creative.model.edit.SingleAdjustInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0nt7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451990nt7 {
    public static final Map<String, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair("adjust_item_enhance", "color_enhancement"), new Pair("adjust_item_exposure", "exposure"), new Pair("adjust_item_brightness", "brightness"), new Pair("adjust_item_contrast", "contrast"), new Pair("adjust_item_highlight", "highlight"), new Pair("adjust_item_shadow", "shadow"), new Pair("adjust_item_saturation", "saturation"), new Pair("adjust_item_warmth", "temperature"), new Pair("adjust_item_tint", "tone"), new Pair("adjust_item_noise", "grain"));

    public static final Map<String, SingleAdjustInfo> LIZ() {
        List listLJIIJJI = C1697810uHb.LJIIJJI("adjust_item_enhance", "adjust_item_exposure", "adjust_item_brightness", "adjust_item_contrast", "adjust_item_highlight", "adjust_item_shadow", "adjust_item_saturation", "adjust_item_warmth", "adjust_item_tint", "adjust_item_noise");
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJIIJJI, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : listLJIIJJI) {
            String str = (String) obj;
            float fLIZIZ = C1404000mdi.LIZIZ(str);
            C1460830o7N.LIZ.getClass();
            linkedHashMap.put(obj, new SingleAdjustInfo(fLIZIZ, C1460830o7N.LIZ(str)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final EnumC356010DxX LIZIZ(String str) {
        switch (str.hashCode()) {
            case -1977202274:
                if (str.equals("adjust_item_noise")) {
                    return EnumC356010DxX.ADJUST_NOISE;
                }
                break;
            case -1347629768:
                if (str.equals("adjust_item_highlight")) {
                    return EnumC356010DxX.ADJUST_HIGHLIGHT;
                }
                break;
            case -1143516110:
                if (str.equals("adjust_item_enhance")) {
                    return EnumC356010DxX.ADJUST_ENHANCE;
                }
                break;
            case -1027299556:
                if (str.equals("adjust_item_shadow")) {
                    return EnumC356010DxX.ADJUST_SHADOW;
                }
                break;
            case -918732363:
                if (str.equals("adjust_item_warmth")) {
                    return EnumC356010DxX.ADJUST_TEMPERATURE;
                }
                break;
            case -562029565:
                if (str.equals("adjust_item_exposure")) {
                    return EnumC356010DxX.ADJUST_EXPOSURE;
                }
                break;
            case 585354190:
                if (str.equals("adjust_item_saturation")) {
                    return EnumC356010DxX.ADJUST_SATURATION;
                }
                break;
            case 767676407:
                if (str.equals("adjust_item_tint")) {
                    return EnumC356010DxX.ADJUST_TINT;
                }
                break;
            case 797028862:
                if (str.equals("adjust_item_contrast")) {
                    return EnumC356010DxX.ADJUST_CONTRAST;
                }
                break;
            case 1464007757:
                if (str.equals("adjust_item_brightness")) {
                    return EnumC356010DxX.ADJUST_BRIGHTNESS;
                }
                break;
        }
        return EnumC356010DxX.UNKNOWN;
    }
}
