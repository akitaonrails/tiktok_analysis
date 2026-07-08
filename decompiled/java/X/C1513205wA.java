package X;

import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05wA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1513205wA extends C09AY implements Function0<PrivacySettingsFeature> {
    public C1513205wA() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final PrivacySettingsFeature invoke() {
        return C1336205Ku.LIZ(false).getImPrivacySettings();
    }
}
