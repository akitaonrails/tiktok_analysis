package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CustomCaptionTemplateData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0EMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363470EMv {
    public static final CaptionTemplateData LIZ(Effect effect) {
        Object c098200Yq;
        JSONObject jSONObject;
        boolean zOptBoolean;
        CaptionTemplateData captionTemplateData = (CaptionTemplateData) C362890EKp.LIZJ(effect, CaptionTemplateData.class);
        Object obj = null;
        if (captionTemplateData == null) {
            return null;
        }
        captionTemplateData.resID = effect.getResource_id();
        try {
            String extra = effect.getExtra();
            if (extra != null) {
                jSONObject = new JSONObject(extra);
            } else {
                jSONObject = null;
            }
            boolean zOptBoolean2 = false;
            if (jSONObject == null) {
                zOptBoolean = false;
            } else {
                zOptBoolean = jSONObject.optBoolean("force_lowercase", false);
                zOptBoolean2 = jSONObject.optBoolean("force_uppercase", false);
            }
            c098200Yq = CaptionTemplateData.LIZ(captionTemplateData, 0, null, null, null, zOptBoolean, zOptBoolean2, 2047);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        CaptionTemplateData captionTemplateData2 = (CaptionTemplateData) obj;
        if (captionTemplateData2 != null) {
            return captionTemplateData2;
        }
        return captionTemplateData;
    }

    public static final TextMotionModel LIZJ(Effect effect) {
        TextMotionData textMotionData = (TextMotionData) C362890EKp.LIZIZ(effect, TextMotionData.class);
        if (textMotionData == null) {
            return null;
        }
        TextMotionData textMotionData2 = (TextMotionData) C362890EKp.LIZIZ(effect, TextMotionData.class);
        if (textMotionData2 == null) {
            textMotionData2 = new TextMotionData(0, 0.0f, "", false, 2, null);
        }
        String unzipPath = effect.getUnzipPath();
        float f = textMotionData.motionDuration;
        float f2 = LSPassThroughRecordSizeConfig.DEFAULT;
        return new TextMotionModel(unzipPath, f2 * f * f2, textMotionData.motionType, effect.getEffectId(), "caption_animation", effect.getResource_id(), 1, true, false, textMotionData2.autoWrapLine);
    }

    public static final CustomCaptionTemplateData LIZLLL(TextStickerModel textStickerModel) {
        boolean z = textStickerModel.getCaptionTemplateModel().customTemplateData.hasEdited;
        int color = textStickerModel.getColor();
        int mode = textStickerModel.getMode();
        TextStyleModel textStyleModelLIZ = null;
        TextMotionModel textMotionModelLIZ = TextMotionModel.LIZ(textStickerModel.getTextMotionModel(), null, 0.0f, 0, null, null, 0, false, 1023);
        TextFontModel textFontModelLIZ = TextFontModel.LIZ(textStickerModel.getFontModel(), null, null, null, null, null, null, 0, 0, null, null, false, false, 0, 16383);
        TextStyleModel textStyle = textStickerModel.getTextStyle();
        if (textStyle != null) {
            textStyleModelLIZ = TextStyleModel.LIZ(textStyle, null, null, null, null, false, null, 2047);
        }
        return new CustomCaptionTemplateData(z, color, mode, textMotionModelLIZ, textFontModelLIZ, textStyleModelLIZ);
    }

    public static final boolean LJFF(C19A3 c19a3) {
        if (c19a3 != null && c19a3.findSceneByTag(C364890ESh.class.getSimpleName()) != null) {
            return true;
        }
        return false;
    }

    public static final TextFontModel LIZIZ(int i, Effect effect) {
        boolean z;
        boolean z2;
        TextFontStyleData textFontStyleData = (TextFontStyleData) C362890EKp.LIZIZ(effect, TextFontStyleData.class);
        if (textFontStyleData == null) {
            return null;
        }
        if (C0FI2.LJIILL(textFontStyleData.fileName) == null || C0FI2.LJJIFFI(textFontStyleData.fileName) == null) {
            C0FI2.LJIJJLI(effect.getPanel()).LJJIJIL(effect);
        }
        TextFontStyleData textFontStyleDataLJIILL = C0FI2.LJIILL(textFontStyleData.fileName);
        String effectId = effect.getEffectId();
        String resource_id = effect.getResource_id();
        String panel = effect.getPanel();
        String str = textFontStyleDataLJIILL.fontName;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = textFontStyleDataLJIILL.title;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = textFontStyleDataLJIILL.fileName;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = textFontStyleDataLJIILL.LIZ;
        if (str5 != null) {
            str2 = str5;
        }
        if (textFontStyleDataLJIILL.enableBgColor == 1) {
            z = true;
        } else {
            z = false;
        }
        if (textFontStyleDataLJIILL.enableMaskBlurLightColor == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new TextFontModel(effectId, resource_id, panel, "trending", str, str3, i, 0, str4, str2, z, z2, false, 0, 12416, null);
    }

    public static final TextFontModel LJ(TextFontModel textFontModel, int i) {
        String effectId;
        String resourceId;
        String panel;
        TextFontStyleData textFontStyleDataLJIIZILJ = C0FI2.LJIJJ().LJIIZILJ("Proxima-Nova-Semibold.otf");
        if (textFontStyleDataLJIIZILJ == null) {
            return textFontModel;
        }
        Effect effect = textFontStyleDataLJIIZILJ.LJ;
        String str = "";
        if (effect == null || (effectId = effect.getEffectId()) == null) {
            effectId = "";
        }
        Effect effect2 = textFontStyleDataLJIIZILJ.LJ;
        if (effect2 == null || (resourceId = effect2.getResourceId()) == null) {
            resourceId = "";
        }
        Effect effect3 = textFontStyleDataLJIIZILJ.LJ;
        if (effect3 == null || (panel = effect3.getPanel()) == null) {
            panel = "";
        }
        String str2 = textFontStyleDataLJIIZILJ.fontName;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = textFontStyleDataLJIIZILJ.fileName;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = textFontStyleDataLJIIZILJ.LIZ;
        if (str4 != null) {
            str = str4;
        }
        return new TextFontModel(effectId, resourceId, panel, null, str2, null, i, 0, str3, str, false, false, false, 0, 15528, null);
    }
}
