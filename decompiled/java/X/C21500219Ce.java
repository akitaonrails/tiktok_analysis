package X;

import com.ss.android.ugc.aweme.compliance.api.services.privacy.IComplianceFeatureService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19Ce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21500219Ce extends C09AY implements Function0<IComplianceFeatureService> {
    public C21500219Ce() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.compliance.api.services.privacy.IComplianceFeatureService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IComplianceFeatureService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IComplianceFeatureService.class, false, false, false, 14, null);
    }
}
