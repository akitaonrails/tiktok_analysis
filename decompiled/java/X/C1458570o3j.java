package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;

/* JADX INFO: renamed from: X.0o3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458570o3j {
    public static final boolean LIZ(AVMusic aVMusic) {
        boolean z;
        String strLIZIZ = LIZIZ(aVMusic);
        if (strLIZIZ != null && strLIZIZ.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public static final String LIZIZ(AVMusic aVMusic) {
        IMusicExternalService iMusicExternalService;
        InterfaceC1662290tMJ interfaceC1662290tMJLIZJ;
        String strLJFF;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService == null || !creativeToolsPluginService.LJI(null)) {
            return null;
        }
        String strLIZJ = LIZJ(aVMusic);
        if (!TextUtils.isEmpty(strLIZJ) && C2486109oh.LIZ(strLIZJ) == 0) {
            return strLIZJ;
        }
        if (C298110BmL.LIZ() || ((!C298150BmP.LIZIZ() && !C298220BmW.LIZ()) || (iMusicExternalService = (IMusicExternalService) PluggableExtentionKt.pluggableSpi$default(IMusicExternalService.class, false, false, false, 14, null)) == null || (interfaceC1662290tMJLIZJ = iMusicExternalService.LIZJ()) == null || (strLJFF = interfaceC1662290tMJLIZJ.LJFF(C1419800n3C.LIZ(aVMusic), aVMusic.getMusicId(), null)) == null)) {
            return null;
        }
        return strLJFF;
    }

    public static final String LIZJ(AVMusic aVMusic) {
        if (aVMusic.isLocalMusic()) {
            return aVMusic.path;
        }
        int i = aVMusic.musicType;
        if (i != 1 && i != 2) {
            return null;
        }
        return C1403010mc7.LIZ.getMusicService().LJI(aVMusic);
    }
}
