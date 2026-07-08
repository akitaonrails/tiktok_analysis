package X;

import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZJg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897620ZJg extends C09AY implements Function0<C897570ZJb> {
    public C897620ZJg() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C897570ZJb invoke() {
        return new C897570ZJb((PrivacySettingsFeature) C0ZJX.LIZJ.getValue(), C0ZJX.LIZ, (ActivityStatusService) C0ZJX.LIZIZ.getValue());
    }
}
