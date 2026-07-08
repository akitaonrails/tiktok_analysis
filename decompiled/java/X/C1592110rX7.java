package X;

import com.bytedance.tiktok.homepage.services.MainFragmentCacheExpServiceImpl;
import com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService;

/* JADX INFO: renamed from: X.0rX7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592110rX7 implements IMainFragmentCacheExpService {
    public static final C1592110rX7 LIZIZ = new C1592110rX7();
    public final /* synthetic */ IMainFragmentCacheExpService LIZ;

    @Override // com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    public final InterfaceC799850VZf LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService
    public final InterfaceC799850VZf LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public C1592110rX7() {
        Object objLIZ = C04TD.LIZ(IMainFragmentCacheExpService.class, false);
        this.LIZ = objLIZ != null ? (IMainFragmentCacheExpService) objLIZ : new MainFragmentCacheExpServiceImpl();
    }
}
