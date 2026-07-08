package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.music.fanspotlight.service.IMusicFanSpotlightService;
import com.ss.android.ugc.aweme.music.fanspotlight.service.MusicFanSpotlightEmptyImpl;

/* JADX INFO: renamed from: X.0OtN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C633710OtN {
    public static final C633710OtN LIZ = new C633710OtN();
    public static final IPluginService LIZIZ;
    public static final IMusicFanSpotlightService LIZJ;

    static {
        IMusicFanSpotlightService musicFanSpotlightEmptyImpl;
        Object c098200Yq;
        IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        LIZIZ = iPluginService;
        if (((Number) C076A.LIZ.getValue()).intValue() != 0) {
            musicFanSpotlightEmptyImpl = (IMusicFanSpotlightService) ServiceManager.get().getService(IMusicFanSpotlightService.class);
        } else if (iPluginService == null) {
            musicFanSpotlightEmptyImpl = new MusicFanSpotlightEmptyImpl();
        } else {
            try {
                musicFanSpotlightEmptyImpl = (IMusicFanSpotlightService) ServiceManager.get().getService(IMusicFanSpotlightService.class);
                if (musicFanSpotlightEmptyImpl instanceof MusicFanSpotlightEmptyImpl) {
                    try {
                        c098200Yq = Class.forName("com.ss.android.ugc.aweme.music.fanspotlight.service.MusicFanSpotlightServiceImpl");
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    final Class cls = (Class) c098200Yq;
                    if (cls != null) {
                        ServiceManager.get().bind(IMusicFanSpotlightService.class, new ServiceProvider() { // from class: X.0OtO
                            @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                            public final Object get() throws IllegalAccessException, InstantiationException {
                                Object objNewInstance = cls.newInstance();
                                if (objNewInstance instanceof IMusicFanSpotlightService) {
                                    return objNewInstance;
                                }
                                return null;
                            }
                        }).asSingleton();
                    }
                    musicFanSpotlightEmptyImpl = (IMusicFanSpotlightService) ServiceManager.get().getService(IMusicFanSpotlightService.class);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                musicFanSpotlightEmptyImpl = new MusicFanSpotlightEmptyImpl();
            }
        }
        LIZJ = musicFanSpotlightEmptyImpl;
    }
}
