package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.favorites.business.video.invalid.FavoriteInvalidVideosServiceImpl;

/* JADX INFO: renamed from: X.0iu5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260390iu5 {
    public C430420GuG LIZ;
    public final boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public final /* synthetic */ FavoriteInvalidVideosServiceImpl LJFF;

    public C1260390iu5(FavoriteInvalidVideosServiceImpl favoriteInvalidVideosServiceImpl) {
        boolean z;
        this.LJFF = favoriteInvalidVideosServiceImpl;
        int iLIZ = C1260410iu7.LIZ(favoriteInvalidVideosServiceImpl.LJ());
        SettingsManager.LIZLLL().getClass();
        if (iLIZ > SettingsManager.LJ("favorite_clear_invalid_min_count", 5)) {
            z = true;
        } else {
            z = false;
        }
        this.LIZIZ = z;
    }
}
