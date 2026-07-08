package X;

import com.ss.android.ugc.aweme.creative.model.music.AudioRatioInfo;
import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionResultForServer;
import java.util.Map;

/* JADX INFO: renamed from: X.0o49, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1458830o49 implements IVoiceDetectorConfig {
    public int LIZ = 1;
    public double LIZIZ;

    public String LIZ() {
        return "";
    }

    public String LIZIZ() {
        return "";
    }

    public int LIZJ() {
        return 0;
    }

    public String LIZLLL() {
        return "";
    }

    public int LJ() {
        return 0;
    }

    public int LJFF() {
        return 0;
    }

    public String LJII() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig
    public final void setVoiceDetectionParam(VoiceDetectionParam voiceDetectionParam) {
        this.LIZIZ = voiceDetectionParam.targetThresholds;
        this.LIZ = voiceDetectionParam.sourceType;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig
    public final void mobDetectEvent(VoiceDetectionParam voiceDetectionParam, VoiceDetectionResult voiceDetectionResult) {
        if (!C299120Bny.LIZ() && !C2262681DhK.LIZ()) {
            LJI(voiceDetectionParam, voiceDetectionResult, null);
            return;
        }
        C1458840o4A.LIZ.getClass();
        C1458840o4A.LJ = this;
        C1458840o4A.LIZLLL = true;
        C1458840o4A.LIZIZ = voiceDetectionParam;
        C1458840o4A.LIZJ = voiceDetectionResult;
    }

    public final void LJI(VoiceDetectionParam voiceDetectionParam, VoiceDetectionResult voiceDetectionResult, VoiceDetectionResultForServer voiceDetectionResultForServer) {
        float f;
        float f2;
        int i;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = voiceDetectionParam.sourceType;
        double d = voiceDetectionParam.targetThresholds;
        long j = voiceDetectionParam.videoDuration;
        int i3 = voiceDetectionParam.detectTime;
        AudioRatioInfo audioRatioInfo = voiceDetectionResult.audioRatioInfo;
        float f3 = 0.0f;
        if (audioRatioInfo != null) {
            f = audioRatioInfo.singRatio;
            f2 = audioRatioInfo.speechRatio;
            f3 = audioRatioInfo.musicRatio;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        if (d > f && d > f2 && d > f3) {
            i = 1;
        } else {
            i = 0;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("algo_name", "AED");
        c0lab.LIZIZ(voiceDetectionResult.extractDuration, "export_duration");
        c0lab.LIZIZ(voiceDetectionResult.downloadModeDuration, "download_duration");
        c0lab.LIZIZ(voiceDetectionResult.algoDuration, "algo_duration");
        c0lab.LIZIZ(voiceDetectionResult.totalDuration, "total_duration");
        c0lab.LIZLLL(Double.valueOf(d), "threshold");
        c0lab.LIZ(voiceDetectionResult.errorCode, "error_code");
        c0lab.LJ("error_msg", voiceDetectionResult.errorMsg);
        c0lab.LIZJ(Float.valueOf(f), "sing_ratio");
        c0lab.LIZJ(Float.valueOf(f2), "speech_ratio");
        c0lab.LIZJ(Float.valueOf(f3), "music_ratio");
        c0lab.LIZ(i, "less_than_threshold");
        if (i2 == 1) {
            str = "AutoMusicRecommendForVideo";
        } else {
            str = "unknown";
        }
        c0lab.LJ("bizType", str);
        c0lab.LJ("content_source", LIZ());
        c0lab.LJ("shoot_way", LIZLLL());
        c0lab.LIZ(LJFF(), "is_story");
        c0lab.LIZIZ(j, "video_duration");
        c0lab.LIZIZ(System.currentTimeMillis() - voiceDetectionResult.lastDetectTime, "detect_interval");
        c0lab.LIZ(i3, "detect_time");
        c0lab.LIZIZ(voiceDetectionResult.mixTrackDuration, "mix_track_duration");
        c0lab.LIZIZ(voiceDetectionResult.compileAudioDuration, "compile_audio_duration");
        c0lab.LJ("content_type", LIZIZ());
        c0lab.LIZ(LJ(), "video_count");
        c0lab.LIZ(LIZJ(), "pic_count");
        c0lab.LIZIZ(voiceDetectionResult.waitThreadDuration, "wait_thread_duration");
        c0lab.LIZ(voiceDetectionResult.isCache(), "is_cache");
        c0lab.LIZIZ(voiceDetectionResult.checkMuteDuration, "check_mute_duration");
        c0lab.LIZIZ(voiceDetectionResult.fileSize, "extract_file_length");
        c0lab.LJ("music_id", LJII());
        if (C301640Bs2.LIZ()) {
            String str2 = voiceDetectionParam.creationId;
            if (str2 != null && str2.length() > 0) {
                c0lab.LJ("creation_id", str2);
            }
            String str3 = voiceDetectionParam.musicId;
            if (str3 != null && str3.length() > 0) {
                c0lab.LJ("music_id", str3);
            }
        }
        C1458390o3R c1458390o3R = C1458390o3R.LIZ;
        if (voiceDetectionResult.errorCode == 0 && i != 0) {
            z = false;
        } else {
            z = true;
        }
        long j2 = voiceDetectionResult.totalDuration;
        c1458390o3R.getClass();
        C1458770o43 c1458770o43 = C1458390o3R.LJII;
        if (c1458770o43 == null) {
            c1458770o43 = new C1458770o43();
        }
        c1458770o43.LIZIZ = j2;
        if (z) {
            String value = EnumC1458610o3n.SPEECH_DETECTION.getValue();
            value.toString();
            c1458770o43.LIZ = value;
        }
        C1458390o3R.LJII = c1458770o43;
        if (C299120Bny.LIZ() || C2262681DhK.LIZ()) {
            for (Map.Entry<String, Long> entry : voiceDetectionResult.waitHandlerDuration.entrySet()) {
                c0lab.LIZIZ(entry.getValue().longValue(), entry.getKey());
            }
        }
        if (voiceDetectionResultForServer != null) {
            if (voiceDetectionResultForServer.isVoiceServerJudgeTimeout() == 1) {
                c0lab.LIZ(1, "is_voice_server_judge_timeout");
            } else {
                c0lab.LIZ(0, "is_voice_server_judge_timeout");
                c0lab.LIZ(voiceDetectionResultForServer.recReturnResult, "rec_return_result");
                c0lab.LIZ(voiceDetectionResultForServer.recError, "rec_error");
                c0lab.LIZIZ(voiceDetectionResultForServer.voiceServerJudgeDuration, "voice_server_judge_duration");
                Long l = voiceDetectionResultForServer.musicServerCost;
                if (l != null) {
                    c0lab.LIZIZ(l.longValue(), "music_server_judge_duration");
                }
                Long l2 = voiceDetectionResultForServer.recServerJudgeDuration;
                if (l2 != null) {
                    c0lab.LIZIZ(l2.longValue(), "rec_server_judge_duration");
                }
                Double d2 = voiceDetectionResultForServer.peakLoudnessValue;
                if (d2 != null) {
                    c0lab.LIZLLL(Double.valueOf(d2.doubleValue()), "peak_loudness_value");
                }
                Double d3 = voiceDetectionResultForServer.avgLoudnessValue;
                if (d3 != null) {
                    c0lab.LIZLLL(Double.valueOf(d3.doubleValue()), "loudness_value");
                }
                c0lab.LIZIZ(voiceDetectionResult.totalDuration + voiceDetectionResultForServer.voiceServerJudgeDuration, "total_duration");
            }
            C1458390o3R c1458390o3R2 = C1458390o3R.LIZ;
            if (voiceDetectionResultForServer.isVoiceServerJudgeTimeout() != 1 && voiceDetectionResultForServer.recReturnResult == 0 && voiceDetectionResultForServer.recError == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            long j3 = voiceDetectionResult.totalDuration;
            long j4 = voiceDetectionResultForServer.voiceServerJudgeDuration;
            if (voiceDetectionResultForServer.isVoiceServerJudgeTimeout() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            c1458390o3R2.getClass();
            C1458770o43 c1458770o432 = C1458390o3R.LJII;
            if (c1458770o432 == null) {
                c1458770o432 = new C1458770o43();
            }
            c1458770o432.LIZIZ = j3;
            if (z2) {
                String value2 = EnumC1458610o3n.SPEECH_DETECTION.getValue();
                value2.toString();
                c1458770o432.LIZ = value2;
            }
            c1458770o432.LIZJ = Long.valueOf(j4);
            c1458770o432.LIZLLL = Boolean.valueOf(z3);
            C1458390o3R.LJII = c1458770o432;
        }
        C20684815ws.LJIILLIIL("creation_speech_detection", c0lab.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig
    public final void mobEvent(int i, long j, long j2, long j3, long j4, double d, VoiceDetectionResult voiceDetectionResult, long j5) {
        Float fValueOf;
        Float fValueOf2;
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("algo_name", "AED");
        c0lab.LIZIZ(j, "export_duration");
        c0lab.LIZIZ(j2, "download_duration");
        c0lab.LIZIZ(j3, "algo_duration");
        c0lab.LIZIZ(j4, "total_duration");
        c0lab.LIZLLL(Double.valueOf(d), "threshold");
        c0lab.LIZ(voiceDetectionResult.errorCode, "error_code");
        c0lab.LJ("error_msg", voiceDetectionResult.errorMsg);
        AudioRatioInfo audioRatioInfo = voiceDetectionResult.audioRatioInfo;
        Float fValueOf3 = null;
        if (audioRatioInfo != null) {
            fValueOf = Float.valueOf(audioRatioInfo.singRatio);
        } else {
            fValueOf = null;
        }
        c0lab.LIZJ(fValueOf, "sing_ratio");
        AudioRatioInfo audioRatioInfo2 = voiceDetectionResult.audioRatioInfo;
        if (audioRatioInfo2 != null) {
            fValueOf2 = Float.valueOf(audioRatioInfo2.speechRatio);
        } else {
            fValueOf2 = null;
        }
        c0lab.LIZJ(fValueOf2, "speech_ratio");
        AudioRatioInfo audioRatioInfo3 = voiceDetectionResult.audioRatioInfo;
        if (audioRatioInfo3 != null) {
            fValueOf3 = Float.valueOf(audioRatioInfo3.musicRatio);
        }
        c0lab.LIZJ(fValueOf3, "music_ratio");
        if (i == 1) {
            str = "AutoMusicRecommendForVideo";
        } else {
            str = "unknown";
        }
        c0lab.LJ("bizType", str);
        c0lab.LJ("content_source", LIZ());
        c0lab.LIZIZ(j5, "extract_file_length");
        C20684815ws.LJIILLIIL("speech_detection", c0lab.LIZ);
    }
}
