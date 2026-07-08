package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363430EMr {
    public static TextStickerData LIZIZ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = (TextStickerData) C0CHQ.LIZ().getGson().LJII(str, TextStickerData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        TextStickerData textStickerData = (TextStickerData) c098200Yq;
        if (textStickerData == null) {
            return new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1, -1, -1, 4095, null);
        }
        return textStickerData;
    }

    public static List LIZJ(String str) {
        List list = (List) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), str, new TypeToken<List<? extends TextStickerTextWrap>>() { // from class: X.0EMs
        }.getType());
        if (list == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    public static String LIZLLL(TextStickerData textStickerData) {
        return GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), textStickerData);
    }

    public static String LJ(List list) {
        return GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), list);
    }

    public static NLETrackSlot LIZ(TextStickerData textStickerData, C0EKL c0ekl, int i, int i2, C0E48 c0e48) {
        String str;
        String str2;
        String strLJIIIIZZ;
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProScene -> data.type = ");
        sbLIZ.append(textStickerData.getType());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(textStickerData.getType(), "type_inline_caption")) {
            str = "SUBTITLE";
        } else if (textStickerData.isAICaption()) {
            str = "AI_CAPTION";
        } else {
            str = "TEXT_STICKER";
        }
        nLETrackSlot.setExtra("text_slot_type", str);
        float f = i;
        textStickerData.setLayoutWidth(f);
        float f2 = i2;
        textStickerData.setLayoutHeight(f2);
        int i3 = C0EKM.LIZ[c0ekl.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new C1954807lC();
                }
            } else if (textStickerData.getX() != 0.0f || textStickerData.getY() != 0.0f) {
                if (C364210EPr.LIZIZ && C0F7U.LJ(textStickerData, null, 3).isVERenderSticker()) {
                    nLETrackSlot.setTransformX(((2 * textStickerData.getX()) / f) - 1.0f);
                    nLETrackSlot.setTransformY((((-2) * textStickerData.getY()) / f2) + 1.0f);
                } else {
                    nLETrackSlot.setTransformX(textStickerData.getX() - (f / 2.0f));
                    nLETrackSlot.setTransformY(textStickerData.getY() - (f2 / 2.0f));
                }
            }
        } else {
            nLETrackSlot.setTransformX(((2 * textStickerData.getX()) / f) - 1.0f);
            nLETrackSlot.setTransformY((((-2) * textStickerData.getY()) / f2) + 1.0f);
            nLETrackSlot.setRotation((-textStickerData.getRotation()) % 360);
            nLETrackSlot.setScale(textStickerData.getScale());
            long startTime = textStickerData.getStartTime();
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            nLETrackSlot.setStartTime(startTime * j);
            nLETrackSlot.setEndTime(((long) textStickerData.getEndTime()) * j);
            if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue()) {
                long jLJII = C351220Dpo.LJII(C350870DpF.LJI(c0e48));
                if (nLETrackSlot.getEndTime() <= jLJII) {
                    jLJII = nLETrackSlot.getEndTime();
                }
                nLETrackSlot.setEndTime(jLJII);
            }
        }
        nLETrackSlot.setExtra("text_sticker_data", LIZLLL(textStickerData));
        nLETrackSlot.setExtra("color", String.valueOf(textStickerData.getColor()));
        nLETrackSlot.setExtra("text_wrap_list", LJ(textStickerData.getTextWrapList()));
        nLETrackSlot.setExtra("text_inline_styles", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), textStickerData.getInlineTextStyles()));
        String fontType = textStickerData.getFontType();
        String str3 = "";
        if (fontType == null) {
            fontType = "";
        }
        nLETrackSlot.setExtra("font_type", fontType);
        nLETrackSlot.setExtra("align", String.valueOf(textStickerData.getAlign()));
        nLETrackSlot.setExtra("bg_mode", String.valueOf(textStickerData.getBgMode()));
        nLETrackSlot.setExtra("font_size", String.valueOf(textStickerData.getFontSize()));
        nLETrackSlot.setExtra("lineSpacingExtra", String.valueOf(textStickerData.getLineSpacingExtra()));
        nLETrackSlot.setExtra("text", textStickerData.getTextStr());
        nLETrackSlot.setExtra("is_use_auto_size", String.valueOf(textStickerData.isUseAutoTextSize()));
        nLETrackSlot.setExtra("font_size_changed", String.valueOf(textStickerData.getHasChangedFontSize()));
        nLETrackSlot.setExtra("ep_slot_add_order", String.valueOf(textStickerData.getTextSlotAddOrder()));
        nLETrackSlot.setExtra("is_meme_audio", textStickerData.getTtsExtraMap().get("is_meme_audio"));
        if (textStickerData.isAICaption()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        nLETrackSlot.setExtra("is_ai_meme", str2);
        nLETrackSlot.setExtra("is_editorpro_adjust_text_color", textStickerData.getAdjustTextColorInEditorPro());
        nLETrackSlot.setExtra("is_editorpro_adjust_text_font", textStickerData.getAdjustTextFontInEditorPro());
        nLETrackSlot.setExtra("is_editorpro_adjust_text_paragraph", textStickerData.getAdjustTextParagraph());
        nLETrackSlot.setExtra("is_editorpro_adjust_text_style", textStickerData.getAdjustTextStyleInEditorPro());
        nLETrackSlot.setExtra("is_editorpro_adjust_text_position", textStickerData.getAdjustTextPositionInEditorPro());
        nLETrackSlot.setExtra("is_editorpro_captions", textStickerData.isEditorProCaption());
        nLETrackSlot.setExtra("is_editorpro_trim_text_length", textStickerData.isEditorProTrimLength());
        nLETrackSlot.setExtra("is_editorpro_text", textStickerData.isEditorProText());
        nLETrackSlot.setExtra("is_editorpro_copy_text", textStickerData.isEditorProCopyText());
        if (Intrinsics.LJFF(textStickerData.isEditorProCaption(), "1")) {
            nLETrackSlot.setExtra("edit_captions_duration", String.valueOf(textStickerData.getEditInEPDuration()));
        } else {
            nLETrackSlot.setExtra("adjust_text_content_duration", String.valueOf(textStickerData.getEditInEPDuration()));
        }
        nLETrackSlot.setExtra("is_editorpro_tts", textStickerData.isEditorProTTS());
        nLETrackSlot.setExtra("editorpro_tts_tone_id", textStickerData.getEditorProTTSID());
        nLETrackSlot.setExtra("use_dropper_color", String.valueOf(textStickerData.isUseColorDropper()));
        nLETrackSlot.setExtra("use_adjust_text_roll_bar", String.valueOf(textStickerData.isAdjustTextRollbar()));
        if (!TextUtils.isEmpty(textStickerData.getNleUuid())) {
            nLETrackSlot.setExtra("text_tts_id", textStickerData.getNleUuid());
            String audioText = textStickerData.getAudioText();
            if (audioText == null) {
                audioText = "";
            }
            nLETrackSlot.setExtra("ep_text_tts_content", audioText);
            nLETrackSlot.setExtra("text_tts_duration", String.valueOf(textStickerData.getAudioTrackDuration()));
            String audioTrackFilePath = textStickerData.getAudioTrackFilePath();
            if (audioTrackFilePath == null) {
                audioTrackFilePath = "";
            }
            nLETrackSlot.setExtra("tts_audio_path", audioTrackFilePath);
            String speakerID = textStickerData.getSpeakerID();
            if (speakerID != null) {
                str3 = speakerID;
            }
            nLETrackSlot.setExtra("ep_text_tts_speaker_id", str3);
        }
        if (nLETrackSlot.getMainSegment() == null) {
            nLETrackSlot.setMainSegment(new NLESegmentTextSticker());
        } else {
            NLENode nLENodeDeepCloneWithUUID = new NLESegmentTextSticker().deepCloneWithUUID(nLETrackSlot.getMainSegment().getUUID());
            if (nLENodeDeepCloneWithUUID != null) {
                nLETrackSlot.setMainSegment(NLESegmentTextSticker.dynamicCast(nLENodeDeepCloneWithUUID));
            }
        }
        NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentTextStickerDynamicCast != null && C364210EPr.LIZIZ) {
            TextStickerModel textStickerModelLIZLLL = C0F7U.LIZLLL(textStickerData, true, new Pair(Integer.valueOf(i / 2), Integer.valueOf(i2 / 2)));
            if (textStickerModelLIZLLL.isVERenderSticker()) {
                nLESegmentTextStickerDynamicCast.setIsRichtext(true);
                nLESegmentTextStickerDynamicCast.setRichContent(C385050F7v.LIZIZ(textStickerModelLIZLLL, C0CHQ.LIZ().getAppLanguage()));
                if (!textStickerData.getMotionModel().autoWrapLine && C363290EMd.LIZ(textStickerData.getMotionModel())) {
                    strLJIIIIZZ = C385050F7v.LIZ(textStickerModelLIZLLL);
                } else {
                    strLJIIIIZZ = C123P.LJIIIIZZ(textStickerData.getTextWrapList());
                }
                nLESegmentTextStickerDynamicCast.setContent(strLJIIIIZZ);
            }
        }
        return nLETrackSlot;
    }
}
