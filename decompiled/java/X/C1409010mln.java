package X;

import com.ss.android.ugc.aweme.creative.model.AudioAlgorithmModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409010mln {
    public static final C1409010mln LIZ = new C1409010mln();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        boolean z;
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        int i4;
        int i5;
        int i6;
        String mMusicPath;
        int i7 = 1;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "audio_data_track_on", true, false)) {
            boolean zRealHasOriginalSound = videoPublishEditModel.realHasOriginalSound();
            if (videoPublishEditModel.isMusic() == 1 && (mMusicPath = videoPublishEditModel.getMMusicPath()) != null && C123100dR.LIZ(mMusicPath)) {
                z = true;
            } else {
                z = false;
            }
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", videoPublishEditModel.getCreativeInfo().getCreationId());
            c0lab.LIZIZ(System.currentTimeMillis(), "calling_event_ts");
            c0lab.LJ("audio_shootway", C1403540mcy.LJI(videoPublishEditModel, "audio_shootway_default"));
            AudioAlgorithmModel audioAlgorithmModel = videoPublishEditModel.creativeModel.audioAlgorithmModel;
            if (audioAlgorithmModel.isMicOn && audioAlgorithmModel.isMicEnabled) {
                i = 1;
            } else {
                i = 0;
            }
            c0lab.LIZ(i, "microphone_status");
            int i8 = 3;
            if (zRealHasOriginalSound) {
                if (z) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
            } else if (z) {
                i2 = 1;
            } else {
                i2 = 3;
            }
            c0lab.LIZ(i2, "audio_source");
            c0lab.LIZ(videoPublishEditModel.isFastImport() ? 1 : 0, "is_fast_import");
            int iLIZ = C2179771ASp.LIZ();
            if (iLIZ != 0) {
                if (iLIZ != 1 && iLIZ != 2) {
                    if (iLIZ != 3) {
                        i3 = 3;
                    } else {
                        i3 = 2;
                    }
                } else {
                    i3 = 1;
                }
            } else {
                i3 = 0;
            }
            c0lab.LIZ(i3, "audio_source_device_input");
            int iLIZLLL = C2179771ASp.LIZLLL();
            if (iLIZLLL != 0) {
                if (iLIZLLL != 2) {
                    if (iLIZLLL == 4 || iLIZLLL == 5) {
                        i8 = 1;
                    }
                } else {
                    i8 = 2;
                }
            } else {
                i8 = 0;
            }
            c0lab.LIZ(i8, "audio_source_device_output");
            if (Intrinsics.LJFF(str, "audio_data_record")) {
                f = videoPublishEditModel.creativeModel.audioAlgorithmModel.shootVolumeStart;
            } else {
                f = videoPublishEditModel.creativeModel.audioAlgorithmModel.editVolumeStart;
            }
            c0lab.LIZJ(Float.valueOf(f), "volume_level_start");
            if (Intrinsics.LJFF(str, "audio_data_record")) {
                f2 = videoPublishEditModel.creativeModel.audioAlgorithmModel.shootVolumeEnd;
            } else {
                f2 = videoPublishEditModel.creativeModel.audioAlgorithmModel.editVolumeEnd;
            }
            c0lab.LIZJ(Float.valueOf(f2), "volume_level_end");
            if (videoPublishEditModel.creativeModel.audioAlgorithmModel.isAECOn) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            c0lab.LIZ(i4, "algorithm_aec");
            if (videoPublishEditModel.creativeModel.audioAlgorithmModel.isTAOn) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            c0lab.LIZ(i5, "algorithm_delay");
            if (videoPublishEditModel.creativeModel.audioAlgorithmModel.isLoudnessOn) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            c0lab.LIZ(i6, "algorithm_loudness");
            if (!videoPublishEditModel.creativeModel.audioAlgorithmModel.isDenoiseOn) {
                i7 = 0;
            }
            c0lab.LIZ(i7, "algorithm_denoise");
            c0lab.LIZ(videoPublishEditModel.getRecordBgmDelay(), "algorithm_delay_value");
            float f3 = 100;
            c0lab.LIZ((int) (videoPublishEditModel.getVoiceVolume() * f3), "original_sound_volume");
            if (z) {
                c0lab.LIZ((int) (videoPublishEditModel.getMusicVolume() * f3), "bgm_sound_volume");
            }
            C20684815ws.LJIILLIIL(str, c0lab.LIZ);
        }
    }
}
