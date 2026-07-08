package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import java.util.List;

/* JADX INFO: renamed from: X.0FAS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FAS {
    public static final int LIZ(TextStickerModel textStickerModel) {
        if (textStickerModel.getTextTemplateModel().isGroupTextTemplates) {
            return textStickerModel.getCompatModel().getSelectSlotIndex();
        }
        return 0;
    }

    public static final void LIZIZ(TextStickerModel textStickerModel) {
        if (textStickerModel.getTextTemplateModel().isGroupTextTemplates) {
            List<Boolean> useDefaultColors = textStickerModel.getTextTemplateModel().editState.getUseDefaultColors();
            if (useDefaultColors.isEmpty() && C19719512Dh.LJI(useDefaultColors)) {
                Boolean bool = Boolean.TRUE;
                ListProtector.add(useDefaultColors, 0, bool);
                ListProtector.add(useDefaultColors, 1, bool);
            }
            Boolean bool2 = (Boolean) C13LP.LJJJLZIJ(textStickerModel.getCompatModel().getSelectSlotIndex(), useDefaultColors);
            if (bool2 != null) {
                bool2.booleanValue();
                if (C19719512Dh.LJI(useDefaultColors)) {
                    ListProtector.set(useDefaultColors, textStickerModel.getCompatModel().getSelectSlotIndex(), Boolean.FALSE);
                    return;
                }
                return;
            }
            return;
        }
        textStickerModel.getTextTemplateModel().useDefaultColor = false;
    }

    public static final boolean LIZJ(TextTemplateModel textTemplateModel, int i) {
        if (textTemplateModel.isGroupTextTemplates) {
            Boolean bool = (Boolean) C13LP.LJJJLZIJ(i, textTemplateModel.editState.getUseDefaultAligns());
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }
        return textTemplateModel.useDefaultAlign;
    }

    public static final boolean LIZLLL(TextTemplateModel textTemplateModel, int i) {
        if (textTemplateModel.isGroupTextTemplates) {
            Boolean bool = (Boolean) C13LP.LJJJLZIJ(i, textTemplateModel.editState.getUseDefaultColors());
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }
        return textTemplateModel.useDefaultColor;
    }

    public static final boolean LJ(TextTemplateModel textTemplateModel, int i) {
        if (textTemplateModel.isGroupTextTemplates) {
            Boolean bool = (Boolean) C13LP.LJJJLZIJ(i, textTemplateModel.editState.getUseDefaultFonts());
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }
        return textTemplateModel.useDefaultFont;
    }
}
