package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.music.ab.ArtistMusicOfflineConfig;

/* JADX INFO: renamed from: X.0Otc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633860Otc {
    public static final C633860Otc LIZ = new C633860Otc();
    public static final ArtistMusicOfflineConfig LIZIZ = new ArtistMusicOfflineConfig("", 0);

    public static ArtistMusicOfflineConfig LIZ() {
        ArtistMusicOfflineConfig artistMusicOfflineConfig = (ArtistMusicOfflineConfig) SettingsManager.LIZLLL().LJIIIIZZ("artist_music_offline_notice_config", ArtistMusicOfflineConfig.class, LIZIZ);
        return artistMusicOfflineConfig == null ? new ArtistMusicOfflineConfig("", 0) : artistMusicOfflineConfig;
    }
}
