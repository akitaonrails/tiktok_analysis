package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.casting.api.ICastingPlayerService;
import com.ss.android.ugc.aweme.casting.api.ICastingService;
import com.ss.android.ugc.aweme.casting.api.IPlaybackControlService;
import com.ss.android.ugc.aweme.casting.api.dummyspi.DummyCastingService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import java.util.Objects;

/* JADX INFO: renamed from: X.1D0F, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1D0F implements ICastingService {
    public static final C1D0F LIZ = new C1D0F();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new AnonymousClass0657());
    public static volatile ICastingService LIZJ = (ICastingService) ServiceManager.get().getService(ICastingService.class);

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final String LIZ() {
        return LIZJ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final String LIZIZ() {
        return LIZJ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final String LIZJ() {
        return LIZJ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final boolean LJ() {
        return LIZJ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJFF() {
        LIZJ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJII() {
        LIZJ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final boolean LJIIIIZZ() {
        return LIZJ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final IPlaybackControlService LJIIIZ() {
        return LIZJ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final ICastingPlayerService LJIIJ() {
        return LIZJ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJIIL() {
        LIZJ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJIILJJIL() {
        LIZJ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final boolean isConnected() {
        return LIZJ.isConnected();
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final boolean LJI(Aweme aweme) {
        return LIZJ.LJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final InterfaceC1370310llN LIZLLL(Aweme aweme, String str, String str2) {
        Object c098200Yq;
        if (LIZJ instanceof DummyCastingService) {
            synchronized (this) {
                try {
                    if (LIZJ instanceof DummyCastingService) {
                        try {
                            c098200Yq = Class.forName("com.ss.android.ugc.aweme.casting.CastingServiceImpl");
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
                            ServiceManager.get().bind(ICastingService.class, new ServiceProvider() { // from class: X.0zva
                                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                                public final Object get() {
                                    return cls.newInstance();
                                }
                            }).asSingleton();
                        }
                        LIZJ = (ICastingService) ServiceManager.get().getService(ICastingService.class);
                        Objects.toString(LIZJ);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return LIZJ.LIZLLL(aweme, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJIIJJI(String str, String str2, String str3) {
        LIZJ.LJIIJJI(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingService
    public final void LJIILIIL(String str, String str2, String str3) {
        LIZJ.LJIILIIL(str, str2, str3);
    }
}
