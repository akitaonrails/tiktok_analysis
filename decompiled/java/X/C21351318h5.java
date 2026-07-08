package X;

import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18h5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21351318h5 extends C09AY implements Function0<PrivacySettingsFeature> {
    public C21351318h5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final PrivacySettingsFeature invoke() {
        return C1336205Ku.LIZ(false).getImPrivacySettings();
    }
}
