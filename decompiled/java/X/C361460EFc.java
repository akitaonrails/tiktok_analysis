package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0EFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361460EFc {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        MusicBuzModel musicBuzModel;
        CreativeModel creativeModel;
        if (!C1458070o2v.LJFF()) {
            return true;
        }
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null) {
            musicBuzModel = creativeModel.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if (aVMusicExtractAVMusic == null || aVMusicExtractAVMusic.isUnlimitedMusic() || !aVMusicExtractAVMusic.isLoopMusic()) {
            return true;
        }
        return false;
    }

    public static C0EGY LIZIZ(C1DRG c1drg) {
        boolean z;
        LiveData<Unit> liveDataZb0;
        C0EGY c0egy = (C0EGY) c1drg.LJIIL(null, C0EGY.class);
        if (c0egy != null && (liveDataZb0 = c0egy.zb0()) != null && liveDataZb0.getValue() != null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getManagerPair-->btmBarApiComponent::");
        sbLIZ.append(c0egy);
        sbLIZ.append(", hasInit=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z) {
            return null;
        }
        return c0egy;
    }
}
