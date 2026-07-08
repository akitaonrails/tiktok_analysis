package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.dsp.service.IMusicDspService;
import com.ss.android.ugc.aweme.dsp.service.MusicDspServiceEmptyImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;

/* JADX INFO: renamed from: X.0zHF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1889790zHF {
    public static final C1889790zHF LIZ = new C1889790zHF();
    public static boolean LIZIZ;

    public final IMusicDspService LIZ() {
        Object c098200Yq;
        try {
            IMusicDspService iMusicDspService = (IMusicDspService) ServiceManager.get().getService(C1250660ieO.LIZ);
            if (!(iMusicDspService instanceof MusicDspServiceEmptyImpl)) {
                return iMusicDspService;
            }
            synchronized (this) {
                try {
                    if (!LIZIZ) {
                        LIZ.getClass();
                        C13UT.LIZ.getClass();
                        C13UT.LIZLLL.LIZ(2);
                        if (((IPluginService) ServiceManager.get().getService(IPluginService.class)).checkPluginInstalled("com.ss.android.ugc.df.dsp")) {
                            try {
                                c098200Yq = Class.forName("com.ss.android.ugc.aweme.dsp.service.MusicDspServiceImpl");
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
                                ServiceManager.get().bind(C1250660ieO.LIZ, new ServiceProvider() { // from class: X.0zHE
                                    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                                    public final Object get() {
                                        return cls.newInstance();
                                    }
                                }).asSingleton();
                                LIZIZ = true;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
            IMusicDspService iMusicDspService2 = (IMusicDspService) ServiceManager.get().getService(C1250660ieO.LIZ);
            return iMusicDspService2 == null ? new MusicDspServiceEmptyImpl() : iMusicDspService2;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            return new MusicDspServiceEmptyImpl();
        }
    }
}
