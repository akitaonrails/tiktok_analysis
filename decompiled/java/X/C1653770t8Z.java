package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;

/* JADX INFO: renamed from: X.0t8Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653770t8Z implements InterfaceC1654780tAC {
    public C1653780t8a LIZ;

    @Override // X.InterfaceC1654780tAC
    public final long LIZ(CameraComponentModel cameraComponentModel) {
        long jMin;
        MusicBuzModel musicBuzModelLIZIZ;
        long j;
        if (cameraComponentModel.mCurrentDurationMode) {
            jMin = C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration();
        } else {
            jMin = 15000;
        }
        C1653780t8a c1653780t8a = this.LIZ;
        if (c1653780t8a != null) {
            musicBuzModelLIZIZ = c1653780t8a.LIZIZ();
        } else {
            musicBuzModelLIZIZ = null;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModelLIZIZ);
        String str = cameraComponentModel.mMusicPath;
        if (aVMusicExtractAVMusic != null && str != null && str.length() != 0) {
            jMin = Math.min(jMin, C579120MnW.LIZ(aVMusicExtractAVMusic, str));
            j = cameraComponentModel.mTotalRecordingTime;
        } else {
            j = cameraComponentModel.mTotalRecordingTime;
        }
        return jMin - j;
    }
}
