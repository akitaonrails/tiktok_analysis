package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CustomCaptionTemplateData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0EKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362850EKl {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(CaptionTemplateData captionTemplateData) {
        ArrayList arrayList = new ArrayList();
        String str = captionTemplateData.fontId;
        if (str != null) {
            arrayList.add(str);
        }
        String str2 = captionTemplateData.styleId;
        if (str2 != null) {
            arrayList.add(str2);
        }
        String str3 = captionTemplateData.textAnimId;
        if (str3 != null) {
            arrayList.add(str3);
        }
        String str4 = captionTemplateData.captionAnimId;
        if (str4 != null) {
            arrayList.add(str4);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (C365460EUm.LIZJ((String) it2.next()) == null) {
                return false;
            }
        }
        return true;
    }

    public static TextStickerModel LIZ(TextStickerModel textStickerModel, CustomCaptionTemplateData customCaptionTemplateData) {
        TextStyleModel textStyleModelLIZ;
        if (customCaptionTemplateData.fontModel.fileName.length() == 0) {
            customCaptionTemplateData.fontModel = C363470EMv.LJ(customCaptionTemplateData.fontModel, textStickerModel.getFontModel().fontSize);
        }
        CaptionTemplateModel captionTemplateModelLIZ = CaptionTemplateModel.LIZ(textStickerModel.getCaptionTemplateModel(), false, null, customCaptionTemplateData, false, false, false, 49);
        TextFontModel textFontModelLIZ = TextFontModel.LIZ(customCaptionTemplateData.fontModel, null, null, null, null, null, null, textStickerModel.getFontModel().fontSize, 0, null, null, false, false, 0, 16319);
        TextMotionModel textMotionModelLIZ = TextMotionModel.LIZ(customCaptionTemplateData.textMotionModel, null, 0.0f, 0, null, null, 0, false, 1023);
        int i = customCaptionTemplateData.mode;
        int i2 = customCaptionTemplateData.textColor;
        TextStyleModel textStyleModel = customCaptionTemplateData.textStyle;
        if (textStyleModel != null) {
            textStyleModelLIZ = TextStyleModel.LIZ(textStyleModel, null, null, null, null, false, null, 2047);
        } else {
            textStyleModelLIZ = null;
        }
        return TextStickerModel.copy$default(textStickerModel, null, null, null, null, null, i, i2, 0, 0.0f, textFontModelLIZ, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, textMotionModelLIZ, null, true, null, null, false, false, captionTemplateModelLIZ, textStyleModelLIZ, null, null, null, null, false, false, null, false, false, false, null, -1342177889, 65511, null);
    }
}
