package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.series.feed.tab.common.ab.SeriesFeedTabConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CLH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CLH extends C09AY implements Function0<Boolean> {
    public C0CLH() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        SeriesFeedTabConfig.LIZ.getClass();
        C01GW c01gw = SeriesFeedTabConfig.LIZJ;
        Boolean tabEnable = ((SeriesFeedTabConfig.ConfigModel) c01gw.getValue()).getTabEnable();
        Boolean bool = Boolean.TRUE;
        boolean z = false;
        if (Intrinsics.LJFF(tabEnable, bool) && (!Intrinsics.LJFF(((SeriesFeedTabConfig.ConfigModel) c01gw.getValue()).getNeedClientVisibleVerify(), bool) || (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin() && !C10EU.LJIILIIL()))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
