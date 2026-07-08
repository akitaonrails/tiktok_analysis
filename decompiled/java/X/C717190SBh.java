package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.subscription.subonlyvideos.experiments.SubOnlyVideoPaywallCacheConfigSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717190SBh extends C09AY implements Function0<SubOnlyVideoPaywallCacheConfigSetting.PaywallCacheSetting> {
    public C717190SBh() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.subscription.subonlyvideos.experiments.SubOnlyVideoPaywallCacheConfigSetting$PaywallCacheSetting, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final SubOnlyVideoPaywallCacheConfigSetting.PaywallCacheSetting invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SubOnlyVideoPaywallCacheConfigSetting.PaywallCacheSetting paywallCacheSetting = SubOnlyVideoPaywallCacheConfigSetting.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("vhs_paywall_cache_setting", SubOnlyVideoPaywallCacheConfigSetting.PaywallCacheSetting.class, paywallCacheSetting);
        return LJIIIIZZ != 0 ? LJIIIIZZ : paywallCacheSetting;
    }
}
