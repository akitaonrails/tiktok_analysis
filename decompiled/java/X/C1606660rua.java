package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.INearbyFeedService;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0rua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606660rua implements INearbyFeedService {
    public static final C1606660rua LIZIZ = new C1606660rua();
    public final /* synthetic */ INearbyFeedService LIZ = (INearbyFeedService) ServiceManager.get().getService(INearbyFeedService.class);

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    @InterfaceC1294060jmO
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LIZIZ(Fragment fragment) {
        return this.LIZ.LIZIZ(fragment);
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final void LIZJ(String str, HashMap<String, String> map, Aweme aweme, boolean z) {
        this.LIZ.LIZJ(str, map, aweme, z);
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final Long LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final Map<String, String> LJFF(String str) {
        return this.LIZ.LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final C13IQ<? extends AbstractC738140SxQ> LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final C13IQ<? extends AbstractC738140SxQ> LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final int LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.nearby.api.INearbyMobService
    public final void LJIIJ(String str, Map<String, String> map) {
        this.LIZ.LJIIJ(str, map);
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final IInterceptor LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final C13IQ<? extends UIContentAssem> LJIILIIL() {
        return this.LIZ.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final C0CCZ LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    @InterfaceC1294060jmO
    public final void LJIILL() {
        this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final AbstractC1585770rMt LJIILLIIL() {
        return this.LIZ.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.INearbyFeedService
    public final boolean LJIIZILJ() {
        return this.LIZ.LJIIZILJ();
    }
}
