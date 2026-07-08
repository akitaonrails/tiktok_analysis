package X;

import android.graphics.PointF;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateStyle;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMentionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0F8Y, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F8Y {
    public static final TextStickerInfo LIZ(TextStickerModel textStickerModel) {
        Pair<Integer, Integer> pairLJI;
        int i = C385340F8y.LLJLLL;
        int i2 = 1;
        if (!C0F8K.LIZ(textStickerModel.getMode(), true)) {
            pairLJI = new Pair<>(Integer.valueOf(textStickerModel.getColor()), 0);
        } else {
            pairLJI = C0F9I.LJI(textStickerModel.getMode(), textStickerModel.getColor());
        }
        int iIntValue = pairLJI.getFirst().intValue();
        int iIntValue2 = pairLJI.getSecond().intValue();
        if (iIntValue == iIntValue2) {
            iIntValue = -16777216;
            iIntValue2 = -1;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('#');
        sbLIZ.append(C786410Ut5.j4("%08x", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1)));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append('#');
        sbLIZ2.append(C786410Ut5.j4("%08x", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue2)}, 1)));
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        C391040FUw c391040FUw = C388300FKi.LIZ;
        int align = textStickerModel.getAlign();
        if (align != 1) {
            i2 = 2;
            if (align == 2 || align != 3) {
                i2 = 0;
            }
        }
        C19591311kt c19591311kt = C19591311kt.LIZ;
        PointF pointF = new PointF(textStickerModel.getBaseStickerModel().getWidth(), textStickerModel.getBaseStickerModel().getHeight());
        float mediaWidth = textStickerModel.getBaseStickerModel().getMediaWidth();
        float mediaHeight = textStickerModel.getBaseStickerModel().getMediaHeight();
        c19591311kt.getClass();
        PointF pointFLIZ = C19591311kt.LIZ(pointF, mediaWidth, mediaHeight);
        return new TextStickerInfo(strLIZIZ2, strLIZIZ, "", pointFLIZ.x, pointFLIZ.y, 28, i2);
    }

    public static final String LJ(TextStickerModel textStickerModel) {
        String str;
        if (textStickerModel.getTextTemplateModel().isGroupTextTemplates) {
            SubTemplateInfo subTemplateInfo = (SubTemplateInfo) C13LP.LJJJLZIJ(textStickerModel.getCompatModel().getSelectSlotIndex(), textStickerModel.getCompatModel().getSubTemplates());
            if (subTemplateInfo == null || (str = subTemplateInfo.text) == null) {
                return "";
            }
            return str;
        }
        return textStickerModel.getTextStr();
    }

    public static final boolean LJFF(TextStickerModel textStickerModel) {
        boolean z;
        List<TextMentionModel> mentionList = textStickerModel.getMentionList();
        if (mentionList != null && !mentionList.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public static final boolean LJI(TextStickerModel textStickerModel) {
        TTSModel ttsModel = textStickerModel.getTtsModel();
        if (ttsModel == null || !ttsModel.hasReadTextAudio) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(TextStickerModel textStickerModel) {
        if (textStickerModel.getSourceType() == C0F7S.AI_CAPTION) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(TextStickerModel textStickerModel) {
        if (textStickerModel.getCaptionModel() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIZ(TextStickerModel textStickerModel) {
        if (textStickerModel.getTextTemplateModel().enableTextTemplate && textStickerModel.getTextTemplateModel().isGroupTextTemplates) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIJ(TextStickerModel textStickerModel) {
        if (textStickerModel.getGuideType() != C0FVR.NONE) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIJJI(TextStickerModel textStickerModel) {
        if (textStickerModel.getSourceType() == C0F7S.INSTANT_CLONE) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIL(TextStickerModel textStickerModel) {
        if (textStickerModel.getTextTemplateModel().enableTextTemplate && textStickerModel.getTextTemplateModel().isNewTextTemplate) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILIIL(TextStickerModel textStickerModel) {
        if ((textStickerModel.getSourceType() != C0F7S.EDITOR_PRO && textStickerModel.getSourceType() != C0F7S.EDIT && textStickerModel.getSourceType() != C0F7S.AI_CAPTION) || textStickerModel.getCaptionModel() != null || LJIIJ(textStickerModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILJJIL(TextStickerModel textStickerModel) {
        return textStickerModel.getTextTemplateModel().enableTextTemplate;
    }

    public static final int LIZIZ(TextStickerModel textStickerModel, int i) {
        SubTemplateInfo subTemplateInfo;
        SubTemplateStyle subTemplateStyle;
        if (textStickerModel.getTextTemplateModel().isGroupTextTemplates && (subTemplateInfo = (SubTemplateInfo) C13LP.LJJJLZIJ(i, textStickerModel.getCompatModel().getSubTemplates())) != null && (subTemplateStyle = subTemplateInfo.style) != null) {
            return subTemplateStyle.align;
        }
        return textStickerModel.getAlign();
    }

    public static final int LIZJ(TextStickerModel textStickerModel, int i) {
        SubTemplateInfo subTemplateInfo;
        SubTemplateStyle subTemplateStyle;
        if (textStickerModel.getTextTemplateModel().isGroupTextTemplates && (subTemplateInfo = (SubTemplateInfo) C13LP.LJJJLZIJ(i, textStickerModel.getCompatModel().getSubTemplates())) != null && (subTemplateStyle = subTemplateInfo.style) != null) {
            return subTemplateStyle.color;
        }
        return textStickerModel.getColor();
    }

    public static final TextFontModel LIZLLL(TextStickerModel textStickerModel, int i) {
        SubTemplateInfo subTemplateInfo;
        SubTemplateStyle subTemplateStyle;
        TextFontModel textFontModel;
        if (!textStickerModel.getTextTemplateModel().isGroupTextTemplates || (subTemplateInfo = (SubTemplateInfo) C13LP.LJJJLZIJ(i, textStickerModel.getCompatModel().getSubTemplates())) == null || (subTemplateStyle = subTemplateInfo.style) == null || (textFontModel = subTemplateStyle.fontModel) == null) {
            return textStickerModel.getFontModel();
        }
        return textFontModel;
    }
}
