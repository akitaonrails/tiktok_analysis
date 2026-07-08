package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.VoiceConversionModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1441740nca {
    public final C1441750ncb LIZ;
    public int LIZIZ = -999;
    public int LIZJ = -999;

    public abstract C1462680oAM LIZJ(VideoPublishEditModel videoPublishEditModel);

    public abstract C1462680oAM LIZLLL(VideoPublishEditModel videoPublishEditModel);

    public AbstractC1441740nca(C1441750ncb c1441750ncb) {
        this.LIZ = c1441750ncb;
    }

    public static String LIZ(VideoPublishEditModel videoPublishEditModel) {
        String audioUrl;
        AudioRecorderParam veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam();
        if (veAudioRecorderParam == null || (audioUrl = veAudioRecorderParam.getAudioUrl()) == null) {
            audioUrl = "";
        }
        VoiceConversionModel voiceConversionModel = videoPublishEditModel.creativeModel.voiceConversionModel;
        if (voiceConversionModel.hasDubVoiceConversion && C2286708xd.LIZJ(voiceConversionModel.originalRecordPath)) {
            return videoPublishEditModel.creativeModel.voiceConversionModel.originalRecordPath;
        }
        return audioUrl;
    }

    public void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (this.LIZ.LIZIZ.length() > 0 && !C2286708xd.LIZJ(this.LIZ.LIZIZ)) {
            C2286708xd.LJIIIIZZ(this.LIZ.LIZIZ, false);
        }
        if (this.LIZ.LIZ.length() > 0 && !C2286708xd.LIZJ(this.LIZ.LIZ)) {
            C2286708xd.LJIIIIZZ(this.LIZ.LIZ, false);
        }
    }
}
