package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.ss.android.ugc.aweme.services.IExternalService;

/* JADX INFO: renamed from: X.0mZl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1401550mZl {
    public static final C1401550mZl LIZ = new C1401550mZl();

    public static void LIZ(String str, long j, int i, InterfaceC635960Ox0 interfaceC635960Ox0) {
        String strTrim = str;
        C638980P4m c638980P4m = new C638980P4m(interfaceC635960Ox0, 1);
        MusicAwemeApi.MusicService musicService = MusicAwemeApi.LIZ;
        String effectSdkVersion = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getEffectSDKGeneralParamService().getEffectSdkVersion();
        String strLIZIZ = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).mvTemplateService().LIZIZ();
        C1493620oyG c1493620oyG = new C1493620oyG();
        c1493620oyG.LJIIIZ = true;
        MusicAwemeApi.MusicService musicService2 = MusicAwemeApi.LIZ;
        String str2 = MusicAwemeApi.LJ;
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        musicService2.queryMusicSquareListItems(str2, strTrim, j, i, effectSdkVersion, strLIZIZ, c1493620oyG).enqueue(c638980P4m);
    }
}
