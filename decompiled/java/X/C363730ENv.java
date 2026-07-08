package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ENv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363730ENv {
    public static final TextMotionModel LIZ(Effect effect) {
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

    public static final int LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<StickerItemModel> arrayList;
        if (C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel)) {
            return ((ArrayList) LIZJ(videoPublishEditModel)).size();
        }
        InlineCaptionModel inlineCaptionModel = videoPublishEditModel.creativeModel.inlineCaptionModel;
        if (inlineCaptionModel != null && (arrayList = inlineCaptionModel.utterances) != null) {
            return arrayList.size();
        }
        return 0;
    }

    public static final List<TextStickerModel> LIZJ(VideoPublishEditModel videoPublishEditModel) {
        List<TextStickerModel> list = videoPublishEditModel.creativeModel.stickerModel.textStickerModels;
        ArrayList arrayList = new ArrayList();
        for (TextStickerModel textStickerModel : list) {
            if (C0F8Y.LJIIIIZZ(textStickerModel)) {
                arrayList.add(textStickerModel);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    public static final ArrayList<CaptionUtterance> LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        ?? arrayList;
        ArrayList<StickerItemModel> arrayList2;
        String strLJJIFFI;
        if (!u4.LJLJLJ(videoPublishEditModel)) {
            return null;
        }
        if (C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel)) {
            List<TextStickerModel> listLIZJ = LIZJ(videoPublishEditModel);
            arrayList = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
            Iterator it2 = ((ArrayList) listLIZJ).iterator();
            while (it2.hasNext()) {
                arrayList.add(C0F7U.LIZJ((TextStickerModel) it2.next()));
            }
        } else {
            try {
                InlineCaptionModel inlineCaptionModel = videoPublishEditModel.creativeModel.inlineCaptionModel;
                if (inlineCaptionModel != null && (arrayList2 = inlineCaptionModel.utterances) != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                    Iterator<StickerItemModel> it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), it3.next().extra, TextStickerData.class));
                    }
                } else {
                    arrayList = 0;
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                arrayList = C13BV.INSTANCE;
            }
        }
        if (arrayList == 0) {
            arrayList = C13BV.INSTANCE;
        }
        for (TextStickerData textStickerData : arrayList) {
            String textStr = textStickerData.getTextStr();
            if (textStr != null) {
                strLJJIFFI = u.LJJIFFI(textStr, "\n", "", false);
            } else {
                strLJJIFFI = null;
            }
            textStickerData.setTextStr(strLJJIFFI);
        }
        return LJ(arrayList);
    }

    public static final ArrayList<CaptionUtterance> LJ(List<TextStickerData> list) {
        ArrayList<CaptionUtterance> arrayList = new ArrayList<>();
        Iterator<TextStickerData> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new CaptionUtterance((Utterance) null, it2.next().m187clone()));
        }
        return arrayList;
    }

    public static final ArrayList<StickerItemModel> LJFF(List<CaptionUtterance> list) {
        ArrayList<StickerItemModel> arrayList = new ArrayList<>();
        int i = 0;
        for (TextStickerData textStickerData : LJIIIIZZ(list)) {
            int i2 = i + 1;
            if (i >= 0) {
                TextStickerData textStickerData2 = textStickerData;
                textStickerData2.setUiStartTime(textStickerData2.getStartTime());
                textStickerData2.setUiEndTime(textStickerData2.getEndTime());
                arrayList.add(C0F7Y.LIZ(textStickerData2, i));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    public static final ArrayList<TextStickerData> LJIIIIZZ(List<CaptionUtterance> list) {
        ArrayList<TextStickerData> arrayList = new ArrayList<>();
        Iterator<CaptionUtterance> it2 = list.iterator();
        while (it2.hasNext()) {
            TextStickerData textStickerData = it2.next().inlineUtterance;
            if (textStickerData != null) {
                arrayList.add(textStickerData.m187clone());
            }
        }
        return arrayList;
    }

    public static final void LJIIIZ(TextStickerData textStickerData, String str, Context context) {
        textStickerData.setTextStr(str);
        textStickerData.setTextWrapList(C1697810uHb.LJ(C123P.LIZJ(C123P.LJIILJJIL(textStickerData, context))));
        textStickerData.setInlineTextStyles(C13BV.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r102v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r109v4, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSAudioBean] */
    /* JADX WARN: Type inference failed for: r111v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r112v1, types: [com.ss.android.ugc.aweme.sticker.data.TextStickerInfo] */
    /* JADX WARN: Type inference failed for: r113v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel] */
    /* JADX WARN: Type inference failed for: r114v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel] */
    /* JADX WARN: Type inference failed for: r115v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextEventTrackingModel] */
    /* JADX WARN: Type inference failed for: r119v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r124v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel] */
    /* JADX WARN: Type inference failed for: r129v1, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r153v0 */
    /* JADX WARN: Type inference failed for: r153v5 */
    /* JADX WARN: Type inference failed for: r153v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r154v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r160v6, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r161v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r162v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r164v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r165v4, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r166v1 */
    /* JADX WARN: Type inference failed for: r167v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r169v0, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r170v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r171v0, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.StickerAnimation] */
    /* JADX WARN: Type inference failed for: r172v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r173v0, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TransformAnchor] */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r37v2, types: [com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData$Pair] */
    /* JADX WARN: Type inference failed for: r38v2, types: [X.0FTc] */
    /* JADX WARN: Type inference failed for: r51v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r53v2, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r54v2, types: [com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap] */
    /* JADX WARN: Type inference failed for: r55v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r56v2, types: [com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig] */
    /* JADX WARN: Type inference failed for: r57v2, types: [com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerCoverExtraData] */
    /* JADX WARN: Type inference failed for: r67v2, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel] */
    /* JADX WARN: Type inference failed for: r75v2, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel] */
    /* JADX WARN: Type inference failed for: r90v0, types: [java.util.List] */
    public static final TextStickerData LJI(Utterance utterance, Context context, boolean z, Effect effect, Effect effect2) throws Throwable {
        CaptionTemplateData captionTemplateData;
        Object c098200Yq;
        Effect effectLIZJ;
        TextFontModel fontModel;
        String effectId;
        String resourceId;
        String panel;
        TextStyleModel textStyleModelLIZ;
        Effect effectLIZJ2;
        EnumC363350EMj enumC363350EMj;
        int iIntValue;
        int i;
        Effect effectLIZJ3;
        Effect effectLIZJ4;
        TextFontStyleData textFontStyleData;
        boolean z2;
        boolean z3;
        int mode;
        int align;
        float scale;
        String str;
        EnumC363350EMj enumC363350EMj2;
        Object c098200Yq2;
        boolean zOptBoolean;
        boolean zOptBoolean2;
        TextMotionModel textMotionModelLIZ = null;
        TextStickerModel textStickerModelCopy$default = null;
        textMotionModelLIZ = null;
        textMotionModelLIZ = null;
        textMotionModelLIZ = null;
        if (effect2 != null && (captionTemplateData = (CaptionTemplateData) C362890EKp.LIZJ(effect2, CaptionTemplateData.class)) != null) {
            captionTemplateData.resID = effect2.getResource_id();
            try {
                String extra = effect2.getExtra();
                if (extra != null) {
                    JSONObject jSONObject = new JSONObject(extra);
                    zOptBoolean = jSONObject.optBoolean("force_lowercase", false);
                    zOptBoolean2 = jSONObject.optBoolean("force_uppercase", false);
                } else {
                    zOptBoolean = false;
                    zOptBoolean2 = false;
                }
                captionTemplateData = captionTemplateData;
                c098200Yq2 = CaptionTemplateData.LIZ(captionTemplateData, 0, null, null, null, zOptBoolean, zOptBoolean2, 2047);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            CaptionTemplateData captionTemplateData2 = (CaptionTemplateData) c098200Yq2;
            if (captionTemplateData2 != null) {
                captionTemplateData = captionTemplateData2;
            }
        } else {
            captionTemplateData = null;
        }
        String str2 = null;
        Effect effect3 = null;
        float f = 0.0f;
        boolean z4 = false;
        boolean z5 = false;
        ?? r153 = 0;
        String str3 = null;
        long j = 0;
        TextStickerModel textStickerModel = new TextStickerModel(null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1, 65535, null);
        int color = -1;
        if (captionTemplateData == null) {
            i = 1;
        } else {
            try {
                c098200Yq = Integer.valueOf(Color.parseColor(captionTemplateData.textColor));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Integer num = (Integer) c098200Yq;
            int i2 = captionTemplateData.mode;
            int i3 = captionTemplateData.align;
            float f2 = captionTemplateData.scale;
            int i4 = textStickerModel.getFontModel().fontSize;
            String str4 = captionTemplateData.fontId;
            if (str4 == null) {
                effectLIZJ = null;
            } else {
                effectLIZJ = C365460EUm.LIZJ(str4);
            }
            String str5 = "";
            if (effectLIZJ != null && (textFontStyleData = (TextFontStyleData) C362890EKp.LIZIZ(effectLIZJ, TextFontStyleData.class)) != null) {
                if (C0FI2.LJIILL(textFontStyleData.fileName) == null || C0FI2.LJJIFFI(textFontStyleData.fileName) == null) {
                    C0FI2.LJIJJLI(effectLIZJ.getPanel()).LJJIJIL(effectLIZJ);
                }
                TextFontStyleData textFontStyleDataLJIILL = C0FI2.LJIILL(textFontStyleData.fileName);
                String effectId2 = effectLIZJ.getEffectId();
                String resource_id = effectLIZJ.getResource_id();
                String panel2 = effectLIZJ.getPanel();
                String str6 = textFontStyleDataLJIILL.fontName;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = textFontStyleDataLJIILL.title;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = textFontStyleDataLJIILL.fileName;
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = textFontStyleDataLJIILL.LIZ;
                if (str9 != null) {
                    str5 = str9;
                }
                if (textFontStyleDataLJIILL.enableBgColor == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (textFontStyleDataLJIILL.enableMaskBlurLightColor == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                fontModel = new TextFontModel(effectId2, resource_id, panel2, "trending", str6, str7, i4, 0, str8, str5, z2, z3, false, 0, 12416, null);
            } else {
                fontModel = textStickerModel.getFontModel();
                TextFontStyleData textFontStyleDataLJIIZILJ = C0FI2.LJIJJ().LJIIZILJ("Proxima-Nova-Semibold.otf");
                if (textFontStyleDataLJIIZILJ != null) {
                    Effect effect4 = textFontStyleDataLJIIZILJ.LJ;
                    if (effect4 == null || (effectId = effect4.getEffectId()) == null) {
                        effectId = "";
                    }
                    Effect effect5 = textFontStyleDataLJIIZILJ.LJ;
                    if (effect5 == null || (resourceId = effect5.getResourceId()) == null) {
                        resourceId = "";
                    }
                    Effect effect6 = textFontStyleDataLJIIZILJ.LJ;
                    if (effect6 == null || (panel = effect6.getPanel()) == null) {
                        panel = "";
                    }
                    String str10 = textFontStyleDataLJIIZILJ.fontName;
                    if (str10 == null) {
                        str10 = "";
                    }
                    String str11 = textFontStyleDataLJIIZILJ.fileName;
                    if (str11 == null) {
                        str11 = "";
                    }
                    String str12 = textFontStyleDataLJIIZILJ.LIZ;
                    if (str12 != null) {
                        str5 = str12;
                    }
                    fontModel = new TextFontModel(effectId, resourceId, panel, null, str10, null, i4, 0, str11, str5, false, false, false, 0, 15528, null);
                }
            }
            String str13 = captionTemplateData.styleId;
            if (str13 != null && (effectLIZJ4 = C365460EUm.LIZJ(str13)) != null) {
                if (C362890EKp.LIZ(effectLIZJ4)) {
                    textStyleModelLIZ = new TextStyleModel(effectLIZJ4.getPanel(), effectLIZJ4.getEffectId(), "trending", effectLIZJ4.getResourceId(), "#FFFFFFFF", null, null, null, true, effectLIZJ4.getUnzipPath(), "");
                } else {
                    TextStyleModel textStyleModel = (TextStyleModel) C362890EKp.LIZJ(effectLIZJ4, TextStyleModel.class);
                    if (textStyleModel != null) {
                        textStyleModelLIZ = TextStyleModel.LIZ(textStyleModel, effectLIZJ4.getPanel(), effectLIZJ4.getEffectId(), "trending", effectLIZJ4.getResourceId(), false, null, 2032);
                    } else {
                        textStyleModelLIZ = null;
                    }
                }
            } else {
                textStyleModelLIZ = null;
            }
            String str14 = captionTemplateData.textAnimId;
            if (str14 != null && str14.length() != 0) {
                String str15 = captionTemplateData.textAnimId;
                if (str15 != null && (effectLIZJ3 = C365460EUm.LIZJ(str15)) != null) {
                    textMotionModelLIZ = LIZ(effectLIZJ3);
                }
            } else {
                String str16 = captionTemplateData.captionAnimId;
                if (str16 != null && (effectLIZJ2 = C365460EUm.LIZJ(str16)) != null) {
                    textMotionModelLIZ = LIZ(effectLIZJ2);
                }
            }
            CaptionTemplateModel captionTemplateModelLIZ = CaptionTemplateModel.LIZ(textStickerModel.getCaptionTemplateModel(), true, captionTemplateData, null, false, captionTemplateData.forceLowercase, captionTemplateData.forceUppercase, 4);
            TextStickerCompatModel compatModel = textStickerModel.getCompatModel();
            if (captionTemplateData.forceUppercase) {
                enumC363350EMj = EnumC363350EMj.ALL_UPPER;
            } else if (captionTemplateData.forceLowercase) {
                enumC363350EMj = EnumC363350EMj.ALL_LOWER;
            } else {
                enumC363350EMj = EnumC363350EMj.DEFAULT;
            }
            TextStickerCompatModel textStickerCompatModelCopy$default = TextStickerCompatModel.copy$default(compatModel, false, false, null, null, null, null, enumC363350EMj, null, null, false, null, null, null, 0, null, 0.0f, null, null, null, null, null, 2097087, null);
            BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(textStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -8388609, 15, null);
            if (textMotionModelLIZ == null) {
                textMotionModelLIZ = TextMotionModel.LIZ(textStickerModel.getTextMotionModel(), null, 0.0f, 0, null, null, 2, false, 959);
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            str2 = null;
            effect3 = null;
            f = 0.0f;
            z4 = false;
            z5 = false;
            r153 = 0;
            str3 = null;
            j = 0;
            i = 1;
            textStickerModelCopy$default = TextStickerModel.copy$default(textStickerModel, baseStickerModelCopy$default, null, null, null, null, i2, iIntValue, i3, 0.0f, fontModel, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, textMotionModelLIZ, null, true, null, null, false, false, captionTemplateModelLIZ, textStyleModelLIZ, null, null, null, null, false, false, null, false, false, false, textStickerCompatModelCopy$default, -1342178018, 32743, null);
        }
        String text = utterance.getText();
        if (textStickerModelCopy$default != null) {
            mode = textStickerModelCopy$default.getMode();
        } else {
            mode = 4;
        }
        if (textStickerModelCopy$default != null) {
            color = textStickerModelCopy$default.getColor();
        }
        if (textStickerModelCopy$default != null) {
            align = textStickerModelCopy$default.getAlign();
        } else {
            align = 2;
        }
        if (textStickerModelCopy$default != null) {
            scale = textStickerModelCopy$default.getBaseStickerModel().getScale();
        } else {
            scale = 1.0f;
        }
        TextStickerData textStickerData = new TextStickerData(text, mode, color, align, str2, new Point(), (int) utterance.getStartTime(), (int) utterance.getEndTime(), (int) utterance.getStartTime(), (int) utterance.getEndTime(), utterance.getWords(), utterance.getTag(), utterance.getFilterSelected(), str2, j, j, f, f, j, z4, z4, z4, str2, str2, f, scale, z4, z4, z4, z4 ? 1 : 0, str2, str2, str2, str2, z4 ? 1 : 0, str2, str2, 22, str2, str2, str2, str2, str2, z4, z4, str2, str2, str2, str2, str2, str2, str2, str2, f, f, z4 ? 1 : 0, z4 ? 1 : 0, z4 ? 1 : 0, z4 ? 1 : 0, f, str2, z4, str2, str2, str2, str2, str2, str2, str2, z4, "type_inline_caption", j, j, str2, str2, str2, str2, str2, str2, str2, str2, str2, str2, str2, str2, str2, z4, z4, z4, z4, z4 ? 1 : 0, z4 ? 1 : 0, str2, z4 ? 1 : 0, str2, str2, str2, str2, str2, z4, z4, str2, str2, z4, z4, z4, z4, str2, -33562608, -33, -65, 4095, str2);
        if (effect != null) {
            TextMotionData textMotionData = (TextMotionData) C362890EKp.LIZIZ(effect, TextMotionData.class);
            if (textMotionData == null) {
                textMotionData = new TextMotionData(z4 ? 1 : 0, 0.0f, "", z4, 2, effect3);
            }
            String unzipPath = effect.getUnzipPath();
            float f3 = textMotionData.motionDuration;
            float f4 = LSPassThroughRecordSizeConfig.DEFAULT;
            textStickerData.setMotionModel(new TextMotionModel(unzipPath, f4 * f3 * f4, textMotionData.motionType, effect.getEffectId(), "caption_animation", effect.getResource_id(), i, i, z5, textMotionData.autoWrapLine));
        }
        textStickerData.setFontType("Proxima-Nova-Semibold.otf");
        if (textStickerModelCopy$default != null) {
            if (textStickerModelCopy$default.getCaptionTemplateModel().forceUppercase) {
                enumC363350EMj2 = EnumC363350EMj.ALL_UPPER;
            } else if (textStickerModelCopy$default.getCaptionTemplateModel().forceLowercase) {
                enumC363350EMj2 = EnumC363350EMj.ALL_LOWER;
            } else {
                enumC363350EMj2 = EnumC363350EMj.DEFAULT;
            }
            textStickerData.setMotionModel(textStickerModelCopy$default.getTextMotionModel());
            textStickerData.setTextStyle(textStickerModelCopy$default.getTextStyle());
            textStickerData.setCaptionTemplateModel(textStickerModelCopy$default.getCaptionTemplateModel());
            textStickerData.setCompatModel(TextStickerCompatModel.copy$default(textStickerData.getCompatModel(), r153, r153, str3, str3, str3, str3, enumC363350EMj2, str3, str3, r153, str3, str3, str3, r153 == true ? 1 : 0, str3, 0.0f, str3, str3, str3, str3, str3, 2097087, str3));
            textStickerData.setFontType(textStickerModelCopy$default.getFontModel().fileName);
        }
        TextStickerTextWrap[] textStickerTextWrapArr = new TextStickerTextWrap[i];
        textStickerTextWrapArr[r153] = C123P.LIZJ(C123P.LJIILJJIL(textStickerData, context));
        textStickerData.setTextWrapList(C1697810uHb.LJ(textStickerTextWrapArr));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        textStickerData.setEditorProCaption(str);
        return textStickerData;
    }
}
