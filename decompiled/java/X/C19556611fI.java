package X;

import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.11fI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19556611fI {
    public static AVMusic LIZ(SoundEffect soundEffect) {
        boolean z;
        AVMusic aVMusic = new AVMusic();
        aVMusic.id = soundEffect.id;
        aVMusic.musicName = soundEffect.musicName;
        aVMusic.playUrl = soundEffect.playUrl;
        if (soundEffect.collectStatus == 1) {
            z = true;
        } else {
            z = false;
        }
        aVMusic.setCollected(z);
        aVMusic.setCommerceMusic(soundEffect.isCommerceMusic);
        aVMusic.setDuration(soundEffect.duration * LSPassThroughRecordSizeConfig.DEFAULT);
        aVMusic.setShootDuration(soundEffect.shootDuration * LSPassThroughRecordSizeConfig.DEFAULT);
        aVMusic.setAuditionDuration(soundEffect.auditionDuration * LSPassThroughRecordSizeConfig.DEFAULT);
        aVMusic.setNeedSetCookie(soundEffect.needSetCookie);
        aVMusic.musicType = 1;
        aVMusic.musicStatus = 1;
        return aVMusic;
    }
}
