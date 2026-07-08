package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364470EQr {
    public static final C364470EQr LIZ = new C364470EQr();

    public static TextStickerData LIZIZ(StickerItemModel stickerItemModel) {
        try {
            Object objLJII = C0CHQ.LIZ().getGson().LJII(stickerItemModel.extra, TextStickerData.class);
            TextStickerData textStickerData = (TextStickerData) objLJII;
            textStickerData.setUiStartTime(textStickerData.getStartTime());
            textStickerData.setUiEndTime(textStickerData.getEndTime());
            return (TextStickerData) objLJII;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VEVideoPublishEditActivity -> Exception: ");
            sbLIZ.append(e);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static TextStickerData LIZ(int i, NLETrackSlot nLETrackSlot) {
        int i2;
        String str;
        if (!nLETrackSlot.hasExtra("text_sticker_data")) {
            return null;
        }
        TextStickerData textStickerDataLIZIZ = C363430EMr.LIZIZ(nLETrackSlot.getExtra("text_sticker_data"));
        textStickerDataLIZIZ.setRotation((-nLETrackSlot.getRotation()) % 360);
        textStickerDataLIZIZ.setScale(nLETrackSlot.getScale());
        long startTime = nLETrackSlot.getStartTime();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        textStickerDataLIZIZ.setStartTime((int) (startTime / j));
        textStickerDataLIZIZ.setEndTime((int) (nLETrackSlot.getEndTime() / j));
        textStickerDataLIZIZ.setColor(CastIntegerProtector.parseInt(nLETrackSlot.getExtra("color")));
        textStickerDataLIZIZ.setFontSize(CastIntegerProtector.parseInt(nLETrackSlot.getExtra("font_size")));
        textStickerDataLIZIZ.setLineSpacingExtra(CastFloatProtector.parseFloat(nLETrackSlot.getExtra("lineSpacingExtra")));
        textStickerDataLIZIZ.setTextWrapList(C363430EMr.LIZJ(nLETrackSlot.getExtra("text_wrap_list")));
        textStickerDataLIZIZ.setFontType(nLETrackSlot.getExtra("font_type"));
        textStickerDataLIZIZ.setAlign(CastIntegerProtector.parseInt(nLETrackSlot.getExtra("align")));
        textStickerDataLIZIZ.setBgMode(CastIntegerProtector.parseInt(nLETrackSlot.getExtra("bg_mode")));
        textStickerDataLIZIZ.setTextStr(nLETrackSlot.getExtra("text"));
        textStickerDataLIZIZ.setX(C363400EMo.LIZJ(nLETrackSlot.getTransformX()));
        textStickerDataLIZIZ.setY(C363400EMo.LIZLLL(nLETrackSlot.getTransformY()));
        textStickerDataLIZIZ.setPlaceholderSlotId(nLETrackSlot.getUUID());
        textStickerDataLIZIZ.setAdjustTextStyleInEditorPro(nLETrackSlot.getExtra("is_editorpro_adjust_text_style"));
        textStickerDataLIZIZ.setAdjustTextParagraph(nLETrackSlot.getExtra("is_editorpro_adjust_text_paragraph"));
        textStickerDataLIZIZ.setAdjustTextFontInEditorPro(nLETrackSlot.getExtra("is_editorpro_adjust_text_font"));
        textStickerDataLIZIZ.setAdjustTextColorInEditorPro(nLETrackSlot.getExtra("is_editorpro_adjust_text_color"));
        textStickerDataLIZIZ.setAdjustTextPositionInEditorPro(nLETrackSlot.getExtra("is_editorpro_adjust_text_position"));
        textStickerDataLIZIZ.setEditorProCaption(nLETrackSlot.getExtra("is_editorpro_captions"));
        textStickerDataLIZIZ.setEditorProTrimLength(nLETrackSlot.getExtra("is_editorpro_trim_text_length"));
        textStickerDataLIZIZ.setEditorProText(nLETrackSlot.getExtra("is_editorpro_text"));
        textStickerDataLIZIZ.setEditorProCopyText(nLETrackSlot.getExtra("is_editorpro_copy_text"));
        textStickerDataLIZIZ.setEditorProTTS(nLETrackSlot.getExtra("is_editorpro_tts"));
        textStickerDataLIZIZ.setEditorProTTSID(nLETrackSlot.getExtra("editorpro_tts_tone_id"));
        textStickerDataLIZIZ.setUseAutoTextSize(Boolean.parseBoolean(nLETrackSlot.getExtra("is_use_auto_size")));
        textStickerDataLIZIZ.setHasChangedFontSize(Boolean.parseBoolean(nLETrackSlot.getExtra("font_size_changed")));
        if (nLETrackSlot.hasExtra("ep_slot_add_order")) {
            i2 = CastIntegerProtector.parseInt(nLETrackSlot.getExtra("ep_slot_add_order"));
        } else {
            i2 = 0;
        }
        textStickerDataLIZIZ.setTextSlotAddOrder(i2);
        textStickerDataLIZIZ.setTextSlotTrackOrder(i);
        if (C349550Dn7.LJFF(nLETrackSlot)) {
            str = "type_inline_caption";
        } else if (Intrinsics.LJFF(nLETrackSlot.getExtra("text_slot_type"), "AI_CAPTION")) {
            str = "type_ai_caption";
        } else {
            str = "type_text_sticker";
        }
        textStickerDataLIZIZ.setType(str);
        return textStickerDataLIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12, com.bytedance.ies.nle.editor_jni.NLEModel r13, X.C364440EQo r14) {
        /*
            r5 = 0
            if (r12 == 0) goto L16
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r12.creativeModel
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.creative.model.InlineCaptionModel r1 = r0.inlineCaptionModel
        L9:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r12.creativeModel
            if (r0 == 0) goto Lf
            r0.inlineCaptionModel = r5
        Lf:
            boolean r0 = X.C349560Dn8.LJFF(r13)
            if (r0 != 0) goto L1a
            return
        L16:
            r1 = r5
            if (r12 == 0) goto Lf
            goto L9
        L1a:
            if (r14 == 0) goto L88
            X.0F5c r0 = new X.0F5c
            r0.<init>()
            java.lang.String r2 = r0.LIZ(r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel> r0 = r14.LIZ
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel r0 = (com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionCachesModel) r0
            if (r0 == 0) goto L88
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionQueryInfo r0 = r0.captionQueryInfo
            if (r0 == 0) goto L37
            java.lang.String r4 = r0.audioTosKey
            if (r4 != 0) goto L3b
        L37:
            if (r1 == 0) goto L86
            java.lang.String r4 = r1.audioUri
        L3b:
            if (r0 == 0) goto L41
            java.lang.String r10 = r0.taskId
            if (r10 != 0) goto L45
        L41:
            if (r1 == 0) goto L84
            java.lang.String r10 = r1.taskId
        L45:
            if (r12 == 0) goto L83
            com.ss.android.ugc.aweme.creative.model.CreativeModel r2 = r12.creativeModel
            if (r2 == 0) goto L83
            X.0F5c r0 = new X.0F5c
            r0.<init>()
            java.lang.String r0 = r0.LIZ(r5)
            java.lang.String r6 = X.C371890Ei3.LIZIZ(r0)
            X.0F5c r0 = new X.0F5c
            r0.<init>()
            java.lang.String r7 = r0.LIZ(r5)
            if (r1 == 0) goto L67
            java.lang.String r8 = r1.recognizedLanguage
            if (r8 != 0) goto L6b
        L67:
            java.lang.String r8 = X.C0EJ1.LIZLLL(r12, r13)
        L6b:
            boolean r1 = X.C1416310mxZ.LJJLIIIJJIZ(r12)
            r0 = 1
            if (r1 == r0) goto L77
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L77:
            com.ss.android.ugc.aweme.creative.model.InlineCaptionModel r3 = new com.ss.android.ugc.aweme.creative.model.InlineCaptionModel
            r9 = 0
            r11 = 0
            r12 = r11
            r13 = r11
            r14 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2.inlineCaptionModel = r3
        L83:
            return
        L84:
            r10 = r5
            goto L45
        L86:
            r4 = r5
            goto L3b
        L88:
            r0 = r5
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364470EQr.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.ies.nle.editor_jni.NLEModel, X.0EQo):void");
    }
}
