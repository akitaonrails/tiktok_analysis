package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.main.assems.ui.HomepageViewPagerAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570840qyo extends C09AY implements Function0<InterfaceC1577800rA2> {
    public final /* synthetic */ HomepageViewPagerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570840qyo(HomepageViewPagerAssem homepageViewPagerAssem) {
        super(0);
        this.LL = homepageViewPagerAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1577800rA2 invoke() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ != null) {
            return ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).LJIJJ(c19egLIZ);
        }
        "activity is null".toString();
        throw new IllegalArgumentException("activity is null");
    }
}
