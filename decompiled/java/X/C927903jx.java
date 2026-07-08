package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.appsetting.AppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03jx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C927903jx extends C09AY implements Function0<String> {
    public C927903jx() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        AnonymousClass0317 anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin;
        String lowerCase;
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = AppSettingDependencyService.createIAppSettingDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, IAppSettingDependencyService.class.getName(), anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAppSettingDependencyService.class);
            }
            lowerCase = ((IAppSettingDependencyService) anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin).getAppLanguage().toLowerCase(Locale.getDefault());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return lowerCase == null ? "en" : lowerCase;
    }
}
