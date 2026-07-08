package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.main.spi.HomePageTabCompatServiceImpl;
import com.ss.android.ugc.aweme.spi.HomePageTabCompatService;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0Ddi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343720Ddi implements HomePageTabCompatService {
    public static final C343720Ddi LIZIZ = new C343720Ddi();
    public final /* synthetic */ HomePageTabCompatService LIZ = HomePageTabCompatServiceImpl.LJI();

    @Override // com.ss.android.ugc.aweme.spi.HomePageTabCompatService
    public final ExecutorService LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageTabCompatService
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageTabCompatService
    public final ITabStrip LIZJ(Fragment fragment) {
        return this.LIZ.LIZJ(fragment);
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageTabCompatService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageTabCompatService
    public final String LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageTabCompatService
    public final Map<String, Map<String, Boolean>> LJFF() {
        return this.LIZ.LJFF();
    }
}
