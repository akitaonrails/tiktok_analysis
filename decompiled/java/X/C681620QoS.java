package X;

import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.settings.MusicSearchGeneralConfig;

/* JADX INFO: renamed from: X.0QoS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681620QoS {
    public static final C681620QoS LIZ = new C681620QoS();

    public static final boolean LIZ() {
        MusicSearchGeneralConfig musicSearchGeneralConfigLIZIZ = LIZIZ();
        return (musicSearchGeneralConfigLIZIZ == null || !musicSearchGeneralConfigLIZIZ.musicSearchGeneralAlgoEnabled || C0XQ7.LJFF().LIZ() || C0XQ7.LJFF().getCurUser().getAccountType() == 3 || ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ()) ? false : true;
    }

    public static final MusicSearchGeneralConfig LIZIZ() {
        MusicSearchGeneralConfig musicSearchGeneralConfig = (MusicSearchGeneralConfig) C0C64.LJIILLIIL().LJJII(MusicSearchGeneralConfig.class, null, "music_search_general", true);
        if (musicSearchGeneralConfig != null) {
            return musicSearchGeneralConfig;
        }
        return null;
    }

    public static final boolean LIZJ() {
        MusicSearchGeneralConfig musicSearchGeneralConfigLIZIZ;
        return LIZ() && LJFF() && (musicSearchGeneralConfigLIZIZ = LIZIZ()) != null && musicSearchGeneralConfigLIZIZ.musicSearchSuggestedQueriesDesign == 1;
    }

    public static final boolean LIZLLL() {
        MusicSearchGeneralConfig musicSearchGeneralConfigLIZIZ;
        return LIZ() && LJFF() && (musicSearchGeneralConfigLIZIZ = LIZIZ()) != null && musicSearchGeneralConfigLIZIZ.musicSearchSuggestedQueriesDesign == 2;
    }

    public static final boolean LJ() {
        MusicSearchGeneralConfig musicSearchGeneralConfigLIZIZ;
        return LIZ() && LJFF() && (musicSearchGeneralConfigLIZIZ = LIZIZ()) != null && musicSearchGeneralConfigLIZIZ.musicSearchSuggestedQueriesDesign == 3;
    }

    public static final boolean LJFF() {
        MusicSearchGeneralConfig musicSearchGeneralConfigLIZIZ = LIZIZ();
        if (musicSearchGeneralConfigLIZIZ != null) {
            return musicSearchGeneralConfigLIZIZ.musicSearchSuggestedQueriesAlgoEnabled;
        }
        return false;
    }

    public static final boolean LJI() {
        MusicSearchGeneralConfig musicSearchGeneralConfigLIZIZ;
        return LIZ() && (musicSearchGeneralConfigLIZIZ = LIZIZ()) != null && musicSearchGeneralConfigLIZIZ.musicSearchSuggestedQueriesEnabled;
    }
}
