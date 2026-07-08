package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.gamora.editor.audio.tts.base.model.TTSAudioParam;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11YM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11YM implements C11FI<TTSAudioParam, TextStickerData> {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(180));
    public final /* synthetic */ TextStickerData LIZIZ;

    @Override // X.C11FI
    public final TTSAudioParam LIZ() {
        TextStickerData textStickerData = this.LIZIZ;
        TTSAudioParam tTSAudioParam = (TTSAudioParam) this.LIZ.getValue();
        tTSAudioParam.startTime = textStickerData.getStartTime();
        tTSAudioParam.endTime = textStickerData.getEndTime();
        tTSAudioParam.audioTrackDuration = textStickerData.getAudioTrackDuration();
        tTSAudioParam.audioTrackIndex = textStickerData.getAudioTrackIndex();
        tTSAudioParam.audioTrackFilePath = textStickerData.getAudioTrackFilePath();
        tTSAudioParam.nleUuid = textStickerData.getNleUuid();
        tTSAudioParam.hasReadTextAudio = textStickerData.getHasReadTextAudio();
        tTSAudioParam.audioPathList = textStickerData.getAudioPathList();
        tTSAudioParam.audioText = textStickerData.getAudioText();
        tTSAudioParam.voiceAnchorName = textStickerData.getVoiceAnchorName();
        tTSAudioParam.voiceEffectId = textStickerData.getVoiceEffectId();
        tTSAudioParam.ttsAnchorReleaseDate = textStickerData.getTtsAnchorReleaseDate();
        tTSAudioParam.speakerID = textStickerData.getSpeakerID();
        tTSAudioParam.ttsHashTagIds = textStickerData.getTtsHashTagIds();
        return tTSAudioParam;
    }

    @Override // X.C11FI
    public final /* bridge */ /* synthetic */ TextStickerData W() {
        return this.LIZIZ;
    }

    public C11YM(TextStickerData textStickerData) {
        this.LIZIZ = textStickerData;
    }

    @Override // X.C11FI
    public final void LIZIZ(TTSAudioParam tTSAudioParam) {
        String str;
        TextStickerData textStickerData = this.LIZIZ;
        textStickerData.setStartTime(tTSAudioParam.startTime);
        textStickerData.setEndTime(tTSAudioParam.endTime);
        textStickerData.setAudioTrackDuration(tTSAudioParam.audioTrackDuration);
        textStickerData.setAudioTrackIndex(tTSAudioParam.audioTrackIndex);
        textStickerData.setAudioTrackFilePath(tTSAudioParam.audioTrackFilePath);
        textStickerData.setNleUuid(tTSAudioParam.nleUuid);
        textStickerData.setHasReadTextAudio(tTSAudioParam.hasReadTextAudio);
        textStickerData.setAudioPathList(tTSAudioParam.audioPathList);
        textStickerData.setAudioText(tTSAudioParam.audioText);
        textStickerData.setVoiceAnchorName(tTSAudioParam.voiceAnchorName);
        textStickerData.setVoiceEffectId(tTSAudioParam.voiceEffectId);
        textStickerData.setTtsAnchorReleaseDate(tTSAudioParam.ttsAnchorReleaseDate);
        textStickerData.setSpeakerID(tTSAudioParam.speakerID);
        textStickerData.setTtsHashTagIds(tTSAudioParam.ttsHashTagIds);
        String str2 = tTSAudioParam.audioTrackFilePath;
        if (str2 != null && C703302op.LIZ(str2) && (str = tTSAudioParam.speakerID) != null && C703302op.LIZ(str)) {
            textStickerData.setHasReadTextAudio(true);
        }
    }
}
