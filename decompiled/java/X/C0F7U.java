package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSAudioBean;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextEventTrackingModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F7U, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F7U {
    public static final TTSModel LIZIZ(TextStickerData textStickerData) {
        TTSModel tTSModel = new TTSModel(false, -1, "", null, null, null, 0, null, new ArrayList(), null, false, null, null, null, null, "", "", false, 0L, 0L, new ArrayList(), new TTSAudioBean(null, 1, null), false, "", new LinkedHashMap(), false);
        tTSModel.hasReadTextAudio = textStickerData.getHasReadTextAudio();
        tTSModel.audioTrackIndex = textStickerData.getAudioTrackIndex();
        tTSModel.nleUuid = textStickerData.getNleUuid();
        tTSModel.audioTrackFilePath = textStickerData.getAudioTrackFilePath();
        tTSModel.speakerID = textStickerData.getSpeakerID();
        tTSModel.speakerName = textStickerData.getSpeakerName();
        tTSModel.audioTrackDuration = textStickerData.getAudioTrackDuration();
        tTSModel.audioText = textStickerData.getAudioText();
        tTSModel.audioPathList = textStickerData.getAudioPathList();
        tTSModel.ttsVoiceModel = textStickerData.getTtsVoiceModel();
        tTSModel.autoAddTtsFlag = textStickerData.getAutoAddTtsFlag();
        tTSModel.voiceEffectId = textStickerData.getVoiceEffectId();
        tTSModel.voiceEffectResourceId = textStickerData.getVoiceEffectResourceId();
        tTSModel.voiceAnchorName = textStickerData.getVoiceAnchorName();
        tTSModel.voiceEffectIconUrl = textStickerData.getVoiceEffectIconUrl();
        tTSModel.voiceCreatorUserId = textStickerData.getVoiceCreatorUserId();
        tTSModel.voiceCreatorUserName = textStickerData.getVoiceCreatorUserName();
        tTSModel.isCreatorVoice = textStickerData.isCreatorVoice();
        tTSModel.ttsAnchorReleaseDate = textStickerData.getTtsAnchorReleaseDate();
        tTSModel.ttsReleaseDate = textStickerData.getTtsReleaseDate();
        tTSModel.ttsHashTagIds = textStickerData.getTtsHashTagIds();
        tTSModel.ttsAudioBean = textStickerData.getTtsAudioBean();
        tTSModel.isEditorProTTS = Intrinsics.LJFF(textStickerData.isEditorProTTS(), "1");
        tTSModel.editorProTTSID = textStickerData.getEditorProTTSID();
        tTSModel.ttsExtraMap.clear();
        tTSModel.ttsExtraMap.putAll(textStickerData.getTtsExtraMap());
        return tTSModel;
    }

    public static final TextStickerData LIZJ(TextStickerModel textStickerModel) {
        String str;
        TextStyleModel textStyleModelLIZ;
        String str2;
        String str3;
        TextStickerData textStickerData = new TextStickerData(textStickerModel.getTextStr(), textStickerModel.getMode(), textStickerModel.getColor(), textStickerModel.getAlign(), null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -16, -1, -1, 4095, null);
        textStickerData.setIdInNewEngine(textStickerModel.getBaseStickerModel().getId());
        textStickerData.setPlaceholderSlotId(textStickerModel.getUuid());
        if (textStickerModel.getCaptionModel() != null) {
            str = "type_inline_caption";
        } else if (C0F8Y.LJII(textStickerModel)) {
            str = "type_ai_caption";
        } else {
            str = "type_text_sticker";
        }
        textStickerData.setType(str);
        textStickerData.setTextWrapList(C123P.LIZLLL(textStickerModel.getTextStrWithLineBreak()));
        textStickerData.setRotation(textStickerModel.getBaseStickerModel().getRotation());
        textStickerData.setScale(textStickerModel.getBaseStickerModel().getScale());
        textStickerData.setFontType(textStickerModel.getFontModel().fileName);
        textStickerData.setAlpha(new TextStickerData.Pair<>(Float.valueOf(textStickerModel.getBaseStickerModel().getAlpha()), Boolean.valueOf(textStickerModel.getVisible())));
        textStickerData.setFontCategoryId(textStickerModel.getFontModel().fontCategoryId);
        textStickerData.setFontSize(textStickerModel.getFontModel().fontSize);
        textStickerData.setLineSpacingExtra(textStickerModel.getLineSpacingExtra());
        textStickerData.setX(textStickerModel.getBaseStickerModel().getCenterX() + textStickerModel.getBaseStickerModel().getTranslateX());
        textStickerData.setY(textStickerModel.getBaseStickerModel().getCenterY() + textStickerModel.getBaseStickerModel().getTranslateY());
        textStickerData.setLayoutWidth(textStickerModel.getBaseStickerModel().getContainerWidth());
        textStickerData.setLayoutHeight(textStickerModel.getBaseStickerModel().getContainerHeight());
        textStickerData.setVideoWidth(textStickerModel.getBaseStickerModel().getMediaWidth());
        textStickerData.setVideoHeight(textStickerModel.getBaseStickerModel().getMediaHeight());
        textStickerData.setStartTime((int) textStickerModel.getBaseStickerModel().getStartTime());
        textStickerData.setEndTime((int) textStickerModel.getBaseStickerModel().getEndTime());
        textStickerData.setUiStartTime((int) textStickerModel.getBaseStickerModel().getUiStartTime());
        textStickerData.setUiEndTime((int) textStickerModel.getBaseStickerModel().getUiEndTime());
        TTSModel ttsModel = textStickerModel.getTtsModel();
        String str4 = "1";
        if (ttsModel != null) {
            textStickerData.setHasReadTextAudio(ttsModel.hasReadTextAudio);
            textStickerData.setAudioTrackIndex(ttsModel.audioTrackIndex);
            textStickerData.setNleUuid(ttsModel.nleUuid);
            textStickerData.setAudioTrackFilePath(ttsModel.audioTrackFilePath);
            textStickerData.setSpeakerID(ttsModel.speakerID);
            textStickerData.setSpeakerName(ttsModel.speakerName);
            textStickerData.setAudioTrackDuration(ttsModel.audioTrackDuration);
            textStickerData.setAudioText(ttsModel.audioText);
            textStickerData.setAudioPathList(ttsModel.audioPathList);
            textStickerData.setTtsVoiceModel(ttsModel.ttsVoiceModel);
            textStickerData.setAutoAddTtsFlag(ttsModel.autoAddTtsFlag);
            textStickerData.setVoiceEffectId(ttsModel.voiceEffectId);
            textStickerData.setVoiceEffectResourceId(ttsModel.voiceEffectResourceId);
            textStickerData.setVoiceAnchorName(ttsModel.voiceAnchorName);
            textStickerData.setVoiceEffectIconUrl(ttsModel.voiceEffectIconUrl);
            textStickerData.setVoiceCreatorUserId(ttsModel.voiceCreatorUserId);
            textStickerData.setVoiceCreatorUserName(ttsModel.voiceCreatorUserName);
            textStickerData.setCreatorVoice(ttsModel.isCreatorVoice);
            textStickerData.setTtsAnchorReleaseDate(ttsModel.ttsAnchorReleaseDate);
            textStickerData.setTtsReleaseDate(ttsModel.ttsReleaseDate);
            textStickerData.setTtsHashTagIds(ttsModel.ttsHashTagIds);
            textStickerData.setTtsAudioBean(ttsModel.ttsAudioBean);
            if (ttsModel.isEditorProTTS) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            textStickerData.setEditorProTTS(str3);
            textStickerData.setEditorProTTSID(ttsModel.editorProTTSID);
            textStickerData.getTtsExtraMap().clear();
            textStickerData.getTtsExtraMap().putAll(ttsModel.ttsExtraMap);
        }
        textStickerData.setMotionModel(TextMotionModel.LIZ(textStickerModel.getTextMotionModel(), null, 0.0f, 0, null, null, 0, false, 1023));
        TextStyleModel textStyle = textStickerModel.getTextStyle();
        if (textStyle != null) {
            textStyleModelLIZ = TextStyleModel.LIZ(textStyle, null, null, null, null, false, null, 2047);
        } else {
            textStyleModelLIZ = null;
        }
        textStickerData.setTextStyle(textStyleModelLIZ);
        textStickerData.setCaptionTemplateModel(CaptionTemplateModel.LIZ(textStickerModel.getCaptionTemplateModel(), false, null, null, false, false, false, 63));
        textStickerData.setWords(textStickerModel.getWords());
        textStickerData.setFilterTag(textStickerModel.getFilterTag());
        textStickerData.setFilterSelected(textStickerModel.getFilterSelected());
        textStickerData.setCacheWords(textStickerModel.getCacheWords());
        textStickerData.setClipStart(textStickerModel.getClipStart());
        textStickerData.setClipEnd(textStickerModel.getClipEnd());
        textStickerData.setTextEventTracking(TextEventTrackingModel.LIZ(textStickerModel.getTextEventTracking()));
        textStickerData.setAdjustTextParagraph(textStickerModel.getMobModel().adjustTextParagraph);
        textStickerData.setAdjustTextStyleInEditorPro(textStickerModel.getMobModel().adjustTextStyleInEditorPro);
        textStickerData.setAdjustTextColorInEditorPro(textStickerModel.getMobModel().adjustTextColorInEditorPro);
        textStickerData.setAdjustTextFontInEditorPro(textStickerModel.getMobModel().adjustTextFontInEditorPro);
        textStickerData.setAdjustTextPositionInEditorPro(textStickerModel.getMobModel().adjustTextPositionInEditorPro);
        textStickerData.setEditorProTrimLength(textStickerModel.getMobModel().isEditorProTrimLength);
        if (textStickerModel.getSourceType() == C0F7S.EDITOR_PRO) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        textStickerData.setEditorProText(str2);
        textStickerData.setEditorProCopyText(textStickerModel.getMobModel().isEditorProCopyText);
        CaptionModel captionModel = textStickerModel.getCaptionModel();
        if (captionModel == null || !captionModel.isEditorProCaption) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        textStickerData.setEditorProCaption(str4);
        textStickerData.setTextStickerInfo(textStickerModel.getTextStickerInfo());
        textStickerData.setAutoLineBreak(textStickerModel.getAutoLineBreak());
        textStickerData.setForceEffectRender(textStickerModel.getForceEffectRender());
        C0FHM c0fhm = textStickerModel.getEditViewUIState().fontListUIState;
        C0FHM c0fhm2 = C0FHM.VISIBLE;
        if (c0fhm == c0fhm2) {
            textStickerData.setLastEditFunc("font");
        } else if (textStickerModel.getEditViewUIState().colorListUIState == c0fhm2) {
            textStickerData.setLastEditFunc("color");
        }
        textStickerData.setCanvasWHFixed(textStickerModel.getCanvasWHFixed());
        textStickerData.setAutoAdaptCanvas(textStickerModel.getAutoAdaptCanvas());
        textStickerData.setAutoAdaptDpi(textStickerModel.getAutoAdaptDpi());
        textStickerData.setFixedFontSize(textStickerModel.getFixedFontSize());
        textStickerData.setManualEdited(textStickerModel.isManualEdited());
        textStickerData.setCompatModel(textStickerModel.getCompatModel());
        return textStickerData;
    }

    public static final List<TextStickerData> LJI(VideoPublishEditModel videoPublishEditModel) {
        List<StickerItemModel> list;
        if (C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel)) {
            List<TextStickerModel> listLJJIJIL = C1416310mxZ.LJJIJIL(videoPublishEditModel);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJIJIL, 10));
            Iterator<TextStickerModel> it2 = listLJJIJIL.iterator();
            while (it2.hasNext()) {
                arrayList.add(LIZJ(it2.next()));
            }
            return arrayList;
        }
        try {
            InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
            if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (StickerItemModel stickerItemModel : list) {
                    if (stickerItemModel.isNormalTextSticker()) {
                        arrayList2.add(stickerItemModel);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), ((StickerItemModel) it3.next()).extra, TextStickerData.class));
                }
                return arrayList3;
            }
            return C13BV.INSTANCE;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2) {
        /*
            boolean r0 = X.C1428470nHB.LJLIIL(r2)
            if (r0 != 0) goto L13
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r2.creativeModel
            com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel r0 = r0.stickerModel
            java.util.List<com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel> r0 = r0.textStickerModels
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
        L13:
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r2.getImageAlbumData()
            if (r0 == 0) goto L4f
            java.util.List r0 = r0.getImageList()
            if (r0 == 0) goto L4f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L28:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r0 = (com.ss.android.ugc.aweme.creative.model.edit.SingleImageData) r0
            com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine r0 = r0.getStickerInfoNewEngine()
            if (r0 == 0) goto L44
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.getTextStickerModels()
            if (r0 == 0) goto L44
        L40:
            X.C19719612Di.LJJI(r0, r2)
            goto L28
        L44:
            X.13BV r0 = X.C13BV.INSTANCE
            goto L40
        L47:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L4f
            r0 = 0
            goto L50
        L4f:
            r0 = 1
        L50:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F7U.LJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static final boolean LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        List<StickerItemModel> list;
        if (!C1428470nHB.LJLIIL(videoPublishEditModel)) {
            InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
            if (infoStickerModel != null && (list = infoStickerModel.stickers) != null && !list.isEmpty()) {
                Iterator<StickerItemModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next().isTextSticker()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<SingleImageData> it3 = imageList.iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(it3.next().getStickerInfo().getStickers(), arrayList);
            }
            if (!arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    if (((StickerItemModel) it4.next()).isTextSticker()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final StickerItemModel LIZ(int i, TextStickerData textStickerData) {
        String json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), textStickerData);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("text_sticker_");
        sbLIZ.append(i);
        StickerItemModel stickerItemModel = new StickerItemModel(C2188811AlT.LIZIZ(sbLIZ), "", json, i, false, textStickerData.getStartTime(), textStickerData.getEndTime(), 2);
        stickerItemModel.isImageStickerLayer = true;
        stickerItemModel.adjustTextParagraph = textStickerData.getAdjustTextParagraph();
        stickerItemModel.adjustTextStyleInEditorPro = textStickerData.getAdjustTextStyleInEditorPro();
        stickerItemModel.adjustTextColorInEditorPro = textStickerData.getAdjustTextColorInEditorPro();
        stickerItemModel.adjustTextFontInEditorPro = textStickerData.getAdjustTextFontInEditorPro();
        stickerItemModel.adjustTextPositionInEditorPro = textStickerData.getAdjustTextPositionInEditorPro();
        stickerItemModel.isEditorProTrimLength = textStickerData.isEditorProTrimLength();
        stickerItemModel.isEditorProText = textStickerData.isEditorProText();
        stickerItemModel.isEditorProCopyText = textStickerData.isEditorProCopyText();
        stickerItemModel.isEditorProTTS = textStickerData.isEditorProTTS();
        stickerItemModel.editorProTTSID = textStickerData.getEditorProTTSID();
        stickerItemModel.isEditorProCaption = textStickerData.isEditorProCaption();
        return stickerItemModel;
    }

    public static final List<TextStickerData> LJFF(SingleImageData singleImageData, boolean z) {
        CopyOnWriteArrayList<TextStickerModel> textStickerModels;
        if (z) {
            ImageStickerInfoNewEngine stickerInfoNewEngine = singleImageData.getStickerInfoNewEngine();
            if (stickerInfoNewEngine != null && (textStickerModels = stickerInfoNewEngine.getTextStickerModels()) != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(textStickerModels, 10));
                Iterator<TextStickerModel> it2 = textStickerModels.iterator();
                while (it2.hasNext()) {
                    arrayList.add(LIZJ(it2.next()));
                }
                return arrayList;
            }
            return C13BV.INSTANCE;
        }
        try {
            List<StickerItemModel> stickers = singleImageData.getStickerInfo().getStickers();
            ArrayList arrayList2 = new ArrayList();
            for (StickerItemModel stickerItemModel : stickers) {
                if (stickerItemModel.isNormalTextSticker()) {
                    arrayList2.add(stickerItemModel);
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), ((StickerItemModel) it3.next()).extra, TextStickerData.class));
            }
            return arrayList3;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b4 A[PHI: r38
      0x03b4: PHI (r38v2 boolean) = (r38v1 boolean), (r38v6 boolean) binds: [B:149:0x03b0, B:110:0x0204] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel LIZLLL(com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData r74, boolean r75, kotlin.Pair<java.lang.Integer, java.lang.Integer> r76) {
        /*
            Method dump skipped, instruction units count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F7U.LIZLLL(com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData, boolean, kotlin.Pair):com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel");
    }

    public static /* synthetic */ TextStickerModel LJ(TextStickerData textStickerData, Pair pair, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            pair = null;
        }
        return LIZLLL(textStickerData, z, pair);
    }

    public static final void LJIIIZ(Context context, final ViewGroup viewGroup, final String str, final TextStickerData textStickerData, final Function1<? super TextStickerTextWrap, Unit> function1) {
        final C124Q c124q = new C124Q(context, null);
        int visibility = c124q.getVisibility();
        c124q.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, c124q);
        int iLIZ = (int) C0JAI.LIZ(32.0f, context);
        int iLIZ2 = (int) C0JAI.LIZ(12.0f, context);
        c124q.setPadding(iLIZ, iLIZ2, iLIZ, iLIZ2);
        c124q.setTextSize(1, textStickerData.getFontSize());
        c124q.setFontType(C0FI2.LJJI(textStickerData.getFontType()));
        c124q.setAligin(textStickerData.getAlign());
        c124q.setText(textStickerData.getTextStr());
        viewGroup.addView(c124q, new ViewGroup.LayoutParams(-1, -2));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" -> addToProcessSplitTextTask fontType=");
        sbLIZ.append(textStickerData.getFontType());
        sbLIZ.append(" text=");
        sbLIZ.append(textStickerData.getTextStr());
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        HandlerHook.viewPost(c124q, new Runnable() { // from class: X.0F7W
            public final void LIZ() {
                TextStickerTextWrap textStickerTextWrapLIZ = C123P.LIZ(c124q, new ArrayList());
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(" ->  addToProcessSplitTextTask split text: ");
                sbLIZ2.append(Arrays.toString(textStickerTextWrapLIZ.getStrArray()));
                C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
                textStickerData.setTextWrapList(C1697810uHb.LJ(textStickerTextWrapLIZ));
                function1.invoke(textStickerTextWrapLIZ);
                C786410Ut5.LJJJLZIJ(c124q, viewGroup);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TextDataConverterKt@c98b.mockViewToSplitText$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TextDataConverterKt@c98b.mockViewToSplitText$1");
            }
        });
    }

    public static final void LJIIJ(Context context, InterfaceC1455860nzM interfaceC1455860nzM, String str, TextStickerData textStickerData, Function1<? super TextStickerTextWrap, Unit> function1) {
        LJIIIZ(context, interfaceC1455860nzM.UZ(), str, textStickerData, function1);
    }
}
