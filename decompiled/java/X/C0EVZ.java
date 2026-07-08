package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSAudioBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EVZ {
    public static final C0EVZ LIZ = new C0EVZ();

    public static void LIZJ(NLETrackSlot nLETrackSlot, C0E48 c0e48) {
        NLETrack trackBySlot;
        NLEModel nLEModelLJI = null;
        if (c0e48 != null) {
            nLEModelLJI = C350870DpF.LJI(c0e48);
        }
        if (nLETrackSlot != null && nLETrackSlot.hasExtra("text_tts_id")) {
            String extra = nLETrackSlot.getExtra("text_tts_id");
            if (nLEModelLJI != null && (trackBySlot = nLEModelLJI.getTrackBySlot(C354870Dvh.LIZJ(nLEModelLJI, extra))) != null) {
                nLEModelLJI.removeTrack(trackBySlot);
            }
            TextStickerData textStickerDataLIZIZ = C363430EMr.LIZIZ(nLETrackSlot.getExtra("text_sticker_data"));
            textStickerDataLIZIZ.setNleUuid("");
            textStickerDataLIZIZ.setAudioText("");
            textStickerDataLIZIZ.setAudioTrackFilePath("");
            textStickerDataLIZIZ.setAudioTrackDuration(0);
            textStickerDataLIZIZ.setSpeakerID("");
            textStickerDataLIZIZ.setHasReadTextAudio(false);
            nLETrackSlot.setExtra("text_sticker_data", C363430EMr.LIZLLL(textStickerDataLIZIZ));
            nLETrackSlot.removeExtraWithKey("tts_audio_path");
            nLETrackSlot.removeExtraWithKey("text_tts_id");
        }
    }

    public final void LIZIZ(NLETrackSlot nLETrackSlot, C0E48 c0e48) {
        if (nLETrackSlot != null && nLETrackSlot.hasExtra("text_tts_id") && nLETrackSlot.hasExtra("text_tts_duration") && nLETrackSlot.hasExtra("tts_audio_path") && nLETrackSlot.hasExtra("ep_text_tts_speaker_id") && nLETrackSlot.hasExtra("text")) {
            String extra = nLETrackSlot.getExtra("text_tts_duration");
            String extra2 = nLETrackSlot.getExtra("tts_audio_path");
            String extra3 = nLETrackSlot.getExtra("ep_text_tts_speaker_id");
            String extra4 = nLETrackSlot.getExtra("text");
            String extra5 = nLETrackSlot.getExtra("text_tts_id");
            if (c0e48 != null) {
                NLETrack trackBySlot = C350870DpF.LJI(c0e48).getTrackBySlot(C354870Dvh.LIZJ(C350870DpF.LJI(c0e48), extra5));
                if (trackBySlot != null) {
                    C350870DpF.LJI(c0e48).removeTrack(trackBySlot);
                }
            }
            nLETrackSlot.removeExtraWithKey("text_tts_id");
            LIZLLL(this, c0e48, nLETrackSlot, extra4, extra3, extra2, CastIntegerProtector.parseInt(extra), null, null, 192);
        }
    }

    public final void LIZ(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, C0E48 c0e48) {
        String extra;
        if (nLETrackSlot.hasExtra("text_tts_id") && nLETrackSlot.hasExtra("text_tts_duration") && nLETrackSlot.hasExtra("tts_audio_path") && nLETrackSlot.hasExtra("ep_text_tts_speaker_id") && nLETrackSlot.hasExtra("text")) {
            String extra2 = nLETrackSlot.getExtra("text_tts_duration");
            String extra3 = nLETrackSlot.getExtra("tts_audio_path");
            String extra4 = nLETrackSlot.getExtra("ep_text_tts_speaker_id");
            String extra5 = nLETrackSlot.getExtra("text");
            if (nLETrackSlot.hasExtra("tts_effect_id")) {
                extra = nLETrackSlot.getExtra("tts_effect_id");
            } else {
                extra = "";
            }
            LIZLLL(this, c0e48, nLETrackSlot2, extra5, extra4, extra3, CastIntegerProtector.parseInt(extra2), null, extra, 64);
        }
    }

    public static NLETrackSlot LIZLLL(C0EVZ c0evz, C0E48 c0e48, NLETrackSlot nLETrackSlot, String str, String str2, String str3, int i, ReadTextEffectBean readTextEffectBean, String str4, int i2) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        String str5;
        String str6 = str4;
        ReadTextEffectBean readTextEffectBean2 = readTextEffectBean;
        String effect_id = null;
        if ((i2 & 64) != 0) {
            readTextEffectBean2 = null;
        }
        if ((i2 & 128) != 0) {
            str6 = "";
        }
        c0evz.getClass();
        if (c0e48 != null && (interfaceC351350Dq1LLFII = c0e48.LLFII()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(FollowStatusChangeMethod.PARAM_UID);
            NLETrackSlot nLETrackSlotLLILLIZIL = interfaceC351350Dq1LLFII.LLILLIZIL(new C350340DoO(str, str3, C2188811AlT.LIZIZ(sbLIZ), nLETrackSlot.getStartTime(), 0L, false, false, 0L, 0L, ((ArrayList) C351220Dpo.LJIJJ(C350870DpF.LJI(c0e48))).size(), true, null, null, 0.0f, false, Float.valueOf(C0FM8.LIZ * 1.0f), 521200), EnumC356070Dxd.COMMIT);
            if (nLETrackSlotLLILLIZIL != null) {
                nLETrackSlotLLILLIZIL.setExtra("is_editor_pro_tts_used", "true");
                NLETrack nLETrackLJLLILLLL = C351220Dpo.LJLLILLLL(C350870DpF.LJI(c0e48), nLETrackSlotLLILLIZIL.getUUID());
                if (nLETrackLJLLILLLL != null) {
                    nLETrackLJLLILLLL.setExtra("AudioTrackType", "TEXT_SPEAK");
                    nLETrackLJLLILLLL.setExtra("add_tts_from_editor_pro", "true");
                }
                nLETrackSlot.setExtra("text_tts_id", nLETrackSlotLLILLIZIL.getUUID());
                nLETrackSlot.setExtra("ep_text_tts_content", str);
                nLETrackSlot.setExtra("text_tts_duration", String.valueOf(i));
                nLETrackSlot.setExtra("tts_audio_path", str3);
                nLETrackSlot.setExtra("ep_text_tts_speaker_id", str2);
                if (!a0.LJJJIL(str6)) {
                    nLETrackSlot.setExtra("tts_effect_id", str6);
                }
                String str7 = "1";
                if (((Boolean) C284590BDl.LIZ.getValue()).booleanValue()) {
                    nLETrackSlot.setExtra("is_editorpro_tts", "1");
                    nLETrackSlot.setExtra("editorpro_tts_tone_id", str6);
                }
                TextStickerData textStickerDataLIZIZ = C363430EMr.LIZIZ(nLETrackSlot.getExtra("text_sticker_data"));
                textStickerDataLIZIZ.setAudioText(str);
                textStickerDataLIZIZ.setNleUuid(nLETrackSlotLLILLIZIL.getUUID());
                textStickerDataLIZIZ.setAudioTrackFilePath(str3);
                textStickerDataLIZIZ.setAudioTrackDuration(i);
                textStickerDataLIZIZ.setSpeakerID(str2);
                textStickerDataLIZIZ.setHasReadTextAudio(true);
                if (readTextEffectBean2 != null) {
                    textStickerDataLIZIZ.setSpeakerName(readTextEffectBean2.mSpeaker.speakerName);
                    textStickerDataLIZIZ.setVoiceAnchorName(readTextEffectBean2.mSpeaker.ttsAnchorName);
                    textStickerDataLIZIZ.setVoiceEffectId(readTextEffectBean2.effect.getEffect_id());
                    textStickerDataLIZIZ.setVoiceEffectIconUrl((String) C13LP.LJJJLL(readTextEffectBean2.effect.getIcon_url().getUrlList()));
                    textStickerDataLIZIZ.setVoiceEffectResourceId(readTextEffectBean2.effect.getResource_id());
                    textStickerDataLIZIZ.setVoiceCreatorUserId(readTextEffectBean2.mSpeaker.voiceCreatorUserId);
                    textStickerDataLIZIZ.setVoiceCreatorUserName(readTextEffectBean2.mSpeaker.voiceCreatorUserName);
                    textStickerDataLIZIZ.setCreatorVoice(readTextEffectBean2.mSpeaker.isCreatorVoice);
                    textStickerDataLIZIZ.setTtsAnchorReleaseDate(readTextEffectBean2.mSpeaker.ttsAnchorReleaseDate);
                    textStickerDataLIZIZ.setTtsReleaseDate(readTextEffectBean2.mSpeaker.ttsReleaseDate);
                    List<String> challenge = readTextEffectBean2.effect.getChallenge();
                    if (challenge == null) {
                        challenge = C13BV.INSTANCE;
                    }
                    textStickerDataLIZIZ.setTtsAudioBean(new TTSAudioBean(challenge));
                    textStickerDataLIZIZ.getTtsExtraMap().put("tts_tab_id", readTextEffectBean2.category.id);
                    textStickerDataLIZIZ.getTtsExtraMap().put("tts_tab_name", readTextEffectBean2.category.name);
                    textStickerDataLIZIZ.getTtsExtraMap().put("is_aigc_content", C2378709Tt.LIZIZ(readTextEffectBean2.mEffect));
                    Map<String, String> ttsExtraMap = textStickerDataLIZIZ.getTtsExtraMap();
                    Effect effect = readTextEffectBean2.effect;
                    C1446130njf c1446130njf = C1446130njf.LIZ;
                    c1446130njf.getClass();
                    if (C1446130njf.LIZIZ(effect, "is_instant_clone", false)) {
                        str5 = "1";
                    } else {
                        str5 = CardStruct.IStatusCode.DEFAULT;
                    }
                    ttsExtraMap.put("is_instant_clone", str5);
                    Map<String, String> ttsExtraMap2 = textStickerDataLIZIZ.getTtsExtraMap();
                    if (!C1664460tPo.LJ(readTextEffectBean2.effect)) {
                        str7 = CardStruct.IStatusCode.DEFAULT;
                    }
                    ttsExtraMap2.put("is_voice_clone", str7);
                    textStickerDataLIZIZ.getTtsExtraMap().put("stream_speaker_id", readTextEffectBean2.mSpeaker.streamTTSSpkID);
                    Map<String, String> ttsExtraMap3 = textStickerDataLIZIZ.getTtsExtraMap();
                    Effect effect2 = readTextEffectBean2.effect;
                    c1446130njf.getClass();
                    String strLJFF = C1446130njf.LJFF(effect2, "from_tag");
                    if (strLJFF == null) {
                        strLJFF = "";
                    }
                    ttsExtraMap3.put("from_tag", strLJFF);
                    Effect effect3 = readTextEffectBean2.effect;
                    if (effect3 != null) {
                        effect_id = effect3.getEffect_id();
                    }
                    nLETrackSlot.setExtra("tts_effect_id", effect_id);
                    String extra = readTextEffectBean2.effect.getExtra();
                    if (extra == null) {
                        extra = "";
                    }
                    nLETrackSlot.setExtra("tts_effect_extra", extra);
                }
                nLETrackSlot.setExtra("text_sticker_data", C363430EMr.LIZLLL(textStickerDataLIZIZ));
                c0e48.getPlayer().LIZIZ(c0e48.getPlayer().Jh());
                return nLETrackSlotLLILLIZIL;
            }
        }
        return null;
    }
}
