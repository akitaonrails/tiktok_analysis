package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.experiment.TopTabItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.spi.IActivityTabService;

/* JADX INFO: renamed from: X.0rNL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586050rNL implements IActivityTabService {
    public static final C1586050rNL LIZIZ = new C1586050rNL();
    public final /* synthetic */ IActivityTabService LIZ = (IActivityTabService) ServiceManager.get().getService(IActivityTabService.class);

    @Override // com.ss.android.ugc.aweme.spi.IActivityTabService
    public final String LIZ(String str) {
        return this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.spi.IActivityTabService
    public final boolean LIZIZ(Fragment fragment) {
        return this.LIZ.LIZIZ(fragment);
    }

    @Override // com.ss.android.ugc.aweme.spi.IActivityTabService
    public final boolean LIZJ(TopTabItem topTabItem) {
        return this.LIZ.LIZJ(topTabItem);
    }

    @Override // com.ss.android.ugc.aweme.spi.IActivityTabService
    public final boolean LIZLLL(String str) {
        return this.LIZ.LIZLLL(str);
    }

    @Override // com.ss.android.ugc.aweme.spi.IActivityTabService
    public final boolean LJ(TopTabItem topTabItem) {
        return this.LIZ.LJ(topTabItem);
    }

    @Override // com.ss.android.ugc.aweme.spi.IActivityTabService
    public final String LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.spi.IActivityTabService
    public final boolean LJI(EnumC1584360rKc enumC1584360rKc) {
        return this.LIZ.LJI(enumC1584360rKc);
    }

    @Override // com.ss.android.ugc.aweme.spi.IActivityTabService
    public final boolean LJII(TopTabItem topTabItem) {
        return this.LIZ.LJII(topTabItem);
    }
}
