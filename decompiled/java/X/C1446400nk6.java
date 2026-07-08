package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446400nk6 {
    public static final C1441610ncN LIZ(VideoPublishEditModel videoPublishEditModel) {
        C1446420nk8 c1446420nk8 = new C1446420nk8();
        if (videoPublishEditModel.hasOriginalSound()) {
            c1446420nk8.LIZ(EnumC1446410nk7.RECORD_VIDEO_SOUND);
        }
        if (videoPublishEditModel.hasRecord()) {
            c1446420nk8.LIZ(EnumC1446410nk7.EDIT_RECORD_SOUND);
        }
        String mMusicPath = videoPublishEditModel.getMMusicPath();
        if (mMusicPath != null && mMusicPath.length() != 0) {
            c1446420nk8.LIZ(EnumC1446410nk7.MUSIC);
        }
        if (videoPublishEditModel.getOrigin() == 0) {
            c1446420nk8.LIZ(EnumC1446410nk7.UPLOAD_VIDEO_SOUND);
        }
        if (videoPublishEditModel.getOrigin() == 2) {
            c1446420nk8.LIZ(EnumC1446410nk7.RECORD_UPLOAD_VIDEO_SOUND);
        }
        if (videoPublishEditModel.getVoiceVolume() > 0.0f) {
            c1446420nk8.LIZ(EnumC1446410nk7.VOLUME_NOT_MUTE);
        }
        if (videoPublishEditModel.getVeAudioEffectParam() != null) {
            c1446420nk8.LIZ(EnumC1446410nk7.EDIT_AUDIO_EFFECT);
        }
        return new C1441610ncN(c1446420nk8.LIZ);
    }
}
