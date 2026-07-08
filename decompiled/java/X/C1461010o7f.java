package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.AudioRatioInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0o7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461010o7f extends AbstractC1458830o49 {
    public final NLEModel LIZJ;
    public final VideoPublishEditModel LIZLLL;
    public final long LJ;

    @Override // X.AbstractC1458830o49
    public final String LIZ() {
        return C1428470nHB.LJIILIIL(this.LIZLLL);
    }

    @Override // X.AbstractC1458830o49
    public final String LIZIZ() {
        return C1428470nHB.LJIILL(this.LIZLLL);
    }

    @Override // X.AbstractC1458830o49
    public final int LIZJ() {
        CreativeModel creativeModel;
        CommonMobParamModel commonMobParamModel;
        VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (commonMobParamModel = creativeModel.commonMobModel) == null) {
            return 0;
        }
        return commonMobParamModel.originPhotoCount;
    }

    @Override // X.AbstractC1458830o49
    public final String LIZLLL() {
        String str = this.LIZLLL.mShootWay;
        return str == null ? "" : str;
    }

    @Override // X.AbstractC1458830o49
    public final int LJ() {
        CreativeModel creativeModel;
        CommonMobParamModel commonMobParamModel;
        VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
        if (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (commonMobParamModel = creativeModel.commonMobModel) == null) {
            return 0;
        }
        return commonMobParamModel.originVideoCount;
    }

    @Override // X.AbstractC1458830o49
    public final int LJFF() {
        return u4.LJLL(this.LIZLLL) ? 1 : 0;
    }

    @Override // X.AbstractC1458830o49
    public final String LJII() {
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        AVMusic aVMusicExtractAVMusic;
        String musicId;
        VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
        return (videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (musicBuzModel = creativeModel.musicBuzModel) == null || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel)) == null || (musicId = aVMusicExtractAVMusic.getMusicId()) == null) ? "" : musicId;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig
    public final AudioRatioInfo getVoiceDetectCacheResult() {
        if (((Boolean) C283120B7u.LIZ.getValue()).booleanValue()) {
            NLEModel nLEModelLJ = C348970DmB.LJ(this.LIZJ, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aed_music_detect_");
            sbLIZ.append(C348980DmC.LIZ(nLEModelLJ));
            AudioRatioInfo audioRatioInfo = (AudioRatioInfo) ((LinkedHashMap) C1458860o4C.LIZ).get(C2188811AlT.LIZIZ(sbLIZ));
            if (audioRatioInfo != null) {
                return audioRatioInfo;
            }
        }
        return this.LIZLLL.creativeModel.musicBuzModel.voiceDetectResult;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig
    public final boolean disableVoiceDetect() {
        if ((C0ARB.LIZ() == 1 || C0ARB.LIZ() == 3) && C1428470nHB.LJJLIIJ(this.LIZLLL)) {
            return true;
        }
        return (C0ARB.LIZ() == 2 || C0ARB.LIZ() == 3) && C1416310mxZ.LJJJLZIJ(this.LIZLLL, ((Number) C262530AQp.LIZ.getValue()).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x033c  */
    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getVoiceDetectPath(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.services.audio.DetectionPathResult> r48) {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1461010o7f.getVoiceDetectPath(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig
    public final void setVoiceDetectCacheResult(AudioRatioInfo audioRatioInfo) {
        if (((Boolean) C283120B7u.LIZ.getValue()).booleanValue()) {
            NLEModel nLEModelLJ = C348970DmB.LJ(this.LIZJ, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aed_music_detect_");
            sbLIZ.append(C348980DmC.LIZ(nLEModelLJ));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (audioRatioInfo != null) {
                C1458860o4C.LIZ.put(strLIZIZ, audioRatioInfo);
            }
        }
        this.LIZLLL.creativeModel.musicBuzModel.voiceDetectResult = audioRatioInfo;
    }

    public C1461010o7f(long j, NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel) {
        this.LIZJ = nLEModel;
        this.LIZLLL = videoPublishEditModel;
        this.LJ = j;
    }
}
