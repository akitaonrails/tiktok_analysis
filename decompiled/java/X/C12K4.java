package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.12K4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12K4 {
    public static final InnerEffectTextLayoutConfig LIZ(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, float f) {
        ArrayList arrayList = new ArrayList();
        for (InnerEffectTextConfig innerEffectTextConfig : innerEffectTextLayoutConfig.getTextConfigs()) {
            arrayList.add(innerEffectTextConfig.copy(innerEffectTextConfig.paddingStart, innerEffectTextConfig.paddingEnd, innerEffectTextConfig.paddingTop, innerEffectTextConfig.paddingBottom, innerEffectTextConfig.layerWeight, innerEffectTextConfig.marginStart, innerEffectTextConfig.marginEnd, innerEffectTextConfig.marginTop, innerEffectTextConfig.marginBottom, (int) (innerEffectTextConfig.getTextSize() * f), innerEffectTextConfig.maxLine, innerEffectTextConfig.minWidth, innerEffectTextConfig.minHeight, innerEffectTextConfig.replaceStringColor, innerEffectTextConfig.typefacePath, innerEffectTextConfig.fontStyle, innerEffectTextConfig.paintStyle, innerEffectTextConfig.textColorStart, innerEffectTextConfig.textColorEnd, innerEffectTextConfig.gradientType, innerEffectTextConfig.gradientOrientation, innerEffectTextConfig.gravity, innerEffectTextConfig.spacingMult, innerEffectTextConfig.spacingAdd, innerEffectTextConfig.spacingLetter, innerEffectTextConfig.cursorColor, innerEffectTextConfig.strokeConfigs, innerEffectTextConfig.coverConfigs, innerEffectTextConfig.bgConfigs, innerEffectTextConfig.shadowConfig, innerEffectTextConfig.extraConfig));
        }
        return innerEffectTextLayoutConfig.copy(innerEffectTextLayoutConfig.layoutType, innerEffectTextLayoutConfig.orientation, innerEffectTextLayoutConfig.rotation, innerEffectTextLayoutConfig.paddingStart, innerEffectTextLayoutConfig.paddingEnd, innerEffectTextLayoutConfig.paddingTop, innerEffectTextLayoutConfig.paddingBottom, arrayList, innerEffectTextLayoutConfig.extraConfig);
    }
}
