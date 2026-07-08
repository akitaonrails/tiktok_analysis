package X;

import com.ss.android.ugc.aweme.IAccountLoginExperimentDefaultsService;
import com.ss.android.ugc.aweme.account.login.config.AccountLoginFeatureOriginConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0yk3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869210yk3 {
    public static final C1869210yk3 LIZ = new C1869210yk3();
    public static final C01GW LIZIZ;

    static {
        new AccountLoginFeatureOriginConfig(false, 0, null, null, 14, null);
        LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(486));
    }

    public static AccountLoginFeatureOriginConfig LIZ() {
        Boolean boolDefaultAccountLoginFeatureConfigEnabled;
        IAccountLoginExperimentDefaultsService iAccountLoginExperimentDefaultsService = (IAccountLoginExperimentDefaultsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginExperimentDefaultsService.class, false, false, false, 14, null);
        return new AccountLoginFeatureOriginConfig((iAccountLoginExperimentDefaultsService == null || (boolDefaultAccountLoginFeatureConfigEnabled = iAccountLoginExperimentDefaultsService.defaultAccountLoginFeatureConfigEnabled()) == null) ? false : boolDefaultAccountLoginFeatureConfigEnabled.booleanValue(), 0, null, null, 14, null);
    }
}
