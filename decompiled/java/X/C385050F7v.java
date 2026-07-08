package X;

import Y.AComparatorS24S0000000_5;
import android.graphics.Color;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLEStyRecognizedWord;
import com.bytedance.ies.nle.editor_jni.NLEStyStickerAnim;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecInt;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.q;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.data.Word;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleBackground;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleShadow;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleStroke;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Content;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Fill;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Font;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NewTextTemplateRichText;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Solid;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.Style;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0F7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C385050F7v {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(70));

    public static final C1899707cJ LJI() {
        return (C1899707cJ) LIZ.getValue();
    }

    public static final String LIZ(TextStickerModel textStickerModel) {
        String textStrWithLineBreak = textStickerModel.getTextStrWithLineBreak();
        if (textStickerModel.getTextMotionModel().autoWrapLine && textStickerModel.getTextMotionModel().motionEnabled == 1) {
            textStrWithLineBreak = textStickerModel.getTextStr();
        }
        if (Intrinsics.LJFF(textStrWithLineBreak, "")) {
            textStrWithLineBreak = textStickerModel.getHint();
        }
        if (Intrinsics.LJFF(textStickerModel.getCompatModel().getShowPunctuation(), Boolean.FALSE)) {
            textStrWithLineBreak = LJI().LIZ(textStrWithLineBreak);
        }
        int i = C362860EKm.LIZ[textStickerModel.getCompatModel().getCapitalizationState().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return LIZJ(textStrWithLineBreak);
                }
                return textStrWithLineBreak;
            }
            return textStrWithLineBreak.toLowerCase(Locale.ROOT);
        }
        return textStrWithLineBreak.toUpperCase(Locale.ROOT);
    }

    public static final String LIZJ(String str) {
        return new Regex("(^|\\s)(\\S)").replace(str, AFwS234S0000000_5.get$arr$(109));
    }

    public static final String LIZLLL(TextStickerModel textStickerModel) {
        if (LJIIJ(textStickerModel)) {
            CaptionTemplateData captionTemplateData = textStickerModel.getCaptionTemplateModel().templateData;
            if (captionTemplateData == null) {
                return null;
            }
            return captionTemplateData.resID;
        }
        if (textStickerModel.getCaptionModel() == null || LJIIJJI(textStickerModel)) {
            return null;
        }
        return "custom";
    }

    public static final void LJ(NLEEditor nLEEditor) {
        nLEEditor.commit();
        nLEEditor.done();
    }

    public static final List<NLETrack> LJIIIIZZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (LJIIL(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static final boolean LJIIIZ(NLETrackSlot nLETrackSlot) {
        return Intrinsics.LJFF(nLETrackSlot.getExtra("text_slot_type"), "SUBTITLE");
    }

    public static final boolean LJIIJ(TextStickerModel textStickerModel) {
        if (textStickerModel.getCaptionModel() != null && !LJIILIIL(textStickerModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIJJI(TextStickerModel textStickerModel) {
        if (textStickerModel.getColor() != -1) {
            return false;
        }
        if ((textStickerModel.getMode() != 1 && textStickerModel.getMode() != -1) || textStickerModel.getAlign() != 2 || textStickerModel.getTextStyle() != null || textStickerModel.getTextMotionModel().motionEnabled == 1 || !Intrinsics.LJFF(textStickerModel.getFontModel().fileName, "Proxima-Nova-Semibold.otf")) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIL(NLETrack nLETrack) {
        if (nLETrack == null || C350870DpF.LJIIIIZZ(nLETrack) != NLETrackType.STICKER || !Intrinsics.LJFF(nLETrack.getExtra("StickerTrackType"), "TEXT")) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILIIL(TextStickerModel textStickerModel) {
        CaptionTemplateData captionTemplateDataLIZ;
        String second;
        String str;
        String str2;
        CaptionTemplateData captionTemplateData = textStickerModel.getCaptionTemplateModel().templateData;
        if (captionTemplateData == null) {
            return true;
        }
        CaptionTemplateData captionTemplateData2 = new CaptionTemplateData("", "tiktok_ep_caption_template", C786410Ut5.j4("#%02X%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(Color.alpha(textStickerModel.getColor())), Integer.valueOf(Color.red(textStickerModel.getColor())), Integer.valueOf(Color.green(textStickerModel.getColor())), Integer.valueOf(Color.blue(textStickerModel.getColor()))}, 4)), textStickerModel.getAlign(), 28.0f, textStickerModel.getBaseStickerModel().getScale(), 1, null, null, null, C0FGD.LIZ(textStickerModel.getFontModel().fontResId, textStickerModel.getFontModel().fontPanel), false, false);
        TextStyleModel textStyle = textStickerModel.getTextStyle();
        if (textStyle != null) {
            captionTemplateDataLIZ = CaptionTemplateData.LIZ(captionTemplateData2, 0, C0FGD.LIZ(textStyle.styleResId, textStyle.stylePanel), null, null, false, false, 8063);
        } else {
            captionTemplateDataLIZ = CaptionTemplateData.LIZ(captionTemplateData2, Math.max(1, textStickerModel.getMode()), null, null, null, false, false, 8127);
        }
        if (textStickerModel.getTextMotionModel().motionEnabled == 1) {
            String strLIZ = C0FGD.LIZ(textStickerModel.getTextMotionModel().motionResId, "text_motion");
            if (C363290EMd.LIZ(textStickerModel.getTextMotionModel())) {
                captionTemplateDataLIZ = CaptionTemplateData.LIZ(captionTemplateDataLIZ, 0, null, null, strLIZ, false, false, 7679);
            } else {
                captionTemplateDataLIZ = CaptionTemplateData.LIZ(captionTemplateDataLIZ, 0, null, strLIZ, null, false, false, 7935);
            }
        }
        String str3 = captionTemplateDataLIZ.fontId;
        if (str3 != null && str3.length() != 0) {
            if (!Intrinsics.LJFF(captionTemplateData.fontId, captionTemplateDataLIZ.fontId)) {
                return true;
            }
        } else {
            Pair<String, String> pairLIZJ = C0FGD.LIZJ(captionTemplateData.fontId);
            if (pairLIZJ != null) {
                second = pairLIZJ.getSecond();
            } else {
                second = null;
            }
            if (!Intrinsics.LJFF(second, textStickerModel.getFontModel().fontResId)) {
                return true;
            }
        }
        if (!Intrinsics.LJFF(captionTemplateData.textColor, captionTemplateDataLIZ.textColor) || captionTemplateData.mode != captionTemplateDataLIZ.mode || !Intrinsics.LJFF(captionTemplateData.styleId, captionTemplateDataLIZ.styleId)) {
            return true;
        }
        String str4 = captionTemplateData.textAnimId;
        if (((str4 != null && str4.length() != 0) || ((str = captionTemplateData.captionAnimId) != null && str.length() != 0)) && (textStickerModel.getTextMotionModel().motionEnabled != 1 || !Intrinsics.LJFF(captionTemplateData.textAnimId, captionTemplateDataLIZ.textAnimId) || !Intrinsics.LJFF(captionTemplateData.captionAnimId, captionTemplateDataLIZ.captionAnimId))) {
            return true;
        }
        String str5 = captionTemplateData.textAnimId;
        if ((str5 == null || str5.length() == 0) && (((str2 = captionTemplateData.captionAnimId) == null || str2.length() == 0) && textStickerModel.getTextMotionModel().motionEnabled == 1)) {
            return true;
        }
        return false;
    }

    public static final int LJJII(List list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        float f = 255;
        return Color.argb(255, C13LZ.LJ(C814420VxA.LIZIZ(LJJIII(0.0f, 0, list) * f), 0, 255), C13LZ.LJ(C814420VxA.LIZIZ(LJJIII(0.0f, 1, list) * f), 0, 255), C13LZ.LJ(C814420VxA.LIZIZ(LJJIII(0.0f, 2, list) * f), 0, 255));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String LIZIZ(TextStickerModel textStickerModel, String str) {
        float lineSpacingExtra;
        int i;
        List<Style> list;
        Style style;
        Content content;
        Solid solid;
        float containerWidth = (720.0f / textStickerModel.getBaseStickerModel().getContainerWidth()) * 0.24f;
        String strLIZ = LIZ(textStickerModel);
        boolean z = false;
        if (!a0.LJJJIL(textStickerModel.getRichContent())) {
            String richContent = textStickerModel.getRichContent();
            C0F8M.LJJIJ.getClass();
            C0F8M c0f8mLIZ = C0F8O.LIZ(richContent);
            NewTextTemplateRichText newTextTemplateRichText = c0f8mLIZ.LJJIIZI;
            if (newTextTemplateRichText != null) {
                newTextTemplateRichText.text = textStickerModel.getTextStr();
            }
            NewTextTemplateRichText newTextTemplateRichText2 = c0f8mLIZ.LJJIIZI;
            if (newTextTemplateRichText2 != null && (list = newTextTemplateRichText2.styles) != null && (style = (Style) C13LP.LJJJLL(list)) != null) {
                style.range = C1697810uHb.LJIIJJI(0, Integer.valueOf(textStickerModel.getTextStr().length()));
                style.font = new Font(null, textStickerModel.getFontModel().localPath);
                Fill fill = style.fill;
                if (fill != null && (content = fill.content) != null && (solid = content.solid) != null) {
                    int color = textStickerModel.getColor();
                    solid.color = C1697810uHb.LJIIJJI(Float.valueOf(((color >>> 16) & 255) / 255.0f), Float.valueOf(((color >>> 8) & 255) / 255.0f), Float.valueOf((color & 255) / 255.0f), Float.valueOf(((color >>> 24) & 255) / 255.0f));
                }
            }
            c0f8mLIZ.LIZLLL(Integer.valueOf(textStickerModel.getAlign() - 1));
            c0f8mLIZ.LJ(0);
            return c0f8mLIZ.LJFF();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toEffect textStrWithLineBreak: ");
        sbLIZ.append(strLIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (strLIZIZ != null && strLIZIZ.length() != 0 && strLIZIZ.length() > 3072) {
            while (strLIZIZ.length() > 3072) {
                strLIZIZ = strLIZIZ.replace(strLIZIZ.substring(0, 3072), "");
            }
        }
        if (textStickerModel.getLineSpacingExtra() < 0.0f) {
            lineSpacingExtra = -0.2f;
        } else if (textStickerModel.getFontModel().fontSize <= 0) {
            lineSpacingExtra = 0.18f;
        } else {
            lineSpacingExtra = textStickerModel.getLineSpacingExtra() / C418440Gaw.LJ(Integer.valueOf(textStickerModel.getFontModel().fontSize));
        }
        int align = textStickerModel.getAlign();
        if (align != 1) {
            if (align != 3) {
                i = 1;
            } else {
                i = 2;
            }
        } else {
            i = 0;
        }
        NLETextRichContent.Companion.getClass();
        float f = 0.0f;
        float f2 = 0.0f;
        NLETextRichContent nLETextRichContent = new NLETextRichContent(2, "", new C385070F7x(null, null == true ? 1 : 0, null == true ? 1 : 0, f, z, f, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, f, null == true ? 1 : 0, null == true ? 1 : 0, 4095, null == true ? 1 : 0), 0, i, false, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f)), true, (C418440Gaw.LIZIZ(5) * 720) / textStickerModel.getBaseStickerModel().getContainerWidth(), true, true, C1697810uHb.LJ(Float.valueOf(12.0f / textStickerModel.getFontModel().fontSize), Float.valueOf(6.0f / textStickerModel.getFontModel().fontSize)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f)), 0.0f, 0, 0.04f, 0.15f, lineSpacingExtra, 0.0f, 0.0f, -1.0f, C1697810uHb.LJ(Float.valueOf(-1.0f), Float.valueOf(-1.0f)), 1, 254, C0F8B.LIZIZ(str), false, "...", "", false, false, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), false, C385630FAb.LIZ(textStickerModel.getBaseStickerModel()), C1697810uHb.LJ(Float.valueOf(0.5f), Float.valueOf(0.7f), Float.valueOf(1.0f), Float.valueOf(0.8f)), true, false);
        nLETextRichContent.setRichTextData(new C385070F7x(strLIZ, new Pair(textStickerModel.getFontModel().fontResId, textStickerModel.getFontModel().localPath), null == true ? 1 : 0, containerWidth * C341940Daq.LIZ(textStickerModel.getFontModel().fontSize), false, f2, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, f2, null == true ? 1 : 0, null == true ? 1 : 0, 4084, null == true ? 1 : 0));
        if (textStickerModel.getAutoAdaptCanvas() && textStickerModel.getCanvasWHFixed() != null) {
            nLETextRichContent.setAutoAdaptCanvasEnabled(true);
            nLETextRichContent.setAutoAdaptDpiEnabled(textStickerModel.getAutoAdaptDpi());
            List<Float> canvasWHFixed = textStickerModel.getCanvasWHFixed();
            if (canvasWHFixed != null) {
                nLETextRichContent.setCanvasWHFixed(canvasWHFixed);
                nLETextRichContent.setFixFontSize(textStickerModel.getFixedFontSize());
                nLETextRichContent.setCanvasWHCustomized(C1697810uHb.LJIIJJI(Float.valueOf(-1.0f), Float.valueOf(-1.0f)));
            } else {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        }
        nLETextRichContent.updateColor(textStickerModel.getMode(), textStickerModel.getColor());
        LJJIIJ(textStickerModel.getTextStyle(), nLETextRichContent, textStickerModel.getColor());
        TextFontModel fontModel = textStickerModel.getFontModel();
        if (fontModel.fontSize > 0) {
            String str2 = fontModel.fileName;
            int iHashCode = str2.hashCode();
            if (iHashCode != -112931697) {
                if (iHashCode != 495488456) {
                    if (iHashCode == 812307234 && str2.equals("RockSalt-Regular.ttf")) {
                        nLETextRichContent.setCanvasWHCustomized(C1697810uHb.LJ(ListProtector.get(nLETextRichContent.canvasWHCustomized, 0), Float.valueOf(0.8f)));
                        nLETextRichContent.setLineSpacing(1.5f);
                    }
                } else if (str2.equals("LuckiestGuy-Regular v2.ttf")) {
                    nLETextRichContent.setLineSpacing(-0.1f);
                }
            } else if (str2.equals("PermanentMarker-Regular.ttf")) {
                nLETextRichContent.setCanvasWHCustomized(C1697810uHb.LJ(ListProtector.get(nLETextRichContent.canvasWHCustomized, 0), Float.valueOf(0.8f)));
                nLETextRichContent.setLineSpacing(0.6f);
            }
        }
        nLETextRichContent.setRichText(nLETextRichContent.richTextData.toLabelStr());
        return nLETextRichContent.toJsonStr();
    }

    public static final NLEStyStickerAnim LJFF(TextMotionModel textMotionModel, final InterfaceC349700DnM interfaceC349700DnM) {
        List<C349800DnW> list;
        long jLIZJ = C352310DrZ.LIZJ(interfaceC349700DnM.getDurationMs());
        List<Word> listLIZIZ = interfaceC349700DnM.LIZIZ();
        if (textMotionModel.motionEnabled != 1 || a0.LJJJIL(textMotionModel.motionPath)) {
            return null;
        }
        int iMin = (int) Math.min(jLIZJ, (long) textMotionModel.motionDuration);
        String strLIZ = C0FGD.LIZ(textMotionModel.motionResId, "text_motion");
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.setResourceId(strLIZ);
        nLEResourceNode.setResourceFile(textMotionModel.motionPath);
        nLEResourceNode.setResourceType(NLEResType.ANIMATION_TEXT);
        nLEResourceNode.setExtra("biz_res_id", strLIZ);
        if (C363290EMd.LIZ(textMotionModel)) {
            NLEStyStickerAnim nLEStyStickerAnim = new NLEStyStickerAnim();
            nLEStyStickerAnim.setInAnim(nLEResourceNode);
            nLEStyStickerAnim.setLoop(false);
            nLEStyStickerAnim.setInDuration(iMin);
            if (!listLIZIZ.isEmpty()) {
                C349710DnN c349710DnN = new C349710DnN(interfaceC349700DnM) { // from class: X.0DnR
                };
                if ((!interfaceC349700DnM.LIZIZ().isEmpty()) || (!interfaceC349700DnM.LIZLLL().isEmpty())) {
                    c349710DnN.LIZ(AFwS191S0000000_5.get$arr$(435));
                    if (!interfaceC349700DnM.LIZLLL().isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (Word word : interfaceC349700DnM.LIZLLL()) {
                            C349800DnW c349800DnW = new C349800DnW();
                            c349800DnW.LIZ = word.getText();
                            c349800DnW.LIZIZ = (int) word.getStartTime();
                            c349800DnW.LIZJ = (int) word.getEndTime();
                            word.isKey();
                            arrayList.add(c349800DnW);
                        }
                        c349710DnN.LIZ(new AwS549S0100000_5(arrayList, (List<C349800DnW>) 1699));
                        list = arrayList;
                    } else {
                        List<C349800DnW> listLIZLLL = new C349690DnL(interfaceC349700DnM, false).LIZLLL();
                        c349710DnN.LIZ(new AwS549S0100000_5(listLIZLLL, (List<C349800DnW>) 1700));
                        list = listLIZLLL;
                    }
                    VecString vecString = new VecString();
                    VecInt vecInt = new VecInt();
                    VecInt vecInt2 = new VecInt();
                    ArrayList arrayList2 = new ArrayList();
                    for (C349800DnW c349800DnW2 : list) {
                        vecString.add(c349800DnW2.LIZ);
                        vecInt.add(Integer.valueOf(c349800DnW2.LIZIZ));
                        vecInt2.add(Integer.valueOf(c349800DnW2.LIZJ));
                        arrayList2.add(new Word(c349800DnW2.LIZJ, c349800DnW2.LIZIZ, c349800DnW2.LIZ, "", false, false));
                    }
                    interfaceC349700DnM.LJI(arrayList2);
                    NLEStyRecognizedWord nLEStyRecognizedWord = new NLEStyRecognizedWord();
                    nLEStyRecognizedWord.setText(vecString);
                    nLEStyRecognizedWord.setStartTime(vecInt);
                    nLEStyRecognizedWord.setEndTime(vecInt2);
                    nLEStyStickerAnim.setRecognizedWord(nLEStyRecognizedWord);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('\n');
                    sbLIZ.append(C349670DnJ.LIZ(list));
                    nLEStyStickerAnim.setExtra("[only for test]final_words", C2188811AlT.LIZIZ(sbLIZ));
                    nLEStyStickerAnim.setExtra("[only for test]slotStartTime", String.valueOf(interfaceC349700DnM.LIZ()));
                    nLEStyStickerAnim.setExtra("[only for test]slotMaxDuration", String.valueOf(interfaceC349700DnM.getDurationMs()));
                    nLEStyStickerAnim.setExtra("[only for test]autoWrapLine", String.valueOf(interfaceC349700DnM.LJ()));
                    nLEStyStickerAnim.setLoop(true);
                    nLEStyStickerAnim.setInDuration((int) C352310DrZ.LIZJ(interfaceC349700DnM.getDurationMs()));
                    return nLEStyStickerAnim;
                }
                return nLEStyStickerAnim;
            }
            return nLEStyStickerAnim;
        }
        int i = textMotionModel.motionType;
        if (i == 0) {
            NLEStyStickerAnim nLEStyStickerAnim2 = new NLEStyStickerAnim();
            nLEStyStickerAnim2.setInAnim(nLEResourceNode);
            nLEStyStickerAnim2.setInDuration(iMin);
            nLEStyStickerAnim2.setLoop(false);
            return nLEStyStickerAnim2;
        }
        if (i == 1) {
            NLEStyStickerAnim nLEStyStickerAnim3 = new NLEStyStickerAnim();
            nLEStyStickerAnim3.setInAnim(nLEResourceNode);
            nLEStyStickerAnim3.setInDuration(iMin);
            nLEStyStickerAnim3.setLoop(true);
            return nLEStyStickerAnim3;
        }
        if (i != 2) {
            return null;
        }
        NLEStyStickerAnim nLEStyStickerAnim4 = new NLEStyStickerAnim();
        nLEStyStickerAnim4.setOutAnim(nLEResourceNode);
        nLEStyStickerAnim4.setOutDuration(iMin);
        nLEStyStickerAnim4.setLoop(false);
        return nLEStyStickerAnim4;
    }

    public static final List<Float> LJIIZILJ(List<Float> list, Float f) {
        boolean z;
        float fFloatValue;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        int size = list.size();
        if (size != 3) {
            if (size != 4) {
                return null;
            }
            return list;
        }
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        return C13LP.LJLIL(Collections.singletonList(Float.valueOf(fFloatValue)), list);
    }

    public static final String LJIJJLI(String str, String str2) {
        Object obj;
        String strLJIL;
        h hVarLJJIIZI;
        n nVarLJJIJ;
        String str3 = "";
        if (a0.LJJJIL(str)) {
            return "";
        }
        try {
            new p();
            k kVarLIZJ = p.LIZJ(str);
            if (!(kVarLIZJ instanceof n) || (hVarLJJIIZI = kVarLIZJ.LJIILIIL().LJJIIZI("styles")) == null) {
                strLJIL = "";
                C189200o6.m2constructorimpl(strLJIL);
                obj = strLJIL;
            } else {
                int size = hVarLJJIIZI.size();
                for (int i = 0; i < size; i++) {
                    k kVarLJJIIJZLJL = hVarLJJIIZI.LJJIIJZLJL(i);
                    if (kVarLJJIIJZLJL != null && (kVarLJJIIJZLJL instanceof n) && (nVarLJJIJ = kVarLJJIIJZLJL.LJIILIIL().LJJIJ(str2)) != null) {
                        k kVarLJJIIZ = nVarLJJIJ.LJJIIZ(FollowStatusChangeMethod.PARAM_UID);
                        strLJIL = null;
                        strLJIL = null;
                        if (kVarLJJIIZ != null) {
                            if (!(kVarLJJIIZ instanceof q)) {
                                kVarLJJIIZ = null;
                            }
                            if (kVarLJJIIZ != null) {
                                strLJIL = kVarLJJIIZ.LJIL();
                            }
                        }
                        if (strLJIL == null) {
                            strLJIL = "";
                        }
                        if (!a0.LJJJIL(strLJIL)) {
                            break;
                        }
                    }
                }
                strLJIL = "";
                C189200o6.m2constructorimpl(strLJIL);
                obj = strLJIL;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Object obj2 = str3;
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (String) obj2;
    }

    public static final int LJJ(float f, float f2) {
        if (f <= 0.0f || f2 <= 0.0f) {
            return 28;
        }
        if ((720.0f / f2) * 0.24f <= 0.0f) {
            return 28;
        }
        int iLIZIZ = C341940Daq.LIZIZ(f / r1);
        if (iLIZIZ < 1) {
            return 1;
        }
        return iLIZIZ;
    }

    public static final void LJJIIJZLJL(TextStickerModel textStickerModel, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (!LJIILIIL(textStickerModel)) {
            CaptionTemplateModel captionTemplateModel = textStickerModel.getCaptionTemplateModel();
            CaptionTemplateData captionTemplateData = textStickerModel.getCaptionTemplateModel().templateData;
            if (captionTemplateData != null) {
                z2 = captionTemplateData.forceUppercase;
            } else {
                z2 = false;
            }
            captionTemplateModel.forceUppercase = z2;
            CaptionTemplateModel captionTemplateModel2 = textStickerModel.getCaptionTemplateModel();
            CaptionTemplateData captionTemplateData2 = textStickerModel.getCaptionTemplateModel().templateData;
            if (captionTemplateData2 != null) {
                z3 = captionTemplateData2.forceLowercase;
            }
            captionTemplateModel2.forceLowercase = z3;
            return;
        }
        if (!z) {
            return;
        }
        textStickerModel.getCaptionTemplateModel().forceUppercase = false;
        textStickerModel.getCaptionTemplateModel().forceLowercase = false;
    }

    public static final NLETrack LJII(NLEModel nLEModel, NLETrackSlot nLETrackSlot, boolean z) {
        Integer numValueOf;
        Object next;
        VecNLETrackSlotSPtr slots;
        Object next2;
        ArrayList<NLETrack> arrayList = new ArrayList(LJIIIIZZ(nLEModel));
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(87));
        }
        NLETrack nLETrack = null;
        if (!z) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((NLETimeSpaceNode) next).getLayer() == 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack2 = (NLETrack) next;
            if (nLETrack2 != null && (slots = nLETrack2.getSlots()) != null) {
                Iterator<NLETrackSlot> it3 = slots.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (LJIIIZ(it3.next())) {
                        if (!LJIIIZ(nLETrackSlot)) {
                            Iterator it4 = arrayList.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    next2 = it4.next();
                                    if (((NLETimeSpaceNode) next2).getLayer() == 0) {
                                        break;
                                    }
                                } else {
                                    next2 = null;
                                    break;
                                }
                            }
                            C19719512Dh.LIZ(arrayList).remove(next2);
                        }
                    }
                }
            }
        }
        for (NLETrack nLETrack3 : arrayList) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(nLETrack3.getSlots());
            if (arrayList2.size() > 1) {
                C08XD.LJJ(arrayList2, new AComparatorS24S0000000_5(88));
            }
            if (arrayList2.isEmpty()) {
                numValueOf = Integer.valueOf(nLETrack3.getLayer());
            } else {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) ListProtector.get(arrayList2, i);
                    if (arrayList2.size() == 1 && (nLETimeSpaceNode.getEndTime() <= nLETrackSlot.getStartTime() || nLETimeSpaceNode.getStartTime() >= nLETrackSlot.getEndTime())) {
                        numValueOf = Integer.valueOf(nLETrack3.getLayer());
                    } else if (i == 0 && nLETimeSpaceNode.getStartTime() >= nLETrackSlot.getEndTime()) {
                        numValueOf = Integer.valueOf(nLETrack3.getLayer());
                    } else if (i == arrayList2.size() - 1) {
                        if (nLETimeSpaceNode.getEndTime() <= nLETrackSlot.getStartTime()) {
                            numValueOf = Integer.valueOf(nLETrack3.getLayer());
                        }
                    } else {
                        NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) ListProtector.get(arrayList2, i + 1);
                        if (nLETimeSpaceNode.getEndTime() <= nLETrackSlot.getStartTime() && nLETrackSlot.getEndTime() <= nLETimeSpaceNode2.getStartTime()) {
                            numValueOf = Integer.valueOf(nLETrack3.getLayer());
                        }
                    }
                }
            }
            if (numValueOf == null) {
                return null;
            }
            Iterator<NLETrack> it5 = LJIIIIZZ(nLEModel).iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                NLETrack next3 = it5.next();
                if (next3.getLayer() == numValueOf.intValue()) {
                    nLETrack = next3;
                    break;
                }
            }
            return nLETrack;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIILLIIL(X.C385040F7u r26, X.C0F8H r27, X.InterfaceC1364105Vn<? super X.C0F88> r28) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385050F7v.LJIILLIIL(X.0F7u, X.0F8H, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0198 A[PHI: r3
      0x0198: PHI (r3v13 java.util.List<java.lang.Float>) = 
      (r3v12 java.util.List<java.lang.Float>)
      (r3v21 java.util.List<java.lang.Float>)
      (r3v21 java.util.List<java.lang.Float>)
      (r3v21 java.util.List<java.lang.Float>)
      (r3v21 java.util.List<java.lang.Float>)
     binds: [B:164:0x0195, B:129:0x013e, B:131:0x0146, B:133:0x014a, B:135:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x019f A[PHI: r3
      0x019f: PHI (r3v10 java.util.List<java.lang.Float>) = 
      (r3v9 java.util.List<java.lang.Float>)
      (r3v23 java.util.List<java.lang.Float>)
      (r3v23 java.util.List<java.lang.Float>)
      (r3v23 java.util.List<java.lang.Float>)
      (r3v23 java.util.List<java.lang.Float>)
     binds: [B:168:0x019b, B:101:0x00f6, B:103:0x00fe, B:105:0x0102, B:107:0x0106] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01a7 A[PHI: r9
      0x01a7: PHI (r9v1 float) = (r9v0 float), (r9v5 float), (r9v5 float), (r9v5 float) binds: [B:172:0x01a3, B:76:0x00be, B:78:0x00c2, B:80:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01ac A[PHI: r3 r9
      0x01ac: PHI (r3v7 java.util.List<java.lang.Float>) = 
      (r3v6 java.util.List<java.lang.Float>)
      (r3v25 java.util.List<java.lang.Float>)
      (r3v25 java.util.List<java.lang.Float>)
      (r3v25 java.util.List<java.lang.Float>)
     binds: [B:175:0x01a8, B:83:0x00cc, B:85:0x00d0, B:87:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r9v2 float) = (r9v1 float), (r9v4 float), (r9v4 float), (r9v4 float) binds: [B:175:0x01a8, B:83:0x00cc, B:85:0x00d0, B:87:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C385060F7w LJIL(com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker r13, X.C0F8H r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385050F7v.LJIL(com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker, X.0F8H, java.lang.String):X.0F7w");
    }

    public static final String LJJI(NLESegmentTextSticker nLESegmentTextSticker, C0F8H c0f8h, String str) {
        if (a0.LJJJIL(str)) {
            return "";
        }
        String strLIZJ = c0f8h.LIZJ(str);
        VecNLEResourceNodeSPtr richContentResources = nLESegmentTextSticker.getRichContentResources();
        if (richContentResources != null) {
            for (NLEResourceNode nLEResourceNode : richContentResources) {
                if (Intrinsics.LJFF(c0f8h.LIZJ(nLEResourceNode.getResourceId()), strLIZJ)) {
                    return nLEResourceNode.getResourceFile();
                }
            }
        }
        return "";
    }

    public static final float LJJIII(float f, int i, List list) {
        Number number;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, list);
        if ((objLJJJLZIJ instanceof Number) && (number = (Number) objLJJJLZIJ) != null) {
            return number.floatValue();
        }
        return f;
    }

    public static final void LJJIIJ(TextStyleModel textStyleModel, NLETextRichContent nLETextRichContent, int i) {
        Object c098200Yq;
        int iIntValue;
        Object c098200Yq2;
        int iIntValue2;
        Object c098200Yq3;
        if (textStyleModel == null) {
            return;
        }
        C385070F7x c385070F7x = nLETextRichContent.richTextData;
        nLETextRichContent.setCanvasColor(C0F9I.LIZ((int) new NLEStyText().getBackgroundColor()));
        Object obj = null;
        c385070F7x.setShadowColor(null);
        c385070F7x.setTextColor(C0F9I.LIZ(i));
        c385070F7x.setOutlineColor(null);
        if (textStyleModel.isEffectStyle) {
            c385070F7x.setEffectStyle(new Pair<>(textStyleModel.styleResId, textStyleModel.path));
            return;
        }
        TextStyleBackground textStyleBackground = textStyleModel.background;
        int iIntValue3 = 0;
        if (textStyleBackground != null) {
            try {
                c098200Yq = Integer.valueOf(Color.parseColor(textStyleBackground.color));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Integer num = (Integer) c098200Yq;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            nLETextRichContent.setCanvas(true);
            nLETextRichContent.setCanvasColor(C0F9I.LIZ(iIntValue));
        }
        TextStyleShadow textStyleShadow = textStyleModel.shadow;
        if (textStyleShadow != null) {
            try {
                c098200Yq2 = Integer.valueOf(Color.parseColor(textStyleShadow.color));
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            Integer num2 = (Integer) c098200Yq2;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            c385070F7x.setShadowColor(C0F9I.LIZ(iIntValue2));
            c385070F7x.setShadowSmooth(textStyleShadow.smooth);
            c385070F7x.setShadowOffset(C1697810uHb.LJ(Float.valueOf(textStyleShadow.offsetX), Float.valueOf(-textStyleShadow.offsetY)));
        }
        TextStyleStroke textStyleStroke = textStyleModel.stroke;
        if (textStyleStroke != null) {
            try {
                c098200Yq3 = Integer.valueOf(Color.parseColor(textStyleStroke.color));
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq3 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq3)) {
                obj = c098200Yq3;
            }
            Integer num3 = (Integer) obj;
            if (num3 != null) {
                iIntValue3 = num3.intValue();
            }
            c385070F7x.setOutlineColor(C0F9I.LIZ(iIntValue3));
            c385070F7x.setOutlineWidth(textStyleStroke.width);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0066 -> B:11:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ad -> B:12:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIJJ(android.util.Size r9, com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr r10, X.C0F8A r11, X.InterfaceC1364105Vn r12) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385050F7v.LJIJJ(android.util.Size, com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr, X.0F8A, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJJIFFI(com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker r17, java.util.List<com.ss.android.ugc.aweme.sticker.data.Word> r18, X.C0F8H r19, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel> r20) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385050F7v.LJJIFFI(com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker, java.util.List, X.0F8H, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x034e  */
    /* JADX WARN: Type inference failed for: r37v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIJ(com.bytedance.ies.nle.editor_jni.NLETrackSlot r119, com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker r120, android.util.Size r121, X.C0F8H r122, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel> r123) {
        /*
            Method dump skipped, instruction units count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385050F7v.LJIJ(com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker, android.util.Size, X.0F8H, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0207 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIJI(X.C385040F7u r17, com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker r18, android.util.Size r19, X.C0F8H r20, X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385050F7v.LJIJI(X.0F7u, com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker, android.util.Size, X.0F8H, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058 A[PHI: r11
      0x0058: PHI (r11v8 java.lang.String) = (r11v2 java.lang.String), (r11v9 java.lang.String) binds: [B:26:0x0056, B:21:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c A[PHI: r11
      0x005c: PHI (r11v7 java.lang.String) = (r11v2 java.lang.String), (r11v8 java.lang.String) binds: [B:26:0x0056, B:28:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098 A[PHI: r0 r11
      0x0098: PHI (r0v30 java.lang.String) = (r0v35 java.lang.String), (r0v36 java.lang.String) binds: [B:30:0x0066, B:28:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r11v5 java.lang.String) = (r11v7 java.lang.String), (r11v8 java.lang.String) binds: [B:30:0x0066, B:28:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIILJJIL(X.C385040F7u r13, com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent r14, java.lang.String r15, android.util.Size r16, X.C0F8H r17, X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385050F7v.LJIILJJIL(X.0F7u, com.ss.android.ugc.aweme.tools.sticker.core.text.util.NLETextRichContent, java.lang.String, android.util.Size, X.0F8H, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e A[PHI: r12
      0x005e: PHI (r12v7 java.lang.String) = (r12v1 java.lang.String), (r12v8 java.lang.String) binds: [B:26:0x005c, B:21:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6 A[PHI: r12
      0x00d6: PHI (r12v4 java.lang.String) = (r12v1 java.lang.String), (r12v7 java.lang.String) binds: [B:26:0x005c, B:28:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIILL(X.C385040F7u r14, X.C385060F7w r15, java.lang.String r16, android.util.Size r17, X.C0F8H r18, X.InterfaceC1364105Vn r19) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C385050F7v.LJIILL(X.0F7u, X.0F7w, java.lang.String, android.util.Size, X.0F8H, X.05Vn):java.lang.Object");
    }
}
