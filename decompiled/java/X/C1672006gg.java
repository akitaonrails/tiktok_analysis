package X;

import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06gg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1672006gg extends C09AY implements Function0<PrivacySettingsFeature> {
    public C1672006gg() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final PrivacySettingsFeature invoke() {
        PrivacySettingsFeature privacySettingsFeatureLIZ = PrivacySettingsFeature.LIZ.LIZ();
        if (privacySettingsFeatureLIZ != null) {
            return privacySettingsFeatureLIZ;
        }
        "PrivacySettingsFeature is unavailable".toString();
        throw new IllegalArgumentException("PrivacySettingsFeature is unavailable");
    }
}
